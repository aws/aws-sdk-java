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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CheckpointConfigurationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CheckpointConfigurationUpdateMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONTYPEUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationTypeUpdate").build();
    private static final MarshallingInfo<Boolean> CHECKPOINTINGENABLEDUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CheckpointingEnabledUpdate").build();
    private static final MarshallingInfo<Long> CHECKPOINTINTERVALUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CheckpointIntervalUpdate").build();
    private static final MarshallingInfo<Long> MINPAUSEBETWEENCHECKPOINTSUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinPauseBetweenCheckpointsUpdate").build();

    private static final CheckpointConfigurationUpdateMarshaller instance = new CheckpointConfigurationUpdateMarshaller();

    public static CheckpointConfigurationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CheckpointConfigurationUpdate checkpointConfigurationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (checkpointConfigurationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(checkpointConfigurationUpdate.getConfigurationTypeUpdate(), CONFIGURATIONTYPEUPDATE_BINDING);
            protocolMarshaller.marshall(checkpointConfigurationUpdate.getCheckpointingEnabledUpdate(), CHECKPOINTINGENABLEDUPDATE_BINDING);
            protocolMarshaller.marshall(checkpointConfigurationUpdate.getCheckpointIntervalUpdate(), CHECKPOINTINTERVALUPDATE_BINDING);
            protocolMarshaller.marshall(checkpointConfigurationUpdate.getMinPauseBetweenCheckpointsUpdate(), MINPAUSEBETWEENCHECKPOINTSUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
