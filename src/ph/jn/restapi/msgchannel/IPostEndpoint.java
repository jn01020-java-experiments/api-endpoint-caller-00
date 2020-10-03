package ph.jn.restapi.msgchannel;

import ph.jn.restapi.msgchannel.io.IApiRequestResult;

public interface IPostEndpoint<O extends IApiRequestResult> {

	/**
	 * send POST request
	 * @return POJO representation of response
	 */
	O post();

}