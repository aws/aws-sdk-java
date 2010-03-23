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
 * Snapshot Unmarshaller
 */        
public class SnapshotUnmarshaller implements Unmarshaller<Snapshot, Node> {

    public Snapshot unmarshall(Node node) throws Exception {
        Snapshot snapshot = new Snapshot();
        
        
        Node snapshotIdNode = XpathUtils.asNode("snapshotId", node);
        snapshot.setSnapshotId(new StringUnmarshaller().unmarshall(snapshotIdNode));
    
        Node volumeIdNode = XpathUtils.asNode("volumeId", node);
        snapshot.setVolumeId(new StringUnmarshaller().unmarshall(volumeIdNode));
    
        Node stateNode = XpathUtils.asNode("status", node);
        snapshot.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node startTimeNode = XpathUtils.asNode("startTime", node);
        snapshot.setStartTime(new DateUnmarshaller().unmarshall(startTimeNode));
    
        Node progressNode = XpathUtils.asNode("progress", node);
        snapshot.setProgress(new StringUnmarshaller().unmarshall(progressNode));
    
        Node ownerIdNode = XpathUtils.asNode("ownerId", node);
        snapshot.setOwnerId(new StringUnmarshaller().unmarshall(ownerIdNode));
    
        Node descriptionNode = XpathUtils.asNode("description", node);
        snapshot.setDescription(new StringUnmarshaller().unmarshall(descriptionNode));
    
        Node volumeSizeNode = XpathUtils.asNode("volumeSize", node);
        snapshot.setVolumeSize(new IntegerUnmarshaller().unmarshall(volumeSizeNode));
    
        Node ownerAliasNode = XpathUtils.asNode("ownerAlias", node);
        snapshot.setOwnerAlias(new StringUnmarshaller().unmarshall(ownerAliasNode));
    

        return snapshot;
    }  
}
    