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
package com.amazonaws.services.appflow.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFlowRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFlowRequestMarshaller {

    private static final MarshallingInfo<String> FLOWNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("flowName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> TRIGGERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("triggerConfig").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEFLOWCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceFlowConfig").build();
    private static final MarshallingInfo<List> DESTINATIONFLOWCONFIGLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationFlowConfigList").build();
    private static final MarshallingInfo<List> TASKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tasks").build();

    private static final UpdateFlowRequestMarshaller instance = new UpdateFlowRequestMarshaller();

    public static UpdateFlowRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFlowRequest updateFlowRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFlowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFlowRequest.getFlowName(), FLOWNAME_BINDING);
            protocolMarshaller.marshall(updateFlowRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFlowRequest.getTriggerConfig(), TRIGGERCONFIG_BINDING);
            protocolMarshaller.marshall(updateFlowRequest.getSourceFlowConfig(), SOURCEFLOWCONFIG_BINDING);
            protocolMarshaller.marshall(updateFlowRequest.getDestinationFlowConfigList(), DESTINATIONFLOWCONFIGLIST_BINDING);
            protocolMarshaller.marshall(updateFlowRequest.getTasks(), TASKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
