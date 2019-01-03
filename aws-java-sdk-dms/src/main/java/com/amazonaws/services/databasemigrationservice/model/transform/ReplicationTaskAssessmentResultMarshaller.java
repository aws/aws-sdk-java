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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplicationTaskAssessmentResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationTaskAssessmentResultMarshaller {

    private static final MarshallingInfo<String> REPLICATIONTASKIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskIdentifier").build();
    private static final MarshallingInfo<String> REPLICATIONTASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskArn").build();
    private static final MarshallingInfo<java.util.Date> REPLICATIONTASKLASTASSESSMENTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskLastAssessmentDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ASSESSMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssessmentStatus").build();
    private static final MarshallingInfo<String> ASSESSMENTRESULTSFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssessmentResultsFile").build();
    private static final MarshallingInfo<String> ASSESSMENTRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssessmentResults").build();
    private static final MarshallingInfo<String> S3OBJECTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ObjectUrl").build();

    private static final ReplicationTaskAssessmentResultMarshaller instance = new ReplicationTaskAssessmentResultMarshaller();

    public static ReplicationTaskAssessmentResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationTaskAssessmentResult replicationTaskAssessmentResult, ProtocolMarshaller protocolMarshaller) {

        if (replicationTaskAssessmentResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationTaskAssessmentResult.getReplicationTaskIdentifier(), REPLICATIONTASKIDENTIFIER_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentResult.getReplicationTaskArn(), REPLICATIONTASKARN_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentResult.getReplicationTaskLastAssessmentDate(), REPLICATIONTASKLASTASSESSMENTDATE_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentResult.getAssessmentStatus(), ASSESSMENTSTATUS_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentResult.getAssessmentResultsFile(), ASSESSMENTRESULTSFILE_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentResult.getAssessmentResults(), ASSESSMENTRESULTS_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentResult.getS3ObjectUrl(), S3OBJECTURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
