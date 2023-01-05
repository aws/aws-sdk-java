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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opensearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDomainConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDomainConfigRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DomainName").build();
    private static final MarshallingInfo<StructuredPojo> CLUSTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterConfig").build();
    private static final MarshallingInfo<StructuredPojo> EBSOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EBSOptions").build();
    private static final MarshallingInfo<StructuredPojo> SNAPSHOTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotOptions").build();
    private static final MarshallingInfo<StructuredPojo> VPCOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VPCOptions").build();
    private static final MarshallingInfo<StructuredPojo> COGNITOOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CognitoOptions").build();
    private static final MarshallingInfo<Map> ADVANCEDOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AdvancedOptions").build();
    private static final MarshallingInfo<String> ACCESSPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessPolicies").build();
    private static final MarshallingInfo<Map> LOGPUBLISHINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogPublishingOptions").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONATRESTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionAtRestOptions").build();
    private static final MarshallingInfo<StructuredPojo> DOMAINENDPOINTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainEndpointOptions").build();
    private static final MarshallingInfo<StructuredPojo> NODETONODEENCRYPTIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NodeToNodeEncryptionOptions").build();
    private static final MarshallingInfo<StructuredPojo> ADVANCEDSECURITYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedSecurityOptions").build();
    private static final MarshallingInfo<StructuredPojo> AUTOTUNEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoTuneOptions").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRun").build();

    private static final UpdateDomainConfigRequestMarshaller instance = new UpdateDomainConfigRequestMarshaller();

    public static UpdateDomainConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDomainConfigRequest updateDomainConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDomainConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDomainConfigRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getClusterConfig(), CLUSTERCONFIG_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getEBSOptions(), EBSOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getSnapshotOptions(), SNAPSHOTOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getVPCOptions(), VPCOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getCognitoOptions(), COGNITOOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getAdvancedOptions(), ADVANCEDOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getAccessPolicies(), ACCESSPOLICIES_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getLogPublishingOptions(), LOGPUBLISHINGOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getEncryptionAtRestOptions(), ENCRYPTIONATRESTOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getDomainEndpointOptions(), DOMAINENDPOINTOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getNodeToNodeEncryptionOptions(), NODETONODEENCRYPTIONOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getAdvancedSecurityOptions(), ADVANCEDSECURITYOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getAutoTuneOptions(), AUTOTUNEOPTIONS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigRequest.getDryRun(), DRYRUN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
