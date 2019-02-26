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
 * Mp4Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mp4SettingsJsonUnmarshaller implements Unmarshaller<Mp4Settings, JsonUnmarshallerContext> {

    public Mp4Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Mp4Settings mp4Settings = new Mp4Settings();

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
                if (context.testExpression("cslgAtom", targetDepth)) {
                    context.nextToken();
                    mp4Settings.setCslgAtom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("freeSpaceBox", targetDepth)) {
                    context.nextToken();
                    mp4Settings.setFreeSpaceBox(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("moovPlacement", targetDepth)) {
                    context.nextToken();
                    mp4Settings.setMoovPlacement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mp4MajorBrand", targetDepth)) {
                    context.nextToken();
                    mp4Settings.setMp4MajorBrand(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mp4Settings;
    }

    private static Mp4SettingsJsonUnmarshaller instance;

    public static Mp4SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Mp4SettingsJsonUnmarshaller();
        return instance;
    }
}
