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
package com.amazonaws.services.dlm.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dlm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLifecyclePolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLifecyclePolicyRequestMarshaller {

    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRoleArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<StructuredPojo> POLICYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyDetails").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> DEFAULTPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultPolicy").build();
    private static final MarshallingInfo<Integer> CREATEINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateInterval").build();
    private static final MarshallingInfo<Integer> RETAININTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetainInterval").build();
    private static final MarshallingInfo<Boolean> COPYTAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTags").build();
    private static final MarshallingInfo<Boolean> EXTENDDELETION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendDeletion").build();
    private static final MarshallingInfo<List> CROSSREGIONCOPYTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrossRegionCopyTargets").build();
    private static final MarshallingInfo<StructuredPojo> EXCLUSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Exclusions").build();

    private static final CreateLifecyclePolicyRequestMarshaller instance = new CreateLifecyclePolicyRequestMarshaller();

    public static CreateLifecyclePolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLifecyclePolicyRequest createLifecyclePolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLifecyclePolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getState(), STATE_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getPolicyDetails(), POLICYDETAILS_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getDefaultPolicy(), DEFAULTPOLICY_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getCreateInterval(), CREATEINTERVAL_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getRetainInterval(), RETAININTERVAL_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getCopyTags(), COPYTAGS_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getExtendDeletion(), EXTENDDELETION_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getCrossRegionCopyTargets(), CROSSREGIONCOPYTARGETS_BINDING);
            protocolMarshaller.marshall(createLifecyclePolicyRequest.getExclusions(), EXCLUSIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
