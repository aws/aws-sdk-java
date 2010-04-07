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
 * Domain Metadata Result Unmarshaller
 */
public class DomainMetadataResultUnmarshaller implements Unmarshaller<DomainMetadataResult, Node> {

    public DomainMetadataResult unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DomainMetadataResult domainMetadataResult = new DomainMetadataResult();

        
        Node itemCountNode = XpathUtils.asNode("ItemCount", node);
        domainMetadataResult.setItemCount(new IntegerUnmarshaller().unmarshall(itemCountNode));
    
        Node itemNamesSizeBytesNode = XpathUtils.asNode("ItemNamesSizeBytes", node);
        domainMetadataResult.setItemNamesSizeBytes(new IntegerUnmarshaller().unmarshall(itemNamesSizeBytesNode));
    
        Node attributeNameCountNode = XpathUtils.asNode("AttributeNameCount", node);
        domainMetadataResult.setAttributeNameCount(new IntegerUnmarshaller().unmarshall(attributeNameCountNode));
    
        Node attributeNamesSizeBytesNode = XpathUtils.asNode("AttributeNamesSizeBytes", node);
        domainMetadataResult.setAttributeNamesSizeBytes(new IntegerUnmarshaller().unmarshall(attributeNamesSizeBytesNode));
    
        Node attributeValueCountNode = XpathUtils.asNode("AttributeValueCount", node);
        domainMetadataResult.setAttributeValueCount(new IntegerUnmarshaller().unmarshall(attributeValueCountNode));
    
        Node attributeValuesSizeBytesNode = XpathUtils.asNode("AttributeValuesSizeBytes", node);
        domainMetadataResult.setAttributeValuesSizeBytes(new IntegerUnmarshaller().unmarshall(attributeValuesSizeBytesNode));
    
        Node timestampNode = XpathUtils.asNode("Timestamp", node);
        domainMetadataResult.setTimestamp(new IntegerUnmarshaller().unmarshall(timestampNode));
    

        return domainMetadataResult;
    }
}
    