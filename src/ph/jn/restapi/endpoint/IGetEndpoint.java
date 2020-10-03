package ph.jn.restapi.endpoint;

import ph.jn.restapi.endpoint.io.IApiRequestResult;

public interface IGetEndpoint<O extends IApiRequestResult> {

	/**
	 * send GET request
	 * 
	 * @return POJO representation of response
	 */
	O get();

}