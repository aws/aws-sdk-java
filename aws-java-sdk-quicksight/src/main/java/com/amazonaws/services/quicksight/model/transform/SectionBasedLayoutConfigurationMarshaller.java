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
 * SectionBasedLayoutConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SectionBasedLayoutConfigurationMarshaller {

    private static final MarshallingInfo<List> HEADERSECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeaderSections").build();
    private static final MarshallingInfo<List> BODYSECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BodySections").build();
    private static final MarshallingInfo<List> FOOTERSECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FooterSections").build();
    private static final MarshallingInfo<StructuredPojo> CANVASSIZEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CanvasSizeOptions").build();

    private static final SectionBasedLayoutConfigurationMarshaller instance = new SectionBasedLayoutConfigurationMarshaller();

    public static SectionBasedLayoutConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SectionBasedLayoutConfiguration sectionBasedLayoutConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (sectionBasedLayoutConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sectionBasedLayoutConfiguration.getHeaderSections(), HEADERSECTIONS_BINDING);
            protocolMarshaller.marshall(sectionBasedLayoutConfiguration.getBodySections(), BODYSECTIONS_BINDING);
            protocolMarshaller.marshall(sectionBasedLayoutConfiguration.getFooterSections(), FOOTERSECTIONS_BINDING);
            protocolMarshaller.marshall(sectionBasedLayoutConfiguration.getCanvasSizeOptions(), CANVASSIZEOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
