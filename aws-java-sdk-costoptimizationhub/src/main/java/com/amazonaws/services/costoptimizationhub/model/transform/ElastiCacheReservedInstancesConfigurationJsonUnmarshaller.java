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
 * ElastiCacheReservedInstancesConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElastiCacheReservedInstancesConfigurationJsonUnmarshaller implements
        Unmarshaller<ElastiCacheReservedInstancesConfiguration, JsonUnmarshallerContext> {

    public ElastiCacheReservedInstancesConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ElastiCacheReservedInstancesConfiguration elastiCacheReservedInstancesConfiguration = new ElastiCacheReservedInstancesConfiguration();

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
                    elastiCacheReservedInstancesConfiguration.setAccountScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentGeneration", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setCurrentGeneration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceFamily", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setInstanceFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("monthlyRecurringCost", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setMonthlyRecurringCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("normalizedUnitsToPurchase", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setNormalizedUnitsToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfInstancesToPurchase", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setNumberOfInstancesToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("paymentOption", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservedInstancesRegion", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setReservedInstancesRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("service", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setService(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeFlexEligible", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setSizeFlexEligible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("term", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setTerm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("upfrontCost", targetDepth)) {
                    context.nextToken();
                    elastiCacheReservedInstancesConfiguration.setUpfrontCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return elastiCacheReservedInstancesConfiguration;
    }

    private static ElastiCacheReservedInstancesConfigurationJsonUnmarshaller instance;

    public static ElastiCacheReservedInstancesConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElastiCacheReservedInstancesConfigurationJsonUnmarshaller();
        return instance;
    }
}
