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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LifeCycleLastCutoverMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LifeCycleLastCutoverMarshaller {

    private static final MarshallingInfo<StructuredPojo> FINALIZED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("finalized").build();
    private static final MarshallingInfo<StructuredPojo> INITIATED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initiated").build();
    private static final MarshallingInfo<StructuredPojo> REVERTED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reverted").build();

    private static final LifeCycleLastCutoverMarshaller instance = new LifeCycleLastCutoverMarshaller();

    public static LifeCycleLastCutoverMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LifeCycleLastCutover lifeCycleLastCutover, ProtocolMarshaller protocolMarshaller) {

        if (lifeCycleLastCutover == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lifeCycleLastCutover.getFinalized(), FINALIZED_BINDING);
            protocolMarshaller.marshall(lifeCycleLastCutover.getInitiated(), INITIATED_BINDING);
            protocolMarshaller.marshall(lifeCycleLastCutover.getReverted(), REVERTED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
