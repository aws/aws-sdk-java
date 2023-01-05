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
package com.amazonaws.services.timestreamquery.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamquery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimestreamConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimestreamConfigurationMarshaller {

    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<String> TIMECOLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeColumn").build();
    private static final MarshallingInfo<List> DIMENSIONMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DimensionMappings").build();
    private static final MarshallingInfo<StructuredPojo> MULTIMEASUREMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MultiMeasureMappings").build();
    private static final MarshallingInfo<List> MIXEDMEASUREMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MixedMeasureMappings").build();
    private static final MarshallingInfo<String> MEASURENAMECOLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureNameColumn").build();

    private static final TimestreamConfigurationMarshaller instance = new TimestreamConfigurationMarshaller();

    public static TimestreamConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimestreamConfiguration timestreamConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (timestreamConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timestreamConfiguration.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(timestreamConfiguration.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(timestreamConfiguration.getTimeColumn(), TIMECOLUMN_BINDING);
            protocolMarshaller.marshall(timestreamConfiguration.getDimensionMappings(), DIMENSIONMAPPINGS_BINDING);
            protocolMarshaller.marshall(timestreamConfiguration.getMultiMeasureMappings(), MULTIMEASUREMAPPINGS_BINDING);
            protocolMarshaller.marshall(timestreamConfiguration.getMixedMeasureMappings(), MIXEDMEASUREMAPPINGS_BINDING);
            protocolMarshaller.marshall(timestreamConfiguration.getMeasureNameColumn(), MEASURENAMECOLUMN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
