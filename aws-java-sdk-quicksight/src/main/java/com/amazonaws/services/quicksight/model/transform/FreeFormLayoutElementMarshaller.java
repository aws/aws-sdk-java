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
 * FreeFormLayoutElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FreeFormLayoutElementMarshaller {

    private static final MarshallingInfo<String> ELEMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ElementId").build();
    private static final MarshallingInfo<String> ELEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElementType").build();
    private static final MarshallingInfo<String> XAXISLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XAxisLocation").build();
    private static final MarshallingInfo<String> YAXISLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("YAxisLocation").build();
    private static final MarshallingInfo<String> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Width").build();
    private static final MarshallingInfo<String> HEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Height").build();
    private static final MarshallingInfo<String> VISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Visibility").build();
    private static final MarshallingInfo<List> RENDERINGRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenderingRules").build();
    private static final MarshallingInfo<StructuredPojo> BORDERSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BorderStyle").build();
    private static final MarshallingInfo<StructuredPojo> SELECTEDBORDERSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedBorderStyle").build();
    private static final MarshallingInfo<StructuredPojo> BACKGROUNDSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackgroundStyle").build();
    private static final MarshallingInfo<StructuredPojo> LOADINGANIMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoadingAnimation").build();

    private static final FreeFormLayoutElementMarshaller instance = new FreeFormLayoutElementMarshaller();

    public static FreeFormLayoutElementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FreeFormLayoutElement freeFormLayoutElement, ProtocolMarshaller protocolMarshaller) {

        if (freeFormLayoutElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(freeFormLayoutElement.getElementId(), ELEMENTID_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getElementType(), ELEMENTTYPE_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getXAxisLocation(), XAXISLOCATION_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getYAxisLocation(), YAXISLOCATION_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getWidth(), WIDTH_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getVisibility(), VISIBILITY_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getRenderingRules(), RENDERINGRULES_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getBorderStyle(), BORDERSTYLE_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getSelectedBorderStyle(), SELECTEDBORDERSTYLE_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getBackgroundStyle(), BACKGROUNDSTYLE_BINDING);
            protocolMarshaller.marshall(freeFormLayoutElement.getLoadingAnimation(), LOADINGANIMATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
