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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LastActiveDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LastActiveDefinitionMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PARAMETERSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterSpec").build();
    private static final MarshallingInfo<String> BLUEPRINTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlueprintLocation").build();
    private static final MarshallingInfo<String> BLUEPRINTSERVICELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlueprintServiceLocation").build();

    private static final LastActiveDefinitionMarshaller instance = new LastActiveDefinitionMarshaller();

    public static LastActiveDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LastActiveDefinition lastActiveDefinition, ProtocolMarshaller protocolMarshaller) {

        if (lastActiveDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lastActiveDefinition.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(lastActiveDefinition.getLastModifiedOn(), LASTMODIFIEDON_BINDING);
            protocolMarshaller.marshall(lastActiveDefinition.getParameterSpec(), PARAMETERSPEC_BINDING);
            protocolMarshaller.marshall(lastActiveDefinition.getBlueprintLocation(), BLUEPRINTLOCATION_BINDING);
            protocolMarshaller.marshall(lastActiveDefinition.getBlueprintServiceLocation(), BLUEPRINTSERVICELOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
