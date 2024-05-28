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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobDetailsEntityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobDetailsEntityMarshaller {

    private static final MarshallingInfo<StructuredPojo> JOBATTACHMENTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobAttachmentSettings").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<StructuredPojo> JOBRUNASUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobRunAsUser").build();
    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupName").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("parameters").build();
    private static final MarshallingInfo<List> PATHMAPPINGRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pathMappingRules").build();
    private static final MarshallingInfo<String> QUEUEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queueRoleArn").build();
    private static final MarshallingInfo<String> SCHEMAVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schemaVersion").build();

    private static final JobDetailsEntityMarshaller instance = new JobDetailsEntityMarshaller();

    public static JobDetailsEntityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobDetailsEntity jobDetailsEntity, ProtocolMarshaller protocolMarshaller) {

        if (jobDetailsEntity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobDetailsEntity.getJobAttachmentSettings(), JOBATTACHMENTSETTINGS_BINDING);
            protocolMarshaller.marshall(jobDetailsEntity.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(jobDetailsEntity.getJobRunAsUser(), JOBRUNASUSER_BINDING);
            protocolMarshaller.marshall(jobDetailsEntity.getLogGroupName(), LOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(jobDetailsEntity.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(jobDetailsEntity.getPathMappingRules(), PATHMAPPINGRULES_BINDING);
            protocolMarshaller.marshall(jobDetailsEntity.getQueueRoleArn(), QUEUEROLEARN_BINDING);
            protocolMarshaller.marshall(jobDetailsEntity.getSchemaVersion(), SCHEMAVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
