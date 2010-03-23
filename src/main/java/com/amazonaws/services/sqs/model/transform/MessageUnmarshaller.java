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
 * Message Unmarshaller
 */        
public class MessageUnmarshaller implements Unmarshaller<Message, Node> {

    public Message unmarshall(Node node) throws Exception {
        Message message = new Message();
        
        
        Node messageIdNode = XpathUtils.asNode("MessageId", node);
        message.setMessageId(new StringUnmarshaller().unmarshall(messageIdNode));
    
        Node receiptHandleNode = XpathUtils.asNode("ReceiptHandle", node);
        message.setReceiptHandle(new StringUnmarshaller().unmarshall(receiptHandleNode));
    
        Node mD5OfBodyNode = XpathUtils.asNode("MD5OfBody", node);
        message.setMD5OfBody(new StringUnmarshaller().unmarshall(mD5OfBodyNode));
    
        Node bodyNode = XpathUtils.asNode("Body", node);
        message.setBody(new StringUnmarshaller().unmarshall(bodyNode));
    
        NodeList attributesNodes = XpathUtils.asNodeList("Attribute", node);
        for (int attributesIndex = 0; attributesIndex < XpathUtils.nodeLength(attributesNodes); ++attributesIndex) {
            String attributesMapKey = new StringUnmarshaller().unmarshall(XpathUtils.asNode("Name", attributesNodes.item(attributesIndex)));
            String attributesMapValue = new StringUnmarshaller().unmarshall(XpathUtils.asNode("Value", attributesNodes.item(attributesIndex)));
            message.getAttributes().put(attributesMapKey, attributesMapValue); 
        }
    

        return message;
    }  
}
    