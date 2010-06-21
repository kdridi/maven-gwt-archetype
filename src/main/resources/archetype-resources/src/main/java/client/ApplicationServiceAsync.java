package ${package}.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ApplicationServiceAsync {
	public abstract void echo(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
}
