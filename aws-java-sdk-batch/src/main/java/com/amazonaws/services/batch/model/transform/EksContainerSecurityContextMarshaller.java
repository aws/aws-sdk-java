/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EksContainerSecurityContextMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EksContainerSecurityContextMarshaller {

    private static final MarshallingInfo<Long> RUNASUSER_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runAsUser").build();
    private static final MarshallingInfo<Long> RUNASGROUP_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runAsGroup").build();
    private static final MarshallingInfo<Boolean> PRIVILEGED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privileged").build();
    private static final MarshallingInfo<Boolean> READONLYROOTFILESYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readOnlyRootFilesystem").build();
    private static final MarshallingInfo<Boolean> RUNASNONROOT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runAsNonRoot").build();

    private static final EksContainerSecurityContextMarshaller instance = new EksContainerSecurityContextMarshaller();

    public static EksContainerSecurityContextMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EksContainerSecurityContext eksContainerSecurityContext, ProtocolMarshaller protocolMarshaller) {

        if (eksContainerSecurityContext == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eksContainerSecurityContext.getRunAsUser(), RUNASUSER_BINDING);
            protocolMarshaller.marshall(eksContainerSecurityContext.getRunAsGroup(), RUNASGROUP_BINDING);
            protocolMarshaller.marshall(eksContainerSecurityContext.getPrivileged(), PRIVILEGED_BINDING);
            protocolMarshaller.marshall(eksContainerSecurityContext.getReadOnlyRootFilesystem(), READONLYROOTFILESYSTEM_BINDING);
            protocolMarshaller.marshall(eksContainerSecurityContext.getRunAsNonRoot(), RUNASNONROOT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
