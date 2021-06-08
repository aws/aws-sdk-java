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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchPredictionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchPredictionMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureReason").build();
    private static final MarshallingInfo<String> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startTime").build();
    private static final MarshallingInfo<String> COMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completionTime").build();
    private static final MarshallingInfo<String> LASTHEARTBEATTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastHeartbeatTime").build();
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
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<Integer> PROCESSEDRECORDSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("processedRecordsCount").build();
    private static final MarshallingInfo<Integer> TOTALRECORDSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalRecordsCount").build();

    private static final BatchPredictionMarshaller instance = new BatchPredictionMarshaller();

    public static BatchPredictionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchPrediction batchPrediction, ProtocolMarshaller protocolMarshaller) {

        if (batchPrediction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchPrediction.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(batchPrediction.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(batchPrediction.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(batchPrediction.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(batchPrediction.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(batchPrediction.getLastHeartbeatTime(), LASTHEARTBEATTIME_BINDING);
            protocolMarshaller.marshall(batchPrediction.getInputPath(), INPUTPATH_BINDING);
            protocolMarshaller.marshall(batchPrediction.getOutputPath(), OUTPUTPATH_BINDING);
            protocolMarshaller.marshall(batchPrediction.getEventTypeName(), EVENTTYPENAME_BINDING);
            protocolMarshaller.marshall(batchPrediction.getDetectorName(), DETECTORNAME_BINDING);
            protocolMarshaller.marshall(batchPrediction.getDetectorVersion(), DETECTORVERSION_BINDING);
            protocolMarshaller.marshall(batchPrediction.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(batchPrediction.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(batchPrediction.getProcessedRecordsCount(), PROCESSEDRECORDSCOUNT_BINDING);
            protocolMarshaller.marshall(batchPrediction.getTotalRecordsCount(), TOTALRECORDSCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
