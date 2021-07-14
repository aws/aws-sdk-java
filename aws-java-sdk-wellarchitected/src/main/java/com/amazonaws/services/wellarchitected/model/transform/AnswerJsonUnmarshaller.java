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
 * Answer JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnswerJsonUnmarshaller implements Unmarshaller<Answer, JsonUnmarshallerContext> {

    public Answer unmarshall(JsonUnmarshallerContext context) throws Exception {
        Answer answer = new Answer();

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
                    answer.setQuestionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PillarId", targetDepth)) {
                    context.nextToken();
                    answer.setPillarId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionTitle", targetDepth)) {
                    context.nextToken();
                    answer.setQuestionTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionDescription", targetDepth)) {
                    context.nextToken();
                    answer.setQuestionDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImprovementPlanUrl", targetDepth)) {
                    context.nextToken();
                    answer.setImprovementPlanUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HelpfulResourceUrl", targetDepth)) {
                    context.nextToken();
                    answer.setHelpfulResourceUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Choices", targetDepth)) {
                    context.nextToken();
                    answer.setChoices(new ListUnmarshaller<Choice>(ChoiceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SelectedChoices", targetDepth)) {
                    context.nextToken();
                    answer.setSelectedChoices(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ChoiceAnswers", targetDepth)) {
                    context.nextToken();
                    answer.setChoiceAnswers(new ListUnmarshaller<ChoiceAnswer>(ChoiceAnswerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IsApplicable", targetDepth)) {
                    context.nextToken();
                    answer.setIsApplicable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Risk", targetDepth)) {
                    context.nextToken();
                    answer.setRisk(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Notes", targetDepth)) {
                    context.nextToken();
                    answer.setNotes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Reason", targetDepth)) {
                    context.nextToken();
                    answer.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return answer;
    }

    private static AnswerJsonUnmarshaller instance;

    public static AnswerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnswerJsonUnmarshaller();
        return instance;
    }
}
