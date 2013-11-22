/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Revoke D B Security Group Ingress Request Marshaller
 */
public class RevokeDBSecurityGroupIngressRequestMarshaller implements Marshaller<Request<RevokeDBSecurityGroupIngressRequest>, RevokeDBSecurityGroupIngressRequest> {

    public Request<RevokeDBSecurityGroupIngressRequest> marshall(RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest) {

        if (revokeDBSecurityGroupIngressRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RevokeDBSecurityGroupIngressRequest> request = new DefaultRequest<RevokeDBSecurityGroupIngressRequest>(revokeDBSecurityGroupIngressRequest, "AmazonRDS");
        request.addParameter("Action", "RevokeDBSecurityGroupIngress");
        request.addParameter("Version", "2013-09-09");

        if (revokeDBSecurityGroupIngressRequest.getDBSecurityGroupName() != null) {
            request.addParameter("DBSecurityGroupName", StringUtils.fromString(revokeDBSecurityGroupIngressRequest.getDBSecurityGroupName()));
        }
        if (revokeDBSecurityGroupIngressRequest.getCIDRIP() != null) {
            request.addParameter("CIDRIP", StringUtils.fromString(revokeDBSecurityGroupIngressRequest.getCIDRIP()));
        }
        if (revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupName() != null) {
            request.addParameter("EC2SecurityGroupName", StringUtils.fromString(revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupName()));
        }
        if (revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupId() != null) {
            request.addParameter("EC2SecurityGroupId", StringUtils.fromString(revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupId()));
        }
        if (revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId() != null) {
            request.addParameter("EC2SecurityGroupOwnerId", StringUtils.fromString(revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId()));
        }


        return request;
    }
}
