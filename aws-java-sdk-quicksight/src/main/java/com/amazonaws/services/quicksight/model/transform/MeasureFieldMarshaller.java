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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MeasureFieldMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MeasureFieldMarshaller {

    private static final MarshallingInfo<StructuredPojo> NUMERICALMEASUREFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumericalMeasureField").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORICALMEASUREFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoricalMeasureField").build();
    private static final MarshallingInfo<StructuredPojo> DATEMEASUREFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateMeasureField").build();
    private static final MarshallingInfo<StructuredPojo> CALCULATEDMEASUREFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedMeasureField").build();

    private static final MeasureFieldMarshaller instance = new MeasureFieldMarshaller();

    public static MeasureFieldMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MeasureField measureField, ProtocolMarshaller protocolMarshaller) {

        if (measureField == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(measureField.getNumericalMeasureField(), NUMERICALMEASUREFIELD_BINDING);
            protocolMarshaller.marshall(measureField.getCategoricalMeasureField(), CATEGORICALMEASUREFIELD_BINDING);
            protocolMarshaller.marshall(measureField.getDateMeasureField(), DATEMEASUREFIELD_BINDING);
            protocolMarshaller.marshall(measureField.getCalculatedMeasureField(), CALCULATEDMEASUREFIELD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
