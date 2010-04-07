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
 * Batch Put Attributes Request Unmarshaller
 */
public class BatchPutAttributesRequestUnmarshaller implements Unmarshaller<BatchPutAttributesRequest, Node> {

    public BatchPutAttributesRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        BatchPutAttributesRequest batchPutAttributesRequest = new BatchPutAttributesRequest();

        
        Node domainNameNode = XpathUtils.asNode("DomainName", node);
        batchPutAttributesRequest.setDomainName(new StringUnmarshaller().unmarshall(domainNameNode));
    
        NodeList itemsNodes = XpathUtils.asNodeList("Item", node);
        for (int itemsIndex = 0; itemsIndex < XpathUtils.nodeLength(itemsNodes); ++itemsIndex) {
            Node itemsNode = itemsNodes.item(itemsIndex);
            batchPutAttributesRequest.getItems().add(new ReplaceableItemUnmarshaller().unmarshall(itemsNode));
            itemsNode.getParentNode().removeChild(itemsNode);
        }
    

        return batchPutAttributesRequest;
    }
}
    