/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterCACertificateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterCACertificateRequestMarshaller {

    private static final MarshallingInfo<String> CACERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("caCertificate").build();
    private static final MarshallingInfo<String> VERIFICATIONCERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("verificationCertificate").build();
    private static final MarshallingInfo<Boolean> SETASACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("setAsActive").build();
    private static final MarshallingInfo<Boolean> ALLOWAUTOREGISTRATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("allowAutoRegistration").build();
    private static final MarshallingInfo<StructuredPojo> REGISTRATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registrationConfig").build();

    private static final RegisterCACertificateRequestMarshaller instance = new RegisterCACertificateRequestMarshaller();

    public static RegisterCACertificateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterCACertificateRequest registerCACertificateRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerCACertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerCACertificateRequest.getCaCertificate(), CACERTIFICATE_BINDING);
            protocolMarshaller.marshall(registerCACertificateRequest.getVerificationCertificate(), VERIFICATIONCERTIFICATE_BINDING);
            protocolMarshaller.marshall(registerCACertificateRequest.getSetAsActive(), SETASACTIVE_BINDING);
            protocolMarshaller.marshall(registerCACertificateRequest.getAllowAutoRegistration(), ALLOWAUTOREGISTRATION_BINDING);
            protocolMarshaller.marshall(registerCACertificateRequest.getRegistrationConfig(), REGISTRATIONCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
