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
 * Create Replication Group Request Marshaller
 */
public class CreateReplicationGroupRequestMarshaller implements Marshaller<Request<CreateReplicationGroupRequest>, CreateReplicationGroupRequest> {

    public Request<CreateReplicationGroupRequest> marshall(CreateReplicationGroupRequest createReplicationGroupRequest) {

        if (createReplicationGroupRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReplicationGroupRequest> request = new DefaultRequest<CreateReplicationGroupRequest>(createReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        if (createReplicationGroupRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(createReplicationGroupRequest.getReplicationGroupId()));
        }
        if (createReplicationGroupRequest.getReplicationGroupDescription() != null) {
            request.addParameter("ReplicationGroupDescription", StringUtils.fromString(createReplicationGroupRequest.getReplicationGroupDescription()));
        }
        if (createReplicationGroupRequest.getPrimaryClusterId() != null) {
            request.addParameter("PrimaryClusterId", StringUtils.fromString(createReplicationGroupRequest.getPrimaryClusterId()));
        }
        if (createReplicationGroupRequest.isAutomaticFailoverEnabled() != null) {
            request.addParameter("AutomaticFailoverEnabled", StringUtils.fromBoolean(createReplicationGroupRequest.isAutomaticFailoverEnabled()));
        }
        if (createReplicationGroupRequest.getNumCacheClusters() != null) {
            request.addParameter("NumCacheClusters", StringUtils.fromInteger(createReplicationGroupRequest.getNumCacheClusters()));
        }

        java.util.List<String> preferredCacheClusterAZsList = createReplicationGroupRequest.getPreferredCacheClusterAZs();
        int preferredCacheClusterAZsListIndex = 1;

        for (String preferredCacheClusterAZsListValue : preferredCacheClusterAZsList) {
            if (preferredCacheClusterAZsListValue != null) {
                request.addParameter("PreferredCacheClusterAZs.AvailabilityZone." + preferredCacheClusterAZsListIndex, StringUtils.fromString(preferredCacheClusterAZsListValue));
            }

            preferredCacheClusterAZsListIndex++;
        }
        if (createReplicationGroupRequest.getCacheNodeType() != null) {
            request.addParameter("CacheNodeType", StringUtils.fromString(createReplicationGroupRequest.getCacheNodeType()));
        }
        if (createReplicationGroupRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createReplicationGroupRequest.getEngine()));
        }
        if (createReplicationGroupRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(createReplicationGroupRequest.getEngineVersion()));
        }
        if (createReplicationGroupRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(createReplicationGroupRequest.getCacheParameterGroupName()));
        }
        if (createReplicationGroupRequest.getCacheSubnetGroupName() != null) {
            request.addParameter("CacheSubnetGroupName", StringUtils.fromString(createReplicationGroupRequest.getCacheSubnetGroupName()));
        }

        java.util.List<String> cacheSecurityGroupNamesList = createReplicationGroupRequest.getCacheSecurityGroupNames();
        int cacheSecurityGroupNamesListIndex = 1;

        for (String cacheSecurityGroupNamesListValue : cacheSecurityGroupNamesList) {
            if (cacheSecurityGroupNamesListValue != null) {
                request.addParameter("CacheSecurityGroupNames.CacheSecurityGroupName." + cacheSecurityGroupNamesListIndex, StringUtils.fromString(cacheSecurityGroupNamesListValue));
            }

            cacheSecurityGroupNamesListIndex++;
        }

        java.util.List<String> securityGroupIdsList = createReplicationGroupRequest.getSecurityGroupIds();
        int securityGroupIdsListIndex = 1;

        for (String securityGroupIdsListValue : securityGroupIdsList) {
            if (securityGroupIdsListValue != null) {
                request.addParameter("SecurityGroupIds.SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
            }

            securityGroupIdsListIndex++;
        }

        java.util.List<Tag> tagsList = createReplicationGroupRequest.getTags();
        int tagsListIndex = 1;

        for (Tag tagsListValue : tagsList) {
            Tag tagMember = tagsListValue;
            if (tagMember != null) {
                if (tagMember.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagMember.getKey()));
                }
                if (tagMember.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagMember.getValue()));
                }
            }

            tagsListIndex++;
        }

        java.util.List<String> snapshotArnsList = createReplicationGroupRequest.getSnapshotArns();
        int snapshotArnsListIndex = 1;

        for (String snapshotArnsListValue : snapshotArnsList) {
            if (snapshotArnsListValue != null) {
                request.addParameter("SnapshotArns.SnapshotArn." + snapshotArnsListIndex, StringUtils.fromString(snapshotArnsListValue));
            }

            snapshotArnsListIndex++;
        }
        if (createReplicationGroupRequest.getSnapshotName() != null) {
            request.addParameter("SnapshotName", StringUtils.fromString(createReplicationGroupRequest.getSnapshotName()));
        }
        if (createReplicationGroupRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(createReplicationGroupRequest.getPreferredMaintenanceWindow()));
        }
        if (createReplicationGroupRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createReplicationGroupRequest.getPort()));
        }
        if (createReplicationGroupRequest.getNotificationTopicArn() != null) {
            request.addParameter("NotificationTopicArn", StringUtils.fromString(createReplicationGroupRequest.getNotificationTopicArn()));
        }
        if (createReplicationGroupRequest.isAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(createReplicationGroupRequest.isAutoMinorVersionUpgrade()));
        }
        if (createReplicationGroupRequest.getSnapshotRetentionLimit() != null) {
            request.addParameter("SnapshotRetentionLimit", StringUtils.fromInteger(createReplicationGroupRequest.getSnapshotRetentionLimit()));
        }
        if (createReplicationGroupRequest.getSnapshotWindow() != null) {
            request.addParameter("SnapshotWindow", StringUtils.fromString(createReplicationGroupRequest.getSnapshotWindow()));
        }

        return request;
    }
}
