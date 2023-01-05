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
 * DeregisterPackageVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeregisterPackageVersionRequestMarshaller {

    private static final MarshallingInfo<String> OWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("OwnerAccount").build();
    private static final MarshallingInfo<String> PACKAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("PackageId").build();
    private static final MarshallingInfo<String> PACKAGEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("PackageVersion").build();
    private static final MarshallingInfo<String> PATCHVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("PatchVersion").build();
    private static final MarshallingInfo<String> UPDATEDLATESTPATCHVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("UpdatedLatestPatchVersion").build();

    private static final DeregisterPackageVersionRequestMarshaller instance = new DeregisterPackageVersionRequestMarshaller();

    public static DeregisterPackageVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeregisterPackageVersionRequest deregisterPackageVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (deregisterPackageVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deregisterPackageVersionRequest.getOwnerAccount(), OWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(deregisterPackageVersionRequest.getPackageId(), PACKAGEID_BINDING);
            protocolMarshaller.marshall(deregisterPackageVersionRequest.getPackageVersion(), PACKAGEVERSION_BINDING);
            protocolMarshaller.marshall(deregisterPackageVersionRequest.getPatchVersion(), PATCHVERSION_BINDING);
            protocolMarshaller.marshall(deregisterPackageVersionRequest.getUpdatedLatestPatchVersion(), UPDATEDLATESTPATCHVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
