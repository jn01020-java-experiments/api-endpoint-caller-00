/**
 * 
 */
package ph.jn.restapi.app;

import ph.jn.restapi.app.data.io.SampleApiResult;
import ph.jn.restapi.msgchannel.ApiRequestFactory;
import ph.jn.restapi.msgchannel.IGetEndpoint;
import ph.jn.restapi.msgchannel.IGetWithFilterEndpoint;
import ph.jn.restapi.msgchannel.IPostDataEndpoint;
import ph.jn.restapi.msgchannel.IPostEndpoint;

/**
 * A sample endpoint group
 * 
 * @author JN
 *
 */
public class SampleEndpointGroup {
	public final IPostEndpoint<SampleApiResult> POST_0;
	public final IPostDataEndpoint<Object, SampleApiResult> POST_1;
	public final IGetEndpoint<SampleApiResult> GET_0;
	public final IGetWithFilterEndpoint<Object, SampleApiResult> GET_1;

	public SampleEndpointGroup(ApiRequestFactory apiFactory) {
		// SAMPLE INITIALIZATION

		this.POST_0 = apiFactory.definePostEndpoint(ApiUrl.SAMPLE_API_URL, SampleApiResult.class);

		// Object as placeholder for actual input POJO type
		this.POST_1 = apiFactory.definePostEndpoint(ApiUrl.SAMPLE_API_URL, Object.class, SampleApiResult.class);

		this.GET_0 = apiFactory.defineGetEndpoint(ApiUrl.SAMPLE_API_URL, SampleApiResult.class);

		// Object as placeholder for actual input POJO type
		this.GET_1 = apiFactory.defineGetEndpoint(ApiUrl.SAMPLE_API_URL, Object.class, SampleApiResult.class);
	}
}
