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
 * DescribeAlgorithmResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlgorithmResultJsonUnmarshaller implements Unmarshaller<DescribeAlgorithmResult, JsonUnmarshallerContext> {

    public DescribeAlgorithmResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAlgorithmResult describeAlgorithmResult = new DescribeAlgorithmResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAlgorithmResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AlgorithmName", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setAlgorithmName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlgorithmArn", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setAlgorithmArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlgorithmDescription", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setAlgorithmDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingSpecification", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setTrainingSpecification(TrainingSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InferenceSpecification", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setInferenceSpecification(InferenceSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ValidationSpecification", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setValidationSpecification(AlgorithmValidationSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AlgorithmStatus", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setAlgorithmStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlgorithmStatusDetails", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setAlgorithmStatusDetails(AlgorithmStatusDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertifyForMarketplace", targetDepth)) {
                    context.nextToken();
                    describeAlgorithmResult.setCertifyForMarketplace(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAlgorithmResult;
    }

    private static DescribeAlgorithmResultJsonUnmarshaller instance;

    public static DescribeAlgorithmResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAlgorithmResultJsonUnmarshaller();
        return instance;
    }
}
