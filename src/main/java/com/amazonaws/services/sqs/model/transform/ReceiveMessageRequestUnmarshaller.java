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
 * Receive Message Request Unmarshaller
 */        
public class ReceiveMessageRequestUnmarshaller implements Unmarshaller<ReceiveMessageRequest, Node> {

    public ReceiveMessageRequest unmarshall(Node node) throws Exception {
        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest();
        
        
        Node queueUrlNode = XpathUtils.asNode("QueueUrl", node);
        receiveMessageRequest.setQueueUrl(new StringUnmarshaller().unmarshall(queueUrlNode));
    
        NodeList attributeNamesNodes = XpathUtils.asNodeList("AttributeName", node);
        for (int attributeNamesIndex = 0; attributeNamesIndex < XpathUtils.nodeLength(attributeNamesNodes); ++attributeNamesIndex) {
            Node attributeNamesNode = attributeNamesNodes.item(attributeNamesIndex);
            receiveMessageRequest.getAttributeNames().add(new StringUnmarshaller().unmarshall(attributeNamesNode));
            attributeNamesNode.getParentNode().removeChild(attributeNamesNode);
        }
    
        Node maxNumberOfMessagesNode = XpathUtils.asNode("MaxNumberOfMessages", node);
        receiveMessageRequest.setMaxNumberOfMessages(new IntegerUnmarshaller().unmarshall(maxNumberOfMessagesNode));
    
        Node visibilityTimeoutNode = XpathUtils.asNode("VisibilityTimeout", node);
        receiveMessageRequest.setVisibilityTimeout(new IntegerUnmarshaller().unmarshall(visibilityTimeoutNode));
    

        return receiveMessageRequest;
    }  
}
    