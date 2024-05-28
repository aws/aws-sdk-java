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
package com.amazonaws.services.customerprofiles.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AttributeTypesSelectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AttributeTypesSelectorMarshaller {

    private static final MarshallingInfo<String> ATTRIBUTEMATCHINGMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributeMatchingModel").build();
    private static final MarshallingInfo<List> ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address").build();
    private static final MarshallingInfo<List> PHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PhoneNumber").build();
    private static final MarshallingInfo<List> EMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EmailAddress").build();

    private static final AttributeTypesSelectorMarshaller instance = new AttributeTypesSelectorMarshaller();

    public static AttributeTypesSelectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AttributeTypesSelector attributeTypesSelector, ProtocolMarshaller protocolMarshaller) {

        if (attributeTypesSelector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(attributeTypesSelector.getAttributeMatchingModel(), ATTRIBUTEMATCHINGMODEL_BINDING);
            protocolMarshaller.marshall(attributeTypesSelector.getAddress(), ADDRESS_BINDING);
            protocolMarshaller.marshall(attributeTypesSelector.getPhoneNumber(), PHONENUMBER_BINDING);
            protocolMarshaller.marshall(attributeTypesSelector.getEmailAddress(), EMAILADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
