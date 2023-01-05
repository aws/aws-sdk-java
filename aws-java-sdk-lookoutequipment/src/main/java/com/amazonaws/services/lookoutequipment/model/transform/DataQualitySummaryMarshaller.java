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
 * DataQualitySummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataQualitySummaryMarshaller {

    private static final MarshallingInfo<StructuredPojo> INSUFFICIENTSENSORDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsufficientSensorData").build();
    private static final MarshallingInfo<StructuredPojo> MISSINGSENSORDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MissingSensorData").build();
    private static final MarshallingInfo<StructuredPojo> INVALIDSENSORDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvalidSensorData").build();
    private static final MarshallingInfo<StructuredPojo> UNSUPPORTEDTIMESTAMPS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnsupportedTimestamps").build();
    private static final MarshallingInfo<StructuredPojo> DUPLICATETIMESTAMPS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DuplicateTimestamps").build();

    private static final DataQualitySummaryMarshaller instance = new DataQualitySummaryMarshaller();

    public static DataQualitySummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataQualitySummary dataQualitySummary, ProtocolMarshaller protocolMarshaller) {

        if (dataQualitySummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataQualitySummary.getInsufficientSensorData(), INSUFFICIENTSENSORDATA_BINDING);
            protocolMarshaller.marshall(dataQualitySummary.getMissingSensorData(), MISSINGSENSORDATA_BINDING);
            protocolMarshaller.marshall(dataQualitySummary.getInvalidSensorData(), INVALIDSENSORDATA_BINDING);
            protocolMarshaller.marshall(dataQualitySummary.getUnsupportedTimestamps(), UNSUPPORTEDTIMESTAMPS_BINDING);
            protocolMarshaller.marshall(dataQualitySummary.getDuplicateTimestamps(), DUPLICATETIMESTAMPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
