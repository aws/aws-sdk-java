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
 * PlayerSession JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlayerSessionJsonUnmarshaller implements Unmarshaller<PlayerSession, JsonUnmarshallerContext> {

    public PlayerSession unmarshall(JsonUnmarshallerContext context) throws Exception {
        PlayerSession playerSession = new PlayerSession();

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
                if (context.testExpression("PlayerSessionId", targetDepth)) {
                    context.nextToken();
                    playerSession.setPlayerSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlayerId", targetDepth)) {
                    context.nextToken();
                    playerSession.setPlayerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameSessionId", targetDepth)) {
                    context.nextToken();
                    playerSession.setGameSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FleetId", targetDepth)) {
                    context.nextToken();
                    playerSession.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    playerSession.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TerminationTime", targetDepth)) {
                    context.nextToken();
                    playerSession.setTerminationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    playerSession.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddress", targetDepth)) {
                    context.nextToken();
                    playerSession.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    playerSession.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PlayerData", targetDepth)) {
                    context.nextToken();
                    playerSession.setPlayerData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return playerSession;
    }

    private static PlayerSessionJsonUnmarshaller instance;

    public static PlayerSessionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlayerSessionJsonUnmarshaller();
        return instance;
    }
}
