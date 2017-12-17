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

package com.math.pro.ak.util.cognito.handlers;


import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;

import java.util.List;

/**
 * Callback for user attribute updates.
 */
public interface UpdateAttributesHandler {
    /**
     * This is called after the verification code was successfully sent.
     *
     * @param attributesVerificationList if an attribute that can be used as an alias is changed,
     *                                  then the verification code for those attributes are automatically
     *                                  sent after the successful update.
     *                                  This list contains the verification code delivery details for
     *                                  all such attributes.
     */
    public void onSuccess(List<CognitoUserCodeDeliveryDetails> attributesVerificationList);

    /**
     * This is called when the request for verification code failed. Probe {@code exception} for the
     * cause.
     *
     * @param exception REQUIRED: Failure details.
     */
    public void onFailure(Exception exception);
}
