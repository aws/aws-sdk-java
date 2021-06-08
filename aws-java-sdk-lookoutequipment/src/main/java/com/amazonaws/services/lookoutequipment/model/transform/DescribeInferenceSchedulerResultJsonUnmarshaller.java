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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeInferenceSchedulerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInferenceSchedulerResultJsonUnmarshaller implements Unmarshaller<DescribeInferenceSchedulerResult, JsonUnmarshallerContext> {

    public DescribeInferenceSchedulerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeInferenceSchedulerResult describeInferenceSchedulerResult = new DescribeInferenceSchedulerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeInferenceSchedulerResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ModelArn", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelName", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceSchedulerName", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setInferenceSchedulerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceSchedulerArn", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setInferenceSchedulerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataDelayOffsetInMinutes", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setDataDelayOffsetInMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DataUploadFrequency", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setDataUploadFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DataInputConfiguration", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setDataInputConfiguration(InferenceInputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataOutputConfiguration", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setDataOutputConfiguration(InferenceOutputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerSideKmsKeyId", targetDepth)) {
                    context.nextToken();
                    describeInferenceSchedulerResult.setServerSideKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeInferenceSchedulerResult;
    }

    private static DescribeInferenceSchedulerResultJsonUnmarshaller instance;

    public static DescribeInferenceSchedulerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInferenceSchedulerResultJsonUnmarshaller();
        return instance;
    }
}
