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
 * Describe D B Security Groups Result Unmarshaller
 */        
public class DescribeDBSecurityGroupsResultUnmarshaller implements Unmarshaller<DescribeDBSecurityGroupsResult, Node> {

    public DescribeDBSecurityGroupsResult unmarshall(Node node) throws Exception {
        DescribeDBSecurityGroupsResult describeDBSecurityGroupsResult = new DescribeDBSecurityGroupsResult();
        
        
        Node markerNode = XpathUtils.asNode("Marker", node);
        describeDBSecurityGroupsResult.setMarker(new StringUnmarshaller().unmarshall(markerNode));
    
        NodeList dBSecurityGroupsNodes = XpathUtils.asNodeList("DBSecurityGroups/DBSecurityGroup", node);
        for (int dBSecurityGroupsIndex = 0; dBSecurityGroupsIndex < XpathUtils.nodeLength(dBSecurityGroupsNodes); ++dBSecurityGroupsIndex) {
            Node dBSecurityGroupsNode = dBSecurityGroupsNodes.item(dBSecurityGroupsIndex);
            describeDBSecurityGroupsResult.getDBSecurityGroups().add(new DBSecurityGroupUnmarshaller().unmarshall(dBSecurityGroupsNode));
            dBSecurityGroupsNode.getParentNode().removeChild(dBSecurityGroupsNode);
        }
    

        return describeDBSecurityGroupsResult;
    }  
}
    