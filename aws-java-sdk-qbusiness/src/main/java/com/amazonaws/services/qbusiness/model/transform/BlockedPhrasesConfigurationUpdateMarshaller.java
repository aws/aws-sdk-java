/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BlockedPhrasesConfigurationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BlockedPhrasesConfigurationUpdateMarshaller {

    private static final MarshallingInfo<List> BLOCKEDPHRASESTOCREATEORUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockedPhrasesToCreateOrUpdate").build();
    private static final MarshallingInfo<List> BLOCKEDPHRASESTODELETE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockedPhrasesToDelete").build();
    private static final MarshallingInfo<String> SYSTEMMESSAGEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("systemMessageOverride").build();

    private static final BlockedPhrasesConfigurationUpdateMarshaller instance = new BlockedPhrasesConfigurationUpdateMarshaller();

    public static BlockedPhrasesConfigurationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BlockedPhrasesConfigurationUpdate blockedPhrasesConfigurationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (blockedPhrasesConfigurationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(blockedPhrasesConfigurationUpdate.getBlockedPhrasesToCreateOrUpdate(), BLOCKEDPHRASESTOCREATEORUPDATE_BINDING);
            protocolMarshaller.marshall(blockedPhrasesConfigurationUpdate.getBlockedPhrasesToDelete(), BLOCKEDPHRASESTODELETE_BINDING);
            protocolMarshaller.marshall(blockedPhrasesConfigurationUpdate.getSystemMessageOverride(), SYSTEMMESSAGEOVERRIDE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
