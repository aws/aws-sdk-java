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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyReplicationGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationGroupRequestMarshaller implements Marshaller<Request<ModifyReplicationGroupRequest>, ModifyReplicationGroupRequest> {

    public Request<ModifyReplicationGroupRequest> marshall(ModifyReplicationGroupRequest modifyReplicationGroupRequest) {

        if (modifyReplicationGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyReplicationGroupRequest> request = new DefaultRequest<ModifyReplicationGroupRequest>(modifyReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyReplicationGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyReplicationGroupRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(modifyReplicationGroupRequest.getReplicationGroupId()));
        }

        if (modifyReplicationGroupRequest.getReplicationGroupDescription() != null) {
            request.addParameter("ReplicationGroupDescription", StringUtils.fromString(modifyReplicationGroupRequest.getReplicationGroupDescription()));
        }

        if (modifyReplicationGroupRequest.getPrimaryClusterId() != null) {
            request.addParameter("PrimaryClusterId", StringUtils.fromString(modifyReplicationGroupRequest.getPrimaryClusterId()));
        }

        if (modifyReplicationGroupRequest.getSnapshottingClusterId() != null) {
            request.addParameter("SnapshottingClusterId", StringUtils.fromString(modifyReplicationGroupRequest.getSnapshottingClusterId()));
        }

        if (modifyReplicationGroupRequest.getAutomaticFailoverEnabled() != null) {
            request.addParameter("AutomaticFailoverEnabled", StringUtils.fromBoolean(modifyReplicationGroupRequest.getAutomaticFailoverEnabled()));
        }

        if (!modifyReplicationGroupRequest.getCacheSecurityGroupNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest.getCacheSecurityGroupNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> cacheSecurityGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest
                    .getCacheSecurityGroupNames();
            int cacheSecurityGroupNamesListIndex = 1;

            for (String cacheSecurityGroupNamesListValue : cacheSecurityGroupNamesList) {
                if (cacheSecurityGroupNamesListValue != null) {
                    request.addParameter("CacheSecurityGroupNames.CacheSecurityGroupName." + cacheSecurityGroupNamesListIndex,
                            StringUtils.fromString(cacheSecurityGroupNamesListValue));
                }
                cacheSecurityGroupNamesListIndex++;
            }
        }

        if (!modifyReplicationGroupRequest.getSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest.getSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupRequest
                    .getSecurityGroupIds();
            int securityGroupIdsListIndex = 1;

            for (String securityGroupIdsListValue : securityGroupIdsList) {
                if (securityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupIds.SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (modifyReplicationGroupRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(modifyReplicationGroupRequest.getPreferredMaintenanceWindow()));
        }

        if (modifyReplicationGroupRequest.getNotificationTopicArn() != null) {
            request.addParameter("NotificationTopicArn", StringUtils.fromString(modifyReplicationGroupRequest.getNotificationTopicArn()));
        }

        if (modifyReplicationGroupRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(modifyReplicationGroupRequest.getCacheParameterGroupName()));
        }

        if (modifyReplicationGroupRequest.getNotificationTopicStatus() != null) {
            request.addParameter("NotificationTopicStatus", StringUtils.fromString(modifyReplicationGroupRequest.getNotificationTopicStatus()));
        }

        if (modifyReplicationGroupRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyReplicationGroupRequest.getApplyImmediately()));
        }

        if (modifyReplicationGroupRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyReplicationGroupRequest.getEngineVersion()));
        }

        if (modifyReplicationGroupRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(modifyReplicationGroupRequest.getAutoMinorVersionUpgrade()));
        }

        if (modifyReplicationGroupRequest.getSnapshotRetentionLimit() != null) {
            request.addParameter("SnapshotRetentionLimit", StringUtils.fromInteger(modifyReplicationGroupRequest.getSnapshotRetentionLimit()));
        }

        if (modifyReplicationGroupRequest.getSnapshotWindow() != null) {
            request.addParameter("SnapshotWindow", StringUtils.fromString(modifyReplicationGroupRequest.getSnapshotWindow()));
        }

        if (modifyReplicationGroupRequest.getCacheNodeType() != null) {
            request.addParameter("CacheNodeType", StringUtils.fromString(modifyReplicationGroupRequest.getCacheNodeType()));
        }

        if (modifyReplicationGroupRequest.getNodeGroupId() != null) {
            request.addParameter("NodeGroupId", StringUtils.fromString(modifyReplicationGroupRequest.getNodeGroupId()));
        }

        return request;
    }

}
