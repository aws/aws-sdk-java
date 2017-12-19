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
import javafx.application.Platform;

/**
 * Defines Continuation for authentication. This Continuation is used when user log-in details
 * are required to continue to authenticate the user and get tokens.
 */
public class AuthenticationContinuation implements CognitoIdentityProviderContinuation<String> {

    // Boolean constants used to indicate where this continuation will run.
    /**
     * Run in background.
     */
    public static final boolean RUN_IN_BACKGROUND = true;
    /**
     * Run on current thread.
     */
    public static final boolean RUN_IN_CURRENT = false;

    // Data required to continue with the authentication process.
    private final CognitoUser user;
    private final AuthenticationHandler callback;
    private final boolean runInBackground;

    private AuthenticationDetails authenticationDetails = null;

    /**
     * Constructs a new continuation in the authentication process.
     *
     * @param user
     * @param runInBackground
     * @param callback
     */
    /**
     * Constructs a new continuation in the authentication process.
     *
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param context               REQUIRED: Application context to manage threads.
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     * @param callback              REQUIRED: Callback to interact with the app.
     */
    public AuthenticationContinuation(CognitoUser user,
                                      boolean runInBackground,
                                      AuthenticationHandler callback) {
        this.user = user;
        this.runInBackground = runInBackground;
        this.callback = callback;
    }

    /**
     * Returns the parameters required for this continuation.
     *
     * @return
     */
    @Override
    public String getParameters() {
        return "AuthenticationDetails";
    }

    /**
     * Continues the authentications process by responding to the "PASSWORD_VERIFIER" challenge with
     * username and password. Depending upon the initial call, the response call is name in the current
     * or the background thread.
     *
     */
    @Override
    public void continueTask() {
        if (runInBackground) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Runnable nextStep;
                    try {
                        nextStep = user.initiateUserAuthentication(authenticationDetails, callback, RUN_IN_BACKGROUND);
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
                nextStep = user.initiateUserAuthentication(authenticationDetails, callback, RUN_IN_CURRENT);
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
     * Set details required to continue with this authentication.
     *
     * @param authenticationDetails @see {@link AuthenticationDetails}
     */
    public void setAuthenticationDetails(AuthenticationDetails authenticationDetails) {
        this.authenticationDetails = authenticationDetails;
    }
}
