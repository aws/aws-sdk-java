/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateStudioComponentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateStudioComponentRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amz-Client-Token")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> EC2SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2SecurityGroupIds").build();
    private static final MarshallingInfo<List> INITIALIZATIONSCRIPTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initializationScripts").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<List> SCRIPTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scriptParameters").build();
    private static final MarshallingInfo<String> STUDIOCOMPONENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("studioComponentId").build();
    private static final MarshallingInfo<String> STUDIOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("studioId").build();
    private static final MarshallingInfo<String> SUBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subtype").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final UpdateStudioComponentRequestMarshaller instance = new UpdateStudioComponentRequestMarshaller();

    public static UpdateStudioComponentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateStudioComponentRequest updateStudioComponentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateStudioComponentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateStudioComponentRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getEc2SecurityGroupIds(), EC2SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getInitializationScripts(), INITIALIZATIONSCRIPTS_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getScriptParameters(), SCRIPTPARAMETERS_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getStudioComponentId(), STUDIOCOMPONENTID_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getStudioId(), STUDIOID_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getSubtype(), SUBTYPE_BINDING);
            protocolMarshaller.marshall(updateStudioComponentRequest.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
