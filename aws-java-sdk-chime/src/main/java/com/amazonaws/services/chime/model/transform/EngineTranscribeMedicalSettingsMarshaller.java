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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EngineTranscribeMedicalSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EngineTranscribeMedicalSettingsMarshaller {

    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<String> SPECIALTY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Specialty").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> VOCABULARYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyName").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Region").build();
    private static final MarshallingInfo<String> CONTENTIDENTIFICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentIdentificationType").build();

    private static final EngineTranscribeMedicalSettingsMarshaller instance = new EngineTranscribeMedicalSettingsMarshaller();

    public static EngineTranscribeMedicalSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EngineTranscribeMedicalSettings engineTranscribeMedicalSettings, ProtocolMarshaller protocolMarshaller) {

        if (engineTranscribeMedicalSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(engineTranscribeMedicalSettings.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(engineTranscribeMedicalSettings.getSpecialty(), SPECIALTY_BINDING);
            protocolMarshaller.marshall(engineTranscribeMedicalSettings.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(engineTranscribeMedicalSettings.getVocabularyName(), VOCABULARYNAME_BINDING);
            protocolMarshaller.marshall(engineTranscribeMedicalSettings.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(engineTranscribeMedicalSettings.getContentIdentificationType(), CONTENTIDENTIFICATIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
