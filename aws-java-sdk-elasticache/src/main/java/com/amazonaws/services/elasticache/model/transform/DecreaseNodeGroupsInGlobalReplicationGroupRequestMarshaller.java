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
 * DecreaseNodeGroupsInGlobalReplicationGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecreaseNodeGroupsInGlobalReplicationGroupRequestMarshaller implements
        Marshaller<Request<DecreaseNodeGroupsInGlobalReplicationGroupRequest>, DecreaseNodeGroupsInGlobalReplicationGroupRequest> {

    public Request<DecreaseNodeGroupsInGlobalReplicationGroupRequest> marshall(
            DecreaseNodeGroupsInGlobalReplicationGroupRequest decreaseNodeGroupsInGlobalReplicationGroupRequest) {

        if (decreaseNodeGroupsInGlobalReplicationGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DecreaseNodeGroupsInGlobalReplicationGroupRequest> request = new DefaultRequest<DecreaseNodeGroupsInGlobalReplicationGroupRequest>(
                decreaseNodeGroupsInGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "DecreaseNodeGroupsInGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (decreaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            request.addParameter("GlobalReplicationGroupId",
                    StringUtils.fromString(decreaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalReplicationGroupId()));
        }

        if (decreaseNodeGroupsInGlobalReplicationGroupRequest.getNodeGroupCount() != null) {
            request.addParameter("NodeGroupCount", StringUtils.fromInteger(decreaseNodeGroupsInGlobalReplicationGroupRequest.getNodeGroupCount()));
        }

        if (!decreaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalNodeGroupsToRemove().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) decreaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalNodeGroupsToRemove())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> globalNodeGroupsToRemoveList = (com.amazonaws.internal.SdkInternalList<String>) decreaseNodeGroupsInGlobalReplicationGroupRequest
                    .getGlobalNodeGroupsToRemove();
            int globalNodeGroupsToRemoveListIndex = 1;

            for (String globalNodeGroupsToRemoveListValue : globalNodeGroupsToRemoveList) {
                if (globalNodeGroupsToRemoveListValue != null) {
                    request.addParameter("GlobalNodeGroupsToRemove.GlobalNodeGroupId." + globalNodeGroupsToRemoveListIndex,
                            StringUtils.fromString(globalNodeGroupsToRemoveListValue));
                }
                globalNodeGroupsToRemoveListIndex++;
            }
        }

        if (!decreaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalNodeGroupsToRetain().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) decreaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalNodeGroupsToRetain())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> globalNodeGroupsToRetainList = (com.amazonaws.internal.SdkInternalList<String>) decreaseNodeGroupsInGlobalReplicationGroupRequest
                    .getGlobalNodeGroupsToRetain();
            int globalNodeGroupsToRetainListIndex = 1;

            for (String globalNodeGroupsToRetainListValue : globalNodeGroupsToRetainList) {
                if (globalNodeGroupsToRetainListValue != null) {
                    request.addParameter("GlobalNodeGroupsToRetain.GlobalNodeGroupId." + globalNodeGroupsToRetainListIndex,
                            StringUtils.fromString(globalNodeGroupsToRetainListValue));
                }
                globalNodeGroupsToRetainListIndex++;
            }
        }

        if (decreaseNodeGroupsInGlobalReplicationGroupRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(decreaseNodeGroupsInGlobalReplicationGroupRequest.getApplyImmediately()));
        }

        return request;
    }

}
