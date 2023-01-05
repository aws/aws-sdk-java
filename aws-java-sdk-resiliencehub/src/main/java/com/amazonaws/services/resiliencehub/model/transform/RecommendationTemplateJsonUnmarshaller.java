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
 * RecommendationTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationTemplateJsonUnmarshaller implements Unmarshaller<RecommendationTemplate, JsonUnmarshallerContext> {

    public RecommendationTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommendationTemplate recommendationTemplate = new RecommendationTemplate();

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
                if (context.testExpression("appArn", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentArn", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setAssessmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("format", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("needsReplacements", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setNeedsReplacements(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("recommendationIds", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setRecommendationIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("recommendationTemplateArn", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setRecommendationTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendationTypes", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setRecommendationTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("templatesLocation", targetDepth)) {
                    context.nextToken();
                    recommendationTemplate.setTemplatesLocation(S3LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recommendationTemplate;
    }

    private static RecommendationTemplateJsonUnmarshaller instance;

    public static RecommendationTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationTemplateJsonUnmarshaller();
        return instance;
    }
}
