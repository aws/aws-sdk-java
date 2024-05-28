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
package com.amazonaws.services.tnb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.tnb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListSolNetworkInstanceInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListSolNetworkInstanceInfoMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<StructuredPojo> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metadata").build();
    private static final MarshallingInfo<String> NSINSTANCEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nsInstanceDescription").build();
    private static final MarshallingInfo<String> NSINSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nsInstanceName").build();
    private static final MarshallingInfo<String> NSSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nsState").build();
    private static final MarshallingInfo<String> NSDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nsdId").build();
    private static final MarshallingInfo<String> NSDINFOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nsdInfoId").build();

    private static final ListSolNetworkInstanceInfoMarshaller instance = new ListSolNetworkInstanceInfoMarshaller();

    public static ListSolNetworkInstanceInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListSolNetworkInstanceInfo listSolNetworkInstanceInfo, ProtocolMarshaller protocolMarshaller) {

        if (listSolNetworkInstanceInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listSolNetworkInstanceInfo.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(listSolNetworkInstanceInfo.getId(), ID_BINDING);
            protocolMarshaller.marshall(listSolNetworkInstanceInfo.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(listSolNetworkInstanceInfo.getNsInstanceDescription(), NSINSTANCEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(listSolNetworkInstanceInfo.getNsInstanceName(), NSINSTANCENAME_BINDING);
            protocolMarshaller.marshall(listSolNetworkInstanceInfo.getNsState(), NSSTATE_BINDING);
            protocolMarshaller.marshall(listSolNetworkInstanceInfo.getNsdId(), NSDID_BINDING);
            protocolMarshaller.marshall(listSolNetworkInstanceInfo.getNsdInfoId(), NSDINFOID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
