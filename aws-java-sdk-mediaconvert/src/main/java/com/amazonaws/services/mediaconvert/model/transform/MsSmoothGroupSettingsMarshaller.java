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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MsSmoothGroupSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MsSmoothGroupSettingsMarshaller {

    private static final MarshallingInfo<String> AUDIODEDUPLICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioDeduplication").build();
    private static final MarshallingInfo<String> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destination").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryption").build();
    private static final MarshallingInfo<Integer> FRAGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fragmentLength").build();
    private static final MarshallingInfo<String> MANIFESTENCODING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestEncoding").build();

    private static final MsSmoothGroupSettingsMarshaller instance = new MsSmoothGroupSettingsMarshaller();

    public static MsSmoothGroupSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MsSmoothGroupSettings msSmoothGroupSettings, ProtocolMarshaller protocolMarshaller) {

        if (msSmoothGroupSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(msSmoothGroupSettings.getAudioDeduplication(), AUDIODEDUPLICATION_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getDestinationSettings(), DESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getFragmentLength(), FRAGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getManifestEncoding(), MANIFESTENCODING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
