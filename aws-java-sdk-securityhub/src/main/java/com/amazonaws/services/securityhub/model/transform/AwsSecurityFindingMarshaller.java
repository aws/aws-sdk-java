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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsSecurityFindingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsSecurityFindingMarshaller {

    private static final MarshallingInfo<String> SCHEMAVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaVersion").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> PRODUCTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductArn").build();
    private static final MarshallingInfo<String> GENERATORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeneratorId").build();
    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<List> TYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Types").build();
    private static final MarshallingInfo<String> FIRSTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirstObservedAt").build();
    private static final MarshallingInfo<String> LASTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastObservedAt").build();
    private static final MarshallingInfo<String> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedAt").build();
    private static final MarshallingInfo<String> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UpdatedAt").build();
    private static final MarshallingInfo<StructuredPojo> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Severity").build();
    private static final MarshallingInfo<Integer> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Confidence").build();
    private static final MarshallingInfo<Integer> CRITICALITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Criticality").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> REMEDIATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Remediation").build();
    private static final MarshallingInfo<String> SOURCEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceUrl").build();
    private static final MarshallingInfo<Map> PRODUCTFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductFields").build();
    private static final MarshallingInfo<Map> USERDEFINEDFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserDefinedFields").build();
    private static final MarshallingInfo<List> MALWARE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Malware").build();
    private static final MarshallingInfo<StructuredPojo> NETWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Network").build();
    private static final MarshallingInfo<StructuredPojo> PROCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Process").build();
    private static final MarshallingInfo<List> THREATINTELINDICATORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreatIntelIndicators").build();
    private static final MarshallingInfo<List> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Resources").build();
    private static final MarshallingInfo<StructuredPojo> COMPLIANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Compliance").build();
    private static final MarshallingInfo<String> VERIFICATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerificationState").build();
    private static final MarshallingInfo<String> WORKFLOWSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkflowState").build();
    private static final MarshallingInfo<String> RECORDSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordState").build();
    private static final MarshallingInfo<List> RELATEDFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedFindings").build();
    private static final MarshallingInfo<StructuredPojo> NOTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Note").build();

    private static final AwsSecurityFindingMarshaller instance = new AwsSecurityFindingMarshaller();

    public static AwsSecurityFindingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsSecurityFinding awsSecurityFinding, ProtocolMarshaller protocolMarshaller) {

        if (awsSecurityFinding == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsSecurityFinding.getSchemaVersion(), SCHEMAVERSION_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getId(), ID_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getProductArn(), PRODUCTARN_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getGeneratorId(), GENERATORID_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getTypes(), TYPES_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getFirstObservedAt(), FIRSTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getLastObservedAt(), LASTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getConfidence(), CONFIDENCE_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getCriticality(), CRITICALITY_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getRemediation(), REMEDIATION_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getSourceUrl(), SOURCEURL_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getProductFields(), PRODUCTFIELDS_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getUserDefinedFields(), USERDEFINEDFIELDS_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getMalware(), MALWARE_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getNetwork(), NETWORK_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getProcess(), PROCESS_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getThreatIntelIndicators(), THREATINTELINDICATORS_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getResources(), RESOURCES_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getCompliance(), COMPLIANCE_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getVerificationState(), VERIFICATIONSTATE_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getWorkflowState(), WORKFLOWSTATE_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getRecordState(), RECORDSTATE_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getRelatedFindings(), RELATEDFINDINGS_BINDING);
            protocolMarshaller.marshall(awsSecurityFinding.getNote(), NOTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
