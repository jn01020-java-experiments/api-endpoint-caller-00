/**
 * 
 */
package ph.jn.restapi.app;

/**
 * @author JN
 *
 */
public class SampleAppUsage {
	private SampleEndpointGroup g0;

	public SampleAppUsage(SampleEndpointGroup g0) {
		this.g0 = g0;
	}

	public void execute() {
		g0.POST_0.post();
		g0.POST_1.post(null);
		g0.GET_0.get();
		g0.GET_1.get(null);
	}
}
