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
 * Block Device Mapping Unmarshaller
 */
public class BlockDeviceMappingUnmarshaller implements Unmarshaller<BlockDeviceMapping, Node> {

    public BlockDeviceMapping unmarshall(Node node) throws Exception {
        if (node == null) return null;

        BlockDeviceMapping blockDeviceMapping = new BlockDeviceMapping();

        
        Node virtualNameNode = XpathUtils.asNode("virtualName", node);
        blockDeviceMapping.setVirtualName(new StringUnmarshaller().unmarshall(virtualNameNode));
    
        Node deviceNameNode = XpathUtils.asNode("deviceName", node);
        blockDeviceMapping.setDeviceName(new StringUnmarshaller().unmarshall(deviceNameNode));
    
        Node ebsNode = XpathUtils.asNode("ebs", node);
        blockDeviceMapping.setEbs(new EbsBlockDeviceUnmarshaller().unmarshall(ebsNode));
    
        Node noDeviceNode = XpathUtils.asNode("noDevice", node);
        blockDeviceMapping.setNoDevice(new StringUnmarshaller().unmarshall(noDeviceNode));
    

        return blockDeviceMapping;
    }
}
    