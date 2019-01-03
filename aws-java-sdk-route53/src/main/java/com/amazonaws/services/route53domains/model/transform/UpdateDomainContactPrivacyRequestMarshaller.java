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
 * UpdateDomainContactPrivacyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDomainContactPrivacyRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<Boolean> ADMINPRIVACY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdminPrivacy").build();
    private static final MarshallingInfo<Boolean> REGISTRANTPRIVACY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrantPrivacy").build();
    private static final MarshallingInfo<Boolean> TECHPRIVACY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TechPrivacy").build();

    private static final UpdateDomainContactPrivacyRequestMarshaller instance = new UpdateDomainContactPrivacyRequestMarshaller();

    public static UpdateDomainContactPrivacyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDomainContactPrivacyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDomainContactPrivacyRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(updateDomainContactPrivacyRequest.getAdminPrivacy(), ADMINPRIVACY_BINDING);
            protocolMarshaller.marshall(updateDomainContactPrivacyRequest.getRegistrantPrivacy(), REGISTRANTPRIVACY_BINDING);
            protocolMarshaller.marshall(updateDomainContactPrivacyRequest.getTechPrivacy(), TECHPRIVACY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
