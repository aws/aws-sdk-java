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
 * EngineTranscribeSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EngineTranscribeSettingsMarshaller {

    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<String> VOCABULARYFILTERMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyFilterMethod").build();
    private static final MarshallingInfo<String> VOCABULARYFILTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyFilterName").build();
    private static final MarshallingInfo<String> VOCABULARYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyName").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Region").build();
    private static final MarshallingInfo<Boolean> ENABLEPARTIALRESULTSSTABILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnablePartialResultsStabilization").build();
    private static final MarshallingInfo<String> PARTIALRESULTSSTABILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PartialResultsStability").build();
    private static final MarshallingInfo<String> CONTENTIDENTIFICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentIdentificationType").build();
    private static final MarshallingInfo<String> CONTENTREDACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentRedactionType").build();
    private static final MarshallingInfo<String> PIIENTITYTYPES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PiiEntityTypes").build();
    private static final MarshallingInfo<String> LANGUAGEMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageModelName").build();
    private static final MarshallingInfo<Boolean> IDENTIFYLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentifyLanguage").build();
    private static final MarshallingInfo<String> LANGUAGEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageOptions").build();
    private static final MarshallingInfo<String> PREFERREDLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredLanguage").build();

    private static final EngineTranscribeSettingsMarshaller instance = new EngineTranscribeSettingsMarshaller();

    public static EngineTranscribeSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EngineTranscribeSettings engineTranscribeSettings, ProtocolMarshaller protocolMarshaller) {

        if (engineTranscribeSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(engineTranscribeSettings.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getVocabularyFilterMethod(), VOCABULARYFILTERMETHOD_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getVocabularyFilterName(), VOCABULARYFILTERNAME_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getVocabularyName(), VOCABULARYNAME_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getEnablePartialResultsStabilization(), ENABLEPARTIALRESULTSSTABILIZATION_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getPartialResultsStability(), PARTIALRESULTSSTABILITY_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getContentIdentificationType(), CONTENTIDENTIFICATIONTYPE_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getContentRedactionType(), CONTENTREDACTIONTYPE_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getPiiEntityTypes(), PIIENTITYTYPES_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getLanguageModelName(), LANGUAGEMODELNAME_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getIdentifyLanguage(), IDENTIFYLANGUAGE_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getLanguageOptions(), LANGUAGEOPTIONS_BINDING);
            protocolMarshaller.marshall(engineTranscribeSettings.getPreferredLanguage(), PREFERREDLANGUAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
