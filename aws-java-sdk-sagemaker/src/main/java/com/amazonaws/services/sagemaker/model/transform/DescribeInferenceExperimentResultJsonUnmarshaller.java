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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeInferenceExperimentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInferenceExperimentResultJsonUnmarshaller implements Unmarshaller<DescribeInferenceExperimentResult, JsonUnmarshallerContext> {

    public DescribeInferenceExperimentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeInferenceExperimentResult describeInferenceExperimentResult = new DescribeInferenceExperimentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeInferenceExperimentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setSchedule(InferenceExperimentScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointMetadata", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setEndpointMetadata(EndpointMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelVariants", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setModelVariants(new ListUnmarshaller<ModelVariantConfigSummary>(
                            ModelVariantConfigSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataStorageConfig", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setDataStorageConfig(InferenceExperimentDataStorageConfigJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ShadowModeConfig", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setShadowModeConfig(ShadowModeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KmsKey", targetDepth)) {
                    context.nextToken();
                    describeInferenceExperimentResult.setKmsKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeInferenceExperimentResult;
    }

    private static DescribeInferenceExperimentResultJsonUnmarshaller instance;

    public static DescribeInferenceExperimentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInferenceExperimentResultJsonUnmarshaller();
        return instance;
    }
}
