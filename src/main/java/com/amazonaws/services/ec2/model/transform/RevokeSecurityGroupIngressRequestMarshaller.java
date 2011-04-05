/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        request.addParameter("Version", "2011-02-28");
        if (revokeSecurityGroupIngressRequest != null) {
            if (revokeSecurityGroupIngressRequest.getGroupName() != null) {
                request.addParameter("GroupName", StringUtils.fromString(revokeSecurityGroupIngressRequest.getGroupName()));
            }
        }
        if (revokeSecurityGroupIngressRequest != null) {
            if (revokeSecurityGroupIngressRequest.getGroupId() != null) {
                request.addParameter("GroupId", StringUtils.fromString(revokeSecurityGroupIngressRequest.getGroupId()));
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

        if (revokeSecurityGroupIngressRequest != null) {
            java.util.List<IpPermission> ipPermissionsList = revokeSecurityGroupIngressRequest.getIpPermissions();
            int ipPermissionsListIndex = 1;
            for (IpPermission ipPermissionsListValue : ipPermissionsList) {
                if (ipPermissionsListValue != null) {
                    if (ipPermissionsListValue.getIpProtocol() != null) {
                        request.addParameter("IpPermissions." + ipPermissionsListIndex + ".IpProtocol", StringUtils.fromString(ipPermissionsListValue.getIpProtocol()));
                    }
                }
                if (ipPermissionsListValue != null) {
                    if (ipPermissionsListValue.getFromPort() != null) {
                        request.addParameter("IpPermissions." + ipPermissionsListIndex + ".FromPort", StringUtils.fromInteger(ipPermissionsListValue.getFromPort()));
                    }
                }
                if (ipPermissionsListValue != null) {
                    if (ipPermissionsListValue.getToPort() != null) {
                        request.addParameter("IpPermissions." + ipPermissionsListIndex + ".ToPort", StringUtils.fromInteger(ipPermissionsListValue.getToPort()));
                    }
                }

                if (ipPermissionsListValue != null) {
                    java.util.List<UserIdGroupPair> userIdGroupPairsList = ipPermissionsListValue.getUserIdGroupPairs();
                    int userIdGroupPairsListIndex = 1;
                    for (UserIdGroupPair userIdGroupPairsListValue : userIdGroupPairsList) {
                        if (userIdGroupPairsListValue != null) {
                            if (userIdGroupPairsListValue.getUserId() != null) {
                                request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".UserId", StringUtils.fromString(userIdGroupPairsListValue.getUserId()));
                            }
                        }
                        if (userIdGroupPairsListValue != null) {
                            if (userIdGroupPairsListValue.getGroupName() != null) {
                                request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".GroupName", StringUtils.fromString(userIdGroupPairsListValue.getGroupName()));
                            }
                        }
                        if (userIdGroupPairsListValue != null) {
                            if (userIdGroupPairsListValue.getGroupId() != null) {
                                request.addParameter("IpPermissions." + ipPermissionsListIndex + ".Groups." + userIdGroupPairsListIndex + ".GroupId", StringUtils.fromString(userIdGroupPairsListValue.getGroupId()));
                            }
                        }

                        userIdGroupPairsListIndex++;
                    }
                }
                if (ipPermissionsListValue != null) {
                    java.util.List<String> ipRangesList = ipPermissionsListValue.getIpRanges();
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
        }


        return request;
    }
}
