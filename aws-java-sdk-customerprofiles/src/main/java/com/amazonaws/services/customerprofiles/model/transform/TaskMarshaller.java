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
package com.amazonaws.services.customerprofiles.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONNECTOROPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectorOperator").build();
    private static final MarshallingInfo<String> DESTINATIONFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationField").build();
    private static final MarshallingInfo<List> SOURCEFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceFields").build();
    private static final MarshallingInfo<Map> TASKPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskProperties").build();
    private static final MarshallingInfo<String> TASKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskType").build();

    private static final TaskMarshaller instance = new TaskMarshaller();

    public static TaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Task task, ProtocolMarshaller protocolMarshaller) {

        if (task == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(task.getConnectorOperator(), CONNECTOROPERATOR_BINDING);
            protocolMarshaller.marshall(task.getDestinationField(), DESTINATIONFIELD_BINDING);
            protocolMarshaller.marshall(task.getSourceFields(), SOURCEFIELDS_BINDING);
            protocolMarshaller.marshall(task.getTaskProperties(), TASKPROPERTIES_BINDING);
            protocolMarshaller.marshall(task.getTaskType(), TASKTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
