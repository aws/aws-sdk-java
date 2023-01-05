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
package com.amazonaws.services.opensearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opensearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DomainConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<StructuredPojo> CLUSTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterConfig").build();
    private static final MarshallingInfo<StructuredPojo> EBSOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EBSOptions").build();
    private static final MarshallingInfo<StructuredPojo> ACCESSPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
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
    private static final MarshallingInfo<StructuredPojo> ADVANCEDOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedOptions").build();
    private static final MarshallingInfo<StructuredPojo> LOGPUBLISHINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogPublishingOptions").build();
    private static final MarshallingInfo<StructuredPojo> DOMAINENDPOINTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainEndpointOptions").build();
    private static final MarshallingInfo<StructuredPojo> ADVANCEDSECURITYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedSecurityOptions").build();
    private static final MarshallingInfo<StructuredPojo> AUTOTUNEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoTuneOptions").build();
    private static final MarshallingInfo<StructuredPojo> CHANGEPROGRESSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeProgressDetails").build();

    private static final DomainConfigMarshaller instance = new DomainConfigMarshaller();

    public static DomainConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainConfig domainConfig, ProtocolMarshaller protocolMarshaller) {

        if (domainConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainConfig.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(domainConfig.getClusterConfig(), CLUSTERCONFIG_BINDING);
            protocolMarshaller.marshall(domainConfig.getEBSOptions(), EBSOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getAccessPolicies(), ACCESSPOLICIES_BINDING);
            protocolMarshaller.marshall(domainConfig.getSnapshotOptions(), SNAPSHOTOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getVPCOptions(), VPCOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getCognitoOptions(), COGNITOOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getEncryptionAtRestOptions(), ENCRYPTIONATRESTOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getNodeToNodeEncryptionOptions(), NODETONODEENCRYPTIONOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getAdvancedOptions(), ADVANCEDOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getLogPublishingOptions(), LOGPUBLISHINGOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getDomainEndpointOptions(), DOMAINENDPOINTOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getAdvancedSecurityOptions(), ADVANCEDSECURITYOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getAutoTuneOptions(), AUTOTUNEOPTIONS_BINDING);
            protocolMarshaller.marshall(domainConfig.getChangeProgressDetails(), CHANGEPROGRESSDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
