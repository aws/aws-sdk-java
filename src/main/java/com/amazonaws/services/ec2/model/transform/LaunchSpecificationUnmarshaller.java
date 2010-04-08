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
 * Launch Specification Unmarshaller
 */
public class LaunchSpecificationUnmarshaller implements Unmarshaller<LaunchSpecification, Node> {

    public LaunchSpecification unmarshall(Node node) throws Exception {
        if (node == null) return null;

        LaunchSpecification launchSpecification = new LaunchSpecification();

        
        Node imageIdNode = XpathUtils.asNode("imageId", node);
        launchSpecification.setImageId(new StringUnmarshaller().unmarshall(imageIdNode));
    
        Node keyNameNode = XpathUtils.asNode("keyName", node);
        launchSpecification.setKeyName(new StringUnmarshaller().unmarshall(keyNameNode));
    
        NodeList securityGroupsNodes = XpathUtils.asNodeList("groupSet/item/groupId", node);
        for (int securityGroupsIndex = 0; securityGroupsIndex < XpathUtils.nodeLength(securityGroupsNodes); ++securityGroupsIndex) {
            Node securityGroupsNode = securityGroupsNodes.item(securityGroupsIndex);
            launchSpecification.getSecurityGroups().add(new StringUnmarshaller().unmarshall(securityGroupsNode));
            securityGroupsNode.getParentNode().removeChild(securityGroupsNode);
        }
    
        Node userDataNode = XpathUtils.asNode("userData", node);
        launchSpecification.setUserData(new StringUnmarshaller().unmarshall(userDataNode));
    
        Node addressingTypeNode = XpathUtils.asNode("addressingType", node);
        launchSpecification.setAddressingType(new StringUnmarshaller().unmarshall(addressingTypeNode));
    
        Node instanceTypeNode = XpathUtils.asNode("instanceType", node);
        launchSpecification.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node placementNode = XpathUtils.asNode("placement", node);
        launchSpecification.setPlacement(new PlacementUnmarshaller().unmarshall(placementNode));
    
        Node kernelIdNode = XpathUtils.asNode("kernelId", node);
        launchSpecification.setKernelId(new StringUnmarshaller().unmarshall(kernelIdNode));
    
        Node ramdiskIdNode = XpathUtils.asNode("ramdiskId", node);
        launchSpecification.setRamdiskId(new StringUnmarshaller().unmarshall(ramdiskIdNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("blockDeviceMapping/item", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            launchSpecification.getBlockDeviceMappings().add(new BlockDeviceMappingUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    
        Node monitoringEnabledNode = XpathUtils.asNode("monitoring/enabled", node);
        launchSpecification.setMonitoringEnabled(new BooleanUnmarshaller().unmarshall(monitoringEnabledNode));
    
        Node subnetIdNode = XpathUtils.asNode("subnetId", node);
        launchSpecification.setSubnetId(new StringUnmarshaller().unmarshall(subnetIdNode));
    

        return launchSpecification;
    }
}
    