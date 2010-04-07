/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.*;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Instance Unmarshaller
 */
public class InstanceUnmarshaller implements Unmarshaller<Instance, Node> {

    public Instance unmarshall(Node node) throws Exception {
        if (node == null) return null;

        Instance instance = new Instance();

        
        Node instanceIdNode = XpathUtils.asNode("instanceId", node);
        instance.setInstanceId(new StringUnmarshaller().unmarshall(instanceIdNode));
    
        Node imageIdNode = XpathUtils.asNode("imageId", node);
        instance.setImageId(new StringUnmarshaller().unmarshall(imageIdNode));
    
        Node stateNode = XpathUtils.asNode("instanceState", node);
        instance.setState(new InstanceStateUnmarshaller().unmarshall(stateNode));
    
        Node privateDnsNameNode = XpathUtils.asNode("privateDnsName", node);
        instance.setPrivateDnsName(new StringUnmarshaller().unmarshall(privateDnsNameNode));
    
        Node publicDnsNameNode = XpathUtils.asNode("dnsName", node);
        instance.setPublicDnsName(new StringUnmarshaller().unmarshall(publicDnsNameNode));
    
        Node stateTransitionReasonNode = XpathUtils.asNode("reason", node);
        instance.setStateTransitionReason(new StringUnmarshaller().unmarshall(stateTransitionReasonNode));
    
        Node keyNameNode = XpathUtils.asNode("keyName", node);
        instance.setKeyName(new StringUnmarshaller().unmarshall(keyNameNode));
    
        Node amiLaunchIndexNode = XpathUtils.asNode("amiLaunchIndex", node);
        instance.setAmiLaunchIndex(new IntegerUnmarshaller().unmarshall(amiLaunchIndexNode));
    
        NodeList productCodesNodes = XpathUtils.asNodeList("productCodes/item", node);
        for (int productCodesIndex = 0; productCodesIndex < XpathUtils.nodeLength(productCodesNodes); ++productCodesIndex) {
            Node productCodesNode = productCodesNodes.item(productCodesIndex);
            instance.getProductCodes().add(new ProductCodeUnmarshaller().unmarshall(productCodesNode));
            productCodesNode.getParentNode().removeChild(productCodesNode);
        }
    
        Node instanceTypeNode = XpathUtils.asNode("instanceType", node);
        instance.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node launchTimeNode = XpathUtils.asNode("launchTime", node);
        instance.setLaunchTime(new DateUnmarshaller().unmarshall(launchTimeNode));
    
        Node placementNode = XpathUtils.asNode("placement", node);
        instance.setPlacement(new PlacementUnmarshaller().unmarshall(placementNode));
    
        Node kernelIdNode = XpathUtils.asNode("kernelId", node);
        instance.setKernelId(new StringUnmarshaller().unmarshall(kernelIdNode));
    
        Node ramdiskIdNode = XpathUtils.asNode("ramdiskId", node);
        instance.setRamdiskId(new StringUnmarshaller().unmarshall(ramdiskIdNode));
    
        Node platformNode = XpathUtils.asNode("platform", node);
        instance.setPlatform(new StringUnmarshaller().unmarshall(platformNode));
    
        Node monitoringNode = XpathUtils.asNode("monitoring", node);
        instance.setMonitoring(new MonitoringUnmarshaller().unmarshall(monitoringNode));
    
        Node subnetIdNode = XpathUtils.asNode("subnetId", node);
        instance.setSubnetId(new StringUnmarshaller().unmarshall(subnetIdNode));
    
        Node vpcIdNode = XpathUtils.asNode("vpcId", node);
        instance.setVpcId(new StringUnmarshaller().unmarshall(vpcIdNode));
    
        Node privateIpAddressNode = XpathUtils.asNode("privateIpAddress", node);
        instance.setPrivateIpAddress(new StringUnmarshaller().unmarshall(privateIpAddressNode));
    
        Node publicIpAddressNode = XpathUtils.asNode("ipAddress", node);
        instance.setPublicIpAddress(new StringUnmarshaller().unmarshall(publicIpAddressNode));
    
        Node stateReasonNode = XpathUtils.asNode("stateReason", node);
        instance.setStateReason(new StateReasonUnmarshaller().unmarshall(stateReasonNode));
    
        Node architectureNode = XpathUtils.asNode("architecture", node);
        instance.setArchitecture(new StringUnmarshaller().unmarshall(architectureNode));
    
        Node rootDeviceTypeNode = XpathUtils.asNode("rootDeviceType", node);
        instance.setRootDeviceType(new StringUnmarshaller().unmarshall(rootDeviceTypeNode));
    
        Node rootDeviceNameNode = XpathUtils.asNode("rootDeviceName", node);
        instance.setRootDeviceName(new StringUnmarshaller().unmarshall(rootDeviceNameNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("blockDeviceMapping/item", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            instance.getBlockDeviceMappings().add(new InstanceBlockDeviceMappingUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    

        return instance;
    }
}
    