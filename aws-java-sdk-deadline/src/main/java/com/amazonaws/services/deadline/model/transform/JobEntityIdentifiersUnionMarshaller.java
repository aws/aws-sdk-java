/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobEntityIdentifiersUnionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobEntityIdentifiersUnionMarshaller {

    private static final MarshallingInfo<StructuredPojo> ENVIRONMENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentDetails").build();
    private static final MarshallingInfo<StructuredPojo> JOBATTACHMENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobAttachmentDetails").build();
    private static final MarshallingInfo<StructuredPojo> JOBDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobDetails").build();
    private static final MarshallingInfo<StructuredPojo> STEPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepDetails").build();

    private static final JobEntityIdentifiersUnionMarshaller instance = new JobEntityIdentifiersUnionMarshaller();

    public static JobEntityIdentifiersUnionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobEntityIdentifiersUnion jobEntityIdentifiersUnion, ProtocolMarshaller protocolMarshaller) {

        if (jobEntityIdentifiersUnion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobEntityIdentifiersUnion.getEnvironmentDetails(), ENVIRONMENTDETAILS_BINDING);
            protocolMarshaller.marshall(jobEntityIdentifiersUnion.getJobAttachmentDetails(), JOBATTACHMENTDETAILS_BINDING);
            protocolMarshaller.marshall(jobEntityIdentifiersUnion.getJobDetails(), JOBDETAILS_BINDING);
            protocolMarshaller.marshall(jobEntityIdentifiersUnion.getStepDetails(), STEPDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
