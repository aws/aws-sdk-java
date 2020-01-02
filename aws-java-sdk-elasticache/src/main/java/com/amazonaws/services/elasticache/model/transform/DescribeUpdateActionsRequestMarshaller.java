/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeUpdateActionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUpdateActionsRequestMarshaller implements Marshaller<Request<DescribeUpdateActionsRequest>, DescribeUpdateActionsRequest> {

    public Request<DescribeUpdateActionsRequest> marshall(DescribeUpdateActionsRequest describeUpdateActionsRequest) {

        if (describeUpdateActionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeUpdateActionsRequest> request = new DefaultRequest<DescribeUpdateActionsRequest>(describeUpdateActionsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeUpdateActions");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeUpdateActionsRequest.getServiceUpdateName() != null) {
            request.addParameter("ServiceUpdateName", StringUtils.fromString(describeUpdateActionsRequest.getServiceUpdateName()));
        }

        if (!describeUpdateActionsRequest.getReplicationGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeUpdateActionsRequest.getReplicationGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> replicationGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeUpdateActionsRequest
                    .getReplicationGroupIds();
            int replicationGroupIdsListIndex = 1;

            for (String replicationGroupIdsListValue : replicationGroupIdsList) {
                if (replicationGroupIdsListValue != null) {
                    request.addParameter("ReplicationGroupIds.member." + replicationGroupIdsListIndex, StringUtils.fromString(replicationGroupIdsListValue));
                }
                replicationGroupIdsListIndex++;
            }
        }

        if (!describeUpdateActionsRequest.getCacheClusterIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeUpdateActionsRequest.getCacheClusterIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> cacheClusterIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeUpdateActionsRequest
                    .getCacheClusterIds();
            int cacheClusterIdsListIndex = 1;

            for (String cacheClusterIdsListValue : cacheClusterIdsList) {
                if (cacheClusterIdsListValue != null) {
                    request.addParameter("CacheClusterIds.member." + cacheClusterIdsListIndex, StringUtils.fromString(cacheClusterIdsListValue));
                }
                cacheClusterIdsListIndex++;
            }
        }

        if (describeUpdateActionsRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(describeUpdateActionsRequest.getEngine()));
        }

        if (!describeUpdateActionsRequest.getServiceUpdateStatus().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeUpdateActionsRequest.getServiceUpdateStatus()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> serviceUpdateStatusList = (com.amazonaws.internal.SdkInternalList<String>) describeUpdateActionsRequest
                    .getServiceUpdateStatus();
            int serviceUpdateStatusListIndex = 1;

            for (String serviceUpdateStatusListValue : serviceUpdateStatusList) {
                if (serviceUpdateStatusListValue != null) {
                    request.addParameter("ServiceUpdateStatus.member." + serviceUpdateStatusListIndex, StringUtils.fromString(serviceUpdateStatusListValue));
                }
                serviceUpdateStatusListIndex++;
            }
        }

        {
            TimeRangeFilter serviceUpdateTimeRange = describeUpdateActionsRequest.getServiceUpdateTimeRange();
            if (serviceUpdateTimeRange != null) {

                if (serviceUpdateTimeRange.getStartTime() != null) {
                    request.addParameter("ServiceUpdateTimeRange.StartTime", StringUtils.fromDate(serviceUpdateTimeRange.getStartTime()));
                }

                if (serviceUpdateTimeRange.getEndTime() != null) {
                    request.addParameter("ServiceUpdateTimeRange.EndTime", StringUtils.fromDate(serviceUpdateTimeRange.getEndTime()));
                }
            }
        }

        if (!describeUpdateActionsRequest.getUpdateActionStatus().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeUpdateActionsRequest.getUpdateActionStatus()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> updateActionStatusList = (com.amazonaws.internal.SdkInternalList<String>) describeUpdateActionsRequest
                    .getUpdateActionStatus();
            int updateActionStatusListIndex = 1;

            for (String updateActionStatusListValue : updateActionStatusList) {
                if (updateActionStatusListValue != null) {
                    request.addParameter("UpdateActionStatus.member." + updateActionStatusListIndex, StringUtils.fromString(updateActionStatusListValue));
                }
                updateActionStatusListIndex++;
            }
        }

        if (describeUpdateActionsRequest.getShowNodeLevelUpdateStatus() != null) {
            request.addParameter("ShowNodeLevelUpdateStatus", StringUtils.fromBoolean(describeUpdateActionsRequest.getShowNodeLevelUpdateStatus()));
        }

        if (describeUpdateActionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeUpdateActionsRequest.getMaxRecords()));
        }

        if (describeUpdateActionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeUpdateActionsRequest.getMarker()));
        }

        return request;
    }

}
