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
package com.amazonaws.services.securityhub.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsOpenSearchServiceDomainDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsOpenSearchServiceDomainDetailsMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> ACCESSPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessPolicies").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> DOMAINENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainEndpoint").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONATRESTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionAtRestOptions").build();
    private static final MarshallingInfo<StructuredPojo> NODETONODEENCRYPTIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NodeToNodeEncryptionOptions").build();
    private static final MarshallingInfo<StructuredPojo> SERVICESOFTWAREOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceSoftwareOptions").build();
    private static final MarshallingInfo<StructuredPojo> CLUSTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterConfig").build();
    private static final MarshallingInfo<StructuredPojo> DOMAINENDPOINTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainEndpointOptions").build();
    private static final MarshallingInfo<StructuredPojo> VPCOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcOptions").build();
    private static final MarshallingInfo<StructuredPojo> LOGPUBLISHINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogPublishingOptions").build();
    private static final MarshallingInfo<Map> DOMAINENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DomainEndpoints").build();
    private static final MarshallingInfo<StructuredPojo> ADVANCEDSECURITYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedSecurityOptions").build();

    private static final AwsOpenSearchServiceDomainDetailsMarshaller instance = new AwsOpenSearchServiceDomainDetailsMarshaller();

    public static AwsOpenSearchServiceDomainDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsOpenSearchServiceDomainDetails awsOpenSearchServiceDomainDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsOpenSearchServiceDomainDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getAccessPolicies(), ACCESSPOLICIES_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getId(), ID_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getDomainEndpoint(), DOMAINENDPOINT_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getEncryptionAtRestOptions(), ENCRYPTIONATRESTOPTIONS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getNodeToNodeEncryptionOptions(), NODETONODEENCRYPTIONOPTIONS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getServiceSoftwareOptions(), SERVICESOFTWAREOPTIONS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getClusterConfig(), CLUSTERCONFIG_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getDomainEndpointOptions(), DOMAINENDPOINTOPTIONS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getVpcOptions(), VPCOPTIONS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getLogPublishingOptions(), LOGPUBLISHINGOPTIONS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getDomainEndpoints(), DOMAINENDPOINTS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainDetails.getAdvancedSecurityOptions(), ADVANCEDSECURITYOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
