/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeltaSyncConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeltaSyncConfigMarshaller {

    private static final MarshallingInfo<Long> BASETABLETTL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("baseTableTTL").build();
    private static final MarshallingInfo<String> DELTASYNCTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deltaSyncTableName").build();
    private static final MarshallingInfo<Long> DELTASYNCTABLETTL_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deltaSyncTableTTL").build();

    private static final DeltaSyncConfigMarshaller instance = new DeltaSyncConfigMarshaller();

    public static DeltaSyncConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeltaSyncConfig deltaSyncConfig, ProtocolMarshaller protocolMarshaller) {

        if (deltaSyncConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deltaSyncConfig.getBaseTableTTL(), BASETABLETTL_BINDING);
            protocolMarshaller.marshall(deltaSyncConfig.getDeltaSyncTableName(), DELTASYNCTABLENAME_BINDING);
            protocolMarshaller.marshall(deltaSyncConfig.getDeltaSyncTableTTL(), DELTASYNCTABLETTL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
