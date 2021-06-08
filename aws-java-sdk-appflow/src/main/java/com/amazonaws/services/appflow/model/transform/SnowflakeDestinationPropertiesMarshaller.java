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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SnowflakeDestinationPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnowflakeDestinationPropertiesMarshaller {

    private static final MarshallingInfo<String> OBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("object").build();
    private static final MarshallingInfo<String> INTERMEDIATEBUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intermediateBucketName").build();
    private static final MarshallingInfo<String> BUCKETPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketPrefix").build();
    private static final MarshallingInfo<StructuredPojo> ERRORHANDLINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorHandlingConfig").build();

    private static final SnowflakeDestinationPropertiesMarshaller instance = new SnowflakeDestinationPropertiesMarshaller();

    public static SnowflakeDestinationPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnowflakeDestinationProperties snowflakeDestinationProperties, ProtocolMarshaller protocolMarshaller) {

        if (snowflakeDestinationProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snowflakeDestinationProperties.getObject(), OBJECT_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationProperties.getIntermediateBucketName(), INTERMEDIATEBUCKETNAME_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationProperties.getBucketPrefix(), BUCKETPREFIX_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationProperties.getErrorHandlingConfig(), ERRORHANDLINGCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
