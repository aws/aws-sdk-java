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
 * ListRealtimeContactAnalysisSegmentsV2Result JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRealtimeContactAnalysisSegmentsV2ResultJsonUnmarshaller implements
        Unmarshaller<ListRealtimeContactAnalysisSegmentsV2Result, JsonUnmarshallerContext> {

    public ListRealtimeContactAnalysisSegmentsV2Result unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRealtimeContactAnalysisSegmentsV2Result listRealtimeContactAnalysisSegmentsV2Result = new ListRealtimeContactAnalysisSegmentsV2Result();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listRealtimeContactAnalysisSegmentsV2Result;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Channel", targetDepth)) {
                    context.nextToken();
                    listRealtimeContactAnalysisSegmentsV2Result.setChannel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    listRealtimeContactAnalysisSegmentsV2Result.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Segments", targetDepth)) {
                    context.nextToken();
                    listRealtimeContactAnalysisSegmentsV2Result.setSegments(new ListUnmarshaller<RealtimeContactAnalysisSegment>(
                            RealtimeContactAnalysisSegmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listRealtimeContactAnalysisSegmentsV2Result.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listRealtimeContactAnalysisSegmentsV2Result;
    }

    private static ListRealtimeContactAnalysisSegmentsV2ResultJsonUnmarshaller instance;

    public static ListRealtimeContactAnalysisSegmentsV2ResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRealtimeContactAnalysisSegmentsV2ResultJsonUnmarshaller();
        return instance;
    }
}
