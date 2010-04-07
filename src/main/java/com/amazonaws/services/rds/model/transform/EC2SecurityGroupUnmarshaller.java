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
 * E C2 Security Group Unmarshaller
 */
public class EC2SecurityGroupUnmarshaller implements Unmarshaller<EC2SecurityGroup, Node> {

    public EC2SecurityGroup unmarshall(Node node) throws Exception {
        if (node == null) return null;

        EC2SecurityGroup eC2SecurityGroup = new EC2SecurityGroup();

        
        Node statusNode = XpathUtils.asNode("Status", node);
        eC2SecurityGroup.setStatus(new StringUnmarshaller().unmarshall(statusNode));
    
        Node eC2SecurityGroupNameNode = XpathUtils.asNode("EC2SecurityGroupName", node);
        eC2SecurityGroup.setEC2SecurityGroupName(new StringUnmarshaller().unmarshall(eC2SecurityGroupNameNode));
    
        Node eC2SecurityGroupOwnerIdNode = XpathUtils.asNode("EC2SecurityGroupOwnerId", node);
        eC2SecurityGroup.setEC2SecurityGroupOwnerId(new StringUnmarshaller().unmarshall(eC2SecurityGroupOwnerIdNode));
    

        return eC2SecurityGroup;
    }
}
    