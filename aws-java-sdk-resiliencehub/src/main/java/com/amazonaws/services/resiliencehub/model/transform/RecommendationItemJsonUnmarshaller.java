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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecommendationItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationItemJsonUnmarshaller implements Unmarshaller<RecommendationItem, JsonUnmarshallerContext> {

    public RecommendationItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommendationItem recommendationItem = new RecommendationItem();

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
                if (context.testExpression("alreadyImplemented", targetDepth)) {
                    context.nextToken();
                    recommendationItem.setAlreadyImplemented(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    recommendationItem.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetAccountId", targetDepth)) {
                    context.nextToken();
                    recommendationItem.setTargetAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetRegion", targetDepth)) {
                    context.nextToken();
                    recommendationItem.setTargetRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recommendationItem;
    }

    private static RecommendationItemJsonUnmarshaller instance;

    public static RecommendationItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationItemJsonUnmarshaller();
        return instance;
    }
}
