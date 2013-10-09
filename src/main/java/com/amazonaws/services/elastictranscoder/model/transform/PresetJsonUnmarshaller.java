/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elastictranscoder.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Preset JSON Unmarshaller
 */
public class PresetJsonUnmarshaller implements Unmarshaller<Preset, JsonUnmarshallerContext> {

    

    public Preset unmarshall(JsonUnmarshallerContext context) throws Exception {
        Preset preset = new Preset();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    preset.setId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    preset.setName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    preset.setDescription(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Container", targetDepth)) {
                    context.nextToken();
                    preset.setContainer(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Audio", targetDepth)) {
                    context.nextToken();
                    preset.setAudio(AudioParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Video", targetDepth)) {
                    context.nextToken();
                    preset.setVideo(VideoParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Thumbnails", targetDepth)) {
                    context.nextToken();
                    preset.setThumbnails(ThumbnailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    preset.setType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return preset;
    }

    private static PresetJsonUnmarshaller instance;
    public static PresetJsonUnmarshaller getInstance() {
        if (instance == null) instance = new PresetJsonUnmarshaller();
        return instance;
    }
}
    