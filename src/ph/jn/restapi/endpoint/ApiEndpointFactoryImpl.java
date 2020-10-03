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
		return new PostEndpoint<>(this.jsonSerializer, URL, outputType)::post;
	}

	@Override
	public <I, O extends IApiRequestResult> IPostDataEndpoint<I, O> definePostEndpoint(String URL, Class<I> inputType,
			Class<O> outputType) {
		return new PostDataEndpoint<>(this.jsonSerializer, URL, inputType, outputType)::post;
	}

	@Override
	public <O extends IApiRequestResult> IGetEndpoint<O> defineGetEndpoint(String URL, Class<O> outputType) {
		return new GetEndpoint<>(this.jsonSerializer, URL, outputType)::get;
	}

	@Override
	public <I, O extends IApiRequestResult> IGetWithFilterEndpoint<I, O> defineGetEndpoint(String URL,
			Class<I> inputType, Class<O> outputType) {
		return new GetWithFilterEndpoint<>(this.jsonSerializer, URL, inputType, outputType)::get;
	}

	private class PostEndpoint<O extends IApiRequestResult> extends ApiEndpointBase<O> implements IPostEndpoint<O> {
		PostEndpoint(Object jsonSerializer, String URL, Class<O> outputType) {
			super(jsonSerializer, URL, outputType);
		}

		@Override
		public O post() {
			// TODO
			return null;
		}
	}

	private class PostDataEndpoint<I, O extends IApiRequestResult> extends ApiEndpointBase<O>
			implements IPostDataEndpoint<I, O> {
		public PostDataEndpoint(Object jsonSerializer, String URL, Class<I> inputType, Class<O> outputType) {
			super(jsonSerializer, URL, outputType);
		}

		@Override
		public O post(I input) {
			// TODO
			return null;
		}
	}

	private class GetEndpoint<O extends IApiRequestResult> extends ApiEndpointBase<O> implements IGetEndpoint<O> {
		GetEndpoint(Object jsonSerializer, String URL, Class<O> outputType) {
			super(jsonSerializer, URL, outputType);
		}

		@Override
		public O get() {
			// TODO
			return null;
		}
	}

	private class GetWithFilterEndpoint<I, O extends IApiRequestResult> extends ApiEndpointBase<O>
			implements IGetWithFilterEndpoint<I, O> {
		public GetWithFilterEndpoint(Object jsonSerializer, String URL, Class<I> inputType, Class<O> outputType) {
			super(jsonSerializer, URL, outputType);
		}

		@Override
		public O get(I input) {
			// TODO
			return null;
		}
	}
}
