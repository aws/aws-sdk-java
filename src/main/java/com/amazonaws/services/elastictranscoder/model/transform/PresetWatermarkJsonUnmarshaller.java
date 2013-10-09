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
 * Preset Watermark JSON Unmarshaller
 */
public class PresetWatermarkJsonUnmarshaller implements Unmarshaller<PresetWatermark, JsonUnmarshallerContext> {

    

    public PresetWatermark unmarshall(JsonUnmarshallerContext context) throws Exception {
        PresetWatermark presetWatermark = new PresetWatermark();

        
        
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
                    presetWatermark.setId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxWidth", targetDepth)) {
                    context.nextToken();
                    presetWatermark.setMaxWidth(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxHeight", targetDepth)) {
                    context.nextToken();
                    presetWatermark.setMaxHeight(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SizingPolicy", targetDepth)) {
                    context.nextToken();
                    presetWatermark.setSizingPolicy(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HorizontalAlign", targetDepth)) {
                    context.nextToken();
                    presetWatermark.setHorizontalAlign(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HorizontalOffset", targetDepth)) {
                    context.nextToken();
                    presetWatermark.setHorizontalOffset(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VerticalAlign", targetDepth)) {
                    context.nextToken();
                    presetWatermark.setVerticalAlign(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VerticalOffset", targetDepth)) {
                    context.nextToken();
                    presetWatermark.setVerticalOffset(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Opacity", targetDepth)) {
                    context.nextToken();
                    presetWatermark.setOpacity(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Target", targetDepth)) {
                    context.nextToken();
                    presetWatermark.setTarget(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return presetWatermark;
    }

    private static PresetWatermarkJsonUnmarshaller instance;
    public static PresetWatermarkJsonUnmarshaller getInstance() {
        if (instance == null) instance = new PresetWatermarkJsonUnmarshaller();
        return instance;
    }
}
    