/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrock.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrock.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetModelCustomizationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetModelCustomizationJobResultJsonUnmarshaller implements Unmarshaller<GetModelCustomizationJobResult, JsonUnmarshallerContext> {

    public GetModelCustomizationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetModelCustomizationJobResult getModelCustomizationJobResult = new GetModelCustomizationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getModelCustomizationJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("jobArn", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputModelName", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setOutputModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputModelArn", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setOutputModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureMessage", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("baseModelArn", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setBaseModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hyperParameters", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setHyperParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("trainingDataConfig", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setTrainingDataConfig(TrainingDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("validationDataConfig", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setValidationDataConfig(ValidationDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outputDataConfig", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customizationType", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setCustomizationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputModelKmsKeyArn", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setOutputModelKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("trainingMetrics", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setTrainingMetrics(TrainingMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("validationMetrics", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setValidationMetrics(new ListUnmarshaller<ValidatorMetric>(ValidatorMetricJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    context.nextToken();
                    getModelCustomizationJobResult.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getModelCustomizationJobResult;
    }

    private static GetModelCustomizationJobResultJsonUnmarshaller instance;

    public static GetModelCustomizationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetModelCustomizationJobResultJsonUnmarshaller();
        return instance;
    }
}
