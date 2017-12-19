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

package com.amazonaws.connectors.cognitoidp.continuations;

import com.amazonaws.connectors.cognitoidp.exceptions.CognitoParameterInvalidException;
import com.amazonaws.connectors.cognitoidp.util.CognitoServiceConstants;
import com.amazonaws.services.cognitoidp.model.AttributeType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Encapsulates all data required to authenticate a user.
 * Pass an object of this type to the continuation object to continue with the authentication process.
 * This contents of this object are set when it is constructed and are immutable afterwards.
 */
public class AuthenticationDetails {
    private String authenticationType;
    private final String userId;
    private String password;
    private List<AttributeType> validationData;
    private Map<String, String> authenticationParameters;

    /**
     * Constructs a new object with authentication details.
     *
     * @param userId            REQUIRED: User ID, NOTE: This will over ride the current Used ID.
     * @param password          REQUIRED: Users' password.
     * @param validationData    REQUIRED: Validation data parameters for the pre-auth lambda.
     */
    public AuthenticationDetails(String userId, String password,
            Map<String, String> validationData) {
        this.authenticationType = CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER;
        this.userId = userId;
        this.password = password;
        setValidationData(validationData);
    }

    /**
     * Constructs a new object for custom authentication.
     *
     * @param userId REQUIRED: User ID, NOTE: This will over ride the current
     *            Used ID.
     * @param authenticationParameters REQUIRED: Authentication details to
     *            launch custom authentication process.
     * @param validationData REQUIRED: Contains authentication parameters 
     *            which are passed to triggered pre-auth lambda. trigger 
     */
    public AuthenticationDetails(String userId, Map<String, String> authenticationParameters,
            Map<String, String> validationData) {
        this.userId = userId;
        if (authenticationParameters != null) {
            this.authenticationType = CognitoServiceConstants.CHLG_TYPE_CUSTOM_CHALLENGE;
            this.authenticationParameters = authenticationParameters;
            setValidationData(validationData);
        } else {
            this.authenticationType = null;
        }
    }

    /**
     * Set the type of authentication to be used in this instance.
     *  
     * @param authenticationType REQUIRED: The authentication type indicator. 
     */
    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        if (CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER
                .equals(this.authenticationType)) {
            this.authenticationParameters = null;
        } else if (CognitoServiceConstants.CHLG_TYPE_CUSTOM_CHALLENGE
                .equals(this.authenticationType)) {
            this.password = null;
        }
    }

    /**
     * This method returns the password.
     *
     * @return password set.
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method returns the User Id.
     *
     * @return userId set in this object.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method returns the validation data.
     *
     * @return validation data set in this object.
     */
    public List<AttributeType> getValidationData() {
        return validationData;
    }

    /**
     * This method returns the authentication type.
     *
     * @return the authentication type set for this object.
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * The authentication parameters set for custom authentication process.
     *
     * @return Authentication details as a Map.
     */
    public Map<String, String> getAuthenticationParameters() {
        return authenticationParameters;
    }

    /**
     * Set the name of the custom challenge. This will override the existing authentication name.
     *
     * @param customChallenge           REQUIRED: Custom challenge name.
     */
    public void setCustomChallenge(String customChallenge) {
        if (CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER
                .equals(this.authenticationType)) {
            throw new CognitoParameterInvalidException(
                    String.format("Cannot set custom challenge when the authentication type is %s.",
                            CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER));
        }
        this.authenticationType = CognitoServiceConstants.CHLG_TYPE_CUSTOM_CHALLENGE;
        setAuthenticationParameter(CognitoServiceConstants.AUTH_PARAM_CHALLENGE_NAME,
                customChallenge);
    }

    /**
     * Set the name of the authentication challenge.
     *
     * @param validationData
     */
    private void setValidationData(Map<String, String> validationData) {
        if (validationData != null) {
            this.validationData = new ArrayList<AttributeType>();
            for (final Map.Entry<String, String> data : validationData.entrySet()) {
                final AttributeType validation = new AttributeType();
                validation.setName(data.getKey());
                validation.setValue(data.getValue());
                this.validationData.add(validation);
            }
        } else {
            this.validationData = null;
        }
    }

    /**
     * Sets new authentication details, will override the current values.
     *
     * @param authenticationParameters      REQUIRED: Authentication details as a Map.
     */
    public void setAuthenticationParameters(Map<String, String> authenticationParameters) {
        this.authenticationParameters = authenticationParameters;
    }

    /**
     * Set an authentication detail, will override the current value.
     *
     * @param key                       REQUIRED: Authentication detail key.
     * @param value                     REQUIRED: Authentication detail value.
     */
    public void setAuthenticationParameter(String key, String value) {
        if (key != null) {
            if (this.authenticationParameters == null) {
                this.authenticationParameters = new HashMap<String, String>();
            }
            authenticationParameters.put(key, value);
        } else {
            throw new CognitoParameterInvalidException(
                    "A null key was used to add a new authentications parameter.");
        }
    }
}
