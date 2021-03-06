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
package com.amazonaws.services.guardduty.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3LogsConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3LogsConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> ENABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("enable").build();

    private static final S3LogsConfigurationMarshaller instance = new S3LogsConfigurationMarshaller();

    public static S3LogsConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3LogsConfiguration s3LogsConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (s3LogsConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3LogsConfiguration.getEnable(), ENABLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
