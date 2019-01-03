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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LabelingJobStoppingConditionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LabelingJobStoppingConditionsMarshaller {

    private static final MarshallingInfo<Integer> MAXHUMANLABELEDOBJECTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxHumanLabeledObjectCount").build();
    private static final MarshallingInfo<Integer> MAXPERCENTAGEOFINPUTDATASETLABELED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxPercentageOfInputDatasetLabeled").build();

    private static final LabelingJobStoppingConditionsMarshaller instance = new LabelingJobStoppingConditionsMarshaller();

    public static LabelingJobStoppingConditionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LabelingJobStoppingConditions labelingJobStoppingConditions, ProtocolMarshaller protocolMarshaller) {

        if (labelingJobStoppingConditions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(labelingJobStoppingConditions.getMaxHumanLabeledObjectCount(), MAXHUMANLABELEDOBJECTCOUNT_BINDING);
            protocolMarshaller.marshall(labelingJobStoppingConditions.getMaxPercentageOfInputDatasetLabeled(), MAXPERCENTAGEOFINPUTDATASETLABELED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
