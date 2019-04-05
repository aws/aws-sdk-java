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
package com.amazonaws.services.chime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VoiceConnector JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceConnectorJsonUnmarshaller implements Unmarshaller<VoiceConnector, JsonUnmarshallerContext> {

    public VoiceConnector unmarshall(JsonUnmarshallerContext context) throws Exception {
        VoiceConnector voiceConnector = new VoiceConnector();

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
                if (context.testExpression("VoiceConnectorId", targetDepth)) {
                    context.nextToken();
                    voiceConnector.setVoiceConnectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    voiceConnector.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutboundHostName", targetDepth)) {
                    context.nextToken();
                    voiceConnector.setOutboundHostName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequireEncryption", targetDepth)) {
                    context.nextToken();
                    voiceConnector.setRequireEncryption(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    voiceConnector.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    voiceConnector.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return voiceConnector;
    }

    private static VoiceConnectorJsonUnmarshaller instance;

    public static VoiceConnectorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VoiceConnectorJsonUnmarshaller();
        return instance;
    }
}
