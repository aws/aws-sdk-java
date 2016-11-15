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

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * RevokeSecurityGroupIngressRequest Marshaller
 */

public class RevokeSecurityGroupIngressRequestMarshaller implements Marshaller<Request<RevokeSecurityGroupIngressRequest>, RevokeSecurityGroupIngressRequest> {

    public Request<RevokeSecurityGroupIngressRequest> marshall(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest) {

        if (revokeSecurityGroupIngressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RevokeSecurityGroupIngressRequest> request = new DefaultRequest<RevokeSecurityGroupIngressRequest>(revokeSecurityGroupIngressRequest,
                "AmazonEC2");
        request.addParameter("Action", "RevokeSecurityGroupIngress");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (revokeSecurityGroupIngressRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils.fromString(revokeSecurityGroupIngressRequest.getGroupName()));
        }

        if (revokeSecurityGroupIngressRequest.getGroupId() != null) {
            request.addParameter("GroupId", StringUtils.fromString(revokeSecurityGroupIngressRequest.getGroupId()));
        }

        if (revokeSecurityGroupIngressRequest.getSourceSecurityGroupName() != null) {
            request.addParameter("SourceSecurityGroupName", StringUtils.fromString(revokeSecurityGroupIngressRequest.getSourceSecurityGroupName()));
        }

        if (revokeSecurityGroupIngressRequest.getSourceSecurityGroupOwnerId() != null) {
            request.addParameter("SourceSecurityGroupOwnerId", StringUtils.fromString(revokeSecurityGroupIngressRequest.getSourceSecurityGroupOwnerId()));
        }

        if (revokeSecurityGroupIngressRequest.getIpProtocol() != null) {
            request.addParameter("IpProtocol", StringUtils.fromString(revokeSecurityGroupIngressRequest.getIpProtocol()));
        }

        if (revokeSecurityGroupIngressRequest.getFromPort() != null) {
            request.addParameter("FromPort", StringUtils.fromInteger(revokeSecurityGroupIngressRequest.getFromPort()));
        }

        if (revokeSecurityGroupIngressRequest.getToPort() != null) {
            request.addParameter("ToPort", StringUtils.fromInteger(revokeSecurityGroupIngressRequest.getToPort()));
        }

        if (revokeSecurityGroupIngressRequest.getCidrIp() != null) {
            request.addParameter("CidrIp", StringUtils.fromString(revokeSecurityGroupIngressRequest.getCidrIp()));
        }

        com.amazonaws.internal.SdkInternalList<IpPermission> revokeSecurityGroupIngressRequestIpPermissionsList = (com.amazonaws.internal.SdkInternalList<IpPermission>) revokeSecurityGroupIngressRequest
                .getIpPermissions();
        if (!revokeSecurityGroupIngressRequestIpPermissionsList.isEmpty() || !revokeSecurityGroupIngressRequestIpPermissionsList.isAutoConstruct()) {
            int ipPermissionsListIndex = 1;

            for (IpPermission revokeSecurityGroupIngressRequestIpPermissionsListValue : revokeSecurityGroupIngressRequestIpPermissionsList) {

                if (revokeSecurityGroupIngressRequestIpPermissionsListValue.getIpProtocol() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpProtocol",
                            StringUtils.fromString(revokeSecurityGroupIngressRequestIpPermissionsListValue.getIpProtocol()));
                }

                if (revokeSecurityGroupIngressRequestIpPermissionsListValue.getFromPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".FromPort",
                            StringUtils.fromInteger(revokeSecurityGroupIngressRequestIpPermissionsListValue.getFromPort()));
                }

                if (revokeSecurityGroupIngressRequestIpPermissionsListValue.getToPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".ToPort",
                            StringUtils.fromInteger(revokeSecurityGroupIngressRequestIpPermissionsListValue.getToPort()));
                }

                com.amazonaws.internal.SdkInternalList<UserIdGroupPair> ipPermissionUserIdGroupPairsList = (com.amazonaws.internal.SdkInternalList<UserIdGroupPair>) revokeSecurityGroupIngressRequestIpPermissionsListValue
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

                com.amazonaws.internal.SdkInternalList<PrefixListId> ipPermissionPrefixListIdsList = (com.amazonaws.internal.SdkInternalList<PrefixListId>) revokeSecurityGroupIngressRequestIpPermissionsListValue
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

                com.amazonaws.internal.SdkInternalList<IpRange> ipPermissionIpv4RangesList = (com.amazonaws.internal.SdkInternalList<IpRange>) revokeSecurityGroupIngressRequestIpPermissionsListValue
                        .getIpv4Ranges();
                if (!ipPermissionIpv4RangesList.isEmpty() || !ipPermissionIpv4RangesList.isAutoConstruct()) {
                    int ipv4RangesListIndex = 1;

                    for (IpRange ipPermissionIpv4RangesListValue : ipPermissionIpv4RangesList) {

                        if (ipPermissionIpv4RangesListValue.getCidrIp() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpRanges." + ipv4RangesListIndex + ".CidrIp",
                                    StringUtils.fromString(ipPermissionIpv4RangesListValue.getCidrIp()));
                        }
                        ipv4RangesListIndex++;
                    }
                }
                ipPermissionsListIndex++;
            }
        }

        return request;
    }

}
