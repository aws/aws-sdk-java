/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * RevokeSecurityGroupEgressRequest Marshaller
 */

public class RevokeSecurityGroupEgressRequestMarshaller implements Marshaller<Request<RevokeSecurityGroupEgressRequest>, RevokeSecurityGroupEgressRequest> {

    public Request<RevokeSecurityGroupEgressRequest> marshall(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest) {

        if (revokeSecurityGroupEgressRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RevokeSecurityGroupEgressRequest> request = new DefaultRequest<RevokeSecurityGroupEgressRequest>(revokeSecurityGroupEgressRequest, "AmazonEC2");
        request.addParameter("Action", "RevokeSecurityGroupEgress");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

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

        com.amazonaws.internal.SdkInternalList<IpPermission> revokeSecurityGroupEgressRequestIpPermissionsList = (com.amazonaws.internal.SdkInternalList<IpPermission>) revokeSecurityGroupEgressRequest
                .getIpPermissions();
        if (!revokeSecurityGroupEgressRequestIpPermissionsList.isEmpty() || !revokeSecurityGroupEgressRequestIpPermissionsList.isAutoConstruct()) {
            int ipPermissionsListIndex = 1;

            for (IpPermission revokeSecurityGroupEgressRequestIpPermissionsListValue : revokeSecurityGroupEgressRequestIpPermissionsList) {

                if (revokeSecurityGroupEgressRequestIpPermissionsListValue.getIpProtocol() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpProtocol",
                            StringUtils.fromString(revokeSecurityGroupEgressRequestIpPermissionsListValue.getIpProtocol()));
                }

                if (revokeSecurityGroupEgressRequestIpPermissionsListValue.getFromPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".FromPort",
                            StringUtils.fromInteger(revokeSecurityGroupEgressRequestIpPermissionsListValue.getFromPort()));
                }

                if (revokeSecurityGroupEgressRequestIpPermissionsListValue.getToPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".ToPort",
                            StringUtils.fromInteger(revokeSecurityGroupEgressRequestIpPermissionsListValue.getToPort()));
                }

                com.amazonaws.internal.SdkInternalList<UserIdGroupPair> ipPermissionUserIdGroupPairsList = (com.amazonaws.internal.SdkInternalList<UserIdGroupPair>) revokeSecurityGroupEgressRequestIpPermissionsListValue
                        .getUserIdGroupPairs();
                if (!ipPermissionUserIdGroupPairsList.isEmpty() || !ipPermissionUserIdGroupPairsList.isAutoConstruct()) {
                    int userIdGroupPairsListIndex = 1;

                    for (UserIdGroupPair ipPermissionUserIdGroupPairsListValue : ipPermissionUserIdGroupPairsList) {

                        if (ipPermissionUserIdGroupPairsListValue.getUserId() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".UserId",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getUserId()));
                        }

                        if (ipPermissionUserIdGroupPairsListValue.getGroupName() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".GroupName",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getGroupName()));
                        }

                        if (ipPermissionUserIdGroupPairsListValue.getGroupId() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".GroupId",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getGroupId()));
                        }

                        if (ipPermissionUserIdGroupPairsListValue.getVpcId() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".VpcId",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getVpcId()));
                        }

                        if (ipPermissionUserIdGroupPairsListValue.getVpcPeeringConnectionId() != null) {
                            request.addParameter(
                                    "IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".VpcPeeringConnectionId",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getVpcPeeringConnectionId()));
                        }

                        if (ipPermissionUserIdGroupPairsListValue.getPeeringStatus() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".PeeringStatus",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getPeeringStatus()));
                        }
                        userIdGroupPairsListIndex++;
                    }
                }

                com.amazonaws.internal.SdkInternalList<String> ipPermissionIpRangesList = (com.amazonaws.internal.SdkInternalList<String>) revokeSecurityGroupEgressRequestIpPermissionsListValue
                        .getIpRanges();
                if (!ipPermissionIpRangesList.isEmpty() || !ipPermissionIpRangesList.isAutoConstruct()) {
                    int ipRangesListIndex = 1;

                    for (String ipPermissionIpRangesListValue : ipPermissionIpRangesList) {
                        if (ipPermissionIpRangesListValue != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpRanges." + ipRangesListIndex + ".CidrIp",
                                    StringUtils.fromString(ipPermissionIpRangesListValue));
                        }
                        ipRangesListIndex++;
                    }
                }

                com.amazonaws.internal.SdkInternalList<PrefixListId> ipPermissionPrefixListIdsList = (com.amazonaws.internal.SdkInternalList<PrefixListId>) revokeSecurityGroupEgressRequestIpPermissionsListValue
                        .getPrefixListIds();
                if (!ipPermissionPrefixListIdsList.isEmpty() || !ipPermissionPrefixListIdsList.isAutoConstruct()) {
                    int prefixListIdsListIndex = 1;

                    for (PrefixListId ipPermissionPrefixListIdsListValue : ipPermissionPrefixListIdsList) {

                        if (ipPermissionPrefixListIdsListValue.getPrefixListId() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".PrefixListIds." + prefixListIdsListIndex + ".PrefixListId",
                                    StringUtils.fromString(ipPermissionPrefixListIdsListValue.getPrefixListId()));
                        }
                        prefixListIdsListIndex++;
                    }
                }
                ipPermissionsListIndex++;
            }
        }

        return request;
    }

}
