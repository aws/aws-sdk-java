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

package com.amazonaws.connectors.cognitoidp;

import com.amazonaws.services.cognitoidp.model.AttributeType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Encapsulates all user attributes and provides methods to access them.
 */
public class CognitoUserAttributes {
    /**
     * All attributes set for a user
     */
    private Map<String, String> userAttributes;

    // Multi-factor authentication options set for a user
    private Map<String, String> mfaOptions;

    /**
     * Public constructor, creates an "empty container".
     * Use {@link CognitoUserAttributes#addAttribute(String, String)} method to add user attributes.
     */
    public CognitoUserAttributes() {
        this(null);
    }

    /**
     * Constructor for internal use.
     *
     * @param userAttributes    REQUIRED: Cognito user attributes as a list.
     */
    protected CognitoUserAttributes(List<AttributeType> userAttributes) {
        this.userAttributes = new HashMap<String, String>();
        if (userAttributes != null) {
            for (AttributeType attribute : userAttributes) {
                this.userAttributes.put(attribute.getName(), attribute.getValue());
            }
        }
    }

    /**
     * Adds an attribute to this object.
     * <p>
     *      Will add the attribute and its value. Overrides an earlier value set for an attribute
     *      which was already added to this object.
     * </p>
     *
     * @param attributeName         REQUIRED: The attribute name.
     * @param value                 REQUIRED: Value for the attribute.
     */
    public void addAttribute(String attributeName, String value) {
        userAttributes.put(attributeName, value);
    }

    /**
     * Returns the user attributes as a key, value pairs.
     *
     * @return User attributes as key, value pairs
     */
    public Map<String, String> getAttributes() {
        return userAttributes;
    }

    /**
     * Returns the user attributes as a {@link AttributeType} list.
     *
     * @return {@link AttributeType} Cognito user attributes as a list.
     */
    protected List<AttributeType> getAttributesList() {
        List<AttributeType> attributesList = new ArrayList<AttributeType>();
        if (userAttributes != null) {
            for (Map.Entry<String, String> detail : userAttributes.entrySet()) {
                AttributeType attribute = new AttributeType();
                attribute.setName(detail.getKey());
                attribute.setValue(detail.getValue());
                attributesList.add(attribute);
            }
        }
        return attributesList;
    }
}
