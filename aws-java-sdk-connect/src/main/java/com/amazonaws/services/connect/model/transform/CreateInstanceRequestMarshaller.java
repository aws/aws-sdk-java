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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateInstanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateInstanceRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<String> IDENTITYMANAGEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityManagementType").build();
    private static final MarshallingInfo<String> INSTANCEALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceAlias").build();
    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<Boolean> INBOUNDCALLSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboundCallsEnabled").build();
    private static final MarshallingInfo<Boolean> OUTBOUNDCALLSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutboundCallsEnabled").build();

    private static final CreateInstanceRequestMarshaller instance = new CreateInstanceRequestMarshaller();

    public static CreateInstanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateInstanceRequest createInstanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (createInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createInstanceRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getIdentityManagementType(), IDENTITYMANAGEMENTTYPE_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getInstanceAlias(), INSTANCEALIAS_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getInboundCallsEnabled(), INBOUNDCALLSENABLED_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getOutboundCallsEnabled(), OUTBOUNDCALLSENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
