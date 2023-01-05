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
package com.amazonaws.services.forecast.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimeSeriesReplacementsDataSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeSeriesReplacementsDataSourceMarshaller {

    private static final MarshallingInfo<StructuredPojo> S3CONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Config").build();
    private static final MarshallingInfo<StructuredPojo> SCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schema").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();
    private static final MarshallingInfo<String> TIMESTAMPFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimestampFormat").build();

    private static final TimeSeriesReplacementsDataSourceMarshaller instance = new TimeSeriesReplacementsDataSourceMarshaller();

    public static TimeSeriesReplacementsDataSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeSeriesReplacementsDataSource timeSeriesReplacementsDataSource, ProtocolMarshaller protocolMarshaller) {

        if (timeSeriesReplacementsDataSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeSeriesReplacementsDataSource.getS3Config(), S3CONFIG_BINDING);
            protocolMarshaller.marshall(timeSeriesReplacementsDataSource.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(timeSeriesReplacementsDataSource.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(timeSeriesReplacementsDataSource.getTimestampFormat(), TIMESTAMPFORMAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
