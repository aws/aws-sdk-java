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
 * ReplicationTaskIndividualAssessmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationTaskIndividualAssessmentMarshaller {

    private static final MarshallingInfo<String> REPLICATIONTASKINDIVIDUALASSESSMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskIndividualAssessmentArn").build();
    private static final MarshallingInfo<String> REPLICATIONTASKASSESSMENTRUNARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskAssessmentRunArn").build();
    private static final MarshallingInfo<String> INDIVIDUALASSESSMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndividualAssessmentName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> REPLICATIONTASKINDIVIDUALASSESSMENTSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskIndividualAssessmentStartDate").timestampFormat("unixTimestamp")
            .build();

    private static final ReplicationTaskIndividualAssessmentMarshaller instance = new ReplicationTaskIndividualAssessmentMarshaller();

    public static ReplicationTaskIndividualAssessmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationTaskIndividualAssessment replicationTaskIndividualAssessment, ProtocolMarshaller protocolMarshaller) {

        if (replicationTaskIndividualAssessment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationTaskIndividualAssessment.getReplicationTaskIndividualAssessmentArn(),
                    REPLICATIONTASKINDIVIDUALASSESSMENTARN_BINDING);
            protocolMarshaller.marshall(replicationTaskIndividualAssessment.getReplicationTaskAssessmentRunArn(), REPLICATIONTASKASSESSMENTRUNARN_BINDING);
            protocolMarshaller.marshall(replicationTaskIndividualAssessment.getIndividualAssessmentName(), INDIVIDUALASSESSMENTNAME_BINDING);
            protocolMarshaller.marshall(replicationTaskIndividualAssessment.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(replicationTaskIndividualAssessment.getReplicationTaskIndividualAssessmentStartDate(),
                    REPLICATIONTASKINDIVIDUALASSESSMENTSTARTDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
