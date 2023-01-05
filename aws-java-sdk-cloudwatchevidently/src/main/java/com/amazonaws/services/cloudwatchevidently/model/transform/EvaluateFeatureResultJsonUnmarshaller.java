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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevidently.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EvaluateFeatureResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateFeatureResultJsonUnmarshaller implements Unmarshaller<EvaluateFeatureResult, JsonUnmarshallerContext> {

    public EvaluateFeatureResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        EvaluateFeatureResult evaluateFeatureResult = new EvaluateFeatureResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return evaluateFeatureResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("details", targetDepth)) {
                    context.nextToken();
                    evaluateFeatureResult.setDetails(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE).unmarshall(
                            context));
                }
                if (context.testExpression("reason", targetDepth)) {
                    context.nextToken();
                    evaluateFeatureResult.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("value", targetDepth)) {
                    context.nextToken();
                    evaluateFeatureResult.setValue(VariableValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("variation", targetDepth)) {
                    context.nextToken();
                    evaluateFeatureResult.setVariation(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return evaluateFeatureResult;
    }

    private static EvaluateFeatureResultJsonUnmarshaller instance;

    public static EvaluateFeatureResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluateFeatureResultJsonUnmarshaller();
        return instance;
    }
}
