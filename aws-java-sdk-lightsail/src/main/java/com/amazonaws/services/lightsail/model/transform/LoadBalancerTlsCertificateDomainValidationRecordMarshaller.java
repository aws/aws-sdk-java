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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoadBalancerTlsCertificateDomainValidationRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoadBalancerTlsCertificateDomainValidationRecordMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("value").build();
    private static final MarshallingInfo<String> VALIDATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validationStatus").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();

    private static final LoadBalancerTlsCertificateDomainValidationRecordMarshaller instance = new LoadBalancerTlsCertificateDomainValidationRecordMarshaller();

    public static LoadBalancerTlsCertificateDomainValidationRecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoadBalancerTlsCertificateDomainValidationRecord loadBalancerTlsCertificateDomainValidationRecord,
            ProtocolMarshaller protocolMarshaller) {

        if (loadBalancerTlsCertificateDomainValidationRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loadBalancerTlsCertificateDomainValidationRecord.getName(), NAME_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificateDomainValidationRecord.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificateDomainValidationRecord.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificateDomainValidationRecord.getValidationStatus(), VALIDATIONSTATUS_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificateDomainValidationRecord.getDomainName(), DOMAINNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
