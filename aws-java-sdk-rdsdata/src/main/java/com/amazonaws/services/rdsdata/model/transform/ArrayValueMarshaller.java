/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rdsdata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ArrayValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ArrayValueMarshaller {

    private static final MarshallingInfo<List> ARRAYVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arrayValues").build();
    private static final MarshallingInfo<List> BOOLEANVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("booleanValues").build();
    private static final MarshallingInfo<List> DOUBLEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("doubleValues").build();
    private static final MarshallingInfo<List> LONGVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("longValues").build();
    private static final MarshallingInfo<List> STRINGVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stringValues").build();

    private static final ArrayValueMarshaller instance = new ArrayValueMarshaller();

    public static ArrayValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ArrayValue arrayValue, ProtocolMarshaller protocolMarshaller) {

        if (arrayValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(arrayValue.getArrayValues(), ARRAYVALUES_BINDING);
            protocolMarshaller.marshall(arrayValue.getBooleanValues(), BOOLEANVALUES_BINDING);
            protocolMarshaller.marshall(arrayValue.getDoubleValues(), DOUBLEVALUES_BINDING);
            protocolMarshaller.marshall(arrayValue.getLongValues(), LONGVALUES_BINDING);
            protocolMarshaller.marshall(arrayValue.getStringValues(), STRINGVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
