/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EventPredictionSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventPredictionSummaryJsonUnmarshaller implements Unmarshaller<EventPredictionSummary, JsonUnmarshallerContext> {

    public EventPredictionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventPredictionSummary eventPredictionSummary = new EventPredictionSummary();

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
                if (context.testExpression("eventId", targetDepth)) {
                    context.nextToken();
                    eventPredictionSummary.setEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventTypeName", targetDepth)) {
                    context.nextToken();
                    eventPredictionSummary.setEventTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventTimestamp", targetDepth)) {
                    context.nextToken();
                    eventPredictionSummary.setEventTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("predictionTimestamp", targetDepth)) {
                    context.nextToken();
                    eventPredictionSummary.setPredictionTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorId", targetDepth)) {
                    context.nextToken();
                    eventPredictionSummary.setDetectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorVersionId", targetDepth)) {
                    context.nextToken();
                    eventPredictionSummary.setDetectorVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eventPredictionSummary;
    }

    private static EventPredictionSummaryJsonUnmarshaller instance;

    public static EventPredictionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventPredictionSummaryJsonUnmarshaller();
        return instance;
    }
}
