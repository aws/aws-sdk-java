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
 * Describe Events Result Unmarshaller
 */
public class DescribeEventsResultUnmarshaller implements Unmarshaller<DescribeEventsResult, Node> {

    public DescribeEventsResult unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DescribeEventsResult describeEventsResult = new DescribeEventsResult();

        
        Node markerNode = XpathUtils.asNode("Marker", node);
        describeEventsResult.setMarker(new StringUnmarshaller().unmarshall(markerNode));
    
        NodeList eventsNodes = XpathUtils.asNodeList("Events/Event", node);
        for (int eventsIndex = 0; eventsIndex < XpathUtils.nodeLength(eventsNodes); ++eventsIndex) {
            Node eventsNode = eventsNodes.item(eventsIndex);
            describeEventsResult.getEvents().add(new EventUnmarshaller().unmarshall(eventsNode));
            eventsNode.getParentNode().removeChild(eventsNode);
        }
    

        return describeEventsResult;
    }
}
    