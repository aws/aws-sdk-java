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
package com.amazonaws.services.dlm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dlm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LifecyclePolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LifecyclePolicyMarshaller {

    private static final MarshallingInfo<String> POLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRoleArn").build();
    private static final MarshallingInfo<java.util.Date> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateCreated").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> DATEMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateModified").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> POLICYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyDetails").build();

    private static final LifecyclePolicyMarshaller instance = new LifecyclePolicyMarshaller();

    public static LifecyclePolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LifecyclePolicy lifecyclePolicy, ProtocolMarshaller protocolMarshaller) {

        if (lifecyclePolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lifecyclePolicy.getPolicyId(), POLICYID_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getState(), STATE_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getDateModified(), DATEMODIFIED_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getPolicyDetails(), POLICYDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
