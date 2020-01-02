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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaskRunPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskRunPropertiesMarshaller {

    private static final MarshallingInfo<String> TASKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskType").build();
    private static final MarshallingInfo<StructuredPojo> IMPORTLABELSTASKRUNPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportLabelsTaskRunProperties").build();
    private static final MarshallingInfo<StructuredPojo> EXPORTLABELSTASKRUNPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportLabelsTaskRunProperties").build();
    private static final MarshallingInfo<StructuredPojo> LABELINGSETGENERATIONTASKRUNPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingSetGenerationTaskRunProperties").build();
    private static final MarshallingInfo<StructuredPojo> FINDMATCHESTASKRUNPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FindMatchesTaskRunProperties").build();

    private static final TaskRunPropertiesMarshaller instance = new TaskRunPropertiesMarshaller();

    public static TaskRunPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskRunProperties taskRunProperties, ProtocolMarshaller protocolMarshaller) {

        if (taskRunProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskRunProperties.getTaskType(), TASKTYPE_BINDING);
            protocolMarshaller.marshall(taskRunProperties.getImportLabelsTaskRunProperties(), IMPORTLABELSTASKRUNPROPERTIES_BINDING);
            protocolMarshaller.marshall(taskRunProperties.getExportLabelsTaskRunProperties(), EXPORTLABELSTASKRUNPROPERTIES_BINDING);
            protocolMarshaller.marshall(taskRunProperties.getLabelingSetGenerationTaskRunProperties(), LABELINGSETGENERATIONTASKRUNPROPERTIES_BINDING);
            protocolMarshaller.marshall(taskRunProperties.getFindMatchesTaskRunProperties(), FINDMATCHESTASKRUNPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
