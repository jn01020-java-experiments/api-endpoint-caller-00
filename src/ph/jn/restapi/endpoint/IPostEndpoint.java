package ph.jn.restapi.endpoint;

import ph.jn.restapi.endpoint.io.IApiRequestResult;

public interface IPostEndpoint<O extends IApiRequestResult> {

	/**
	 * send POST request
	 * @return POJO representation of response
	 */
	O post();

}