/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeCodeRepositoryResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCodeRepositoryResultJsonUnmarshaller implements Unmarshaller<DescribeCodeRepositoryResult, JsonUnmarshallerContext> {

    public DescribeCodeRepositoryResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCodeRepositoryResult describeCodeRepositoryResult = new DescribeCodeRepositoryResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeCodeRepositoryResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CodeRepositoryName", targetDepth)) {
                    context.nextToken();
                    describeCodeRepositoryResult.setCodeRepositoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeRepositoryArn", targetDepth)) {
                    context.nextToken();
                    describeCodeRepositoryResult.setCodeRepositoryArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeCodeRepositoryResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeCodeRepositoryResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("GitConfig", targetDepth)) {
                    context.nextToken();
                    describeCodeRepositoryResult.setGitConfig(GitConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeCodeRepositoryResult;
    }

    private static DescribeCodeRepositoryResultJsonUnmarshaller instance;

    public static DescribeCodeRepositoryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCodeRepositoryResultJsonUnmarshaller();
        return instance;
    }
}
