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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
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

                if (context.testExpression("VCpuCount", targetDepth)) {
                    instanceRequirements.setVCpuCount(VCpuCountRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MemoryMiB", targetDepth)) {
                    instanceRequirements.setMemoryMiB(MemoryMiBRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CpuManufacturers", targetDepth)) {
                    instanceRequirements.withCpuManufacturers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("CpuManufacturers/member", targetDepth)) {
                    instanceRequirements.withCpuManufacturers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MemoryGiBPerVCpu", targetDepth)) {
                    instanceRequirements.setMemoryGiBPerVCpu(MemoryGiBPerVCpuRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExcludedInstanceTypes", targetDepth)) {
                    instanceRequirements.withExcludedInstanceTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ExcludedInstanceTypes/member", targetDepth)) {
                    instanceRequirements.withExcludedInstanceTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceGenerations", targetDepth)) {
                    instanceRequirements.withInstanceGenerations(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("InstanceGenerations/member", targetDepth)) {
                    instanceRequirements.withInstanceGenerations(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SpotMaxPricePercentageOverLowestPrice", targetDepth)) {
                    instanceRequirements.setSpotMaxPricePercentageOverLowestPrice(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OnDemandMaxPricePercentageOverLowestPrice", targetDepth)) {
                    instanceRequirements.setOnDemandMaxPricePercentageOverLowestPrice(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BareMetal", targetDepth)) {
                    instanceRequirements.setBareMetal(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BurstablePerformance", targetDepth)) {
                    instanceRequirements.setBurstablePerformance(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequireHibernateSupport", targetDepth)) {
                    instanceRequirements.setRequireHibernateSupport(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkInterfaceCount", targetDepth)) {
                    instanceRequirements.setNetworkInterfaceCount(NetworkInterfaceCountRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LocalStorage", targetDepth)) {
                    instanceRequirements.setLocalStorage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LocalStorageTypes", targetDepth)) {
                    instanceRequirements.withLocalStorageTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("LocalStorageTypes/member", targetDepth)) {
                    instanceRequirements.withLocalStorageTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TotalLocalStorageGB", targetDepth)) {
                    instanceRequirements.setTotalLocalStorageGB(TotalLocalStorageGBRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BaselineEbsBandwidthMbps", targetDepth)) {
                    instanceRequirements.setBaselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorTypes", targetDepth)) {
                    instanceRequirements.withAcceleratorTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AcceleratorTypes/member", targetDepth)) {
                    instanceRequirements.withAcceleratorTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorCount", targetDepth)) {
                    instanceRequirements.setAcceleratorCount(AcceleratorCountRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorManufacturers", targetDepth)) {
                    instanceRequirements.withAcceleratorManufacturers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AcceleratorManufacturers/member", targetDepth)) {
                    instanceRequirements.withAcceleratorManufacturers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorNames", targetDepth)) {
                    instanceRequirements.withAcceleratorNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AcceleratorNames/member", targetDepth)) {
                    instanceRequirements.withAcceleratorNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AcceleratorTotalMemoryMiB", targetDepth)) {
                    instanceRequirements.setAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkBandwidthGbps", targetDepth)) {
                    instanceRequirements.setNetworkBandwidthGbps(NetworkBandwidthGbpsRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedInstanceTypes", targetDepth)) {
                    instanceRequirements.withAllowedInstanceTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AllowedInstanceTypes/member", targetDepth)) {
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
