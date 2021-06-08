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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DNISEmergencyCallingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DNISEmergencyCallingConfigurationMarshaller {

    private static final MarshallingInfo<String> EMERGENCYPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmergencyPhoneNumber").build();
    private static final MarshallingInfo<String> TESTPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TestPhoneNumber").build();
    private static final MarshallingInfo<String> CALLINGCOUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallingCountry").build();

    private static final DNISEmergencyCallingConfigurationMarshaller instance = new DNISEmergencyCallingConfigurationMarshaller();

    public static DNISEmergencyCallingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DNISEmergencyCallingConfiguration dNISEmergencyCallingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (dNISEmergencyCallingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dNISEmergencyCallingConfiguration.getEmergencyPhoneNumber(), EMERGENCYPHONENUMBER_BINDING);
            protocolMarshaller.marshall(dNISEmergencyCallingConfiguration.getTestPhoneNumber(), TESTPHONENUMBER_BINDING);
            protocolMarshaller.marshall(dNISEmergencyCallingConfiguration.getCallingCountry(), CALLINGCOUNTRY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
