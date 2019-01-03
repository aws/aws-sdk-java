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
package com.amazonaws.services.route53domains.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53domains.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransferDomainRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransferDomainRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> IDNLANGCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdnLangCode").build();
    private static final MarshallingInfo<Integer> DURATIONINYEARS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DurationInYears").build();
    private static final MarshallingInfo<List> NAMESERVERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Nameservers").build();
    private static final MarshallingInfo<String> AUTHCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthCode").build();
    private static final MarshallingInfo<Boolean> AUTORENEW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoRenew").build();
    private static final MarshallingInfo<StructuredPojo> ADMINCONTACT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdminContact").build();
    private static final MarshallingInfo<StructuredPojo> REGISTRANTCONTACT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrantContact").build();
    private static final MarshallingInfo<StructuredPojo> TECHCONTACT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TechContact").build();
    private static final MarshallingInfo<Boolean> PRIVACYPROTECTADMINCONTACT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivacyProtectAdminContact").build();
    private static final MarshallingInfo<Boolean> PRIVACYPROTECTREGISTRANTCONTACT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivacyProtectRegistrantContact").build();
    private static final MarshallingInfo<Boolean> PRIVACYPROTECTTECHCONTACT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivacyProtectTechContact").build();

    private static final TransferDomainRequestMarshaller instance = new TransferDomainRequestMarshaller();

    public static TransferDomainRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransferDomainRequest transferDomainRequest, ProtocolMarshaller protocolMarshaller) {

        if (transferDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transferDomainRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getIdnLangCode(), IDNLANGCODE_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getDurationInYears(), DURATIONINYEARS_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getNameservers(), NAMESERVERS_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getAuthCode(), AUTHCODE_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getAutoRenew(), AUTORENEW_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getAdminContact(), ADMINCONTACT_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getRegistrantContact(), REGISTRANTCONTACT_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getTechContact(), TECHCONTACT_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getPrivacyProtectAdminContact(), PRIVACYPROTECTADMINCONTACT_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getPrivacyProtectRegistrantContact(), PRIVACYPROTECTREGISTRANTCONTACT_BINDING);
            protocolMarshaller.marshall(transferDomainRequest.getPrivacyProtectTechContact(), PRIVACYPROTECTTECHCONTACT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
