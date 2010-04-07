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
 * Create Launch Configuration Request Unmarshaller
 */
public class CreateLaunchConfigurationRequestUnmarshaller implements Unmarshaller<CreateLaunchConfigurationRequest, Node> {

    public CreateLaunchConfigurationRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        CreateLaunchConfigurationRequest createLaunchConfigurationRequest = new CreateLaunchConfigurationRequest();

        
        Node launchConfigurationNameNode = XpathUtils.asNode("LaunchConfigurationName", node);
        createLaunchConfigurationRequest.setLaunchConfigurationName(new StringUnmarshaller().unmarshall(launchConfigurationNameNode));
    
        Node imageIdNode = XpathUtils.asNode("ImageId", node);
        createLaunchConfigurationRequest.setImageId(new StringUnmarshaller().unmarshall(imageIdNode));
    
        Node keyNameNode = XpathUtils.asNode("KeyName", node);
        createLaunchConfigurationRequest.setKeyName(new StringUnmarshaller().unmarshall(keyNameNode));
    
        NodeList securityGroupsNodes = XpathUtils.asNodeList("SecurityGroups/member", node);
        for (int securityGroupsIndex = 0; securityGroupsIndex < XpathUtils.nodeLength(securityGroupsNodes); ++securityGroupsIndex) {
            Node securityGroupsNode = securityGroupsNodes.item(securityGroupsIndex);
            createLaunchConfigurationRequest.getSecurityGroups().add(new StringUnmarshaller().unmarshall(securityGroupsNode));
            securityGroupsNode.getParentNode().removeChild(securityGroupsNode);
        }
    
        Node userDataNode = XpathUtils.asNode("UserData", node);
        createLaunchConfigurationRequest.setUserData(new StringUnmarshaller().unmarshall(userDataNode));
    
        Node instanceTypeNode = XpathUtils.asNode("InstanceType", node);
        createLaunchConfigurationRequest.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node kernelIdNode = XpathUtils.asNode("KernelId", node);
        createLaunchConfigurationRequest.setKernelId(new StringUnmarshaller().unmarshall(kernelIdNode));
    
        Node ramdiskIdNode = XpathUtils.asNode("RamdiskId", node);
        createLaunchConfigurationRequest.setRamdiskId(new StringUnmarshaller().unmarshall(ramdiskIdNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("BlockDeviceMappings/member", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            createLaunchConfigurationRequest.getBlockDeviceMappings().add(new BlockDeviceMappingUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    

        return createLaunchConfigurationRequest;
    }
}
    