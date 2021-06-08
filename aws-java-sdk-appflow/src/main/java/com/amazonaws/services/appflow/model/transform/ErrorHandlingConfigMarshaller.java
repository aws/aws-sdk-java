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
 * ErrorHandlingConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ErrorHandlingConfigMarshaller {

    private static final MarshallingInfo<Boolean> FAILONFIRSTDESTINATIONERROR_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failOnFirstDestinationError").build();
    private static final MarshallingInfo<String> BUCKETPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketPrefix").build();
    private static final MarshallingInfo<String> BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketName").build();

    private static final ErrorHandlingConfigMarshaller instance = new ErrorHandlingConfigMarshaller();

    public static ErrorHandlingConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ErrorHandlingConfig errorHandlingConfig, ProtocolMarshaller protocolMarshaller) {

        if (errorHandlingConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(errorHandlingConfig.getFailOnFirstDestinationError(), FAILONFIRSTDESTINATIONERROR_BINDING);
            protocolMarshaller.marshall(errorHandlingConfig.getBucketPrefix(), BUCKETPREFIX_BINDING);
            protocolMarshaller.marshall(errorHandlingConfig.getBucketName(), BUCKETNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
