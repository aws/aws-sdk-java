/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TrialComponentMetricSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponentMetricSummaryJsonUnmarshaller implements Unmarshaller<TrialComponentMetricSummary, JsonUnmarshallerContext> {

    public TrialComponentMetricSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        TrialComponentMetricSummary trialComponentMetricSummary = new TrialComponentMetricSummary();

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
                if (context.testExpression("MetricName", targetDepth)) {
                    context.nextToken();
                    trialComponentMetricSummary.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceArn", targetDepth)) {
                    context.nextToken();
                    trialComponentMetricSummary.setSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeStamp", targetDepth)) {
                    context.nextToken();
                    trialComponentMetricSummary.setTimeStamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Max", targetDepth)) {
                    context.nextToken();
                    trialComponentMetricSummary.setMax(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Min", targetDepth)) {
                    context.nextToken();
                    trialComponentMetricSummary.setMin(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Last", targetDepth)) {
                    context.nextToken();
                    trialComponentMetricSummary.setLast(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Count", targetDepth)) {
                    context.nextToken();
                    trialComponentMetricSummary.setCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Avg", targetDepth)) {
                    context.nextToken();
                    trialComponentMetricSummary.setAvg(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("StdDev", targetDepth)) {
                    context.nextToken();
                    trialComponentMetricSummary.setStdDev(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return trialComponentMetricSummary;
    }

    private static TrialComponentMetricSummaryJsonUnmarshaller instance;

    public static TrialComponentMetricSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentMetricSummaryJsonUnmarshaller();
        return instance;
    }
}
