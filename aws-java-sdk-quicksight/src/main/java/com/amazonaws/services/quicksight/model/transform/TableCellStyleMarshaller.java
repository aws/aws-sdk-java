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
 * TableCellStyleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TableCellStyleMarshaller {

    private static final MarshallingInfo<String> VISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Visibility").build();
    private static final MarshallingInfo<StructuredPojo> FONTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FontConfiguration").build();
    private static final MarshallingInfo<String> TEXTWRAP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TextWrap").build();
    private static final MarshallingInfo<String> HORIZONTALTEXTALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HorizontalTextAlignment").build();
    private static final MarshallingInfo<String> VERTICALTEXTALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerticalTextAlignment").build();
    private static final MarshallingInfo<String> BACKGROUNDCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackgroundColor").build();
    private static final MarshallingInfo<Integer> HEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Height").build();
    private static final MarshallingInfo<StructuredPojo> BORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Border").build();

    private static final TableCellStyleMarshaller instance = new TableCellStyleMarshaller();

    public static TableCellStyleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TableCellStyle tableCellStyle, ProtocolMarshaller protocolMarshaller) {

        if (tableCellStyle == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tableCellStyle.getVisibility(), VISIBILITY_BINDING);
            protocolMarshaller.marshall(tableCellStyle.getFontConfiguration(), FONTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(tableCellStyle.getTextWrap(), TEXTWRAP_BINDING);
            protocolMarshaller.marshall(tableCellStyle.getHorizontalTextAlignment(), HORIZONTALTEXTALIGNMENT_BINDING);
            protocolMarshaller.marshall(tableCellStyle.getVerticalTextAlignment(), VERTICALTEXTALIGNMENT_BINDING);
            protocolMarshaller.marshall(tableCellStyle.getBackgroundColor(), BACKGROUNDCOLOR_BINDING);
            protocolMarshaller.marshall(tableCellStyle.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(tableCellStyle.getBorder(), BORDER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
