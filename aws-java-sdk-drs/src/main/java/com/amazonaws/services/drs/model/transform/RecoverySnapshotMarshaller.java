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
package com.amazonaws.services.drs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.drs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecoverySnapshotMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecoverySnapshotMarshaller {

    private static final MarshallingInfo<List> EBSSNAPSHOTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ebsSnapshots").build();
    private static final MarshallingInfo<String> EXPECTEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expectedTimestamp").build();
    private static final MarshallingInfo<String> SNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotID").build();
    private static final MarshallingInfo<String> SOURCESERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceServerID").build();
    private static final MarshallingInfo<String> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timestamp").build();

    private static final RecoverySnapshotMarshaller instance = new RecoverySnapshotMarshaller();

    public static RecoverySnapshotMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecoverySnapshot recoverySnapshot, ProtocolMarshaller protocolMarshaller) {

        if (recoverySnapshot == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recoverySnapshot.getEbsSnapshots(), EBSSNAPSHOTS_BINDING);
            protocolMarshaller.marshall(recoverySnapshot.getExpectedTimestamp(), EXPECTEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(recoverySnapshot.getSnapshotID(), SNAPSHOTID_BINDING);
            protocolMarshaller.marshall(recoverySnapshot.getSourceServerID(), SOURCESERVERID_BINDING);
            protocolMarshaller.marshall(recoverySnapshot.getTimestamp(), TIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
