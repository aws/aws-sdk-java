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
 * DataLabelOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataLabelOptionsMarshaller {

    private static final MarshallingInfo<String> VISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Visibility").build();
    private static final MarshallingInfo<String> CATEGORYLABELVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryLabelVisibility").build();
    private static final MarshallingInfo<String> MEASURELABELVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureLabelVisibility").build();
    private static final MarshallingInfo<List> DATALABELTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLabelTypes").build();
    private static final MarshallingInfo<String> POSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Position").build();
    private static final MarshallingInfo<String> LABELCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelContent").build();
    private static final MarshallingInfo<StructuredPojo> LABELFONTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelFontConfiguration").build();
    private static final MarshallingInfo<String> LABELCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelColor").build();
    private static final MarshallingInfo<String> OVERLAP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Overlap").build();

    private static final DataLabelOptionsMarshaller instance = new DataLabelOptionsMarshaller();

    public static DataLabelOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataLabelOptions dataLabelOptions, ProtocolMarshaller protocolMarshaller) {

        if (dataLabelOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataLabelOptions.getVisibility(), VISIBILITY_BINDING);
            protocolMarshaller.marshall(dataLabelOptions.getCategoryLabelVisibility(), CATEGORYLABELVISIBILITY_BINDING);
            protocolMarshaller.marshall(dataLabelOptions.getMeasureLabelVisibility(), MEASURELABELVISIBILITY_BINDING);
            protocolMarshaller.marshall(dataLabelOptions.getDataLabelTypes(), DATALABELTYPES_BINDING);
            protocolMarshaller.marshall(dataLabelOptions.getPosition(), POSITION_BINDING);
            protocolMarshaller.marshall(dataLabelOptions.getLabelContent(), LABELCONTENT_BINDING);
            protocolMarshaller.marshall(dataLabelOptions.getLabelFontConfiguration(), LABELFONTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(dataLabelOptions.getLabelColor(), LABELCOLOR_BINDING);
            protocolMarshaller.marshall(dataLabelOptions.getOverlap(), OVERLAP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
