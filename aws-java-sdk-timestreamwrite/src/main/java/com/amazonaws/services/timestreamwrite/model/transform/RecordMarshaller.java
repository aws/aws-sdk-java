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
package com.amazonaws.services.timestreamwrite.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamwrite.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecordMarshaller {

    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<String> MEASURENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureName").build();
    private static final MarshallingInfo<String> MEASUREVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureValue").build();
    private static final MarshallingInfo<String> MEASUREVALUETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureValueType").build();
    private static final MarshallingInfo<String> TIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Time").build();
    private static final MarshallingInfo<String> TIMEUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TimeUnit").build();
    private static final MarshallingInfo<Long> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();

    private static final RecordMarshaller instance = new RecordMarshaller();

    public static RecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Record record, ProtocolMarshaller protocolMarshaller) {

        if (record == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(record.getDimensions(), DIMENSIONS_BINDING);
            protocolMarshaller.marshall(record.getMeasureName(), MEASURENAME_BINDING);
            protocolMarshaller.marshall(record.getMeasureValue(), MEASUREVALUE_BINDING);
            protocolMarshaller.marshall(record.getMeasureValueType(), MEASUREVALUETYPE_BINDING);
            protocolMarshaller.marshall(record.getTime(), TIME_BINDING);
            protocolMarshaller.marshall(record.getTimeUnit(), TIMEUNIT_BINDING);
            protocolMarshaller.marshall(record.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
