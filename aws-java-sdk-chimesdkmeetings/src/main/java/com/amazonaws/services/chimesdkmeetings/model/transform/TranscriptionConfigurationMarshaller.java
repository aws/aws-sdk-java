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
package com.amazonaws.services.chimesdkmeetings.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmeetings.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TranscriptionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TranscriptionConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> ENGINETRANSCRIBESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineTranscribeSettings").build();
    private static final MarshallingInfo<StructuredPojo> ENGINETRANSCRIBEMEDICALSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineTranscribeMedicalSettings").build();

    private static final TranscriptionConfigurationMarshaller instance = new TranscriptionConfigurationMarshaller();

    public static TranscriptionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TranscriptionConfiguration transcriptionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (transcriptionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transcriptionConfiguration.getEngineTranscribeSettings(), ENGINETRANSCRIBESETTINGS_BINDING);
            protocolMarshaller.marshall(transcriptionConfiguration.getEngineTranscribeMedicalSettings(), ENGINETRANSCRIBEMEDICALSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
