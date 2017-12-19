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

import com.amazonaws.connectors.cognitoidp.CognitoUserDetails;

/**
 * Callback to get user attributes.
 */
public interface GetDetailsHandler {
    /**
     * This method is called on successfully fetching user attributes.
     * {@code attributesList} contains all attributes set for the user.
     *
     * @param cognitoUserDetails contains the users' details retrieved from the Cognito Service
     */
    public void onSuccess(CognitoUserDetails cognitoUserDetails);

    /**
     * This method is called upon encountering errors during this operation.
     * Probe {@code exception} for the cause of this exception.
     *
     * @param exception REQUIRED: Failure details.
     */
    public void onFailure(Exception exception);
}
