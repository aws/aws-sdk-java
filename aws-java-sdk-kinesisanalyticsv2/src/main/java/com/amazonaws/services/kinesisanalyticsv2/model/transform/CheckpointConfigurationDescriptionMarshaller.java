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
 * CheckpointConfigurationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CheckpointConfigurationDescriptionMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationType").build();
    private static final MarshallingInfo<Boolean> CHECKPOINTINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CheckpointingEnabled").build();
    private static final MarshallingInfo<Long> CHECKPOINTINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CheckpointInterval").build();
    private static final MarshallingInfo<Long> MINPAUSEBETWEENCHECKPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinPauseBetweenCheckpoints").build();

    private static final CheckpointConfigurationDescriptionMarshaller instance = new CheckpointConfigurationDescriptionMarshaller();

    public static CheckpointConfigurationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CheckpointConfigurationDescription checkpointConfigurationDescription, ProtocolMarshaller protocolMarshaller) {

        if (checkpointConfigurationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(checkpointConfigurationDescription.getConfigurationType(), CONFIGURATIONTYPE_BINDING);
            protocolMarshaller.marshall(checkpointConfigurationDescription.getCheckpointingEnabled(), CHECKPOINTINGENABLED_BINDING);
            protocolMarshaller.marshall(checkpointConfigurationDescription.getCheckpointInterval(), CHECKPOINTINTERVAL_BINDING);
            protocolMarshaller.marshall(checkpointConfigurationDescription.getMinPauseBetweenCheckpoints(), MINPAUSEBETWEENCHECKPOINTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
