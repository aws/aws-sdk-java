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
 * BatchStopUpdateActionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStopUpdateActionRequestMarshaller implements Marshaller<Request<BatchStopUpdateActionRequest>, BatchStopUpdateActionRequest> {

    public Request<BatchStopUpdateActionRequest> marshall(BatchStopUpdateActionRequest batchStopUpdateActionRequest) {

        if (batchStopUpdateActionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<BatchStopUpdateActionRequest> request = new DefaultRequest<BatchStopUpdateActionRequest>(batchStopUpdateActionRequest, "AmazonElastiCache");
        request.addParameter("Action", "BatchStopUpdateAction");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (!batchStopUpdateActionRequest.getReplicationGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) batchStopUpdateActionRequest.getReplicationGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> replicationGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) batchStopUpdateActionRequest
                    .getReplicationGroupIds();
            int replicationGroupIdsListIndex = 1;

            for (String replicationGroupIdsListValue : replicationGroupIdsList) {
                if (replicationGroupIdsListValue != null) {
                    request.addParameter("ReplicationGroupIds.member." + replicationGroupIdsListIndex, StringUtils.fromString(replicationGroupIdsListValue));
                }
                replicationGroupIdsListIndex++;
            }
        }

        if (!batchStopUpdateActionRequest.getCacheClusterIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) batchStopUpdateActionRequest.getCacheClusterIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> cacheClusterIdsList = (com.amazonaws.internal.SdkInternalList<String>) batchStopUpdateActionRequest
                    .getCacheClusterIds();
            int cacheClusterIdsListIndex = 1;

            for (String cacheClusterIdsListValue : cacheClusterIdsList) {
                if (cacheClusterIdsListValue != null) {
                    request.addParameter("CacheClusterIds.member." + cacheClusterIdsListIndex, StringUtils.fromString(cacheClusterIdsListValue));
                }
                cacheClusterIdsListIndex++;
            }
        }

        if (batchStopUpdateActionRequest.getServiceUpdateName() != null) {
            request.addParameter("ServiceUpdateName", StringUtils.fromString(batchStopUpdateActionRequest.getServiceUpdateName()));
        }

        return request;
    }

}
