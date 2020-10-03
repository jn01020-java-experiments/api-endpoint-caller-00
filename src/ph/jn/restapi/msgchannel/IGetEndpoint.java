package ph.jn.restapi.msgchannel;

import ph.jn.restapi.msgchannel.io.IApiRequestResult;

public interface IGetEndpoint<O extends IApiRequestResult> {

	/**
	 * send GET request
	 * 
	 * @return POJO representation of response
	 */
	O get();

}