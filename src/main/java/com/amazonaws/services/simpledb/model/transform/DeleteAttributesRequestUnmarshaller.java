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
 * Delete Attributes Request Unmarshaller
 */
public class DeleteAttributesRequestUnmarshaller implements Unmarshaller<DeleteAttributesRequest, Node> {

    public DeleteAttributesRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DeleteAttributesRequest deleteAttributesRequest = new DeleteAttributesRequest();

        
        Node domainNameNode = XpathUtils.asNode("DomainName", node);
        deleteAttributesRequest.setDomainName(new StringUnmarshaller().unmarshall(domainNameNode));
    
        Node itemNameNode = XpathUtils.asNode("ItemName", node);
        deleteAttributesRequest.setItemName(new StringUnmarshaller().unmarshall(itemNameNode));
    
        NodeList attributesNodes = XpathUtils.asNodeList("Attribute", node);
        for (int attributesIndex = 0; attributesIndex < XpathUtils.nodeLength(attributesNodes); ++attributesIndex) {
            Node attributesNode = attributesNodes.item(attributesIndex);
            deleteAttributesRequest.getAttributes().add(new AttributeUnmarshaller().unmarshall(attributesNode));
            attributesNode.getParentNode().removeChild(attributesNode);
        }
    
        Node expectedNode = XpathUtils.asNode("Expected", node);
        deleteAttributesRequest.setExpected(new UpdateConditionUnmarshaller().unmarshall(expectedNode));
    

        return deleteAttributesRequest;
    }
}
    