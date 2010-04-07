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

package com.amazonaws.services.sqs.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Add Permission Request Unmarshaller
 */
public class AddPermissionRequestUnmarshaller implements Unmarshaller<AddPermissionRequest, Node> {

    public AddPermissionRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        AddPermissionRequest addPermissionRequest = new AddPermissionRequest();

        
        Node queueUrlNode = XpathUtils.asNode("QueueUrl", node);
        addPermissionRequest.setQueueUrl(new StringUnmarshaller().unmarshall(queueUrlNode));
    
        Node labelNode = XpathUtils.asNode("Label", node);
        addPermissionRequest.setLabel(new StringUnmarshaller().unmarshall(labelNode));
    
        NodeList aWSAccountIdsNodes = XpathUtils.asNodeList("AWSAccountId", node);
        for (int aWSAccountIdsIndex = 0; aWSAccountIdsIndex < XpathUtils.nodeLength(aWSAccountIdsNodes); ++aWSAccountIdsIndex) {
            Node aWSAccountIdsNode = aWSAccountIdsNodes.item(aWSAccountIdsIndex);
            addPermissionRequest.getAWSAccountIds().add(new StringUnmarshaller().unmarshall(aWSAccountIdsNode));
            aWSAccountIdsNode.getParentNode().removeChild(aWSAccountIdsNode);
        }
    
        NodeList actionsNodes = XpathUtils.asNodeList("ActionName", node);
        for (int actionsIndex = 0; actionsIndex < XpathUtils.nodeLength(actionsNodes); ++actionsIndex) {
            Node actionsNode = actionsNodes.item(actionsIndex);
            addPermissionRequest.getActions().add(new StringUnmarshaller().unmarshall(actionsNode));
            actionsNode.getParentNode().removeChild(actionsNode);
        }
    

        return addPermissionRequest;
    }
}
    