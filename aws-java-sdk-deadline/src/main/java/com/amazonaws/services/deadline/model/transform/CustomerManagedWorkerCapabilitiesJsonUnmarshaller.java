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
package com.amazonaws.services.deadline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CustomerManagedWorkerCapabilities JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerManagedWorkerCapabilitiesJsonUnmarshaller implements Unmarshaller<CustomerManagedWorkerCapabilities, JsonUnmarshallerContext> {

    public CustomerManagedWorkerCapabilities unmarshall(JsonUnmarshallerContext context) throws Exception {
        CustomerManagedWorkerCapabilities customerManagedWorkerCapabilities = new CustomerManagedWorkerCapabilities();

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
                if (context.testExpression("acceleratorCount", targetDepth)) {
                    context.nextToken();
                    customerManagedWorkerCapabilities.setAcceleratorCount(AcceleratorCountRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("acceleratorTotalMemoryMiB", targetDepth)) {
                    context.nextToken();
                    customerManagedWorkerCapabilities.setAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRangeJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("acceleratorTypes", targetDepth)) {
                    context.nextToken();
                    customerManagedWorkerCapabilities.setAcceleratorTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("cpuArchitectureType", targetDepth)) {
                    context.nextToken();
                    customerManagedWorkerCapabilities.setCpuArchitectureType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customAmounts", targetDepth)) {
                    context.nextToken();
                    customerManagedWorkerCapabilities.setCustomAmounts(new ListUnmarshaller<FleetAmountCapability>(FleetAmountCapabilityJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("customAttributes", targetDepth)) {
                    context.nextToken();
                    customerManagedWorkerCapabilities.setCustomAttributes(new ListUnmarshaller<FleetAttributeCapability>(
                            FleetAttributeCapabilityJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("memoryMiB", targetDepth)) {
                    context.nextToken();
                    customerManagedWorkerCapabilities.setMemoryMiB(MemoryMiBRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("osFamily", targetDepth)) {
                    context.nextToken();
                    customerManagedWorkerCapabilities.setOsFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vCpuCount", targetDepth)) {
                    context.nextToken();
                    customerManagedWorkerCapabilities.setVCpuCount(VCpuCountRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return customerManagedWorkerCapabilities;
    }

    private static CustomerManagedWorkerCapabilitiesJsonUnmarshaller instance;

    public static CustomerManagedWorkerCapabilitiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomerManagedWorkerCapabilitiesJsonUnmarshaller();
        return instance;
    }
}
