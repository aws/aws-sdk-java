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

package com.amazonaws.connectors.cognitoidp.handlers;

import com.amazonaws.connectors.cognitoidp.CognitoDevice;
import com.amazonaws.connectors.cognitoidp.CognitoUserSession;
import com.amazonaws.connectors.cognitoidp.continuations.AuthenticationContinuation;
import com.amazonaws.connectors.cognitoidp.continuations.ChallengeContinuation;
import com.amazonaws.connectors.cognitoidp.continuations.MultiFactorAuthenticationContinuation;

/**
 * Callback handler for user authentication process.
 */
public interface AuthenticationHandler {

    /**
     * This method is called to deliver valid tokens, when valid tokens were locally
     * available (cached) or after successful completion of the authentication process.
     * The {@code newDevice} will is an instance of {@link CognitoDevice} for this device, and this
     * parameter will be not null during these cases:
     *  1- If the user pool allows devices to be remembered and this is is a new device, that is
     * first time authentication on this device.
     *  2- When the cached device key is lost and, hence, the service identifies this as a new device.
     *
     * @param userSession               Contains valid user tokens.
     * @param newDevice                 {@link CognitoDevice}, will be null if this is not a new device.
     */
    public void onSuccess(CognitoUserSession userSession, CognitoDevice newDevice);

    /**
     * Call out to the dev to get the credentials for a user.
     *
     * @param authenticationContinuation is a {@link AuthenticationContinuation} object that should
     *                                   be used to continue with the authentication process when
     *                                   the users' authentication details are available.
     * @param userId                     Is the user-ID (username  or alias) used in authentication.
     *                                   This will be null if the user ID is not available.
     */
    public void getAuthenticationDetails(AuthenticationContinuation authenticationContinuation, String userId);

    /**
     * Call out to the dev to send MFA code.
     * MFA code would have been sent via the deliveryMethod before this is invoked.
     * This callback can be invoked in two scenarios -
     *  1)  MFA verification is required and only one possible MFA delivery medium is
     *      available.
     *  2)  MFA verification is required and a MFA delivery medium was successfully set.
     *  3)  An MFA code sent earlier was incorrect and at-least one more attempt to send
     *      MFA code is available.
     *
     * @param continuation medium through which the MFA will be delivered
     */
    public void getMFACode(MultiFactorAuthenticationContinuation continuation);

    /**
     * Call out to the dev to respond to a challenge.
     * The authentication process as presented the user with the a challenge, to successfully authenticate.
     * This a generic challenge, that is not MFA or user password verification.
     *
     * @param continuation contains details about the challenge and allows dev to respond to the
     *                     challenge.
     */
    public void authenticationChallenge(ChallengeContinuation continuation);

    /**
     * This method is called when a fatal exception was encountered during
     * authentication. The current authentication process continue because of the error
     * , hence a continuation is not available. Probe {@code exception} for details.
     *
     * @param exception is this Exception leading to authentication failure.
     */
    public void onFailure(Exception exception);
}
