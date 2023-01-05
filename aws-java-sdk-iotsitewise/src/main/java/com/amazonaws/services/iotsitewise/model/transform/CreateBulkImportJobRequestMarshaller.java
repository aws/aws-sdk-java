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
package com.amazonaws.services.iotsitewise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBulkImportJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBulkImportJobRequestMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<String> JOBROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobRoleArn").build();
    private static final MarshallingInfo<List> FILES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("files").build();
    private static final MarshallingInfo<StructuredPojo> ERRORREPORTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorReportLocation").build();
    private static final MarshallingInfo<StructuredPojo> JOBCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobConfiguration").build();

    private static final CreateBulkImportJobRequestMarshaller instance = new CreateBulkImportJobRequestMarshaller();

    public static CreateBulkImportJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBulkImportJobRequest createBulkImportJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBulkImportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBulkImportJobRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(createBulkImportJobRequest.getJobRoleArn(), JOBROLEARN_BINDING);
            protocolMarshaller.marshall(createBulkImportJobRequest.getFiles(), FILES_BINDING);
            protocolMarshaller.marshall(createBulkImportJobRequest.getErrorReportLocation(), ERRORREPORTLOCATION_BINDING);
            protocolMarshaller.marshall(createBulkImportJobRequest.getJobConfiguration(), JOBCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
