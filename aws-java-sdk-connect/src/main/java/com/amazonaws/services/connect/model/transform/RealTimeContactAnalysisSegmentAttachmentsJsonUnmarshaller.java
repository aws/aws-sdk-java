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
 * RealTimeContactAnalysisSegmentAttachments JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisSegmentAttachmentsJsonUnmarshaller implements
        Unmarshaller<RealTimeContactAnalysisSegmentAttachments, JsonUnmarshallerContext> {

    public RealTimeContactAnalysisSegmentAttachments unmarshall(JsonUnmarshallerContext context) throws Exception {
        RealTimeContactAnalysisSegmentAttachments realTimeContactAnalysisSegmentAttachments = new RealTimeContactAnalysisSegmentAttachments();

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
                    realTimeContactAnalysisSegmentAttachments.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParticipantId", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentAttachments.setParticipantId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParticipantRole", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentAttachments.setParticipantRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentAttachments.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attachments", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentAttachments.setAttachments(new ListUnmarshaller<RealTimeContactAnalysisAttachment>(
                            RealTimeContactAnalysisAttachmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Time", targetDepth)) {
                    context.nextToken();
                    realTimeContactAnalysisSegmentAttachments.setTime(RealTimeContactAnalysisTimeDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return realTimeContactAnalysisSegmentAttachments;
    }

    private static RealTimeContactAnalysisSegmentAttachmentsJsonUnmarshaller instance;

    public static RealTimeContactAnalysisSegmentAttachmentsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentAttachmentsJsonUnmarshaller();
        return instance;
    }
}
