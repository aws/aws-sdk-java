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
package com.amazonaws.services.codedeploy.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ECSTaskSetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ECSTaskSetMarshaller {

    private static final MarshallingInfo<String> IDENTIFER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("identifer").build();
    private static final MarshallingInfo<Long> DESIREDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("desiredCount").build();
    private static final MarshallingInfo<Long> PENDINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pendingCount").build();
    private static final MarshallingInfo<Long> RUNNINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runningCount").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Double> TRAFFICWEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trafficWeight").build();
    private static final MarshallingInfo<StructuredPojo> TARGETGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetGroup").build();
    private static final MarshallingInfo<String> TASKSETLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskSetLabel").build();

    private static final ECSTaskSetMarshaller instance = new ECSTaskSetMarshaller();

    public static ECSTaskSetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ECSTaskSet eCSTaskSet, ProtocolMarshaller protocolMarshaller) {

        if (eCSTaskSet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eCSTaskSet.getIdentifer(), IDENTIFER_BINDING);
            protocolMarshaller.marshall(eCSTaskSet.getDesiredCount(), DESIREDCOUNT_BINDING);
            protocolMarshaller.marshall(eCSTaskSet.getPendingCount(), PENDINGCOUNT_BINDING);
            protocolMarshaller.marshall(eCSTaskSet.getRunningCount(), RUNNINGCOUNT_BINDING);
            protocolMarshaller.marshall(eCSTaskSet.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(eCSTaskSet.getTrafficWeight(), TRAFFICWEIGHT_BINDING);
            protocolMarshaller.marshall(eCSTaskSet.getTargetGroup(), TARGETGROUP_BINDING);
            protocolMarshaller.marshall(eCSTaskSet.getTaskSetLabel(), TASKSETLABEL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
