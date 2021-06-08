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
 * IncreaseNodeGroupsInGlobalReplicationGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncreaseNodeGroupsInGlobalReplicationGroupRequestMarshaller implements
        Marshaller<Request<IncreaseNodeGroupsInGlobalReplicationGroupRequest>, IncreaseNodeGroupsInGlobalReplicationGroupRequest> {

    public Request<IncreaseNodeGroupsInGlobalReplicationGroupRequest> marshall(
            IncreaseNodeGroupsInGlobalReplicationGroupRequest increaseNodeGroupsInGlobalReplicationGroupRequest) {

        if (increaseNodeGroupsInGlobalReplicationGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<IncreaseNodeGroupsInGlobalReplicationGroupRequest> request = new DefaultRequest<IncreaseNodeGroupsInGlobalReplicationGroupRequest>(
                increaseNodeGroupsInGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "IncreaseNodeGroupsInGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (increaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            request.addParameter("GlobalReplicationGroupId",
                    StringUtils.fromString(increaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalReplicationGroupId()));
        }

        if (increaseNodeGroupsInGlobalReplicationGroupRequest.getNodeGroupCount() != null) {
            request.addParameter("NodeGroupCount", StringUtils.fromInteger(increaseNodeGroupsInGlobalReplicationGroupRequest.getNodeGroupCount()));
        }

        if (!increaseNodeGroupsInGlobalReplicationGroupRequest.getRegionalConfigurations().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<RegionalConfiguration>) increaseNodeGroupsInGlobalReplicationGroupRequest
                        .getRegionalConfigurations()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<RegionalConfiguration> regionalConfigurationsList = (com.amazonaws.internal.SdkInternalList<RegionalConfiguration>) increaseNodeGroupsInGlobalReplicationGroupRequest
                    .getRegionalConfigurations();
            int regionalConfigurationsListIndex = 1;

            for (RegionalConfiguration regionalConfigurationsListValue : regionalConfigurationsList) {
                if (regionalConfigurationsListValue != null) {

                    if (regionalConfigurationsListValue.getReplicationGroupId() != null) {
                        request.addParameter("RegionalConfigurations.RegionalConfiguration." + regionalConfigurationsListIndex + ".ReplicationGroupId",
                                StringUtils.fromString(regionalConfigurationsListValue.getReplicationGroupId()));
                    }

                    if (regionalConfigurationsListValue.getReplicationGroupRegion() != null) {
                        request.addParameter("RegionalConfigurations.RegionalConfiguration." + regionalConfigurationsListIndex + ".ReplicationGroupRegion",
                                StringUtils.fromString(regionalConfigurationsListValue.getReplicationGroupRegion()));
                    }

                    if (!regionalConfigurationsListValue.getReshardingConfiguration().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>) regionalConfigurationsListValue.getReshardingConfiguration())
                                    .isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<ReshardingConfiguration> reshardingConfigurationList = (com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>) regionalConfigurationsListValue
                                .getReshardingConfiguration();
                        int reshardingConfigurationListIndex = 1;

                        for (ReshardingConfiguration reshardingConfigurationListValue : reshardingConfigurationList) {
                            if (reshardingConfigurationListValue != null) {

                                if (reshardingConfigurationListValue.getNodeGroupId() != null) {
                                    request.addParameter("RegionalConfigurations.RegionalConfiguration." + regionalConfigurationsListIndex
                                            + ".ReshardingConfiguration.ReshardingConfiguration." + reshardingConfigurationListIndex + ".NodeGroupId",
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
                                            request.addParameter("RegionalConfigurations.RegionalConfiguration." + regionalConfigurationsListIndex
                                                    + ".ReshardingConfiguration.ReshardingConfiguration." + reshardingConfigurationListIndex
                                                    + ".PreferredAvailabilityZones.AvailabilityZone." + preferredAvailabilityZonesListIndex,
                                                    StringUtils.fromString(preferredAvailabilityZonesListValue));
                                        }
                                        preferredAvailabilityZonesListIndex++;
                                    }
                                }
                            }
                            reshardingConfigurationListIndex++;
                        }
                    }
                }
                regionalConfigurationsListIndex++;
            }
        }

        if (increaseNodeGroupsInGlobalReplicationGroupRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(increaseNodeGroupsInGlobalReplicationGroupRequest.getApplyImmediately()));
        }

        return request;
    }

}
