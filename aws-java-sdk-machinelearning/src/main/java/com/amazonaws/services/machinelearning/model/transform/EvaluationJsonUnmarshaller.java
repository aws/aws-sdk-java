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
package com.amazonaws.services.machinelearning.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Evaluation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationJsonUnmarshaller implements Unmarshaller<Evaluation, JsonUnmarshallerContext> {

    public Evaluation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Evaluation evaluation = new Evaluation();

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
                if (context.testExpression("EvaluationId", targetDepth)) {
                    context.nextToken();
                    evaluation.setEvaluationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MLModelId", targetDepth)) {
                    context.nextToken();
                    evaluation.setMLModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationDataSourceId", targetDepth)) {
                    context.nextToken();
                    evaluation.setEvaluationDataSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputDataLocationS3", targetDepth)) {
                    context.nextToken();
                    evaluation.setInputDataLocationS3(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedByIamUser", targetDepth)) {
                    context.nextToken();
                    evaluation.setCreatedByIamUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    evaluation.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    evaluation.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    evaluation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    evaluation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PerformanceMetrics", targetDepth)) {
                    context.nextToken();
                    evaluation.setPerformanceMetrics(PerformanceMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    evaluation.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeTime", targetDepth)) {
                    context.nextToken();
                    evaluation.setComputeTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FinishedAt", targetDepth)) {
                    context.nextToken();
                    evaluation.setFinishedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    context.nextToken();
                    evaluation.setStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return evaluation;
    }

    private static EvaluationJsonUnmarshaller instance;

    public static EvaluationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationJsonUnmarshaller();
        return instance;
    }
}
