package net.nextpulse.jacumulus.util;

import net.nextpulse.jacumulus.requests.AcumulusRequest;
import net.nextpulse.jacumulus.responses.AcumulusResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Helper for serialization and deserialization of XML requests and responses.
 */
public class SerializationHelper {
  
  private static final Logger logger = LogManager.getLogger();
  
  /**
   * Pretty print / format the provided XML string.
   *
   * @param requestBody string to pretty print as XML
   */
  public static String formatXml(String requestBody) {
    try {
      DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(new InputSource(new StringReader(requestBody)));
      return pretty(document);
    } catch(ParserConfigurationException | TransformerException | SAXException | IOException e) {
      logger.error("Could not format the XML due to {}", e.getMessage(), e);
      return null;
    }
  }
  
  /**
   * Pretty-prints a document to system out.
   *
   * @param document document to pretty print
   * @throws TransformerException if the document could not be transformed to a pretty version
   */
  private static String pretty(Document document) throws TransformerException {
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();
    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(2));
    StringWriter output = new StringWriter();
    Result result = new StreamResult(output);
    Source source = new DOMSource(document);
    transformer.transform(source, result);
    return output.toString();
  }
  
  /**
   * Serialize a request as XML.
   *
   * @param object object to marshal
   * @return object serialized as XML
   * @throws JAXBException if the object could not be marshalled in to XML
   */
  public static String serializeToXml(Object object) throws JAXBException {
    StringWriter writer = new StringWriter();
    JAXBContext context = JAXBContext.newInstance(AcumulusRequest.class, AcumulusResponse.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.marshal(object, writer);
    return writer.toString();
  }
  
  /**
   * Deserialize a XML response.
   *
   * @param requestString XML string
   * @param clazz         class to use as deserialization target
   * @param <T>           type of the class
   * @return object of type T
   * @throws JAXBException if the deserialization failed
   */
  public static <T> T deserializeXml(String requestString, Class<T> clazz) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(clazz);
    Unmarshaller m = context.createUnmarshaller();
    Object response = m.unmarshal(new StringReader(requestString));
    return (T) response;
  }
  
  
}
