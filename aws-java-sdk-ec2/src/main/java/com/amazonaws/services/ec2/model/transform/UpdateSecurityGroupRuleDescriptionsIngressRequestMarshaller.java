/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateSecurityGroupRuleDescriptionsIngressRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityGroupRuleDescriptionsIngressRequestMarshaller implements
        Marshaller<Request<UpdateSecurityGroupRuleDescriptionsIngressRequest>, UpdateSecurityGroupRuleDescriptionsIngressRequest> {

    public Request<UpdateSecurityGroupRuleDescriptionsIngressRequest> marshall(
            UpdateSecurityGroupRuleDescriptionsIngressRequest updateSecurityGroupRuleDescriptionsIngressRequest) {

        if (updateSecurityGroupRuleDescriptionsIngressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateSecurityGroupRuleDescriptionsIngressRequest> request = new DefaultRequest<UpdateSecurityGroupRuleDescriptionsIngressRequest>(
                updateSecurityGroupRuleDescriptionsIngressRequest, "AmazonEC2");
        request.addParameter("Action", "UpdateSecurityGroupRuleDescriptionsIngress");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateSecurityGroupRuleDescriptionsIngressRequest.getGroupId() != null) {
            request.addParameter("GroupId", StringUtils.fromString(updateSecurityGroupRuleDescriptionsIngressRequest.getGroupId()));
        }

        if (updateSecurityGroupRuleDescriptionsIngressRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils.fromString(updateSecurityGroupRuleDescriptionsIngressRequest.getGroupName()));
        }

        com.amazonaws.internal.SdkInternalList<IpPermission> updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsList = (com.amazonaws.internal.SdkInternalList<IpPermission>) updateSecurityGroupRuleDescriptionsIngressRequest
                .getIpPermissions();
        if (!updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsList.isEmpty()
                || !updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsList.isAutoConstruct()) {
            int ipPermissionsListIndex = 1;

            for (IpPermission updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue : updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsList) {

                if (updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue.getFromPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".FromPort",
                            StringUtils.fromInteger(updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue.getFromPort()));
                }

                if (updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue.getIpProtocol() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpProtocol",
                            StringUtils.fromString(updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue.getIpProtocol()));
                }

                com.amazonaws.internal.SdkInternalList<Ipv6Range> ipPermissionIpv6RangesList = (com.amazonaws.internal.SdkInternalList<Ipv6Range>) updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue
                        .getIpv6Ranges();
                if (!ipPermissionIpv6RangesList.isEmpty() || !ipPermissionIpv6RangesList.isAutoConstruct()) {
                    int ipv6RangesListIndex = 1;

                    for (Ipv6Range ipPermissionIpv6RangesListValue : ipPermissionIpv6RangesList) {

                        if (ipPermissionIpv6RangesListValue.getCidrIpv6() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Ipv6Ranges." + ipv6RangesListIndex + ".CidrIpv6",
                                    StringUtils.fromString(ipPermissionIpv6RangesListValue.getCidrIpv6()));
                        }

                        if (ipPermissionIpv6RangesListValue.getDescription() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Ipv6Ranges." + ipv6RangesListIndex + ".Description",
                                    StringUtils.fromString(ipPermissionIpv6RangesListValue.getDescription()));
                        }
                        ipv6RangesListIndex++;
                    }
                }

                com.amazonaws.internal.SdkInternalList<PrefixListId> ipPermissionPrefixListIdsList = (com.amazonaws.internal.SdkInternalList<PrefixListId>) updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue
                        .getPrefixListIds();
                if (!ipPermissionPrefixListIdsList.isEmpty() || !ipPermissionPrefixListIdsList.isAutoConstruct()) {
                    int prefixListIdsListIndex = 1;

                    for (PrefixListId ipPermissionPrefixListIdsListValue : ipPermissionPrefixListIdsList) {

                        if (ipPermissionPrefixListIdsListValue.getDescription() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".PrefixListIds." + prefixListIdsListIndex + ".Description",
                                    StringUtils.fromString(ipPermissionPrefixListIdsListValue.getDescription()));
                        }

                        if (ipPermissionPrefixListIdsListValue.getPrefixListId() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".PrefixListIds." + prefixListIdsListIndex + ".PrefixListId",
                                    StringUtils.fromString(ipPermissionPrefixListIdsListValue.getPrefixListId()));
                        }
                        prefixListIdsListIndex++;
                    }
                }

                if (updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue.getToPort() != null) {
                    request.addParameter("IpPermissions." + ipPermissionsListIndex + ".ToPort",
                            StringUtils.fromInteger(updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue.getToPort()));
                }

                com.amazonaws.internal.SdkInternalList<UserIdGroupPair> ipPermissionUserIdGroupPairsList = (com.amazonaws.internal.SdkInternalList<UserIdGroupPair>) updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue
                        .getUserIdGroupPairs();
                if (!ipPermissionUserIdGroupPairsList.isEmpty() || !ipPermissionUserIdGroupPairsList.isAutoConstruct()) {
                    int userIdGroupPairsListIndex = 1;

                    for (UserIdGroupPair ipPermissionUserIdGroupPairsListValue : ipPermissionUserIdGroupPairsList) {

                        if (ipPermissionUserIdGroupPairsListValue.getDescription() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".Description",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getDescription()));
                        }

                        if (ipPermissionUserIdGroupPairsListValue.getGroupId() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".GroupId",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getGroupId()));
                        }

                        if (ipPermissionUserIdGroupPairsListValue.getGroupName() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".GroupName",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getGroupName()));
                        }

                        if (ipPermissionUserIdGroupPairsListValue.getPeeringStatus() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".PeeringStatus",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getPeeringStatus()));
                        }

                        if (ipPermissionUserIdGroupPairsListValue.getUserId() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".UserId",
                                    StringUtils.fromString(ipPermissionUserIdGroupPairsListValue.getUserId()));
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
                        userIdGroupPairsListIndex++;
                    }
                }

                com.amazonaws.internal.SdkInternalList<IpRange> ipPermissionIpv4RangesList = (com.amazonaws.internal.SdkInternalList<IpRange>) updateSecurityGroupRuleDescriptionsIngressRequestIpPermissionsListValue
                        .getIpv4Ranges();
                if (!ipPermissionIpv4RangesList.isEmpty() || !ipPermissionIpv4RangesList.isAutoConstruct()) {
                    int ipv4RangesListIndex = 1;

                    for (IpRange ipPermissionIpv4RangesListValue : ipPermissionIpv4RangesList) {

                        if (ipPermissionIpv4RangesListValue.getCidrIp() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpRanges." + ipv4RangesListIndex + ".CidrIp",
                                    StringUtils.fromString(ipPermissionIpv4RangesListValue.getCidrIp()));
                        }

                        if (ipPermissionIpv4RangesListValue.getDescription() != null) {
                            request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpRanges." + ipv4RangesListIndex + ".Description",
                                    StringUtils.fromString(ipPermissionIpv4RangesListValue.getDescription()));
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
