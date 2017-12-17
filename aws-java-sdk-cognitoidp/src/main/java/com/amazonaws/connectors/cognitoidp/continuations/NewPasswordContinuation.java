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

package com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations;

import android.content.Context;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeResult;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Defines continuation for new user set-up. This is used to set the password and user attributes
 * after first sign-in after admin created this user. Depending the attributes, for the user,
 * set by the admin, user will have the set the other required attributes during the first sign-in.
 * During the first sign-in, the user will also be able to change some of the attributes which were
 * set by the admin.
 */
public class NewPasswordContinuation extends ChallengeContinuation {
    /**
     * Required attributes to complete first sign-in.
     */
    private List<String> requiredAttributes;

    /**
     * The current values of all user attributes.
     */
    private Map<String, String> currentUserAttributes;

    /**
     * Callback handler.
     */
    private final AuthenticationHandler callback;

    /**
     * Constructs a new continuation for new user sign-in.
     * @param user                  REQUIRED: Reference to the {@link CognitoUser} object.
     * @param runInBackground       REQUIRED: Represents where this continuation has to run.
     * @param callback              REQUIRED: Callback to interact with the app.
     * @param context               REQUIRED: The android context.
     * @param username              REQUIRED: the username.
     * @param clientId              REQUIRED: the clientId.
     * @param secretHash            REQUIRED: the secreth hash.
     * @param challengeResult       REQUIRED: The response to respond to the authentication challenge.
     */
    public NewPasswordContinuation(CognitoUser user,
            Context context,
            String username,
            String clientId,
            String secretHash,
            RespondToAuthChallengeResult challengeResult,
            boolean runInBackground,
            AuthenticationHandler callback) {
        super(user, context, username, clientId, secretHash, challengeResult, runInBackground,
                callback);
        this.callback = callback;

        // Parse required User Attributes and current values of user attributes.
        parseUserAttributes(getParameters().get(CognitoServiceConstants.CHLG_PARAM_USER_ATTRIBUTE));
        parseRequiredAttributes(
                getParameters().get(CognitoServiceConstants.CHLG_PARAM_REQUIRED_ATTRIBUTE));
    }

    /**
     * Returns all required attributes to complete user sign-up. All these user attributes have to be
     * set to complete the user sign-up.
     *
     * @return A {@code List<String>} of all required user attributes.
     */
    public List<String> getRequiredAttributes() {
        return requiredAttributes;
    }

    /**
     * Returns all current user attributes. These attributes are set by the Admin when creating a new
     * user.
     *
     * @return A {@code Map<String, String>} containing all current values of user attributes.
     */
    public Map<String, String> getCurrentUserAttributes() {
        return currentUserAttributes;
    }

    /**
     * Add a user attribute, will override current value.
     *
     * @param attributeName     REQUIRED: The attribute name.
     * @param attributeValue    REQUIRED: The attribute value.
     */
    public void setUserAttribute(String attributeName, String attributeValue) {
        setChallengeResponse(CognitoServiceConstants.CHLG_PARAM_USER_ATTRIBUTE_PREFIX + attributeName, attributeValue);
    }

    /**
     * Set new user password, must not be {@code null}. This is required to complete the user sign-up.
     *
     * @param userPassword      REQUIRED: New user password.
     */
    public void setPassword(String userPassword) {
        if (userPassword != null) {
            setChallengeResponse(CognitoServiceConstants.CHLG_RESP_NEW_PASSWORD, userPassword);
        }
    }

    /**
     * Calls {@Code continueTask()} of the parent after checking if all the required attributes have been set.
     */
    @Override
    public void continueTask() {
        if (requiredAttributes != null && requiredAttributes.size() > 1) {
            for (final String requiredAttribute: requiredAttributes) {
                final String requiredAttrKey = CognitoServiceConstants.CHLG_PARAM_USER_ATTRIBUTE_PREFIX + requiredAttribute;
                if (!challengeResponses.containsKey(requiredAttrKey)) {
                    throw new CognitoParameterInvalidException(
                            String.format("Missing required attribute: %s", requiredAttribute));
                }
            }
        }

        if (challengeResponses.containsKey(CognitoServiceConstants.CHLG_RESP_NEW_PASSWORD) &&
                (challengeResponses.get(CognitoServiceConstants.CHLG_RESP_NEW_PASSWORD) != null)) {
            super.continueTask();
        } else {
            throw new CognitoParameterInvalidException("New password was not set");
        }
    }

    /**
     * Parses user attributes.
     *
     * @param userAttributesJsonString      REQUIRED: User attributes as a Json String.
     */
    private void parseUserAttributes(String userAttributesJsonString) {
        currentUserAttributes = new HashMap<String, String>();
        if (userAttributesJsonString != null) {
            try {
                final JSONObject userAttributesJson = new JSONObject(userAttributesJsonString);
                final Iterator<?> userAttribute = userAttributesJson.keys();
                while (userAttribute.hasNext()) {
                    final String attributeName = (String) userAttribute.next();
                    final String attributeValue = userAttributesJson.getString(attributeName);
                    currentUserAttributes.put(attributeName, attributeValue);
                }
            } catch (final Exception e) {
                callback.onFailure(e);
            }
        }
    }

    /**
     * Parse required attributes.
     *
     * @param requiredAttributesJsonString      REQUIRED: Required user attributes as a Json array.
     */
    private void parseRequiredAttributes(String requiredAttributesJsonString) {
        requiredAttributes = new ArrayList<String>();
        if (requiredAttributesJsonString != null) {
            try {
                final JSONArray requiredAttributesJson = new JSONArray(requiredAttributesJsonString);
                for (int i = 0; i < requiredAttributesJson.length(); i++) {
                    requiredAttributes.add(requiredAttributesJson.getString(i).split(CognitoServiceConstants.CHLG_PARAM_USER_ATTRIBUTE_PREFIX, 2)[1]);
                }
            } catch (final Exception e) {
                callback.onFailure(e);
            }
        }
    }
}
