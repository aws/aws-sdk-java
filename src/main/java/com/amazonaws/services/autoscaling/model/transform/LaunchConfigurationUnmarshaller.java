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

package com.amazonaws.services.autoscaling.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Launch Configuration Unmarshaller
 */        
public class LaunchConfigurationUnmarshaller implements Unmarshaller<LaunchConfiguration, Node> {

    public LaunchConfiguration unmarshall(Node node) throws Exception {
        LaunchConfiguration launchConfiguration = new LaunchConfiguration();
        
        
        Node launchConfigurationNameNode = XpathUtils.asNode("LaunchConfigurationName", node);
        launchConfiguration.setLaunchConfigurationName(new StringUnmarshaller().unmarshall(launchConfigurationNameNode));
    
        Node imageIdNode = XpathUtils.asNode("ImageId", node);
        launchConfiguration.setImageId(new StringUnmarshaller().unmarshall(imageIdNode));
    
        Node keyNameNode = XpathUtils.asNode("KeyName", node);
        launchConfiguration.setKeyName(new StringUnmarshaller().unmarshall(keyNameNode));
    
        NodeList securityGroupsNodes = XpathUtils.asNodeList("SecurityGroups/member", node);
        for (int securityGroupsIndex = 0; securityGroupsIndex < XpathUtils.nodeLength(securityGroupsNodes); ++securityGroupsIndex) {
            Node securityGroupsNode = securityGroupsNodes.item(securityGroupsIndex);
            launchConfiguration.getSecurityGroups().add(new StringUnmarshaller().unmarshall(securityGroupsNode));
            securityGroupsNode.getParentNode().removeChild(securityGroupsNode);
        }
    
        Node userDataNode = XpathUtils.asNode("UserData", node);
        launchConfiguration.setUserData(new StringUnmarshaller().unmarshall(userDataNode));
    
        Node instanceTypeNode = XpathUtils.asNode("InstanceType", node);
        launchConfiguration.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node kernelIdNode = XpathUtils.asNode("KernelId", node);
        launchConfiguration.setKernelId(new StringUnmarshaller().unmarshall(kernelIdNode));
    
        Node ramdiskIdNode = XpathUtils.asNode("RamdiskId", node);
        launchConfiguration.setRamdiskId(new StringUnmarshaller().unmarshall(ramdiskIdNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("BlockDeviceMappings/member", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            launchConfiguration.getBlockDeviceMappings().add(new BlockDeviceMappingUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    
        Node createdTimeNode = XpathUtils.asNode("CreatedTime", node);
        launchConfiguration.setCreatedTime(new DateUnmarshaller().unmarshall(createdTimeNode));
    

        return launchConfiguration;
    }  
}
    