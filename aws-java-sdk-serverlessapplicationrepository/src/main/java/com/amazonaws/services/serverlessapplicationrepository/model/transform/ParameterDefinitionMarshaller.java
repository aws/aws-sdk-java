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
package com.amazonaws.services.serverlessapplicationrepository.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.serverlessapplicationrepository.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ParameterDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParameterDefinitionMarshaller {

    private static final MarshallingInfo<String> ALLOWEDPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedPattern").build();
    private static final MarshallingInfo<List> ALLOWEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("allowedValues").build();
    private static final MarshallingInfo<String> CONSTRAINTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("constraintDescription").build();
    private static final MarshallingInfo<String> DEFAULTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultValue").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Integer> MAXLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxLength").build();
    private static final MarshallingInfo<Integer> MAXVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxValue").build();
    private static final MarshallingInfo<Integer> MINLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minLength").build();
    private static final MarshallingInfo<Integer> MINVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minValue").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Boolean> NOECHO_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("noEcho").build();
    private static final MarshallingInfo<List> REFERENCEDBYRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("referencedByResources").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final ParameterDefinitionMarshaller instance = new ParameterDefinitionMarshaller();

    public static ParameterDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParameterDefinition parameterDefinition, ProtocolMarshaller protocolMarshaller) {

        if (parameterDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parameterDefinition.getAllowedPattern(), ALLOWEDPATTERN_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getAllowedValues(), ALLOWEDVALUES_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getConstraintDescription(), CONSTRAINTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getDefaultValue(), DEFAULTVALUE_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getMaxLength(), MAXLENGTH_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getMaxValue(), MAXVALUE_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getMinLength(), MINLENGTH_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getMinValue(), MINVALUE_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getName(), NAME_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getNoEcho(), NOECHO_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getReferencedByResources(), REFERENCEDBYRESOURCES_BINDING);
            protocolMarshaller.marshall(parameterDefinition.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
