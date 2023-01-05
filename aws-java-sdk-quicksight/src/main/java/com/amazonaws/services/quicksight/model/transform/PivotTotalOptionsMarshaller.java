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
 * PivotTotalOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PivotTotalOptionsMarshaller {

    private static final MarshallingInfo<String> TOTALSVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalsVisibility").build();
    private static final MarshallingInfo<String> PLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Placement").build();
    private static final MarshallingInfo<String> SCROLLSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScrollStatus").build();
    private static final MarshallingInfo<String> CUSTOMLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomLabel").build();
    private static final MarshallingInfo<StructuredPojo> TOTALCELLSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalCellStyle").build();
    private static final MarshallingInfo<StructuredPojo> VALUECELLSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValueCellStyle").build();
    private static final MarshallingInfo<StructuredPojo> METRICHEADERCELLSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricHeaderCellStyle").build();

    private static final PivotTotalOptionsMarshaller instance = new PivotTotalOptionsMarshaller();

    public static PivotTotalOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PivotTotalOptions pivotTotalOptions, ProtocolMarshaller protocolMarshaller) {

        if (pivotTotalOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pivotTotalOptions.getTotalsVisibility(), TOTALSVISIBILITY_BINDING);
            protocolMarshaller.marshall(pivotTotalOptions.getPlacement(), PLACEMENT_BINDING);
            protocolMarshaller.marshall(pivotTotalOptions.getScrollStatus(), SCROLLSTATUS_BINDING);
            protocolMarshaller.marshall(pivotTotalOptions.getCustomLabel(), CUSTOMLABEL_BINDING);
            protocolMarshaller.marshall(pivotTotalOptions.getTotalCellStyle(), TOTALCELLSTYLE_BINDING);
            protocolMarshaller.marshall(pivotTotalOptions.getValueCellStyle(), VALUECELLSTYLE_BINDING);
            protocolMarshaller.marshall(pivotTotalOptions.getMetricHeaderCellStyle(), METRICHEADERCELLSTYLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
