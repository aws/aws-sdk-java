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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeThingRegistrationTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThingRegistrationTaskResultJsonUnmarshaller implements Unmarshaller<DescribeThingRegistrationTaskResult, JsonUnmarshallerContext> {

    public DescribeThingRegistrationTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeThingRegistrationTaskResult describeThingRegistrationTaskResult = new DescribeThingRegistrationTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeThingRegistrationTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("taskId", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("templateBody", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setTemplateBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputFileBucket", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setInputFileBucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputFileKey", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setInputFileKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("successCount", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setSuccessCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("failureCount", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setFailureCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("percentageProgress", targetDepth)) {
                    context.nextToken();
                    describeThingRegistrationTaskResult.setPercentageProgress(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeThingRegistrationTaskResult;
    }

    private static DescribeThingRegistrationTaskResultJsonUnmarshaller instance;

    public static DescribeThingRegistrationTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeThingRegistrationTaskResultJsonUnmarshaller();
        return instance;
    }
}
