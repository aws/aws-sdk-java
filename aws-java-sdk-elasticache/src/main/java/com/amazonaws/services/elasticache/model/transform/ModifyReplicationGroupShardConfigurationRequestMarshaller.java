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
 * ModifyReplicationGroupShardConfigurationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationGroupShardConfigurationRequestMarshaller implements
        Marshaller<Request<ModifyReplicationGroupShardConfigurationRequest>, ModifyReplicationGroupShardConfigurationRequest> {

    public Request<ModifyReplicationGroupShardConfigurationRequest> marshall(
            ModifyReplicationGroupShardConfigurationRequest modifyReplicationGroupShardConfigurationRequest) {

        if (modifyReplicationGroupShardConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyReplicationGroupShardConfigurationRequest> request = new DefaultRequest<ModifyReplicationGroupShardConfigurationRequest>(
                modifyReplicationGroupShardConfigurationRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyReplicationGroupShardConfiguration");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyReplicationGroupShardConfigurationRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(modifyReplicationGroupShardConfigurationRequest.getReplicationGroupId()));
        }

        if (modifyReplicationGroupShardConfigurationRequest.getNodeGroupCount() != null) {
            request.addParameter("NodeGroupCount", StringUtils.fromInteger(modifyReplicationGroupShardConfigurationRequest.getNodeGroupCount()));
        }

        if (modifyReplicationGroupShardConfigurationRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyReplicationGroupShardConfigurationRequest.getApplyImmediately()));
        }

        if (!modifyReplicationGroupShardConfigurationRequest.getReshardingConfiguration().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>) modifyReplicationGroupShardConfigurationRequest
                        .getReshardingConfiguration()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ReshardingConfiguration> reshardingConfigurationList = (com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>) modifyReplicationGroupShardConfigurationRequest
                    .getReshardingConfiguration();
            int reshardingConfigurationListIndex = 1;

            for (ReshardingConfiguration reshardingConfigurationListValue : reshardingConfigurationList) {

                if (reshardingConfigurationListValue.getNodeGroupId() != null) {
                    request.addParameter("ReshardingConfiguration.ReshardingConfiguration." + reshardingConfigurationListIndex + ".NodeGroupId",
                            StringUtils.fromString(reshardingConfigurationListValue.getNodeGroupId()));
                }

                if (!reshardingConfigurationListValue.getPreferredAvailabilityZones().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) reshardingConfigurationListValue.getPreferredAvailabilityZones())
                                .isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> preferredAvailabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) reshardingConfigurationListValue
                            .getPreferredAvailabilityZones();
                    int preferredAvailabilityZonesListIndex = 1;

                    for (String preferredAvailabilityZonesListValue : preferredAvailabilityZonesList) {
                        if (preferredAvailabilityZonesListValue != null) {
                            request.addParameter("ReshardingConfiguration.ReshardingConfiguration." + reshardingConfigurationListIndex
                                    + ".PreferredAvailabilityZones.AvailabilityZone." + preferredAvailabilityZonesListIndex,
                                    StringUtils.fromString(preferredAvailabilityZonesListValue));
                        }
                        preferredAvailabilityZonesListIndex++;
                    }
                }
                reshardingConfigurationListIndex++;
            }
        }

        if (!modifyReplicationGroupShardConfigurationRequest.getNodeGroupsToRemove().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupShardConfigurationRequest.getNodeGroupsToRemove())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> nodeGroupsToRemoveList = (com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupShardConfigurationRequest
                    .getNodeGroupsToRemove();
            int nodeGroupsToRemoveListIndex = 1;

            for (String nodeGroupsToRemoveListValue : nodeGroupsToRemoveList) {
                if (nodeGroupsToRemoveListValue != null) {
                    request.addParameter("NodeGroupsToRemove.NodeGroupToRemove." + nodeGroupsToRemoveListIndex,
                            StringUtils.fromString(nodeGroupsToRemoveListValue));
                }
                nodeGroupsToRemoveListIndex++;
            }
        }

        if (!modifyReplicationGroupShardConfigurationRequest.getNodeGroupsToRetain().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupShardConfigurationRequest.getNodeGroupsToRetain())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> nodeGroupsToRetainList = (com.amazonaws.internal.SdkInternalList<String>) modifyReplicationGroupShardConfigurationRequest
                    .getNodeGroupsToRetain();
            int nodeGroupsToRetainListIndex = 1;

            for (String nodeGroupsToRetainListValue : nodeGroupsToRetainList) {
                if (nodeGroupsToRetainListValue != null) {
                    request.addParameter("NodeGroupsToRetain.NodeGroupToRetain." + nodeGroupsToRetainListIndex,
                            StringUtils.fromString(nodeGroupsToRetainListValue));
                }
                nodeGroupsToRetainListIndex++;
            }
        }

        return request;
    }

}
