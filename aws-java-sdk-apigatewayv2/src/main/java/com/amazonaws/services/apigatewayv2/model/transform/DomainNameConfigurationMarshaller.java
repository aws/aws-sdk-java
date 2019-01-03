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
package com.amazonaws.services.apigatewayv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DomainNameConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainNameConfigurationMarshaller {

    private static final MarshallingInfo<String> APIGATEWAYDOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("apiGatewayDomainName").build();
    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateArn").build();
    private static final MarshallingInfo<String> CERTIFICATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateName").build();
    private static final MarshallingInfo<java.util.Date> CERTIFICATEUPLOADDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateUploadDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> ENDPOINTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointType").build();
    private static final MarshallingInfo<String> HOSTEDZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hostedZoneId").build();

    private static final DomainNameConfigurationMarshaller instance = new DomainNameConfigurationMarshaller();

    public static DomainNameConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainNameConfiguration domainNameConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (domainNameConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainNameConfiguration.getApiGatewayDomainName(), APIGATEWAYDOMAINNAME_BINDING);
            protocolMarshaller.marshall(domainNameConfiguration.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(domainNameConfiguration.getCertificateName(), CERTIFICATENAME_BINDING);
            protocolMarshaller.marshall(domainNameConfiguration.getCertificateUploadDate(), CERTIFICATEUPLOADDATE_BINDING);
            protocolMarshaller.marshall(domainNameConfiguration.getEndpointType(), ENDPOINTTYPE_BINDING);
            protocolMarshaller.marshall(domainNameConfiguration.getHostedZoneId(), HOSTEDZONEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
