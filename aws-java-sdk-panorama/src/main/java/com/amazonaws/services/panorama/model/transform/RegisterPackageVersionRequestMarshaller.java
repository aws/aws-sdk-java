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
package com.amazonaws.services.panorama.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.panorama.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterPackageVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterPackageVersionRequestMarshaller {

    private static final MarshallingInfo<Boolean> MARKLATEST_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarkLatest").build();
    private static final MarshallingInfo<String> OWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerAccount").build();
    private static final MarshallingInfo<String> PACKAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("PackageId").build();
    private static final MarshallingInfo<String> PACKAGEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("PackageVersion").build();
    private static final MarshallingInfo<String> PATCHVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("PatchVersion").build();

    private static final RegisterPackageVersionRequestMarshaller instance = new RegisterPackageVersionRequestMarshaller();

    public static RegisterPackageVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterPackageVersionRequest registerPackageVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerPackageVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerPackageVersionRequest.getMarkLatest(), MARKLATEST_BINDING);
            protocolMarshaller.marshall(registerPackageVersionRequest.getOwnerAccount(), OWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(registerPackageVersionRequest.getPackageId(), PACKAGEID_BINDING);
            protocolMarshaller.marshall(registerPackageVersionRequest.getPackageVersion(), PACKAGEVERSION_BINDING);
            protocolMarshaller.marshall(registerPackageVersionRequest.getPatchVersion(), PATCHVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
