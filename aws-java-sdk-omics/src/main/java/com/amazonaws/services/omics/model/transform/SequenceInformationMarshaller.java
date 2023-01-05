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
package com.amazonaws.services.omics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.omics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SequenceInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SequenceInformationMarshaller {

    private static final MarshallingInfo<String> ALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("alignment").build();
    private static final MarshallingInfo<String> GENERATEDFROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("generatedFrom").build();
    private static final MarshallingInfo<Long> TOTALBASECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalBaseCount").build();
    private static final MarshallingInfo<Long> TOTALREADCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalReadCount").build();

    private static final SequenceInformationMarshaller instance = new SequenceInformationMarshaller();

    public static SequenceInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SequenceInformation sequenceInformation, ProtocolMarshaller protocolMarshaller) {

        if (sequenceInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sequenceInformation.getAlignment(), ALIGNMENT_BINDING);
            protocolMarshaller.marshall(sequenceInformation.getGeneratedFrom(), GENERATEDFROM_BINDING);
            protocolMarshaller.marshall(sequenceInformation.getTotalBaseCount(), TOTALBASECOUNT_BINDING);
            protocolMarshaller.marshall(sequenceInformation.getTotalReadCount(), TOTALREADCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
