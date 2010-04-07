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
 * Volume Unmarshaller
 */
public class VolumeUnmarshaller implements Unmarshaller<Volume, Node> {

    public Volume unmarshall(Node node) throws Exception {
        if (node == null) return null;

        Volume volume = new Volume();

        
        Node volumeIdNode = XpathUtils.asNode("volumeId", node);
        volume.setVolumeId(new StringUnmarshaller().unmarshall(volumeIdNode));
    
        Node sizeNode = XpathUtils.asNode("size", node);
        volume.setSize(new IntegerUnmarshaller().unmarshall(sizeNode));
    
        Node snapshotIdNode = XpathUtils.asNode("snapshotId", node);
        volume.setSnapshotId(new StringUnmarshaller().unmarshall(snapshotIdNode));
    
        Node availabilityZoneNode = XpathUtils.asNode("availabilityZone", node);
        volume.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    
        Node stateNode = XpathUtils.asNode("status", node);
        volume.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node createTimeNode = XpathUtils.asNode("createTime", node);
        volume.setCreateTime(new DateUnmarshaller().unmarshall(createTimeNode));
    
        NodeList attachmentsNodes = XpathUtils.asNodeList("attachmentSet/item", node);
        for (int attachmentsIndex = 0; attachmentsIndex < XpathUtils.nodeLength(attachmentsNodes); ++attachmentsIndex) {
            Node attachmentsNode = attachmentsNodes.item(attachmentsIndex);
            volume.getAttachments().add(new VolumeAttachmentUnmarshaller().unmarshall(attachmentsNode));
            attachmentsNode.getParentNode().removeChild(attachmentsNode);
        }
    

        return volume;
    }
}
    