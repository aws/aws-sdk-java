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
package com.amazonaws.services.auditmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InsightsByAssessmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InsightsByAssessmentMarshaller {

    private static final MarshallingInfo<Integer> NONCOMPLIANTEVIDENCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("noncompliantEvidenceCount").build();
    private static final MarshallingInfo<Integer> COMPLIANTEVIDENCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("compliantEvidenceCount").build();
    private static final MarshallingInfo<Integer> INCONCLUSIVEEVIDENCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inconclusiveEvidenceCount").build();
    private static final MarshallingInfo<Integer> ASSESSMENTCONTROLSCOUNTBYNONCOMPLIANTEVIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentControlsCountByNoncompliantEvidence").build();
    private static final MarshallingInfo<Integer> TOTALASSESSMENTCONTROLSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalAssessmentControlsCount").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdated").timestampFormat("unixTimestamp").build();

    private static final InsightsByAssessmentMarshaller instance = new InsightsByAssessmentMarshaller();

    public static InsightsByAssessmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InsightsByAssessment insightsByAssessment, ProtocolMarshaller protocolMarshaller) {

        if (insightsByAssessment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(insightsByAssessment.getNoncompliantEvidenceCount(), NONCOMPLIANTEVIDENCECOUNT_BINDING);
            protocolMarshaller.marshall(insightsByAssessment.getCompliantEvidenceCount(), COMPLIANTEVIDENCECOUNT_BINDING);
            protocolMarshaller.marshall(insightsByAssessment.getInconclusiveEvidenceCount(), INCONCLUSIVEEVIDENCECOUNT_BINDING);
            protocolMarshaller.marshall(insightsByAssessment.getAssessmentControlsCountByNoncompliantEvidence(),
                    ASSESSMENTCONTROLSCOUNTBYNONCOMPLIANTEVIDENCE_BINDING);
            protocolMarshaller.marshall(insightsByAssessment.getTotalAssessmentControlsCount(), TOTALASSESSMENTCONTROLSCOUNT_BINDING);
            protocolMarshaller.marshall(insightsByAssessment.getLastUpdated(), LASTUPDATED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
