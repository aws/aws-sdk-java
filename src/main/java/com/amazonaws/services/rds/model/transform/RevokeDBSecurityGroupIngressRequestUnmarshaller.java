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
 * Revoke D B Security Group Ingress Request Unmarshaller
 */        
public class RevokeDBSecurityGroupIngressRequestUnmarshaller implements Unmarshaller<RevokeDBSecurityGroupIngressRequest, Node> {

    public RevokeDBSecurityGroupIngressRequest unmarshall(Node node) throws Exception {
        RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest = new RevokeDBSecurityGroupIngressRequest();
        
        
        Node dBSecurityGroupNameNode = XpathUtils.asNode("DBSecurityGroupName", node);
        revokeDBSecurityGroupIngressRequest.setDBSecurityGroupName(new StringUnmarshaller().unmarshall(dBSecurityGroupNameNode));
    
        Node cIDRIPNode = XpathUtils.asNode("CIDRIP", node);
        revokeDBSecurityGroupIngressRequest.setCIDRIP(new StringUnmarshaller().unmarshall(cIDRIPNode));
    
        Node eC2SecurityGroupNameNode = XpathUtils.asNode("EC2SecurityGroupName", node);
        revokeDBSecurityGroupIngressRequest.setEC2SecurityGroupName(new StringUnmarshaller().unmarshall(eC2SecurityGroupNameNode));
    
        Node eC2SecurityGroupOwnerIdNode = XpathUtils.asNode("EC2SecurityGroupOwnerId", node);
        revokeDBSecurityGroupIngressRequest.setEC2SecurityGroupOwnerId(new StringUnmarshaller().unmarshall(eC2SecurityGroupOwnerIdNode));
    

        return revokeDBSecurityGroupIngressRequest;
    }  
}
    