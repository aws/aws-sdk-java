package com.math.pro.ak.util.cognito.handlers;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.VerifyMfaContinuation;

/**
 * Callback handler to register an MFA.
 */
public interface RegisterMfaHandler {

    /**
     * This method is invoked on successfully registering an MFA.
     * <p>
     *     If a session token was use to resister (associate) an MFA, then a token is returned in
     *     {@code sessionToken}. This can be used with {@link com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.RegisterMfaContinuation}
     *     to continue user authentication.
     *     {@code sessionToken} is {@vcode null} when a session token is not used to register the MFA.
     * </p>
     * @param sessionToken - Session Token to continue user authentication.
     */
    public void onSuccess(String sessionToken);

    /**
     * This method is invoked when verification is required to complete registering a new MFA.
     * @param continuation allows to continue with MFA verification.
     */
    public void onVerify(VerifyMfaContinuation continuation);

    /**
     * This method invoked when the MFA registration has failed.
     * @param exception contains details about the failure.
     */
    public void onFailure(Exception exception);
}
