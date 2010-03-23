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
 * Ebs Instance Block Device Unmarshaller
 */        
public class EbsInstanceBlockDeviceUnmarshaller implements Unmarshaller<EbsInstanceBlockDevice, Node> {

    public EbsInstanceBlockDevice unmarshall(Node node) throws Exception {
        EbsInstanceBlockDevice ebsInstanceBlockDevice = new EbsInstanceBlockDevice();
        
        
        Node volumeIdNode = XpathUtils.asNode("volumeId", node);
        ebsInstanceBlockDevice.setVolumeId(new StringUnmarshaller().unmarshall(volumeIdNode));
    
        Node statusNode = XpathUtils.asNode("status", node);
        ebsInstanceBlockDevice.setStatus(new StringUnmarshaller().unmarshall(statusNode));
    
        Node attachTimeNode = XpathUtils.asNode("attachTime", node);
        ebsInstanceBlockDevice.setAttachTime(new DateUnmarshaller().unmarshall(attachTimeNode));
    
        Node deleteOnTerminationNode = XpathUtils.asNode("deleteOnTermination", node);
        ebsInstanceBlockDevice.setDeleteOnTermination(new BooleanUnmarshaller().unmarshall(deleteOnTerminationNode));
    

        return ebsInstanceBlockDevice;
    }  
}
    