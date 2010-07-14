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
 * Revoke Security Group Ingress Request Marshaller
 */        
public class RevokeSecurityGroupIngressRequestMarshaller implements Marshaller<Request<RevokeSecurityGroupIngressRequest>, RevokeSecurityGroupIngressRequest> {

    public Request<RevokeSecurityGroupIngressRequest> marshall(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest) {
        Request<RevokeSecurityGroupIngressRequest> request = new DefaultRequest<RevokeSecurityGroupIngressRequest>(revokeSecurityGroupIngressRequest, "AmazonEC2");
        request.addParameter("Action", "RevokeSecurityGroupIngress");
        request.addParameter("Version", "2010-06-15");
        if (revokeSecurityGroupIngressRequest != null) {
            if (revokeSecurityGroupIngressRequest.getGroupName() != null) {
                request.addParameter("GroupName", StringUtils.fromString(revokeSecurityGroupIngressRequest.getGroupName()));
            }
        }
        if (revokeSecurityGroupIngressRequest != null) {
            if (revokeSecurityGroupIngressRequest.getSourceSecurityGroupName() != null) {
                request.addParameter("SourceSecurityGroupName", StringUtils.fromString(revokeSecurityGroupIngressRequest.getSourceSecurityGroupName()));
            }
        }
        if (revokeSecurityGroupIngressRequest != null) {
            if (revokeSecurityGroupIngressRequest.getSourceSecurityGroupOwnerId() != null) {
                request.addParameter("SourceSecurityGroupOwnerId", StringUtils.fromString(revokeSecurityGroupIngressRequest.getSourceSecurityGroupOwnerId()));
            }
        }
        if (revokeSecurityGroupIngressRequest != null) {
            if (revokeSecurityGroupIngressRequest.getIpProtocol() != null) {
                request.addParameter("IpProtocol", StringUtils.fromString(revokeSecurityGroupIngressRequest.getIpProtocol()));
            }
        }
        if (revokeSecurityGroupIngressRequest != null) {
            if (revokeSecurityGroupIngressRequest.getFromPort() != null) {
                request.addParameter("FromPort", StringUtils.fromInteger(revokeSecurityGroupIngressRequest.getFromPort()));
            }
        }
        if (revokeSecurityGroupIngressRequest != null) {
            if (revokeSecurityGroupIngressRequest.getToPort() != null) {
                request.addParameter("ToPort", StringUtils.fromInteger(revokeSecurityGroupIngressRequest.getToPort()));
            }
        }
        if (revokeSecurityGroupIngressRequest != null) {
            if (revokeSecurityGroupIngressRequest.getCidrIp() != null) {
                request.addParameter("CidrIp", StringUtils.fromString(revokeSecurityGroupIngressRequest.getCidrIp()));
            }
        }


        return request;
    }
}
