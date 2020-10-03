/**
 * 
 */
package ph.jn.restapi.endpoint.io;

/**
 * @author JN
 *
 */
public interface IApiRequestResult {
	/**
	 * @return whether the request was successfully performed
	 */
	boolean isOk();

	/**
	 * @return the error message if {@link IApiRequestResult#isOk()} is
	 *         {@code false}
	 */
	String getMessage();
}
