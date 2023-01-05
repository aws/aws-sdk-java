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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3DataRepositoryConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3DataRepositoryConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> AUTOIMPORTPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoImportPolicy").build();
    private static final MarshallingInfo<StructuredPojo> AUTOEXPORTPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoExportPolicy").build();

    private static final S3DataRepositoryConfigurationMarshaller instance = new S3DataRepositoryConfigurationMarshaller();

    public static S3DataRepositoryConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3DataRepositoryConfiguration s3DataRepositoryConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (s3DataRepositoryConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3DataRepositoryConfiguration.getAutoImportPolicy(), AUTOIMPORTPOLICY_BINDING);
            protocolMarshaller.marshall(s3DataRepositoryConfiguration.getAutoExportPolicy(), AUTOEXPORTPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
