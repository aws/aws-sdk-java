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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsSecurityFindingFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsSecurityFindingFiltersMarshaller {

    private static final MarshallingInfo<List> PRODUCTARN_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductArn").build();
    private static final MarshallingInfo<List> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<List> ID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<List> GENERATORID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GeneratorId").build();
    private static final MarshallingInfo<List> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<List> FIRSTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirstObservedAt").build();
    private static final MarshallingInfo<List> LASTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastObservedAt").build();
    private static final MarshallingInfo<List> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedAt").build();
    private static final MarshallingInfo<List> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UpdatedAt").build();
    private static final MarshallingInfo<List> SEVERITYPRODUCT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SeverityProduct").build();
    private static final MarshallingInfo<List> SEVERITYNORMALIZED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SeverityNormalized").build();
    private static final MarshallingInfo<List> SEVERITYLABEL_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SeverityLabel").build();
    private static final MarshallingInfo<List> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Confidence").build();
    private static final MarshallingInfo<List> CRITICALITY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Criticality").build();
    private static final MarshallingInfo<List> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<List> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Description").build();
    private static final MarshallingInfo<List> RECOMMENDATIONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationText").build();
    private static final MarshallingInfo<List> SOURCEURL_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceUrl").build();
    private static final MarshallingInfo<List> PRODUCTFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductFields").build();
    private static final MarshallingInfo<List> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductName").build();
    private static final MarshallingInfo<List> COMPANYNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CompanyName").build();
    private static final MarshallingInfo<List> USERDEFINEDFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserDefinedFields").build();
    private static final MarshallingInfo<List> MALWARENAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MalwareName").build();
    private static final MarshallingInfo<List> MALWARETYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MalwareType").build();
    private static final MarshallingInfo<List> MALWAREPATH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MalwarePath").build();
    private static final MarshallingInfo<List> MALWARESTATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MalwareState").build();
    private static final MarshallingInfo<List> NETWORKDIRECTION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkDirection").build();
    private static final MarshallingInfo<List> NETWORKPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkProtocol").build();
    private static final MarshallingInfo<List> NETWORKSOURCEIPV4_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkSourceIpV4").build();
    private static final MarshallingInfo<List> NETWORKSOURCEIPV6_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkSourceIpV6").build();
    private static final MarshallingInfo<List> NETWORKSOURCEPORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkSourcePort").build();
    private static final MarshallingInfo<List> NETWORKSOURCEDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkSourceDomain").build();
    private static final MarshallingInfo<List> NETWORKSOURCEMAC_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkSourceMac").build();
    private static final MarshallingInfo<List> NETWORKDESTINATIONIPV4_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkDestinationIpV4").build();
    private static final MarshallingInfo<List> NETWORKDESTINATIONIPV6_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkDestinationIpV6").build();
    private static final MarshallingInfo<List> NETWORKDESTINATIONPORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkDestinationPort").build();
    private static final MarshallingInfo<List> NETWORKDESTINATIONDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkDestinationDomain").build();
    private static final MarshallingInfo<List> PROCESSNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProcessName").build();
    private static final MarshallingInfo<List> PROCESSPATH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProcessPath").build();
    private static final MarshallingInfo<List> PROCESSPID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProcessPid").build();
    private static final MarshallingInfo<List> PROCESSPARENTPID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessParentPid").build();
    private static final MarshallingInfo<List> PROCESSLAUNCHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessLaunchedAt").build();
    private static final MarshallingInfo<List> PROCESSTERMINATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessTerminatedAt").build();
    private static final MarshallingInfo<List> THREATINTELINDICATORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreatIntelIndicatorType").build();
    private static final MarshallingInfo<List> THREATINTELINDICATORVALUE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreatIntelIndicatorValue").build();
    private static final MarshallingInfo<List> THREATINTELINDICATORCATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreatIntelIndicatorCategory").build();
    private static final MarshallingInfo<List> THREATINTELINDICATORLASTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreatIntelIndicatorLastObservedAt").build();
    private static final MarshallingInfo<List> THREATINTELINDICATORSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreatIntelIndicatorSource").build();
    private static final MarshallingInfo<List> THREATINTELINDICATORSOURCEURL_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreatIntelIndicatorSourceUrl").build();
    private static final MarshallingInfo<List> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<List> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<List> RESOURCEPARTITION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourcePartition").build();
    private static final MarshallingInfo<List> RESOURCEREGION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceRegion").build();
    private static final MarshallingInfo<List> RESOURCETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceTags").build();
    private static final MarshallingInfo<List> RESOURCEAWSEC2INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsEc2InstanceType").build();
    private static final MarshallingInfo<List> RESOURCEAWSEC2INSTANCEIMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsEc2InstanceImageId").build();
    private static final MarshallingInfo<List> RESOURCEAWSEC2INSTANCEIPV4ADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsEc2InstanceIpV4Addresses").build();
    private static final MarshallingInfo<List> RESOURCEAWSEC2INSTANCEIPV6ADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsEc2InstanceIpV6Addresses").build();
    private static final MarshallingInfo<List> RESOURCEAWSEC2INSTANCEKEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsEc2InstanceKeyName").build();
    private static final MarshallingInfo<List> RESOURCEAWSEC2INSTANCEIAMINSTANCEPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsEc2InstanceIamInstanceProfileArn").build();
    private static final MarshallingInfo<List> RESOURCEAWSEC2INSTANCEVPCID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsEc2InstanceVpcId").build();
    private static final MarshallingInfo<List> RESOURCEAWSEC2INSTANCESUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsEc2InstanceSubnetId").build();
    private static final MarshallingInfo<List> RESOURCEAWSEC2INSTANCELAUNCHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsEc2InstanceLaunchedAt").build();
    private static final MarshallingInfo<List> RESOURCEAWSS3BUCKETOWNERID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsS3BucketOwnerId").build();
    private static final MarshallingInfo<List> RESOURCEAWSS3BUCKETOWNERNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsS3BucketOwnerName").build();
    private static final MarshallingInfo<List> RESOURCEAWSIAMACCESSKEYUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsIamAccessKeyUserName").build();
    private static final MarshallingInfo<List> RESOURCEAWSIAMACCESSKEYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsIamAccessKeyStatus").build();
    private static final MarshallingInfo<List> RESOURCEAWSIAMACCESSKEYCREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAwsIamAccessKeyCreatedAt").build();
    private static final MarshallingInfo<List> RESOURCECONTAINERNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceContainerName").build();
    private static final MarshallingInfo<List> RESOURCECONTAINERIMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceContainerImageId").build();
    private static final MarshallingInfo<List> RESOURCECONTAINERIMAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceContainerImageName").build();
    private static final MarshallingInfo<List> RESOURCECONTAINERLAUNCHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceContainerLaunchedAt").build();
    private static final MarshallingInfo<List> RESOURCEDETAILSOTHER_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceDetailsOther").build();
    private static final MarshallingInfo<List> COMPLIANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceStatus").build();
    private static final MarshallingInfo<List> VERIFICATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerificationState").build();
    private static final MarshallingInfo<List> WORKFLOWSTATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkflowState").build();
    private static final MarshallingInfo<List> RECORDSTATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RecordState").build();
    private static final MarshallingInfo<List> RELATEDFINDINGSPRODUCTARN_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedFindingsProductArn").build();
    private static final MarshallingInfo<List> RELATEDFINDINGSID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedFindingsId").build();
    private static final MarshallingInfo<List> NOTETEXT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NoteText").build();
    private static final MarshallingInfo<List> NOTEUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NoteUpdatedAt").build();
    private static final MarshallingInfo<List> NOTEUPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NoteUpdatedBy").build();
    private static final MarshallingInfo<List> KEYWORD_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keyword").build();

    private static final AwsSecurityFindingFiltersMarshaller instance = new AwsSecurityFindingFiltersMarshaller();

    public static AwsSecurityFindingFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsSecurityFindingFilters awsSecurityFindingFilters, ProtocolMarshaller protocolMarshaller) {

        if (awsSecurityFindingFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsSecurityFindingFilters.getProductArn(), PRODUCTARN_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getId(), ID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getGeneratorId(), GENERATORID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getFirstObservedAt(), FIRSTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getLastObservedAt(), LASTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getSeverityProduct(), SEVERITYPRODUCT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getSeverityNormalized(), SEVERITYNORMALIZED_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getSeverityLabel(), SEVERITYLABEL_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getConfidence(), CONFIDENCE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getCriticality(), CRITICALITY_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getRecommendationText(), RECOMMENDATIONTEXT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getSourceUrl(), SOURCEURL_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getProductFields(), PRODUCTFIELDS_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getProductName(), PRODUCTNAME_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getCompanyName(), COMPANYNAME_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getUserDefinedFields(), USERDEFINEDFIELDS_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getMalwareName(), MALWARENAME_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getMalwareType(), MALWARETYPE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getMalwarePath(), MALWAREPATH_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getMalwareState(), MALWARESTATE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkDirection(), NETWORKDIRECTION_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkProtocol(), NETWORKPROTOCOL_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkSourceIpV4(), NETWORKSOURCEIPV4_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkSourceIpV6(), NETWORKSOURCEIPV6_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkSourcePort(), NETWORKSOURCEPORT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkSourceDomain(), NETWORKSOURCEDOMAIN_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkSourceMac(), NETWORKSOURCEMAC_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkDestinationIpV4(), NETWORKDESTINATIONIPV4_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkDestinationIpV6(), NETWORKDESTINATIONIPV6_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkDestinationPort(), NETWORKDESTINATIONPORT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNetworkDestinationDomain(), NETWORKDESTINATIONDOMAIN_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getProcessName(), PROCESSNAME_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getProcessPath(), PROCESSPATH_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getProcessPid(), PROCESSPID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getProcessParentPid(), PROCESSPARENTPID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getProcessLaunchedAt(), PROCESSLAUNCHEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getProcessTerminatedAt(), PROCESSTERMINATEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getThreatIntelIndicatorType(), THREATINTELINDICATORTYPE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getThreatIntelIndicatorValue(), THREATINTELINDICATORVALUE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getThreatIntelIndicatorCategory(), THREATINTELINDICATORCATEGORY_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getThreatIntelIndicatorLastObservedAt(), THREATINTELINDICATORLASTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getThreatIntelIndicatorSource(), THREATINTELINDICATORSOURCE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getThreatIntelIndicatorSourceUrl(), THREATINTELINDICATORSOURCEURL_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourcePartition(), RESOURCEPARTITION_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceRegion(), RESOURCEREGION_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceTags(), RESOURCETAGS_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsEc2InstanceType(), RESOURCEAWSEC2INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsEc2InstanceImageId(), RESOURCEAWSEC2INSTANCEIMAGEID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsEc2InstanceIpV4Addresses(), RESOURCEAWSEC2INSTANCEIPV4ADDRESSES_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsEc2InstanceIpV6Addresses(), RESOURCEAWSEC2INSTANCEIPV6ADDRESSES_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsEc2InstanceKeyName(), RESOURCEAWSEC2INSTANCEKEYNAME_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsEc2InstanceIamInstanceProfileArn(),
                    RESOURCEAWSEC2INSTANCEIAMINSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsEc2InstanceVpcId(), RESOURCEAWSEC2INSTANCEVPCID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsEc2InstanceSubnetId(), RESOURCEAWSEC2INSTANCESUBNETID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsEc2InstanceLaunchedAt(), RESOURCEAWSEC2INSTANCELAUNCHEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsS3BucketOwnerId(), RESOURCEAWSS3BUCKETOWNERID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsS3BucketOwnerName(), RESOURCEAWSS3BUCKETOWNERNAME_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsIamAccessKeyUserName(), RESOURCEAWSIAMACCESSKEYUSERNAME_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsIamAccessKeyStatus(), RESOURCEAWSIAMACCESSKEYSTATUS_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceAwsIamAccessKeyCreatedAt(), RESOURCEAWSIAMACCESSKEYCREATEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceContainerName(), RESOURCECONTAINERNAME_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceContainerImageId(), RESOURCECONTAINERIMAGEID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceContainerImageName(), RESOURCECONTAINERIMAGENAME_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceContainerLaunchedAt(), RESOURCECONTAINERLAUNCHEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getResourceDetailsOther(), RESOURCEDETAILSOTHER_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getComplianceStatus(), COMPLIANCESTATUS_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getVerificationState(), VERIFICATIONSTATE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getWorkflowState(), WORKFLOWSTATE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getRecordState(), RECORDSTATE_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getRelatedFindingsProductArn(), RELATEDFINDINGSPRODUCTARN_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getRelatedFindingsId(), RELATEDFINDINGSID_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNoteText(), NOTETEXT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNoteUpdatedAt(), NOTEUPDATEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getNoteUpdatedBy(), NOTEUPDATEDBY_BINDING);
            protocolMarshaller.marshall(awsSecurityFindingFilters.getKeyword(), KEYWORD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
