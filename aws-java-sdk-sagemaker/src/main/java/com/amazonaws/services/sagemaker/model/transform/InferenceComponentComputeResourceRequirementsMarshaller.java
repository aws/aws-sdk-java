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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InferenceComponentComputeResourceRequirementsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InferenceComponentComputeResourceRequirementsMarshaller {

    private static final MarshallingInfo<Float> NUMBEROFCPUCORESREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfCpuCoresRequired").build();
    private static final MarshallingInfo<Float> NUMBEROFACCELERATORDEVICESREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfAcceleratorDevicesRequired").build();
    private static final MarshallingInfo<Integer> MINMEMORYREQUIREDINMB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinMemoryRequiredInMb").build();
    private static final MarshallingInfo<Integer> MAXMEMORYREQUIREDINMB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxMemoryRequiredInMb").build();

    private static final InferenceComponentComputeResourceRequirementsMarshaller instance = new InferenceComponentComputeResourceRequirementsMarshaller();

    public static InferenceComponentComputeResourceRequirementsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InferenceComponentComputeResourceRequirements inferenceComponentComputeResourceRequirements, ProtocolMarshaller protocolMarshaller) {

        if (inferenceComponentComputeResourceRequirements == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inferenceComponentComputeResourceRequirements.getNumberOfCpuCoresRequired(), NUMBEROFCPUCORESREQUIRED_BINDING);
            protocolMarshaller.marshall(inferenceComponentComputeResourceRequirements.getNumberOfAcceleratorDevicesRequired(),
                    NUMBEROFACCELERATORDEVICESREQUIRED_BINDING);
            protocolMarshaller.marshall(inferenceComponentComputeResourceRequirements.getMinMemoryRequiredInMb(), MINMEMORYREQUIREDINMB_BINDING);
            protocolMarshaller.marshall(inferenceComponentComputeResourceRequirements.getMaxMemoryRequiredInMb(), MAXMEMORYREQUIREDINMB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
