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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeRecipeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecipeResultJsonUnmarshaller implements Unmarshaller<DescribeRecipeResult, JsonUnmarshallerContext> {

    public DescribeRecipeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeRecipeResult describeRecipeResult = new DescribeRecipeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeRecipeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setCreateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ProjectName", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublishedBy", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setPublishedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublishedDate", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setPublishedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Steps", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setSteps(new ListUnmarshaller<RecipeStep>(RecipeStepJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecipeVersion", targetDepth)) {
                    context.nextToken();
                    describeRecipeResult.setRecipeVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeRecipeResult;
    }

    private static DescribeRecipeResultJsonUnmarshaller instance;

    public static DescribeRecipeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRecipeResultJsonUnmarshaller();
        return instance;
    }
}
