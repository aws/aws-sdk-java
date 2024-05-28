/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NotifyTerminateProvisionedProductEngineWorkflowResultRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NotifyTerminateProvisionedProductEngineWorkflowResultRequestMarshaller {

    private static final MarshallingInfo<String> WORKFLOWTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkflowToken").build();
    private static final MarshallingInfo<String> RECORDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RecordId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<String> IDEMPOTENCYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdempotencyToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final NotifyTerminateProvisionedProductEngineWorkflowResultRequestMarshaller instance = new NotifyTerminateProvisionedProductEngineWorkflowResultRequestMarshaller();

    public static NotifyTerminateProvisionedProductEngineWorkflowResultRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NotifyTerminateProvisionedProductEngineWorkflowResultRequest notifyTerminateProvisionedProductEngineWorkflowResultRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (notifyTerminateProvisionedProductEngineWorkflowResultRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(notifyTerminateProvisionedProductEngineWorkflowResultRequest.getWorkflowToken(), WORKFLOWTOKEN_BINDING);
            protocolMarshaller.marshall(notifyTerminateProvisionedProductEngineWorkflowResultRequest.getRecordId(), RECORDID_BINDING);
            protocolMarshaller.marshall(notifyTerminateProvisionedProductEngineWorkflowResultRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(notifyTerminateProvisionedProductEngineWorkflowResultRequest.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(notifyTerminateProvisionedProductEngineWorkflowResultRequest.getIdempotencyToken(), IDEMPOTENCYTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
