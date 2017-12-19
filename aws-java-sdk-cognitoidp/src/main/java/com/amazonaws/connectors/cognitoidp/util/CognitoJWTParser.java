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

package com.amazonaws.connectors.cognitoidp.util;

import com.amazonaws.util.Base64;
import com.amazonaws.connectors.cognitoidp.exceptions.CognitoParameterInvalidException;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

/**
 * Utility class for all operations on JWT.
 */
public class CognitoJWTParser {
    private static final int HEADER = 0;
    private static final int PAYLOAD = 1;
    private static final int SIGNATURE = 2;
    private static final int JWT_PARTS = 3;
    /**
     * Encoder/decoder flag bit to indicate using the "URL and
     * filename safe" variant of Base64 (see RFC 3548 section 4) where
     * {@code -} and {@code _} are used in place of {@code +} and
     * {@code /}.
     */
    public static final int URL_SAFE = 8;
    /**
     * Returns header for a JWT as a JSON object.
     *
     * @param jwt       REQUIRED: valid JSON Web Token as String.
     * @return header as a JSONObject.
     */
    public static JSONObject getHeader(String jwt) {
        try {
            validateJWT(jwt);
            final byte[] sectionDecoded = Base64.decode(jwt.split("\\.")[HEADER]);
            final String jwtSection = new String(sectionDecoded, "UTF-8");
            return new JSONObject(jwtSection);
        } catch (final UnsupportedEncodingException e) {
            throw new CognitoParameterInvalidException(e.getMessage());
        } catch (final JSONException e) {
            throw new CognitoParameterInvalidException(e.getMessage());
        } catch (final Exception e) {
            throw new CognitoParameterInvalidException("error in parsing JSON");
        }
    }

    /**
     * Returns payload of a JWT as a JSON object.
     *
     * @param jwt       REQUIRED: valid JSON Web Token as String.
     * @return payload as a JSONObject.
     */
    public static JSONObject getPayload(String jwt) {
        try {
            validateJWT(jwt);
            final String payload = jwt.split("\\.")[PAYLOAD];
            final byte[] sectionDecoded = Base64.decode(payload);
            final String jwtSection = new String(sectionDecoded, "UTF-8");
            return new JSONObject(jwtSection);
        } catch (final UnsupportedEncodingException e) {
            throw new CognitoParameterInvalidException(e.getMessage());
        } catch (final JSONException e) {
            throw new CognitoParameterInvalidException(e.getMessage());
        } catch (final Exception e) {
            throw new CognitoParameterInvalidException("error in parsing JSON");
        }
    }

    /**
     * Returns signature of a JWT as a String.
     *
     * @param jwt       REQUIRED: valid JSON Web Token as String.
     * @return signature as a String.
     */
    public static String getSignature(String jwt) {
        try {
            validateJWT(jwt);
            final byte[] sectionDecoded = Base64.decode(jwt.split("\\.")[SIGNATURE]);
            return new String(sectionDecoded, "UTF-8");
        } catch (final Exception e) {
            throw new CognitoParameterInvalidException("error in parsing JSON");
        }
    }

    /**
     * Returns a claim, from the {@code JWT}s' payload, as a String.
     *
     * @param jwt       REQUIRED: valid JSON Web Token as String.
     * @param claim     REQUIRED: claim name as String.
     * @return  claim from the JWT as a String.
     */
    public static String getClaim(String jwt, String claim) {
        try {
            final JSONObject payload = getPayload(jwt);
            final Object claimValue = payload.get(claim);

            if (claimValue != null) {
                return claimValue.toString();
            }

        } catch (final Exception e) {
            throw new CognitoParameterInvalidException("invalid token");
        }
        return null;
    }

    /**
     * Checks if {@code JWT} is a valid JSON Web Token.
     *
     * @param jwt REQUIRED: The JWT as a {@link String}.
     */
    public static void validateJWT(String jwt) {
        // Check if the the JWT has the three parts
        final String[] jwtParts = jwt.split("\\.");
        if (jwtParts.length != JWT_PARTS) {
            throw new CognitoParameterInvalidException("not a JSON Web Token");
        }
    }
}
