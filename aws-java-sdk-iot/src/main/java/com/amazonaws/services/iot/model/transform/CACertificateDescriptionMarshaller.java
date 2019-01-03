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
 * CACertificateDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CACertificateDescriptionMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateArn").build();
    private static final MarshallingInfo<String> CERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> CERTIFICATEPEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificatePem").build();
    private static final MarshallingInfo<String> OWNEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ownedBy").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> AUTOREGISTRATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoRegistrationStatus").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> CUSTOMERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerVersion").build();
    private static final MarshallingInfo<String> GENERATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("generationId").build();
    private static final MarshallingInfo<StructuredPojo> VALIDITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validity").build();

    private static final CACertificateDescriptionMarshaller instance = new CACertificateDescriptionMarshaller();

    public static CACertificateDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CACertificateDescription cACertificateDescription, ProtocolMarshaller protocolMarshaller) {

        if (cACertificateDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cACertificateDescription.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getCertificateId(), CERTIFICATEID_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getCertificatePem(), CERTIFICATEPEM_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getOwnedBy(), OWNEDBY_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getAutoRegistrationStatus(), AUTOREGISTRATIONSTATUS_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getCustomerVersion(), CUSTOMERVERSION_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getGenerationId(), GENERATIONID_BINDING);
            protocolMarshaller.marshall(cACertificateDescription.getValidity(), VALIDITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
