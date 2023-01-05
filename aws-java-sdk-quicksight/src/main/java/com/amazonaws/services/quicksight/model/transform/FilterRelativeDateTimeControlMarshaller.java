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
 * FilterRelativeDateTimeControlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FilterRelativeDateTimeControlMarshaller {

    private static final MarshallingInfo<String> FILTERCONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterControlId").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> SOURCEFILTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceFilterId").build();
    private static final MarshallingInfo<StructuredPojo> DISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayOptions").build();

    private static final FilterRelativeDateTimeControlMarshaller instance = new FilterRelativeDateTimeControlMarshaller();

    public static FilterRelativeDateTimeControlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FilterRelativeDateTimeControl filterRelativeDateTimeControl, ProtocolMarshaller protocolMarshaller) {

        if (filterRelativeDateTimeControl == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(filterRelativeDateTimeControl.getFilterControlId(), FILTERCONTROLID_BINDING);
            protocolMarshaller.marshall(filterRelativeDateTimeControl.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(filterRelativeDateTimeControl.getSourceFilterId(), SOURCEFILTERID_BINDING);
            protocolMarshaller.marshall(filterRelativeDateTimeControl.getDisplayOptions(), DISPLAYOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
