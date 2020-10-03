package ph.jn.restapi.endpoint;

import ph.jn.restapi.endpoint.io.IApiRequestResult;

public interface IPostDataEndpoint<I, O extends IApiRequestResult> {

	/**
	 * send POST request
	 * 
	 * @param input - input data
	 * @return POJO representation of response
	 */
	O post(I input);

}