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
package com.amazonaws.services.costoptimizationhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costoptimizationhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OpenSearchReservedInstancesConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenSearchReservedInstancesConfigurationJsonUnmarshaller implements
        Unmarshaller<OpenSearchReservedInstancesConfiguration, JsonUnmarshallerContext> {

    public OpenSearchReservedInstancesConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        OpenSearchReservedInstancesConfiguration openSearchReservedInstancesConfiguration = new OpenSearchReservedInstancesConfiguration();

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
                if (context.testExpression("accountScope", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setAccountScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentGeneration", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setCurrentGeneration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("monthlyRecurringCost", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setMonthlyRecurringCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("normalizedUnitsToPurchase", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setNormalizedUnitsToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfInstancesToPurchase", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setNumberOfInstancesToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("paymentOption", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservedInstancesRegion", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setReservedInstancesRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("service", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setService(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeFlexEligible", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setSizeFlexEligible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("term", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setTerm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("upfrontCost", targetDepth)) {
                    context.nextToken();
                    openSearchReservedInstancesConfiguration.setUpfrontCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return openSearchReservedInstancesConfiguration;
    }

    private static OpenSearchReservedInstancesConfigurationJsonUnmarshaller instance;

    public static OpenSearchReservedInstancesConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OpenSearchReservedInstancesConfigurationJsonUnmarshaller();
        return instance;
    }
}
