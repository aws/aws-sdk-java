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
package com.amazonaws.services.bedrockagent.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3DataSourceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3DataSourceConfigurationMarshaller {

    private static final MarshallingInfo<String> BUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bucketArn").build();
    private static final MarshallingInfo<String> BUCKETOWNERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketOwnerAccountId").build();
    private static final MarshallingInfo<List> INCLUSIONPREFIXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inclusionPrefixes").build();

    private static final S3DataSourceConfigurationMarshaller instance = new S3DataSourceConfigurationMarshaller();

    public static S3DataSourceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3DataSourceConfiguration s3DataSourceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (s3DataSourceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3DataSourceConfiguration.getBucketArn(), BUCKETARN_BINDING);
            protocolMarshaller.marshall(s3DataSourceConfiguration.getBucketOwnerAccountId(), BUCKETOWNERACCOUNTID_BINDING);
            protocolMarshaller.marshall(s3DataSourceConfiguration.getInclusionPrefixes(), INCLUSIONPREFIXES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
