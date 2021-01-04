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
package com.amazonaws.services.emrcontainers.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrcontainers.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SparkSubmitJobDriverMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SparkSubmitJobDriverMarshaller {

    private static final MarshallingInfo<String> ENTRYPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entryPoint").build();
    private static final MarshallingInfo<List> ENTRYPOINTARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entryPointArguments").build();
    private static final MarshallingInfo<String> SPARKSUBMITPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sparkSubmitParameters").build();

    private static final SparkSubmitJobDriverMarshaller instance = new SparkSubmitJobDriverMarshaller();

    public static SparkSubmitJobDriverMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SparkSubmitJobDriver sparkSubmitJobDriver, ProtocolMarshaller protocolMarshaller) {

        if (sparkSubmitJobDriver == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sparkSubmitJobDriver.getEntryPoint(), ENTRYPOINT_BINDING);
            protocolMarshaller.marshall(sparkSubmitJobDriver.getEntryPointArguments(), ENTRYPOINTARGUMENTS_BINDING);
            protocolMarshaller.marshall(sparkSubmitJobDriver.getSparkSubmitParameters(), SPARKSUBMITPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
