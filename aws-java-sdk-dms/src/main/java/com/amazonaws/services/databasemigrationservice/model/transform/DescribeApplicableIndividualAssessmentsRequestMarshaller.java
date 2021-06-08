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
 * DescribeApplicableIndividualAssessmentsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeApplicableIndividualAssessmentsRequestMarshaller {

    private static final MarshallingInfo<String> REPLICATIONTASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskArn").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceArn").build();
    private static final MarshallingInfo<String> SOURCEENGINENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceEngineName").build();
    private static final MarshallingInfo<String> TARGETENGINENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetEngineName").build();
    private static final MarshallingInfo<String> MIGRATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationType").build();
    private static final MarshallingInfo<Integer> MAXRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRecords").build();
    private static final MarshallingInfo<String> MARKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Marker").build();

    private static final DescribeApplicableIndividualAssessmentsRequestMarshaller instance = new DescribeApplicableIndividualAssessmentsRequestMarshaller();

    public static DescribeApplicableIndividualAssessmentsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeApplicableIndividualAssessmentsRequest describeApplicableIndividualAssessmentsRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeApplicableIndividualAssessmentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeApplicableIndividualAssessmentsRequest.getReplicationTaskArn(), REPLICATIONTASKARN_BINDING);
            protocolMarshaller.marshall(describeApplicableIndividualAssessmentsRequest.getReplicationInstanceArn(), REPLICATIONINSTANCEARN_BINDING);
            protocolMarshaller.marshall(describeApplicableIndividualAssessmentsRequest.getSourceEngineName(), SOURCEENGINENAME_BINDING);
            protocolMarshaller.marshall(describeApplicableIndividualAssessmentsRequest.getTargetEngineName(), TARGETENGINENAME_BINDING);
            protocolMarshaller.marshall(describeApplicableIndividualAssessmentsRequest.getMigrationType(), MIGRATIONTYPE_BINDING);
            protocolMarshaller.marshall(describeApplicableIndividualAssessmentsRequest.getMaxRecords(), MAXRECORDS_BINDING);
            protocolMarshaller.marshall(describeApplicableIndividualAssessmentsRequest.getMarker(), MARKER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
