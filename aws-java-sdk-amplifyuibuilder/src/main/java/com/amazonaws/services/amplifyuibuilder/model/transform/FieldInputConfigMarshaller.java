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
 * FieldInputConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FieldInputConfigMarshaller {

    private static final MarshallingInfo<Boolean> DEFAULTCHECKED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultChecked").build();
    private static final MarshallingInfo<String> DEFAULTCOUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultCountryCode").build();
    private static final MarshallingInfo<String> DEFAULTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultValue").build();
    private static final MarshallingInfo<String> DESCRIPTIVETEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("descriptiveText").build();
    private static final MarshallingInfo<Boolean> ISARRAY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("isArray").build();
    private static final MarshallingInfo<Float> MAXVALUE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("maxValue").build();
    private static final MarshallingInfo<Float> MINVALUE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("minValue").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PLACEHOLDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("placeholder").build();
    private static final MarshallingInfo<Boolean> READONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readOnly").build();
    private static final MarshallingInfo<Boolean> REQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("required").build();
    private static final MarshallingInfo<Float> STEP_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("step").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("value").build();
    private static final MarshallingInfo<StructuredPojo> VALUEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("valueMappings").build();

    private static final FieldInputConfigMarshaller instance = new FieldInputConfigMarshaller();

    public static FieldInputConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FieldInputConfig fieldInputConfig, ProtocolMarshaller protocolMarshaller) {

        if (fieldInputConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fieldInputConfig.getDefaultChecked(), DEFAULTCHECKED_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getDefaultCountryCode(), DEFAULTCOUNTRYCODE_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getDefaultValue(), DEFAULTVALUE_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getDescriptiveText(), DESCRIPTIVETEXT_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getIsArray(), ISARRAY_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getMaxValue(), MAXVALUE_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getMinValue(), MINVALUE_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getName(), NAME_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getPlaceholder(), PLACEHOLDER_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getReadOnly(), READONLY_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getRequired(), REQUIRED_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getStep(), STEP_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(fieldInputConfig.getValueMappings(), VALUEMAPPINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
