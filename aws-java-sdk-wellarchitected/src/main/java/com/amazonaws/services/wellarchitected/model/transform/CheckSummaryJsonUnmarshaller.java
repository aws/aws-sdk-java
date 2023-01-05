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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CheckSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckSummaryJsonUnmarshaller implements Unmarshaller<CheckSummary, JsonUnmarshallerContext> {

    public CheckSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        CheckSummary checkSummary = new CheckSummary();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    checkSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    checkSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Provider", targetDepth)) {
                    context.nextToken();
                    checkSummary.setProvider(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    checkSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    checkSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LensArn", targetDepth)) {
                    context.nextToken();
                    checkSummary.setLensArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PillarId", targetDepth)) {
                    context.nextToken();
                    checkSummary.setPillarId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionId", targetDepth)) {
                    context.nextToken();
                    checkSummary.setQuestionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChoiceId", targetDepth)) {
                    context.nextToken();
                    checkSummary.setChoiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    checkSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountSummary", targetDepth)) {
                    context.nextToken();
                    checkSummary.setAccountSummary(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return checkSummary;
    }

    private static CheckSummaryJsonUnmarshaller instance;

    public static CheckSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CheckSummaryJsonUnmarshaller();
        return instance;
    }
}
