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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartDetectMitigationActionsTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartDetectMitigationActionsTaskRequestMarshaller {

    private static final MarshallingInfo<String> TASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("taskId").build();
    private static final MarshallingInfo<StructuredPojo> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("target").build();
    private static final MarshallingInfo<List> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actions").build();
    private static final MarshallingInfo<StructuredPojo> VIOLATIONEVENTOCCURRENCERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("violationEventOccurrenceRange").build();
    private static final MarshallingInfo<Boolean> INCLUDEONLYACTIVEVIOLATIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeOnlyActiveViolations").build();
    private static final MarshallingInfo<Boolean> INCLUDESUPPRESSEDALERTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeSuppressedAlerts").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final StartDetectMitigationActionsTaskRequestMarshaller instance = new StartDetectMitigationActionsTaskRequestMarshaller();

    public static StartDetectMitigationActionsTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartDetectMitigationActionsTaskRequest startDetectMitigationActionsTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (startDetectMitigationActionsTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startDetectMitigationActionsTaskRequest.getTaskId(), TASKID_BINDING);
            protocolMarshaller.marshall(startDetectMitigationActionsTaskRequest.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(startDetectMitigationActionsTaskRequest.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(startDetectMitigationActionsTaskRequest.getViolationEventOccurrenceRange(), VIOLATIONEVENTOCCURRENCERANGE_BINDING);
            protocolMarshaller.marshall(startDetectMitigationActionsTaskRequest.getIncludeOnlyActiveViolations(), INCLUDEONLYACTIVEVIOLATIONS_BINDING);
            protocolMarshaller.marshall(startDetectMitigationActionsTaskRequest.getIncludeSuppressedAlerts(), INCLUDESUPPRESSEDALERTS_BINDING);
            protocolMarshaller.marshall(startDetectMitigationActionsTaskRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
