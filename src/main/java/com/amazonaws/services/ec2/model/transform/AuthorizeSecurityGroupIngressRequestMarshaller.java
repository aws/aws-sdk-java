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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Authorize Security Group Ingress Request Marshaller
 */        
public class AuthorizeSecurityGroupIngressRequestMarshaller implements Marshaller<Request<AuthorizeSecurityGroupIngressRequest>, AuthorizeSecurityGroupIngressRequest> {

    public Request<AuthorizeSecurityGroupIngressRequest> marshall(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest) {
        Request<AuthorizeSecurityGroupIngressRequest> request = new DefaultRequest<AuthorizeSecurityGroupIngressRequest>(authorizeSecurityGroupIngressRequest, "AmazonEC2");
        request.addParameter("Action", "AuthorizeSecurityGroupIngress");
        request.addParameter("Version", "2010-06-15");
        if (authorizeSecurityGroupIngressRequest != null) {
            if (authorizeSecurityGroupIngressRequest.getGroupName() != null) {
                request.addParameter("GroupName", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getGroupName()));
            }
        }
        if (authorizeSecurityGroupIngressRequest != null) {
            if (authorizeSecurityGroupIngressRequest.getSourceSecurityGroupName() != null) {
                request.addParameter("SourceSecurityGroupName", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getSourceSecurityGroupName()));
            }
        }
        if (authorizeSecurityGroupIngressRequest != null) {
            if (authorizeSecurityGroupIngressRequest.getSourceSecurityGroupOwnerId() != null) {
                request.addParameter("SourceSecurityGroupOwnerId", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getSourceSecurityGroupOwnerId()));
            }
        }
        if (authorizeSecurityGroupIngressRequest != null) {
            if (authorizeSecurityGroupIngressRequest.getIpProtocol() != null) {
                request.addParameter("IpProtocol", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getIpProtocol()));
            }
        }
        if (authorizeSecurityGroupIngressRequest != null) {
            if (authorizeSecurityGroupIngressRequest.getFromPort() != null) {
                request.addParameter("FromPort", StringUtils.fromInteger(authorizeSecurityGroupIngressRequest.getFromPort()));
            }
        }
        if (authorizeSecurityGroupIngressRequest != null) {
            if (authorizeSecurityGroupIngressRequest.getToPort() != null) {
                request.addParameter("ToPort", StringUtils.fromInteger(authorizeSecurityGroupIngressRequest.getToPort()));
            }
        }
        if (authorizeSecurityGroupIngressRequest != null) {
            if (authorizeSecurityGroupIngressRequest.getCidrIp() != null) {
                request.addParameter("CidrIp", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getCidrIp()));
            }
        }


        return request;
    }
}
