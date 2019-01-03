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
package com.amazonaws.services.apigateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDomainNameRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDomainNameRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();
    private static final MarshallingInfo<String> CERTIFICATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateName").build();
    private static final MarshallingInfo<String> CERTIFICATEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateBody").build();
    private static final MarshallingInfo<String> CERTIFICATEPRIVATEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificatePrivateKey").build();
    private static final MarshallingInfo<String> CERTIFICATECHAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateChain").build();
    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateArn").build();
    private static final MarshallingInfo<String> REGIONALCERTIFICATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("regionalCertificateName").build();
    private static final MarshallingInfo<String> REGIONALCERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("regionalCertificateArn").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointConfiguration").build();

    private static final CreateDomainNameRequestMarshaller instance = new CreateDomainNameRequestMarshaller();

    public static CreateDomainNameRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDomainNameRequest createDomainNameRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDomainNameRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDomainNameRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(createDomainNameRequest.getCertificateName(), CERTIFICATENAME_BINDING);
            protocolMarshaller.marshall(createDomainNameRequest.getCertificateBody(), CERTIFICATEBODY_BINDING);
            protocolMarshaller.marshall(createDomainNameRequest.getCertificatePrivateKey(), CERTIFICATEPRIVATEKEY_BINDING);
            protocolMarshaller.marshall(createDomainNameRequest.getCertificateChain(), CERTIFICATECHAIN_BINDING);
            protocolMarshaller.marshall(createDomainNameRequest.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(createDomainNameRequest.getRegionalCertificateName(), REGIONALCERTIFICATENAME_BINDING);
            protocolMarshaller.marshall(createDomainNameRequest.getRegionalCertificateArn(), REGIONALCERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(createDomainNameRequest.getEndpointConfiguration(), ENDPOINTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
