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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplicaSettingsDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicaSettingsDescriptionMarshaller {

    private static final MarshallingInfo<String> REGIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegionName").build();
    private static final MarshallingInfo<String> REPLICASTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaStatus").build();
    private static final MarshallingInfo<StructuredPojo> REPLICABILLINGMODESUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaBillingModeSummary").build();
    private static final MarshallingInfo<Long> REPLICAPROVISIONEDREADCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaProvisionedReadCapacityUnits").build();
    private static final MarshallingInfo<StructuredPojo> REPLICAPROVISIONEDREADCAPACITYAUTOSCALINGSETTINGS_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReplicaProvisionedReadCapacityAutoScalingSettings").build();
    private static final MarshallingInfo<Long> REPLICAPROVISIONEDWRITECAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaProvisionedWriteCapacityUnits").build();
    private static final MarshallingInfo<StructuredPojo> REPLICAPROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGS_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReplicaProvisionedWriteCapacityAutoScalingSettings").build();
    private static final MarshallingInfo<List> REPLICAGLOBALSECONDARYINDEXSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaGlobalSecondaryIndexSettings").build();

    private static final ReplicaSettingsDescriptionMarshaller instance = new ReplicaSettingsDescriptionMarshaller();

    public static ReplicaSettingsDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicaSettingsDescription replicaSettingsDescription, ProtocolMarshaller protocolMarshaller) {

        if (replicaSettingsDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicaSettingsDescription.getRegionName(), REGIONNAME_BINDING);
            protocolMarshaller.marshall(replicaSettingsDescription.getReplicaStatus(), REPLICASTATUS_BINDING);
            protocolMarshaller.marshall(replicaSettingsDescription.getReplicaBillingModeSummary(), REPLICABILLINGMODESUMMARY_BINDING);
            protocolMarshaller.marshall(replicaSettingsDescription.getReplicaProvisionedReadCapacityUnits(), REPLICAPROVISIONEDREADCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(replicaSettingsDescription.getReplicaProvisionedReadCapacityAutoScalingSettings(),
                    REPLICAPROVISIONEDREADCAPACITYAUTOSCALINGSETTINGS_BINDING);
            protocolMarshaller.marshall(replicaSettingsDescription.getReplicaProvisionedWriteCapacityUnits(), REPLICAPROVISIONEDWRITECAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(replicaSettingsDescription.getReplicaProvisionedWriteCapacityAutoScalingSettings(),
                    REPLICAPROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGS_BINDING);
            protocolMarshaller.marshall(replicaSettingsDescription.getReplicaGlobalSecondaryIndexSettings(), REPLICAGLOBALSECONDARYINDEXSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
