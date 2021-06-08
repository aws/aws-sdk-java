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
 * DescribeModelBiasJobDefinitionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelBiasJobDefinitionResultJsonUnmarshaller implements Unmarshaller<DescribeModelBiasJobDefinitionResult, JsonUnmarshallerContext> {

    public DescribeModelBiasJobDefinitionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeModelBiasJobDefinitionResult describeModelBiasJobDefinitionResult = new DescribeModelBiasJobDefinitionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeModelBiasJobDefinitionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobDefinitionArn", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setJobDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobDefinitionName", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setJobDefinitionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModelBiasBaselineConfig", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setModelBiasBaselineConfig(ModelBiasBaselineConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelBiasAppSpecification", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setModelBiasAppSpecification(ModelBiasAppSpecificationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ModelBiasJobInput", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setModelBiasJobInput(ModelBiasJobInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelBiasJobOutputConfig", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setModelBiasJobOutputConfig(MonitoringOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobResources", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setJobResources(MonitoringResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkConfig", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setNetworkConfig(MonitoringNetworkConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    context.nextToken();
                    describeModelBiasJobDefinitionResult.setStoppingCondition(MonitoringStoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeModelBiasJobDefinitionResult;
    }

    private static DescribeModelBiasJobDefinitionResultJsonUnmarshaller instance;

    public static DescribeModelBiasJobDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeModelBiasJobDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
