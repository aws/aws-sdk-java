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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EvaluatedRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluatedRuleJsonUnmarshaller implements Unmarshaller<EvaluatedRule, JsonUnmarshallerContext> {

    public EvaluatedRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        EvaluatedRule evaluatedRule = new EvaluatedRule();

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
                if (context.testExpression("ruleId", targetDepth)) {
                    context.nextToken();
                    evaluatedRule.setRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ruleVersion", targetDepth)) {
                    context.nextToken();
                    evaluatedRule.setRuleVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expression", targetDepth)) {
                    context.nextToken();
                    evaluatedRule.setExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expressionWithValues", targetDepth)) {
                    context.nextToken();
                    evaluatedRule.setExpressionWithValues(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outcomes", targetDepth)) {
                    context.nextToken();
                    evaluatedRule.setOutcomes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("evaluated", targetDepth)) {
                    context.nextToken();
                    evaluatedRule.setEvaluated(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("matched", targetDepth)) {
                    context.nextToken();
                    evaluatedRule.setMatched(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return evaluatedRule;
    }

    private static EvaluatedRuleJsonUnmarshaller instance;

    public static EvaluatedRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluatedRuleJsonUnmarshaller();
        return instance;
    }
}
