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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opensearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDomainRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDomainRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<StructuredPojo> CLUSTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterConfig").build();
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
    private static final MarshallingInfo<StructuredPojo> DOMAINENDPOINTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainEndpointOptions").build();
    private static final MarshallingInfo<StructuredPojo> ADVANCEDSECURITYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedSecurityOptions").build();
    private static final MarshallingInfo<List> TAGLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagList").build();
    private static final MarshallingInfo<StructuredPojo> AUTOTUNEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoTuneOptions").build();

    private static final CreateDomainRequestMarshaller instance = new CreateDomainRequestMarshaller();

    public static CreateDomainRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDomainRequest createDomainRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDomainRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getClusterConfig(), CLUSTERCONFIG_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getEBSOptions(), EBSOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getAccessPolicies(), ACCESSPOLICIES_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getSnapshotOptions(), SNAPSHOTOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getVPCOptions(), VPCOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getCognitoOptions(), COGNITOOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getEncryptionAtRestOptions(), ENCRYPTIONATRESTOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getNodeToNodeEncryptionOptions(), NODETONODEENCRYPTIONOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getAdvancedOptions(), ADVANCEDOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getLogPublishingOptions(), LOGPUBLISHINGOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getDomainEndpointOptions(), DOMAINENDPOINTOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getAdvancedSecurityOptions(), ADVANCEDSECURITYOPTIONS_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getTagList(), TAGLIST_BINDING);
            protocolMarshaller.marshall(createDomainRequest.getAutoTuneOptions(), AUTOTUNEOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
