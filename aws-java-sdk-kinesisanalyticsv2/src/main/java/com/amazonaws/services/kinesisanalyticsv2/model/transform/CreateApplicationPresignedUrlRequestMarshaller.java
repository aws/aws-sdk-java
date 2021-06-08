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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateApplicationPresignedUrlRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateApplicationPresignedUrlRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationName").build();
    private static final MarshallingInfo<String> URLTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UrlType").build();
    private static final MarshallingInfo<Long> SESSIONEXPIRATIONDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionExpirationDurationInSeconds").build();

    private static final CreateApplicationPresignedUrlRequestMarshaller instance = new CreateApplicationPresignedUrlRequestMarshaller();

    public static CreateApplicationPresignedUrlRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateApplicationPresignedUrlRequest createApplicationPresignedUrlRequest, ProtocolMarshaller protocolMarshaller) {

        if (createApplicationPresignedUrlRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createApplicationPresignedUrlRequest.getApplicationName(), APPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(createApplicationPresignedUrlRequest.getUrlType(), URLTYPE_BINDING);
            protocolMarshaller.marshall(createApplicationPresignedUrlRequest.getSessionExpirationDurationInSeconds(),
                    SESSIONEXPIRATIONDURATIONINSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
