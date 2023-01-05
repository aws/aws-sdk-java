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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NewCustomVocabularyItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NewCustomVocabularyItemMarshaller {

    private static final MarshallingInfo<String> PHRASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("phrase").build();
    private static final MarshallingInfo<Integer> WEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("weight").build();
    private static final MarshallingInfo<String> DISPLAYAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("displayAs").build();

    private static final NewCustomVocabularyItemMarshaller instance = new NewCustomVocabularyItemMarshaller();

    public static NewCustomVocabularyItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NewCustomVocabularyItem newCustomVocabularyItem, ProtocolMarshaller protocolMarshaller) {

        if (newCustomVocabularyItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(newCustomVocabularyItem.getPhrase(), PHRASE_BINDING);
            protocolMarshaller.marshall(newCustomVocabularyItem.getWeight(), WEIGHT_BINDING);
            protocolMarshaller.marshall(newCustomVocabularyItem.getDisplayAs(), DISPLAYAS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
