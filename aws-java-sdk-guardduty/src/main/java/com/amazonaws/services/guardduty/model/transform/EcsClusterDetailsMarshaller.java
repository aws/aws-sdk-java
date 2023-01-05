/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EcsClusterDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EcsClusterDetailsMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Integer> ACTIVESERVICESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeServicesCount").build();
    private static final MarshallingInfo<Integer> REGISTEREDCONTAINERINSTANCESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredContainerInstancesCount").build();
    private static final MarshallingInfo<Integer> RUNNINGTASKSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runningTasksCount").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> TASKDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskDetails").build();

    private static final EcsClusterDetailsMarshaller instance = new EcsClusterDetailsMarshaller();

    public static EcsClusterDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EcsClusterDetails ecsClusterDetails, ProtocolMarshaller protocolMarshaller) {

        if (ecsClusterDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ecsClusterDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(ecsClusterDetails.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(ecsClusterDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(ecsClusterDetails.getActiveServicesCount(), ACTIVESERVICESCOUNT_BINDING);
            protocolMarshaller.marshall(ecsClusterDetails.getRegisteredContainerInstancesCount(), REGISTEREDCONTAINERINSTANCESCOUNT_BINDING);
            protocolMarshaller.marshall(ecsClusterDetails.getRunningTasksCount(), RUNNINGTASKSCOUNT_BINDING);
            protocolMarshaller.marshall(ecsClusterDetails.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(ecsClusterDetails.getTaskDetails(), TASKDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
