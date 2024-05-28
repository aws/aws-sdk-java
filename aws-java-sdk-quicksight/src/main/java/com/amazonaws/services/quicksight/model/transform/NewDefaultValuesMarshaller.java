/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NewDefaultValuesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NewDefaultValuesMarshaller {

    private static final MarshallingInfo<List> STRINGSTATICVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringStaticValues").build();
    private static final MarshallingInfo<List> DECIMALSTATICVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DecimalStaticValues").build();
    private static final MarshallingInfo<List> DATETIMESTATICVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateTimeStaticValues").build();
    private static final MarshallingInfo<List> INTEGERSTATICVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegerStaticValues").build();

    private static final NewDefaultValuesMarshaller instance = new NewDefaultValuesMarshaller();

    public static NewDefaultValuesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NewDefaultValues newDefaultValues, ProtocolMarshaller protocolMarshaller) {

        if (newDefaultValues == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(newDefaultValues.getStringStaticValues(), STRINGSTATICVALUES_BINDING);
            protocolMarshaller.marshall(newDefaultValues.getDecimalStaticValues(), DECIMALSTATICVALUES_BINDING);
            protocolMarshaller.marshall(newDefaultValues.getDateTimeStaticValues(), DATETIMESTATICVALUES_BINDING);
            protocolMarshaller.marshall(newDefaultValues.getIntegerStaticValues(), INTEGERSTATICVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
