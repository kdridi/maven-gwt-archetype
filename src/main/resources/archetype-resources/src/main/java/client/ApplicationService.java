package ${package}.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("application")
public interface ApplicationService extends RemoteService {
	public abstract String echo(String name) throws IllegalArgumentException;
}
