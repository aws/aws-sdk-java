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
 * SlackChannelConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlackChannelConfigurationJsonUnmarshaller implements Unmarshaller<SlackChannelConfiguration, JsonUnmarshallerContext> {

    public SlackChannelConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        SlackChannelConfiguration slackChannelConfiguration = new SlackChannelConfiguration();

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
                if (context.testExpression("SlackTeamName", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setSlackTeamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SlackTeamId", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setSlackTeamId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SlackChannelId", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setSlackChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SlackChannelName", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setSlackChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChatConfigurationArn", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setChatConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicArns", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setSnsTopicArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ConfigurationName", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggingLevel", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setLoggingLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GuardrailPolicyArns", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setGuardrailPolicyArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("UserAuthorizationRequired", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setUserAuthorizationRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    slackChannelConfiguration.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return slackChannelConfiguration;
    }

    private static SlackChannelConfigurationJsonUnmarshaller instance;

    public static SlackChannelConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SlackChannelConfigurationJsonUnmarshaller();
        return instance;
    }
}
