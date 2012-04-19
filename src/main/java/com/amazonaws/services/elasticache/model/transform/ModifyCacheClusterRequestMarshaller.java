/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Cache Cluster Request Marshaller
 */
public class ModifyCacheClusterRequestMarshaller implements Marshaller<Request<ModifyCacheClusterRequest>, ModifyCacheClusterRequest> {

    public Request<ModifyCacheClusterRequest> marshall(ModifyCacheClusterRequest modifyCacheClusterRequest) {

        if (modifyCacheClusterRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyCacheClusterRequest> request = new DefaultRequest<ModifyCacheClusterRequest>(modifyCacheClusterRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyCacheCluster");
        request.addParameter("Version", "2012-03-09");

        if (modifyCacheClusterRequest.getCacheClusterId() != null) {
            request.addParameter("CacheClusterId", StringUtils.fromString(modifyCacheClusterRequest.getCacheClusterId()));
        }
        if (modifyCacheClusterRequest.getNumCacheNodes() != null) {
            request.addParameter("NumCacheNodes", StringUtils.fromInteger(modifyCacheClusterRequest.getNumCacheNodes()));
        }

        java.util.List<String> cacheNodeIdsToRemoveList = modifyCacheClusterRequest.getCacheNodeIdsToRemove();
        int cacheNodeIdsToRemoveListIndex = 1;

        for (String cacheNodeIdsToRemoveListValue : cacheNodeIdsToRemoveList) {
            if (cacheNodeIdsToRemoveListValue != null) {
                request.addParameter("CacheNodeIdsToRemove.CacheNodeId." + cacheNodeIdsToRemoveListIndex, StringUtils.fromString(cacheNodeIdsToRemoveListValue));
            }

            cacheNodeIdsToRemoveListIndex++;
        }

        java.util.List<String> cacheSecurityGroupNamesList = modifyCacheClusterRequest.getCacheSecurityGroupNames();
        int cacheSecurityGroupNamesListIndex = 1;

        for (String cacheSecurityGroupNamesListValue : cacheSecurityGroupNamesList) {
            if (cacheSecurityGroupNamesListValue != null) {
                request.addParameter("CacheSecurityGroupNames.CacheSecurityGroupName." + cacheSecurityGroupNamesListIndex, StringUtils.fromString(cacheSecurityGroupNamesListValue));
            }

            cacheSecurityGroupNamesListIndex++;
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
        if (modifyCacheClusterRequest.isApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyCacheClusterRequest.isApplyImmediately()));
        }
        if (modifyCacheClusterRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyCacheClusterRequest.getEngineVersion()));
        }
        if (modifyCacheClusterRequest.isAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(modifyCacheClusterRequest.isAutoMinorVersionUpgrade()));
        }


        return request;
    }
}
