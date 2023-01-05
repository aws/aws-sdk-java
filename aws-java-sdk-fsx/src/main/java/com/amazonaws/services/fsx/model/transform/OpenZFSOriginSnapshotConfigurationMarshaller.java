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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OpenZFSOriginSnapshotConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OpenZFSOriginSnapshotConfigurationMarshaller {

    private static final MarshallingInfo<String> SNAPSHOTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotARN").build();
    private static final MarshallingInfo<String> COPYSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyStrategy").build();

    private static final OpenZFSOriginSnapshotConfigurationMarshaller instance = new OpenZFSOriginSnapshotConfigurationMarshaller();

    public static OpenZFSOriginSnapshotConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OpenZFSOriginSnapshotConfiguration openZFSOriginSnapshotConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (openZFSOriginSnapshotConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(openZFSOriginSnapshotConfiguration.getSnapshotARN(), SNAPSHOTARN_BINDING);
            protocolMarshaller.marshall(openZFSOriginSnapshotConfiguration.getCopyStrategy(), COPYSTRATEGY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
