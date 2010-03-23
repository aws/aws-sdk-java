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
 * Image Unmarshaller
 */        
public class ImageUnmarshaller implements Unmarshaller<Image, Node> {

    public Image unmarshall(Node node) throws Exception {
        Image image = new Image();
        
        
        Node imageIdNode = XpathUtils.asNode("imageId", node);
        image.setImageId(new StringUnmarshaller().unmarshall(imageIdNode));
    
        Node imageLocationNode = XpathUtils.asNode("imageLocation", node);
        image.setImageLocation(new StringUnmarshaller().unmarshall(imageLocationNode));
    
        Node stateNode = XpathUtils.asNode("imageState", node);
        image.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node ownerIdNode = XpathUtils.asNode("imageOwnerId", node);
        image.setOwnerId(new StringUnmarshaller().unmarshall(ownerIdNode));
    
        Node publicValueNode = XpathUtils.asNode("isPublic", node);
        image.setPublic(new BooleanUnmarshaller().unmarshall(publicValueNode));
    
        NodeList productCodesNodes = XpathUtils.asNodeList("productCodes/item", node);
        for (int productCodesIndex = 0; productCodesIndex < XpathUtils.nodeLength(productCodesNodes); ++productCodesIndex) {
            Node productCodesNode = productCodesNodes.item(productCodesIndex);
            image.getProductCodes().add(new ProductCodeUnmarshaller().unmarshall(productCodesNode));
            productCodesNode.getParentNode().removeChild(productCodesNode);
        }
    
        Node architectureNode = XpathUtils.asNode("architecture", node);
        image.setArchitecture(new StringUnmarshaller().unmarshall(architectureNode));
    
        Node imageTypeNode = XpathUtils.asNode("imageType", node);
        image.setImageType(new StringUnmarshaller().unmarshall(imageTypeNode));
    
        Node kernelIdNode = XpathUtils.asNode("kernelId", node);
        image.setKernelId(new StringUnmarshaller().unmarshall(kernelIdNode));
    
        Node ramdiskIdNode = XpathUtils.asNode("ramdiskId", node);
        image.setRamdiskId(new StringUnmarshaller().unmarshall(ramdiskIdNode));
    
        Node platformNode = XpathUtils.asNode("platform", node);
        image.setPlatform(new StringUnmarshaller().unmarshall(platformNode));
    
        Node stateReasonNode = XpathUtils.asNode("stateReason", node);
        image.setStateReason(new StateReasonUnmarshaller().unmarshall(stateReasonNode));
    
        Node imageOwnerAliasNode = XpathUtils.asNode("imageOwnerAlias", node);
        image.setImageOwnerAlias(new StringUnmarshaller().unmarshall(imageOwnerAliasNode));
    
        Node nameNode = XpathUtils.asNode("name", node);
        image.setName(new StringUnmarshaller().unmarshall(nameNode));
    
        Node descriptionNode = XpathUtils.asNode("description", node);
        image.setDescription(new StringUnmarshaller().unmarshall(descriptionNode));
    
        Node rootDeviceTypeNode = XpathUtils.asNode("rootDeviceType", node);
        image.setRootDeviceType(new StringUnmarshaller().unmarshall(rootDeviceTypeNode));
    
        Node rootDeviceNameNode = XpathUtils.asNode("rootDeviceName", node);
        image.setRootDeviceName(new StringUnmarshaller().unmarshall(rootDeviceNameNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("blockDeviceMapping/item", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            image.getBlockDeviceMappings().add(new BlockDeviceMappingUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    

        return image;
    }  
}
    