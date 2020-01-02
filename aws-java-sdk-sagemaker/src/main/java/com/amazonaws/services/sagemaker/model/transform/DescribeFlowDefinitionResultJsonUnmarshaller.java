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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeFlowDefinitionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlowDefinitionResultJsonUnmarshaller implements Unmarshaller<DescribeFlowDefinitionResult, JsonUnmarshallerContext> {

    public DescribeFlowDefinitionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeFlowDefinitionResult describeFlowDefinitionResult = new DescribeFlowDefinitionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeFlowDefinitionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FlowDefinitionArn", targetDepth)) {
                    context.nextToken();
                    describeFlowDefinitionResult.setFlowDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FlowDefinitionName", targetDepth)) {
                    context.nextToken();
                    describeFlowDefinitionResult.setFlowDefinitionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FlowDefinitionStatus", targetDepth)) {
                    context.nextToken();
                    describeFlowDefinitionResult.setFlowDefinitionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeFlowDefinitionResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("HumanLoopActivationConfig", targetDepth)) {
                    context.nextToken();
                    describeFlowDefinitionResult.setHumanLoopActivationConfig(HumanLoopActivationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HumanLoopConfig", targetDepth)) {
                    context.nextToken();
                    describeFlowDefinitionResult.setHumanLoopConfig(HumanLoopConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    context.nextToken();
                    describeFlowDefinitionResult.setOutputConfig(FlowDefinitionOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeFlowDefinitionResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeFlowDefinitionResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeFlowDefinitionResult;
    }

    private static DescribeFlowDefinitionResultJsonUnmarshaller instance;

    public static DescribeFlowDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFlowDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
