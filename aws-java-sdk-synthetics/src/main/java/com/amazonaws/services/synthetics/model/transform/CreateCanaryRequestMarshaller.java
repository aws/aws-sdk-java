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
package com.amazonaws.services.synthetics.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.synthetics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCanaryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCanaryRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> CODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Code").build();
    private static final MarshallingInfo<String> ARTIFACTS3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArtifactS3Location").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schedule").build();
    private static final MarshallingInfo<StructuredPojo> RUNCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunConfig").build();
    private static final MarshallingInfo<Integer> SUCCESSRETENTIONPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SuccessRetentionPeriodInDays").build();
    private static final MarshallingInfo<Integer> FAILURERETENTIONPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureRetentionPeriodInDays").build();
    private static final MarshallingInfo<String> RUNTIMEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuntimeVersion").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateCanaryRequestMarshaller instance = new CreateCanaryRequestMarshaller();

    public static CreateCanaryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCanaryRequest createCanaryRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCanaryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCanaryRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getArtifactS3Location(), ARTIFACTS3LOCATION_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getRunConfig(), RUNCONFIG_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getSuccessRetentionPeriodInDays(), SUCCESSRETENTIONPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getFailureRetentionPeriodInDays(), FAILURERETENTIONPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getRuntimeVersion(), RUNTIMEVERSION_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(createCanaryRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
