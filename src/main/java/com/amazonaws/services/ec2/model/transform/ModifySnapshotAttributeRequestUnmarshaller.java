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
 * Modify Snapshot Attribute Request Unmarshaller
 */
public class ModifySnapshotAttributeRequestUnmarshaller implements Unmarshaller<ModifySnapshotAttributeRequest, Node> {

    public ModifySnapshotAttributeRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        ModifySnapshotAttributeRequest modifySnapshotAttributeRequest = new ModifySnapshotAttributeRequest();

        
        Node snapshotIdNode = XpathUtils.asNode("SnapshotId", node);
        modifySnapshotAttributeRequest.setSnapshotId(new StringUnmarshaller().unmarshall(snapshotIdNode));
    
        Node attributeNode = XpathUtils.asNode("Attribute", node);
        modifySnapshotAttributeRequest.setAttribute(new StringUnmarshaller().unmarshall(attributeNode));
    
        Node operationTypeNode = XpathUtils.asNode("OperationType", node);
        modifySnapshotAttributeRequest.setOperationType(new StringUnmarshaller().unmarshall(operationTypeNode));
    
        NodeList userIdsNodes = XpathUtils.asNodeList("UserId/UserId", node);
        for (int userIdsIndex = 0; userIdsIndex < XpathUtils.nodeLength(userIdsNodes); ++userIdsIndex) {
            Node userIdsNode = userIdsNodes.item(userIdsIndex);
            modifySnapshotAttributeRequest.getUserIds().add(new StringUnmarshaller().unmarshall(userIdsNode));
            userIdsNode.getParentNode().removeChild(userIdsNode);
        }
    
        NodeList groupNamesNodes = XpathUtils.asNodeList("Group/GroupName", node);
        for (int groupNamesIndex = 0; groupNamesIndex < XpathUtils.nodeLength(groupNamesNodes); ++groupNamesIndex) {
            Node groupNamesNode = groupNamesNodes.item(groupNamesIndex);
            modifySnapshotAttributeRequest.getGroupNames().add(new StringUnmarshaller().unmarshall(groupNamesNode));
            groupNamesNode.getParentNode().removeChild(groupNamesNode);
        }
    

        return modifySnapshotAttributeRequest;
    }
}
    