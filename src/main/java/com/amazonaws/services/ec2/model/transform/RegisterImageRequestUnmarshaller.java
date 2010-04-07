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
 * Register Image Request Unmarshaller
 */
public class RegisterImageRequestUnmarshaller implements Unmarshaller<RegisterImageRequest, Node> {

    public RegisterImageRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        RegisterImageRequest registerImageRequest = new RegisterImageRequest();

        
        Node imageLocationNode = XpathUtils.asNode("ImageLocation", node);
        registerImageRequest.setImageLocation(new StringUnmarshaller().unmarshall(imageLocationNode));
    
        Node nameNode = XpathUtils.asNode("name", node);
        registerImageRequest.setName(new StringUnmarshaller().unmarshall(nameNode));
    
        Node descriptionNode = XpathUtils.asNode("description", node);
        registerImageRequest.setDescription(new StringUnmarshaller().unmarshall(descriptionNode));
    
        Node architectureNode = XpathUtils.asNode("architecture", node);
        registerImageRequest.setArchitecture(new StringUnmarshaller().unmarshall(architectureNode));
    
        Node kernelIdNode = XpathUtils.asNode("kernelId", node);
        registerImageRequest.setKernelId(new StringUnmarshaller().unmarshall(kernelIdNode));
    
        Node ramdiskIdNode = XpathUtils.asNode("ramdiskId", node);
        registerImageRequest.setRamdiskId(new StringUnmarshaller().unmarshall(ramdiskIdNode));
    
        Node rootDeviceNameNode = XpathUtils.asNode("rootDeviceName", node);
        registerImageRequest.setRootDeviceName(new StringUnmarshaller().unmarshall(rootDeviceNameNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("BlockDeviceMapping/BlockDeviceMapping", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            registerImageRequest.getBlockDeviceMappings().add(new BlockDeviceMappingUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    

        return registerImageRequest;
    }
}
    