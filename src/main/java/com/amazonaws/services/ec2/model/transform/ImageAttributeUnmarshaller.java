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
 * Image Attribute Unmarshaller
 */
public class ImageAttributeUnmarshaller implements Unmarshaller<ImageAttribute, Node> {

    public ImageAttribute unmarshall(Node node) throws Exception {
        if (node == null) return null;

        ImageAttribute imageAttribute = new ImageAttribute();

        
        Node imageIdNode = XpathUtils.asNode("imageId", node);
        imageAttribute.setImageId(new StringUnmarshaller().unmarshall(imageIdNode));
    
        NodeList launchPermissionsNodes = XpathUtils.asNodeList("launchPermission/item", node);
        for (int launchPermissionsIndex = 0; launchPermissionsIndex < XpathUtils.nodeLength(launchPermissionsNodes); ++launchPermissionsIndex) {
            Node launchPermissionsNode = launchPermissionsNodes.item(launchPermissionsIndex);
            imageAttribute.getLaunchPermissions().add(new LaunchPermissionUnmarshaller().unmarshall(launchPermissionsNode));
            launchPermissionsNode.getParentNode().removeChild(launchPermissionsNode);
        }
    
        NodeList productCodesNodes = XpathUtils.asNodeList("productCodes/item", node);
        for (int productCodesIndex = 0; productCodesIndex < XpathUtils.nodeLength(productCodesNodes); ++productCodesIndex) {
            Node productCodesNode = productCodesNodes.item(productCodesIndex);
            imageAttribute.getProductCodes().add(new ProductCodeUnmarshaller().unmarshall(productCodesNode));
            productCodesNode.getParentNode().removeChild(productCodesNode);
        }
    
        Node kernelIdNode = XpathUtils.asNode("kernel/value", node);
        imageAttribute.setKernelId(new StringUnmarshaller().unmarshall(kernelIdNode));
    
        Node ramdiskIdNode = XpathUtils.asNode("ramdisk/value", node);
        imageAttribute.setRamdiskId(new StringUnmarshaller().unmarshall(ramdiskIdNode));
    
        Node descriptionNode = XpathUtils.asNode("description/value", node);
        imageAttribute.setDescription(new StringUnmarshaller().unmarshall(descriptionNode));
    
        NodeList blockDeviceMappingsNodes = XpathUtils.asNodeList("blockDeviceMapping/item", node);
        for (int blockDeviceMappingsIndex = 0; blockDeviceMappingsIndex < XpathUtils.nodeLength(blockDeviceMappingsNodes); ++blockDeviceMappingsIndex) {
            Node blockDeviceMappingsNode = blockDeviceMappingsNodes.item(blockDeviceMappingsIndex);
            imageAttribute.getBlockDeviceMappings().add(new BlockDeviceMappingUnmarshaller().unmarshall(blockDeviceMappingsNode));
            blockDeviceMappingsNode.getParentNode().removeChild(blockDeviceMappingsNode);
        }
    

        return imageAttribute;
    }
}
    