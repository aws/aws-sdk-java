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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DefaultFilterControlOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DefaultFilterControlOptionsMarshaller {

    private static final MarshallingInfo<StructuredPojo> DEFAULTDATETIMEPICKEROPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultDateTimePickerOptions").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTLISTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultListOptions").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTDROPDOWNOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultDropdownOptions").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTTEXTFIELDOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultTextFieldOptions").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTTEXTAREAOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultTextAreaOptions").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTSLIDEROPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSliderOptions").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTRELATIVEDATETIMEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRelativeDateTimeOptions").build();

    private static final DefaultFilterControlOptionsMarshaller instance = new DefaultFilterControlOptionsMarshaller();

    public static DefaultFilterControlOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DefaultFilterControlOptions defaultFilterControlOptions, ProtocolMarshaller protocolMarshaller) {

        if (defaultFilterControlOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(defaultFilterControlOptions.getDefaultDateTimePickerOptions(), DEFAULTDATETIMEPICKEROPTIONS_BINDING);
            protocolMarshaller.marshall(defaultFilterControlOptions.getDefaultListOptions(), DEFAULTLISTOPTIONS_BINDING);
            protocolMarshaller.marshall(defaultFilterControlOptions.getDefaultDropdownOptions(), DEFAULTDROPDOWNOPTIONS_BINDING);
            protocolMarshaller.marshall(defaultFilterControlOptions.getDefaultTextFieldOptions(), DEFAULTTEXTFIELDOPTIONS_BINDING);
            protocolMarshaller.marshall(defaultFilterControlOptions.getDefaultTextAreaOptions(), DEFAULTTEXTAREAOPTIONS_BINDING);
            protocolMarshaller.marshall(defaultFilterControlOptions.getDefaultSliderOptions(), DEFAULTSLIDEROPTIONS_BINDING);
            protocolMarshaller.marshall(defaultFilterControlOptions.getDefaultRelativeDateTimeOptions(), DEFAULTRELATIVEDATETIMEOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
