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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeregisterPatchBaselineForPatchGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeregisterPatchBaselineForPatchGroupRequestMarshaller {

    private static final MarshallingInfo<String> BASELINEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaselineId").build();
    private static final MarshallingInfo<String> PATCHGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PatchGroup").build();

    private static final DeregisterPatchBaselineForPatchGroupRequestMarshaller instance = new DeregisterPatchBaselineForPatchGroupRequestMarshaller();

    public static DeregisterPatchBaselineForPatchGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (deregisterPatchBaselineForPatchGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deregisterPatchBaselineForPatchGroupRequest.getBaselineId(), BASELINEID_BINDING);
            protocolMarshaller.marshall(deregisterPatchBaselineForPatchGroupRequest.getPatchGroup(), PATCHGROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
