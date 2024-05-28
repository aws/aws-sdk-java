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
package com.amazonaws.services.redshiftserverless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SnapshotCopyConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnapshotCopyConfigurationMarshaller {

    private static final MarshallingInfo<String> DESTINATIONKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationKmsKeyId").build();
    private static final MarshallingInfo<String> DESTINATIONREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationRegion").build();
    private static final MarshallingInfo<String> NAMESPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceName").build();
    private static final MarshallingInfo<String> SNAPSHOTCOPYCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotCopyConfigurationArn").build();
    private static final MarshallingInfo<String> SNAPSHOTCOPYCONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotCopyConfigurationId").build();
    private static final MarshallingInfo<Integer> SNAPSHOTRETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotRetentionPeriod").build();

    private static final SnapshotCopyConfigurationMarshaller instance = new SnapshotCopyConfigurationMarshaller();

    public static SnapshotCopyConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnapshotCopyConfiguration snapshotCopyConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (snapshotCopyConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snapshotCopyConfiguration.getDestinationKmsKeyId(), DESTINATIONKMSKEYID_BINDING);
            protocolMarshaller.marshall(snapshotCopyConfiguration.getDestinationRegion(), DESTINATIONREGION_BINDING);
            protocolMarshaller.marshall(snapshotCopyConfiguration.getNamespaceName(), NAMESPACENAME_BINDING);
            protocolMarshaller.marshall(snapshotCopyConfiguration.getSnapshotCopyConfigurationArn(), SNAPSHOTCOPYCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(snapshotCopyConfiguration.getSnapshotCopyConfigurationId(), SNAPSHOTCOPYCONFIGURATIONID_BINDING);
            protocolMarshaller.marshall(snapshotCopyConfiguration.getSnapshotRetentionPeriod(), SNAPSHOTRETENTIONPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
