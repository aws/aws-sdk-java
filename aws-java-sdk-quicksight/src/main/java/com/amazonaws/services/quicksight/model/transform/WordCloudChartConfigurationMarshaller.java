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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WordCloudChartConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WordCloudChartConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> WORDCLOUDOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WordCloudOptions").build();

    private static final WordCloudChartConfigurationMarshaller instance = new WordCloudChartConfigurationMarshaller();

    public static WordCloudChartConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WordCloudChartConfiguration wordCloudChartConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (wordCloudChartConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(wordCloudChartConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(wordCloudChartConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(wordCloudChartConfiguration.getCategoryLabelOptions(), CATEGORYLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(wordCloudChartConfiguration.getWordCloudOptions(), WORDCLOUDOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
