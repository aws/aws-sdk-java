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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLoadBalancerTlsCertificateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLoadBalancerTlsCertificateRequestMarshaller {

    private static final MarshallingInfo<String> LOADBALANCERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loadBalancerName").build();
    private static final MarshallingInfo<String> CERTIFICATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateName").build();
    private static final MarshallingInfo<String> CERTIFICATEDOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateDomainName").build();
    private static final MarshallingInfo<List> CERTIFICATEALTERNATIVENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateAlternativeNames").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateLoadBalancerTlsCertificateRequestMarshaller instance = new CreateLoadBalancerTlsCertificateRequestMarshaller();

    public static CreateLoadBalancerTlsCertificateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLoadBalancerTlsCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLoadBalancerTlsCertificateRequest.getLoadBalancerName(), LOADBALANCERNAME_BINDING);
            protocolMarshaller.marshall(createLoadBalancerTlsCertificateRequest.getCertificateName(), CERTIFICATENAME_BINDING);
            protocolMarshaller.marshall(createLoadBalancerTlsCertificateRequest.getCertificateDomainName(), CERTIFICATEDOMAINNAME_BINDING);
            protocolMarshaller.marshall(createLoadBalancerTlsCertificateRequest.getCertificateAlternativeNames(), CERTIFICATEALTERNATIVENAMES_BINDING);
            protocolMarshaller.marshall(createLoadBalancerTlsCertificateRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
