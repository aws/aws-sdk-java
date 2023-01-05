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
 * BodySectionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BodySectionConfigurationMarshaller {

    private static final MarshallingInfo<String> SECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SectionId").build();
    private static final MarshallingInfo<StructuredPojo> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Content").build();
    private static final MarshallingInfo<StructuredPojo> STYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Style").build();
    private static final MarshallingInfo<StructuredPojo> PAGEBREAKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PageBreakConfiguration").build();

    private static final BodySectionConfigurationMarshaller instance = new BodySectionConfigurationMarshaller();

    public static BodySectionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BodySectionConfiguration bodySectionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (bodySectionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bodySectionConfiguration.getSectionId(), SECTIONID_BINDING);
            protocolMarshaller.marshall(bodySectionConfiguration.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(bodySectionConfiguration.getStyle(), STYLE_BINDING);
            protocolMarshaller.marshall(bodySectionConfiguration.getPageBreakConfiguration(), PAGEBREAKCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
