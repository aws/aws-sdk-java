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
package com.amazonaws.services.nimblestudio.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LaunchProfileInitializationScriptMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LaunchProfileInitializationScriptMarshaller {

    private static final MarshallingInfo<String> SCRIPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("script").build();
    private static final MarshallingInfo<String> STUDIOCOMPONENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("studioComponentId").build();
    private static final MarshallingInfo<String> STUDIOCOMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("studioComponentName").build();

    private static final LaunchProfileInitializationScriptMarshaller instance = new LaunchProfileInitializationScriptMarshaller();

    public static LaunchProfileInitializationScriptMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LaunchProfileInitializationScript launchProfileInitializationScript, ProtocolMarshaller protocolMarshaller) {

        if (launchProfileInitializationScript == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(launchProfileInitializationScript.getScript(), SCRIPT_BINDING);
            protocolMarshaller.marshall(launchProfileInitializationScript.getStudioComponentId(), STUDIOCOMPONENTID_BINDING);
            protocolMarshaller.marshall(launchProfileInitializationScript.getStudioComponentName(), STUDIOCOMPONENTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
