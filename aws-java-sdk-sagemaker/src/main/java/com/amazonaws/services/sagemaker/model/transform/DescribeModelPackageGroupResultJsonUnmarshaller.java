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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeModelPackageGroupResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelPackageGroupResultJsonUnmarshaller implements Unmarshaller<DescribeModelPackageGroupResult, JsonUnmarshallerContext> {

    public DescribeModelPackageGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeModelPackageGroupResult describeModelPackageGroupResult = new DescribeModelPackageGroupResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeModelPackageGroupResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ModelPackageGroupName", targetDepth)) {
                    context.nextToken();
                    describeModelPackageGroupResult.setModelPackageGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageGroupArn", targetDepth)) {
                    context.nextToken();
                    describeModelPackageGroupResult.setModelPackageGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageGroupDescription", targetDepth)) {
                    context.nextToken();
                    describeModelPackageGroupResult.setModelPackageGroupDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeModelPackageGroupResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describeModelPackageGroupResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelPackageGroupStatus", targetDepth)) {
                    context.nextToken();
                    describeModelPackageGroupResult.setModelPackageGroupStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeModelPackageGroupResult;
    }

    private static DescribeModelPackageGroupResultJsonUnmarshaller instance;

    public static DescribeModelPackageGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeModelPackageGroupResultJsonUnmarshaller();
        return instance;
    }
}
