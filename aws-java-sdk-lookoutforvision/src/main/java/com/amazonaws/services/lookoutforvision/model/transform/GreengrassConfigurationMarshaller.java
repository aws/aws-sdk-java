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
package com.amazonaws.services.lookoutforvision.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutforvision.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GreengrassConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GreengrassConfigurationMarshaller {

    private static final MarshallingInfo<String> COMPILEROPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompilerOptions").build();
    private static final MarshallingInfo<String> TARGETDEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetDevice").build();
    private static final MarshallingInfo<StructuredPojo> TARGETPLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetPlatform").build();
    private static final MarshallingInfo<StructuredPojo> S3OUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3OutputLocation").build();
    private static final MarshallingInfo<String> COMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComponentName").build();
    private static final MarshallingInfo<String> COMPONENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComponentVersion").build();
    private static final MarshallingInfo<String> COMPONENTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComponentDescription").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final GreengrassConfigurationMarshaller instance = new GreengrassConfigurationMarshaller();

    public static GreengrassConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GreengrassConfiguration greengrassConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (greengrassConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(greengrassConfiguration.getCompilerOptions(), COMPILEROPTIONS_BINDING);
            protocolMarshaller.marshall(greengrassConfiguration.getTargetDevice(), TARGETDEVICE_BINDING);
            protocolMarshaller.marshall(greengrassConfiguration.getTargetPlatform(), TARGETPLATFORM_BINDING);
            protocolMarshaller.marshall(greengrassConfiguration.getS3OutputLocation(), S3OUTPUTLOCATION_BINDING);
            protocolMarshaller.marshall(greengrassConfiguration.getComponentName(), COMPONENTNAME_BINDING);
            protocolMarshaller.marshall(greengrassConfiguration.getComponentVersion(), COMPONENTVERSION_BINDING);
            protocolMarshaller.marshall(greengrassConfiguration.getComponentDescription(), COMPONENTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(greengrassConfiguration.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
