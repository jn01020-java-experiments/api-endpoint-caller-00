package ph.jn.restapi.msgchannel;

import ph.jn.restapi.msgchannel.io.IApiRequestResult;

public interface IPostDataEndpoint<I, O extends IApiRequestResult> {

	/**
	 * send POST request
	 * 
	 * @param input - input data
	 * @return POJO representation of response
	 */
	O post(I input);

}