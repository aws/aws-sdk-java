/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MedicalTranscriptionSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MedicalTranscriptionSettingMarshaller {

    private static final MarshallingInfo<Boolean> SHOWSPEAKERLABELS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShowSpeakerLabels").build();
    private static final MarshallingInfo<Integer> MAXSPEAKERLABELS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxSpeakerLabels").build();
    private static final MarshallingInfo<Boolean> CHANNELIDENTIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelIdentification").build();
    private static final MarshallingInfo<Boolean> SHOWALTERNATIVES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShowAlternatives").build();
    private static final MarshallingInfo<Integer> MAXALTERNATIVES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAlternatives").build();
    private static final MarshallingInfo<String> VOCABULARYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyName").build();

    private static final MedicalTranscriptionSettingMarshaller instance = new MedicalTranscriptionSettingMarshaller();

    public static MedicalTranscriptionSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MedicalTranscriptionSetting medicalTranscriptionSetting, ProtocolMarshaller protocolMarshaller) {

        if (medicalTranscriptionSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(medicalTranscriptionSetting.getShowSpeakerLabels(), SHOWSPEAKERLABELS_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionSetting.getMaxSpeakerLabels(), MAXSPEAKERLABELS_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionSetting.getChannelIdentification(), CHANNELIDENTIFICATION_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionSetting.getShowAlternatives(), SHOWALTERNATIVES_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionSetting.getMaxAlternatives(), MAXALTERNATIVES_BINDING);
            protocolMarshaller.marshall(medicalTranscriptionSetting.getVocabularyName(), VOCABULARYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
