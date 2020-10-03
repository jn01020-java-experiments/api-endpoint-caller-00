package ph.jn.restapi.endpoint;

import ph.jn.restapi.endpoint.io.IApiRequestResult;

public interface IGetWithFilterEndpoint<I, O extends IApiRequestResult> {

	/**
	 * send GET request
	 * 
	 * @param input - request filters
	 * @return POJO representation of response
	 */
	O get(I input);

}