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
package com.amazonaws.services.acmpca.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.acmpca.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ASN1SubjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ASN1SubjectMarshaller {

    private static final MarshallingInfo<String> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Country").build();
    private static final MarshallingInfo<String> ORGANIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Organization").build();
    private static final MarshallingInfo<String> ORGANIZATIONALUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationalUnit").build();
    private static final MarshallingInfo<String> DISTINGUISHEDNAMEQUALIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DistinguishedNameQualifier").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> COMMONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CommonName").build();
    private static final MarshallingInfo<String> SERIALNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SerialNumber").build();
    private static final MarshallingInfo<String> LOCALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Locality").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> SURNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Surname").build();
    private static final MarshallingInfo<String> GIVENNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GivenName").build();
    private static final MarshallingInfo<String> INITIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Initials").build();
    private static final MarshallingInfo<String> PSEUDONYM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Pseudonym").build();
    private static final MarshallingInfo<String> GENERATIONQUALIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationQualifier").build();

    private static final ASN1SubjectMarshaller instance = new ASN1SubjectMarshaller();

    public static ASN1SubjectMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ASN1Subject aSN1Subject, ProtocolMarshaller protocolMarshaller) {

        if (aSN1Subject == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aSN1Subject.getCountry(), COUNTRY_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getOrganization(), ORGANIZATION_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getOrganizationalUnit(), ORGANIZATIONALUNIT_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getDistinguishedNameQualifier(), DISTINGUISHEDNAMEQUALIFIER_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getState(), STATE_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getCommonName(), COMMONNAME_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getSerialNumber(), SERIALNUMBER_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getLocality(), LOCALITY_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getSurname(), SURNAME_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getGivenName(), GIVENNAME_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getInitials(), INITIALS_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getPseudonym(), PSEUDONYM_BINDING);
            protocolMarshaller.marshall(aSN1Subject.getGenerationQualifier(), GENERATIONQUALIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
