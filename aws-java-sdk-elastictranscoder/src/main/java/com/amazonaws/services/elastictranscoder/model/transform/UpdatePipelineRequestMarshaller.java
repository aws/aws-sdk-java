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
package com.amazonaws.services.elastictranscoder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePipelineRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePipelineRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> INPUTBUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputBucket").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<String> AWSKMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsKmsKeyArn").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Notifications").build();
    private static final MarshallingInfo<StructuredPojo> CONTENTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentConfig").build();
    private static final MarshallingInfo<StructuredPojo> THUMBNAILCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThumbnailConfig").build();

    private static final UpdatePipelineRequestMarshaller instance = new UpdatePipelineRequestMarshaller();

    public static UpdatePipelineRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePipelineRequest updatePipelineRequest, ProtocolMarshaller protocolMarshaller) {

        if (updatePipelineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePipelineRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(updatePipelineRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updatePipelineRequest.getInputBucket(), INPUTBUCKET_BINDING);
            protocolMarshaller.marshall(updatePipelineRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(updatePipelineRequest.getAwsKmsKeyArn(), AWSKMSKEYARN_BINDING);
            protocolMarshaller.marshall(updatePipelineRequest.getNotifications(), NOTIFICATIONS_BINDING);
            protocolMarshaller.marshall(updatePipelineRequest.getContentConfig(), CONTENTCONFIG_BINDING);
            protocolMarshaller.marshall(updatePipelineRequest.getThumbnailConfig(), THUMBNAILCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
