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
 * DeleteLoadBalancerTlsCertificateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteLoadBalancerTlsCertificateRequestMarshaller {

    private static final MarshallingInfo<String> LOADBALANCERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loadBalancerName").build();
    private static final MarshallingInfo<String> CERTIFICATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateName").build();
    private static final MarshallingInfo<Boolean> FORCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("force").build();

    private static final DeleteLoadBalancerTlsCertificateRequestMarshaller instance = new DeleteLoadBalancerTlsCertificateRequestMarshaller();

    public static DeleteLoadBalancerTlsCertificateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteLoadBalancerTlsCertificateRequest deleteLoadBalancerTlsCertificateRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteLoadBalancerTlsCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteLoadBalancerTlsCertificateRequest.getLoadBalancerName(), LOADBALANCERNAME_BINDING);
            protocolMarshaller.marshall(deleteLoadBalancerTlsCertificateRequest.getCertificateName(), CERTIFICATENAME_BINDING);
            protocolMarshaller.marshall(deleteLoadBalancerTlsCertificateRequest.getForce(), FORCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
