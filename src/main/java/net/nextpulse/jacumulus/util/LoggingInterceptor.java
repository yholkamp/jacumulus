package net.nextpulse.jacumulus.util;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * Simple logging interceptor that prints the response times at debug level
 */
public class LoggingInterceptor implements Interceptor {
  private static final Logger logger = LogManager.getLogger();
  
  public Response intercept(Chain chain) throws IOException {
    if(chain == null) {
      throw new IllegalArgumentException("Received null chain parameter");
    }
    Request request = chain.request();
    
    long t1 = System.nanoTime();
    logger.debug("Sending {} request to {}", request.method(), request.url());
    
    Response response = chain.proceed(request);
    
    long t2 = System.nanoTime();
    logger.debug(String.format("Received response for %s in %.1fms%n", response.request().url(), (t2 - t1) / 1e6));
    return response;
  }
}