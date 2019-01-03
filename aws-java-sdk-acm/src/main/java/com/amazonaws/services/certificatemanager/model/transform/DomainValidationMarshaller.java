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
package com.amazonaws.services.certificatemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.certificatemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DomainValidationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainValidationMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<List> VALIDATIONEMAILS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationEmails").build();
    private static final MarshallingInfo<String> VALIDATIONDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationDomain").build();
    private static final MarshallingInfo<String> VALIDATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationStatus").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCERECORD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceRecord").build();
    private static final MarshallingInfo<String> VALIDATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationMethod").build();

    private static final DomainValidationMarshaller instance = new DomainValidationMarshaller();

    public static DomainValidationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainValidation domainValidation, ProtocolMarshaller protocolMarshaller) {

        if (domainValidation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainValidation.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(domainValidation.getValidationEmails(), VALIDATIONEMAILS_BINDING);
            protocolMarshaller.marshall(domainValidation.getValidationDomain(), VALIDATIONDOMAIN_BINDING);
            protocolMarshaller.marshall(domainValidation.getValidationStatus(), VALIDATIONSTATUS_BINDING);
            protocolMarshaller.marshall(domainValidation.getResourceRecord(), RESOURCERECORD_BINDING);
            protocolMarshaller.marshall(domainValidation.getValidationMethod(), VALIDATIONMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
