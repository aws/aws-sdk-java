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
 * Volume Attachment Unmarshaller
 */        
public class VolumeAttachmentUnmarshaller implements Unmarshaller<VolumeAttachment, Node> {

    public VolumeAttachment unmarshall(Node node) throws Exception {
        VolumeAttachment volumeAttachment = new VolumeAttachment();
        
        
        Node volumeIdNode = XpathUtils.asNode("volumeId", node);
        volumeAttachment.setVolumeId(new StringUnmarshaller().unmarshall(volumeIdNode));
    
        Node instanceIdNode = XpathUtils.asNode("instanceId", node);
        volumeAttachment.setInstanceId(new StringUnmarshaller().unmarshall(instanceIdNode));
    
        Node deviceNode = XpathUtils.asNode("device", node);
        volumeAttachment.setDevice(new StringUnmarshaller().unmarshall(deviceNode));
    
        Node stateNode = XpathUtils.asNode("status", node);
        volumeAttachment.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node attachTimeNode = XpathUtils.asNode("attachTime", node);
        volumeAttachment.setAttachTime(new DateUnmarshaller().unmarshall(attachTimeNode));
    
        Node deleteOnTerminationNode = XpathUtils.asNode("deleteOnTermination", node);
        volumeAttachment.setDeleteOnTermination(new BooleanUnmarshaller().unmarshall(deleteOnTerminationNode));
    

        return volumeAttachment;
    }  
}
    