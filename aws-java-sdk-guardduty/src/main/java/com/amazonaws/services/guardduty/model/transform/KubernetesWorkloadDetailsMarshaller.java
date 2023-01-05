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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KubernetesWorkloadDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KubernetesWorkloadDetailsMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> UID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uid").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("namespace").build();
    private static final MarshallingInfo<Boolean> HOSTNETWORK_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hostNetwork").build();
    private static final MarshallingInfo<List> CONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("containers").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumes").build();

    private static final KubernetesWorkloadDetailsMarshaller instance = new KubernetesWorkloadDetailsMarshaller();

    public static KubernetesWorkloadDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KubernetesWorkloadDetails kubernetesWorkloadDetails, ProtocolMarshaller protocolMarshaller) {

        if (kubernetesWorkloadDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kubernetesWorkloadDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(kubernetesWorkloadDetails.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(kubernetesWorkloadDetails.getUid(), UID_BINDING);
            protocolMarshaller.marshall(kubernetesWorkloadDetails.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(kubernetesWorkloadDetails.getHostNetwork(), HOSTNETWORK_BINDING);
            protocolMarshaller.marshall(kubernetesWorkloadDetails.getContainers(), CONTAINERS_BINDING);
            protocolMarshaller.marshall(kubernetesWorkloadDetails.getVolumes(), VOLUMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
