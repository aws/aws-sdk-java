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
 * Get Attributes Result Unmarshaller
 */        
public class GetAttributesResultUnmarshaller implements Unmarshaller<GetAttributesResult, Node> {

    public GetAttributesResult unmarshall(Node node) throws Exception {
        GetAttributesResult getAttributesResult = new GetAttributesResult();
        
        
        NodeList attributesNodes = XpathUtils.asNodeList("Attribute", node);
        for (int attributesIndex = 0; attributesIndex < XpathUtils.nodeLength(attributesNodes); ++attributesIndex) {
            Node attributesNode = attributesNodes.item(attributesIndex);
            getAttributesResult.getAttributes().add(new AttributeUnmarshaller().unmarshall(attributesNode));
            attributesNode.getParentNode().removeChild(attributesNode);
        }
    

        return getAttributesResult;
    }  
}
    