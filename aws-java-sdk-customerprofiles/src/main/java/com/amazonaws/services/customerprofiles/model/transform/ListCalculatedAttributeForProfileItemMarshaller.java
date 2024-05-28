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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListCalculatedAttributeForProfileItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListCalculatedAttributeForProfileItemMarshaller {

    private static final MarshallingInfo<String> CALCULATEDATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedAttributeName").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> ISDATAPARTIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsDataPartial").build();
    private static final MarshallingInfo<String> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Value").build();

    private static final ListCalculatedAttributeForProfileItemMarshaller instance = new ListCalculatedAttributeForProfileItemMarshaller();

    public static ListCalculatedAttributeForProfileItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListCalculatedAttributeForProfileItem listCalculatedAttributeForProfileItem, ProtocolMarshaller protocolMarshaller) {

        if (listCalculatedAttributeForProfileItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listCalculatedAttributeForProfileItem.getCalculatedAttributeName(), CALCULATEDATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(listCalculatedAttributeForProfileItem.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(listCalculatedAttributeForProfileItem.getIsDataPartial(), ISDATAPARTIAL_BINDING);
            protocolMarshaller.marshall(listCalculatedAttributeForProfileItem.getValue(), VALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
