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
package com.amazonaws.services.medialive.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutputMarshaller {

    private static final MarshallingInfo<List> AUDIODESCRIPTIONNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioDescriptionNames").build();
    private static final MarshallingInfo<List> CAPTIONDESCRIPTIONNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captionDescriptionNames").build();
    private static final MarshallingInfo<String> OUTPUTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputName").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputSettings").build();
    private static final MarshallingInfo<String> VIDEODESCRIPTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoDescriptionName").build();

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
            protocolMarshaller.marshall(output.getAudioDescriptionNames(), AUDIODESCRIPTIONNAMES_BINDING);
            protocolMarshaller.marshall(output.getCaptionDescriptionNames(), CAPTIONDESCRIPTIONNAMES_BINDING);
            protocolMarshaller.marshall(output.getOutputName(), OUTPUTNAME_BINDING);
            protocolMarshaller.marshall(output.getOutputSettings(), OUTPUTSETTINGS_BINDING);
            protocolMarshaller.marshall(output.getVideoDescriptionName(), VIDEODESCRIPTIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
