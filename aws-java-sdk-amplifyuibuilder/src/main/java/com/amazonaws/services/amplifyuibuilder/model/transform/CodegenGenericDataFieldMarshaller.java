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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodegenGenericDataFieldMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodegenGenericDataFieldMarshaller {

    private static final MarshallingInfo<String> DATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dataType").build();
    private static final MarshallingInfo<String> DATATYPEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataTypeValue").build();
    private static final MarshallingInfo<Boolean> REQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("required").build();
    private static final MarshallingInfo<Boolean> READONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readOnly").build();
    private static final MarshallingInfo<Boolean> ISARRAY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("isArray").build();
    private static final MarshallingInfo<StructuredPojo> RELATIONSHIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationship").build();

    private static final CodegenGenericDataFieldMarshaller instance = new CodegenGenericDataFieldMarshaller();

    public static CodegenGenericDataFieldMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodegenGenericDataField codegenGenericDataField, ProtocolMarshaller protocolMarshaller) {

        if (codegenGenericDataField == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codegenGenericDataField.getDataType(), DATATYPE_BINDING);
            protocolMarshaller.marshall(codegenGenericDataField.getDataTypeValue(), DATATYPEVALUE_BINDING);
            protocolMarshaller.marshall(codegenGenericDataField.getRequired(), REQUIRED_BINDING);
            protocolMarshaller.marshall(codegenGenericDataField.getReadOnly(), READONLY_BINDING);
            protocolMarshaller.marshall(codegenGenericDataField.getIsArray(), ISARRAY_BINDING);
            protocolMarshaller.marshall(codegenGenericDataField.getRelationship(), RELATIONSHIP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
