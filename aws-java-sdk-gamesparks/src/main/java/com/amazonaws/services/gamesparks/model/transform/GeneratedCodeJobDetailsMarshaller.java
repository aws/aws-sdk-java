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
package com.amazonaws.services.gamesparks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamesparks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GeneratedCodeJobDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GeneratedCodeJobDetailsMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> GENERATEDCODEJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeneratedCodeJobId").build();
    private static final MarshallingInfo<String> S3URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Url").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final GeneratedCodeJobDetailsMarshaller instance = new GeneratedCodeJobDetailsMarshaller();

    public static GeneratedCodeJobDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GeneratedCodeJobDetails generatedCodeJobDetails, ProtocolMarshaller protocolMarshaller) {

        if (generatedCodeJobDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(generatedCodeJobDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(generatedCodeJobDetails.getExpirationTime(), EXPIRATIONTIME_BINDING);
            protocolMarshaller.marshall(generatedCodeJobDetails.getGeneratedCodeJobId(), GENERATEDCODEJOBID_BINDING);
            protocolMarshaller.marshall(generatedCodeJobDetails.getS3Url(), S3URL_BINDING);
            protocolMarshaller.marshall(generatedCodeJobDetails.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
