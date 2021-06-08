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
 * AssessmentControlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssessmentControlMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> RESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("response").build();
    private static final MarshallingInfo<List> COMMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("comments").build();
    private static final MarshallingInfo<List> EVIDENCESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceSources").build();
    private static final MarshallingInfo<Integer> EVIDENCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceCount").build();
    private static final MarshallingInfo<Integer> ASSESSMENTREPORTEVIDENCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentReportEvidenceCount").build();

    private static final AssessmentControlMarshaller instance = new AssessmentControlMarshaller();

    public static AssessmentControlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssessmentControl assessmentControl, ProtocolMarshaller protocolMarshaller) {

        if (assessmentControl == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assessmentControl.getId(), ID_BINDING);
            protocolMarshaller.marshall(assessmentControl.getName(), NAME_BINDING);
            protocolMarshaller.marshall(assessmentControl.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(assessmentControl.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(assessmentControl.getResponse(), RESPONSE_BINDING);
            protocolMarshaller.marshall(assessmentControl.getComments(), COMMENTS_BINDING);
            protocolMarshaller.marshall(assessmentControl.getEvidenceSources(), EVIDENCESOURCES_BINDING);
            protocolMarshaller.marshall(assessmentControl.getEvidenceCount(), EVIDENCECOUNT_BINDING);
            protocolMarshaller.marshall(assessmentControl.getAssessmentReportEvidenceCount(), ASSESSMENTREPORTEVIDENCECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
