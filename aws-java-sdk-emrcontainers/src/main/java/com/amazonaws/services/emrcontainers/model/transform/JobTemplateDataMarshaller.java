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
package com.amazonaws.services.emrcontainers.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrcontainers.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobTemplateDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobTemplateDataMarshaller {

    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRoleArn").build();
    private static final MarshallingInfo<String> RELEASELABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseLabel").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATIONOVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationOverrides").build();
    private static final MarshallingInfo<StructuredPojo> JOBDRIVER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobDriver").build();
    private static final MarshallingInfo<Map> PARAMETERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameterConfiguration").build();
    private static final MarshallingInfo<Map> JOBTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobTags").build();

    private static final JobTemplateDataMarshaller instance = new JobTemplateDataMarshaller();

    public static JobTemplateDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobTemplateData jobTemplateData, ProtocolMarshaller protocolMarshaller) {

        if (jobTemplateData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobTemplateData.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(jobTemplateData.getReleaseLabel(), RELEASELABEL_BINDING);
            protocolMarshaller.marshall(jobTemplateData.getConfigurationOverrides(), CONFIGURATIONOVERRIDES_BINDING);
            protocolMarshaller.marshall(jobTemplateData.getJobDriver(), JOBDRIVER_BINDING);
            protocolMarshaller.marshall(jobTemplateData.getParameterConfiguration(), PARAMETERCONFIGURATION_BINDING);
            protocolMarshaller.marshall(jobTemplateData.getJobTags(), JOBTAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
