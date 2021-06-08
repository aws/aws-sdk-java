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
 * StartNotebookExecutionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartNotebookExecutionRequestMarshaller {

    private static final MarshallingInfo<String> EDITORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EditorId").build();
    private static final MarshallingInfo<String> RELATIVEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelativePath").build();
    private static final MarshallingInfo<String> NOTEBOOKEXECUTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookExecutionName").build();
    private static final MarshallingInfo<String> NOTEBOOKPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookParams").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionEngine").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<String> NOTEBOOKINSTANCESECURITYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceSecurityGroupId").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final StartNotebookExecutionRequestMarshaller instance = new StartNotebookExecutionRequestMarshaller();

    public static StartNotebookExecutionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartNotebookExecutionRequest startNotebookExecutionRequest, ProtocolMarshaller protocolMarshaller) {

        if (startNotebookExecutionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startNotebookExecutionRequest.getEditorId(), EDITORID_BINDING);
            protocolMarshaller.marshall(startNotebookExecutionRequest.getRelativePath(), RELATIVEPATH_BINDING);
            protocolMarshaller.marshall(startNotebookExecutionRequest.getNotebookExecutionName(), NOTEBOOKEXECUTIONNAME_BINDING);
            protocolMarshaller.marshall(startNotebookExecutionRequest.getNotebookParams(), NOTEBOOKPARAMS_BINDING);
            protocolMarshaller.marshall(startNotebookExecutionRequest.getExecutionEngine(), EXECUTIONENGINE_BINDING);
            protocolMarshaller.marshall(startNotebookExecutionRequest.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(startNotebookExecutionRequest.getNotebookInstanceSecurityGroupId(), NOTEBOOKINSTANCESECURITYGROUPID_BINDING);
            protocolMarshaller.marshall(startNotebookExecutionRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
