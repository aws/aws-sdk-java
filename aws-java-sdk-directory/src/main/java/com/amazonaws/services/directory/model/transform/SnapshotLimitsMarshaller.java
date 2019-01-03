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
package com.amazonaws.services.directory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SnapshotLimitsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnapshotLimitsMarshaller {

    private static final MarshallingInfo<Integer> MANUALSNAPSHOTSLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManualSnapshotsLimit").build();
    private static final MarshallingInfo<Integer> MANUALSNAPSHOTSCURRENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManualSnapshotsCurrentCount").build();
    private static final MarshallingInfo<Boolean> MANUALSNAPSHOTSLIMITREACHED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManualSnapshotsLimitReached").build();

    private static final SnapshotLimitsMarshaller instance = new SnapshotLimitsMarshaller();

    public static SnapshotLimitsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnapshotLimits snapshotLimits, ProtocolMarshaller protocolMarshaller) {

        if (snapshotLimits == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snapshotLimits.getManualSnapshotsLimit(), MANUALSNAPSHOTSLIMIT_BINDING);
            protocolMarshaller.marshall(snapshotLimits.getManualSnapshotsCurrentCount(), MANUALSNAPSHOTSCURRENTCOUNT_BINDING);
            protocolMarshaller.marshall(snapshotLimits.getManualSnapshotsLimitReached(), MANUALSNAPSHOTSLIMITREACHED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
