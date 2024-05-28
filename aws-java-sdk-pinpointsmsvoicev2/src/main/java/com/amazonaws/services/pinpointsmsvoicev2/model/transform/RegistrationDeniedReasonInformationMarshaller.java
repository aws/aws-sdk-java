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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegistrationDeniedReasonInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegistrationDeniedReasonInformationMarshaller {

    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reason").build();
    private static final MarshallingInfo<String> SHORTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShortDescription").build();
    private static final MarshallingInfo<String> LONGDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongDescription").build();
    private static final MarshallingInfo<String> DOCUMENTATIONTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentationTitle").build();
    private static final MarshallingInfo<String> DOCUMENTATIONLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentationLink").build();

    private static final RegistrationDeniedReasonInformationMarshaller instance = new RegistrationDeniedReasonInformationMarshaller();

    public static RegistrationDeniedReasonInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegistrationDeniedReasonInformation registrationDeniedReasonInformation, ProtocolMarshaller protocolMarshaller) {

        if (registrationDeniedReasonInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registrationDeniedReasonInformation.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(registrationDeniedReasonInformation.getShortDescription(), SHORTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(registrationDeniedReasonInformation.getLongDescription(), LONGDESCRIPTION_BINDING);
            protocolMarshaller.marshall(registrationDeniedReasonInformation.getDocumentationTitle(), DOCUMENTATIONTITLE_BINDING);
            protocolMarshaller.marshall(registrationDeniedReasonInformation.getDocumentationLink(), DOCUMENTATIONLINK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
