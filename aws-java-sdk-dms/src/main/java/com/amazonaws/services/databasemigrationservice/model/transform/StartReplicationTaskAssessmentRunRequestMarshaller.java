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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartReplicationTaskAssessmentRunRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartReplicationTaskAssessmentRunRequestMarshaller {

    private static final MarshallingInfo<String> REPLICATIONTASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskArn").build();
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
    private static final MarshallingInfo<List> INCLUDEONLY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IncludeOnly").build();
    private static final MarshallingInfo<List> EXCLUDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Exclude").build();

    private static final StartReplicationTaskAssessmentRunRequestMarshaller instance = new StartReplicationTaskAssessmentRunRequestMarshaller();

    public static StartReplicationTaskAssessmentRunRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartReplicationTaskAssessmentRunRequest startReplicationTaskAssessmentRunRequest, ProtocolMarshaller protocolMarshaller) {

        if (startReplicationTaskAssessmentRunRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startReplicationTaskAssessmentRunRequest.getReplicationTaskArn(), REPLICATIONTASKARN_BINDING);
            protocolMarshaller.marshall(startReplicationTaskAssessmentRunRequest.getServiceAccessRoleArn(), SERVICEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(startReplicationTaskAssessmentRunRequest.getResultLocationBucket(), RESULTLOCATIONBUCKET_BINDING);
            protocolMarshaller.marshall(startReplicationTaskAssessmentRunRequest.getResultLocationFolder(), RESULTLOCATIONFOLDER_BINDING);
            protocolMarshaller.marshall(startReplicationTaskAssessmentRunRequest.getResultEncryptionMode(), RESULTENCRYPTIONMODE_BINDING);
            protocolMarshaller.marshall(startReplicationTaskAssessmentRunRequest.getResultKmsKeyArn(), RESULTKMSKEYARN_BINDING);
            protocolMarshaller.marshall(startReplicationTaskAssessmentRunRequest.getAssessmentRunName(), ASSESSMENTRUNNAME_BINDING);
            protocolMarshaller.marshall(startReplicationTaskAssessmentRunRequest.getIncludeOnly(), INCLUDEONLY_BINDING);
            protocolMarshaller.marshall(startReplicationTaskAssessmentRunRequest.getExclude(), EXCLUDE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
