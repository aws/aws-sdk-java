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
 * Represents an id-token and provides methods to read token claims.
 */
public class CognitoIdToken extends CognitoUserToken {

    private static final int SECS = 1000;

    /**
     * Create a new id token.
     *
     * @param jwtToken REQUIRED: Valid JWT as a String.
     */
    public CognitoIdToken(String jwtToken) {
        super(jwtToken);
    }

    /**
     * Returns the id token formatted as JWT.
     *
     * @return JWT as a {@link String}.
     */
    public String getJWTToken() {
        return super.getToken();
    }

    /**
     * Returns expiration of this id token.
     *
     * @return id token expiration claim as {@link java.util.Date} in UTC.
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
            throw new CognitoInternalErrorException(e.getMessage(), e);
        }
    }

    /**
     * Returns "not before" claim of this id token
     *
     * @return not before claim as {@link java.util.Date} in UTC.
     */
    public Date getNotBefore() {
        try {
            final String claim = CognitoJWTParser.getClaim(super.getToken(), "nbf");
            if (claim == null) {
                return null;
            }
            final long epocTimeSec = Long.parseLong(claim);
            final long epocTimeMilliSec = epocTimeSec * SECS;
            return new Date(epocTimeMilliSec);
        } catch (final Exception e) {
            throw new CognitoInternalErrorException(e.getMessage(), e);
        }
    }

    /**
     * Returns "issued at" claim of this id token
     *
     * @return issue at claim as {@link java.util.Date} in UTC.
     */
    public Date getIssuedAt() {
        try {
            final String claim = CognitoJWTParser.getClaim(super.getToken(), "iat");
            if (claim == null) {
                return null;
            }
            final long epocTimeSec = Long.parseLong(claim);
            final long epocTimeMilliSec = epocTimeSec * SECS;
            return new Date(epocTimeMilliSec);
        } catch (final Exception e) {
            throw new CognitoInternalErrorException(e.getMessage(), e);
        }
    }
}
