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
 * InAppMessageButtonMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InAppMessageButtonMarshaller {

    private static final MarshallingInfo<StructuredPojo> ANDROID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Android").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultConfig").build();
    private static final MarshallingInfo<StructuredPojo> IOS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IOS").build();
    private static final MarshallingInfo<StructuredPojo> WEB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Web").build();

    private static final InAppMessageButtonMarshaller instance = new InAppMessageButtonMarshaller();

    public static InAppMessageButtonMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InAppMessageButton inAppMessageButton, ProtocolMarshaller protocolMarshaller) {

        if (inAppMessageButton == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inAppMessageButton.getAndroid(), ANDROID_BINDING);
            protocolMarshaller.marshall(inAppMessageButton.getDefaultConfig(), DEFAULTCONFIG_BINDING);
            protocolMarshaller.marshall(inAppMessageButton.getIOS(), IOS_BINDING);
            protocolMarshaller.marshall(inAppMessageButton.getWeb(), WEB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
