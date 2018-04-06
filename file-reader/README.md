# Spring Boot File Reader

This is an example of Spring Boot application which reads a file from the filesystem and stream it through `GET /download` resource.

## Quick Start Guide

- Clone this repository and switch to the file-reader example:

```bash
git clone https://github.com/imesh/spring-boot-exmaples
cd spring-boot-examples/file-reader
```

- Build the project using Maven:

```bash
mvn clean install
```

- Set the file path and content type using the following environment variables:

```bash
export FILE_PATH=$(pwd)/data/shiporder.xml
export CONTENT_TYPE=application/xml
```

- Start the file reader service:
```bash
java -jar target/file-reader-*.jar
```

```bash

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.1.RELEASE)

2018-04-06 10:56:01.057  INFO 5038 --- [           main] io.imesh.hello.Application               : Starting Application v0.1.0 on wso2.local with PID 5038 (/Users/imesh/dev/spring/spring-boot-examples/file-reader/target/file-reader-0.1.0.jar started by imesh in /Users/imesh/dev/spring/spring-boot-examples/file-reader)
2018-04-06 10:56:01.061  INFO 5038 --- [           main] io.imesh.hello.Application               : No active profile set, falling back to default profiles: default
2018-04-06 10:56:01.116  INFO 5038 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@532760d8: startup date [Fri Apr 06 10:56:01 IST 2018]; root of context hierarchy
2018-04-06 10:56:02.180  INFO 5038 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-04-06 10:56:02.204  INFO 5038 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-04-06 10:56:02.204  INFO 5038 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.29
2018-04-06 10:56:02.214  INFO 5038 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/Users/imesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.]
2018-04-06 10:56:02.278  INFO 5038 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-04-06 10:56:02.279  INFO 5038 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1166 ms
2018-04-06 10:56:02.386  INFO 5038 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-04-06 10:56:02.389  INFO 5038 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-04-06 10:56:02.389  INFO 5038 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-04-06 10:56:02.389  INFO 5038 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-04-06 10:56:02.390  INFO 5038 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-04-06 10:56:02.423  INFO 5038 --- [           main] io.imesh.hello.FileDownloadController    : FILE_PATH: /Users/imesh/dev/spring/spring-boot-examples/file-reader/data.xml
2018-04-06 10:56:02.423  INFO 5038 --- [           main] io.imesh.hello.FileDownloadController    : CONTENT_TYPE: application/xml
2018-04-06 10:56:02.491  INFO 5038 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-04-06 10:56:02.693  INFO 5038 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@532760d8: startup date [Fri Apr 06 10:56:01 IST 2018]; root of context hierarchy
2018-04-06 10:56:02.777  INFO 5038 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/download],methods=[GET]}" onto public void io.imesh.hello.FileDownloadController.getDownload(javax.servlet.http.HttpServletResponse)
2018-04-06 10:56:02.783  INFO 5038 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-04-06 10:56:02.784  INFO 5038 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-04-06 10:56:02.811  INFO 5038 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-04-06 10:56:02.812  INFO 5038 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-04-06 10:56:02.947  INFO 5038 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-04-06 10:56:02.996  INFO 5038 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-04-06 10:56:03.000  INFO 5038 --- [           main] io.imesh.hello.Application               : Started Application in 2.284 seconds (JVM running for 2.742)
```

- Send a HTTP request using CURL:

```bash
curl -v http://localhost:8080/download
```

```bash
...
> GET /download HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.54.0
> Accept: */*
>
< HTTP/1.1 200
< Content-Type: application/xml
< Transfer-Encoding: chunked
< Date: Fri, 06 Apr 2018 05:26:30 GMT
<
<?xml version="1.0" encoding="UTF-8"?>

<shiporder orderid="889923"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xmlns:shiporder="http://shiporder">
    <orderperson>John Smith</orderperson>
    <shipto>
        <name>Ola Nordmann</name>
        <address>Langgt 23</address>
        <city>4000 Stavanger</city>
        <country>Norway</country>
    </shipto>
    <item>
        <title>Empire Burlesque</title>
        <note>Special Edition</note>
        <quantity>1</quantity>
        <price>10.90</price>
    </item>
    <item>
        <title>Hide your heart</title>
        <quantity>1</quantity>
        <price>9.90</price>
    </item>
    ...
</shiporder>
```
