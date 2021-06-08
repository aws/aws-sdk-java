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
 * EffectiveDeploymentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EffectiveDeploymentMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentId").build();
    private static final MarshallingInfo<String> DEPLOYMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentName").build();
    private static final MarshallingInfo<String> IOTJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iotJobId").build();
    private static final MarshallingInfo<String> IOTJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iotJobArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> TARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("targetArn").build();
    private static final MarshallingInfo<String> COREDEVICEEXECUTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("coreDeviceExecutionStatus").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> MODIFIEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modifiedTimestamp").timestampFormat("unixTimestamp").build();

    private static final EffectiveDeploymentMarshaller instance = new EffectiveDeploymentMarshaller();

    public static EffectiveDeploymentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EffectiveDeployment effectiveDeployment, ProtocolMarshaller protocolMarshaller) {

        if (effectiveDeployment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(effectiveDeployment.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(effectiveDeployment.getDeploymentName(), DEPLOYMENTNAME_BINDING);
            protocolMarshaller.marshall(effectiveDeployment.getIotJobId(), IOTJOBID_BINDING);
            protocolMarshaller.marshall(effectiveDeployment.getIotJobArn(), IOTJOBARN_BINDING);
            protocolMarshaller.marshall(effectiveDeployment.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(effectiveDeployment.getTargetArn(), TARGETARN_BINDING);
            protocolMarshaller.marshall(effectiveDeployment.getCoreDeviceExecutionStatus(), COREDEVICEEXECUTIONSTATUS_BINDING);
            protocolMarshaller.marshall(effectiveDeployment.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(effectiveDeployment.getCreationTimestamp(), CREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(effectiveDeployment.getModifiedTimestamp(), MODIFIEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
