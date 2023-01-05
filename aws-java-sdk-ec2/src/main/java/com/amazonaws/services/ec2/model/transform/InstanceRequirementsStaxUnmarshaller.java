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
 * InstanceRequirements StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRequirementsStaxUnmarshaller implements Unmarshaller<InstanceRequirements, StaxUnmarshallerContext> {

    public InstanceRequirements unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceRequirements instanceRequirements = new InstanceRequirements();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instanceRequirements;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("vCpuCount", targetDepth)) {
                    instanceRequirements.setVCpuCount(VCpuCountRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("memoryMiB", targetDepth)) {
                    instanceRequirements.setMemoryMiB(MemoryMiBStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("cpuManufacturerSet", targetDepth)) {
                    instanceRequirements.withCpuManufacturers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("cpuManufacturerSet/item", targetDepth)) {
                    instanceRequirements.withCpuManufacturers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("memoryGiBPerVCpu", targetDepth)) {
                    instanceRequirements.setMemoryGiBPerVCpu(MemoryGiBPerVCpuStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("excludedInstanceTypeSet", targetDepth)) {
                    instanceRequirements.withExcludedInstanceTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("excludedInstanceTypeSet/item", targetDepth)) {
                    instanceRequirements.withExcludedInstanceTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceGenerationSet", targetDepth)) {
                    instanceRequirements.withInstanceGenerations(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("instanceGenerationSet/item", targetDepth)) {
                    instanceRequirements.withInstanceGenerations(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("spotMaxPricePercentageOverLowestPrice", targetDepth)) {
                    instanceRequirements.setSpotMaxPricePercentageOverLowestPrice(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("onDemandMaxPricePercentageOverLowestPrice", targetDepth)) {
                    instanceRequirements.setOnDemandMaxPricePercentageOverLowestPrice(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("bareMetal", targetDepth)) {
                    instanceRequirements.setBareMetal(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("burstablePerformance", targetDepth)) {
                    instanceRequirements.setBurstablePerformance(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("requireHibernateSupport", targetDepth)) {
                    instanceRequirements.setRequireHibernateSupport(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceCount", targetDepth)) {
                    instanceRequirements.setNetworkInterfaceCount(NetworkInterfaceCountStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localStorage", targetDepth)) {
                    instanceRequirements.setLocalStorage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localStorageTypeSet", targetDepth)) {
                    instanceRequirements.withLocalStorageTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("localStorageTypeSet/item", targetDepth)) {
                    instanceRequirements.withLocalStorageTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("totalLocalStorageGB", targetDepth)) {
                    instanceRequirements.setTotalLocalStorageGB(TotalLocalStorageGBStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("baselineEbsBandwidthMbps", targetDepth)) {
                    instanceRequirements.setBaselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("acceleratorTypeSet", targetDepth)) {
                    instanceRequirements.withAcceleratorTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("acceleratorTypeSet/item", targetDepth)) {
                    instanceRequirements.withAcceleratorTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("acceleratorCount", targetDepth)) {
                    instanceRequirements.setAcceleratorCount(AcceleratorCountStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("acceleratorManufacturerSet", targetDepth)) {
                    instanceRequirements.withAcceleratorManufacturers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("acceleratorManufacturerSet/item", targetDepth)) {
                    instanceRequirements.withAcceleratorManufacturers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("acceleratorNameSet", targetDepth)) {
                    instanceRequirements.withAcceleratorNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("acceleratorNameSet/item", targetDepth)) {
                    instanceRequirements.withAcceleratorNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("acceleratorTotalMemoryMiB", targetDepth)) {
                    instanceRequirements.setAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkBandwidthGbps", targetDepth)) {
                    instanceRequirements.setNetworkBandwidthGbps(NetworkBandwidthGbpsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("allowedInstanceTypeSet", targetDepth)) {
                    instanceRequirements.withAllowedInstanceTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("allowedInstanceTypeSet/item", targetDepth)) {
                    instanceRequirements.withAllowedInstanceTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceRequirements;
                }
            }
        }
    }

    private static InstanceRequirementsStaxUnmarshaller instance;

    public static InstanceRequirementsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceRequirementsStaxUnmarshaller();
        return instance;
    }
}
