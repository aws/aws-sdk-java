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
 * ReviewTemplateAnswerSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewTemplateAnswerSummaryJsonUnmarshaller implements Unmarshaller<ReviewTemplateAnswerSummary, JsonUnmarshallerContext> {

    public ReviewTemplateAnswerSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReviewTemplateAnswerSummary reviewTemplateAnswerSummary = new ReviewTemplateAnswerSummary();

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
                    reviewTemplateAnswerSummary.setQuestionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PillarId", targetDepth)) {
                    context.nextToken();
                    reviewTemplateAnswerSummary.setPillarId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionTitle", targetDepth)) {
                    context.nextToken();
                    reviewTemplateAnswerSummary.setQuestionTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Choices", targetDepth)) {
                    context.nextToken();
                    reviewTemplateAnswerSummary.setChoices(new ListUnmarshaller<Choice>(ChoiceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SelectedChoices", targetDepth)) {
                    context.nextToken();
                    reviewTemplateAnswerSummary.setSelectedChoices(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ChoiceAnswerSummaries", targetDepth)) {
                    context.nextToken();
                    reviewTemplateAnswerSummary.setChoiceAnswerSummaries(new ListUnmarshaller<ChoiceAnswerSummary>(ChoiceAnswerSummaryJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IsApplicable", targetDepth)) {
                    context.nextToken();
                    reviewTemplateAnswerSummary.setIsApplicable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AnswerStatus", targetDepth)) {
                    context.nextToken();
                    reviewTemplateAnswerSummary.setAnswerStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Reason", targetDepth)) {
                    context.nextToken();
                    reviewTemplateAnswerSummary.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionType", targetDepth)) {
                    context.nextToken();
                    reviewTemplateAnswerSummary.setQuestionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reviewTemplateAnswerSummary;
    }

    private static ReviewTemplateAnswerSummaryJsonUnmarshaller instance;

    public static ReviewTemplateAnswerSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReviewTemplateAnswerSummaryJsonUnmarshaller();
        return instance;
    }
}
