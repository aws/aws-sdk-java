/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AmazonTranscribeProcessorConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AmazonTranscribeProcessorConfigurationMarshaller {

    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<String> VOCABULARYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyName").build();
    private static final MarshallingInfo<String> VOCABULARYFILTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyFilterName").build();
    private static final MarshallingInfo<String> VOCABULARYFILTERMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyFilterMethod").build();
    private static final MarshallingInfo<Boolean> SHOWSPEAKERLABEL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShowSpeakerLabel").build();
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
    private static final MarshallingInfo<Boolean> FILTERPARTIALRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterPartialResults").build();
    private static final MarshallingInfo<Boolean> IDENTIFYLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentifyLanguage").build();
    private static final MarshallingInfo<String> LANGUAGEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageOptions").build();
    private static final MarshallingInfo<String> PREFERREDLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredLanguage").build();
    private static final MarshallingInfo<String> VOCABULARYNAMES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyNames").build();
    private static final MarshallingInfo<String> VOCABULARYFILTERNAMES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyFilterNames").build();

    private static final AmazonTranscribeProcessorConfigurationMarshaller instance = new AmazonTranscribeProcessorConfigurationMarshaller();

    public static AmazonTranscribeProcessorConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AmazonTranscribeProcessorConfiguration amazonTranscribeProcessorConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (amazonTranscribeProcessorConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getVocabularyName(), VOCABULARYNAME_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getVocabularyFilterName(), VOCABULARYFILTERNAME_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getVocabularyFilterMethod(), VOCABULARYFILTERMETHOD_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getShowSpeakerLabel(), SHOWSPEAKERLABEL_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getEnablePartialResultsStabilization(),
                    ENABLEPARTIALRESULTSSTABILIZATION_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getPartialResultsStability(), PARTIALRESULTSSTABILITY_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getContentIdentificationType(), CONTENTIDENTIFICATIONTYPE_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getContentRedactionType(), CONTENTREDACTIONTYPE_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getPiiEntityTypes(), PIIENTITYTYPES_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getLanguageModelName(), LANGUAGEMODELNAME_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getFilterPartialResults(), FILTERPARTIALRESULTS_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getIdentifyLanguage(), IDENTIFYLANGUAGE_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getLanguageOptions(), LANGUAGEOPTIONS_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getPreferredLanguage(), PREFERREDLANGUAGE_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getVocabularyNames(), VOCABULARYNAMES_BINDING);
            protocolMarshaller.marshall(amazonTranscribeProcessorConfiguration.getVocabularyFilterNames(), VOCABULARYFILTERNAMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
