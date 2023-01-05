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
 * PivotTableOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PivotTableOptionsMarshaller {

    private static final MarshallingInfo<String> METRICPLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricPlacement").build();
    private static final MarshallingInfo<String> SINGLEMETRICVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SingleMetricVisibility").build();
    private static final MarshallingInfo<String> COLUMNNAMESVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnNamesVisibility").build();
    private static final MarshallingInfo<String> TOGGLEBUTTONSVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ToggleButtonsVisibility").build();
    private static final MarshallingInfo<StructuredPojo> COLUMNHEADERSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnHeaderStyle").build();
    private static final MarshallingInfo<StructuredPojo> ROWHEADERSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowHeaderStyle").build();
    private static final MarshallingInfo<StructuredPojo> CELLSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CellStyle").build();
    private static final MarshallingInfo<StructuredPojo> ROWFIELDNAMESSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowFieldNamesStyle").build();
    private static final MarshallingInfo<StructuredPojo> ROWALTERNATECOLOROPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowAlternateColorOptions").build();

    private static final PivotTableOptionsMarshaller instance = new PivotTableOptionsMarshaller();

    public static PivotTableOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PivotTableOptions pivotTableOptions, ProtocolMarshaller protocolMarshaller) {

        if (pivotTableOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pivotTableOptions.getMetricPlacement(), METRICPLACEMENT_BINDING);
            protocolMarshaller.marshall(pivotTableOptions.getSingleMetricVisibility(), SINGLEMETRICVISIBILITY_BINDING);
            protocolMarshaller.marshall(pivotTableOptions.getColumnNamesVisibility(), COLUMNNAMESVISIBILITY_BINDING);
            protocolMarshaller.marshall(pivotTableOptions.getToggleButtonsVisibility(), TOGGLEBUTTONSVISIBILITY_BINDING);
            protocolMarshaller.marshall(pivotTableOptions.getColumnHeaderStyle(), COLUMNHEADERSTYLE_BINDING);
            protocolMarshaller.marshall(pivotTableOptions.getRowHeaderStyle(), ROWHEADERSTYLE_BINDING);
            protocolMarshaller.marshall(pivotTableOptions.getCellStyle(), CELLSTYLE_BINDING);
            protocolMarshaller.marshall(pivotTableOptions.getRowFieldNamesStyle(), ROWFIELDNAMESSTYLE_BINDING);
            protocolMarshaller.marshall(pivotTableOptions.getRowAlternateColorOptions(), ROWALTERNATECOLOROPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
