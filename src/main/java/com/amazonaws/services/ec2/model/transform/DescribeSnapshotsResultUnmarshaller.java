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

package com.amazonaws.services.ec2.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Describe Snapshots Result Unmarshaller
 */        
public class DescribeSnapshotsResultUnmarshaller implements Unmarshaller<DescribeSnapshotsResult, Node> {

    public DescribeSnapshotsResult unmarshall(Node node) throws Exception {
        DescribeSnapshotsResult describeSnapshotsResult = new DescribeSnapshotsResult();
        
        
        NodeList snapshotsNodes = XpathUtils.asNodeList("snapshotSet/item", node);
        for (int snapshotsIndex = 0; snapshotsIndex < XpathUtils.nodeLength(snapshotsNodes); ++snapshotsIndex) {
            Node snapshotsNode = snapshotsNodes.item(snapshotsIndex);
            describeSnapshotsResult.getSnapshots().add(new SnapshotUnmarshaller().unmarshall(snapshotsNode));
            snapshotsNode.getParentNode().removeChild(snapshotsNode);
        }
    

        return describeSnapshotsResult;
    }  
}
    