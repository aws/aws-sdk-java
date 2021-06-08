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
 * DescribeModelQualityJobDefinitionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelQualityJobDefinitionResultJsonUnmarshaller implements Unmarshaller<DescribeModelQualityJobDefinitionResult, JsonUnmarshallerContext> {

    public DescribeModelQualityJobDefinitionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeModelQualityJobDefinitionResult describeModelQualityJobDefinitionResult = new DescribeModelQualityJobDefinitionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeModelQualityJobDefinitionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobDefinitionArn", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setJobDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobDefinitionName", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setJobDefinitionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModelQualityBaselineConfig", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setModelQualityBaselineConfig(ModelQualityBaselineConfigJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ModelQualityAppSpecification", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setModelQualityAppSpecification(ModelQualityAppSpecificationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ModelQualityJobInput", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setModelQualityJobInput(ModelQualityJobInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelQualityJobOutputConfig", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setModelQualityJobOutputConfig(MonitoringOutputConfigJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("JobResources", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setJobResources(MonitoringResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkConfig", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setNetworkConfig(MonitoringNetworkConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    context.nextToken();
                    describeModelQualityJobDefinitionResult.setStoppingCondition(MonitoringStoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeModelQualityJobDefinitionResult;
    }

    private static DescribeModelQualityJobDefinitionResultJsonUnmarshaller instance;

    public static DescribeModelQualityJobDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeModelQualityJobDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
