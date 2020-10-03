package ph.jn.restapi.msgchannel;

import ph.jn.restapi.msgchannel.io.IApiRequestResult;

public interface ApiRequestFactory {
	/**
	 * Define a POST endpoint
	 * 
	 * @param <O>        - output type
	 * @param URL        - endpoint url
	 * @param outputType - class object of the output type
	 * @return
	 */
	<O extends IApiRequestResult> IPostEndpoint<O> definePostEndpoint(String URL, Class<O> outputType);

	/**
	 * Define a POST endpoint
	 * 
	 * @param <I>        - input type
	 * @param <O>        - output type
	 * @param URL        - endpoint url
	 * @param inputType  - class object of the input type
	 * @param outputType - class object of the output type
	 * @return
	 */
	<I, O extends IApiRequestResult> IPostDataEndpoint<I, O> definePostEndpoint(String URL, Class<I> inputType,
			Class<O> outputType);

	/**
	 * Define a GET endpoint
	 * 
	 * @param <O>        - output type
	 * @param URL        - endpoint url
	 * @param outputType - class object of the output type
	 * @return
	 */
	<O extends IApiRequestResult> IGetEndpoint<O> defineGetEndpoint(String URL, Class<O> outputType);

	/**
	 * define a GET endpoint
	 * 
	 * @param <I>        - input type
	 * @param <O>        - output type
	 * @param URL        - endpoint url
	 * @param inputType  - class object of the input type
	 * @param outputType - class object of the output type
	 * @return
	 */
	<I, O extends IApiRequestResult> IGetWithFilterEndpoint<I, O> defineGetEndpoint(String URL, Class<I> inputType,
			Class<O> outputType);
}