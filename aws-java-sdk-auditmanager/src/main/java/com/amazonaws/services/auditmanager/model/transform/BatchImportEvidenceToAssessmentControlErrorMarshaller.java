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
 * BatchImportEvidenceToAssessmentControlErrorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchImportEvidenceToAssessmentControlErrorMarshaller {

    private static final MarshallingInfo<StructuredPojo> MANUALEVIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manualEvidence").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("errorCode").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorMessage").build();

    private static final BatchImportEvidenceToAssessmentControlErrorMarshaller instance = new BatchImportEvidenceToAssessmentControlErrorMarshaller();

    public static BatchImportEvidenceToAssessmentControlErrorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchImportEvidenceToAssessmentControlError batchImportEvidenceToAssessmentControlError, ProtocolMarshaller protocolMarshaller) {

        if (batchImportEvidenceToAssessmentControlError == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchImportEvidenceToAssessmentControlError.getManualEvidence(), MANUALEVIDENCE_BINDING);
            protocolMarshaller.marshall(batchImportEvidenceToAssessmentControlError.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(batchImportEvidenceToAssessmentControlError.getErrorMessage(), ERRORMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
