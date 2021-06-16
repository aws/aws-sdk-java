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
package com.amazonaws.services.kms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MultiRegionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MultiRegionConfigurationMarshaller {

    private static final MarshallingInfo<String> MULTIREGIONKEYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MultiRegionKeyType").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryKey").build();
    private static final MarshallingInfo<List> REPLICAKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReplicaKeys").build();

    private static final MultiRegionConfigurationMarshaller instance = new MultiRegionConfigurationMarshaller();

    public static MultiRegionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MultiRegionConfiguration multiRegionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (multiRegionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(multiRegionConfiguration.getMultiRegionKeyType(), MULTIREGIONKEYTYPE_BINDING);
            protocolMarshaller.marshall(multiRegionConfiguration.getPrimaryKey(), PRIMARYKEY_BINDING);
            protocolMarshaller.marshall(multiRegionConfiguration.getReplicaKeys(), REPLICAKEYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
