package ph.jn.restapi.msgchannel;

import ph.jn.restapi.msgchannel.io.IApiRequestResult;

public class BasicApiRequest<O extends IApiRequestResult> {
	private final String URL;
	private final Class<O> outputType;
	private Object jsonSerializer;

	public BasicApiRequest(Object jsonSerializer, String URL, Class<O> outputType) {
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