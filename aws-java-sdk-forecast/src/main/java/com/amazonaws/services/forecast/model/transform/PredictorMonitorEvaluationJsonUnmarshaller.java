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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PredictorMonitorEvaluation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictorMonitorEvaluationJsonUnmarshaller implements Unmarshaller<PredictorMonitorEvaluation, JsonUnmarshallerContext> {

    public PredictorMonitorEvaluation unmarshall(JsonUnmarshallerContext context) throws Exception {
        PredictorMonitorEvaluation predictorMonitorEvaluation = new PredictorMonitorEvaluation();

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
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonitorArn", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setMonitorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationTime", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setEvaluationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EvaluationState", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setEvaluationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WindowStartDatetime", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setWindowStartDatetime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("WindowEndDatetime", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setWindowEndDatetime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PredictorEvent", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setPredictorEvent(PredictorEventJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MonitorDataSource", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setMonitorDataSource(MonitorDataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MetricResults", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setMetricResults(new ListUnmarshaller<MetricResult>(MetricResultJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NumItemsEvaluated", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setNumItemsEvaluated(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    predictorMonitorEvaluation.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return predictorMonitorEvaluation;
    }

    private static PredictorMonitorEvaluationJsonUnmarshaller instance;

    public static PredictorMonitorEvaluationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PredictorMonitorEvaluationJsonUnmarshaller();
        return instance;
    }
}
