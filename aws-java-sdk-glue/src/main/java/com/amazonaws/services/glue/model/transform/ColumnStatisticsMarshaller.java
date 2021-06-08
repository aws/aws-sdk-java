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
 * ColumnStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ColumnStatisticsMarshaller {

    private static final MarshallingInfo<String> COLUMNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnName").build();
    private static final MarshallingInfo<String> COLUMNTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnType").build();
    private static final MarshallingInfo<java.util.Date> ANALYZEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnalyzedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> STATISTICSDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatisticsData").build();

    private static final ColumnStatisticsMarshaller instance = new ColumnStatisticsMarshaller();

    public static ColumnStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ColumnStatistics columnStatistics, ProtocolMarshaller protocolMarshaller) {

        if (columnStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(columnStatistics.getColumnName(), COLUMNNAME_BINDING);
            protocolMarshaller.marshall(columnStatistics.getColumnType(), COLUMNTYPE_BINDING);
            protocolMarshaller.marshall(columnStatistics.getAnalyzedTime(), ANALYZEDTIME_BINDING);
            protocolMarshaller.marshall(columnStatistics.getStatisticsData(), STATISTICSDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
