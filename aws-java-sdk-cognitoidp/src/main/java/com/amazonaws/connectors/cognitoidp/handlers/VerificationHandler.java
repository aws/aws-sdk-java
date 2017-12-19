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

import com.amazonaws.connectors.cognitoidp.CognitoUserCodeDeliveryDetails;

/**
 * Callback for requesting attribute verification code
 */
public interface VerificationHandler {

    /**
     * This is called after the verification code was successfully sent.
     *
     * @param verificationCodeDeliveryMedium specifies the medium (e.g. email, sms) used to deliver
     *                                       the verification code.
     */
    public void onSuccess(CognitoUserCodeDeliveryDetails verificationCodeDeliveryMedium);

    /**
     * This is called when the request for verification code failed. Probe {@code exception} for the
     * cause.
     *
     * @param exception REQUIRED: Failure details.
     */
    public void onFailure(Exception exception);
}
