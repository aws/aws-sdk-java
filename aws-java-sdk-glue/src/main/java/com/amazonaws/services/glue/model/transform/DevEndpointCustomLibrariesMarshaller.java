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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DevEndpointCustomLibrariesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DevEndpointCustomLibrariesMarshaller {

    private static final MarshallingInfo<String> EXTRAPYTHONLIBSS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtraPythonLibsS3Path").build();
    private static final MarshallingInfo<String> EXTRAJARSS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtraJarsS3Path").build();

    private static final DevEndpointCustomLibrariesMarshaller instance = new DevEndpointCustomLibrariesMarshaller();

    public static DevEndpointCustomLibrariesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DevEndpointCustomLibraries devEndpointCustomLibraries, ProtocolMarshaller protocolMarshaller) {

        if (devEndpointCustomLibraries == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(devEndpointCustomLibraries.getExtraPythonLibsS3Path(), EXTRAPYTHONLIBSS3PATH_BINDING);
            protocolMarshaller.marshall(devEndpointCustomLibraries.getExtraJarsS3Path(), EXTRAJARSS3PATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
