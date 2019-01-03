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
package com.amazonaws.services.clouddirectory.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TypedLinkAttributeDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TypedLinkAttributeDefinitionMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultValue").build();
    private static final MarshallingInfo<Boolean> ISIMMUTABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsImmutable").build();
    private static final MarshallingInfo<Map> RULES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rules").build();
    private static final MarshallingInfo<String> REQUIREDBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequiredBehavior").build();

    private static final TypedLinkAttributeDefinitionMarshaller instance = new TypedLinkAttributeDefinitionMarshaller();

    public static TypedLinkAttributeDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TypedLinkAttributeDefinition typedLinkAttributeDefinition, ProtocolMarshaller protocolMarshaller) {

        if (typedLinkAttributeDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(typedLinkAttributeDefinition.getName(), NAME_BINDING);
            protocolMarshaller.marshall(typedLinkAttributeDefinition.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(typedLinkAttributeDefinition.getDefaultValue(), DEFAULTVALUE_BINDING);
            protocolMarshaller.marshall(typedLinkAttributeDefinition.getIsImmutable(), ISIMMUTABLE_BINDING);
            protocolMarshaller.marshall(typedLinkAttributeDefinition.getRules(), RULES_BINDING);
            protocolMarshaller.marshall(typedLinkAttributeDefinition.getRequiredBehavior(), REQUIREDBEHAVIOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
