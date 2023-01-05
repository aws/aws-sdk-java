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
package com.amazonaws.services.personalize.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBatchSegmentJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBatchSegmentJobRequestMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<String> SOLUTIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("solutionVersionArn").build();
    private static final MarshallingInfo<String> FILTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filterArn").build();
    private static final MarshallingInfo<Integer> NUMRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numResults").build();
    private static final MarshallingInfo<StructuredPojo> JOBINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobInput").build();
    private static final MarshallingInfo<StructuredPojo> JOBOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobOutput").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateBatchSegmentJobRequestMarshaller instance = new CreateBatchSegmentJobRequestMarshaller();

    public static CreateBatchSegmentJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBatchSegmentJobRequest createBatchSegmentJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBatchSegmentJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBatchSegmentJobRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(createBatchSegmentJobRequest.getSolutionVersionArn(), SOLUTIONVERSIONARN_BINDING);
            protocolMarshaller.marshall(createBatchSegmentJobRequest.getFilterArn(), FILTERARN_BINDING);
            protocolMarshaller.marshall(createBatchSegmentJobRequest.getNumResults(), NUMRESULTS_BINDING);
            protocolMarshaller.marshall(createBatchSegmentJobRequest.getJobInput(), JOBINPUT_BINDING);
            protocolMarshaller.marshall(createBatchSegmentJobRequest.getJobOutput(), JOBOUTPUT_BINDING);
            protocolMarshaller.marshall(createBatchSegmentJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createBatchSegmentJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
