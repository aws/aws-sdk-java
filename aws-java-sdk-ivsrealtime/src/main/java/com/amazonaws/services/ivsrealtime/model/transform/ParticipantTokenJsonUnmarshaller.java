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
package com.amazonaws.services.ivsrealtime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ivsrealtime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ParticipantToken JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParticipantTokenJsonUnmarshaller implements Unmarshaller<ParticipantToken, JsonUnmarshallerContext> {

    public ParticipantToken unmarshall(JsonUnmarshallerContext context) throws Exception {
        ParticipantToken participantToken = new ParticipantToken();

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
                if (context.testExpression("attributes", targetDepth)) {
                    context.nextToken();
                    participantToken.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("capabilities", targetDepth)) {
                    context.nextToken();
                    participantToken.setCapabilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("duration", targetDepth)) {
                    context.nextToken();
                    participantToken.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("expirationTime", targetDepth)) {
                    context.nextToken();
                    participantToken.setExpirationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("participantId", targetDepth)) {
                    context.nextToken();
                    participantToken.setParticipantId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("token", targetDepth)) {
                    context.nextToken();
                    participantToken.setToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userId", targetDepth)) {
                    context.nextToken();
                    participantToken.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return participantToken;
    }

    private static ParticipantTokenJsonUnmarshaller instance;

    public static ParticipantTokenJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParticipantTokenJsonUnmarshaller();
        return instance;
    }
}
