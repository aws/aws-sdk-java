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
 * ModifyCacheClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCacheClusterRequestMarshaller implements Marshaller<Request<ModifyCacheClusterRequest>, ModifyCacheClusterRequest> {

    public Request<ModifyCacheClusterRequest> marshall(ModifyCacheClusterRequest modifyCacheClusterRequest) {

        if (modifyCacheClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyCacheClusterRequest> request = new DefaultRequest<ModifyCacheClusterRequest>(modifyCacheClusterRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyCacheCluster");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyCacheClusterRequest.getCacheClusterId() != null) {
            request.addParameter("CacheClusterId", StringUtils.fromString(modifyCacheClusterRequest.getCacheClusterId()));
        }

        if (modifyCacheClusterRequest.getNumCacheNodes() != null) {
            request.addParameter("NumCacheNodes", StringUtils.fromInteger(modifyCacheClusterRequest.getNumCacheNodes()));
        }

        if (!modifyCacheClusterRequest.getCacheNodeIdsToRemove().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyCacheClusterRequest.getCacheNodeIdsToRemove()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> cacheNodeIdsToRemoveList = (com.amazonaws.internal.SdkInternalList<String>) modifyCacheClusterRequest
                    .getCacheNodeIdsToRemove();
            int cacheNodeIdsToRemoveListIndex = 1;

            for (String cacheNodeIdsToRemoveListValue : cacheNodeIdsToRemoveList) {
                if (cacheNodeIdsToRemoveListValue != null) {
                    request.addParameter("CacheNodeIdsToRemove.CacheNodeId." + cacheNodeIdsToRemoveListIndex,
                            StringUtils.fromString(cacheNodeIdsToRemoveListValue));
                }
                cacheNodeIdsToRemoveListIndex++;
            }
        }

        if (modifyCacheClusterRequest.getAZMode() != null) {
            request.addParameter("AZMode", StringUtils.fromString(modifyCacheClusterRequest.getAZMode()));
        }

        if (!modifyCacheClusterRequest.getNewAvailabilityZones().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyCacheClusterRequest.getNewAvailabilityZones()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> newAvailabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) modifyCacheClusterRequest
                    .getNewAvailabilityZones();
            int newAvailabilityZonesListIndex = 1;

            for (String newAvailabilityZonesListValue : newAvailabilityZonesList) {
                if (newAvailabilityZonesListValue != null) {
                    request.addParameter("NewAvailabilityZones.PreferredAvailabilityZone." + newAvailabilityZonesListIndex,
                            StringUtils.fromString(newAvailabilityZonesListValue));
                }
                newAvailabilityZonesListIndex++;
            }
        }

        if (!modifyCacheClusterRequest.getCacheSecurityGroupNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyCacheClusterRequest.getCacheSecurityGroupNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> cacheSecurityGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) modifyCacheClusterRequest
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

        if (!modifyCacheClusterRequest.getSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyCacheClusterRequest.getSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyCacheClusterRequest
                    .getSecurityGroupIds();
            int securityGroupIdsListIndex = 1;

            for (String securityGroupIdsListValue : securityGroupIdsList) {
                if (securityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupIds.SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (modifyCacheClusterRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(modifyCacheClusterRequest.getPreferredMaintenanceWindow()));
        }

        if (modifyCacheClusterRequest.getNotificationTopicArn() != null) {
            request.addParameter("NotificationTopicArn", StringUtils.fromString(modifyCacheClusterRequest.getNotificationTopicArn()));
        }

        if (modifyCacheClusterRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(modifyCacheClusterRequest.getCacheParameterGroupName()));
        }

        if (modifyCacheClusterRequest.getNotificationTopicStatus() != null) {
            request.addParameter("NotificationTopicStatus", StringUtils.fromString(modifyCacheClusterRequest.getNotificationTopicStatus()));
        }

        if (modifyCacheClusterRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyCacheClusterRequest.getApplyImmediately()));
        }

        if (modifyCacheClusterRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyCacheClusterRequest.getEngineVersion()));
        }

        if (modifyCacheClusterRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(modifyCacheClusterRequest.getAutoMinorVersionUpgrade()));
        }

        if (modifyCacheClusterRequest.getSnapshotRetentionLimit() != null) {
            request.addParameter("SnapshotRetentionLimit", StringUtils.fromInteger(modifyCacheClusterRequest.getSnapshotRetentionLimit()));
        }

        if (modifyCacheClusterRequest.getSnapshotWindow() != null) {
            request.addParameter("SnapshotWindow", StringUtils.fromString(modifyCacheClusterRequest.getSnapshotWindow()));
        }

        if (modifyCacheClusterRequest.getCacheNodeType() != null) {
            request.addParameter("CacheNodeType", StringUtils.fromString(modifyCacheClusterRequest.getCacheNodeType()));
        }

        return request;
    }

}
