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
 * AudioSelectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AudioSelectorMarshaller {

    private static final MarshallingInfo<String> CUSTOMLANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customLanguageCode").build();
    private static final MarshallingInfo<String> DEFAULTSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultSelection").build();
    private static final MarshallingInfo<String> EXTERNALAUDIOFILEINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalAudioFileInput").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("languageCode").build();
    private static final MarshallingInfo<Integer> OFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("offset").build();
    private static final MarshallingInfo<List> PIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pids").build();
    private static final MarshallingInfo<Integer> PROGRAMSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programSelection").build();
    private static final MarshallingInfo<StructuredPojo> REMIXSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remixSettings").build();
    private static final MarshallingInfo<String> SELECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("selectorType").build();
    private static final MarshallingInfo<List> TRACKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tracks").build();

    private static final AudioSelectorMarshaller instance = new AudioSelectorMarshaller();

    public static AudioSelectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AudioSelector audioSelector, ProtocolMarshaller protocolMarshaller) {

        if (audioSelector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(audioSelector.getCustomLanguageCode(), CUSTOMLANGUAGECODE_BINDING);
            protocolMarshaller.marshall(audioSelector.getDefaultSelection(), DEFAULTSELECTION_BINDING);
            protocolMarshaller.marshall(audioSelector.getExternalAudioFileInput(), EXTERNALAUDIOFILEINPUT_BINDING);
            protocolMarshaller.marshall(audioSelector.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(audioSelector.getOffset(), OFFSET_BINDING);
            protocolMarshaller.marshall(audioSelector.getPids(), PIDS_BINDING);
            protocolMarshaller.marshall(audioSelector.getProgramSelection(), PROGRAMSELECTION_BINDING);
            protocolMarshaller.marshall(audioSelector.getRemixSettings(), REMIXSETTINGS_BINDING);
            protocolMarshaller.marshall(audioSelector.getSelectorType(), SELECTORTYPE_BINDING);
            protocolMarshaller.marshall(audioSelector.getTracks(), TRACKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
