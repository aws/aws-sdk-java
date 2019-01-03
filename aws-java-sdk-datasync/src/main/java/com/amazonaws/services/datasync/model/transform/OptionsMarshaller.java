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
package com.amazonaws.services.datasync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OptionsMarshaller {

    private static final MarshallingInfo<String> VERIFYMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerifyMode").build();
    private static final MarshallingInfo<String> ATIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Atime").build();
    private static final MarshallingInfo<String> MTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mtime").build();
    private static final MarshallingInfo<String> UID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Uid").build();
    private static final MarshallingInfo<String> GID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Gid").build();
    private static final MarshallingInfo<String> PRESERVEDELETEDFILES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreserveDeletedFiles").build();
    private static final MarshallingInfo<String> PRESERVEDEVICES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreserveDevices").build();
    private static final MarshallingInfo<String> POSIXPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PosixPermissions").build();
    private static final MarshallingInfo<Long> BYTESPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BytesPerSecond").build();

    private static final OptionsMarshaller instance = new OptionsMarshaller();

    public static OptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Options options, ProtocolMarshaller protocolMarshaller) {

        if (options == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(options.getVerifyMode(), VERIFYMODE_BINDING);
            protocolMarshaller.marshall(options.getAtime(), ATIME_BINDING);
            protocolMarshaller.marshall(options.getMtime(), MTIME_BINDING);
            protocolMarshaller.marshall(options.getUid(), UID_BINDING);
            protocolMarshaller.marshall(options.getGid(), GID_BINDING);
            protocolMarshaller.marshall(options.getPreserveDeletedFiles(), PRESERVEDELETEDFILES_BINDING);
            protocolMarshaller.marshall(options.getPreserveDevices(), PRESERVEDEVICES_BINDING);
            protocolMarshaller.marshall(options.getPosixPermissions(), POSIXPERMISSIONS_BINDING);
            protocolMarshaller.marshall(options.getBytesPerSecond(), BYTESPERSECOND_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
