/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubrefactorspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubrefactorspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateRouteRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRouteRequestMarshaller {

    private static final MarshallingInfo<String> ACTIVATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActivationState").build();
    private static final MarshallingInfo<String> APPLICATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ApplicationIdentifier").build();
    private static final MarshallingInfo<String> ENVIRONMENTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("EnvironmentIdentifier").build();
    private static final MarshallingInfo<String> ROUTEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("RouteIdentifier").build();

    private static final UpdateRouteRequestMarshaller instance = new UpdateRouteRequestMarshaller();

    public static UpdateRouteRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRouteRequest updateRouteRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRouteRequest.getActivationState(), ACTIVATIONSTATE_BINDING);
            protocolMarshaller.marshall(updateRouteRequest.getApplicationIdentifier(), APPLICATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateRouteRequest.getEnvironmentIdentifier(), ENVIRONMENTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateRouteRequest.getRouteIdentifier(), ROUTEIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
