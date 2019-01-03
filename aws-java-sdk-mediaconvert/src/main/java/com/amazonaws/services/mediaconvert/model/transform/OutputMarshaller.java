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
package com.amazonaws.services.mediaconvert.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutputMarshaller {

    private static final MarshallingInfo<List> AUDIODESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioDescriptions").build();
    private static final MarshallingInfo<List> CAPTIONDESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captionDescriptions").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerSettings").build();
    private static final MarshallingInfo<String> EXTENSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("extension").build();
    private static final MarshallingInfo<String> NAMEMODIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nameModifier").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputSettings").build();
    private static final MarshallingInfo<String> PRESET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("preset").build();
    private static final MarshallingInfo<StructuredPojo> VIDEODESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoDescription").build();

    private static final OutputMarshaller instance = new OutputMarshaller();

    public static OutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Output output, ProtocolMarshaller protocolMarshaller) {

        if (output == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(output.getAudioDescriptions(), AUDIODESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(output.getCaptionDescriptions(), CAPTIONDESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(output.getContainerSettings(), CONTAINERSETTINGS_BINDING);
            protocolMarshaller.marshall(output.getExtension(), EXTENSION_BINDING);
            protocolMarshaller.marshall(output.getNameModifier(), NAMEMODIFIER_BINDING);
            protocolMarshaller.marshall(output.getOutputSettings(), OUTPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(output.getPreset(), PRESET_BINDING);
            protocolMarshaller.marshall(output.getVideoDescription(), VIDEODESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
