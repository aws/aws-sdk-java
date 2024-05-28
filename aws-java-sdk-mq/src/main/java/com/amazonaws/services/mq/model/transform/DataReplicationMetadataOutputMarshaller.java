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
package com.amazonaws.services.mq.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mq.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataReplicationMetadataOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataReplicationMetadataOutputMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATAREPLICATIONCOUNTERPART_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataReplicationCounterpart").build();
    private static final MarshallingInfo<String> DATAREPLICATIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataReplicationRole").build();

    private static final DataReplicationMetadataOutputMarshaller instance = new DataReplicationMetadataOutputMarshaller();

    public static DataReplicationMetadataOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataReplicationMetadataOutput dataReplicationMetadataOutput, ProtocolMarshaller protocolMarshaller) {

        if (dataReplicationMetadataOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataReplicationMetadataOutput.getDataReplicationCounterpart(), DATAREPLICATIONCOUNTERPART_BINDING);
            protocolMarshaller.marshall(dataReplicationMetadataOutput.getDataReplicationRole(), DATAREPLICATIONROLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
