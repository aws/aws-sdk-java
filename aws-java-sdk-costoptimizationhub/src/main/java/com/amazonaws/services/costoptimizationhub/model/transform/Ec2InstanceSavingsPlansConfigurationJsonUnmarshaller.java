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
 * Ec2InstanceSavingsPlansConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2InstanceSavingsPlansConfigurationJsonUnmarshaller implements Unmarshaller<Ec2InstanceSavingsPlansConfiguration, JsonUnmarshallerContext> {

    public Ec2InstanceSavingsPlansConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        Ec2InstanceSavingsPlansConfiguration ec2InstanceSavingsPlansConfiguration = new Ec2InstanceSavingsPlansConfiguration();

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
                    ec2InstanceSavingsPlansConfiguration.setAccountScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hourlyCommitment", targetDepth)) {
                    context.nextToken();
                    ec2InstanceSavingsPlansConfiguration.setHourlyCommitment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceFamily", targetDepth)) {
                    context.nextToken();
                    ec2InstanceSavingsPlansConfiguration.setInstanceFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("paymentOption", targetDepth)) {
                    context.nextToken();
                    ec2InstanceSavingsPlansConfiguration.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("savingsPlansRegion", targetDepth)) {
                    context.nextToken();
                    ec2InstanceSavingsPlansConfiguration.setSavingsPlansRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("term", targetDepth)) {
                    context.nextToken();
                    ec2InstanceSavingsPlansConfiguration.setTerm(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ec2InstanceSavingsPlansConfiguration;
    }

    private static Ec2InstanceSavingsPlansConfigurationJsonUnmarshaller instance;

    public static Ec2InstanceSavingsPlansConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ec2InstanceSavingsPlansConfigurationJsonUnmarshaller();
        return instance;
    }
}
