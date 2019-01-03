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
 * CreateCertificateFromCsrRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCertificateFromCsrRequestMarshaller {

    private static final MarshallingInfo<String> CERTIFICATESIGNINGREQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateSigningRequest").build();
    private static final MarshallingInfo<Boolean> SETASACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("setAsActive").build();

    private static final CreateCertificateFromCsrRequestMarshaller instance = new CreateCertificateFromCsrRequestMarshaller();

    public static CreateCertificateFromCsrRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCertificateFromCsrRequest createCertificateFromCsrRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCertificateFromCsrRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCertificateFromCsrRequest.getCertificateSigningRequest(), CERTIFICATESIGNINGREQUEST_BINDING);
            protocolMarshaller.marshall(createCertificateFromCsrRequest.getSetAsActive(), SETASACTIVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
