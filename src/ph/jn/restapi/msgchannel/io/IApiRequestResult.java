/**
 * 
 */
package ph.jn.restapi.msgchannel.io;

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
