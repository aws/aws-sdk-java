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
package com.amazonaws.services.elasticsearch.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ElasticsearchDomainStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ElasticsearchDomainStatusMarshaller {

    private static final MarshallingInfo<String> DOMAINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DomainId").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ARN").build();
    private static final MarshallingInfo<Boolean> CREATED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Created").build();
    private static final MarshallingInfo<Boolean> DELETED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Deleted").build();
    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Endpoint").build();
    private static final MarshallingInfo<Map> ENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Endpoints").build();
    private static final MarshallingInfo<Boolean> PROCESSING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Processing").build();
    private static final MarshallingInfo<Boolean> UPGRADEPROCESSING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpgradeProcessing").build();
    private static final MarshallingInfo<String> ELASTICSEARCHVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticsearchVersion").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICSEARCHCLUSTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticsearchClusterConfig").build();
    private static final MarshallingInfo<StructuredPojo> EBSOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EBSOptions").build();
    private static final MarshallingInfo<String> ACCESSPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessPolicies").build();
    private static final MarshallingInfo<StructuredPojo> SNAPSHOTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotOptions").build();
    private static final MarshallingInfo<StructuredPojo> VPCOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VPCOptions").build();
    private static final MarshallingInfo<StructuredPojo> COGNITOOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CognitoOptions").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONATRESTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionAtRestOptions").build();
    private static final MarshallingInfo<StructuredPojo> NODETONODEENCRYPTIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NodeToNodeEncryptionOptions").build();
    private static final MarshallingInfo<Map> ADVANCEDOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AdvancedOptions").build();
    private static final MarshallingInfo<Map> LOGPUBLISHINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogPublishingOptions").build();
    private static final MarshallingInfo<StructuredPojo> SERVICESOFTWAREOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceSoftwareOptions").build();

    private static final ElasticsearchDomainStatusMarshaller instance = new ElasticsearchDomainStatusMarshaller();

    public static ElasticsearchDomainStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ElasticsearchDomainStatus elasticsearchDomainStatus, ProtocolMarshaller protocolMarshaller) {

        if (elasticsearchDomainStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(elasticsearchDomainStatus.getDomainId(), DOMAINID_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getARN(), ARN_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getDeleted(), DELETED_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getEndpoints(), ENDPOINTS_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getProcessing(), PROCESSING_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getUpgradeProcessing(), UPGRADEPROCESSING_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getElasticsearchVersion(), ELASTICSEARCHVERSION_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getElasticsearchClusterConfig(), ELASTICSEARCHCLUSTERCONFIG_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getEBSOptions(), EBSOPTIONS_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getAccessPolicies(), ACCESSPOLICIES_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getSnapshotOptions(), SNAPSHOTOPTIONS_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getVPCOptions(), VPCOPTIONS_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getCognitoOptions(), COGNITOOPTIONS_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getEncryptionAtRestOptions(), ENCRYPTIONATRESTOPTIONS_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getNodeToNodeEncryptionOptions(), NODETONODEENCRYPTIONOPTIONS_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getAdvancedOptions(), ADVANCEDOPTIONS_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getLogPublishingOptions(), LOGPUBLISHINGOPTIONS_BINDING);
            protocolMarshaller.marshall(elasticsearchDomainStatus.getServiceSoftwareOptions(), SERVICESOFTWAREOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
