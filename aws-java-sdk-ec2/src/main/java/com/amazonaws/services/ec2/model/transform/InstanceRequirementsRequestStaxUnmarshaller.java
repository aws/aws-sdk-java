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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * InstanceRequirementsRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRequirementsRequestStaxUnmarshaller implements Unmarshaller<InstanceRequirementsRequest, StaxUnmarshallerContext> {

    public InstanceRequirementsRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceRequirementsRequest instanceRequirementsRequest = new InstanceRequirementsRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instanceRequirementsRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("VCpuCount", targetDepth)) {
                    instanceRequirementsRequest.setVCpuCount(VCpuCountRangeRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MemoryMiB", targetDepth)) {
                    instanceRequirementsRequest.setMemoryMiB(MemoryMiBRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CpuManufacturer", targetDepth)) {
                    instanceRequirementsRequest.withCpuManufacturers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("CpuManufacturer/item", targetDepth)) {
                    instanceRequirementsRequest.withCpuManufacturers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MemoryGiBPerVCpu", targetDepth)) {
                    instanceRequirementsRequest.setMemoryGiBPerVCpu(MemoryGiBPerVCpuRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExcludedInstanceType", targetDepth)) {
                    instanceRequirementsRequest.withExcludedInstanceTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ExcludedInstanceType/item", targetDepth)) {
                    instanceRequirementsRequest.withExcludedInstanceTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceGeneration", targetDepth)) {
                    instanceRequirementsRequest.withInstanceGenerations(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("InstanceGeneration/item", targetDepth)) {
                    instanceRequirementsRequest.withInstanceGenerations(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SpotMaxPricePercentageOverLowestPrice", targetDepth)) {
                    instanceRequirementsRequest.setSpotMaxPricePercentageOverLowestPrice(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OnDemandMaxPricePercentageOverLowestPrice", targetDepth)) {
                    instanceRequirementsRequest.setOnDemandMaxPricePercentageOverLowestPrice(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BareMetal", targetDepth)) {
                    instanceRequirementsRequest.setBareMetal(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BurstablePerformance", targetDepth)) {
                    instanceRequirementsRequest.setBurstablePerformance(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequireHibernateSupport", targetDepth)) {
                    instanceRequirementsRequest.setRequireHibernateSupport(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkInterfaceCount", targetDepth)) {
                    instanceRequirementsRequest.setNetworkInterfaceCount(NetworkInterfaceCountRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LocalStorage", targetDepth)) {
                    instanceRequirementsRequest.setLocalStorage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LocalStorageType", targetDepth)) {
                    instanceRequirementsRequest.withLocalStorageTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("LocalStorageType/item", targetDepth)) {
                    instanceRequirementsRequest.withLocalStorageTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TotalLocalStorageGB", targetDepth)) {
                    instanceRequirementsRequest.setTotalLocalStorageGB(TotalLocalStorageGBRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BaselineEbsBandwidthMbps", targetDepth)) {
                    instanceRequirementsRequest.setBaselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorType", targetDepth)) {
                    instanceRequirementsRequest.withAcceleratorTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AcceleratorType/item", targetDepth)) {
                    instanceRequirementsRequest.withAcceleratorTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorCount", targetDepth)) {
                    instanceRequirementsRequest.setAcceleratorCount(AcceleratorCountRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorManufacturer", targetDepth)) {
                    instanceRequirementsRequest.withAcceleratorManufacturers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AcceleratorManufacturer/item", targetDepth)) {
                    instanceRequirementsRequest.withAcceleratorManufacturers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorName", targetDepth)) {
                    instanceRequirementsRequest.withAcceleratorNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AcceleratorName/item", targetDepth)) {
                    instanceRequirementsRequest.withAcceleratorNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorTotalMemoryMiB", targetDepth)) {
                    instanceRequirementsRequest
                            .setAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkBandwidthGbps", targetDepth)) {
                    instanceRequirementsRequest.setNetworkBandwidthGbps(NetworkBandwidthGbpsRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedInstanceType", targetDepth)) {
                    instanceRequirementsRequest.withAllowedInstanceTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AllowedInstanceType/item", targetDepth)) {
                    instanceRequirementsRequest.withAllowedInstanceTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceRequirementsRequest;
                }
            }
        }
    }

    private static InstanceRequirementsRequestStaxUnmarshaller instance;

    public static InstanceRequirementsRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceRequirementsRequestStaxUnmarshaller();
        return instance;
    }
}
