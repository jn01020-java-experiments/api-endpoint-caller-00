/**
 * 
 */
package ph.jn.restapi.app;

import ph.jn.restapi.app.data.io.SampleApiResult;
import ph.jn.restapi.endpoint.ApiEndpointFactory;
import ph.jn.restapi.endpoint.IGetEndpoint;
import ph.jn.restapi.endpoint.IGetWithFilterEndpoint;
import ph.jn.restapi.endpoint.IPostDataEndpoint;
import ph.jn.restapi.endpoint.IPostEndpoint;

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

	public SampleEndpointGroup(ApiEndpointFactory apiFactory) {
		// SAMPLE INITIALIZATION

		this.POST_0 = apiFactory.definePostEndpoint(ApiUrl.SAMPLE_API_URL, SampleApiResult.class);

		// Object as placeholder for actual input POJO type
		this.POST_1 = apiFactory.definePostEndpoint(ApiUrl.SAMPLE_API_URL, Object.class, SampleApiResult.class);

		this.GET_0 = apiFactory.defineGetEndpoint(ApiUrl.SAMPLE_API_URL, SampleApiResult.class);

		// Object as placeholder for actual input POJO type
		this.GET_1 = apiFactory.defineGetEndpoint(ApiUrl.SAMPLE_API_URL, Object.class, SampleApiResult.class);
	}
}
