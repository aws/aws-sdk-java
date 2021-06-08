/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssessmentEvidenceFolderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssessmentEvidenceFolderMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<java.util.Date> DATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("date").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ASSESSMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentId").build();
    private static final MarshallingInfo<String> CONTROLSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlSetId").build();
    private static final MarshallingInfo<String> CONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("controlId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSource").build();
    private static final MarshallingInfo<String> AUTHOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("author").build();
    private static final MarshallingInfo<Integer> TOTALEVIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalEvidence").build();
    private static final MarshallingInfo<Integer> ASSESSMENTREPORTSELECTIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentReportSelectionCount").build();
    private static final MarshallingInfo<String> CONTROLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlName").build();
    private static final MarshallingInfo<Integer> EVIDENCERESOURCESINCLUDEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceResourcesIncludedCount").build();
    private static final MarshallingInfo<Integer> EVIDENCEBYTYPECONFIGURATIONDATACOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceByTypeConfigurationDataCount").build();
    private static final MarshallingInfo<Integer> EVIDENCEBYTYPEMANUALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceByTypeManualCount").build();
    private static final MarshallingInfo<Integer> EVIDENCEBYTYPECOMPLIANCECHECKCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceByTypeComplianceCheckCount").build();
    private static final MarshallingInfo<Integer> EVIDENCEBYTYPECOMPLIANCECHECKISSUESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceByTypeComplianceCheckIssuesCount").build();
    private static final MarshallingInfo<Integer> EVIDENCEBYTYPEUSERACTIVITYCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceByTypeUserActivityCount").build();
    private static final MarshallingInfo<Integer> EVIDENCEAWSSERVICESOURCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceAwsServiceSourceCount").build();

    private static final AssessmentEvidenceFolderMarshaller instance = new AssessmentEvidenceFolderMarshaller();

    public static AssessmentEvidenceFolderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssessmentEvidenceFolder assessmentEvidenceFolder, ProtocolMarshaller protocolMarshaller) {

        if (assessmentEvidenceFolder == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assessmentEvidenceFolder.getName(), NAME_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getDate(), DATE_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getAssessmentId(), ASSESSMENTID_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getControlSetId(), CONTROLSETID_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getControlId(), CONTROLID_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getId(), ID_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getAuthor(), AUTHOR_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getTotalEvidence(), TOTALEVIDENCE_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getAssessmentReportSelectionCount(), ASSESSMENTREPORTSELECTIONCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getControlName(), CONTROLNAME_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getEvidenceResourcesIncludedCount(), EVIDENCERESOURCESINCLUDEDCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getEvidenceByTypeConfigurationDataCount(), EVIDENCEBYTYPECONFIGURATIONDATACOUNT_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getEvidenceByTypeManualCount(), EVIDENCEBYTYPEMANUALCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getEvidenceByTypeComplianceCheckCount(), EVIDENCEBYTYPECOMPLIANCECHECKCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getEvidenceByTypeComplianceCheckIssuesCount(),
                    EVIDENCEBYTYPECOMPLIANCECHECKISSUESCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getEvidenceByTypeUserActivityCount(), EVIDENCEBYTYPEUSERACTIVITYCOUNT_BINDING);
            protocolMarshaller.marshall(assessmentEvidenceFolder.getEvidenceAwsServiceSourceCount(), EVIDENCEAWSSERVICESOURCECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
