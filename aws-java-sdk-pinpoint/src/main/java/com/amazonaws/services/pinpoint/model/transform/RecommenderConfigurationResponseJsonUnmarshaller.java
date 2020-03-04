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
 * RecommenderConfigurationResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommenderConfigurationResponseJsonUnmarshaller implements Unmarshaller<RecommenderConfigurationResponse, JsonUnmarshallerContext> {

    public RecommenderConfigurationResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommenderConfigurationResponse recommenderConfigurationResponse = new RecommenderConfigurationResponse();

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
                    recommenderConfigurationResponse.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationProviderIdType", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setRecommendationProviderIdType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationProviderRoleArn", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setRecommendationProviderRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationProviderUri", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setRecommendationProviderUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationTransformerUri", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setRecommendationTransformerUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationsDisplayName", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setRecommendationsDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationsPerMessage", targetDepth)) {
                    context.nextToken();
                    recommenderConfigurationResponse.setRecommendationsPerMessage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recommenderConfigurationResponse;
    }

    private static RecommenderConfigurationResponseJsonUnmarshaller instance;

    public static RecommenderConfigurationResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommenderConfigurationResponseJsonUnmarshaller();
        return instance;
    }
}
