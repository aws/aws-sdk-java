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
 * AuthorizeSecurityGroupIngressRequest Marshaller
 */

public class AuthorizeSecurityGroupIngressRequestMarshaller implements
        Marshaller<Request<AuthorizeSecurityGroupIngressRequest>, AuthorizeSecurityGroupIngressRequest> {

    public Request<AuthorizeSecurityGroupIngressRequest> marshall(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest) {

        if (authorizeSecurityGroupIngressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AuthorizeSecurityGroupIngressRequest> request = new DefaultRequest<AuthorizeSecurityGroupIngressRequest>(authorizeSecurityGroupIngressRequest,
                "AmazonEC2");
        request.addParameter("Action", "AuthorizeSecurityGroupIngress");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (authorizeSecurityGroupIngressRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getGroupName()));
        }

        if (authorizeSecurityGroupIngressRequest.getGroupId() != null) {
            request.addParameter("GroupId", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getGroupId()));
        }

        if (authorizeSecurityGroupIngressRequest.getSourceSecurityGroupName() != null) {
            request.addParameter("SourceSecurityGroupName", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getSourceSecurityGroupName()));
        }

        if (authorizeSecurityGroupIngressRequest.getSourceSecurityGroupOwnerId() != null) {
            request.addParameter("SourceSecurityGroupOwnerId", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getSourceSecurityGroupOwnerId()));
        }

        if (authorizeSecurityGroupIngressRequest.getIpProtocol() != null) {
            request.addParameter("IpProtocol", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getIpProtocol()));
        }

        if (authorizeSecurityGroupIngressRequest.getFromPort() != null) {
            request.addParameter("FromPort", StringUtils.fromInteger(authorizeSecurityGroupIngressRequest.getFromPort()));
        }

        if (authorizeSecurityGroupIngressRequest.getToPort() != null) {
            request.addParameter("ToPort", StringUtils.fromInteger(authorizeSecurityGroupIngressRequest.getToPort()));
        }

        if (authorizeSecurityGroupIngressRequest.getCidrIp() != null) {
            request.addParameter("CidrIp", StringUtils.fromString(authorizeSecurityGroupIngressRequest.getCidrIp()));
        }

        com.amazonaws.internal.SdkInternalList<IpPermission> authorizeSecurityGroupIngressRequestIpPermissionsList = (com.amazonaws.internal.SdkInternalList<IpPermission>) authorizeSecurityGroupIngressRequest
                .getIpPermissions();
        if (!authorizeSecurityGroupIngressRequestIpPermissionsList.isEmpty() || !authorizeSecurityGroupIngressRequestIpPermissionsList.isAutoConstruct()) {
            int ipPermissionsListIndex = 1;

            for (IpPermission authorizeSecurityGroupIngressRequestIpPermissionsListValue : authorizeSecurityGroupIngressRequestIpPermissionsList) {

                if (authorizeSecurityGroupIngressRequestIpPermissionsListValue.getIpProtocol() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpProtocol",
                            StringUtils.fromString(authorizeSecurityGroupIngressRequestIpPermissionsListValue.getIpProtocol()));
                }

                if (authorizeSecurityGroupIngressRequestIpPermissionsListValue.getFromPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".FromPort",
                            StringUtils.fromInteger(authorizeSecurityGroupIngressRequestIpPermissionsListValue.getFromPort()));
                }

                if (authorizeSecurityGroupIngressRequestIpPermissionsListValue.getToPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".ToPort",
                            StringUtils.fromInteger(authorizeSecurityGroupIngressRequestIpPermissionsListValue.getToPort()));
                }

                com.amazonaws.internal.SdkInternalList<UserIdGroupPair> ipPermissionUserIdGroupPairsList = (com.amazonaws.internal.SdkInternalList<UserIdGroupPair>) authorizeSecurityGroupIngressRequestIpPermissionsListValue
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

                com.amazonaws.internal.SdkInternalList<PrefixListId> ipPermissionPrefixListIdsList = (com.amazonaws.internal.SdkInternalList<PrefixListId>) authorizeSecurityGroupIngressRequestIpPermissionsListValue
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

                com.amazonaws.internal.SdkInternalList<IpRange> ipPermissionIpv4RangesList = (com.amazonaws.internal.SdkInternalList<IpRange>) authorizeSecurityGroupIngressRequestIpPermissionsListValue
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
