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
 * Select Result Unmarshaller
 */        
public class SelectResultUnmarshaller implements Unmarshaller<SelectResult, Node> {

    public SelectResult unmarshall(Node node) throws Exception {
        SelectResult selectResult = new SelectResult();
        
        
        NodeList itemsNodes = XpathUtils.asNodeList("Item", node);
        for (int itemsIndex = 0; itemsIndex < XpathUtils.nodeLength(itemsNodes); ++itemsIndex) {
            Node itemsNode = itemsNodes.item(itemsIndex);
            selectResult.getItems().add(new ItemUnmarshaller().unmarshall(itemsNode));
            itemsNode.getParentNode().removeChild(itemsNode);
        }
    
        Node nextTokenNode = XpathUtils.asNode("NextToken", node);
        selectResult.setNextToken(new StringUnmarshaller().unmarshall(nextTokenNode));
    

        return selectResult;
    }  
}
    