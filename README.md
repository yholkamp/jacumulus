# Acumulus API client

A Java/JVM library for the SOAP API provided by [Acumulus Online boekhouden](https://www.siel.nl/), an accounting service. 


## Usage

[![Build Status](https://travis-ci.org/yholkamp/jacumulus.svg)](https://travis-ci.org/yholkamp/jacumulus)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.nextpulse/jacumulus/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.nextpulse/jacumulus/)
[![Javadocs](http://www.javadoc.io/badge/net.nextpulse/jacumulus.svg)](http://www.javadoc.io/doc/net.nextpulse/jacumulus) 

Add the library to your Java 8+/Scala/Kotlin/Groovy application:
     
For Maven users:

     <dependency>
         <groupId>net.nextpulse</groupId>
         <artifactId>jacumulus</artifactId>
         <version>(version)</version>
     </dependency>

And start to use the client:

    // Create a new 'contact' or authentication object
    Contract contract = new Contract("896352", "factuursync", "dP0f4AdkvN");
    
    // optionally set your email address to receive errors and warnings in your inbox
    contract.setEmailOnError("your@email.com");
    contract.setEmailOnWarning("your@email.com");

    // create a new API client
    AcumulusClient acumulusClient = new AcumulusClient(contact);
    
    // by default the client sets 'testMode' to true, so no API calls will change your data, when you're done testing, set this to false
    // NOTE: at this time not all API calls support the testmode setting, it's recommend to create a trial account for testing.
    acumulusClient.setTestMode(false);


## Supported APIs

Currently the following API calls have been implemented:

* [Contact: List incoming invoices](https://apidoc.sielsystems.nl/content/contact-list-incoming-invoices)
* [Contact: List outgoing invoices](https://apidoc.sielsystems.nl/content/contact-list-outgoing-invoices)
* [Contacts: List](https://apidoc.sielsystems.nl/content/contacts-list-contacts)
* [Invoice: Add](https://apidoc.sielsystems.nl/content/invoice-add)
* [Expense: Add](https://apidoc.sielsystems.nl/content/expense-add-expense)
