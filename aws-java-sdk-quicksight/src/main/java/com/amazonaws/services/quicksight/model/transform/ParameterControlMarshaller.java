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
 * ParameterControlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParameterControlMarshaller {

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

    private static final ParameterControlMarshaller instance = new ParameterControlMarshaller();

    public static ParameterControlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParameterControl parameterControl, ProtocolMarshaller protocolMarshaller) {

        if (parameterControl == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parameterControl.getDateTimePicker(), DATETIMEPICKER_BINDING);
            protocolMarshaller.marshall(parameterControl.getList(), LIST_BINDING);
            protocolMarshaller.marshall(parameterControl.getDropdown(), DROPDOWN_BINDING);
            protocolMarshaller.marshall(parameterControl.getTextField(), TEXTFIELD_BINDING);
            protocolMarshaller.marshall(parameterControl.getTextArea(), TEXTAREA_BINDING);
            protocolMarshaller.marshall(parameterControl.getSlider(), SLIDER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
