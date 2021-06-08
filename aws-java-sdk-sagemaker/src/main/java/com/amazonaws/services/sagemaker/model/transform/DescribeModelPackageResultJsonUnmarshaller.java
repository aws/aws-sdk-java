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
 * DescribeModelPackageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelPackageResultJsonUnmarshaller implements Unmarshaller<DescribeModelPackageResult, JsonUnmarshallerContext> {

    public DescribeModelPackageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeModelPackageResult describeModelPackageResult = new DescribeModelPackageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeModelPackageResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ModelPackageName", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setModelPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageGroupName", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setModelPackageGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageVersion", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setModelPackageVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageArn", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setModelPackageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageDescription", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setModelPackageDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InferenceSpecification", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setInferenceSpecification(InferenceSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceAlgorithmSpecification", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setSourceAlgorithmSpecification(SourceAlgorithmSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ValidationSpecification", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult
                            .setValidationSpecification(ModelPackageValidationSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelPackageStatus", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setModelPackageStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageStatusDetails", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setModelPackageStatusDetails(ModelPackageStatusDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CertifyForMarketplace", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setCertifyForMarketplace(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ModelApprovalStatus", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setModelApprovalStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MetadataProperties", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setMetadataProperties(MetadataPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelMetrics", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setModelMetrics(ModelMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ApprovalDescription", targetDepth)) {
                    context.nextToken();
                    describeModelPackageResult.setApprovalDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeModelPackageResult;
    }

    private static DescribeModelPackageResultJsonUnmarshaller instance;

    public static DescribeModelPackageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeModelPackageResultJsonUnmarshaller();
        return instance;
    }
}
