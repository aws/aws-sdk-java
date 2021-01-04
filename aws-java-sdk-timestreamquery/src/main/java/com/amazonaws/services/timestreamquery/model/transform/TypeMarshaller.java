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
 * TypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TypeMarshaller {

    private static final MarshallingInfo<String> SCALARTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalarType").build();
    private static final MarshallingInfo<StructuredPojo> ARRAYCOLUMNINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArrayColumnInfo").build();
    private static final MarshallingInfo<StructuredPojo> TIMESERIESMEASUREVALUECOLUMNINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeSeriesMeasureValueColumnInfo").build();
    private static final MarshallingInfo<List> ROWCOLUMNINFO_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RowColumnInfo").build();

    private static final TypeMarshaller instance = new TypeMarshaller();

    public static TypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Type type, ProtocolMarshaller protocolMarshaller) {

        if (type == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(type.getScalarType(), SCALARTYPE_BINDING);
            protocolMarshaller.marshall(type.getArrayColumnInfo(), ARRAYCOLUMNINFO_BINDING);
            protocolMarshaller.marshall(type.getTimeSeriesMeasureValueColumnInfo(), TIMESERIESMEASUREVALUECOLUMNINFO_BINDING);
            protocolMarshaller.marshall(type.getRowColumnInfo(), ROWCOLUMNINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
