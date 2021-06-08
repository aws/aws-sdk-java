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
package com.amazonaws.services.dlm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dlm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CrossRegionCopyActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CrossRegionCopyActionMarshaller {

    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Target").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> RETAINRULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetainRule").build();

    private static final CrossRegionCopyActionMarshaller instance = new CrossRegionCopyActionMarshaller();

    public static CrossRegionCopyActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CrossRegionCopyAction crossRegionCopyAction, ProtocolMarshaller protocolMarshaller) {

        if (crossRegionCopyAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(crossRegionCopyAction.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(crossRegionCopyAction.getEncryptionConfiguration(), ENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(crossRegionCopyAction.getRetainRule(), RETAINRULE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
