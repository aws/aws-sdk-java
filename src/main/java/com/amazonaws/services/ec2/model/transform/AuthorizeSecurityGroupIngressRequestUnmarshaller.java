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
 * Authorize Security Group Ingress Request Unmarshaller
 */
public class AuthorizeSecurityGroupIngressRequestUnmarshaller implements Unmarshaller<AuthorizeSecurityGroupIngressRequest, Node> {

    public AuthorizeSecurityGroupIngressRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest = new AuthorizeSecurityGroupIngressRequest();

        
        Node groupNameNode = XpathUtils.asNode("GroupName", node);
        authorizeSecurityGroupIngressRequest.setGroupName(new StringUnmarshaller().unmarshall(groupNameNode));
    
        Node sourceSecurityGroupNameNode = XpathUtils.asNode("SourceSecurityGroupName", node);
        authorizeSecurityGroupIngressRequest.setSourceSecurityGroupName(new StringUnmarshaller().unmarshall(sourceSecurityGroupNameNode));
    
        Node sourceSecurityGroupOwnerIdNode = XpathUtils.asNode("SourceSecurityGroupOwnerId", node);
        authorizeSecurityGroupIngressRequest.setSourceSecurityGroupOwnerId(new StringUnmarshaller().unmarshall(sourceSecurityGroupOwnerIdNode));
    
        Node ipProtocolNode = XpathUtils.asNode("IpProtocol", node);
        authorizeSecurityGroupIngressRequest.setIpProtocol(new StringUnmarshaller().unmarshall(ipProtocolNode));
    
        Node fromPortNode = XpathUtils.asNode("FromPort", node);
        authorizeSecurityGroupIngressRequest.setFromPort(new IntegerUnmarshaller().unmarshall(fromPortNode));
    
        Node toPortNode = XpathUtils.asNode("ToPort", node);
        authorizeSecurityGroupIngressRequest.setToPort(new IntegerUnmarshaller().unmarshall(toPortNode));
    
        Node cidrIpNode = XpathUtils.asNode("CidrIp", node);
        authorizeSecurityGroupIngressRequest.setCidrIp(new StringUnmarshaller().unmarshall(cidrIpNode));
    

        return authorizeSecurityGroupIngressRequest;
    }
}
    