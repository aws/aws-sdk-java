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
 * RdsReservedInstancesConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsReservedInstancesConfigurationJsonUnmarshaller implements Unmarshaller<RdsReservedInstancesConfiguration, JsonUnmarshallerContext> {

    public RdsReservedInstancesConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        RdsReservedInstancesConfiguration rdsReservedInstancesConfiguration = new RdsReservedInstancesConfiguration();

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
                    rdsReservedInstancesConfiguration.setAccountScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentGeneration", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setCurrentGeneration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("databaseEdition", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setDatabaseEdition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("databaseEngine", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setDatabaseEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentOption", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setDeploymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceFamily", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setInstanceFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licenseModel", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setLicenseModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("monthlyRecurringCost", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setMonthlyRecurringCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("normalizedUnitsToPurchase", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setNormalizedUnitsToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfInstancesToPurchase", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setNumberOfInstancesToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("paymentOption", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservedInstancesRegion", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setReservedInstancesRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("service", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setService(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeFlexEligible", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setSizeFlexEligible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("term", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setTerm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("upfrontCost", targetDepth)) {
                    context.nextToken();
                    rdsReservedInstancesConfiguration.setUpfrontCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rdsReservedInstancesConfiguration;
    }

    private static RdsReservedInstancesConfigurationJsonUnmarshaller instance;

    public static RdsReservedInstancesConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RdsReservedInstancesConfigurationJsonUnmarshaller();
        return instance;
    }
}
