/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UserData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserDataJsonUnmarshaller implements Unmarshaller<UserData, JsonUnmarshallerContext> {

    public UserData unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserData userData = new UserData();

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
                if (context.testExpression("User", targetDepth)) {
                    context.nextToken();
                    userData.setUser(UserReferenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoutingProfile", targetDepth)) {
                    context.nextToken();
                    userData.setRoutingProfile(RoutingProfileReferenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HierarchyPath", targetDepth)) {
                    context.nextToken();
                    userData.setHierarchyPath(HierarchyPathReferenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    userData.setStatus(AgentStatusReferenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AvailableSlotsByChannel", targetDepth)) {
                    context.nextToken();
                    userData.setAvailableSlotsByChannel(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("MaxSlotsByChannel", targetDepth)) {
                    context.nextToken();
                    userData.setMaxSlotsByChannel(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("ActiveSlotsByChannel", targetDepth)) {
                    context.nextToken();
                    userData.setActiveSlotsByChannel(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("Contacts", targetDepth)) {
                    context.nextToken();
                    userData.setContacts(new ListUnmarshaller<AgentContactReference>(AgentContactReferenceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NextStatus", targetDepth)) {
                    context.nextToken();
                    userData.setNextStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userData;
    }

    private static UserDataJsonUnmarshaller instance;

    public static UserDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserDataJsonUnmarshaller();
        return instance;
    }
}
