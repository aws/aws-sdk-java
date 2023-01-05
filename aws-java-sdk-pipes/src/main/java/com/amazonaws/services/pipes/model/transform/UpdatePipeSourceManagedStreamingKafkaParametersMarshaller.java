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
package com.amazonaws.services.pipes.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePipeSourceManagedStreamingKafkaParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePipeSourceManagedStreamingKafkaParametersMarshaller {

    private static final MarshallingInfo<Integer> BATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchSize").build();
    private static final MarshallingInfo<StructuredPojo> CREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Credentials").build();
    private static final MarshallingInfo<Integer> MAXIMUMBATCHINGWINDOWINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumBatchingWindowInSeconds").build();

    private static final UpdatePipeSourceManagedStreamingKafkaParametersMarshaller instance = new UpdatePipeSourceManagedStreamingKafkaParametersMarshaller();

    public static UpdatePipeSourceManagedStreamingKafkaParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePipeSourceManagedStreamingKafkaParameters updatePipeSourceManagedStreamingKafkaParameters, ProtocolMarshaller protocolMarshaller) {

        if (updatePipeSourceManagedStreamingKafkaParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePipeSourceManagedStreamingKafkaParameters.getBatchSize(), BATCHSIZE_BINDING);
            protocolMarshaller.marshall(updatePipeSourceManagedStreamingKafkaParameters.getCredentials(), CREDENTIALS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceManagedStreamingKafkaParameters.getMaximumBatchingWindowInSeconds(),
                    MAXIMUMBATCHINGWINDOWINSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
