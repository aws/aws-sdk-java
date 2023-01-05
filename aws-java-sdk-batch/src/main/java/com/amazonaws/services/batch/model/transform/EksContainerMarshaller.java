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
package com.amazonaws.services.batch.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EksContainerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EksContainerMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("image").build();
    private static final MarshallingInfo<String> IMAGEPULLPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imagePullPolicy").build();
    private static final MarshallingInfo<List> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("command").build();
    private static final MarshallingInfo<List> ARGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("args").build();
    private static final MarshallingInfo<List> ENV_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("env").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resources").build();
    private static final MarshallingInfo<List> VOLUMEMOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumeMounts").build();
    private static final MarshallingInfo<StructuredPojo> SECURITYCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityContext").build();

    private static final EksContainerMarshaller instance = new EksContainerMarshaller();

    public static EksContainerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EksContainer eksContainer, ProtocolMarshaller protocolMarshaller) {

        if (eksContainer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eksContainer.getName(), NAME_BINDING);
            protocolMarshaller.marshall(eksContainer.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(eksContainer.getImagePullPolicy(), IMAGEPULLPOLICY_BINDING);
            protocolMarshaller.marshall(eksContainer.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(eksContainer.getArgs(), ARGS_BINDING);
            protocolMarshaller.marshall(eksContainer.getEnv(), ENV_BINDING);
            protocolMarshaller.marshall(eksContainer.getResources(), RESOURCES_BINDING);
            protocolMarshaller.marshall(eksContainer.getVolumeMounts(), VOLUMEMOUNTS_BINDING);
            protocolMarshaller.marshall(eksContainer.getSecurityContext(), SECURITYCONTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
