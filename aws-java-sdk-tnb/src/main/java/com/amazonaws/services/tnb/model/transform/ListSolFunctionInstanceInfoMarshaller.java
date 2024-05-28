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
 * ListSolFunctionInstanceInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListSolFunctionInstanceInfoMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<StructuredPojo> INSTANTIATEDVNFINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instantiatedVnfInfo").build();
    private static final MarshallingInfo<String> INSTANTIATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instantiationState").build();
    private static final MarshallingInfo<StructuredPojo> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metadata").build();
    private static final MarshallingInfo<String> NSINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nsInstanceId").build();
    private static final MarshallingInfo<String> VNFPKGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vnfPkgId").build();
    private static final MarshallingInfo<String> VNFPKGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vnfPkgName").build();

    private static final ListSolFunctionInstanceInfoMarshaller instance = new ListSolFunctionInstanceInfoMarshaller();

    public static ListSolFunctionInstanceInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListSolFunctionInstanceInfo listSolFunctionInstanceInfo, ProtocolMarshaller protocolMarshaller) {

        if (listSolFunctionInstanceInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listSolFunctionInstanceInfo.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(listSolFunctionInstanceInfo.getId(), ID_BINDING);
            protocolMarshaller.marshall(listSolFunctionInstanceInfo.getInstantiatedVnfInfo(), INSTANTIATEDVNFINFO_BINDING);
            protocolMarshaller.marshall(listSolFunctionInstanceInfo.getInstantiationState(), INSTANTIATIONSTATE_BINDING);
            protocolMarshaller.marshall(listSolFunctionInstanceInfo.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(listSolFunctionInstanceInfo.getNsInstanceId(), NSINSTANCEID_BINDING);
            protocolMarshaller.marshall(listSolFunctionInstanceInfo.getVnfPkgId(), VNFPKGID_BINDING);
            protocolMarshaller.marshall(listSolFunctionInstanceInfo.getVnfPkgName(), VNFPKGNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
