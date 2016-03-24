/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Replication Group Request Marshaller
 */
public class ModifyReplicationGroupRequestMarshaller implements Marshaller<Request<ModifyReplicationGroupRequest>, ModifyReplicationGroupRequest> {

    public Request<ModifyReplicationGroupRequest> marshall(ModifyReplicationGroupRequest modifyReplicationGroupRequest) {

        if (modifyReplicationGroupRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyReplicationGroupRequest> request = new DefaultRequest<ModifyReplicationGroupRequest>(modifyReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyReplicationGroup");
        request.addParameter("Version", "2015-02-02");

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
        if (modifyReplicationGroupRequest.isAutomaticFailoverEnabled() != null) {
            request.addParameter("AutomaticFailoverEnabled", StringUtils.fromBoolean(modifyReplicationGroupRequest.isAutomaticFailoverEnabled()));
        }

        java.util.List<String> cacheSecurityGroupNamesList = modifyReplicationGroupRequest.getCacheSecurityGroupNames();
        int cacheSecurityGroupNamesListIndex = 1;

        for (String cacheSecurityGroupNamesListValue : cacheSecurityGroupNamesList) {
            if (cacheSecurityGroupNamesListValue != null) {
                request.addParameter("CacheSecurityGroupNames.CacheSecurityGroupName." + cacheSecurityGroupNamesListIndex, StringUtils.fromString(cacheSecurityGroupNamesListValue));
            }

            cacheSecurityGroupNamesListIndex++;
        }

        java.util.List<String> securityGroupIdsList = modifyReplicationGroupRequest.getSecurityGroupIds();
        int securityGroupIdsListIndex = 1;

        for (String securityGroupIdsListValue : securityGroupIdsList) {
            if (securityGroupIdsListValue != null) {
                request.addParameter("SecurityGroupIds.SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
            }

            securityGroupIdsListIndex++;
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
        if (modifyReplicationGroupRequest.isApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyReplicationGroupRequest.isApplyImmediately()));
        }
        if (modifyReplicationGroupRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyReplicationGroupRequest.getEngineVersion()));
        }
        if (modifyReplicationGroupRequest.isAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(modifyReplicationGroupRequest.isAutoMinorVersionUpgrade()));
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

        return request;
    }
}
