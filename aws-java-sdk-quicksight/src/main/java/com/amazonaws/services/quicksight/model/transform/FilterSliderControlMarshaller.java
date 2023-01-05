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
 * FilterSliderControlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FilterSliderControlMarshaller {

    private static final MarshallingInfo<String> FILTERCONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterControlId").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> SOURCEFILTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceFilterId").build();
    private static final MarshallingInfo<StructuredPojo> DISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayOptions").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<Double> MAXIMUMVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumValue").build();
    private static final MarshallingInfo<Double> MINIMUMVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumValue").build();
    private static final MarshallingInfo<Double> STEPSIZE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StepSize").build();

    private static final FilterSliderControlMarshaller instance = new FilterSliderControlMarshaller();

    public static FilterSliderControlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FilterSliderControl filterSliderControl, ProtocolMarshaller protocolMarshaller) {

        if (filterSliderControl == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(filterSliderControl.getFilterControlId(), FILTERCONTROLID_BINDING);
            protocolMarshaller.marshall(filterSliderControl.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(filterSliderControl.getSourceFilterId(), SOURCEFILTERID_BINDING);
            protocolMarshaller.marshall(filterSliderControl.getDisplayOptions(), DISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(filterSliderControl.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(filterSliderControl.getMaximumValue(), MAXIMUMVALUE_BINDING);
            protocolMarshaller.marshall(filterSliderControl.getMinimumValue(), MINIMUMVALUE_BINDING);
            protocolMarshaller.marshall(filterSliderControl.getStepSize(), STEPSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
