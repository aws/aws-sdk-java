/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcontactlens.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connectcontactlens.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Transcript JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptJsonUnmarshaller implements Unmarshaller<Transcript, JsonUnmarshallerContext> {

    public Transcript unmarshall(JsonUnmarshallerContext context) throws Exception {
        Transcript transcript = new Transcript();

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
                    transcript.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParticipantId", targetDepth)) {
                    context.nextToken();
                    transcript.setParticipantId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParticipantRole", targetDepth)) {
                    context.nextToken();
                    transcript.setParticipantRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    transcript.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BeginOffsetMillis", targetDepth)) {
                    context.nextToken();
                    transcript.setBeginOffsetMillis(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EndOffsetMillis", targetDepth)) {
                    context.nextToken();
                    transcript.setEndOffsetMillis(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Sentiment", targetDepth)) {
                    context.nextToken();
                    transcript.setSentiment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IssuesDetected", targetDepth)) {
                    context.nextToken();
                    transcript.setIssuesDetected(new ListUnmarshaller<IssueDetected>(IssueDetectedJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return transcript;
    }

    private static TranscriptJsonUnmarshaller instance;

    public static TranscriptJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptJsonUnmarshaller();
        return instance;
    }
}
