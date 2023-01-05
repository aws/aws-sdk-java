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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FilterControlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FilterControlMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATETIMEPICKER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateTimePicker").build();
    private static final MarshallingInfo<StructuredPojo> LIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("List").build();
    private static final MarshallingInfo<StructuredPojo> DROPDOWN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Dropdown").build();
    private static final MarshallingInfo<StructuredPojo> TEXTFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextField").build();
    private static final MarshallingInfo<StructuredPojo> TEXTAREA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextArea").build();
    private static final MarshallingInfo<StructuredPojo> SLIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Slider").build();
    private static final MarshallingInfo<StructuredPojo> RELATIVEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelativeDateTime").build();

    private static final FilterControlMarshaller instance = new FilterControlMarshaller();

    public static FilterControlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FilterControl filterControl, ProtocolMarshaller protocolMarshaller) {

        if (filterControl == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(filterControl.getDateTimePicker(), DATETIMEPICKER_BINDING);
            protocolMarshaller.marshall(filterControl.getList(), LIST_BINDING);
            protocolMarshaller.marshall(filterControl.getDropdown(), DROPDOWN_BINDING);
            protocolMarshaller.marshall(filterControl.getTextField(), TEXTFIELD_BINDING);
            protocolMarshaller.marshall(filterControl.getTextArea(), TEXTAREA_BINDING);
            protocolMarshaller.marshall(filterControl.getSlider(), SLIDER_BINDING);
            protocolMarshaller.marshall(filterControl.getRelativeDateTime(), RELATIVEDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
