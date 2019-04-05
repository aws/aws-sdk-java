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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProviderUserIdentifierTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProviderUserIdentifierTypeMarshaller {

    private static final MarshallingInfo<String> PROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProviderName").build();
    private static final MarshallingInfo<String> PROVIDERATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProviderAttributeName").build();
    private static final MarshallingInfo<String> PROVIDERATTRIBUTEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProviderAttributeValue").build();

    private static final ProviderUserIdentifierTypeMarshaller instance = new ProviderUserIdentifierTypeMarshaller();

    public static ProviderUserIdentifierTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProviderUserIdentifierType providerUserIdentifierType, ProtocolMarshaller protocolMarshaller) {

        if (providerUserIdentifierType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(providerUserIdentifierType.getProviderName(), PROVIDERNAME_BINDING);
            protocolMarshaller.marshall(providerUserIdentifierType.getProviderAttributeName(), PROVIDERATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(providerUserIdentifierType.getProviderAttributeValue(), PROVIDERATTRIBUTEVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
