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

package com.math.pro.ak.util.cognito.tokens;

/**
 * Represents a Cognito Refresh token.
 */
public class CognitoRefreshToken extends CognitoUserToken {

    /**
     * Constructor.
     *
     * @param token the refresh token.
     */
    public CognitoRefreshToken(String token) {
        super(token);
    }

    /**
     * Returns this Cognito refresh token as a String.
     *
     * @return refresh token as a string.
     */
    @Override
    public String getToken() {
        return super.getToken();
    }
}
