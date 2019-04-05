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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateNotebookInstanceLifecycleConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateNotebookInstanceLifecycleConfigRequestMarshaller {

    private static final MarshallingInfo<String> NOTEBOOKINSTANCELIFECYCLECONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceLifecycleConfigName").build();
    private static final MarshallingInfo<List> ONCREATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OnCreate").build();
    private static final MarshallingInfo<List> ONSTART_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OnStart").build();

    private static final UpdateNotebookInstanceLifecycleConfigRequestMarshaller instance = new UpdateNotebookInstanceLifecycleConfigRequestMarshaller();

    public static UpdateNotebookInstanceLifecycleConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateNotebookInstanceLifecycleConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateNotebookInstanceLifecycleConfigRequest.getNotebookInstanceLifecycleConfigName(),
                    NOTEBOOKINSTANCELIFECYCLECONFIGNAME_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceLifecycleConfigRequest.getOnCreate(), ONCREATE_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceLifecycleConfigRequest.getOnStart(), ONSTART_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
