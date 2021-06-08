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
package com.amazonaws.services.codeguruprofiler.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codeguruprofiler.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Recommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJsonUnmarshaller implements Unmarshaller<Recommendation, JsonUnmarshallerContext> {

    public Recommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Recommendation recommendation = new Recommendation();

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
                if (context.testExpression("allMatchesCount", targetDepth)) {
                    context.nextToken();
                    recommendation.setAllMatchesCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("allMatchesSum", targetDepth)) {
                    context.nextToken();
                    recommendation.setAllMatchesSum(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    recommendation.setEndTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("pattern", targetDepth)) {
                    context.nextToken();
                    recommendation.setPattern(PatternJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    recommendation.setStartTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("topMatches", targetDepth)) {
                    context.nextToken();
                    recommendation.setTopMatches(new ListUnmarshaller<Match>(MatchJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recommendation;
    }

    private static RecommendationJsonUnmarshaller instance;

    public static RecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationJsonUnmarshaller();
        return instance;
    }
}
