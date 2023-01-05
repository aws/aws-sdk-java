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
package com.amazonaws.services.securitylake.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LakeConfigurationResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LakeConfigurationResponseMarshaller {

    private static final MarshallingInfo<String> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionKey").build();
    private static final MarshallingInfo<List> REPLICATIONDESTINATIONREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationDestinationRegions").build();
    private static final MarshallingInfo<String> REPLICATIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationRoleArn").build();
    private static final MarshallingInfo<List> RETENTIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retentionSettings").build();
    private static final MarshallingInfo<String> S3BUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> TAGSMAP_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tagsMap").build();

    private static final LakeConfigurationResponseMarshaller instance = new LakeConfigurationResponseMarshaller();

    public static LakeConfigurationResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LakeConfigurationResponse lakeConfigurationResponse, ProtocolMarshaller protocolMarshaller) {

        if (lakeConfigurationResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lakeConfigurationResponse.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(lakeConfigurationResponse.getReplicationDestinationRegions(), REPLICATIONDESTINATIONREGIONS_BINDING);
            protocolMarshaller.marshall(lakeConfigurationResponse.getReplicationRoleArn(), REPLICATIONROLEARN_BINDING);
            protocolMarshaller.marshall(lakeConfigurationResponse.getRetentionSettings(), RETENTIONSETTINGS_BINDING);
            protocolMarshaller.marshall(lakeConfigurationResponse.getS3BucketArn(), S3BUCKETARN_BINDING);
            protocolMarshaller.marshall(lakeConfigurationResponse.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(lakeConfigurationResponse.getTagsMap(), TAGSMAP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
