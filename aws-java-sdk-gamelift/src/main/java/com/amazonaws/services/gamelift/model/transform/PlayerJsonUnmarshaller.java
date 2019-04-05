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
 * Player JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlayerJsonUnmarshaller implements Unmarshaller<Player, JsonUnmarshallerContext> {

    public Player unmarshall(JsonUnmarshallerContext context) throws Exception {
        Player player = new Player();

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
                if (context.testExpression("PlayerId", targetDepth)) {
                    context.nextToken();
                    player.setPlayerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlayerAttributes", targetDepth)) {
                    context.nextToken();
                    player.setPlayerAttributes(new MapUnmarshaller<String, AttributeValue>(context.getUnmarshaller(String.class),
                            AttributeValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Team", targetDepth)) {
                    context.nextToken();
                    player.setTeam(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatencyInMs", targetDepth)) {
                    context.nextToken();
                    player.setLatencyInMs(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context.getUnmarshaller(Integer.class))
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

        return player;
    }

    private static PlayerJsonUnmarshaller instance;

    public static PlayerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlayerJsonUnmarshaller();
        return instance;
    }
}
