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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComponentConditionPropertyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComponentConditionPropertyMarshaller {

    private static final MarshallingInfo<StructuredPojo> ELSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("else").build();
    private static final MarshallingInfo<String> FIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("field").build();
    private static final MarshallingInfo<String> OPERAND_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("operand").build();
    private static final MarshallingInfo<String> OPERANDTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operandType").build();
    private static final MarshallingInfo<String> OPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("operator").build();
    private static final MarshallingInfo<String> PROPERTY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("property").build();
    private static final MarshallingInfo<StructuredPojo> THEN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("then").build();

    private static final ComponentConditionPropertyMarshaller instance = new ComponentConditionPropertyMarshaller();

    public static ComponentConditionPropertyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComponentConditionProperty componentConditionProperty, ProtocolMarshaller protocolMarshaller) {

        if (componentConditionProperty == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(componentConditionProperty.getElse(), ELSE_BINDING);
            protocolMarshaller.marshall(componentConditionProperty.getField(), FIELD_BINDING);
            protocolMarshaller.marshall(componentConditionProperty.getOperand(), OPERAND_BINDING);
            protocolMarshaller.marshall(componentConditionProperty.getOperandType(), OPERANDTYPE_BINDING);
            protocolMarshaller.marshall(componentConditionProperty.getOperator(), OPERATOR_BINDING);
            protocolMarshaller.marshall(componentConditionProperty.getProperty(), PROPERTY_BINDING);
            protocolMarshaller.marshall(componentConditionProperty.getThen(), THEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
