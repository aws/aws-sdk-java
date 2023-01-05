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
 * PanelConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PanelConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Title").build();
    private static final MarshallingInfo<String> BORDERVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BorderVisibility").build();
    private static final MarshallingInfo<String> BORDERTHICKNESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BorderThickness").build();
    private static final MarshallingInfo<String> BORDERSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BorderStyle").build();
    private static final MarshallingInfo<String> BORDERCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BorderColor").build();
    private static final MarshallingInfo<String> GUTTERVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GutterVisibility").build();
    private static final MarshallingInfo<String> GUTTERSPACING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GutterSpacing").build();
    private static final MarshallingInfo<String> BACKGROUNDVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackgroundVisibility").build();
    private static final MarshallingInfo<String> BACKGROUNDCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackgroundColor").build();

    private static final PanelConfigurationMarshaller instance = new PanelConfigurationMarshaller();

    public static PanelConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PanelConfiguration panelConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (panelConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(panelConfiguration.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(panelConfiguration.getBorderVisibility(), BORDERVISIBILITY_BINDING);
            protocolMarshaller.marshall(panelConfiguration.getBorderThickness(), BORDERTHICKNESS_BINDING);
            protocolMarshaller.marshall(panelConfiguration.getBorderStyle(), BORDERSTYLE_BINDING);
            protocolMarshaller.marshall(panelConfiguration.getBorderColor(), BORDERCOLOR_BINDING);
            protocolMarshaller.marshall(panelConfiguration.getGutterVisibility(), GUTTERVISIBILITY_BINDING);
            protocolMarshaller.marshall(panelConfiguration.getGutterSpacing(), GUTTERSPACING_BINDING);
            protocolMarshaller.marshall(panelConfiguration.getBackgroundVisibility(), BACKGROUNDVISIBILITY_BINDING);
            protocolMarshaller.marshall(panelConfiguration.getBackgroundColor(), BACKGROUNDCOLOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
