/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateWorkspaceBundleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateWorkspaceBundleRequestMarshaller {

    private static final MarshallingInfo<String> BUNDLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BundleName").build();
    private static final MarshallingInfo<String> BUNDLEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BundleDescription").build();
    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageId").build();
    private static final MarshallingInfo<StructuredPojo> COMPUTETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeType").build();
    private static final MarshallingInfo<StructuredPojo> USERSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserStorage").build();
    private static final MarshallingInfo<StructuredPojo> ROOTSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootStorage").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateWorkspaceBundleRequestMarshaller instance = new CreateWorkspaceBundleRequestMarshaller();

    public static CreateWorkspaceBundleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateWorkspaceBundleRequest createWorkspaceBundleRequest, ProtocolMarshaller protocolMarshaller) {

        if (createWorkspaceBundleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createWorkspaceBundleRequest.getBundleName(), BUNDLENAME_BINDING);
            protocolMarshaller.marshall(createWorkspaceBundleRequest.getBundleDescription(), BUNDLEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createWorkspaceBundleRequest.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(createWorkspaceBundleRequest.getComputeType(), COMPUTETYPE_BINDING);
            protocolMarshaller.marshall(createWorkspaceBundleRequest.getUserStorage(), USERSTORAGE_BINDING);
            protocolMarshaller.marshall(createWorkspaceBundleRequest.getRootStorage(), ROOTSTORAGE_BINDING);
            protocolMarshaller.marshall(createWorkspaceBundleRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
