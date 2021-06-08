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
package com.amazonaws.services.greengrassv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrassv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentIoTJobConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentIoTJobConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> JOBEXECUTIONSROLLOUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobExecutionsRolloutConfig").build();
    private static final MarshallingInfo<StructuredPojo> ABORTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("abortConfig").build();
    private static final MarshallingInfo<StructuredPojo> TIMEOUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutConfig").build();

    private static final DeploymentIoTJobConfigurationMarshaller instance = new DeploymentIoTJobConfigurationMarshaller();

    public static DeploymentIoTJobConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentIoTJobConfiguration deploymentIoTJobConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (deploymentIoTJobConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentIoTJobConfiguration.getJobExecutionsRolloutConfig(), JOBEXECUTIONSROLLOUTCONFIG_BINDING);
            protocolMarshaller.marshall(deploymentIoTJobConfiguration.getAbortConfig(), ABORTCONFIG_BINDING);
            protocolMarshaller.marshall(deploymentIoTJobConfiguration.getTimeoutConfig(), TIMEOUTCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
