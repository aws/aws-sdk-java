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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobOutput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobOutputJsonUnmarshaller implements Unmarshaller<JobOutput, JsonUnmarshallerContext> {

    public JobOutput unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobOutput jobOutput = new JobOutput();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    jobOutput.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Key", targetDepth)) {
                    context.nextToken();
                    jobOutput.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThumbnailPattern", targetDepth)) {
                    context.nextToken();
                    jobOutput.setThumbnailPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThumbnailEncryption", targetDepth)) {
                    context.nextToken();
                    jobOutput.setThumbnailEncryption(EncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Rotate", targetDepth)) {
                    context.nextToken();
                    jobOutput.setRotate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PresetId", targetDepth)) {
                    context.nextToken();
                    jobOutput.setPresetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SegmentDuration", targetDepth)) {
                    context.nextToken();
                    jobOutput.setSegmentDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    jobOutput.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetail", targetDepth)) {
                    context.nextToken();
                    jobOutput.setStatusDetail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    jobOutput.setDuration(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Width", targetDepth)) {
                    context.nextToken();
                    jobOutput.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Height", targetDepth)) {
                    context.nextToken();
                    jobOutput.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FrameRate", targetDepth)) {
                    context.nextToken();
                    jobOutput.setFrameRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSize", targetDepth)) {
                    context.nextToken();
                    jobOutput.setFileSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DurationMillis", targetDepth)) {
                    context.nextToken();
                    jobOutput.setDurationMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Watermarks", targetDepth)) {
                    context.nextToken();
                    jobOutput.setWatermarks(new ListUnmarshaller<JobWatermark>(JobWatermarkJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("AlbumArt", targetDepth)) {
                    context.nextToken();
                    jobOutput.setAlbumArt(JobAlbumArtJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Composition", targetDepth)) {
                    context.nextToken();
                    jobOutput.setComposition(new ListUnmarshaller<Clip>(ClipJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Captions", targetDepth)) {
                    context.nextToken();
                    jobOutput.setCaptions(CaptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Encryption", targetDepth)) {
                    context.nextToken();
                    jobOutput.setEncryption(EncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AppliedColorSpaceConversion", targetDepth)) {
                    context.nextToken();
                    jobOutput.setAppliedColorSpaceConversion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobOutput;
    }

    private static JobOutputJsonUnmarshaller instance;

    public static JobOutputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobOutputJsonUnmarshaller();
        return instance;
    }
}
