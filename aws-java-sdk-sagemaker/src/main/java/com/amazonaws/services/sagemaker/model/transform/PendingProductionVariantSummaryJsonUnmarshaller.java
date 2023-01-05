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
 * PendingProductionVariantSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingProductionVariantSummaryJsonUnmarshaller implements Unmarshaller<PendingProductionVariantSummary, JsonUnmarshallerContext> {

    public PendingProductionVariantSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        PendingProductionVariantSummary pendingProductionVariantSummary = new PendingProductionVariantSummary();

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
                if (context.testExpression("VariantName", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setVariantName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeployedImages", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setDeployedImages(new ListUnmarshaller<DeployedImage>(DeployedImageJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CurrentWeight", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setCurrentWeight(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("DesiredWeight", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setDesiredWeight(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("CurrentInstanceCount", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setCurrentInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DesiredInstanceCount", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setDesiredInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AcceleratorType", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setAcceleratorType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VariantStatus", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setVariantStatus(new ListUnmarshaller<ProductionVariantStatus>(ProductionVariantStatusJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CurrentServerlessConfig", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setCurrentServerlessConfig(ProductionVariantServerlessConfigJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("DesiredServerlessConfig", targetDepth)) {
                    context.nextToken();
                    pendingProductionVariantSummary.setDesiredServerlessConfig(ProductionVariantServerlessConfigJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pendingProductionVariantSummary;
    }

    private static PendingProductionVariantSummaryJsonUnmarshaller instance;

    public static PendingProductionVariantSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PendingProductionVariantSummaryJsonUnmarshaller();
        return instance;
    }
}
