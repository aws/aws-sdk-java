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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegistrationInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegistrationInformationMarshaller {

    private static final MarshallingInfo<String> REGISTRATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationArn").build();
    private static final MarshallingInfo<String> REGISTRATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationId").build();
    private static final MarshallingInfo<String> REGISTRATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationType").build();
    private static final MarshallingInfo<String> REGISTRATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationStatus").build();
    private static final MarshallingInfo<Long> CURRENTVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentVersionNumber").build();
    private static final MarshallingInfo<Long> APPROVEDVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovedVersionNumber").build();
    private static final MarshallingInfo<Long> LATESTDENIEDVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestDeniedVersionNumber").build();
    private static final MarshallingInfo<Map> ADDITIONALATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalAttributes").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("unixTimestamp").build();

    private static final RegistrationInformationMarshaller instance = new RegistrationInformationMarshaller();

    public static RegistrationInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegistrationInformation registrationInformation, ProtocolMarshaller protocolMarshaller) {

        if (registrationInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registrationInformation.getRegistrationArn(), REGISTRATIONARN_BINDING);
            protocolMarshaller.marshall(registrationInformation.getRegistrationId(), REGISTRATIONID_BINDING);
            protocolMarshaller.marshall(registrationInformation.getRegistrationType(), REGISTRATIONTYPE_BINDING);
            protocolMarshaller.marshall(registrationInformation.getRegistrationStatus(), REGISTRATIONSTATUS_BINDING);
            protocolMarshaller.marshall(registrationInformation.getCurrentVersionNumber(), CURRENTVERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(registrationInformation.getApprovedVersionNumber(), APPROVEDVERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(registrationInformation.getLatestDeniedVersionNumber(), LATESTDENIEDVERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(registrationInformation.getAdditionalAttributes(), ADDITIONALATTRIBUTES_BINDING);
            protocolMarshaller.marshall(registrationInformation.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
