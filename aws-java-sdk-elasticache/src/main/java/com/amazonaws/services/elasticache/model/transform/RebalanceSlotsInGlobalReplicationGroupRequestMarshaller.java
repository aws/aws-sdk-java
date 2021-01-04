/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * RebalanceSlotsInGlobalReplicationGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebalanceSlotsInGlobalReplicationGroupRequestMarshaller implements
        Marshaller<Request<RebalanceSlotsInGlobalReplicationGroupRequest>, RebalanceSlotsInGlobalReplicationGroupRequest> {

    public Request<RebalanceSlotsInGlobalReplicationGroupRequest> marshall(
            RebalanceSlotsInGlobalReplicationGroupRequest rebalanceSlotsInGlobalReplicationGroupRequest) {

        if (rebalanceSlotsInGlobalReplicationGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RebalanceSlotsInGlobalReplicationGroupRequest> request = new DefaultRequest<RebalanceSlotsInGlobalReplicationGroupRequest>(
                rebalanceSlotsInGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "RebalanceSlotsInGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (rebalanceSlotsInGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            request.addParameter("GlobalReplicationGroupId",
                    StringUtils.fromString(rebalanceSlotsInGlobalReplicationGroupRequest.getGlobalReplicationGroupId()));
        }

        if (rebalanceSlotsInGlobalReplicationGroupRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(rebalanceSlotsInGlobalReplicationGroupRequest.getApplyImmediately()));
        }

        return request;
    }

}
