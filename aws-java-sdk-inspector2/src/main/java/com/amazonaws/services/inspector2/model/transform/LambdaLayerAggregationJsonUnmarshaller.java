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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LambdaLayerAggregation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaLayerAggregationJsonUnmarshaller implements Unmarshaller<LambdaLayerAggregation, JsonUnmarshallerContext> {

    public LambdaLayerAggregation unmarshall(JsonUnmarshallerContext context) throws Exception {
        LambdaLayerAggregation lambdaLayerAggregation = new LambdaLayerAggregation();

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
                if (context.testExpression("functionNames", targetDepth)) {
                    context.nextToken();
                    lambdaLayerAggregation.setFunctionNames(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("layerArns", targetDepth)) {
                    context.nextToken();
                    lambdaLayerAggregation.setLayerArns(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceIds", targetDepth)) {
                    context.nextToken();
                    lambdaLayerAggregation.setResourceIds(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("sortBy", targetDepth)) {
                    context.nextToken();
                    lambdaLayerAggregation.setSortBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sortOrder", targetDepth)) {
                    context.nextToken();
                    lambdaLayerAggregation.setSortOrder(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lambdaLayerAggregation;
    }

    private static LambdaLayerAggregationJsonUnmarshaller instance;

    public static LambdaLayerAggregationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LambdaLayerAggregationJsonUnmarshaller();
        return instance;
    }
}
