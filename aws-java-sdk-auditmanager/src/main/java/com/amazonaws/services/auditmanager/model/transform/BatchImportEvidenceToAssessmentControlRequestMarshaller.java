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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchImportEvidenceToAssessmentControlRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchImportEvidenceToAssessmentControlRequestMarshaller {

    private static final MarshallingInfo<String> ASSESSMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("assessmentId").build();
    private static final MarshallingInfo<String> CONTROLSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("controlSetId").build();
    private static final MarshallingInfo<String> CONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("controlId").build();
    private static final MarshallingInfo<List> MANUALEVIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manualEvidence").build();

    private static final BatchImportEvidenceToAssessmentControlRequestMarshaller instance = new BatchImportEvidenceToAssessmentControlRequestMarshaller();

    public static BatchImportEvidenceToAssessmentControlRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchImportEvidenceToAssessmentControlRequest batchImportEvidenceToAssessmentControlRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchImportEvidenceToAssessmentControlRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchImportEvidenceToAssessmentControlRequest.getAssessmentId(), ASSESSMENTID_BINDING);
            protocolMarshaller.marshall(batchImportEvidenceToAssessmentControlRequest.getControlSetId(), CONTROLSETID_BINDING);
            protocolMarshaller.marshall(batchImportEvidenceToAssessmentControlRequest.getControlId(), CONTROLID_BINDING);
            protocolMarshaller.marshall(batchImportEvidenceToAssessmentControlRequest.getManualEvidence(), MANUALEVIDENCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
