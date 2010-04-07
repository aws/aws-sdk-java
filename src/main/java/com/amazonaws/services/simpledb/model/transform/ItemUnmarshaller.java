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

package com.amazonaws.services.simpledb.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Item Unmarshaller
 */
public class ItemUnmarshaller implements Unmarshaller<Item, Node> {

    public Item unmarshall(Node node) throws Exception {
        if (node == null) return null;

        Item item = new Item();

        
        Node nameNode = XpathUtils.asNode("Name", node);
        item.setName(new StringUnmarshaller().unmarshall(nameNode));
    
        Node alternateNameEncodingNode = XpathUtils.asNode("Name/@encoding", node);
        item.setAlternateNameEncoding(new StringUnmarshaller().unmarshall(alternateNameEncodingNode));
    
        NodeList attributesNodes = XpathUtils.asNodeList("Attribute", node);
        for (int attributesIndex = 0; attributesIndex < XpathUtils.nodeLength(attributesNodes); ++attributesIndex) {
            Node attributesNode = attributesNodes.item(attributesIndex);
            item.getAttributes().add(new AttributeUnmarshaller().unmarshall(attributesNode));
            attributesNode.getParentNode().removeChild(attributesNode);
        }
    

        return item;
    }
}
    