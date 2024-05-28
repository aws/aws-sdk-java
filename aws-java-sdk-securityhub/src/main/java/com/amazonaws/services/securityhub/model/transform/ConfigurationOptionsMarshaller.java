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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigurationOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigurationOptionsMarshaller {

    private static final MarshallingInfo<StructuredPojo> INTEGER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Integer").build();
    private static final MarshallingInfo<StructuredPojo> INTEGERLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegerList").build();
    private static final MarshallingInfo<StructuredPojo> DOUBLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Double").build();
    private static final MarshallingInfo<StructuredPojo> STRING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("String").build();
    private static final MarshallingInfo<StructuredPojo> STRINGLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringList").build();
    private static final MarshallingInfo<StructuredPojo> BOOLEAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Boolean").build();
    private static final MarshallingInfo<StructuredPojo> ENUM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Enum").build();
    private static final MarshallingInfo<StructuredPojo> ENUMLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnumList").build();

    private static final ConfigurationOptionsMarshaller instance = new ConfigurationOptionsMarshaller();

    public static ConfigurationOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigurationOptions configurationOptions, ProtocolMarshaller protocolMarshaller) {

        if (configurationOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configurationOptions.getInteger(), INTEGER_BINDING);
            protocolMarshaller.marshall(configurationOptions.getIntegerList(), INTEGERLIST_BINDING);
            protocolMarshaller.marshall(configurationOptions.getDouble(), DOUBLE_BINDING);
            protocolMarshaller.marshall(configurationOptions.getString(), STRING_BINDING);
            protocolMarshaller.marshall(configurationOptions.getStringList(), STRINGLIST_BINDING);
            protocolMarshaller.marshall(configurationOptions.getBoolean(), BOOLEAN_BINDING);
            protocolMarshaller.marshall(configurationOptions.getEnum(), ENUM_BINDING);
            protocolMarshaller.marshall(configurationOptions.getEnumList(), ENUMLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
