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
package com.amazonaws.services.lookoutequipment.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SensorStatisticsSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SensorStatisticsSummaryMarshaller {

    private static final MarshallingInfo<String> COMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComponentName").build();
    private static final MarshallingInfo<String> SENSORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SensorName").build();
    private static final MarshallingInfo<Boolean> DATAEXISTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataExists").build();
    private static final MarshallingInfo<StructuredPojo> MISSINGVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MissingValues").build();
    private static final MarshallingInfo<StructuredPojo> INVALIDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvalidValues").build();
    private static final MarshallingInfo<StructuredPojo> INVALIDDATEENTRIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvalidDateEntries").build();
    private static final MarshallingInfo<StructuredPojo> DUPLICATETIMESTAMPS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DuplicateTimestamps").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORICALVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoricalValues").build();
    private static final MarshallingInfo<StructuredPojo> MULTIPLEOPERATINGMODES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MultipleOperatingModes").build();
    private static final MarshallingInfo<StructuredPojo> LARGETIMESTAMPGAPS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LargeTimestampGaps").build();
    private static final MarshallingInfo<StructuredPojo> MONOTONICVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonotonicValues").build();
    private static final MarshallingInfo<java.util.Date> DATASTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATAENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataEndTime").timestampFormat("unixTimestamp").build();

    private static final SensorStatisticsSummaryMarshaller instance = new SensorStatisticsSummaryMarshaller();

    public static SensorStatisticsSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SensorStatisticsSummary sensorStatisticsSummary, ProtocolMarshaller protocolMarshaller) {

        if (sensorStatisticsSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sensorStatisticsSummary.getComponentName(), COMPONENTNAME_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getSensorName(), SENSORNAME_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getDataExists(), DATAEXISTS_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getMissingValues(), MISSINGVALUES_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getInvalidValues(), INVALIDVALUES_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getInvalidDateEntries(), INVALIDDATEENTRIES_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getDuplicateTimestamps(), DUPLICATETIMESTAMPS_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getCategoricalValues(), CATEGORICALVALUES_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getMultipleOperatingModes(), MULTIPLEOPERATINGMODES_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getLargeTimestampGaps(), LARGETIMESTAMPGAPS_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getMonotonicValues(), MONOTONICVALUES_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getDataStartTime(), DATASTARTTIME_BINDING);
            protocolMarshaller.marshall(sensorStatisticsSummary.getDataEndTime(), DATAENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
