/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SchemaAttributeTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SchemaAttributeTypeMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> ATTRIBUTEDATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributeDataType").build();
    private static final MarshallingInfo<Boolean> DEVELOPERONLYATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeveloperOnlyAttribute").build();
    private static final MarshallingInfo<Boolean> MUTABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mutable").build();
    private static final MarshallingInfo<Boolean> REQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Required").build();
    private static final MarshallingInfo<StructuredPojo> NUMBERATTRIBUTECONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberAttributeConstraints").build();
    private static final MarshallingInfo<StructuredPojo> STRINGATTRIBUTECONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringAttributeConstraints").build();

    private static final SchemaAttributeTypeMarshaller instance = new SchemaAttributeTypeMarshaller();

    public static SchemaAttributeTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SchemaAttributeType schemaAttributeType, ProtocolMarshaller protocolMarshaller) {

        if (schemaAttributeType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(schemaAttributeType.getName(), NAME_BINDING);
            protocolMarshaller.marshall(schemaAttributeType.getAttributeDataType(), ATTRIBUTEDATATYPE_BINDING);
            protocolMarshaller.marshall(schemaAttributeType.getDeveloperOnlyAttribute(), DEVELOPERONLYATTRIBUTE_BINDING);
            protocolMarshaller.marshall(schemaAttributeType.getMutable(), MUTABLE_BINDING);
            protocolMarshaller.marshall(schemaAttributeType.getRequired(), REQUIRED_BINDING);
            protocolMarshaller.marshall(schemaAttributeType.getNumberAttributeConstraints(), NUMBERATTRIBUTECONSTRAINTS_BINDING);
            protocolMarshaller.marshall(schemaAttributeType.getStringAttributeConstraints(), STRINGATTRIBUTECONSTRAINTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
