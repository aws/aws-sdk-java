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
 * ProfileQuestion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileQuestionJsonUnmarshaller implements Unmarshaller<ProfileQuestion, JsonUnmarshallerContext> {

    public ProfileQuestion unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProfileQuestion profileQuestion = new ProfileQuestion();

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
                    profileQuestion.setQuestionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionTitle", targetDepth)) {
                    context.nextToken();
                    profileQuestion.setQuestionTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionDescription", targetDepth)) {
                    context.nextToken();
                    profileQuestion.setQuestionDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionChoices", targetDepth)) {
                    context.nextToken();
                    profileQuestion.setQuestionChoices(new ListUnmarshaller<ProfileChoice>(ProfileChoiceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SelectedChoiceIds", targetDepth)) {
                    context.nextToken();
                    profileQuestion.setSelectedChoiceIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MinSelectedChoices", targetDepth)) {
                    context.nextToken();
                    profileQuestion.setMinSelectedChoices(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxSelectedChoices", targetDepth)) {
                    context.nextToken();
                    profileQuestion.setMaxSelectedChoices(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return profileQuestion;
    }

    private static ProfileQuestionJsonUnmarshaller instance;

    public static ProfileQuestionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProfileQuestionJsonUnmarshaller();
        return instance;
    }
}
