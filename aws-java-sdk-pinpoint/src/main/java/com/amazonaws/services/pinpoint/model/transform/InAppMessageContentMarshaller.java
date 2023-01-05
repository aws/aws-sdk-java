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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InAppMessageContentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InAppMessageContentMarshaller {

    private static final MarshallingInfo<String> BACKGROUNDCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackgroundColor").build();
    private static final MarshallingInfo<StructuredPojo> BODYCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BodyConfig").build();
    private static final MarshallingInfo<StructuredPojo> HEADERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeaderConfig").build();
    private static final MarshallingInfo<String> IMAGEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageUrl").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYBTN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryBtn").build();
    private static final MarshallingInfo<StructuredPojo> SECONDARYBTN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryBtn").build();

    private static final InAppMessageContentMarshaller instance = new InAppMessageContentMarshaller();

    public static InAppMessageContentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InAppMessageContent inAppMessageContent, ProtocolMarshaller protocolMarshaller) {

        if (inAppMessageContent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inAppMessageContent.getBackgroundColor(), BACKGROUNDCOLOR_BINDING);
            protocolMarshaller.marshall(inAppMessageContent.getBodyConfig(), BODYCONFIG_BINDING);
            protocolMarshaller.marshall(inAppMessageContent.getHeaderConfig(), HEADERCONFIG_BINDING);
            protocolMarshaller.marshall(inAppMessageContent.getImageUrl(), IMAGEURL_BINDING);
            protocolMarshaller.marshall(inAppMessageContent.getPrimaryBtn(), PRIMARYBTN_BINDING);
            protocolMarshaller.marshall(inAppMessageContent.getSecondaryBtn(), SECONDARYBTN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
