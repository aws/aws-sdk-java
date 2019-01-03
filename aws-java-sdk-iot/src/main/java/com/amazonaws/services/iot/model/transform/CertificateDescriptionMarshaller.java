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
 * CertificateDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CertificateDescriptionMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateArn").build();
    private static final MarshallingInfo<String> CERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateId").build();
    private static final MarshallingInfo<String> CACERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("caCertificateId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> CERTIFICATEPEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificatePem").build();
    private static final MarshallingInfo<String> OWNEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ownedBy").build();
    private static final MarshallingInfo<String> PREVIOUSOWNEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("previousOwnedBy").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> CUSTOMERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerVersion").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFERDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferData").build();
    private static final MarshallingInfo<String> GENERATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("generationId").build();
    private static final MarshallingInfo<StructuredPojo> VALIDITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validity").build();

    private static final CertificateDescriptionMarshaller instance = new CertificateDescriptionMarshaller();

    public static CertificateDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CertificateDescription certificateDescription, ProtocolMarshaller protocolMarshaller) {

        if (certificateDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(certificateDescription.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(certificateDescription.getCertificateId(), CERTIFICATEID_BINDING);
            protocolMarshaller.marshall(certificateDescription.getCaCertificateId(), CACERTIFICATEID_BINDING);
            protocolMarshaller.marshall(certificateDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(certificateDescription.getCertificatePem(), CERTIFICATEPEM_BINDING);
            protocolMarshaller.marshall(certificateDescription.getOwnedBy(), OWNEDBY_BINDING);
            protocolMarshaller.marshall(certificateDescription.getPreviousOwnedBy(), PREVIOUSOWNEDBY_BINDING);
            protocolMarshaller.marshall(certificateDescription.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(certificateDescription.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(certificateDescription.getCustomerVersion(), CUSTOMERVERSION_BINDING);
            protocolMarshaller.marshall(certificateDescription.getTransferData(), TRANSFERDATA_BINDING);
            protocolMarshaller.marshall(certificateDescription.getGenerationId(), GENERATIONID_BINDING);
            protocolMarshaller.marshall(certificateDescription.getValidity(), VALIDITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
