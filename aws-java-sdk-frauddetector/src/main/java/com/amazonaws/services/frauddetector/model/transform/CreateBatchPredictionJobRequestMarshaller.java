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
package com.amazonaws.services.frauddetector.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBatchPredictionJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBatchPredictionJobRequestMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> INPUTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputPath").build();
    private static final MarshallingInfo<String> OUTPUTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputPath").build();
    private static final MarshallingInfo<String> EVENTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeName").build();
    private static final MarshallingInfo<String> DETECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorName").build();
    private static final MarshallingInfo<String> DETECTORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorVersion").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamRoleArn").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateBatchPredictionJobRequestMarshaller instance = new CreateBatchPredictionJobRequestMarshaller();

    public static CreateBatchPredictionJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBatchPredictionJobRequest createBatchPredictionJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBatchPredictionJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBatchPredictionJobRequest.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(createBatchPredictionJobRequest.getInputPath(), INPUTPATH_BINDING);
            protocolMarshaller.marshall(createBatchPredictionJobRequest.getOutputPath(), OUTPUTPATH_BINDING);
            protocolMarshaller.marshall(createBatchPredictionJobRequest.getEventTypeName(), EVENTTYPENAME_BINDING);
            protocolMarshaller.marshall(createBatchPredictionJobRequest.getDetectorName(), DETECTORNAME_BINDING);
            protocolMarshaller.marshall(createBatchPredictionJobRequest.getDetectorVersion(), DETECTORVERSION_BINDING);
            protocolMarshaller.marshall(createBatchPredictionJobRequest.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(createBatchPredictionJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
