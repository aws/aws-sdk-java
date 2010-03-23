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
 * Describe Snapshots Request Unmarshaller
 */        
public class DescribeSnapshotsRequestUnmarshaller implements Unmarshaller<DescribeSnapshotsRequest, Node> {

    public DescribeSnapshotsRequest unmarshall(Node node) throws Exception {
        DescribeSnapshotsRequest describeSnapshotsRequest = new DescribeSnapshotsRequest();
        
        
        NodeList snapshotIdsNodes = XpathUtils.asNodeList("SnapshotId/SnapshotId", node);
        for (int snapshotIdsIndex = 0; snapshotIdsIndex < XpathUtils.nodeLength(snapshotIdsNodes); ++snapshotIdsIndex) {
            Node snapshotIdsNode = snapshotIdsNodes.item(snapshotIdsIndex);
            describeSnapshotsRequest.getSnapshotIds().add(new StringUnmarshaller().unmarshall(snapshotIdsNode));
            snapshotIdsNode.getParentNode().removeChild(snapshotIdsNode);
        }
    
        NodeList ownerIdsNodes = XpathUtils.asNodeList("Owner/Owner", node);
        for (int ownerIdsIndex = 0; ownerIdsIndex < XpathUtils.nodeLength(ownerIdsNodes); ++ownerIdsIndex) {
            Node ownerIdsNode = ownerIdsNodes.item(ownerIdsIndex);
            describeSnapshotsRequest.getOwnerIds().add(new StringUnmarshaller().unmarshall(ownerIdsNode));
            ownerIdsNode.getParentNode().removeChild(ownerIdsNode);
        }
    
        NodeList restorableByUserIdsNodes = XpathUtils.asNodeList("RestorableBy/member", node);
        for (int restorableByUserIdsIndex = 0; restorableByUserIdsIndex < XpathUtils.nodeLength(restorableByUserIdsNodes); ++restorableByUserIdsIndex) {
            Node restorableByUserIdsNode = restorableByUserIdsNodes.item(restorableByUserIdsIndex);
            describeSnapshotsRequest.getRestorableByUserIds().add(new StringUnmarshaller().unmarshall(restorableByUserIdsNode));
            restorableByUserIdsNode.getParentNode().removeChild(restorableByUserIdsNode);
        }
    

        return describeSnapshotsRequest;
    }  
}
    