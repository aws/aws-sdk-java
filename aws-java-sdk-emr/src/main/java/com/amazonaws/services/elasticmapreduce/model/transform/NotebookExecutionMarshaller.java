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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NotebookExecutionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NotebookExecutionMarshaller {

    private static final MarshallingInfo<String> NOTEBOOKEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookExecutionId").build();
    private static final MarshallingInfo<String> EDITORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EditorId").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionEngine").build();
    private static final MarshallingInfo<String> NOTEBOOKEXECUTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookExecutionName").build();
    private static final MarshallingInfo<String> NOTEBOOKPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookParams").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> OUTPUTNOTEBOOKURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputNotebookURI").build();
    private static final MarshallingInfo<String> LASTSTATECHANGEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastStateChangeReason").build();
    private static final MarshallingInfo<String> NOTEBOOKINSTANCESECURITYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceSecurityGroupId").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final NotebookExecutionMarshaller instance = new NotebookExecutionMarshaller();

    public static NotebookExecutionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NotebookExecution notebookExecution, ProtocolMarshaller protocolMarshaller) {

        if (notebookExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(notebookExecution.getNotebookExecutionId(), NOTEBOOKEXECUTIONID_BINDING);
            protocolMarshaller.marshall(notebookExecution.getEditorId(), EDITORID_BINDING);
            protocolMarshaller.marshall(notebookExecution.getExecutionEngine(), EXECUTIONENGINE_BINDING);
            protocolMarshaller.marshall(notebookExecution.getNotebookExecutionName(), NOTEBOOKEXECUTIONNAME_BINDING);
            protocolMarshaller.marshall(notebookExecution.getNotebookParams(), NOTEBOOKPARAMS_BINDING);
            protocolMarshaller.marshall(notebookExecution.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(notebookExecution.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(notebookExecution.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(notebookExecution.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(notebookExecution.getOutputNotebookURI(), OUTPUTNOTEBOOKURI_BINDING);
            protocolMarshaller.marshall(notebookExecution.getLastStateChangeReason(), LASTSTATECHANGEREASON_BINDING);
            protocolMarshaller.marshall(notebookExecution.getNotebookInstanceSecurityGroupId(), NOTEBOOKINSTANCESECURITYGROUPID_BINDING);
            protocolMarshaller.marshall(notebookExecution.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
