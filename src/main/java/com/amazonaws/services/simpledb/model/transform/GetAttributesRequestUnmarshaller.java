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
 * Get Attributes Request Unmarshaller
 */
public class GetAttributesRequestUnmarshaller implements Unmarshaller<GetAttributesRequest, Node> {

    public GetAttributesRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        GetAttributesRequest getAttributesRequest = new GetAttributesRequest();

        
        Node domainNameNode = XpathUtils.asNode("DomainName", node);
        getAttributesRequest.setDomainName(new StringUnmarshaller().unmarshall(domainNameNode));
    
        Node itemNameNode = XpathUtils.asNode("ItemName", node);
        getAttributesRequest.setItemName(new StringUnmarshaller().unmarshall(itemNameNode));
    
        NodeList attributeNamesNodes = XpathUtils.asNodeList("AttributeName", node);
        for (int attributeNamesIndex = 0; attributeNamesIndex < XpathUtils.nodeLength(attributeNamesNodes); ++attributeNamesIndex) {
            Node attributeNamesNode = attributeNamesNodes.item(attributeNamesIndex);
            getAttributesRequest.getAttributeNames().add(new StringUnmarshaller().unmarshall(attributeNamesNode));
            attributeNamesNode.getParentNode().removeChild(attributeNamesNode);
        }
    
        Node consistentReadNode = XpathUtils.asNode("ConsistentRead", node);
        getAttributesRequest.setConsistentRead(new BooleanUnmarshaller().unmarshall(consistentReadNode));
    

        return getAttributesRequest;
    }
}
    