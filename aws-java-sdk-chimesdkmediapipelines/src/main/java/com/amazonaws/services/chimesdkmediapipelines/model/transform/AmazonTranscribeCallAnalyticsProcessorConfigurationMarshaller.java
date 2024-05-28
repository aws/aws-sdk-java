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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AmazonTranscribeCallAnalyticsProcessorConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AmazonTranscribeCallAnalyticsProcessorConfigurationMarshaller {

    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<String> VOCABULARYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyName").build();
    private static final MarshallingInfo<String> VOCABULARYFILTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyFilterName").build();
    private static final MarshallingInfo<String> VOCABULARYFILTERMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyFilterMethod").build();
    private static final MarshallingInfo<String> LANGUAGEMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageModelName").build();
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
    private static final MarshallingInfo<Boolean> FILTERPARTIALRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterPartialResults").build();
    private static final MarshallingInfo<StructuredPojo> POSTCALLANALYTICSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostCallAnalyticsSettings").build();
    private static final MarshallingInfo<List> CALLANALYTICSSTREAMCATEGORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallAnalyticsStreamCategories").build();

    private static final AmazonTranscribeCallAnalyticsProcessorConfigurationMarshaller instance = new AmazonTranscribeCallAnalyticsProcessorConfigurationMarshaller();

    public static AmazonTranscribeCallAnalyticsProcessorConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AmazonTranscribeCallAnalyticsProcessorConfiguration amazonTranscribeCallAnalyticsProcessorConfiguration,
            ProtocolMarshaller protocolMarshaller) {

        if (amazonTranscribeCallAnalyticsProcessorConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getVocabularyName(), VOCABULARYNAME_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getVocabularyFilterName(), VOCABULARYFILTERNAME_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getVocabularyFilterMethod(), VOCABULARYFILTERMETHOD_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getLanguageModelName(), LANGUAGEMODELNAME_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getEnablePartialResultsStabilization(),
                    ENABLEPARTIALRESULTSSTABILIZATION_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getPartialResultsStability(), PARTIALRESULTSSTABILITY_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getContentIdentificationType(), CONTENTIDENTIFICATIONTYPE_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getContentRedactionType(), CONTENTREDACTIONTYPE_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getPiiEntityTypes(), PIIENTITYTYPES_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getFilterPartialResults(), FILTERPARTIALRESULTS_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getPostCallAnalyticsSettings(), POSTCALLANALYTICSSETTINGS_BINDING);
            protocolMarshaller.marshall(amazonTranscribeCallAnalyticsProcessorConfiguration.getCallAnalyticsStreamCategories(),
                    CALLANALYTICSSTREAMCATEGORIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
