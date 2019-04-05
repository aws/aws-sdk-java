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
package com.amazonaws.services.codepipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutJobSuccessResultRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutJobSuccessResultRequestMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentRevision").build();
    private static final MarshallingInfo<String> CONTINUATIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("continuationToken").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionDetails").build();

    private static final PutJobSuccessResultRequestMarshaller instance = new PutJobSuccessResultRequestMarshaller();

    public static PutJobSuccessResultRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutJobSuccessResultRequest putJobSuccessResultRequest, ProtocolMarshaller protocolMarshaller) {

        if (putJobSuccessResultRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putJobSuccessResultRequest.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(putJobSuccessResultRequest.getCurrentRevision(), CURRENTREVISION_BINDING);
            protocolMarshaller.marshall(putJobSuccessResultRequest.getContinuationToken(), CONTINUATIONTOKEN_BINDING);
            protocolMarshaller.marshall(putJobSuccessResultRequest.getExecutionDetails(), EXECUTIONDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
