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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BehaviorCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BehaviorCriteriaMarshaller {

    private static final MarshallingInfo<String> COMPARISONOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("comparisonOperator").build();
    private static final MarshallingInfo<StructuredPojo> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("value").build();
    private static final MarshallingInfo<Integer> DURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationSeconds").build();
    private static final MarshallingInfo<Integer> CONSECUTIVEDATAPOINTSTOALARM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consecutiveDatapointsToAlarm").build();
    private static final MarshallingInfo<Integer> CONSECUTIVEDATAPOINTSTOCLEAR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consecutiveDatapointsToClear").build();
    private static final MarshallingInfo<StructuredPojo> STATISTICALTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statisticalThreshold").build();

    private static final BehaviorCriteriaMarshaller instance = new BehaviorCriteriaMarshaller();

    public static BehaviorCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BehaviorCriteria behaviorCriteria, ProtocolMarshaller protocolMarshaller) {

        if (behaviorCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(behaviorCriteria.getComparisonOperator(), COMPARISONOPERATOR_BINDING);
            protocolMarshaller.marshall(behaviorCriteria.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(behaviorCriteria.getDurationSeconds(), DURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(behaviorCriteria.getConsecutiveDatapointsToAlarm(), CONSECUTIVEDATAPOINTSTOALARM_BINDING);
            protocolMarshaller.marshall(behaviorCriteria.getConsecutiveDatapointsToClear(), CONSECUTIVEDATAPOINTSTOCLEAR_BINDING);
            protocolMarshaller.marshall(behaviorCriteria.getStatisticalThreshold(), STATISTICALTHRESHOLD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
