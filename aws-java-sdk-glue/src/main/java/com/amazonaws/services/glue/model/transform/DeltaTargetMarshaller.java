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
 * DeltaTargetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeltaTargetMarshaller {

    private static final MarshallingInfo<List> DELTATABLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeltaTables").build();
    private static final MarshallingInfo<String> CONNECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionName").build();
    private static final MarshallingInfo<Boolean> WRITEMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WriteManifest").build();
    private static final MarshallingInfo<Boolean> CREATENATIVEDELTATABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateNativeDeltaTable").build();

    private static final DeltaTargetMarshaller instance = new DeltaTargetMarshaller();

    public static DeltaTargetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeltaTarget deltaTarget, ProtocolMarshaller protocolMarshaller) {

        if (deltaTarget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deltaTarget.getDeltaTables(), DELTATABLES_BINDING);
            protocolMarshaller.marshall(deltaTarget.getConnectionName(), CONNECTIONNAME_BINDING);
            protocolMarshaller.marshall(deltaTarget.getWriteManifest(), WRITEMANIFEST_BINDING);
            protocolMarshaller.marshall(deltaTarget.getCreateNativeDeltaTable(), CREATENATIVEDELTATABLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
