/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GameServerGroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameServerGroupJsonUnmarshaller implements Unmarshaller<GameServerGroup, JsonUnmarshallerContext> {

    public GameServerGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        GameServerGroup gameServerGroup = new GameServerGroup();

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
                if (context.testExpression("GameServerGroupName", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setGameServerGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameServerGroupArn", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setGameServerGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceDefinitions", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setInstanceDefinitions(new ListUnmarshaller<InstanceDefinition>(InstanceDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BalancingStrategy", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setBalancingStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameServerProtectionPolicy", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setGameServerProtectionPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoScalingGroupArn", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setAutoScalingGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SuspendedActions", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setSuspendedActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    gameServerGroup.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gameServerGroup;
    }

    private static GameServerGroupJsonUnmarshaller instance;

    public static GameServerGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GameServerGroupJsonUnmarshaller();
        return instance;
    }
}
