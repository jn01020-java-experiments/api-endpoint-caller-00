package ph.jn.restapi.endpoint;

import ph.jn.restapi.endpoint.io.IApiRequestResult;

public class BasicApiEndpoint<O extends IApiRequestResult> {
	private final String URL;
	private final Class<O> outputType;
	private Object jsonSerializer;

	public BasicApiEndpoint(Object jsonSerializer, String URL, Class<O> outputType) {
		this.URL = URL;
		this.outputType = outputType;
		this.jsonSerializer = jsonSerializer;
	}

	Object getSerializer() {
		return this.jsonSerializer;
	}

	String getURL() {
		return this.URL;
	}

	Class<O> getType() {
		return this.outputType;
	}
}