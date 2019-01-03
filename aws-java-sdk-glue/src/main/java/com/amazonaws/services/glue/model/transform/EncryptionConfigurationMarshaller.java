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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EncryptionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EncryptionConfigurationMarshaller {

    private static final MarshallingInfo<List> S3ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Encryption").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchEncryption").build();
    private static final MarshallingInfo<StructuredPojo> JOBBOOKMARKSENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobBookmarksEncryption").build();

    private static final EncryptionConfigurationMarshaller instance = new EncryptionConfigurationMarshaller();

    public static EncryptionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EncryptionConfiguration encryptionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (encryptionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(encryptionConfiguration.getS3Encryption(), S3ENCRYPTION_BINDING);
            protocolMarshaller.marshall(encryptionConfiguration.getCloudWatchEncryption(), CLOUDWATCHENCRYPTION_BINDING);
            protocolMarshaller.marshall(encryptionConfiguration.getJobBookmarksEncryption(), JOBBOOKMARKSENCRYPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
