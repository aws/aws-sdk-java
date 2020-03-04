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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateRecommenderConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRecommenderConfigurationJsonUnmarshaller implements Unmarshaller<UpdateRecommenderConfiguration, JsonUnmarshallerContext> {

    public UpdateRecommenderConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateRecommenderConfiguration updateRecommenderConfiguration = new UpdateRecommenderConfiguration();

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
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    updateRecommenderConfiguration.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    updateRecommenderConfiguration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    updateRecommenderConfiguration.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationProviderIdType", targetDepth)) {
                    context.nextToken();
                    updateRecommenderConfiguration.setRecommendationProviderIdType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationProviderRoleArn", targetDepth)) {
                    context.nextToken();
                    updateRecommenderConfiguration.setRecommendationProviderRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationProviderUri", targetDepth)) {
                    context.nextToken();
                    updateRecommenderConfiguration.setRecommendationProviderUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationTransformerUri", targetDepth)) {
                    context.nextToken();
                    updateRecommenderConfiguration.setRecommendationTransformerUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationsDisplayName", targetDepth)) {
                    context.nextToken();
                    updateRecommenderConfiguration.setRecommendationsDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationsPerMessage", targetDepth)) {
                    context.nextToken();
                    updateRecommenderConfiguration.setRecommendationsPerMessage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateRecommenderConfiguration;
    }

    private static UpdateRecommenderConfigurationJsonUnmarshaller instance;

    public static UpdateRecommenderConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateRecommenderConfigurationJsonUnmarshaller();
        return instance;
    }
}
