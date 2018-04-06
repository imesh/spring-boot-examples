# Spring Boot Hello World

This is a hello world example of Spring Boot.

## Quick Start Guide

- Clone this repository and switch to the hello-world example:

```bash
git clone https://github.com/imesh/spring-boot-exmaples
cd spring-boot-examples/hello-world
```

- Build the project using Maven:

```bash
mvn clean install
```

- Start the hello world service:
```bash
java -jar target/hello-world-*.jar
```

```bash
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.1.RELEASE)

2018-04-06 09:40:35.863  INFO 2135 --- [           main] io.imesh.hello.Application               : Starting Application v0.1.0 on wso2.local with PID 2135 (/Users/imesh/dev/spring/spring-boot-examples/hello-world/target/hello-world-0.1.0.jar started by imesh in /Users/imesh/dev/spring/spring-boot-examples/hello-world)
2018-04-06 09:40:35.867  INFO 2135 --- [           main] io.imesh.hello.Application               : No active profile set, falling back to default profiles: default
2018-04-06 09:40:35.916  INFO 2135 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6d86b085: startup date [Fri Apr 06 09:40:35 IST 2018]; root of context hierarchy
2018-04-06 09:40:36.976  INFO 2135 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-04-06 09:40:37.001  INFO 2135 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-04-06 09:40:37.001  INFO 2135 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.29
2018-04-06 09:40:37.012  INFO 2135 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/Users/imesh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.]
2018-04-06 09:40:37.080  INFO 2135 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-04-06 09:40:37.080  INFO 2135 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1166 ms
2018-04-06 09:40:37.189  INFO 2135 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-04-06 09:40:37.192  INFO 2135 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-04-06 09:40:37.192  INFO 2135 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-04-06 09:40:37.192  INFO 2135 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-04-06 09:40:37.192  INFO 2135 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-04-06 09:40:37.294  INFO 2135 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-04-06 09:40:37.499  INFO 2135 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6d86b085: startup date [Fri Apr 06 09:40:35 IST 2018]; root of context hierarchy
2018-04-06 09:40:37.586  INFO 2135 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/]}" onto public java.lang.String io.imesh.hello.HelloController.index()
2018-04-06 09:40:37.591  INFO 2135 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-04-06 09:40:37.591  INFO 2135 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-04-06 09:40:37.620  INFO 2135 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-04-06 09:40:37.621  INFO 2135 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-04-06 09:40:37.768  INFO 2135 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-04-06 09:40:37.818  INFO 2135 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-04-06 09:40:37.822  INFO 2135 --- [           main] io.imesh.hello.Application               : Started Application in 2.308 seconds (JVM running for 2.771)
```

- Send a HTTP request using CURL:

```bash
curl -v http://localhost:8080/
```

```bash
...
> GET / HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.54.0
> Accept: */*
>
< HTTP/1.1 200
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 12
< Date: Fri, 06 Apr 2018 04:11:31 GMT
...
Hello world!
```

## References

- Building an Application with Spring Boot:
https://spring.io/guides/gs/spring-boot/