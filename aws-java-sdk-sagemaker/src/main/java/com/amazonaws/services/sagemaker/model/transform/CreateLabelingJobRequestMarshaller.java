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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLabelingJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLabelingJobRequestMarshaller {

    private static final MarshallingInfo<String> LABELINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingJobName").build();
    private static final MarshallingInfo<String> LABELATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelAttributeName").build();
    private static final MarshallingInfo<StructuredPojo> INPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputConfig").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputConfig").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> LABELCATEGORYCONFIGS3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelCategoryConfigS3Uri").build();
    private static final MarshallingInfo<StructuredPojo> STOPPINGCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StoppingConditions").build();
    private static final MarshallingInfo<StructuredPojo> LABELINGJOBALGORITHMSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingJobAlgorithmsConfig").build();
    private static final MarshallingInfo<StructuredPojo> HUMANTASKCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanTaskConfig").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateLabelingJobRequestMarshaller instance = new CreateLabelingJobRequestMarshaller();

    public static CreateLabelingJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLabelingJobRequest createLabelingJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLabelingJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLabelingJobRequest.getLabelingJobName(), LABELINGJOBNAME_BINDING);
            protocolMarshaller.marshall(createLabelingJobRequest.getLabelAttributeName(), LABELATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(createLabelingJobRequest.getInputConfig(), INPUTCONFIG_BINDING);
            protocolMarshaller.marshall(createLabelingJobRequest.getOutputConfig(), OUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(createLabelingJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createLabelingJobRequest.getLabelCategoryConfigS3Uri(), LABELCATEGORYCONFIGS3URI_BINDING);
            protocolMarshaller.marshall(createLabelingJobRequest.getStoppingConditions(), STOPPINGCONDITIONS_BINDING);
            protocolMarshaller.marshall(createLabelingJobRequest.getLabelingJobAlgorithmsConfig(), LABELINGJOBALGORITHMSCONFIG_BINDING);
            protocolMarshaller.marshall(createLabelingJobRequest.getHumanTaskConfig(), HUMANTASKCONFIG_BINDING);
            protocolMarshaller.marshall(createLabelingJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
