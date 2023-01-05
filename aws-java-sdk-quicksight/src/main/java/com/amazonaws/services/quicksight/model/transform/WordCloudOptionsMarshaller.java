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
 * WordCloudOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WordCloudOptionsMarshaller {

    private static final MarshallingInfo<String> WORDORIENTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WordOrientation").build();
    private static final MarshallingInfo<String> WORDSCALING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WordScaling").build();
    private static final MarshallingInfo<String> CLOUDLAYOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudLayout").build();
    private static final MarshallingInfo<String> WORDCASING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WordCasing").build();
    private static final MarshallingInfo<String> WORDPADDING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WordPadding").build();
    private static final MarshallingInfo<Integer> MAXIMUMSTRINGLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumStringLength").build();

    private static final WordCloudOptionsMarshaller instance = new WordCloudOptionsMarshaller();

    public static WordCloudOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WordCloudOptions wordCloudOptions, ProtocolMarshaller protocolMarshaller) {

        if (wordCloudOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(wordCloudOptions.getWordOrientation(), WORDORIENTATION_BINDING);
            protocolMarshaller.marshall(wordCloudOptions.getWordScaling(), WORDSCALING_BINDING);
            protocolMarshaller.marshall(wordCloudOptions.getCloudLayout(), CLOUDLAYOUT_BINDING);
            protocolMarshaller.marshall(wordCloudOptions.getWordCasing(), WORDCASING_BINDING);
            protocolMarshaller.marshall(wordCloudOptions.getWordPadding(), WORDPADDING_BINDING);
            protocolMarshaller.marshall(wordCloudOptions.getMaximumStringLength(), MAXIMUMSTRINGLENGTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
