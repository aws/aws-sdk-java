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
package com.amazonaws.services.cloudwatchevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TargetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TargetMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Input").build();
    private static final MarshallingInfo<String> INPUTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputPath").build();
    private static final MarshallingInfo<StructuredPojo> INPUTTRANSFORMER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputTransformer").build();
    private static final MarshallingInfo<StructuredPojo> KINESISPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisParameters").build();
    private static final MarshallingInfo<StructuredPojo> RUNCOMMANDPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunCommandParameters").build();
    private static final MarshallingInfo<StructuredPojo> ECSPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EcsParameters").build();
    private static final MarshallingInfo<StructuredPojo> BATCHPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchParameters").build();
    private static final MarshallingInfo<StructuredPojo> SQSPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqsParameters").build();

    private static final TargetMarshaller instance = new TargetMarshaller();

    public static TargetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Target target, ProtocolMarshaller protocolMarshaller) {

        if (target == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(target.getId(), ID_BINDING);
            protocolMarshaller.marshall(target.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(target.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(target.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(target.getInputPath(), INPUTPATH_BINDING);
            protocolMarshaller.marshall(target.getInputTransformer(), INPUTTRANSFORMER_BINDING);
            protocolMarshaller.marshall(target.getKinesisParameters(), KINESISPARAMETERS_BINDING);
            protocolMarshaller.marshall(target.getRunCommandParameters(), RUNCOMMANDPARAMETERS_BINDING);
            protocolMarshaller.marshall(target.getEcsParameters(), ECSPARAMETERS_BINDING);
            protocolMarshaller.marshall(target.getBatchParameters(), BATCHPARAMETERS_BINDING);
            protocolMarshaller.marshall(target.getSqsParameters(), SQSPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
