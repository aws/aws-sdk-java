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
 * InAppMessageHeaderConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InAppMessageHeaderConfigMarshaller {

    private static final MarshallingInfo<String> ALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Alignment").build();
    private static final MarshallingInfo<String> HEADER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Header").build();
    private static final MarshallingInfo<String> TEXTCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TextColor").build();

    private static final InAppMessageHeaderConfigMarshaller instance = new InAppMessageHeaderConfigMarshaller();

    public static InAppMessageHeaderConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InAppMessageHeaderConfig inAppMessageHeaderConfig, ProtocolMarshaller protocolMarshaller) {

        if (inAppMessageHeaderConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inAppMessageHeaderConfig.getAlignment(), ALIGNMENT_BINDING);
            protocolMarshaller.marshall(inAppMessageHeaderConfig.getHeader(), HEADER_BINDING);
            protocolMarshaller.marshall(inAppMessageHeaderConfig.getTextColor(), TEXTCOLOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
