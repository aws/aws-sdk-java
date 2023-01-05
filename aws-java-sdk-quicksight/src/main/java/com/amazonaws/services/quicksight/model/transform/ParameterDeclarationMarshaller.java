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
 * ParameterDeclarationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParameterDeclarationMarshaller {

    private static final MarshallingInfo<StructuredPojo> STRINGPARAMETERDECLARATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringParameterDeclaration").build();
    private static final MarshallingInfo<StructuredPojo> DECIMALPARAMETERDECLARATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DecimalParameterDeclaration").build();
    private static final MarshallingInfo<StructuredPojo> INTEGERPARAMETERDECLARATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegerParameterDeclaration").build();
    private static final MarshallingInfo<StructuredPojo> DATETIMEPARAMETERDECLARATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateTimeParameterDeclaration").build();

    private static final ParameterDeclarationMarshaller instance = new ParameterDeclarationMarshaller();

    public static ParameterDeclarationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParameterDeclaration parameterDeclaration, ProtocolMarshaller protocolMarshaller) {

        if (parameterDeclaration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parameterDeclaration.getStringParameterDeclaration(), STRINGPARAMETERDECLARATION_BINDING);
            protocolMarshaller.marshall(parameterDeclaration.getDecimalParameterDeclaration(), DECIMALPARAMETERDECLARATION_BINDING);
            protocolMarshaller.marshall(parameterDeclaration.getIntegerParameterDeclaration(), INTEGERPARAMETERDECLARATION_BINDING);
            protocolMarshaller.marshall(parameterDeclaration.getDateTimeParameterDeclaration(), DATETIMEPARAMETERDECLARATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
