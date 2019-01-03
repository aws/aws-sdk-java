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
 * IncreaseReplicaCountRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncreaseReplicaCountRequestMarshaller implements Marshaller<Request<IncreaseReplicaCountRequest>, IncreaseReplicaCountRequest> {

    public Request<IncreaseReplicaCountRequest> marshall(IncreaseReplicaCountRequest increaseReplicaCountRequest) {

        if (increaseReplicaCountRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<IncreaseReplicaCountRequest> request = new DefaultRequest<IncreaseReplicaCountRequest>(increaseReplicaCountRequest, "AmazonElastiCache");
        request.addParameter("Action", "IncreaseReplicaCount");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (increaseReplicaCountRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(increaseReplicaCountRequest.getReplicationGroupId()));
        }

        if (increaseReplicaCountRequest.getNewReplicaCount() != null) {
            request.addParameter("NewReplicaCount", StringUtils.fromInteger(increaseReplicaCountRequest.getNewReplicaCount()));
        }

        if (!increaseReplicaCountRequest.getReplicaConfiguration().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ConfigureShard>) increaseReplicaCountRequest.getReplicaConfiguration()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ConfigureShard> replicaConfigurationList = (com.amazonaws.internal.SdkInternalList<ConfigureShard>) increaseReplicaCountRequest
                    .getReplicaConfiguration();
            int replicaConfigurationListIndex = 1;

            for (ConfigureShard replicaConfigurationListValue : replicaConfigurationList) {

                if (replicaConfigurationListValue.getNodeGroupId() != null) {
                    request.addParameter("ReplicaConfiguration.ConfigureShard." + replicaConfigurationListIndex + ".NodeGroupId",
                            StringUtils.fromString(replicaConfigurationListValue.getNodeGroupId()));
                }

                if (replicaConfigurationListValue.getNewReplicaCount() != null) {
                    request.addParameter("ReplicaConfiguration.ConfigureShard." + replicaConfigurationListIndex + ".NewReplicaCount",
                            StringUtils.fromInteger(replicaConfigurationListValue.getNewReplicaCount()));
                }

                if (!replicaConfigurationListValue.getPreferredAvailabilityZones().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) replicaConfigurationListValue.getPreferredAvailabilityZones()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> preferredAvailabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) replicaConfigurationListValue
                            .getPreferredAvailabilityZones();
                    int preferredAvailabilityZonesListIndex = 1;

                    for (String preferredAvailabilityZonesListValue : preferredAvailabilityZonesList) {
                        if (preferredAvailabilityZonesListValue != null) {
                            request.addParameter("ReplicaConfiguration.ConfigureShard." + replicaConfigurationListIndex
                                    + ".PreferredAvailabilityZones.PreferredAvailabilityZone." + preferredAvailabilityZonesListIndex,
                                    StringUtils.fromString(preferredAvailabilityZonesListValue));
                        }
                        preferredAvailabilityZonesListIndex++;
                    }
                }
                replicaConfigurationListIndex++;
            }
        }

        if (increaseReplicaCountRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(increaseReplicaCountRequest.getApplyImmediately()));
        }

        return request;
    }

}
