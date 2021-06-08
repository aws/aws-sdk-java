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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransformJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransformJobMarshaller {

    private static final MarshallingInfo<String> TRANSFORMJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformJobName").build();
    private static final MarshallingInfo<String> TRANSFORMJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformJobArn").build();
    private static final MarshallingInfo<String> TRANSFORMJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformJobStatus").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<Integer> MAXCONCURRENTTRANSFORMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrentTransforms").build();
    private static final MarshallingInfo<StructuredPojo> MODELCLIENTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelClientConfig").build();
    private static final MarshallingInfo<Integer> MAXPAYLOADINMB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxPayloadInMB").build();
    private static final MarshallingInfo<String> BATCHSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchStrategy").build();
    private static final MarshallingInfo<Map> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFORMINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformInput").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFORMOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformOutput").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFORMRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformResources").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TRANSFORMSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TRANSFORMENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LABELINGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingJobArn").build();
    private static final MarshallingInfo<String> AUTOMLJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMLJobArn").build();
    private static final MarshallingInfo<StructuredPojo> DATAPROCESSING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataProcessing").build();
    private static final MarshallingInfo<StructuredPojo> EXPERIMENTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExperimentConfig").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final TransformJobMarshaller instance = new TransformJobMarshaller();

    public static TransformJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransformJob transformJob, ProtocolMarshaller protocolMarshaller) {

        if (transformJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transformJob.getTransformJobName(), TRANSFORMJOBNAME_BINDING);
            protocolMarshaller.marshall(transformJob.getTransformJobArn(), TRANSFORMJOBARN_BINDING);
            protocolMarshaller.marshall(transformJob.getTransformJobStatus(), TRANSFORMJOBSTATUS_BINDING);
            protocolMarshaller.marshall(transformJob.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(transformJob.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(transformJob.getMaxConcurrentTransforms(), MAXCONCURRENTTRANSFORMS_BINDING);
            protocolMarshaller.marshall(transformJob.getModelClientConfig(), MODELCLIENTCONFIG_BINDING);
            protocolMarshaller.marshall(transformJob.getMaxPayloadInMB(), MAXPAYLOADINMB_BINDING);
            protocolMarshaller.marshall(transformJob.getBatchStrategy(), BATCHSTRATEGY_BINDING);
            protocolMarshaller.marshall(transformJob.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(transformJob.getTransformInput(), TRANSFORMINPUT_BINDING);
            protocolMarshaller.marshall(transformJob.getTransformOutput(), TRANSFORMOUTPUT_BINDING);
            protocolMarshaller.marshall(transformJob.getTransformResources(), TRANSFORMRESOURCES_BINDING);
            protocolMarshaller.marshall(transformJob.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(transformJob.getTransformStartTime(), TRANSFORMSTARTTIME_BINDING);
            protocolMarshaller.marshall(transformJob.getTransformEndTime(), TRANSFORMENDTIME_BINDING);
            protocolMarshaller.marshall(transformJob.getLabelingJobArn(), LABELINGJOBARN_BINDING);
            protocolMarshaller.marshall(transformJob.getAutoMLJobArn(), AUTOMLJOBARN_BINDING);
            protocolMarshaller.marshall(transformJob.getDataProcessing(), DATAPROCESSING_BINDING);
            protocolMarshaller.marshall(transformJob.getExperimentConfig(), EXPERIMENTCONFIG_BINDING);
            protocolMarshaller.marshall(transformJob.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
