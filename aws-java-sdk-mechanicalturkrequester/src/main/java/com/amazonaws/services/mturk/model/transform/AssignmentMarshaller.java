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
package com.amazonaws.services.mturk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mturk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssignmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssignmentMarshaller {

    private static final MarshallingInfo<String> ASSIGNMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignmentId").build();
    private static final MarshallingInfo<String> WORKERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkerId").build();
    private static final MarshallingInfo<String> HITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HITId").build();
    private static final MarshallingInfo<String> ASSIGNMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignmentStatus").build();
    private static final MarshallingInfo<java.util.Date> AUTOAPPROVALTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoApprovalTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ACCEPTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> SUBMITTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubmitTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> APPROVALTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovalTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REJECTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RejectionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DEADLINE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Deadline").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ANSWER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Answer").build();
    private static final MarshallingInfo<String> REQUESTERFEEDBACK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequesterFeedback").build();

    private static final AssignmentMarshaller instance = new AssignmentMarshaller();

    public static AssignmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Assignment assignment, ProtocolMarshaller protocolMarshaller) {

        if (assignment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assignment.getAssignmentId(), ASSIGNMENTID_BINDING);
            protocolMarshaller.marshall(assignment.getWorkerId(), WORKERID_BINDING);
            protocolMarshaller.marshall(assignment.getHITId(), HITID_BINDING);
            protocolMarshaller.marshall(assignment.getAssignmentStatus(), ASSIGNMENTSTATUS_BINDING);
            protocolMarshaller.marshall(assignment.getAutoApprovalTime(), AUTOAPPROVALTIME_BINDING);
            protocolMarshaller.marshall(assignment.getAcceptTime(), ACCEPTTIME_BINDING);
            protocolMarshaller.marshall(assignment.getSubmitTime(), SUBMITTIME_BINDING);
            protocolMarshaller.marshall(assignment.getApprovalTime(), APPROVALTIME_BINDING);
            protocolMarshaller.marshall(assignment.getRejectionTime(), REJECTIONTIME_BINDING);
            protocolMarshaller.marshall(assignment.getDeadline(), DEADLINE_BINDING);
            protocolMarshaller.marshall(assignment.getAnswer(), ANSWER_BINDING);
            protocolMarshaller.marshall(assignment.getRequesterFeedback(), REQUESTERFEEDBACK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
