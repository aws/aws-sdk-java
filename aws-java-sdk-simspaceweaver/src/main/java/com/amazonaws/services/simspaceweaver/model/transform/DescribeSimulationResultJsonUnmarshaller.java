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
package com.amazonaws.services.simspaceweaver.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simspaceweaver.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeSimulationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSimulationResultJsonUnmarshaller implements Unmarshaller<DescribeSimulationResult, JsonUnmarshallerContext> {

    public DescribeSimulationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSimulationResult describeSimulationResult = new DescribeSimulationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeSimulationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionId", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LiveSimulationState", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setLiveSimulationState(LiveSimulationStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LoggingConfiguration", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setLoggingConfiguration(LoggingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumDuration", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setMaximumDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaError", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setSchemaError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaS3Location", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setSchemaS3Location(S3LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetStatus", targetDepth)) {
                    context.nextToken();
                    describeSimulationResult.setTargetStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeSimulationResult;
    }

    private static DescribeSimulationResultJsonUnmarshaller instance;

    public static DescribeSimulationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSimulationResultJsonUnmarshaller();
        return instance;
    }
}
