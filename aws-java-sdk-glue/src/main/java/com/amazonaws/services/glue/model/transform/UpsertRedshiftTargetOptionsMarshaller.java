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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpsertRedshiftTargetOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpsertRedshiftTargetOptionsMarshaller {

    private static final MarshallingInfo<String> TABLELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableLocation").build();
    private static final MarshallingInfo<String> CONNECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionName").build();
    private static final MarshallingInfo<List> UPSERTKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UpsertKeys").build();

    private static final UpsertRedshiftTargetOptionsMarshaller instance = new UpsertRedshiftTargetOptionsMarshaller();

    public static UpsertRedshiftTargetOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpsertRedshiftTargetOptions upsertRedshiftTargetOptions, ProtocolMarshaller protocolMarshaller) {

        if (upsertRedshiftTargetOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(upsertRedshiftTargetOptions.getTableLocation(), TABLELOCATION_BINDING);
            protocolMarshaller.marshall(upsertRedshiftTargetOptions.getConnectionName(), CONNECTIONNAME_BINDING);
            protocolMarshaller.marshall(upsertRedshiftTargetOptions.getUpsertKeys(), UPSERTKEYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
