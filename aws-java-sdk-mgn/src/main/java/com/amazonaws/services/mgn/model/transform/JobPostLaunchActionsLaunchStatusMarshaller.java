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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobPostLaunchActionsLaunchStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobPostLaunchActionsLaunchStatusMarshaller {

    private static final MarshallingInfo<String> EXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionID").build();
    private static final MarshallingInfo<String> EXECUTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionStatus").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureReason").build();
    private static final MarshallingInfo<StructuredPojo> SSMDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ssmDocument").build();
    private static final MarshallingInfo<String> SSMDOCUMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ssmDocumentType").build();

    private static final JobPostLaunchActionsLaunchStatusMarshaller instance = new JobPostLaunchActionsLaunchStatusMarshaller();

    public static JobPostLaunchActionsLaunchStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobPostLaunchActionsLaunchStatus jobPostLaunchActionsLaunchStatus, ProtocolMarshaller protocolMarshaller) {

        if (jobPostLaunchActionsLaunchStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobPostLaunchActionsLaunchStatus.getExecutionID(), EXECUTIONID_BINDING);
            protocolMarshaller.marshall(jobPostLaunchActionsLaunchStatus.getExecutionStatus(), EXECUTIONSTATUS_BINDING);
            protocolMarshaller.marshall(jobPostLaunchActionsLaunchStatus.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(jobPostLaunchActionsLaunchStatus.getSsmDocument(), SSMDOCUMENT_BINDING);
            protocolMarshaller.marshall(jobPostLaunchActionsLaunchStatus.getSsmDocumentType(), SSMDOCUMENTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
