/**
 * 
 */
package ph.jn.restapi.endpoint.io;

/**
 * @author JN
 *
 */
public class ApiRequestResultImpl implements IApiRequestResult {

	private final boolean ok;

	public ApiRequestResultImpl() {
		this.ok = true;
	}

	public ApiRequestResultImpl(boolean ok) {
		this.ok = ok;
	}

	@Override
	public boolean isOk() {
		return this.ok;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
