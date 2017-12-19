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

import com.amazonaws.connectors.cognitoidp.CognitoUser;
import com.amazonaws.connectors.cognitoidp.CognitoUserCodeDeliveryDetails;

/**
 * Callback for user Sign-up.
 */
public interface SignUpHandler {
    /**
     * This method is called successfully registering a new user.
     * Confirming the user may be required to activate the users account.
     *
     * @param user {@link CognitoUser}
     * @param signUpConfirmationState will be {@code true} is the user has been confirmed,
     *                                otherwise {@code false}.
     * @param cognitoUserCodeDeliveryDetails REQUIRED: Indicates the medium and destination of the confirmation code.
     */
    public void onSuccess(CognitoUser user, boolean signUpConfirmationState, CognitoUserCodeDeliveryDetails cognitoUserCodeDeliveryDetails);

    /**
     * This method is called when user registration has failed.
     * Probe {@code exception} for cause of the failure.
     *
     * @param exception REQUIRED: Failure details.
     */
    public void onFailure(Exception exception);
}
