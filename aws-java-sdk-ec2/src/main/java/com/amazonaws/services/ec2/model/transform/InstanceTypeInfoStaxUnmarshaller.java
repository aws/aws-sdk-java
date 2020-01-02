/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * InstanceTypeInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTypeInfoStaxUnmarshaller implements Unmarshaller<InstanceTypeInfo, StaxUnmarshallerContext> {

    public InstanceTypeInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceTypeInfo instanceTypeInfo = new InstanceTypeInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instanceTypeInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("instanceType", targetDepth)) {
                    instanceTypeInfo.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("currentGeneration", targetDepth)) {
                    instanceTypeInfo.setCurrentGeneration(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("freeTierEligible", targetDepth)) {
                    instanceTypeInfo.setFreeTierEligible(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("supportedUsageClasses", targetDepth)) {
                    instanceTypeInfo.withSupportedUsageClasses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("supportedUsageClasses/item", targetDepth)) {
                    instanceTypeInfo.withSupportedUsageClasses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("supportedRootDeviceTypes", targetDepth)) {
                    instanceTypeInfo.withSupportedRootDeviceTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("supportedRootDeviceTypes/item", targetDepth)) {
                    instanceTypeInfo.withSupportedRootDeviceTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("bareMetal", targetDepth)) {
                    instanceTypeInfo.setBareMetal(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("hypervisor", targetDepth)) {
                    instanceTypeInfo.setHypervisor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("processorInfo", targetDepth)) {
                    instanceTypeInfo.setProcessorInfo(ProcessorInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vCpuInfo", targetDepth)) {
                    instanceTypeInfo.setVCpuInfo(VCpuInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("memoryInfo", targetDepth)) {
                    instanceTypeInfo.setMemoryInfo(MemoryInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceStorageSupported", targetDepth)) {
                    instanceTypeInfo.setInstanceStorageSupported(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceStorageInfo", targetDepth)) {
                    instanceTypeInfo.setInstanceStorageInfo(InstanceStorageInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ebsInfo", targetDepth)) {
                    instanceTypeInfo.setEbsInfo(EbsInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInfo", targetDepth)) {
                    instanceTypeInfo.setNetworkInfo(NetworkInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("gpuInfo", targetDepth)) {
                    instanceTypeInfo.setGpuInfo(GpuInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("fpgaInfo", targetDepth)) {
                    instanceTypeInfo.setFpgaInfo(FpgaInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("placementGroupInfo", targetDepth)) {
                    instanceTypeInfo.setPlacementGroupInfo(PlacementGroupInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("inferenceAcceleratorInfo", targetDepth)) {
                    instanceTypeInfo.setInferenceAcceleratorInfo(InferenceAcceleratorInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("hibernationSupported", targetDepth)) {
                    instanceTypeInfo.setHibernationSupported(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("burstablePerformanceSupported", targetDepth)) {
                    instanceTypeInfo.setBurstablePerformanceSupported(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("dedicatedHostsSupported", targetDepth)) {
                    instanceTypeInfo.setDedicatedHostsSupported(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("autoRecoverySupported", targetDepth)) {
                    instanceTypeInfo.setAutoRecoverySupported(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceTypeInfo;
                }
            }
        }
    }

    private static InstanceTypeInfoStaxUnmarshaller instance;

    public static InstanceTypeInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTypeInfoStaxUnmarshaller();
        return instance;
    }
}
