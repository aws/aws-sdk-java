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
package com.amazonaws.services.iotsitewise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimeSeriesSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeSeriesSummaryMarshaller {

    private static final MarshallingInfo<String> ASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("assetId").build();
    private static final MarshallingInfo<String> PROPERTYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("propertyId").build();
    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("alias").build();
    private static final MarshallingInfo<String> TIMESERIESID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeSeriesId").build();
    private static final MarshallingInfo<String> DATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dataType").build();
    private static final MarshallingInfo<String> DATATYPESPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataTypeSpec").build();
    private static final MarshallingInfo<java.util.Date> TIMESERIESCREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeSeriesCreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TIMESERIESLASTUPDATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeSeriesLastUpdateDate").timestampFormat("unixTimestamp").build();

    private static final TimeSeriesSummaryMarshaller instance = new TimeSeriesSummaryMarshaller();

    public static TimeSeriesSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeSeriesSummary timeSeriesSummary, ProtocolMarshaller protocolMarshaller) {

        if (timeSeriesSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeSeriesSummary.getAssetId(), ASSETID_BINDING);
            protocolMarshaller.marshall(timeSeriesSummary.getPropertyId(), PROPERTYID_BINDING);
            protocolMarshaller.marshall(timeSeriesSummary.getAlias(), ALIAS_BINDING);
            protocolMarshaller.marshall(timeSeriesSummary.getTimeSeriesId(), TIMESERIESID_BINDING);
            protocolMarshaller.marshall(timeSeriesSummary.getDataType(), DATATYPE_BINDING);
            protocolMarshaller.marshall(timeSeriesSummary.getDataTypeSpec(), DATATYPESPEC_BINDING);
            protocolMarshaller.marshall(timeSeriesSummary.getTimeSeriesCreationDate(), TIMESERIESCREATIONDATE_BINDING);
            protocolMarshaller.marshall(timeSeriesSummary.getTimeSeriesLastUpdateDate(), TIMESERIESLASTUPDATEDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
