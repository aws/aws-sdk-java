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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AggregatedUtterancesSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregatedUtterancesSummaryJsonUnmarshaller implements Unmarshaller<AggregatedUtterancesSummary, JsonUnmarshallerContext> {

    public AggregatedUtterancesSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AggregatedUtterancesSummary aggregatedUtterancesSummary = new AggregatedUtterancesSummary();

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
                if (context.testExpression("utterance", targetDepth)) {
                    context.nextToken();
                    aggregatedUtterancesSummary.setUtterance(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hitCount", targetDepth)) {
                    context.nextToken();
                    aggregatedUtterancesSummary.setHitCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("missedCount", targetDepth)) {
                    context.nextToken();
                    aggregatedUtterancesSummary.setMissedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("utteranceFirstRecordedInAggregationDuration", targetDepth)) {
                    context.nextToken();
                    aggregatedUtterancesSummary.setUtteranceFirstRecordedInAggregationDuration(DateJsonUnmarshallerFactory.getInstance("unixTimestamp")
                            .unmarshall(context));
                }
                if (context.testExpression("utteranceLastRecordedInAggregationDuration", targetDepth)) {
                    context.nextToken();
                    aggregatedUtterancesSummary.setUtteranceLastRecordedInAggregationDuration(DateJsonUnmarshallerFactory.getInstance("unixTimestamp")
                            .unmarshall(context));
                }
                if (context.testExpression("containsDataFromDeletedResources", targetDepth)) {
                    context.nextToken();
                    aggregatedUtterancesSummary.setContainsDataFromDeletedResources(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return aggregatedUtterancesSummary;
    }

    private static AggregatedUtterancesSummaryJsonUnmarshaller instance;

    public static AggregatedUtterancesSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AggregatedUtterancesSummaryJsonUnmarshaller();
        return instance;
    }
}
