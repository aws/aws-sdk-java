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
 * Create Cache Cluster Request Marshaller
 */
public class CreateCacheClusterRequestMarshaller implements Marshaller<Request<CreateCacheClusterRequest>, CreateCacheClusterRequest> {

    public Request<CreateCacheClusterRequest> marshall(CreateCacheClusterRequest createCacheClusterRequest) {

        if (createCacheClusterRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateCacheClusterRequest> request = new DefaultRequest<CreateCacheClusterRequest>(createCacheClusterRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateCacheCluster");
        request.addParameter("Version", "2012-03-09");

        if (createCacheClusterRequest.getCacheClusterId() != null) {
            request.addParameter("CacheClusterId", StringUtils.fromString(createCacheClusterRequest.getCacheClusterId()));
        }
        if (createCacheClusterRequest.getNumCacheNodes() != null) {
            request.addParameter("NumCacheNodes", StringUtils.fromInteger(createCacheClusterRequest.getNumCacheNodes()));
        }
        if (createCacheClusterRequest.getCacheNodeType() != null) {
            request.addParameter("CacheNodeType", StringUtils.fromString(createCacheClusterRequest.getCacheNodeType()));
        }
        if (createCacheClusterRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createCacheClusterRequest.getEngine()));
        }
        if (createCacheClusterRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(createCacheClusterRequest.getEngineVersion()));
        }
        if (createCacheClusterRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(createCacheClusterRequest.getCacheParameterGroupName()));
        }

        java.util.List<String> cacheSecurityGroupNamesList = createCacheClusterRequest.getCacheSecurityGroupNames();
        int cacheSecurityGroupNamesListIndex = 1;

        for (String cacheSecurityGroupNamesListValue : cacheSecurityGroupNamesList) {
            if (cacheSecurityGroupNamesListValue != null) {
                request.addParameter("CacheSecurityGroupNames.CacheSecurityGroupName." + cacheSecurityGroupNamesListIndex, StringUtils.fromString(cacheSecurityGroupNamesListValue));
            }

            cacheSecurityGroupNamesListIndex++;
        }
        if (createCacheClusterRequest.getPreferredAvailabilityZone() != null) {
            request.addParameter("PreferredAvailabilityZone", StringUtils.fromString(createCacheClusterRequest.getPreferredAvailabilityZone()));
        }
        if (createCacheClusterRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(createCacheClusterRequest.getPreferredMaintenanceWindow()));
        }
        if (createCacheClusterRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createCacheClusterRequest.getPort()));
        }
        if (createCacheClusterRequest.getNotificationTopicArn() != null) {
            request.addParameter("NotificationTopicArn", StringUtils.fromString(createCacheClusterRequest.getNotificationTopicArn()));
        }
        if (createCacheClusterRequest.isAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(createCacheClusterRequest.isAutoMinorVersionUpgrade()));
        }


        return request;
    }
}
