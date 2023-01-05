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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KinesisVideoStreamStartSelectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KinesisVideoStreamStartSelectorMarshaller {

    private static final MarshallingInfo<Long> PRODUCERTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProducerTimestamp").build();
    private static final MarshallingInfo<String> FRAGMENTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FragmentNumber").build();

    private static final KinesisVideoStreamStartSelectorMarshaller instance = new KinesisVideoStreamStartSelectorMarshaller();

    public static KinesisVideoStreamStartSelectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KinesisVideoStreamStartSelector kinesisVideoStreamStartSelector, ProtocolMarshaller protocolMarshaller) {

        if (kinesisVideoStreamStartSelector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kinesisVideoStreamStartSelector.getProducerTimestamp(), PRODUCERTIMESTAMP_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamStartSelector.getFragmentNumber(), FRAGMENTNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
