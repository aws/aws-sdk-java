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
 * Job Output JSON Unmarshaller
 */
public class JobOutputJsonUnmarshaller implements Unmarshaller<JobOutput, JsonUnmarshallerContext> {

    

    public JobOutput unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobOutput jobOutput = new JobOutput();

        
        
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
                    jobOutput.setId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Key", targetDepth)) {
                    context.nextToken();
                    jobOutput.setKey(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ThumbnailPattern", targetDepth)) {
                    context.nextToken();
                    jobOutput.setThumbnailPattern(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Rotate", targetDepth)) {
                    context.nextToken();
                    jobOutput.setRotate(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PresetId", targetDepth)) {
                    context.nextToken();
                    jobOutput.setPresetId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SegmentDuration", targetDepth)) {
                    context.nextToken();
                    jobOutput.setSegmentDuration(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    jobOutput.setStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StatusDetail", targetDepth)) {
                    context.nextToken();
                    jobOutput.setStatusDetail(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    jobOutput.setDuration(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Width", targetDepth)) {
                    context.nextToken();
                    jobOutput.setWidth(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Height", targetDepth)) {
                    context.nextToken();
                    jobOutput.setHeight(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Watermarks", targetDepth)) {
                    jobOutput.setWatermarks(new ListUnmarshaller<JobWatermark>(JobWatermarkJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("AlbumArt", targetDepth)) {
                    context.nextToken();
                    jobOutput.setAlbumArt(JobAlbumArtJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Composition", targetDepth)) {
                    jobOutput.setComposition(new ListUnmarshaller<Clip>(ClipJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return jobOutput;
    }

    private static JobOutputJsonUnmarshaller instance;
    public static JobOutputJsonUnmarshaller getInstance() {
        if (instance == null) instance = new JobOutputJsonUnmarshaller();
        return instance;
    }
}
    