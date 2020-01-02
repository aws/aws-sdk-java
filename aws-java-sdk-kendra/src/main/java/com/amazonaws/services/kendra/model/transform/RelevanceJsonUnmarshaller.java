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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Relevance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelevanceJsonUnmarshaller implements Unmarshaller<Relevance, JsonUnmarshallerContext> {

    public Relevance unmarshall(JsonUnmarshallerContext context) throws Exception {
        Relevance relevance = new Relevance();

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
                if (context.testExpression("Freshness", targetDepth)) {
                    context.nextToken();
                    relevance.setFreshness(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Importance", targetDepth)) {
                    context.nextToken();
                    relevance.setImportance(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    relevance.setDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RankOrder", targetDepth)) {
                    context.nextToken();
                    relevance.setRankOrder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ValueImportanceMap", targetDepth)) {
                    context.nextToken();
                    relevance.setValueImportanceMap(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
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

        return relevance;
    }

    private static RelevanceJsonUnmarshaller instance;

    public static RelevanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelevanceJsonUnmarshaller();
        return instance;
    }
}
