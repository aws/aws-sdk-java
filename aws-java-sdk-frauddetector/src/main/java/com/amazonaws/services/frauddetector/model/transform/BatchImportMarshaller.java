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
package com.amazonaws.services.frauddetector.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchImportMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchImportMarshaller {

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
    private static final MarshallingInfo<String> INPUTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputPath").build();
    private static final MarshallingInfo<String> OUTPUTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputPath").build();
    private static final MarshallingInfo<String> EVENTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeName").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamRoleArn").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<Integer> PROCESSEDRECORDSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("processedRecordsCount").build();
    private static final MarshallingInfo<Integer> FAILEDRECORDSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedRecordsCount").build();
    private static final MarshallingInfo<Integer> TOTALRECORDSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalRecordsCount").build();

    private static final BatchImportMarshaller instance = new BatchImportMarshaller();

    public static BatchImportMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchImport batchImport, ProtocolMarshaller protocolMarshaller) {

        if (batchImport == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchImport.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(batchImport.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(batchImport.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(batchImport.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(batchImport.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(batchImport.getInputPath(), INPUTPATH_BINDING);
            protocolMarshaller.marshall(batchImport.getOutputPath(), OUTPUTPATH_BINDING);
            protocolMarshaller.marshall(batchImport.getEventTypeName(), EVENTTYPENAME_BINDING);
            protocolMarshaller.marshall(batchImport.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(batchImport.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(batchImport.getProcessedRecordsCount(), PROCESSEDRECORDSCOUNT_BINDING);
            protocolMarshaller.marshall(batchImport.getFailedRecordsCount(), FAILEDRECORDSCOUNT_BINDING);
            protocolMarshaller.marshall(batchImport.getTotalRecordsCount(), TOTALRECORDSCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
