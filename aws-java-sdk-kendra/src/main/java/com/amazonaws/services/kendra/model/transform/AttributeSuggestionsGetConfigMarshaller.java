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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AttributeSuggestionsGetConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AttributeSuggestionsGetConfigMarshaller {

    private static final MarshallingInfo<List> SUGGESTIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SuggestionAttributes").build();
    private static final MarshallingInfo<List> ADDITIONALRESPONSEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalResponseAttributes").build();
    private static final MarshallingInfo<StructuredPojo> ATTRIBUTEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributeFilter").build();
    private static final MarshallingInfo<StructuredPojo> USERCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserContext").build();

    private static final AttributeSuggestionsGetConfigMarshaller instance = new AttributeSuggestionsGetConfigMarshaller();

    public static AttributeSuggestionsGetConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AttributeSuggestionsGetConfig attributeSuggestionsGetConfig, ProtocolMarshaller protocolMarshaller) {

        if (attributeSuggestionsGetConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(attributeSuggestionsGetConfig.getSuggestionAttributes(), SUGGESTIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(attributeSuggestionsGetConfig.getAdditionalResponseAttributes(), ADDITIONALRESPONSEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(attributeSuggestionsGetConfig.getAttributeFilter(), ATTRIBUTEFILTER_BINDING);
            protocolMarshaller.marshall(attributeSuggestionsGetConfig.getUserContext(), USERCONTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
