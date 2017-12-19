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

package com.amazonaws.connectors.cognitoidp.tokens;

import com.amazonaws.connectors.cognitoidp.exceptions.CognitoInternalErrorException;
import com.amazonaws.connectors.cognitoidp.util.CognitoJWTParser;

import java.util.Date;

/**
 * Represents a access token and provides methods to read token claims.
 */

public class CognitoAccessToken extends CognitoUserToken {

    private static final int SECS = 1000;

    /**
     * Create a new access token.
     *
     * @param jwtToken      REQUIRED: Valid JWT as a String.
     */
    public CognitoAccessToken(String jwtToken) {
        super(jwtToken);
    }

    /**
     * Returns the access token formatted as JWT.
     *
     * @return JWT as a {@link String}.
     */
    public String getJWTToken() {
        return super.getToken();
    }

    /**
     * Returns expiration of this access token.
     *
     * @return access token expiration in UTC as java.util.Date object.
     */
    public Date getExpiration() {
        try {
            final String claim = CognitoJWTParser.getClaim(super.getToken(), "exp");
            if (claim == null) {
                return null;
            }
            final long epocTimeSec = Long.parseLong(claim);
            final long epocTimeMilliSec = epocTimeSec * SECS;
            return new Date(epocTimeMilliSec);
        } catch (final Exception e) {
            throw new CognitoInternalErrorException(e.getMessage());
        }
    }
    
    /**
     * Returns the username set in the access token.
     * @return Username.
     */
    public String getUsername() throws Exception {
        return CognitoJWTParser.getClaim(super.getToken(), "username");
    }
}
