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
package com.amazonaws.services.transfer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transfer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkflowStepMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkflowStepMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> COPYSTEPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyStepDetails").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMSTEPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomStepDetails").build();
    private static final MarshallingInfo<StructuredPojo> DELETESTEPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteStepDetails").build();
    private static final MarshallingInfo<StructuredPojo> TAGSTEPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagStepDetails").build();
    private static final MarshallingInfo<StructuredPojo> DECRYPTSTEPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DecryptStepDetails").build();

    private static final WorkflowStepMarshaller instance = new WorkflowStepMarshaller();

    public static WorkflowStepMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkflowStep workflowStep, ProtocolMarshaller protocolMarshaller) {

        if (workflowStep == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workflowStep.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(workflowStep.getCopyStepDetails(), COPYSTEPDETAILS_BINDING);
            protocolMarshaller.marshall(workflowStep.getCustomStepDetails(), CUSTOMSTEPDETAILS_BINDING);
            protocolMarshaller.marshall(workflowStep.getDeleteStepDetails(), DELETESTEPDETAILS_BINDING);
            protocolMarshaller.marshall(workflowStep.getTagStepDetails(), TAGSTEPDETAILS_BINDING);
            protocolMarshaller.marshall(workflowStep.getDecryptStepDetails(), DECRYPTSTEPDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
