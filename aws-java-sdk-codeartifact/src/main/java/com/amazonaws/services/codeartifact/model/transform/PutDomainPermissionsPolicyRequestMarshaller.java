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
package com.amazonaws.services.codeartifact.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutDomainPermissionsPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutDomainPermissionsPolicyRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domain").build();
    private static final MarshallingInfo<String> DOMAINOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainOwner").build();
    private static final MarshallingInfo<String> POLICYREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyRevision").build();
    private static final MarshallingInfo<String> POLICYDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyDocument").build();

    private static final PutDomainPermissionsPolicyRequestMarshaller instance = new PutDomainPermissionsPolicyRequestMarshaller();

    public static PutDomainPermissionsPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutDomainPermissionsPolicyRequest putDomainPermissionsPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (putDomainPermissionsPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putDomainPermissionsPolicyRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(putDomainPermissionsPolicyRequest.getDomainOwner(), DOMAINOWNER_BINDING);
            protocolMarshaller.marshall(putDomainPermissionsPolicyRequest.getPolicyRevision(), POLICYREVISION_BINDING);
            protocolMarshaller.marshall(putDomainPermissionsPolicyRequest.getPolicyDocument(), POLICYDOCUMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
