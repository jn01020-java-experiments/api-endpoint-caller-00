package ph.jn.restapi.msgchannel;

import ph.jn.restapi.msgchannel.io.IApiRequestResult;

public interface IGetWithFilterEndpoint<I, O extends IApiRequestResult> {

	/**
	 * send GET request
	 * 
	 * @param input - request filters
	 * @return POJO representation of response
	 */
	O get(I input);

}