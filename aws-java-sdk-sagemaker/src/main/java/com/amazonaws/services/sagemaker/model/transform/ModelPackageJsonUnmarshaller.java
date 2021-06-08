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
 * ModelPackage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelPackageJsonUnmarshaller implements Unmarshaller<ModelPackage, JsonUnmarshallerContext> {

    public ModelPackage unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModelPackage modelPackage = new ModelPackage();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ModelPackageName", targetDepth)) {
                    context.nextToken();
                    modelPackage.setModelPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageGroupName", targetDepth)) {
                    context.nextToken();
                    modelPackage.setModelPackageGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageVersion", targetDepth)) {
                    context.nextToken();
                    modelPackage.setModelPackageVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageArn", targetDepth)) {
                    context.nextToken();
                    modelPackage.setModelPackageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageDescription", targetDepth)) {
                    context.nextToken();
                    modelPackage.setModelPackageDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    modelPackage.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InferenceSpecification", targetDepth)) {
                    context.nextToken();
                    modelPackage.setInferenceSpecification(InferenceSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceAlgorithmSpecification", targetDepth)) {
                    context.nextToken();
                    modelPackage.setSourceAlgorithmSpecification(SourceAlgorithmSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ValidationSpecification", targetDepth)) {
                    context.nextToken();
                    modelPackage.setValidationSpecification(ModelPackageValidationSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelPackageStatus", targetDepth)) {
                    context.nextToken();
                    modelPackage.setModelPackageStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageStatusDetails", targetDepth)) {
                    context.nextToken();
                    modelPackage.setModelPackageStatusDetails(ModelPackageStatusDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CertifyForMarketplace", targetDepth)) {
                    context.nextToken();
                    modelPackage.setCertifyForMarketplace(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ModelApprovalStatus", targetDepth)) {
                    context.nextToken();
                    modelPackage.setModelApprovalStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    modelPackage.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MetadataProperties", targetDepth)) {
                    context.nextToken();
                    modelPackage.setMetadataProperties(MetadataPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelMetrics", targetDepth)) {
                    context.nextToken();
                    modelPackage.setModelMetrics(ModelMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    modelPackage.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    modelPackage.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ApprovalDescription", targetDepth)) {
                    context.nextToken();
                    modelPackage.setApprovalDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    modelPackage.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return modelPackage;
    }

    private static ModelPackageJsonUnmarshaller instance;

    public static ModelPackageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelPackageJsonUnmarshaller();
        return instance;
    }
}
