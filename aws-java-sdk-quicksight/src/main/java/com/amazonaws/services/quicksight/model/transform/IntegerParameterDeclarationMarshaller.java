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
 * IntegerParameterDeclarationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IntegerParameterDeclarationMarshaller {

    private static final MarshallingInfo<String> PARAMETERVALUETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterValueType").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultValues").build();
    private static final MarshallingInfo<StructuredPojo> VALUEWHENUNSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValueWhenUnset").build();

    private static final IntegerParameterDeclarationMarshaller instance = new IntegerParameterDeclarationMarshaller();

    public static IntegerParameterDeclarationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IntegerParameterDeclaration integerParameterDeclaration, ProtocolMarshaller protocolMarshaller) {

        if (integerParameterDeclaration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(integerParameterDeclaration.getParameterValueType(), PARAMETERVALUETYPE_BINDING);
            protocolMarshaller.marshall(integerParameterDeclaration.getName(), NAME_BINDING);
            protocolMarshaller.marshall(integerParameterDeclaration.getDefaultValues(), DEFAULTVALUES_BINDING);
            protocolMarshaller.marshall(integerParameterDeclaration.getValueWhenUnset(), VALUEWHENUNSET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
