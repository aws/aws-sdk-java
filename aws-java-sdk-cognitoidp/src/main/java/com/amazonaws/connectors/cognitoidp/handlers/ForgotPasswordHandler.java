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

import com.amazonaws.connectors.cognitoidp.continuations.ForgotPasswordContinuation;


/**
 * Defines callback to handle to reset user password.
 */
public interface ForgotPasswordHandler {

    /**
     * This is called after successfully setting new password for a user.
     * The new password can new be used to authenticate this user.
     */
    public void onSuccess();

    /**
     * A code may be required to confirm and complete the password reset process
     * Supply the new password and the confirmation code - which was sent through email/sms
     * to the continuation
     * @param continuation REQUIRED: Continuation to the next step.
     */
    public void getResetCode(ForgotPasswordContinuation continuation);

    /**
     * This is called for all fatal errors encountered during the password reset process
     * Probe {@exception} for cause of this failure.
     * @param exception REQUIRED: Contains failure details.
     */
    public void onFailure(Exception exception);
}
