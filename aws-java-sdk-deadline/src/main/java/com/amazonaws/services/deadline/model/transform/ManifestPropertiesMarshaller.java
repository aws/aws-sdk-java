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
package com.amazonaws.services.deadline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ManifestPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ManifestPropertiesMarshaller {

    private static final MarshallingInfo<String> FILESYSTEMLOCATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileSystemLocationName").build();
    private static final MarshallingInfo<String> INPUTMANIFESTHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputManifestHash").build();
    private static final MarshallingInfo<String> INPUTMANIFESTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputManifestPath").build();
    private static final MarshallingInfo<List> OUTPUTRELATIVEDIRECTORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputRelativeDirectories").build();
    private static final MarshallingInfo<String> ROOTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rootPath").build();
    private static final MarshallingInfo<String> ROOTPATHFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rootPathFormat").build();

    private static final ManifestPropertiesMarshaller instance = new ManifestPropertiesMarshaller();

    public static ManifestPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ManifestProperties manifestProperties, ProtocolMarshaller protocolMarshaller) {

        if (manifestProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(manifestProperties.getFileSystemLocationName(), FILESYSTEMLOCATIONNAME_BINDING);
            protocolMarshaller.marshall(manifestProperties.getInputManifestHash(), INPUTMANIFESTHASH_BINDING);
            protocolMarshaller.marshall(manifestProperties.getInputManifestPath(), INPUTMANIFESTPATH_BINDING);
            protocolMarshaller.marshall(manifestProperties.getOutputRelativeDirectories(), OUTPUTRELATIVEDIRECTORIES_BINDING);
            protocolMarshaller.marshall(manifestProperties.getRootPath(), ROOTPATH_BINDING);
            protocolMarshaller.marshall(manifestProperties.getRootPathFormat(), ROOTPATHFORMAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
