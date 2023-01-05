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
package com.amazonaws.services.chimesdkidentity.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkidentity.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterAppInstanceUserEndpointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterAppInstanceUserEndpointRequestMarshaller {

    private static final MarshallingInfo<String> APPINSTANCEUSERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("appInstanceUserArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointAttributes").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> ALLOWMESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowMessages").build();

    private static final RegisterAppInstanceUserEndpointRequestMarshaller instance = new RegisterAppInstanceUserEndpointRequestMarshaller();

    public static RegisterAppInstanceUserEndpointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterAppInstanceUserEndpointRequest registerAppInstanceUserEndpointRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerAppInstanceUserEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerAppInstanceUserEndpointRequest.getAppInstanceUserArn(), APPINSTANCEUSERARN_BINDING);
            protocolMarshaller.marshall(registerAppInstanceUserEndpointRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(registerAppInstanceUserEndpointRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(registerAppInstanceUserEndpointRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(registerAppInstanceUserEndpointRequest.getEndpointAttributes(), ENDPOINTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(registerAppInstanceUserEndpointRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(registerAppInstanceUserEndpointRequest.getAllowMessages(), ALLOWMESSAGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
