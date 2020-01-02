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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplicaGlobalSecondaryIndexAutoScalingDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicaGlobalSecondaryIndexAutoScalingDescriptionMarshaller {

    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexName").build();
    private static final MarshallingInfo<String> INDEXSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndexStatus").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONEDREADCAPACITYAUTOSCALINGSETTINGS_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedReadCapacityAutoScalingSettings")
            .build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGS_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedWriteCapacityAutoScalingSettings")
            .build();

    private static final ReplicaGlobalSecondaryIndexAutoScalingDescriptionMarshaller instance = new ReplicaGlobalSecondaryIndexAutoScalingDescriptionMarshaller();

    public static ReplicaGlobalSecondaryIndexAutoScalingDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicaGlobalSecondaryIndexAutoScalingDescription replicaGlobalSecondaryIndexAutoScalingDescription,
            ProtocolMarshaller protocolMarshaller) {

        if (replicaGlobalSecondaryIndexAutoScalingDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicaGlobalSecondaryIndexAutoScalingDescription.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(replicaGlobalSecondaryIndexAutoScalingDescription.getIndexStatus(), INDEXSTATUS_BINDING);
            protocolMarshaller.marshall(replicaGlobalSecondaryIndexAutoScalingDescription.getProvisionedReadCapacityAutoScalingSettings(),
                    PROVISIONEDREADCAPACITYAUTOSCALINGSETTINGS_BINDING);
            protocolMarshaller.marshall(replicaGlobalSecondaryIndexAutoScalingDescription.getProvisionedWriteCapacityAutoScalingSettings(),
                    PROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
