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
 * EksPodPropertiesDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EksPodPropertiesDetailMarshaller {

    private static final MarshallingInfo<String> SERVICEACCOUNTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceAccountName").build();
    private static final MarshallingInfo<Boolean> HOSTNETWORK_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hostNetwork").build();
    private static final MarshallingInfo<String> DNSPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dnsPolicy").build();
    private static final MarshallingInfo<List> CONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("containers").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumes").build();
    private static final MarshallingInfo<String> PODNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("podName").build();
    private static final MarshallingInfo<String> NODENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodeName").build();

    private static final EksPodPropertiesDetailMarshaller instance = new EksPodPropertiesDetailMarshaller();

    public static EksPodPropertiesDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EksPodPropertiesDetail eksPodPropertiesDetail, ProtocolMarshaller protocolMarshaller) {

        if (eksPodPropertiesDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eksPodPropertiesDetail.getServiceAccountName(), SERVICEACCOUNTNAME_BINDING);
            protocolMarshaller.marshall(eksPodPropertiesDetail.getHostNetwork(), HOSTNETWORK_BINDING);
            protocolMarshaller.marshall(eksPodPropertiesDetail.getDnsPolicy(), DNSPOLICY_BINDING);
            protocolMarshaller.marshall(eksPodPropertiesDetail.getContainers(), CONTAINERS_BINDING);
            protocolMarshaller.marshall(eksPodPropertiesDetail.getVolumes(), VOLUMES_BINDING);
            protocolMarshaller.marshall(eksPodPropertiesDetail.getPodName(), PODNAME_BINDING);
            protocolMarshaller.marshall(eksPodPropertiesDetail.getNodeName(), NODENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
