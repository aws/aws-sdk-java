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
 * RedshiftReservedInstancesConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftReservedInstancesConfigurationJsonUnmarshaller implements Unmarshaller<RedshiftReservedInstancesConfiguration, JsonUnmarshallerContext> {

    public RedshiftReservedInstancesConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        RedshiftReservedInstancesConfiguration redshiftReservedInstancesConfiguration = new RedshiftReservedInstancesConfiguration();

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
                    redshiftReservedInstancesConfiguration.setAccountScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentGeneration", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setCurrentGeneration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceFamily", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setInstanceFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("monthlyRecurringCost", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setMonthlyRecurringCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("normalizedUnitsToPurchase", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setNormalizedUnitsToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfInstancesToPurchase", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setNumberOfInstancesToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("paymentOption", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservedInstancesRegion", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setReservedInstancesRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("service", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setService(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeFlexEligible", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setSizeFlexEligible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("term", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setTerm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("upfrontCost", targetDepth)) {
                    context.nextToken();
                    redshiftReservedInstancesConfiguration.setUpfrontCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return redshiftReservedInstancesConfiguration;
    }

    private static RedshiftReservedInstancesConfigurationJsonUnmarshaller instance;

    public static RedshiftReservedInstancesConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftReservedInstancesConfigurationJsonUnmarshaller();
        return instance;
    }
}
