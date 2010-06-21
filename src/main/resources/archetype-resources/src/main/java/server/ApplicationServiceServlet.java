package ${package}.server;

import ${package}.client.ApplicationService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ApplicationServiceServlet extends RemoteServiceServlet implements ApplicationService {
	private static final long serialVersionUID = -5330446260651321430L;

	@Override
	public String echo(String value) throws IllegalArgumentException {
		return String.format("MSG: %s", value);
	}
}
