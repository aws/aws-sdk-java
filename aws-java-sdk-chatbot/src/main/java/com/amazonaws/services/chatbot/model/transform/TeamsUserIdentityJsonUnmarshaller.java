/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chatbot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chatbot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TeamsUserIdentity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TeamsUserIdentityJsonUnmarshaller implements Unmarshaller<TeamsUserIdentity, JsonUnmarshallerContext> {

    public TeamsUserIdentity unmarshall(JsonUnmarshallerContext context) throws Exception {
        TeamsUserIdentity teamsUserIdentity = new TeamsUserIdentity();

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
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    teamsUserIdentity.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChatConfigurationArn", targetDepth)) {
                    context.nextToken();
                    teamsUserIdentity.setChatConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TeamId", targetDepth)) {
                    context.nextToken();
                    teamsUserIdentity.setTeamId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserId", targetDepth)) {
                    context.nextToken();
                    teamsUserIdentity.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AwsUserIdentity", targetDepth)) {
                    context.nextToken();
                    teamsUserIdentity.setAwsUserIdentity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TeamsChannelId", targetDepth)) {
                    context.nextToken();
                    teamsUserIdentity.setTeamsChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TeamsTenantId", targetDepth)) {
                    context.nextToken();
                    teamsUserIdentity.setTeamsTenantId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return teamsUserIdentity;
    }

    private static TeamsUserIdentityJsonUnmarshaller instance;

    public static TeamsUserIdentityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TeamsUserIdentityJsonUnmarshaller();
        return instance;
    }
}
