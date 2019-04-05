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
 * ApproveAssignmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApproveAssignmentRequestMarshaller {

    private static final MarshallingInfo<String> ASSIGNMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignmentId").build();
    private static final MarshallingInfo<String> REQUESTERFEEDBACK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequesterFeedback").build();
    private static final MarshallingInfo<Boolean> OVERRIDEREJECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverrideRejection").build();

    private static final ApproveAssignmentRequestMarshaller instance = new ApproveAssignmentRequestMarshaller();

    public static ApproveAssignmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApproveAssignmentRequest approveAssignmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (approveAssignmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(approveAssignmentRequest.getAssignmentId(), ASSIGNMENTID_BINDING);
            protocolMarshaller.marshall(approveAssignmentRequest.getRequesterFeedback(), REQUESTERFEEDBACK_BINDING);
            protocolMarshaller.marshall(approveAssignmentRequest.getOverrideRejection(), OVERRIDEREJECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
