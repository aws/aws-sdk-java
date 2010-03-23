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

package com.amazonaws.services.rds.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Event Unmarshaller
 */        
public class EventUnmarshaller implements Unmarshaller<Event, Node> {

    public Event unmarshall(Node node) throws Exception {
        Event event = new Event();
        
        
        Node sourceIdentifierNode = XpathUtils.asNode("SourceIdentifier", node);
        event.setSourceIdentifier(new StringUnmarshaller().unmarshall(sourceIdentifierNode));
    
        Node sourceTypeNode = XpathUtils.asNode("SourceType", node);
        event.setSourceType(new StringUnmarshaller().unmarshall(sourceTypeNode));
    
        Node messageNode = XpathUtils.asNode("Message", node);
        event.setMessage(new StringUnmarshaller().unmarshall(messageNode));
    
        Node dateNode = XpathUtils.asNode("Date", node);
        event.setDate(new DateUnmarshaller().unmarshall(dateNode));
    

        return event;
    }  
}
    