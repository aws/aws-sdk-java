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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QuickConnectConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QuickConnectConfigMarshaller {

    private static final MarshallingInfo<String> QUICKCONNECTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuickConnectType").build();
    private static final MarshallingInfo<StructuredPojo> USERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserConfig").build();
    private static final MarshallingInfo<StructuredPojo> QUEUECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueueConfig").build();
    private static final MarshallingInfo<StructuredPojo> PHONECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneConfig").build();

    private static final QuickConnectConfigMarshaller instance = new QuickConnectConfigMarshaller();

    public static QuickConnectConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QuickConnectConfig quickConnectConfig, ProtocolMarshaller protocolMarshaller) {

        if (quickConnectConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(quickConnectConfig.getQuickConnectType(), QUICKCONNECTTYPE_BINDING);
            protocolMarshaller.marshall(quickConnectConfig.getUserConfig(), USERCONFIG_BINDING);
            protocolMarshaller.marshall(quickConnectConfig.getQueueConfig(), QUEUECONFIG_BINDING);
            protocolMarshaller.marshall(quickConnectConfig.getPhoneConfig(), PHONECONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
