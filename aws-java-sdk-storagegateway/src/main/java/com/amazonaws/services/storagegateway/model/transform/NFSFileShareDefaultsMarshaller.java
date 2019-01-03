/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NFSFileShareDefaultsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NFSFileShareDefaultsMarshaller {

    private static final MarshallingInfo<String> FILEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FileMode").build();
    private static final MarshallingInfo<String> DIRECTORYMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryMode").build();
    private static final MarshallingInfo<Long> GROUPID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupId").build();
    private static final MarshallingInfo<Long> OWNERID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerId").build();

    private static final NFSFileShareDefaultsMarshaller instance = new NFSFileShareDefaultsMarshaller();

    public static NFSFileShareDefaultsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NFSFileShareDefaults nFSFileShareDefaults, ProtocolMarshaller protocolMarshaller) {

        if (nFSFileShareDefaults == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nFSFileShareDefaults.getFileMode(), FILEMODE_BINDING);
            protocolMarshaller.marshall(nFSFileShareDefaults.getDirectoryMode(), DIRECTORYMODE_BINDING);
            protocolMarshaller.marshall(nFSFileShareDefaults.getGroupId(), GROUPID_BINDING);
            protocolMarshaller.marshall(nFSFileShareDefaults.getOwnerId(), OWNERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
