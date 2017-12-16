package lv.javaguru.springboot.customermanager4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerManager4Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManager4Application.class, args);
	}
}

//18:40:31.264 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Included patterns for restart : []
//		18:40:31.266 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Excluded patterns for restart : [/spring-boot-starter/target/classes/, /spring-boot-autoconfigure/target/classes/, /spring-boot-starter-[\w-]+/, /spring-boot/target/classes/, /spring-boot-actuator/target/classes/, /spring-boot-devtools/target/classes/]
//		18:40:31.267 [main] DEBUG org.springframework.boot.devtools.restart.ChangeableUrls - Matching URLs for reloading : [file:/C:/Users/Oleg/IdeaProjects/CustomerManager4/target/classes/]
//
//		.   ____          _            __ _ _
//		/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
//		( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
//		\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
//		'  |____| .__|_| |_|_| |_\__, | / / / /
//		=========|_|==============|___/=/_/_/_/
//		:: Spring Boot ::        (v1.5.9.RELEASE)
//
//		2017-12-15 18:40:31.687  INFO 5704 --- [  restartedMain] l.j.s.c.CustomerManager4Application      : Starting CustomerManager4Application on LinuxSRV with PID 5704 (C:\Users\Oleg\IdeaProjects\CustomerManager4\target\classes started by Oleg in C:\Users\Oleg\IdeaProjects\CustomerManager4)
//		2017-12-15 18:40:31.688  INFO 5704 --- [  restartedMain] l.j.s.c.CustomerManager4Application      : No active profile set, falling back to default profiles: default
//2017-12-15 18:40:31.769  INFO 5704 --- [  restartedMain] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@72e3f88f: startup date [Fri Dec 15 18:40:31 EET 2017]; root of context hierarchy
//		2017-12-15 18:40:34.123  INFO 5704 --- [  restartedMain] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//		2017-12-15 18:40:34.140  INFO 5704 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//		2017-12-15 18:40:34.142  INFO 5704 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.23
//		2017-12-15 18:40:34.265  INFO 5704 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
//		2017-12-15 18:40:34.265  INFO 5704 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2501 ms
//		2017-12-15 18:40:34.439  INFO 5704 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
//		2017-12-15 18:40:34.444  INFO 5704 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
//2017-12-15 18:40:34.445  INFO 5704 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
//2017-12-15 18:40:34.445  INFO 5704 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
//2017-12-15 18:40:34.445  INFO 5704 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
//Fri Dec 15 18:40:34 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 15 18:40:34 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 15 18:40:34 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 15 18:40:34 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 15 18:40:34 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 15 18:40:34 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 15 18:40:34 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 15 18:40:35 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 15 18:40:35 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 15 18:40:35 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//2017-12-15 18:40:35.083  INFO 5704 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'
//2017-12-15 18:40:35.099  INFO 5704 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
//	name: default
//	...]
//2017-12-15 18:40:35.188  INFO 5704 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate Core {5.0.12.Final}
//2017-12-15 18:40:35.190  INFO 5704 --- [  restartedMain] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
//2017-12-15 18:40:35.191  INFO 5704 --- [  restartedMain] org.hibernate.cfg.Environment            : HHH000021: Bytecode provider name : javassist
//2017-12-15 18:40:35.243  INFO 5704 --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.1.Final}
//2017-12-15 18:40:35.382  INFO 5704 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQLDialect
//2017-12-15 18:40:36.076  INFO 5704 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
//2017-12-15 18:40:36.787  INFO 5704 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@72e3f88f: startup date [Fri Dec 15 18:40:31 EET 2017]; root of context hierarchy
//2017-12-15 18:40:36.879  INFO 5704 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/api/customers],methods=[POST]}" onto public lv.javaguru.springboot.customermanager4.model.Customer lv.javaguru.springboot.customermanager4.controller.CustomerController.createCustomer(lv.javaguru.springboot.customermanager4.model.Customer)
//2017-12-15 18:40:36.880  INFO 5704 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/api/customers/{id}],methods=[PUT]}" onto public org.springframework.http.ResponseEntity<lv.javaguru.springboot.customermanager4.model.Customer> lv.javaguru.springboot.customermanager4.controller.CustomerController.updateCustomer(java.lang.Integer,lv.javaguru.springboot.customermanager4.model.Customer)
//2017-12-15 18:40:36.881  INFO 5704 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/api/customers/{id}],methods=[DELETE]}" onto public org.springframework.http.ResponseEntity<lv.javaguru.springboot.customermanager4.model.Customer> lv.javaguru.springboot.customermanager4.controller.CustomerController.deleteCustomer(java.lang.Integer)
//2017-12-15 18:40:36.881  INFO 5704 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/api/customers/{id}],methods=[GET]}" onto public org.springframework.http.ResponseEntity<lv.javaguru.springboot.customermanager4.model.Customer> lv.javaguru.springboot.customermanager4.controller.CustomerController.getCustomerById(java.lang.Integer)
//2017-12-15 18:40:36.881  INFO 5704 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/api/customers],methods=[GET]}" onto public java.util.List<lv.javaguru.springboot.customermanager4.model.Customer> lv.javaguru.springboot.customermanager4.controller.CustomerController.getAllNotes()
//2017-12-15 18:40:36.883  INFO 5704 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
//2017-12-15 18:40:36.884  INFO 5704 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
//2017-12-15 18:40:36.925  INFO 5704 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
//2017-12-15 18:40:36.925  INFO 5704 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
//2017-12-15 18:40:36.974  INFO 5704 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
//		2017-12-15 18:40:37.270  INFO 5704 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
//		2017-12-15 18:40:37.340  INFO 5704 --- [  restartedMain] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
//		2017-12-15 18:40:37.414  INFO 5704 --- [  restartedMain] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
//		2017-12-15 18:40:37.420  INFO 5704 --- [  restartedMain] l.j.s.c.CustomerManager4Application      : Started CustomerManager4Application in 6.125 seconds (JVM running for 7.405)
//		2017-12-15 18:40:57.679  INFO 5704 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
//		2017-12-15 18:40:57.679  INFO 5704 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
//		2017-12-15 18:40:57.710  INFO 5704 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 31 ms
//		2017-12-15 18:40:57.837  INFO 5704 --- [nio-8080-exec-1] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
//
//		Process finished with exit code 1
//
