/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DomainStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainStatusMarshaller {

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
    private static final MarshallingInfo<String> ENDPOINTV2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointV2").build();
    private static final MarshallingInfo<Map> ENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Endpoints").build();
    private static final MarshallingInfo<String> DOMAINENDPOINTV2HOSTEDZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainEndpointV2HostedZoneId").build();
    private static final MarshallingInfo<Boolean> PROCESSING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Processing").build();
    private static final MarshallingInfo<Boolean> UPGRADEPROCESSING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpgradeProcessing").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<StructuredPojo> CLUSTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterConfig").build();
    private static final MarshallingInfo<StructuredPojo> EBSOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EBSOptions").build();
    private static final MarshallingInfo<String> ACCESSPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessPolicies").build();
    private static final MarshallingInfo<String> IPADDRESSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IPAddressType").build();
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
    private static final MarshallingInfo<StructuredPojo> DOMAINENDPOINTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainEndpointOptions").build();
    private static final MarshallingInfo<StructuredPojo> ADVANCEDSECURITYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedSecurityOptions").build();
    private static final MarshallingInfo<StructuredPojo> AUTOTUNEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoTuneOptions").build();
    private static final MarshallingInfo<StructuredPojo> CHANGEPROGRESSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeProgressDetails").build();
    private static final MarshallingInfo<StructuredPojo> OFFPEAKWINDOWOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OffPeakWindowOptions").build();
    private static final MarshallingInfo<StructuredPojo> SOFTWAREUPDATEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SoftwareUpdateOptions").build();
    private static final MarshallingInfo<String> DOMAINPROCESSINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainProcessingStatus").build();
    private static final MarshallingInfo<List> MODIFYINGPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModifyingProperties").build();

    private static final DomainStatusMarshaller instance = new DomainStatusMarshaller();

    public static DomainStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainStatus domainStatus, ProtocolMarshaller protocolMarshaller) {

        if (domainStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainStatus.getDomainId(), DOMAINID_BINDING);
            protocolMarshaller.marshall(domainStatus.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(domainStatus.getARN(), ARN_BINDING);
            protocolMarshaller.marshall(domainStatus.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(domainStatus.getDeleted(), DELETED_BINDING);
            protocolMarshaller.marshall(domainStatus.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(domainStatus.getEndpointV2(), ENDPOINTV2_BINDING);
            protocolMarshaller.marshall(domainStatus.getEndpoints(), ENDPOINTS_BINDING);
            protocolMarshaller.marshall(domainStatus.getDomainEndpointV2HostedZoneId(), DOMAINENDPOINTV2HOSTEDZONEID_BINDING);
            protocolMarshaller.marshall(domainStatus.getProcessing(), PROCESSING_BINDING);
            protocolMarshaller.marshall(domainStatus.getUpgradeProcessing(), UPGRADEPROCESSING_BINDING);
            protocolMarshaller.marshall(domainStatus.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(domainStatus.getClusterConfig(), CLUSTERCONFIG_BINDING);
            protocolMarshaller.marshall(domainStatus.getEBSOptions(), EBSOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getAccessPolicies(), ACCESSPOLICIES_BINDING);
            protocolMarshaller.marshall(domainStatus.getIPAddressType(), IPADDRESSTYPE_BINDING);
            protocolMarshaller.marshall(domainStatus.getSnapshotOptions(), SNAPSHOTOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getVPCOptions(), VPCOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getCognitoOptions(), COGNITOOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getEncryptionAtRestOptions(), ENCRYPTIONATRESTOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getNodeToNodeEncryptionOptions(), NODETONODEENCRYPTIONOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getAdvancedOptions(), ADVANCEDOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getLogPublishingOptions(), LOGPUBLISHINGOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getServiceSoftwareOptions(), SERVICESOFTWAREOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getDomainEndpointOptions(), DOMAINENDPOINTOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getAdvancedSecurityOptions(), ADVANCEDSECURITYOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getAutoTuneOptions(), AUTOTUNEOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getChangeProgressDetails(), CHANGEPROGRESSDETAILS_BINDING);
            protocolMarshaller.marshall(domainStatus.getOffPeakWindowOptions(), OFFPEAKWINDOWOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getSoftwareUpdateOptions(), SOFTWAREUPDATEOPTIONS_BINDING);
            protocolMarshaller.marshall(domainStatus.getDomainProcessingStatus(), DOMAINPROCESSINGSTATUS_BINDING);
            protocolMarshaller.marshall(domainStatus.getModifyingProperties(), MODIFYINGPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
