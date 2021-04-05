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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MotionGraphicsConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MotionGraphicsConfigurationMarshaller {

    private static final MarshallingInfo<String> MOTIONGRAPHICSINSERTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("motionGraphicsInsertion").build();
    private static final MarshallingInfo<StructuredPojo> MOTIONGRAPHICSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("motionGraphicsSettings").build();

    private static final MotionGraphicsConfigurationMarshaller instance = new MotionGraphicsConfigurationMarshaller();

    public static MotionGraphicsConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MotionGraphicsConfiguration motionGraphicsConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (motionGraphicsConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(motionGraphicsConfiguration.getMotionGraphicsInsertion(), MOTIONGRAPHICSINSERTION_BINDING);
            protocolMarshaller.marshall(motionGraphicsConfiguration.getMotionGraphicsSettings(), MOTIONGRAPHICSSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
