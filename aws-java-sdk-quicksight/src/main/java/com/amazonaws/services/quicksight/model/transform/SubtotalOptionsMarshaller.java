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
 * SubtotalOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubtotalOptionsMarshaller {

    private static final MarshallingInfo<String> TOTALSVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalsVisibility").build();
    private static final MarshallingInfo<String> CUSTOMLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomLabel").build();
    private static final MarshallingInfo<String> FIELDLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldLevel").build();
    private static final MarshallingInfo<List> FIELDLEVELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldLevelOptions").build();
    private static final MarshallingInfo<StructuredPojo> TOTALCELLSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalCellStyle").build();
    private static final MarshallingInfo<StructuredPojo> VALUECELLSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValueCellStyle").build();
    private static final MarshallingInfo<StructuredPojo> METRICHEADERCELLSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricHeaderCellStyle").build();

    private static final SubtotalOptionsMarshaller instance = new SubtotalOptionsMarshaller();

    public static SubtotalOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubtotalOptions subtotalOptions, ProtocolMarshaller protocolMarshaller) {

        if (subtotalOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subtotalOptions.getTotalsVisibility(), TOTALSVISIBILITY_BINDING);
            protocolMarshaller.marshall(subtotalOptions.getCustomLabel(), CUSTOMLABEL_BINDING);
            protocolMarshaller.marshall(subtotalOptions.getFieldLevel(), FIELDLEVEL_BINDING);
            protocolMarshaller.marshall(subtotalOptions.getFieldLevelOptions(), FIELDLEVELOPTIONS_BINDING);
            protocolMarshaller.marshall(subtotalOptions.getTotalCellStyle(), TOTALCELLSTYLE_BINDING);
            protocolMarshaller.marshall(subtotalOptions.getValueCellStyle(), VALUECELLSTYLE_BINDING);
            protocolMarshaller.marshall(subtotalOptions.getMetricHeaderCellStyle(), METRICHEADERCELLSTYLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
