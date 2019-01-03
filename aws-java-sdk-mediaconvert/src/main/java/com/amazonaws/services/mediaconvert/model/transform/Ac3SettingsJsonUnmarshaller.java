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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Ac3Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ac3SettingsJsonUnmarshaller implements Unmarshaller<Ac3Settings, JsonUnmarshallerContext> {

    public Ac3Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Ac3Settings ac3Settings = new Ac3Settings();

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
                if (context.testExpression("bitrate", targetDepth)) {
                    context.nextToken();
                    ac3Settings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bitstreamMode", targetDepth)) {
                    context.nextToken();
                    ac3Settings.setBitstreamMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codingMode", targetDepth)) {
                    context.nextToken();
                    ac3Settings.setCodingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dialnorm", targetDepth)) {
                    context.nextToken();
                    ac3Settings.setDialnorm(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("dynamicRangeCompressionProfile", targetDepth)) {
                    context.nextToken();
                    ac3Settings.setDynamicRangeCompressionProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lfeFilter", targetDepth)) {
                    context.nextToken();
                    ac3Settings.setLfeFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadataControl", targetDepth)) {
                    context.nextToken();
                    ac3Settings.setMetadataControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleRate", targetDepth)) {
                    context.nextToken();
                    ac3Settings.setSampleRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ac3Settings;
    }

    private static Ac3SettingsJsonUnmarshaller instance;

    public static Ac3SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ac3SettingsJsonUnmarshaller();
        return instance;
    }
}
