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
package com.amazonaws.services.personalize.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecommenderSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommenderSummaryJsonUnmarshaller implements Unmarshaller<RecommenderSummary, JsonUnmarshallerContext> {

    public RecommenderSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommenderSummary recommenderSummary = new RecommenderSummary();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    recommenderSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommenderArn", targetDepth)) {
                    context.nextToken();
                    recommenderSummary.setRecommenderArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetGroupArn", targetDepth)) {
                    context.nextToken();
                    recommenderSummary.setDatasetGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recipeArn", targetDepth)) {
                    context.nextToken();
                    recommenderSummary.setRecipeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommenderConfig", targetDepth)) {
                    context.nextToken();
                    recommenderSummary.setRecommenderConfig(RecommenderConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    recommenderSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    recommenderSummary.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    recommenderSummary.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recommenderSummary;
    }

    private static RecommenderSummaryJsonUnmarshaller instance;

    public static RecommenderSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommenderSummaryJsonUnmarshaller();
        return instance;
    }
}
