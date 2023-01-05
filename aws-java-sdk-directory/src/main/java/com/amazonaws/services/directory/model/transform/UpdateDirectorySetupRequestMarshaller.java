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
package com.amazonaws.services.directory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDirectorySetupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDirectorySetupRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<String> UPDATETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateType").build();
    private static final MarshallingInfo<StructuredPojo> OSUPDATESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OSUpdateSettings").build();
    private static final MarshallingInfo<Boolean> CREATESNAPSHOTBEFOREUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateSnapshotBeforeUpdate").build();

    private static final UpdateDirectorySetupRequestMarshaller instance = new UpdateDirectorySetupRequestMarshaller();

    public static UpdateDirectorySetupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDirectorySetupRequest updateDirectorySetupRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDirectorySetupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDirectorySetupRequest.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(updateDirectorySetupRequest.getUpdateType(), UPDATETYPE_BINDING);
            protocolMarshaller.marshall(updateDirectorySetupRequest.getOSUpdateSettings(), OSUPDATESETTINGS_BINDING);
            protocolMarshaller.marshall(updateDirectorySetupRequest.getCreateSnapshotBeforeUpdate(), CREATESNAPSHOTBEFOREUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
