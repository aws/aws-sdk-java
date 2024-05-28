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
package com.amazonaws.services.emrcontainers.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrcontainers.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetManagedEndpointSessionCredentialsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetManagedEndpointSessionCredentialsRequestMarshaller {

    private static final MarshallingInfo<String> ENDPOINTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("endpointId").build();
    private static final MarshallingInfo<String> VIRTUALCLUSTERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("virtualClusterId").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRoleArn").build();
    private static final MarshallingInfo<String> CREDENTIALTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("credentialType").build();
    private static final MarshallingInfo<Integer> DURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationInSeconds").build();
    private static final MarshallingInfo<String> LOGCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logContext").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final GetManagedEndpointSessionCredentialsRequestMarshaller instance = new GetManagedEndpointSessionCredentialsRequestMarshaller();

    public static GetManagedEndpointSessionCredentialsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetManagedEndpointSessionCredentialsRequest getManagedEndpointSessionCredentialsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getManagedEndpointSessionCredentialsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getManagedEndpointSessionCredentialsRequest.getEndpointIdentifier(), ENDPOINTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(getManagedEndpointSessionCredentialsRequest.getVirtualClusterIdentifier(), VIRTUALCLUSTERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(getManagedEndpointSessionCredentialsRequest.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(getManagedEndpointSessionCredentialsRequest.getCredentialType(), CREDENTIALTYPE_BINDING);
            protocolMarshaller.marshall(getManagedEndpointSessionCredentialsRequest.getDurationInSeconds(), DURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(getManagedEndpointSessionCredentialsRequest.getLogContext(), LOGCONTEXT_BINDING);
            protocolMarshaller.marshall(getManagedEndpointSessionCredentialsRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
