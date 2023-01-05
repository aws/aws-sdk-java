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
package com.amazonaws.services.workmail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EwsAvailabilityProviderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EwsAvailabilityProviderMarshaller {

    private static final MarshallingInfo<String> EWSENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EwsEndpoint").build();
    private static final MarshallingInfo<String> EWSUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EwsUsername").build();
    private static final MarshallingInfo<String> EWSPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EwsPassword").build();

    private static final EwsAvailabilityProviderMarshaller instance = new EwsAvailabilityProviderMarshaller();

    public static EwsAvailabilityProviderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EwsAvailabilityProvider ewsAvailabilityProvider, ProtocolMarshaller protocolMarshaller) {

        if (ewsAvailabilityProvider == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ewsAvailabilityProvider.getEwsEndpoint(), EWSENDPOINT_BINDING);
            protocolMarshaller.marshall(ewsAvailabilityProvider.getEwsUsername(), EWSUSERNAME_BINDING);
            protocolMarshaller.marshall(ewsAvailabilityProvider.getEwsPassword(), EWSPASSWORD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
