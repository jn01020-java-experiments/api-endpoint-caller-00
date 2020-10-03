package ph.jn.restapi.endpoint;

import ph.jn.restapi.endpoint.io.IApiRequestResult;

/**
 * Base class for api endpoints
 * 
 * @author JN
 *
 * @param <O> - output type
 */
public class ApiEndpointBase<O extends IApiRequestResult> {
	private final String URL;
	private final Class<O> outputType;
	private Object jsonSerializer;

	public ApiEndpointBase(Object jsonSerializer, String URL, Class<O> outputType) {
		this.URL = URL;
		this.outputType = outputType;
		this.jsonSerializer = jsonSerializer;
	}

	protected Object getSerializer() {
		return this.jsonSerializer;
	}

	protected String getURL() {
		return this.URL;
	}

	protected Class<O> getType() {
		return this.outputType;
	}
}