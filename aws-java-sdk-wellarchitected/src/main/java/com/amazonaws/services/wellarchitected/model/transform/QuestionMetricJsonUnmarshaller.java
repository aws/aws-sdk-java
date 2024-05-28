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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * QuestionMetric JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuestionMetricJsonUnmarshaller implements Unmarshaller<QuestionMetric, JsonUnmarshallerContext> {

    public QuestionMetric unmarshall(JsonUnmarshallerContext context) throws Exception {
        QuestionMetric questionMetric = new QuestionMetric();

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
                if (context.testExpression("QuestionId", targetDepth)) {
                    context.nextToken();
                    questionMetric.setQuestionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Risk", targetDepth)) {
                    context.nextToken();
                    questionMetric.setRisk(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BestPractices", targetDepth)) {
                    context.nextToken();
                    questionMetric.setBestPractices(new ListUnmarshaller<BestPractice>(BestPracticeJsonUnmarshaller.getInstance())

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

        return questionMetric;
    }

    private static QuestionMetricJsonUnmarshaller instance;

    public static QuestionMetricJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QuestionMetricJsonUnmarshaller();
        return instance;
    }
}
