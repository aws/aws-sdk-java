/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.chime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * User JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserJsonUnmarshaller implements Unmarshaller<User, JsonUnmarshallerContext> {

    public User unmarshall(JsonUnmarshallerContext context) throws Exception {
        User user = new User();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UserId", targetDepth)) {
                    context.nextToken();
                    user.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    user.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrimaryEmail", targetDepth)) {
                    context.nextToken();
                    user.setPrimaryEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrimaryProvisionedNumber", targetDepth)) {
                    context.nextToken();
                    user.setPrimaryProvisionedNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    user.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseType", targetDepth)) {
                    context.nextToken();
                    user.setLicenseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserRegistrationStatus", targetDepth)) {
                    context.nextToken();
                    user.setUserRegistrationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserInvitationStatus", targetDepth)) {
                    context.nextToken();
                    user.setUserInvitationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegisteredOn", targetDepth)) {
                    context.nextToken();
                    user.setRegisteredOn(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("InvitedOn", targetDepth)) {
                    context.nextToken();
                    user.setInvitedOn(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("PersonalPIN", targetDepth)) {
                    context.nextToken();
                    user.setPersonalPIN(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return user;
    }

    private static UserJsonUnmarshaller instance;

    public static UserJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserJsonUnmarshaller();
        return instance;
    }
}
