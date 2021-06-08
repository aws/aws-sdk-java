/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AdvancedFieldSelectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AdvancedFieldSelectorMarshaller {

    private static final MarshallingInfo<String> FIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Field").build();
    private static final MarshallingInfo<List> EQUALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Equals").build();
    private static final MarshallingInfo<List> STARTSWITH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartsWith").build();
    private static final MarshallingInfo<List> ENDSWITH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EndsWith").build();
    private static final MarshallingInfo<List> NOTEQUALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NotEquals").build();
    private static final MarshallingInfo<List> NOTSTARTSWITH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NotStartsWith").build();
    private static final MarshallingInfo<List> NOTENDSWITH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NotEndsWith").build();

    private static final AdvancedFieldSelectorMarshaller instance = new AdvancedFieldSelectorMarshaller();

    public static AdvancedFieldSelectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AdvancedFieldSelector advancedFieldSelector, ProtocolMarshaller protocolMarshaller) {

        if (advancedFieldSelector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(advancedFieldSelector.getField(), FIELD_BINDING);
            protocolMarshaller.marshall(advancedFieldSelector.getEquals(), EQUALS_BINDING);
            protocolMarshaller.marshall(advancedFieldSelector.getStartsWith(), STARTSWITH_BINDING);
            protocolMarshaller.marshall(advancedFieldSelector.getEndsWith(), ENDSWITH_BINDING);
            protocolMarshaller.marshall(advancedFieldSelector.getNotEquals(), NOTEQUALS_BINDING);
            protocolMarshaller.marshall(advancedFieldSelector.getNotStartsWith(), NOTSTARTSWITH_BINDING);
            protocolMarshaller.marshall(advancedFieldSelector.getNotEndsWith(), NOTENDSWITH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
