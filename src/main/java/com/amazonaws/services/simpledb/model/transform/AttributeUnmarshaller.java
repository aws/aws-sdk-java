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
 * Attribute Unmarshaller
 */        
public class AttributeUnmarshaller implements Unmarshaller<Attribute, Node> {

    public Attribute unmarshall(Node node) throws Exception {
        Attribute attribute = new Attribute();
        
        
        Node nameNode = XpathUtils.asNode("Name", node);
        attribute.setName(new StringUnmarshaller().unmarshall(nameNode));
    
        Node alternateNameEncodingNode = XpathUtils.asNode("Name/@encoding", node);
        attribute.setAlternateNameEncoding(new StringUnmarshaller().unmarshall(alternateNameEncodingNode));
    
        Node valueNode = XpathUtils.asNode("Value", node);
        attribute.setValue(new StringUnmarshaller().unmarshall(valueNode));
    
        Node alternateValueEncodingNode = XpathUtils.asNode("Value/@encoding", node);
        attribute.setAlternateValueEncoding(new StringUnmarshaller().unmarshall(alternateValueEncodingNode));
    

        return attribute;
    }  
}
    