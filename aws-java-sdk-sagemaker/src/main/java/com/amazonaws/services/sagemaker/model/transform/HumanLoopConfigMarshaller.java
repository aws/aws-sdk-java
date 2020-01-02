/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * HumanLoopConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HumanLoopConfigMarshaller {

    private static final MarshallingInfo<String> WORKTEAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkteamArn").build();
    private static final MarshallingInfo<String> HUMANTASKUIARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanTaskUiArn").build();
    private static final MarshallingInfo<String> TASKTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskTitle").build();
    private static final MarshallingInfo<String> TASKDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskDescription").build();
    private static final MarshallingInfo<Integer> TASKCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskCount").build();
    private static final MarshallingInfo<Integer> TASKAVAILABILITYLIFETIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskAvailabilityLifetimeInSeconds").build();
    private static final MarshallingInfo<Integer> TASKTIMELIMITINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskTimeLimitInSeconds").build();
    private static final MarshallingInfo<List> TASKKEYWORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskKeywords").build();
    private static final MarshallingInfo<StructuredPojo> PUBLICWORKFORCETASKPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublicWorkforceTaskPrice").build();

    private static final HumanLoopConfigMarshaller instance = new HumanLoopConfigMarshaller();

    public static HumanLoopConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HumanLoopConfig humanLoopConfig, ProtocolMarshaller protocolMarshaller) {

        if (humanLoopConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(humanLoopConfig.getWorkteamArn(), WORKTEAMARN_BINDING);
            protocolMarshaller.marshall(humanLoopConfig.getHumanTaskUiArn(), HUMANTASKUIARN_BINDING);
            protocolMarshaller.marshall(humanLoopConfig.getTaskTitle(), TASKTITLE_BINDING);
            protocolMarshaller.marshall(humanLoopConfig.getTaskDescription(), TASKDESCRIPTION_BINDING);
            protocolMarshaller.marshall(humanLoopConfig.getTaskCount(), TASKCOUNT_BINDING);
            protocolMarshaller.marshall(humanLoopConfig.getTaskAvailabilityLifetimeInSeconds(), TASKAVAILABILITYLIFETIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(humanLoopConfig.getTaskTimeLimitInSeconds(), TASKTIMELIMITINSECONDS_BINDING);
            protocolMarshaller.marshall(humanLoopConfig.getTaskKeywords(), TASKKEYWORDS_BINDING);
            protocolMarshaller.marshall(humanLoopConfig.getPublicWorkforceTaskPrice(), PUBLICWORKFORCETASKPRICE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
