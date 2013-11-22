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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Revoke Security Group Egress Request Marshaller
 */
public class RevokeSecurityGroupEgressRequestMarshaller implements Marshaller<Request<RevokeSecurityGroupEgressRequest>, RevokeSecurityGroupEgressRequest> {

    public Request<RevokeSecurityGroupEgressRequest> marshall(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest) {

        if (revokeSecurityGroupEgressRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RevokeSecurityGroupEgressRequest> request = new DefaultRequest<RevokeSecurityGroupEgressRequest>(revokeSecurityGroupEgressRequest, "AmazonEC2");
        request.addParameter("Action", "RevokeSecurityGroupEgress");
        request.addParameter("Version", "2013-10-15");

        if (revokeSecurityGroupEgressRequest.getGroupId() != null) {
            request.addParameter("GroupId", StringUtils.fromString(revokeSecurityGroupEgressRequest.getGroupId()));
        }
        if (revokeSecurityGroupEgressRequest.getSourceSecurityGroupName() != null) {
            request.addParameter("SourceSecurityGroupName", StringUtils.fromString(revokeSecurityGroupEgressRequest.getSourceSecurityGroupName()));
        }
        if (revokeSecurityGroupEgressRequest.getSourceSecurityGroupOwnerId() != null) {
            request.addParameter("SourceSecurityGroupOwnerId", StringUtils.fromString(revokeSecurityGroupEgressRequest.getSourceSecurityGroupOwnerId()));
        }
        if (revokeSecurityGroupEgressRequest.getIpProtocol() != null) {
            request.addParameter("IpProtocol", StringUtils.fromString(revokeSecurityGroupEgressRequest.getIpProtocol()));
        }
        if (revokeSecurityGroupEgressRequest.getFromPort() != null) {
            request.addParameter("FromPort", StringUtils.fromInteger(revokeSecurityGroupEgressRequest.getFromPort()));
        }
        if (revokeSecurityGroupEgressRequest.getToPort() != null) {
            request.addParameter("ToPort", StringUtils.fromInteger(revokeSecurityGroupEgressRequest.getToPort()));
        }
        if (revokeSecurityGroupEgressRequest.getCidrIp() != null) {
            request.addParameter("CidrIp", StringUtils.fromString(revokeSecurityGroupEgressRequest.getCidrIp()));
        }

        java.util.List<IpPermission> ipPermissionsList = revokeSecurityGroupEgressRequest.getIpPermissions();
        int ipPermissionsListIndex = 1;

        for (IpPermission ipPermissionsListValue : ipPermissionsList) {
            IpPermission ipPermissionMember = ipPermissionsListValue;
            if (ipPermissionMember != null) {
                if (ipPermissionMember.getIpProtocol() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpProtocol", StringUtils.fromString(ipPermissionMember.getIpProtocol()));
                }
                if (ipPermissionMember.getFromPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".FromPort", StringUtils.fromInteger(ipPermissionMember.getFromPort()));
                }
                if (ipPermissionMember.getToPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".ToPort", StringUtils.fromInteger(ipPermissionMember.getToPort()));
                }

                java.util.List<UserIdGroupPair> userIdGroupPairsList = ipPermissionMember.getUserIdGroupPairs();
                int userIdGroupPairsListIndex = 1;

                for (UserIdGroupPair userIdGroupPairsListValue : userIdGroupPairsList) {
                    UserIdGroupPair userIdGroupPairMember = userIdGroupPairsListValue;
                    if (userIdGroupPairMember != null) {
                        if (userIdGroupPairMember.getUserId() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".UserId", StringUtils.fromString(userIdGroupPairMember.getUserId()));
                        }
                        if (userIdGroupPairMember.getGroupName() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".GroupName", StringUtils.fromString(userIdGroupPairMember.getGroupName()));
                        }
                        if (userIdGroupPairMember.getGroupId() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".GroupId", StringUtils.fromString(userIdGroupPairMember.getGroupId()));
                        }
                    }

                    userIdGroupPairsListIndex++;
                }

                java.util.List<String> ipRangesList = ipPermissionMember.getIpRanges();
                int ipRangesListIndex = 1;

                for (String ipRangesListValue : ipRangesList) {
                    if (ipRangesListValue != null) {
                        request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpRanges." + ipRangesListIndex + ".CidrIp", StringUtils.fromString(ipRangesListValue));
                    }

                    ipRangesListIndex++;
                }
            }

            ipPermissionsListIndex++;
        }


        return request;
    }
}
