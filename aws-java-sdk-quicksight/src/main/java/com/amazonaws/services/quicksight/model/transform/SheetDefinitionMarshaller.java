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
 * SheetDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SheetDefinitionMarshaller {

    private static final MarshallingInfo<String> SHEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SheetId").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> PARAMETERCONTROLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterControls").build();
    private static final MarshallingInfo<List> FILTERCONTROLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterControls").build();
    private static final MarshallingInfo<List> VISUALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Visuals").build();
    private static final MarshallingInfo<List> TEXTBOXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TextBoxes").build();
    private static final MarshallingInfo<List> LAYOUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Layouts").build();
    private static final MarshallingInfo<List> SHEETCONTROLLAYOUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SheetControlLayouts").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentType").build();

    private static final SheetDefinitionMarshaller instance = new SheetDefinitionMarshaller();

    public static SheetDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SheetDefinition sheetDefinition, ProtocolMarshaller protocolMarshaller) {

        if (sheetDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sheetDefinition.getSheetId(), SHEETID_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getName(), NAME_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getParameterControls(), PARAMETERCONTROLS_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getFilterControls(), FILTERCONTROLS_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getVisuals(), VISUALS_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getTextBoxes(), TEXTBOXES_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getLayouts(), LAYOUTS_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getSheetControlLayouts(), SHEETCONTROLLAYOUTS_BINDING);
            protocolMarshaller.marshall(sheetDefinition.getContentType(), CONTENTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
