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
package com.amazonaws.services.timestreamquery.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamquery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatumMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatumMarshaller {

    private static final MarshallingInfo<String> SCALARVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalarValue").build();
    private static final MarshallingInfo<List> TIMESERIESVALUE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeSeriesValue").build();
    private static final MarshallingInfo<List> ARRAYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ArrayValue").build();
    private static final MarshallingInfo<StructuredPojo> ROWVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowValue").build();
    private static final MarshallingInfo<Boolean> NULLVALUE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NullValue").build();

    private static final DatumMarshaller instance = new DatumMarshaller();

    public static DatumMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Datum datum, ProtocolMarshaller protocolMarshaller) {

        if (datum == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(datum.getScalarValue(), SCALARVALUE_BINDING);
            protocolMarshaller.marshall(datum.getTimeSeriesValue(), TIMESERIESVALUE_BINDING);
            protocolMarshaller.marshall(datum.getArrayValue(), ARRAYVALUE_BINDING);
            protocolMarshaller.marshall(datum.getRowValue(), ROWVALUE_BINDING);
            protocolMarshaller.marshall(datum.getNullValue(), NULLVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
