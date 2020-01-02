/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * VoiceConnectorGroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceConnectorGroupJsonUnmarshaller implements Unmarshaller<VoiceConnectorGroup, JsonUnmarshallerContext> {

    public VoiceConnectorGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        VoiceConnectorGroup voiceConnectorGroup = new VoiceConnectorGroup();

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
                if (context.testExpression("VoiceConnectorGroupId", targetDepth)) {
                    context.nextToken();
                    voiceConnectorGroup.setVoiceConnectorGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    voiceConnectorGroup.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VoiceConnectorItems", targetDepth)) {
                    context.nextToken();
                    voiceConnectorGroup.setVoiceConnectorItems(new ListUnmarshaller<VoiceConnectorItem>(VoiceConnectorItemJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    voiceConnectorGroup.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    voiceConnectorGroup.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return voiceConnectorGroup;
    }

    private static VoiceConnectorGroupJsonUnmarshaller instance;

    public static VoiceConnectorGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VoiceConnectorGroupJsonUnmarshaller();
        return instance;
    }
}
