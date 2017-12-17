package com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations;

import android.content.Context;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.RegisterMfaHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import com.amazonaws.util.StringUtils;

import java.util.Map;

/**
 * Defines continuation for MFA registration.
 * <p>
 *     This is issued during an MFA setup (registration). MFA verification is necessary
 *     to complete new MFA setup process.
 * </p>
 */
public class VerifyMfaContinuation implements CognitoIdentityProviderContinuation<Map<String, String>> {
    /**
     * Run in background.
     */
    public static final boolean RUN_IN_BACKGROUND = true;
    /**
     * Run on current thread.
     */
    public static final boolean RUN_IN_CURRENT = false;

    private final Context context;
    private final String clientId;
    private final CognitoUser user;
    private final RegisterMfaHandler callback;
    private final Map<String, String> mfaSetupDetails;
    private final boolean useSessionToken;
    private final String sessionToken;
    private final boolean runInBackground;


    // Verification response
    private String verificationCode;
    private String friendlyName = CognitoServiceConstants.DEFAULT_TOTP_DEVICE_FRIENDLY_NAME;

    /**
     * Constructs a new continuation for MFA verification.
     * @param context               REQUIRED: The android context.
     * @param clientId              REQUIRED: The clientId.
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param callback              REQUIRED: Callback to interact with the app.
     * @param mfaSetupDetails       REQUIRED: Parameters to setup the new MFA.
     * @param useSessionToken       REQUIRED: Indicates if a Session Token was used to start the registration.
     * @param sessionToken          REQUIRED: Session Token.
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     */
    public VerifyMfaContinuation(
            Context context,
            String clientId,
            CognitoUser user,
            RegisterMfaHandler callback,
            Map<String, String> mfaSetupDetails,
            boolean useSessionToken,
            String sessionToken,
            boolean runInBackground) {
        this.context = context;
        this.clientId = clientId;
        this.user = user;
        this.callback = callback;
        this.mfaSetupDetails = mfaSetupDetails;
        this.useSessionToken = useSessionToken;
        this.sessionToken = sessionToken;
        this.runInBackground = runInBackground;
    }

    /**
     * Set the verification response.
     * @param mfaVerificationCode Required: The TOTP code.
     * @param mfaFriendlyName Optional: The friendly name for the new TOTP device.
     */
    public void setVerificationResponse(final String mfaVerificationCode, final String mfaFriendlyName) {
        if (StringUtils.isBlank(mfaVerificationCode)) {
            throw new CognitoParameterInvalidException("verification code is invalid");
        }
        this.verificationCode = mfaVerificationCode;
        if (!StringUtils.isBlank(mfaFriendlyName)) {
            this.friendlyName = mfaFriendlyName;
        }
    }

    /**
     * Returns parameters for MFA setup.
     * @return parameters.
     */
    @Override
    public Map<String, String> getParameters() {
        return mfaSetupDetails;
    }

    /**
     * Continue with the MFA setup.
     */
    @Override
    public void continueTask() {
        // Call verify user.
        if (runInBackground) {
            if (useSessionToken) {
                user.verifySoftwareTokenInBackground(sessionToken, verificationCode, friendlyName, callback);
            } else {
                user.verifySoftwareTokenInBackground(null, verificationCode, friendlyName, callback);
            }
        } else {
            user.verifySoftwareTokenInBackground(null, verificationCode, friendlyName, callback);
        }
    }
}
