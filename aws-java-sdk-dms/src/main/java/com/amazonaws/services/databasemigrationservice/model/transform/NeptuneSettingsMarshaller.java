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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NeptuneSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NeptuneSettingsMarshaller {

    private static final MarshallingInfo<String> SERVICEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessRoleArn").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketName").build();
    private static final MarshallingInfo<String> S3BUCKETFOLDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketFolder").build();
    private static final MarshallingInfo<Integer> ERRORRETRYDURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorRetryDuration").build();
    private static final MarshallingInfo<Integer> MAXFILESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxFileSize").build();
    private static final MarshallingInfo<Integer> MAXRETRYCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRetryCount").build();
    private static final MarshallingInfo<Boolean> IAMAUTHENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamAuthEnabled").build();

    private static final NeptuneSettingsMarshaller instance = new NeptuneSettingsMarshaller();

    public static NeptuneSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NeptuneSettings neptuneSettings, ProtocolMarshaller protocolMarshaller) {

        if (neptuneSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(neptuneSettings.getServiceAccessRoleArn(), SERVICEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(neptuneSettings.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(neptuneSettings.getS3BucketFolder(), S3BUCKETFOLDER_BINDING);
            protocolMarshaller.marshall(neptuneSettings.getErrorRetryDuration(), ERRORRETRYDURATION_BINDING);
            protocolMarshaller.marshall(neptuneSettings.getMaxFileSize(), MAXFILESIZE_BINDING);
            protocolMarshaller.marshall(neptuneSettings.getMaxRetryCount(), MAXRETRYCOUNT_BINDING);
            protocolMarshaller.marshall(neptuneSettings.getIamAuthEnabled(), IAMAUTHENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
