/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConvertRecoveryPointToSnapshotRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConvertRecoveryPointToSnapshotRequestMarshaller {

    private static final MarshallingInfo<String> RECOVERYPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recoveryPointId").build();
    private static final MarshallingInfo<Integer> RETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retentionPeriod").build();
    private static final MarshallingInfo<String> SNAPSHOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotName").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final ConvertRecoveryPointToSnapshotRequestMarshaller instance = new ConvertRecoveryPointToSnapshotRequestMarshaller();

    public static ConvertRecoveryPointToSnapshotRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConvertRecoveryPointToSnapshotRequest convertRecoveryPointToSnapshotRequest, ProtocolMarshaller protocolMarshaller) {

        if (convertRecoveryPointToSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(convertRecoveryPointToSnapshotRequest.getRecoveryPointId(), RECOVERYPOINTID_BINDING);
            protocolMarshaller.marshall(convertRecoveryPointToSnapshotRequest.getRetentionPeriod(), RETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(convertRecoveryPointToSnapshotRequest.getSnapshotName(), SNAPSHOTNAME_BINDING);
            protocolMarshaller.marshall(convertRecoveryPointToSnapshotRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
