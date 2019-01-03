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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FlinkApplicationConfigurationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FlinkApplicationConfigurationDescriptionMarshaller {

    private static final MarshallingInfo<StructuredPojo> CHECKPOINTCONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CheckpointConfigurationDescription").build();
    private static final MarshallingInfo<StructuredPojo> MONITORINGCONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringConfigurationDescription").build();
    private static final MarshallingInfo<StructuredPojo> PARALLELISMCONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelismConfigurationDescription").build();
    private static final MarshallingInfo<String> JOBPLANDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobPlanDescription").build();

    private static final FlinkApplicationConfigurationDescriptionMarshaller instance = new FlinkApplicationConfigurationDescriptionMarshaller();

    public static FlinkApplicationConfigurationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FlinkApplicationConfigurationDescription flinkApplicationConfigurationDescription, ProtocolMarshaller protocolMarshaller) {

        if (flinkApplicationConfigurationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(flinkApplicationConfigurationDescription.getCheckpointConfigurationDescription(),
                    CHECKPOINTCONFIGURATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(flinkApplicationConfigurationDescription.getMonitoringConfigurationDescription(),
                    MONITORINGCONFIGURATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(flinkApplicationConfigurationDescription.getParallelismConfigurationDescription(),
                    PARALLELISMCONFIGURATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(flinkApplicationConfigurationDescription.getJobPlanDescription(), JOBPLANDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
