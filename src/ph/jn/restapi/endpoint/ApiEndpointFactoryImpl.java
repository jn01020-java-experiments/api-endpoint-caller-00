/**
 * 
 */
package ph.jn.restapi.endpoint;

import ph.jn.restapi.endpoint.io.IApiRequestResult;

/**
 * @author JN
 *
 */
public class ApiEndpointFactoryImpl implements ApiEndpointFactory {
	private Object jsonSerializer;

	@Override
	public <O extends IApiRequestResult> IPostEndpoint<O> definePostEndpoint(String URL, Class<O> outputType) {
		return new PostRequest<>(this.jsonSerializer, URL, outputType)::post;
	}

	@Override
	public <I, O extends IApiRequestResult> IPostDataEndpoint<I, O> definePostEndpoint(String URL, Class<I> inputType,
			Class<O> outputType) {
		return new PostDataRequest<>(this.jsonSerializer, URL, inputType, outputType)::post;
	}

	@Override
	public <O extends IApiRequestResult> IGetEndpoint<O> defineGetEndpoint(String URL, Class<O> outputType) {
		return new GetRequest<>(this.jsonSerializer, URL, outputType)::get;
	}

	@Override
	public <I, O extends IApiRequestResult> IGetWithFilterEndpoint<I, O> defineGetEndpoint(String URL, Class<I> inputType,
			Class<O> outputType) {
		return new GetWithFilterRequest<>(this.jsonSerializer, URL, inputType, outputType)::get;
	}
}

class PostRequest<O extends IApiRequestResult> extends BasicApiEndpoint<O> implements IPostEndpoint<O> {
	PostRequest(Object jsonSerializer, String URL, Class<O> outputType) {
		super(jsonSerializer, URL, outputType);
	}

	@Override
	public O post() {
		// TODO
		return null;
	}
}

class PostDataRequest<I, O extends IApiRequestResult> extends BasicApiEndpoint<O> implements IPostDataEndpoint<I, O> {
	public PostDataRequest(Object jsonSerializer, String URL, Class<I> inputType, Class<O> outputType) {
		super(jsonSerializer, URL, outputType);
	}

	@Override
	public O post(I input) {
		// TODO
		return null;
	}
}

class GetRequest<O extends IApiRequestResult> extends BasicApiEndpoint<O> implements IGetEndpoint<O> {
	GetRequest(Object jsonSerializer, String URL, Class<O> outputType) {
		super(jsonSerializer, URL, outputType);
	}

	@Override
	public O get() {
		// TODO
		return null;
	}
}

class GetWithFilterRequest<I, O extends IApiRequestResult> extends BasicApiEndpoint<O> implements IGetWithFilterEndpoint<I, O> {
	public GetWithFilterRequest(Object jsonSerializer, String URL, Class<I> inputType, Class<O> outputType) {
		super(jsonSerializer, URL, outputType);
	}

	@Override
	public O get(I input) {
		// TODO
		return null;
	}
}
