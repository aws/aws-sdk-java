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
 * TeamsChannelConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TeamsChannelConfigurationJsonUnmarshaller implements Unmarshaller<TeamsChannelConfiguration, JsonUnmarshallerContext> {

    public TeamsChannelConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        TeamsChannelConfiguration teamsChannelConfiguration = new TeamsChannelConfiguration();

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
                if (context.testExpression("ChannelId", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelName", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TeamId", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setTeamId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TeamName", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setTeamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TenantId", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setTenantId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChatConfigurationArn", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setChatConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicArns", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setSnsTopicArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ConfigurationName", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggingLevel", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setLoggingLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GuardrailPolicyArns", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setGuardrailPolicyArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("UserAuthorizationRequired", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setUserAuthorizationRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    teamsChannelConfiguration.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return teamsChannelConfiguration;
    }

    private static TeamsChannelConfigurationJsonUnmarshaller instance;

    public static TeamsChannelConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TeamsChannelConfigurationJsonUnmarshaller();
        return instance;
    }
}
