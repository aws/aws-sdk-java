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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutomationRulesFindingFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutomationRulesFindingFiltersMarshaller {

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
    private static final MarshallingInfo<List> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Confidence").build();
    private static final MarshallingInfo<List> CRITICALITY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Criticality").build();
    private static final MarshallingInfo<List> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<List> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Description").build();
    private static final MarshallingInfo<List> SOURCEURL_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceUrl").build();
    private static final MarshallingInfo<List> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductName").build();
    private static final MarshallingInfo<List> COMPANYNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CompanyName").build();
    private static final MarshallingInfo<List> SEVERITYLABEL_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SeverityLabel").build();
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
    private static final MarshallingInfo<List> RESOURCEDETAILSOTHER_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceDetailsOther").build();
    private static final MarshallingInfo<List> COMPLIANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceStatus").build();
    private static final MarshallingInfo<List> COMPLIANCESECURITYCONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceSecurityControlId").build();
    private static final MarshallingInfo<List> COMPLIANCEASSOCIATEDSTANDARDSID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceAssociatedStandardsId").build();
    private static final MarshallingInfo<List> VERIFICATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerificationState").build();
    private static final MarshallingInfo<List> WORKFLOWSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkflowStatus").build();
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
    private static final MarshallingInfo<List> USERDEFINEDFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserDefinedFields").build();
    private static final MarshallingInfo<List> RESOURCEAPPLICATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceApplicationArn").build();
    private static final MarshallingInfo<List> RESOURCEAPPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceApplicationName").build();
    private static final MarshallingInfo<List> AWSACCOUNTNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsAccountName").build();

    private static final AutomationRulesFindingFiltersMarshaller instance = new AutomationRulesFindingFiltersMarshaller();

    public static AutomationRulesFindingFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutomationRulesFindingFilters automationRulesFindingFilters, ProtocolMarshaller protocolMarshaller) {

        if (automationRulesFindingFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(automationRulesFindingFilters.getProductArn(), PRODUCTARN_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getId(), ID_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getGeneratorId(), GENERATORID_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getFirstObservedAt(), FIRSTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getLastObservedAt(), LASTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getConfidence(), CONFIDENCE_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getCriticality(), CRITICALITY_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getSourceUrl(), SOURCEURL_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getProductName(), PRODUCTNAME_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getCompanyName(), COMPANYNAME_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getSeverityLabel(), SEVERITYLABEL_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getResourcePartition(), RESOURCEPARTITION_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getResourceRegion(), RESOURCEREGION_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getResourceTags(), RESOURCETAGS_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getResourceDetailsOther(), RESOURCEDETAILSOTHER_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getComplianceStatus(), COMPLIANCESTATUS_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getComplianceSecurityControlId(), COMPLIANCESECURITYCONTROLID_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getComplianceAssociatedStandardsId(), COMPLIANCEASSOCIATEDSTANDARDSID_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getVerificationState(), VERIFICATIONSTATE_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getWorkflowStatus(), WORKFLOWSTATUS_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getRecordState(), RECORDSTATE_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getRelatedFindingsProductArn(), RELATEDFINDINGSPRODUCTARN_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getRelatedFindingsId(), RELATEDFINDINGSID_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getNoteText(), NOTETEXT_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getNoteUpdatedAt(), NOTEUPDATEDAT_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getNoteUpdatedBy(), NOTEUPDATEDBY_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getUserDefinedFields(), USERDEFINEDFIELDS_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getResourceApplicationArn(), RESOURCEAPPLICATIONARN_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getResourceApplicationName(), RESOURCEAPPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(automationRulesFindingFilters.getAwsAccountName(), AWSACCOUNTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
