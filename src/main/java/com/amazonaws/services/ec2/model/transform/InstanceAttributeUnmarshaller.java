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
 * Instance Attribute Unmarshaller
 */
public class InstanceAttributeUnmarshaller implements Unmarshaller<InstanceAttribute, Node> {

    public InstanceAttribute unmarshall(Node node) throws Exception {
        if (node == null) return null;

        InstanceAttribute instanceAttribute = new InstanceAttribute();

        
        Node instanceIdNode = XpathUtils.asNode("instanceId", node);
        instanceAttribute.setInstanceId(new StringUnmarshaller().unmarshall(instanceIdNode));
    
        Node instanceTypeNode = XpathUtils.asNode("instanceType/value", node);
        instanceAttribute.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node kernelIdNode = XpathUtils.asNode("kernel/value", node);
        instanceAttribute.setKernelId(new StringUnmarshaller().unmarshall(kernelIdNode));
    
        Node ramdiskIdNode = XpathUtils.asNode("ramdisk/value", node);
        instanceAttribute.setRamdiskId(new StringUnmarshaller().unmarshall(ramdiskIdNode));
    
        Node userDataNode = XpathUtils.asNode("userData/value", node);
        instanceAttribute.setUserData(new StringUnmarshaller().unmarshall(userDataNode));
    
        Node disableApiTerminationNode = XpathUtils.asNode("disableApiTermination/value", node);
        instanceAttribute.setDisableApiTermination(new BooleanUnmarshaller().unmarshall(disableApiTerminationNode));
    
        Node instanceInitiatedShutdownBehaviorNode = XpathUtils.asNode("instanceInitiatedShutdownBehavior/value", node);
        instanceAttribute.setInstanceInitiatedShutdownBehavior(new StringUnmarshaller().unmarshall(instanceInitiatedShutdownBehaviorNode));
    
        Node rootDeviceNameNode = XpathUtils.asNode("rootDeviceName/value", node);
        instanceAttribute.setRootDeviceName(new StringUnmarshaller().unmarshall(rootDeviceNameNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("blockDeviceMapping/item", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            instanceAttribute.getBlockDeviceMappings().add(new InstanceBlockDeviceMappingUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    

        return instanceAttribute;
    }
}
    