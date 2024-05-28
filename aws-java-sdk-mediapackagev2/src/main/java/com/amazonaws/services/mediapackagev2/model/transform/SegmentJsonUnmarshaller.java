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
package com.amazonaws.services.mediapackagev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackagev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Segment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentJsonUnmarshaller implements Unmarshaller<Segment, JsonUnmarshallerContext> {

    public Segment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Segment segment = new Segment();

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
                if (context.testExpression("SegmentDurationSeconds", targetDepth)) {
                    context.nextToken();
                    segment.setSegmentDurationSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentName", targetDepth)) {
                    context.nextToken();
                    segment.setSegmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TsUseAudioRenditionGroup", targetDepth)) {
                    context.nextToken();
                    segment.setTsUseAudioRenditionGroup(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeIframeOnlyStreams", targetDepth)) {
                    context.nextToken();
                    segment.setIncludeIframeOnlyStreams(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TsIncludeDvbSubtitles", targetDepth)) {
                    context.nextToken();
                    segment.setTsIncludeDvbSubtitles(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Scte", targetDepth)) {
                    context.nextToken();
                    segment.setScte(ScteJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Encryption", targetDepth)) {
                    context.nextToken();
                    segment.setEncryption(EncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return segment;
    }

    private static SegmentJsonUnmarshaller instance;

    public static SegmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SegmentJsonUnmarshaller();
        return instance;
    }
}
