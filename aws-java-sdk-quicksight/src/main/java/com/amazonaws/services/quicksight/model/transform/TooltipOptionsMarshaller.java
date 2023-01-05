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
 * TooltipOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TooltipOptionsMarshaller {

    private static final MarshallingInfo<String> TOOLTIPVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TooltipVisibility").build();
    private static final MarshallingInfo<String> SELECTEDTOOLTIPTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedTooltipType").build();
    private static final MarshallingInfo<StructuredPojo> FIELDBASEDTOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldBasedTooltip").build();

    private static final TooltipOptionsMarshaller instance = new TooltipOptionsMarshaller();

    public static TooltipOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TooltipOptions tooltipOptions, ProtocolMarshaller protocolMarshaller) {

        if (tooltipOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tooltipOptions.getTooltipVisibility(), TOOLTIPVISIBILITY_BINDING);
            protocolMarshaller.marshall(tooltipOptions.getSelectedTooltipType(), SELECTEDTOOLTIPTYPE_BINDING);
            protocolMarshaller.marshall(tooltipOptions.getFieldBasedTooltip(), FIELDBASEDTOOLTIP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
