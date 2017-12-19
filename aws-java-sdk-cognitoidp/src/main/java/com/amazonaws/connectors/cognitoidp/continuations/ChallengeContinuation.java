/*
 *  Copyright 2013-2016 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */
package com.amazonaws.connectors.cognitoidp.continuations;

import com.amazonaws.connectors.cognitoidp.CognitoUser;
import com.amazonaws.connectors.cognitoidp.handlers.AuthenticationHandler;
import com.amazonaws.connectors.cognitoidp.util.CognitoServiceConstants;
import com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest;
import com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Platform;

/**
 * Defines a Continuation for a generic auth-challenge. This Continuation is
 * used for all developer driven challenges.
 */
public class ChallengeContinuation implements CognitoIdentityProviderContinuation<Map<String, String>> {

    // Boolean constants used to indicate where this continuation will run.
    /**
     * Run in background.
     */
    public static final boolean RUN_IN_BACKGROUND = true;
    /**
     * Run on current thread.
     */
    public static final boolean RUN_IN_CURRENT = false;

    private final RespondToAuthChallengeResult challengeResult;
    private final String clientId;
    private final String secretHash;
    private final CognitoUser user;
    private final String username;
    private final AuthenticationHandler callback;
    protected Map<String, String> challengeResponses;
    private final boolean runInBackground;

    /**
     * Constructs a continuation for a challenge to be presented to the user.
     *
     * @param user REQUIRED: Reference to the user being authenticated.
     * @param username REQUIRED: Username used for this auth attempt.
     * @param clientId REQUIRED: Cognito App Id
     * @param secretHash REQUIRED: Hash of the App Secret
     * @param challengeResult REQUIRED: Response from Cognito containing
     * information about the new challenge.
     * @param runInBackground REQUIRED: Indicates if continuation must execute
     * in a background thread.
     * @param callback REQUIRED: Reference to the callback handler.
     */
    public ChallengeContinuation(CognitoUser user,
            String username,
            String clientId,
            String secretHash,
            RespondToAuthChallengeResult challengeResult,
            boolean runInBackground,
            AuthenticationHandler callback) {
        this.challengeResult = challengeResult;
        this.clientId = clientId;
        this.secretHash = secretHash;
        this.user = user;
        this.username = username;
        this.callback = callback;
        this.runInBackground = runInBackground;
        challengeResponses = new HashMap<String, String>();
    }

    /**
     * Returns the challenges parameters for a generic challenge (developer
     * defined) challenge. The keys in this map are usually determined by the
     * developer. They should contain all the information and resources required
     * by the app, to determine the type of challenge and to present the
     * challenge to the user. This opens up the authentication process to the
     * developers to bring their custom steps to authenticate to Cognito User
     * Pools.
     *
     * @return A {@link Map<String, String>} containing parameters for this auth
     * challenge process.
     */
    @Override
    public Map<String, String> getParameters() {
        return challengeResult.getChallengeParameters();
    }

    /**
     * Returns the name of the challenge. Use the challenge name and the
     * challenge parameters to identity the challenge and correctly present to
     * the user.
     *
     * @return the challenge name as a {@link String}.
     */
    public String getChallengeName() {
        return challengeResult.getChallengeName();
    }

    /**
     * Add responses to the authentication challenge. The responses are added as
     * key-value pairs. The keys are usually unique to the challenge and are
     * often determined by the developers who have set this challenge.
     *  <b>Note:</b> Overrides an earlier value set for the attribute.
     *
     * @param responseKey REQUIRED: The key (identifier) for a parameter in the
     * challenge response.
     * @param responseValue REQUIRED: The value of the key (identifier),
     */
    public void setChallengeResponse(String responseKey, String responseValue) {
        challengeResponses.put(responseKey, responseValue);
    }

    /**
     * Continues the authentication process by responding to the generic
     * challenge posed by the system. This invokes the method to respond to the
     * generic authentication challenge in the current or on a background thread
     * depending up on how the authentication process with initiated. This
     * method gets a {@link Runnable} which is is always executed in the
     * applications thread. The mechanism to identify the current thread and to
     * run the returned {@link Runnable} in the apps thread is implemented in
     * this method.
     */
    @Override
    public void continueTask() {
        final RespondToAuthChallengeRequest respondToAuthChallengeRequest = new RespondToAuthChallengeRequest();
        challengeResponses.put(CognitoServiceConstants.CHLG_RESP_USERNAME, username);
        challengeResponses.put(CognitoServiceConstants.CHLG_RESP_SECRET_HASH, secretHash);
        respondToAuthChallengeRequest.setChallengeName(challengeResult.getChallengeName());
        respondToAuthChallengeRequest.setSession(challengeResult.getSession());
        respondToAuthChallengeRequest.setClientId(clientId);
        respondToAuthChallengeRequest.setChallengeResponses(challengeResponses);
        if (runInBackground) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Runnable nextStep;
                    try {
                        nextStep = user.respondToChallenge(respondToAuthChallengeRequest, callback, RUN_IN_BACKGROUND);
                    } catch (final Exception e) {
                        nextStep = new Runnable() {
                            @Override
                            public void run() {
                                callback.onFailure(e);
                            }
                        };
                    }
                    Platform.runLater(nextStep);
                }
            }).start();
        } else {
            Runnable nextStep;
            try {
                nextStep = user.respondToChallenge(respondToAuthChallengeRequest, callback, RUN_IN_CURRENT);
            } catch (final Exception e) {
                nextStep = new Runnable() {
                    @Override
                    public void run() {
                        callback.onFailure(e);
                    }
                };
            }
            nextStep.run();
        }
    }

    /**
     * Over-write the current challenge session code.
     *
     * @param session REQUIRED: The new session code.
     */
    public void setResponseSessionCode(String session) {
        challengeResult.setSession(session);
    }
}
