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
package com.amazonaws.services.pipes.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipeTargetBatchJobParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipeTargetBatchJobParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> ARRAYPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArrayProperties").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINEROVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerOverrides").build();
    private static final MarshallingInfo<List> DEPENDSON_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DependsOn").build();
    private static final MarshallingInfo<String> JOBDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobDefinition").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<StructuredPojo> RETRYSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryStrategy").build();

    private static final PipeTargetBatchJobParametersMarshaller instance = new PipeTargetBatchJobParametersMarshaller();

    public static PipeTargetBatchJobParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipeTargetBatchJobParameters pipeTargetBatchJobParameters, ProtocolMarshaller protocolMarshaller) {

        if (pipeTargetBatchJobParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipeTargetBatchJobParameters.getArrayProperties(), ARRAYPROPERTIES_BINDING);
            protocolMarshaller.marshall(pipeTargetBatchJobParameters.getContainerOverrides(), CONTAINEROVERRIDES_BINDING);
            protocolMarshaller.marshall(pipeTargetBatchJobParameters.getDependsOn(), DEPENDSON_BINDING);
            protocolMarshaller.marshall(pipeTargetBatchJobParameters.getJobDefinition(), JOBDEFINITION_BINDING);
            protocolMarshaller.marshall(pipeTargetBatchJobParameters.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(pipeTargetBatchJobParameters.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetBatchJobParameters.getRetryStrategy(), RETRYSTRATEGY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
