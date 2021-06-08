/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53resolver.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportFirewallDomainsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportFirewallDomainsRequestMarshaller {

    private static final MarshallingInfo<String> FIREWALLDOMAINLISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallDomainListId").build();
    private static final MarshallingInfo<String> OPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Operation").build();
    private static final MarshallingInfo<String> DOMAINFILEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainFileUrl").build();

    private static final ImportFirewallDomainsRequestMarshaller instance = new ImportFirewallDomainsRequestMarshaller();

    public static ImportFirewallDomainsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportFirewallDomainsRequest importFirewallDomainsRequest, ProtocolMarshaller protocolMarshaller) {

        if (importFirewallDomainsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importFirewallDomainsRequest.getFirewallDomainListId(), FIREWALLDOMAINLISTID_BINDING);
            protocolMarshaller.marshall(importFirewallDomainsRequest.getOperation(), OPERATION_BINDING);
            protocolMarshaller.marshall(importFirewallDomainsRequest.getDomainFileUrl(), DOMAINFILEURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
