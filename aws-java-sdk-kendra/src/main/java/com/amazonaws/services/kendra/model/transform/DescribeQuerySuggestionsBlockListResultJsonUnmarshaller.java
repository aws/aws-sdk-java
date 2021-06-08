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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeQuerySuggestionsBlockListResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQuerySuggestionsBlockListResultJsonUnmarshaller implements Unmarshaller<DescribeQuerySuggestionsBlockListResult, JsonUnmarshallerContext> {

    public DescribeQuerySuggestionsBlockListResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeQuerySuggestionsBlockListResult describeQuerySuggestionsBlockListResult = new DescribeQuerySuggestionsBlockListResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeQuerySuggestionsBlockListResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IndexId", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setIndexId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SourceS3Path", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setSourceS3Path(S3PathJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ItemCount", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setItemCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FileSizeBytes", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setFileSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeQuerySuggestionsBlockListResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeQuerySuggestionsBlockListResult;
    }

    private static DescribeQuerySuggestionsBlockListResultJsonUnmarshaller instance;

    public static DescribeQuerySuggestionsBlockListResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeQuerySuggestionsBlockListResultJsonUnmarshaller();
        return instance;
    }
}
