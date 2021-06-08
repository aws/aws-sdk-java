/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ColumnStatisticsDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ColumnStatisticsDataMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> BOOLEANCOLUMNSTATISTICSDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BooleanColumnStatisticsData").build();
    private static final MarshallingInfo<StructuredPojo> DATECOLUMNSTATISTICSDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateColumnStatisticsData").build();
    private static final MarshallingInfo<StructuredPojo> DECIMALCOLUMNSTATISTICSDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DecimalColumnStatisticsData").build();
    private static final MarshallingInfo<StructuredPojo> DOUBLECOLUMNSTATISTICSDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DoubleColumnStatisticsData").build();
    private static final MarshallingInfo<StructuredPojo> LONGCOLUMNSTATISTICSDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongColumnStatisticsData").build();
    private static final MarshallingInfo<StructuredPojo> STRINGCOLUMNSTATISTICSDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringColumnStatisticsData").build();
    private static final MarshallingInfo<StructuredPojo> BINARYCOLUMNSTATISTICSDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BinaryColumnStatisticsData").build();

    private static final ColumnStatisticsDataMarshaller instance = new ColumnStatisticsDataMarshaller();

    public static ColumnStatisticsDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ColumnStatisticsData columnStatisticsData, ProtocolMarshaller protocolMarshaller) {

        if (columnStatisticsData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(columnStatisticsData.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(columnStatisticsData.getBooleanColumnStatisticsData(), BOOLEANCOLUMNSTATISTICSDATA_BINDING);
            protocolMarshaller.marshall(columnStatisticsData.getDateColumnStatisticsData(), DATECOLUMNSTATISTICSDATA_BINDING);
            protocolMarshaller.marshall(columnStatisticsData.getDecimalColumnStatisticsData(), DECIMALCOLUMNSTATISTICSDATA_BINDING);
            protocolMarshaller.marshall(columnStatisticsData.getDoubleColumnStatisticsData(), DOUBLECOLUMNSTATISTICSDATA_BINDING);
            protocolMarshaller.marshall(columnStatisticsData.getLongColumnStatisticsData(), LONGCOLUMNSTATISTICSDATA_BINDING);
            protocolMarshaller.marshall(columnStatisticsData.getStringColumnStatisticsData(), STRINGCOLUMNSTATISTICSDATA_BINDING);
            protocolMarshaller.marshall(columnStatisticsData.getBinaryColumnStatisticsData(), BINARYCOLUMNSTATISTICSDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
