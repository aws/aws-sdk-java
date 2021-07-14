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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnswerSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnswerSummaryJsonUnmarshaller implements Unmarshaller<AnswerSummary, JsonUnmarshallerContext> {

    public AnswerSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnswerSummary answerSummary = new AnswerSummary();

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
                    answerSummary.setQuestionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PillarId", targetDepth)) {
                    context.nextToken();
                    answerSummary.setPillarId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionTitle", targetDepth)) {
                    context.nextToken();
                    answerSummary.setQuestionTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Choices", targetDepth)) {
                    context.nextToken();
                    answerSummary.setChoices(new ListUnmarshaller<Choice>(ChoiceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SelectedChoices", targetDepth)) {
                    context.nextToken();
                    answerSummary.setSelectedChoices(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ChoiceAnswerSummaries", targetDepth)) {
                    context.nextToken();
                    answerSummary.setChoiceAnswerSummaries(new ListUnmarshaller<ChoiceAnswerSummary>(ChoiceAnswerSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IsApplicable", targetDepth)) {
                    context.nextToken();
                    answerSummary.setIsApplicable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Risk", targetDepth)) {
                    context.nextToken();
                    answerSummary.setRisk(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Reason", targetDepth)) {
                    context.nextToken();
                    answerSummary.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return answerSummary;
    }

    private static AnswerSummaryJsonUnmarshaller instance;

    public static AnswerSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnswerSummaryJsonUnmarshaller();
        return instance;
    }
}
