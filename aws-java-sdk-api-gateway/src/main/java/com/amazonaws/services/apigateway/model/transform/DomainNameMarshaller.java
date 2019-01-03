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
 * DomainNameMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainNameMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();
    private static final MarshallingInfo<String> CERTIFICATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateName").build();
    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateArn").build();
    private static final MarshallingInfo<java.util.Date> CERTIFICATEUPLOADDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateUploadDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REGIONALDOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("regionalDomainName").build();
    private static final MarshallingInfo<String> REGIONALHOSTEDZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("regionalHostedZoneId").build();
    private static final MarshallingInfo<String> REGIONALCERTIFICATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("regionalCertificateName").build();
    private static final MarshallingInfo<String> REGIONALCERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("regionalCertificateArn").build();
    private static final MarshallingInfo<String> DISTRIBUTIONDOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("distributionDomainName").build();
    private static final MarshallingInfo<String> DISTRIBUTIONHOSTEDZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("distributionHostedZoneId").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointConfiguration").build();

    private static final DomainNameMarshaller instance = new DomainNameMarshaller();

    public static DomainNameMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainName domainName, ProtocolMarshaller protocolMarshaller) {

        if (domainName == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainName.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(domainName.getCertificateName(), CERTIFICATENAME_BINDING);
            protocolMarshaller.marshall(domainName.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(domainName.getCertificateUploadDate(), CERTIFICATEUPLOADDATE_BINDING);
            protocolMarshaller.marshall(domainName.getRegionalDomainName(), REGIONALDOMAINNAME_BINDING);
            protocolMarshaller.marshall(domainName.getRegionalHostedZoneId(), REGIONALHOSTEDZONEID_BINDING);
            protocolMarshaller.marshall(domainName.getRegionalCertificateName(), REGIONALCERTIFICATENAME_BINDING);
            protocolMarshaller.marshall(domainName.getRegionalCertificateArn(), REGIONALCERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(domainName.getDistributionDomainName(), DISTRIBUTIONDOMAINNAME_BINDING);
            protocolMarshaller.marshall(domainName.getDistributionHostedZoneId(), DISTRIBUTIONHOSTEDZONEID_BINDING);
            protocolMarshaller.marshall(domainName.getEndpointConfiguration(), ENDPOINTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
