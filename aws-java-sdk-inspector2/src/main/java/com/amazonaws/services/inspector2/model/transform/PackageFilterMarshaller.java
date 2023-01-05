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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PackageFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PackageFilterMarshaller {

    private static final MarshallingInfo<StructuredPojo> ARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("architecture").build();
    private static final MarshallingInfo<StructuredPojo> EPOCH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("epoch").build();
    private static final MarshallingInfo<StructuredPojo> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> RELEASE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("release").build();
    private static final MarshallingInfo<StructuredPojo> SOURCELAMBDALAYERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceLambdaLayerArn").build();
    private static final MarshallingInfo<StructuredPojo> SOURCELAYERHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceLayerHash").build();
    private static final MarshallingInfo<StructuredPojo> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("version").build();

    private static final PackageFilterMarshaller instance = new PackageFilterMarshaller();

    public static PackageFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PackageFilter packageFilter, ProtocolMarshaller protocolMarshaller) {

        if (packageFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(packageFilter.getArchitecture(), ARCHITECTURE_BINDING);
            protocolMarshaller.marshall(packageFilter.getEpoch(), EPOCH_BINDING);
            protocolMarshaller.marshall(packageFilter.getName(), NAME_BINDING);
            protocolMarshaller.marshall(packageFilter.getRelease(), RELEASE_BINDING);
            protocolMarshaller.marshall(packageFilter.getSourceLambdaLayerArn(), SOURCELAMBDALAYERARN_BINDING);
            protocolMarshaller.marshall(packageFilter.getSourceLayerHash(), SOURCELAYERHASH_BINDING);
            protocolMarshaller.marshall(packageFilter.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
