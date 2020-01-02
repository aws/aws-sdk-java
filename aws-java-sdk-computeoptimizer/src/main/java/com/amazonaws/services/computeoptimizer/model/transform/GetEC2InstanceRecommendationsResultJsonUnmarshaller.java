/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.computeoptimizer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetEC2InstanceRecommendationsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEC2InstanceRecommendationsResultJsonUnmarshaller implements Unmarshaller<GetEC2InstanceRecommendationsResult, JsonUnmarshallerContext> {

    public GetEC2InstanceRecommendationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEC2InstanceRecommendationsResult getEC2InstanceRecommendationsResult = new GetEC2InstanceRecommendationsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEC2InstanceRecommendationsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    getEC2InstanceRecommendationsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceRecommendations", targetDepth)) {
                    context.nextToken();
                    getEC2InstanceRecommendationsResult.setInstanceRecommendations(new ListUnmarshaller<InstanceRecommendation>(
                            InstanceRecommendationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("errors", targetDepth)) {
                    context.nextToken();
                    getEC2InstanceRecommendationsResult.setErrors(new ListUnmarshaller<GetRecommendationError>(GetRecommendationErrorJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEC2InstanceRecommendationsResult;
    }

    private static GetEC2InstanceRecommendationsResultJsonUnmarshaller instance;

    public static GetEC2InstanceRecommendationsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEC2InstanceRecommendationsResultJsonUnmarshaller();
        return instance;
    }
}
