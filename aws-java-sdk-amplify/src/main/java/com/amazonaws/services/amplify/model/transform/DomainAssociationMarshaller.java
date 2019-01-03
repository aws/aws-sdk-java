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
package com.amazonaws.services.amplify.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplify.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DomainAssociationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainAssociationMarshaller {

    private static final MarshallingInfo<String> DOMAINASSOCIATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainAssociationArn").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();
    private static final MarshallingInfo<Boolean> ENABLEAUTOSUBDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableAutoSubDomain").build();
    private static final MarshallingInfo<String> DOMAINSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainStatus").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();
    private static final MarshallingInfo<String> CERTIFICATEVERIFICATIONDNSRECORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateVerificationDNSRecord").build();
    private static final MarshallingInfo<List> SUBDOMAINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subDomains").build();

    private static final DomainAssociationMarshaller instance = new DomainAssociationMarshaller();

    public static DomainAssociationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainAssociation domainAssociation, ProtocolMarshaller protocolMarshaller) {

        if (domainAssociation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainAssociation.getDomainAssociationArn(), DOMAINASSOCIATIONARN_BINDING);
            protocolMarshaller.marshall(domainAssociation.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(domainAssociation.getEnableAutoSubDomain(), ENABLEAUTOSUBDOMAIN_BINDING);
            protocolMarshaller.marshall(domainAssociation.getDomainStatus(), DOMAINSTATUS_BINDING);
            protocolMarshaller.marshall(domainAssociation.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(domainAssociation.getCertificateVerificationDNSRecord(), CERTIFICATEVERIFICATIONDNSRECORD_BINDING);
            protocolMarshaller.marshall(domainAssociation.getSubDomains(), SUBDOMAINS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
