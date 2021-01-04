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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplicationTaskAssessmentRunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationTaskAssessmentRunMarshaller {

    private static final MarshallingInfo<String> REPLICATIONTASKASSESSMENTRUNARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskAssessmentRunArn").build();
    private static final MarshallingInfo<String> REPLICATIONTASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> REPLICATIONTASKASSESSMENTRUNCREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskAssessmentRunCreationDate").timestampFormat("unixTimestamp")
            .build();
    private static final MarshallingInfo<StructuredPojo> ASSESSMENTPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssessmentProgress").build();
    private static final MarshallingInfo<String> LASTFAILUREMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastFailureMessage").build();
    private static final MarshallingInfo<String> SERVICEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessRoleArn").build();
    private static final MarshallingInfo<String> RESULTLOCATIONBUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultLocationBucket").build();
    private static final MarshallingInfo<String> RESULTLOCATIONFOLDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultLocationFolder").build();
    private static final MarshallingInfo<String> RESULTENCRYPTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultEncryptionMode").build();
    private static final MarshallingInfo<String> RESULTKMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultKmsKeyArn").build();
    private static final MarshallingInfo<String> ASSESSMENTRUNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssessmentRunName").build();

    private static final ReplicationTaskAssessmentRunMarshaller instance = new ReplicationTaskAssessmentRunMarshaller();

    public static ReplicationTaskAssessmentRunMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationTaskAssessmentRun replicationTaskAssessmentRun, ProtocolMarshaller protocolMarshaller) {

        if (replicationTaskAssessmentRun == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getReplicationTaskAssessmentRunArn(), REPLICATIONTASKASSESSMENTRUNARN_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getReplicationTaskArn(), REPLICATIONTASKARN_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getReplicationTaskAssessmentRunCreationDate(),
                    REPLICATIONTASKASSESSMENTRUNCREATIONDATE_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getAssessmentProgress(), ASSESSMENTPROGRESS_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getLastFailureMessage(), LASTFAILUREMESSAGE_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getServiceAccessRoleArn(), SERVICEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getResultLocationBucket(), RESULTLOCATIONBUCKET_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getResultLocationFolder(), RESULTLOCATIONFOLDER_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getResultEncryptionMode(), RESULTENCRYPTIONMODE_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getResultKmsKeyArn(), RESULTKMSKEYARN_BINDING);
            protocolMarshaller.marshall(replicationTaskAssessmentRun.getAssessmentRunName(), ASSESSMENTRUNNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
