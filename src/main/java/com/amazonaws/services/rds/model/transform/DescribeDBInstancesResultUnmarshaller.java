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
 * Describe D B Instances Result Unmarshaller
 */
public class DescribeDBInstancesResultUnmarshaller implements Unmarshaller<DescribeDBInstancesResult, Node> {

    public DescribeDBInstancesResult unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DescribeDBInstancesResult describeDBInstancesResult = new DescribeDBInstancesResult();

        
        Node markerNode = XpathUtils.asNode("Marker", node);
        describeDBInstancesResult.setMarker(new StringUnmarshaller().unmarshall(markerNode));
    
        NodeList dBInstancesNodes = XpathUtils.asNodeList("DBInstances/DBInstance", node);
        for (int dBInstancesIndex = 0; dBInstancesIndex < XpathUtils.nodeLength(dBInstancesNodes); ++dBInstancesIndex) {
            Node dBInstancesNode = dBInstancesNodes.item(dBInstancesIndex);
            describeDBInstancesResult.getDBInstances().add(new DBInstanceUnmarshaller().unmarshall(dBInstancesNode));
            dBInstancesNode.getParentNode().removeChild(dBInstancesNode);
        }
    

        return describeDBInstancesResult;
    }
}
    