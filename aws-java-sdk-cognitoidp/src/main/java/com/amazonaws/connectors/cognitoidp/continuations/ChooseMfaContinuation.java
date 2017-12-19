package com.amazonaws.connectors.cognitoidp.continuations;


import com.amazonaws.connectors.cognitoidp.CognitoUser;
import com.amazonaws.connectors.cognitoidp.exceptions.CognitoParameterInvalidException;
import com.amazonaws.connectors.cognitoidp.handlers.AuthenticationHandler;
import com.amazonaws.connectors.cognitoidp.util.CognitoServiceConstants;
import com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Defines continuation for challenge to pick an MFA.
 * <p>
 *     These challenges are presented when the user has multiple MFA's setup (registered) and enabled,
 *     and none of them are set as preferred.
 * </p>
 */
public class ChooseMfaContinuation extends ChallengeContinuation {
    /**
     * MFA's available to a user to continue authentication.
     */
    private List<String> mfaOptions;

    /**
     * Constructs a new continuation for multiple user MFA's.
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param username              REQUIRED: The username.
     * @param clientId              REQUIRED: The clientId.
     * @param secretHash            REQUIRED: The secret hash.
     * @param challengeResult       REQUIRED: The response from the previous auth step.
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     * @param callback              REQUIRED: Callback to interact with the app.
     */
    public ChooseMfaContinuation(
            CognitoUser user,
            String username,
            String clientId,
            String secretHash,
            RespondToAuthChallengeResult challengeResult,
            boolean runInBackground,
            AuthenticationHandler callback) {
        super(user, username, clientId, secretHash, challengeResult, runInBackground,
                callback);
        mfaOptions = getListFromString(getParameters().get(CognitoServiceConstants.CHLG_PARAM_MFAS_CAN_CHOOSE));
    }

    /**
     * Returns MFA options for a user to continue to authenticate.
     * @return options as a list.
     */
    public List<String>  getMfaOptions() {
        if (mfaOptions == null) {
            mfaOptions = getListFromString(getParameters().get(CognitoServiceConstants.CHLG_PARAM_MFAS_CAN_CHOOSE));
        }
        return mfaOptions;
    }

    /**
     * Set the response to the MFA select request.
     * @param option MFA option picked by the user.
     */
    public void setMfaOption(String option) {
        List<String> availableOptions = getMfaOptions();
        if (option == null || !availableOptions.contains(option)) {
            throw new CognitoParameterInvalidException(String.format(Locale.US, "invalid MFA option: %s", option));
        }
        setChallengeResponse(CognitoServiceConstants.CHLG_RESP_ANSWER, option);
    }

    /**
     * Continue the authentication process with the set MFA option.
     */
    public void continueTask() {
        if (!challengeResponses.containsKey(CognitoServiceConstants.CHLG_RESP_ANSWER)) {
            throw new CognitoParameterInvalidException("MFA option is not set");
        }
        super.continueTask();
    }

    /**
     * Converts a string of the form "["Lorem", "ipsum", "dolor"]" to a list of the form [Lorem, ipsum, dolor].
     * @param listString string containing list items.
     * @return items in the input string parameter as a {@link List}.
     */
    private List<String> getListFromString(String listString) {
        String mfas = listString.replace("[", "").replace("]", "").replace("\"", "");
        return Arrays.asList(mfas.split(","));
    }
}
