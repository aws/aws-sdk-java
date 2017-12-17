package com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations;

import android.content.Context;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeResult;
import com.amazonaws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Defines continuation for challenges to users to register an MFA.
 * <p>
 *     When one or more MFA's have been set as required at the User-Pool level and if none of these
 *     MFA are setup (registered) by a user, then during the authentication process a challenge to
 *     setup the required MFA's is presented.
 *     The user must setup at least one of the required MFA's to successfully authenticate.
 *     This continuation allows users to authenticate after the required MFA has been setup.
 * </p>
 */
public class RegisterMfaContinuation extends ChallengeContinuation {
    /**
     * MFA's available to a user to continue authentication.
     */
    private List<String> mfaOptions;

    /**
     * Constructs a new continuation for multiple user MFA's.
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param context               REQUIRED: The android context.
     * @param username              REQUIRED: The username.
     * @param clientId              REQUIRED: The clientId.
     * @param secretHash            REQUIRED: The secret hash.
     * @param challengeResult       REQUIRED: The response from the previous auth step.
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     * @param callback              REQUIRED: Callback to interact with the app.
     */
    public RegisterMfaContinuation(
            CognitoUser user,
            Context context,
            String username,
            String clientId,
            String secretHash,
            RespondToAuthChallengeResult challengeResult,
            boolean runInBackground,
            AuthenticationHandler callback) {
        super(user, context, username, clientId, secretHash, challengeResult, runInBackground,
                callback);
        mfaOptions = getListFromString(getParameters().get(CognitoServiceConstants.CHLG_PARAM_MFAS_CAN_SETUP));
    }

    /**
     * Returns MFA options for a user to register continue to authenticate.
     * @return options as a list.
     */
    public List<String>  getMfaOptions() {
        if (mfaOptions == null) {
            mfaOptions = getListFromString(getParameters().get(CognitoServiceConstants.CHLG_PARAM_MFAS_CAN_SETUP));
        }
        return mfaOptions;
    }

    /**
     * Adds the session token, returned on successful MFA registration, to allow user authentication
     * to continue.
     * @param sessionToken the session token.
     */
    public void setSessionToken(String sessionToken) {
        if (StringUtils.isBlank(sessionToken)) {
            throw new CognitoParameterInvalidException("session token cannot be null");
        }
        setResponseSessionCode(sessionToken);
    }

    /**
     * Continue the authentication process.
     */
    @Override
    public void continueTask() {
        super.continueTask();
    }

    /**
     * Converts a string of the form "["Lorem", "ipsum", "dolor"]" into a list of the form [Lorem, ipsum, dolor].
     * @param listString string containing list items.
     * @return items in the input string parameter as a {@link List}.
     */
    private List<String> getListFromString(String listString) {
        String mfas = listString.replace("[", "").replace("]", "").replace("\"", "");
        return Arrays.asList(mfas.split(","));
    }
}
