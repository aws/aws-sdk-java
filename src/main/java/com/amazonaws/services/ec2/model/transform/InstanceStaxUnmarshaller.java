/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Instance StAX Unmarshaller
 */
public class InstanceStaxUnmarshaller implements Unmarshaller<Instance, StaxUnmarshallerContext> {

    public Instance unmarshall(StaxUnmarshallerContext context) throws Exception {
        Instance instance = new Instance();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return instance;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("instanceId", targetDepth)) {
                    instance.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("imageId", targetDepth)) {
                    instance.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceState", targetDepth)) {
                    instance.setState(InstanceStateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("privateDnsName", targetDepth)) {
                    instance.setPrivateDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("dnsName", targetDepth)) {
                    instance.setPublicDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("reason", targetDepth)) {
                    instance.setStateTransitionReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("keyName", targetDepth)) {
                    instance.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("amiLaunchIndex", targetDepth)) {
                    instance.setAmiLaunchIndex(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("productCodes/item", targetDepth)) {
                    instance.getProductCodes().add(ProductCodeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    instance.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("launchTime", targetDepth)) {
                    instance.setLaunchTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("placement", targetDepth)) {
                    instance.setPlacement(PlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("kernelId", targetDepth)) {
                    instance.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ramdiskId", targetDepth)) {
                    instance.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("platform", targetDepth)) {
                    instance.setPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("monitoring", targetDepth)) {
                    instance.setMonitoring(MonitoringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("subnetId", targetDepth)) {
                    instance.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("vpcId", targetDepth)) {
                    instance.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("privateIpAddress", targetDepth)) {
                    instance.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ipAddress", targetDepth)) {
                    instance.setPublicIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("stateReason", targetDepth)) {
                    instance.setStateReason(StateReasonStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("architecture", targetDepth)) {
                    instance.setArchitecture(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("rootDeviceType", targetDepth)) {
                    instance.setRootDeviceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("rootDeviceName", targetDepth)) {
                    instance.setRootDeviceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("blockDeviceMapping/item", targetDepth)) {
                    instance.getBlockDeviceMappings().add(InstanceBlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("virtualizationType", targetDepth)) {
                    instance.setVirtualizationType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceLifecycle", targetDepth)) {
                    instance.setInstanceLifecycle(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("spotInstanceRequestId", targetDepth)) {
                    instance.setSpotInstanceRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("license", targetDepth)) {
                    instance.setLicense(InstanceLicenseStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("clientToken", targetDepth)) {
                    instance.setClientToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("tagSet/item", targetDepth)) {
                    instance.getTags().add(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("groupSet/item", targetDepth)) {
                    instance.getSecurityGroups().add(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("sourceDestCheck", targetDepth)) {
                    instance.setSourceDestCheck(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("hypervisor", targetDepth)) {
                    instance.setHypervisor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("networkInterfaceSet/item", targetDepth)) {
                    instance.getNetworkInterfaces().add(InstanceNetworkInterfaceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("iamInstanceProfile", targetDepth)) {
                    instance.setIamInstanceProfile(IamInstanceProfileStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ebsOptimized", targetDepth)) {
                    instance.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("sriovNetSupport", targetDepth)) {
                    instance.setSriovNetSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instance;
                }
            }
        }
    }

    private static InstanceStaxUnmarshaller instance;
    public static InstanceStaxUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceStaxUnmarshaller();
        return instance;
    }
}
    