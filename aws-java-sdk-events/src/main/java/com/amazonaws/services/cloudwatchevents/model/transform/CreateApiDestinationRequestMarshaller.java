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
package com.amazonaws.services.cloudwatchevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateApiDestinationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateApiDestinationRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CONNECTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionArn").build();
    private static final MarshallingInfo<String> INVOCATIONENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvocationEndpoint").build();
    private static final MarshallingInfo<String> HTTPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpMethod").build();
    private static final MarshallingInfo<Integer> INVOCATIONRATELIMITPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvocationRateLimitPerSecond").build();

    private static final CreateApiDestinationRequestMarshaller instance = new CreateApiDestinationRequestMarshaller();

    public static CreateApiDestinationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateApiDestinationRequest createApiDestinationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createApiDestinationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createApiDestinationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createApiDestinationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createApiDestinationRequest.getConnectionArn(), CONNECTIONARN_BINDING);
            protocolMarshaller.marshall(createApiDestinationRequest.getInvocationEndpoint(), INVOCATIONENDPOINT_BINDING);
            protocolMarshaller.marshall(createApiDestinationRequest.getHttpMethod(), HTTPMETHOD_BINDING);
            protocolMarshaller.marshall(createApiDestinationRequest.getInvocationRateLimitPerSecond(), INVOCATIONRATELIMITPERSECOND_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
