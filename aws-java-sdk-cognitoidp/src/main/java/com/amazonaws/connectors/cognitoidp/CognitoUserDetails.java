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

package com.math.pro.ak.util.cognito;

/**
 * Wraps user attributes {@link CognitoUserAttributes} and user settings {@link CognitoUserSettings} objects.
 */
public class CognitoUserDetails {
    private CognitoUserAttributes cognitoUserAttributes;
    private CognitoUserSettings cognitoUserSettings;

    // Constructor to create a user details wrapper
    protected CognitoUserDetails(CognitoUserAttributes cognitoUserAttributes,
                                 CognitoUserSettings cognitoUserSettings) {
        this.cognitoUserAttributes = cognitoUserAttributes;
        this.cognitoUserSettings = cognitoUserSettings;
    }

    /**
     * Returns users' attributes.
     *
     * @return {@link CognitoUserAttributes}
     */
    public CognitoUserAttributes getAttributes() {
        return this.cognitoUserAttributes;
    }

    /**
     * Returns users' settings
     *
     * @return {@link CognitoUserSettings}
     */
    public CognitoUserSettings getSettings() {
        return this.cognitoUserSettings;
    }
}
