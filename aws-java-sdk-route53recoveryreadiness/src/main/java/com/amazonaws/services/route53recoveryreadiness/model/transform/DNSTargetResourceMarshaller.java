/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoveryreadiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53recoveryreadiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DNSTargetResourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DNSTargetResourceMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();
    private static final MarshallingInfo<String> HOSTEDZONEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hostedZoneArn").build();
    private static final MarshallingInfo<String> RECORDSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recordSetId").build();
    private static final MarshallingInfo<String> RECORDTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recordType").build();
    private static final MarshallingInfo<StructuredPojo> TARGETRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResource").build();

    private static final DNSTargetResourceMarshaller instance = new DNSTargetResourceMarshaller();

    public static DNSTargetResourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DNSTargetResource dNSTargetResource, ProtocolMarshaller protocolMarshaller) {

        if (dNSTargetResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dNSTargetResource.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(dNSTargetResource.getHostedZoneArn(), HOSTEDZONEARN_BINDING);
            protocolMarshaller.marshall(dNSTargetResource.getRecordSetId(), RECORDSETID_BINDING);
            protocolMarshaller.marshall(dNSTargetResource.getRecordType(), RECORDTYPE_BINDING);
            protocolMarshaller.marshall(dNSTargetResource.getTargetResource(), TARGETRESOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
