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
package com.amazonaws.services.bedrock.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelCustomizationJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelCustomizationJobSummaryMarshaller {

    private static final MarshallingInfo<String> JOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobArn").build();
    private static final MarshallingInfo<String> BASEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseModelArn").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CUSTOMMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customModelArn").build();
    private static final MarshallingInfo<String> CUSTOMMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customModelName").build();
    private static final MarshallingInfo<String> CUSTOMIZATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customizationType").build();

    private static final ModelCustomizationJobSummaryMarshaller instance = new ModelCustomizationJobSummaryMarshaller();

    public static ModelCustomizationJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelCustomizationJobSummary modelCustomizationJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (modelCustomizationJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelCustomizationJobSummary.getJobArn(), JOBARN_BINDING);
            protocolMarshaller.marshall(modelCustomizationJobSummary.getBaseModelArn(), BASEMODELARN_BINDING);
            protocolMarshaller.marshall(modelCustomizationJobSummary.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(modelCustomizationJobSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(modelCustomizationJobSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(modelCustomizationJobSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(modelCustomizationJobSummary.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(modelCustomizationJobSummary.getCustomModelArn(), CUSTOMMODELARN_BINDING);
            protocolMarshaller.marshall(modelCustomizationJobSummary.getCustomModelName(), CUSTOMMODELNAME_BINDING);
            protocolMarshaller.marshall(modelCustomizationJobSummary.getCustomizationType(), CUSTOMIZATIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
