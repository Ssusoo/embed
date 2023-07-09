package ms.ssu.embed;

import ms.ssu.servlet.Servlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

/**
 * localhost:8080/servlet
 */
public class EmbedTomcatServletMain {
	public static void main(String[] args) throws LifecycleException {
		System.out.println("EmbedTomcatServletMain.main");

		// 톰캣 설정
		Tomcat tomcat = new Tomcat();
		Connector connector = new Connector();
		connector.setPort(8080);
		tomcat.setConnector(connector);

		// 서블릿 등록
		Context context = tomcat.addContext("", "/");
		tomcat.addServlet("", "servlet", new Servlet());
		context.addServletMappingDecoded("/servlet", "servlet");
		tomcat.start();
	}
}
