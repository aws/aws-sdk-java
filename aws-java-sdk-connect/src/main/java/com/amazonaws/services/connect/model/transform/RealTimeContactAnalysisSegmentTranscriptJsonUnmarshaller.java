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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RealTimeContactAnalysisSegmentTranscript JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisSegmentTranscriptJsonUnmarshaller implements
        Unmarshaller<RealTimeContactAnalysisSegmentTranscript, JsonUnmarshallerContext> {

    public RealTimeContactAnalysisSegmentTranscript unmarshall(JsonUnmarshallerContext context) throws Exception {
        RealTimeContactAnalysisSegmentTranscript realTimeContactAnalysisSegmentTranscript = new RealTimeContactAnalysisSegmentTranscript();

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
                    realTimeContactAnalysisSegmentTranscript.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParticipantId", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentTranscript.setParticipantId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParticipantRole", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentTranscript.setParticipantRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentTranscript.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentTranscript.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentType", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentTranscript.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Time", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentTranscript.setTime(RealTimeContactAnalysisTimeDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Redaction", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentTranscript.setRedaction(RealTimeContactAnalysisTranscriptItemRedactionJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Sentiment", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentTranscript.setSentiment(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return realTimeContactAnalysisSegmentTranscript;
    }

    private static RealTimeContactAnalysisSegmentTranscriptJsonUnmarshaller instance;

    public static RealTimeContactAnalysisSegmentTranscriptJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentTranscriptJsonUnmarshaller();
        return instance;
    }
}
