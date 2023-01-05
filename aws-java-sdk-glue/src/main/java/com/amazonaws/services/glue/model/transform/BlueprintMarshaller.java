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
 * BlueprintMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BlueprintMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> CREATEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PARAMETERSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterSpec").build();
    private static final MarshallingInfo<String> BLUEPRINTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlueprintLocation").build();
    private static final MarshallingInfo<String> BLUEPRINTSERVICELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlueprintServiceLocation").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<StructuredPojo> LASTACTIVEDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastActiveDefinition").build();

    private static final BlueprintMarshaller instance = new BlueprintMarshaller();

    public static BlueprintMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Blueprint blueprint, ProtocolMarshaller protocolMarshaller) {

        if (blueprint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(blueprint.getName(), NAME_BINDING);
            protocolMarshaller.marshall(blueprint.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(blueprint.getCreatedOn(), CREATEDON_BINDING);
            protocolMarshaller.marshall(blueprint.getLastModifiedOn(), LASTMODIFIEDON_BINDING);
            protocolMarshaller.marshall(blueprint.getParameterSpec(), PARAMETERSPEC_BINDING);
            protocolMarshaller.marshall(blueprint.getBlueprintLocation(), BLUEPRINTLOCATION_BINDING);
            protocolMarshaller.marshall(blueprint.getBlueprintServiceLocation(), BLUEPRINTSERVICELOCATION_BINDING);
            protocolMarshaller.marshall(blueprint.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(blueprint.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(blueprint.getLastActiveDefinition(), LASTACTIVEDEFINITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
