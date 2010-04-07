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
 * Modify Image Attribute Request Unmarshaller
 */
public class ModifyImageAttributeRequestUnmarshaller implements Unmarshaller<ModifyImageAttributeRequest, Node> {

    public ModifyImageAttributeRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        ModifyImageAttributeRequest modifyImageAttributeRequest = new ModifyImageAttributeRequest();

        
        Node imageIdNode = XpathUtils.asNode("ImageId", node);
        modifyImageAttributeRequest.setImageId(new StringUnmarshaller().unmarshall(imageIdNode));
    
        Node attributeNode = XpathUtils.asNode("Attribute", node);
        modifyImageAttributeRequest.setAttribute(new StringUnmarshaller().unmarshall(attributeNode));
    
        Node operationTypeNode = XpathUtils.asNode("OperationType", node);
        modifyImageAttributeRequest.setOperationType(new StringUnmarshaller().unmarshall(operationTypeNode));
    
        NodeList userIdsNodes = XpathUtils.asNodeList("UserId/UserId", node);
        for (int userIdsIndex = 0; userIdsIndex < XpathUtils.nodeLength(userIdsNodes); ++userIdsIndex) {
            Node userIdsNode = userIdsNodes.item(userIdsIndex);
            modifyImageAttributeRequest.getUserIds().add(new StringUnmarshaller().unmarshall(userIdsNode));
            userIdsNode.getParentNode().removeChild(userIdsNode);
        }
    
        NodeList userGroupsNodes = XpathUtils.asNodeList("UserGroup/UserGroup", node);
        for (int userGroupsIndex = 0; userGroupsIndex < XpathUtils.nodeLength(userGroupsNodes); ++userGroupsIndex) {
            Node userGroupsNode = userGroupsNodes.item(userGroupsIndex);
            modifyImageAttributeRequest.getUserGroups().add(new StringUnmarshaller().unmarshall(userGroupsNode));
            userGroupsNode.getParentNode().removeChild(userGroupsNode);
        }
    
        NodeList productCodesNodes = XpathUtils.asNodeList("ProductCode/ProductCode", node);
        for (int productCodesIndex = 0; productCodesIndex < XpathUtils.nodeLength(productCodesNodes); ++productCodesIndex) {
            Node productCodesNode = productCodesNodes.item(productCodesIndex);
            modifyImageAttributeRequest.getProductCodes().add(new StringUnmarshaller().unmarshall(productCodesNode));
            productCodesNode.getParentNode().removeChild(productCodesNode);
        }
    
        Node valueNode = XpathUtils.asNode("Value", node);
        modifyImageAttributeRequest.setValue(new StringUnmarshaller().unmarshall(valueNode));
    

        return modifyImageAttributeRequest;
    }
}
    