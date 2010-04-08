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
 * Run Instances Request Unmarshaller
 */
public class RunInstancesRequestUnmarshaller implements Unmarshaller<RunInstancesRequest, Node> {

    public RunInstancesRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        RunInstancesRequest runInstancesRequest = new RunInstancesRequest();

        
        Node imageIdNode = XpathUtils.asNode("ImageId", node);
        runInstancesRequest.setImageId(new StringUnmarshaller().unmarshall(imageIdNode));
    
        Node minCountNode = XpathUtils.asNode("MinCount", node);
        runInstancesRequest.setMinCount(new IntegerUnmarshaller().unmarshall(minCountNode));
    
        Node maxCountNode = XpathUtils.asNode("MaxCount", node);
        runInstancesRequest.setMaxCount(new IntegerUnmarshaller().unmarshall(maxCountNode));
    
        Node keyNameNode = XpathUtils.asNode("KeyName", node);
        runInstancesRequest.setKeyName(new StringUnmarshaller().unmarshall(keyNameNode));
    
        NodeList securityGroupsNodes = XpathUtils.asNodeList("SecurityGroup/SecurityGroup", node);
        for (int securityGroupsIndex = 0; securityGroupsIndex < XpathUtils.nodeLength(securityGroupsNodes); ++securityGroupsIndex) {
            Node securityGroupsNode = securityGroupsNodes.item(securityGroupsIndex);
            runInstancesRequest.getSecurityGroups().add(new StringUnmarshaller().unmarshall(securityGroupsNode));
            securityGroupsNode.getParentNode().removeChild(securityGroupsNode);
        }
    
        Node userDataNode = XpathUtils.asNode("UserData", node);
        runInstancesRequest.setUserData(new StringUnmarshaller().unmarshall(userDataNode));
    
        Node instanceTypeNode = XpathUtils.asNode("InstanceType", node);
        runInstancesRequest.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node placementNode = XpathUtils.asNode("Placement", node);
        runInstancesRequest.setPlacement(new PlacementUnmarshaller().unmarshall(placementNode));
    
        Node kernelIdNode = XpathUtils.asNode("KernelId", node);
        runInstancesRequest.setKernelId(new StringUnmarshaller().unmarshall(kernelIdNode));
    
        Node ramdiskIdNode = XpathUtils.asNode("RamdiskId", node);
        runInstancesRequest.setRamdiskId(new StringUnmarshaller().unmarshall(ramdiskIdNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("BlockDeviceMapping/BlockDeviceMapping", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            runInstancesRequest.getBlockDeviceMappings().add(new BlockDeviceMappingUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    
        Node monitoringNode = XpathUtils.asNode("monitoring/enabled", node);
        runInstancesRequest.setMonitoring(new BooleanUnmarshaller().unmarshall(monitoringNode));
    
        Node subnetIdNode = XpathUtils.asNode("SubnetId", node);
        runInstancesRequest.setSubnetId(new StringUnmarshaller().unmarshall(subnetIdNode));
    
        Node disableApiTerminationNode = XpathUtils.asNode("disableApiTermination", node);
        runInstancesRequest.setDisableApiTermination(new BooleanUnmarshaller().unmarshall(disableApiTerminationNode));
    
        Node instanceInitiatedShutdownBehaviorNode = XpathUtils.asNode("instanceInitiatedShutdownBehavior", node);
        runInstancesRequest.setInstanceInitiatedShutdownBehavior(new StringUnmarshaller().unmarshall(instanceInitiatedShutdownBehaviorNode));
    

        return runInstancesRequest;
    }
}
    