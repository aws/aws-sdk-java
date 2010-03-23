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
 * Describe Snapshot Attribute Result Unmarshaller
 */        
public class DescribeSnapshotAttributeResultUnmarshaller implements Unmarshaller<DescribeSnapshotAttributeResult, Node> {

    public DescribeSnapshotAttributeResult unmarshall(Node node) throws Exception {
        DescribeSnapshotAttributeResult describeSnapshotAttributeResult = new DescribeSnapshotAttributeResult();
        
        
        Node snapshotIdNode = XpathUtils.asNode("snapshotId", node);
        describeSnapshotAttributeResult.setSnapshotId(new StringUnmarshaller().unmarshall(snapshotIdNode));
    
        NodeList createVolumePermissionsNodes = XpathUtils.asNodeList("createVolumePermission/item", node);
        for (int createVolumePermissionsIndex = 0; createVolumePermissionsIndex < XpathUtils.nodeLength(createVolumePermissionsNodes); ++createVolumePermissionsIndex) {
            Node createVolumePermissionsNode = createVolumePermissionsNodes.item(createVolumePermissionsIndex);
            describeSnapshotAttributeResult.getCreateVolumePermissions().add(new CreateVolumePermissionUnmarshaller().unmarshall(createVolumePermissionsNode));
            createVolumePermissionsNode.getParentNode().removeChild(createVolumePermissionsNode);
        }
    

        return describeSnapshotAttributeResult;
    }  
}
    