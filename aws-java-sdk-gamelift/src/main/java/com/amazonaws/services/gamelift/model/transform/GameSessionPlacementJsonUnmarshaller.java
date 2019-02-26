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
 * GameSessionPlacement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSessionPlacementJsonUnmarshaller implements Unmarshaller<GameSessionPlacement, JsonUnmarshallerContext> {

    public GameSessionPlacement unmarshall(JsonUnmarshallerContext context) throws Exception {
        GameSessionPlacement gameSessionPlacement = new GameSessionPlacement();

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
                if (context.testExpression("PlacementId", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setPlacementId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameSessionQueueName", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setGameSessionQueueName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameProperties", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setGameProperties(new ListUnmarshaller<GameProperty>(GamePropertyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("MaximumPlayerSessionCount", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setMaximumPlayerSessionCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("GameSessionName", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setGameSessionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameSessionId", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setGameSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameSessionArn", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setGameSessionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameSessionRegion", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setGameSessionRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlayerLatencies", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setPlayerLatencies(new ListUnmarshaller<PlayerLatency>(PlayerLatencyJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IpAddress", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PlacedPlayerSessions", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setPlacedPlayerSessions(new ListUnmarshaller<PlacedPlayerSession>(PlacedPlayerSessionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("GameSessionData", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setGameSessionData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MatchmakerData", targetDepth)) {
                    context.nextToken();
                    gameSessionPlacement.setMatchmakerData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gameSessionPlacement;
    }

    private static GameSessionPlacementJsonUnmarshaller instance;

    public static GameSessionPlacementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GameSessionPlacementJsonUnmarshaller();
        return instance;
    }
}
