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
 * ReferenceLineLabelConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReferenceLineLabelConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> VALUELABELCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValueLabelConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMLABELCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomLabelConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> FONTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FontConfiguration").build();
    private static final MarshallingInfo<String> FONTCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FontColor").build();
    private static final MarshallingInfo<String> HORIZONTALPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HorizontalPosition").build();
    private static final MarshallingInfo<String> VERTICALPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerticalPosition").build();

    private static final ReferenceLineLabelConfigurationMarshaller instance = new ReferenceLineLabelConfigurationMarshaller();

    public static ReferenceLineLabelConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReferenceLineLabelConfiguration referenceLineLabelConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (referenceLineLabelConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(referenceLineLabelConfiguration.getValueLabelConfiguration(), VALUELABELCONFIGURATION_BINDING);
            protocolMarshaller.marshall(referenceLineLabelConfiguration.getCustomLabelConfiguration(), CUSTOMLABELCONFIGURATION_BINDING);
            protocolMarshaller.marshall(referenceLineLabelConfiguration.getFontConfiguration(), FONTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(referenceLineLabelConfiguration.getFontColor(), FONTCOLOR_BINDING);
            protocolMarshaller.marshall(referenceLineLabelConfiguration.getHorizontalPosition(), HORIZONTALPOSITION_BINDING);
            protocolMarshaller.marshall(referenceLineLabelConfiguration.getVerticalPosition(), VERTICALPOSITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
