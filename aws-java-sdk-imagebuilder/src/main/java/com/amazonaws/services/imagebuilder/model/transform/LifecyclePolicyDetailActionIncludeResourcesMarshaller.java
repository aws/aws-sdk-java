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
package com.amazonaws.services.imagebuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LifecyclePolicyDetailActionIncludeResourcesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LifecyclePolicyDetailActionIncludeResourcesMarshaller {

    private static final MarshallingInfo<Boolean> AMIS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("amis").build();
    private static final MarshallingInfo<Boolean> SNAPSHOTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshots").build();
    private static final MarshallingInfo<Boolean> CONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containers").build();

    private static final LifecyclePolicyDetailActionIncludeResourcesMarshaller instance = new LifecyclePolicyDetailActionIncludeResourcesMarshaller();

    public static LifecyclePolicyDetailActionIncludeResourcesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LifecyclePolicyDetailActionIncludeResources lifecyclePolicyDetailActionIncludeResources, ProtocolMarshaller protocolMarshaller) {

        if (lifecyclePolicyDetailActionIncludeResources == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lifecyclePolicyDetailActionIncludeResources.getAmis(), AMIS_BINDING);
            protocolMarshaller.marshall(lifecyclePolicyDetailActionIncludeResources.getSnapshots(), SNAPSHOTS_BINDING);
            protocolMarshaller.marshall(lifecyclePolicyDetailActionIncludeResources.getContainers(), CONTAINERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
