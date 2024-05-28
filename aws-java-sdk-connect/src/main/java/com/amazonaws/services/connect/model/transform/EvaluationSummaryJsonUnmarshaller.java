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
 * EvaluationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationSummaryJsonUnmarshaller implements Unmarshaller<EvaluationSummary, JsonUnmarshallerContext> {

    public EvaluationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        EvaluationSummary evaluationSummary = new EvaluationSummary();

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
                    evaluationSummary.setEvaluationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationArn", targetDepth)) {
                    context.nextToken();
                    evaluationSummary.setEvaluationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationFormTitle", targetDepth)) {
                    context.nextToken();
                    evaluationSummary.setEvaluationFormTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationFormId", targetDepth)) {
                    context.nextToken();
                    evaluationSummary.setEvaluationFormId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    evaluationSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluatorArn", targetDepth)) {
                    context.nextToken();
                    evaluationSummary.setEvaluatorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Score", targetDepth)) {
                    context.nextToken();
                    evaluationSummary.setScore(EvaluationScoreJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    evaluationSummary.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    evaluationSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return evaluationSummary;
    }

    private static EvaluationSummaryJsonUnmarshaller instance;

    public static EvaluationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationSummaryJsonUnmarshaller();
        return instance;
    }
}
