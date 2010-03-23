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
 * Modify Instance Attribute Request Unmarshaller
 */        
public class ModifyInstanceAttributeRequestUnmarshaller implements Unmarshaller<ModifyInstanceAttributeRequest, Node> {

    public ModifyInstanceAttributeRequest unmarshall(Node node) throws Exception {
        ModifyInstanceAttributeRequest modifyInstanceAttributeRequest = new ModifyInstanceAttributeRequest();
        
        
        Node instanceIdNode = XpathUtils.asNode("instanceId", node);
        modifyInstanceAttributeRequest.setInstanceId(new StringUnmarshaller().unmarshall(instanceIdNode));
    
        Node attributeNode = XpathUtils.asNode("attribute", node);
        modifyInstanceAttributeRequest.setAttribute(new StringUnmarshaller().unmarshall(attributeNode));
    
        Node valueNode = XpathUtils.asNode("value", node);
        modifyInstanceAttributeRequest.setValue(new StringUnmarshaller().unmarshall(valueNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("blockDeviceMapping/item", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            modifyInstanceAttributeRequest.getBlockDeviceMappings().add(new InstanceBlockDeviceMappingSpecificationUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    

        return modifyInstanceAttributeRequest;
    }  
}
    