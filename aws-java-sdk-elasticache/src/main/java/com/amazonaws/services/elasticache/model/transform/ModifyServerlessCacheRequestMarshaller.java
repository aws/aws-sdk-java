/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyServerlessCacheRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyServerlessCacheRequestMarshaller implements Marshaller<Request<ModifyServerlessCacheRequest>, ModifyServerlessCacheRequest> {

    public Request<ModifyServerlessCacheRequest> marshall(ModifyServerlessCacheRequest modifyServerlessCacheRequest) {

        if (modifyServerlessCacheRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyServerlessCacheRequest> request = new DefaultRequest<ModifyServerlessCacheRequest>(modifyServerlessCacheRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyServerlessCache");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyServerlessCacheRequest.getServerlessCacheName() != null) {
            request.addParameter("ServerlessCacheName", StringUtils.fromString(modifyServerlessCacheRequest.getServerlessCacheName()));
        }

        if (modifyServerlessCacheRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyServerlessCacheRequest.getDescription()));
        }

        {
            CacheUsageLimits cacheUsageLimits = modifyServerlessCacheRequest.getCacheUsageLimits();
            if (cacheUsageLimits != null) {

                {
                    DataStorage dataStorage = cacheUsageLimits.getDataStorage();
                    if (dataStorage != null) {

                        if (dataStorage.getMaximum() != null) {
                            request.addParameter("CacheUsageLimits.DataStorage.Maximum", StringUtils.fromInteger(dataStorage.getMaximum()));
                        }

                        if (dataStorage.getMinimum() != null) {
                            request.addParameter("CacheUsageLimits.DataStorage.Minimum", StringUtils.fromInteger(dataStorage.getMinimum()));
                        }

                        if (dataStorage.getUnit() != null) {
                            request.addParameter("CacheUsageLimits.DataStorage.Unit", StringUtils.fromString(dataStorage.getUnit()));
                        }
                    }
                }

                {
                    ECPUPerSecond eCPUPerSecond = cacheUsageLimits.getECPUPerSecond();
                    if (eCPUPerSecond != null) {

                        if (eCPUPerSecond.getMaximum() != null) {
                            request.addParameter("CacheUsageLimits.ECPUPerSecond.Maximum", StringUtils.fromInteger(eCPUPerSecond.getMaximum()));
                        }

                        if (eCPUPerSecond.getMinimum() != null) {
                            request.addParameter("CacheUsageLimits.ECPUPerSecond.Minimum", StringUtils.fromInteger(eCPUPerSecond.getMinimum()));
                        }
                    }
                }
            }
        }

        if (modifyServerlessCacheRequest.getRemoveUserGroup() != null) {
            request.addParameter("RemoveUserGroup", StringUtils.fromBoolean(modifyServerlessCacheRequest.getRemoveUserGroup()));
        }

        if (modifyServerlessCacheRequest.getUserGroupId() != null) {
            request.addParameter("UserGroupId", StringUtils.fromString(modifyServerlessCacheRequest.getUserGroupId()));
        }

        if (!modifyServerlessCacheRequest.getSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyServerlessCacheRequest.getSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyServerlessCacheRequest
                    .getSecurityGroupIds();
            int securityGroupIdsListIndex = 1;

            for (String securityGroupIdsListValue : securityGroupIdsList) {
                if (securityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupIds.SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (modifyServerlessCacheRequest.getSnapshotRetentionLimit() != null) {
            request.addParameter("SnapshotRetentionLimit", StringUtils.fromInteger(modifyServerlessCacheRequest.getSnapshotRetentionLimit()));
        }

        if (modifyServerlessCacheRequest.getDailySnapshotTime() != null) {
            request.addParameter("DailySnapshotTime", StringUtils.fromString(modifyServerlessCacheRequest.getDailySnapshotTime()));
        }

        return request;
    }

}
