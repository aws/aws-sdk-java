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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Scte20SourceSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte20SourceSettingsJsonUnmarshaller implements Unmarshaller<Scte20SourceSettings, JsonUnmarshallerContext> {

    public Scte20SourceSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Scte20SourceSettings scte20SourceSettings = new Scte20SourceSettings();

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
                if (context.testExpression("convert608To708", targetDepth)) {
                    context.nextToken();
                    scte20SourceSettings.setConvert608To708(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("source608ChannelNumber", targetDepth)) {
                    context.nextToken();
                    scte20SourceSettings.setSource608ChannelNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scte20SourceSettings;
    }

    private static Scte20SourceSettingsJsonUnmarshaller instance;

    public static Scte20SourceSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Scte20SourceSettingsJsonUnmarshaller();
        return instance;
    }
}
