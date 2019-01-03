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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportJobResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportJobResponseMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<Integer> COMPLETEDPIECES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedPieces").build();
    private static final MarshallingInfo<String> COMPLETIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionDate").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<StructuredPojo> DEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Definition").build();
    private static final MarshallingInfo<Integer> FAILEDPIECES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailedPieces").build();
    private static final MarshallingInfo<List> FAILURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Failures").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> JOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobStatus").build();
    private static final MarshallingInfo<Integer> TOTALFAILURES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalFailures").build();
    private static final MarshallingInfo<Integer> TOTALPIECES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalPieces").build();
    private static final MarshallingInfo<Integer> TOTALPROCESSED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalProcessed").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final ExportJobResponseMarshaller instance = new ExportJobResponseMarshaller();

    public static ExportJobResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportJobResponse exportJobResponse, ProtocolMarshaller protocolMarshaller) {

        if (exportJobResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportJobResponse.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getCompletedPieces(), COMPLETEDPIECES_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getCompletionDate(), COMPLETIONDATE_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getDefinition(), DEFINITION_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getFailedPieces(), FAILEDPIECES_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getFailures(), FAILURES_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getId(), ID_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getJobStatus(), JOBSTATUS_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getTotalFailures(), TOTALFAILURES_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getTotalPieces(), TOTALPIECES_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getTotalProcessed(), TOTALPROCESSED_BINDING);
            protocolMarshaller.marshall(exportJobResponse.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
