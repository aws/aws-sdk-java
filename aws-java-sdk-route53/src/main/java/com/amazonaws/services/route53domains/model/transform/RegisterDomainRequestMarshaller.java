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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53domains.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterDomainRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterDomainRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> IDNLANGCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdnLangCode").build();
    private static final MarshallingInfo<Integer> DURATIONINYEARS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DurationInYears").build();
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

    private static final RegisterDomainRequestMarshaller instance = new RegisterDomainRequestMarshaller();

    public static RegisterDomainRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterDomainRequest registerDomainRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerDomainRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(registerDomainRequest.getIdnLangCode(), IDNLANGCODE_BINDING);
            protocolMarshaller.marshall(registerDomainRequest.getDurationInYears(), DURATIONINYEARS_BINDING);
            protocolMarshaller.marshall(registerDomainRequest.getAutoRenew(), AUTORENEW_BINDING);
            protocolMarshaller.marshall(registerDomainRequest.getAdminContact(), ADMINCONTACT_BINDING);
            protocolMarshaller.marshall(registerDomainRequest.getRegistrantContact(), REGISTRANTCONTACT_BINDING);
            protocolMarshaller.marshall(registerDomainRequest.getTechContact(), TECHCONTACT_BINDING);
            protocolMarshaller.marshall(registerDomainRequest.getPrivacyProtectAdminContact(), PRIVACYPROTECTADMINCONTACT_BINDING);
            protocolMarshaller.marshall(registerDomainRequest.getPrivacyProtectRegistrantContact(), PRIVACYPROTECTREGISTRANTCONTACT_BINDING);
            protocolMarshaller.marshall(registerDomainRequest.getPrivacyProtectTechContact(), PRIVACYPROTECTTECHCONTACT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
