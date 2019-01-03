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
 * GameSession JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSessionJsonUnmarshaller implements Unmarshaller<GameSession, JsonUnmarshallerContext> {

    public GameSession unmarshall(JsonUnmarshallerContext context) throws Exception {
        GameSession gameSession = new GameSession();

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
                if (context.testExpression("GameSessionId", targetDepth)) {
                    context.nextToken();
                    gameSession.setGameSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    gameSession.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FleetId", targetDepth)) {
                    context.nextToken();
                    gameSession.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    gameSession.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TerminationTime", targetDepth)) {
                    context.nextToken();
                    gameSession.setTerminationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CurrentPlayerSessionCount", targetDepth)) {
                    context.nextToken();
                    gameSession.setCurrentPlayerSessionCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaximumPlayerSessionCount", targetDepth)) {
                    context.nextToken();
                    gameSession.setMaximumPlayerSessionCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    gameSession.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    context.nextToken();
                    gameSession.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameProperties", targetDepth)) {
                    context.nextToken();
                    gameSession.setGameProperties(new ListUnmarshaller<GameProperty>(GamePropertyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("IpAddress", targetDepth)) {
                    context.nextToken();
                    gameSession.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    gameSession.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PlayerSessionCreationPolicy", targetDepth)) {
                    context.nextToken();
                    gameSession.setPlayerSessionCreationPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatorId", targetDepth)) {
                    context.nextToken();
                    gameSession.setCreatorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameSessionData", targetDepth)) {
                    context.nextToken();
                    gameSession.setGameSessionData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MatchmakerData", targetDepth)) {
                    context.nextToken();
                    gameSession.setMatchmakerData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gameSession;
    }

    private static GameSessionJsonUnmarshaller instance;

    public static GameSessionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GameSessionJsonUnmarshaller();
        return instance;
    }
}
