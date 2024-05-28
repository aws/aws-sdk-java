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
 * ServiceManagedEc2InstanceCapabilities JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceManagedEc2InstanceCapabilitiesJsonUnmarshaller implements Unmarshaller<ServiceManagedEc2InstanceCapabilities, JsonUnmarshallerContext> {

    public ServiceManagedEc2InstanceCapabilities unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceManagedEc2InstanceCapabilities serviceManagedEc2InstanceCapabilities = new ServiceManagedEc2InstanceCapabilities();

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
                if (context.testExpression("allowedInstanceTypes", targetDepth)) {
                    context.nextToken();
                    serviceManagedEc2InstanceCapabilities.setAllowedInstanceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("cpuArchitectureType", targetDepth)) {
                    context.nextToken();
                    serviceManagedEc2InstanceCapabilities.setCpuArchitectureType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customAmounts", targetDepth)) {
                    context.nextToken();
                    serviceManagedEc2InstanceCapabilities.setCustomAmounts(new ListUnmarshaller<FleetAmountCapability>(FleetAmountCapabilityJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("customAttributes", targetDepth)) {
                    context.nextToken();
                    serviceManagedEc2InstanceCapabilities.setCustomAttributes(new ListUnmarshaller<FleetAttributeCapability>(
                            FleetAttributeCapabilityJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("excludedInstanceTypes", targetDepth)) {
                    context.nextToken();
                    serviceManagedEc2InstanceCapabilities.setExcludedInstanceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("memoryMiB", targetDepth)) {
                    context.nextToken();
                    serviceManagedEc2InstanceCapabilities.setMemoryMiB(MemoryMiBRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("osFamily", targetDepth)) {
                    context.nextToken();
                    serviceManagedEc2InstanceCapabilities.setOsFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rootEbsVolume", targetDepth)) {
                    context.nextToken();
                    serviceManagedEc2InstanceCapabilities.setRootEbsVolume(Ec2EbsVolumeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("vCpuCount", targetDepth)) {
                    context.nextToken();
                    serviceManagedEc2InstanceCapabilities.setVCpuCount(VCpuCountRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceManagedEc2InstanceCapabilities;
    }

    private static ServiceManagedEc2InstanceCapabilitiesJsonUnmarshaller instance;

    public static ServiceManagedEc2InstanceCapabilitiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceManagedEc2InstanceCapabilitiesJsonUnmarshaller();
        return instance;
    }
}
