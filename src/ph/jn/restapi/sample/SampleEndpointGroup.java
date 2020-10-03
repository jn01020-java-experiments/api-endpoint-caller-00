/**
 * 
 */
package ph.jn.restapi.sample;

import ph.jn.restapi.endpoint.ApiEndpointFactory;
import ph.jn.restapi.endpoint.IGetEndpoint;
import ph.jn.restapi.endpoint.IGetWithFilterEndpoint;
import ph.jn.restapi.endpoint.IPostDataEndpoint;
import ph.jn.restapi.endpoint.IPostEndpoint;
import ph.jn.restapi.sample.data.io.SampleApiResult;

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

		this.POST_0 = apiFactory.definePostEndpoint(SampleApiUrl.SAMPLE_API_URL, SampleApiResult.class);

		// Object as placeholder for actual input POJO type
		this.POST_1 = apiFactory.definePostEndpoint(SampleApiUrl.SAMPLE_API_URL, Object.class, SampleApiResult.class);

		this.GET_0 = apiFactory.defineGetEndpoint(SampleApiUrl.SAMPLE_API_URL, SampleApiResult.class);

		// Object as placeholder for actual input POJO type
		this.GET_1 = apiFactory.defineGetEndpoint(SampleApiUrl.SAMPLE_API_URL, Object.class, SampleApiResult.class);
	}
}
