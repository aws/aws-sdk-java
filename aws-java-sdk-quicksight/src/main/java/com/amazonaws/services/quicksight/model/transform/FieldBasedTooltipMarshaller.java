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
 * FieldBasedTooltipMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FieldBasedTooltipMarshaller {

    private static final MarshallingInfo<String> AGGREGATIONVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AggregationVisibility").build();
    private static final MarshallingInfo<String> TOOLTIPTITLETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TooltipTitleType").build();
    private static final MarshallingInfo<List> TOOLTIPFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TooltipFields").build();

    private static final FieldBasedTooltipMarshaller instance = new FieldBasedTooltipMarshaller();

    public static FieldBasedTooltipMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FieldBasedTooltip fieldBasedTooltip, ProtocolMarshaller protocolMarshaller) {

        if (fieldBasedTooltip == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fieldBasedTooltip.getAggregationVisibility(), AGGREGATIONVISIBILITY_BINDING);
            protocolMarshaller.marshall(fieldBasedTooltip.getTooltipTitleType(), TOOLTIPTITLETYPE_BINDING);
            protocolMarshaller.marshall(fieldBasedTooltip.getTooltipFields(), TOOLTIPFIELDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
