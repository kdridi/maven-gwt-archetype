package ${package}.client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class Application implements EntryPoint {
	private static final ApplicationServiceAsync APPLICATION_SERVICE = GWT.create(ApplicationService.class);

	@Override
	public void onModuleLoad() {
		APPLICATION_SERVICE.echo("Hello, world!", new AsyncCallback<String>() {
			public void onSuccess(String result) {
				show(result);
			}
			private void show(String msg) {
				Window.alert(msg);
			}
			public void onFailure(Throwable caught) {
				final StringBuffer stringBuffer = new StringBuffer();
				caught.printStackTrace(new PrintStream(new OutputStream() {
					public void write(int b) throws IOException {
						stringBuffer.append(b);
					}
				}));
				show(stringBuffer.toString());
			}
		});
	}
	
}
