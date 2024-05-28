/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GridViewConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GridViewConfigurationMarshaller {

    private static final MarshallingInfo<String> CONTENTSHARELAYOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentShareLayout").build();
    private static final MarshallingInfo<StructuredPojo> PRESENTERONLYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PresenterOnlyConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVESPEAKERONLYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveSpeakerOnlyConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> HORIZONTALLAYOUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HorizontalLayoutConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> VERTICALLAYOUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerticalLayoutConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> VIDEOATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VideoAttribute").build();
    private static final MarshallingInfo<String> CANVASORIENTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CanvasOrientation").build();

    private static final GridViewConfigurationMarshaller instance = new GridViewConfigurationMarshaller();

    public static GridViewConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GridViewConfiguration gridViewConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (gridViewConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gridViewConfiguration.getContentShareLayout(), CONTENTSHARELAYOUT_BINDING);
            protocolMarshaller.marshall(gridViewConfiguration.getPresenterOnlyConfiguration(), PRESENTERONLYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(gridViewConfiguration.getActiveSpeakerOnlyConfiguration(), ACTIVESPEAKERONLYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(gridViewConfiguration.getHorizontalLayoutConfiguration(), HORIZONTALLAYOUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(gridViewConfiguration.getVerticalLayoutConfiguration(), VERTICALLAYOUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(gridViewConfiguration.getVideoAttribute(), VIDEOATTRIBUTE_BINDING);
            protocolMarshaller.marshall(gridViewConfiguration.getCanvasOrientation(), CANVASORIENTATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
