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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActuatorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActuatorMarshaller {

    private static final MarshallingInfo<String> FULLYQUALIFIEDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fullyQualifiedName").build();
    private static final MarshallingInfo<String> DATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dataType").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unit").build();
    private static final MarshallingInfo<List> ALLOWEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("allowedValues").build();
    private static final MarshallingInfo<Double> MIN_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("min").build();
    private static final MarshallingInfo<Double> MAX_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("max").build();
    private static final MarshallingInfo<String> ASSIGNEDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assignedValue").build();

    private static final ActuatorMarshaller instance = new ActuatorMarshaller();

    public static ActuatorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Actuator actuator, ProtocolMarshaller protocolMarshaller) {

        if (actuator == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actuator.getFullyQualifiedName(), FULLYQUALIFIEDNAME_BINDING);
            protocolMarshaller.marshall(actuator.getDataType(), DATATYPE_BINDING);
            protocolMarshaller.marshall(actuator.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(actuator.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(actuator.getAllowedValues(), ALLOWEDVALUES_BINDING);
            protocolMarshaller.marshall(actuator.getMin(), MIN_BINDING);
            protocolMarshaller.marshall(actuator.getMax(), MAX_BINDING);
            protocolMarshaller.marshall(actuator.getAssignedValue(), ASSIGNEDVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
