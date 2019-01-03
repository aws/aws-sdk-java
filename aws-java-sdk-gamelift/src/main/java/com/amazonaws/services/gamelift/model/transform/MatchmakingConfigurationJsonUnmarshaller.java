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
package com.amazonaws.services.gamelift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MatchmakingConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchmakingConfigurationJsonUnmarshaller implements Unmarshaller<MatchmakingConfiguration, JsonUnmarshallerContext> {

    public MatchmakingConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        MatchmakingConfiguration matchmakingConfiguration = new MatchmakingConfiguration();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameSessionQueueArns", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setGameSessionQueueArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RequestTimeoutSeconds", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setRequestTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AcceptanceTimeoutSeconds", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setAcceptanceTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AcceptanceRequired", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setAcceptanceRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RuleSetName", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setRuleSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationTarget", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setNotificationTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalPlayerCount", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setAdditionalPlayerCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CustomEventData", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setCustomEventData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("GameProperties", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setGameProperties(new ListUnmarshaller<GameProperty>(GamePropertyJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("GameSessionData", targetDepth)) {
                    context.nextToken();
                    matchmakingConfiguration.setGameSessionData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return matchmakingConfiguration;
    }

    private static MatchmakingConfigurationJsonUnmarshaller instance;

    public static MatchmakingConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MatchmakingConfigurationJsonUnmarshaller();
        return instance;
    }
}
