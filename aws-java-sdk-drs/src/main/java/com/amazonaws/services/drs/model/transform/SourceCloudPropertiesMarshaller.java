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
package com.amazonaws.services.drs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.drs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SourceCloudPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceCloudPropertiesMarshaller {

    private static final MarshallingInfo<String> ORIGINACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("originAccountID").build();
    private static final MarshallingInfo<String> ORIGINAVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("originAvailabilityZone").build();
    private static final MarshallingInfo<String> ORIGINREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("originRegion").build();

    private static final SourceCloudPropertiesMarshaller instance = new SourceCloudPropertiesMarshaller();

    public static SourceCloudPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceCloudProperties sourceCloudProperties, ProtocolMarshaller protocolMarshaller) {

        if (sourceCloudProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceCloudProperties.getOriginAccountID(), ORIGINACCOUNTID_BINDING);
            protocolMarshaller.marshall(sourceCloudProperties.getOriginAvailabilityZone(), ORIGINAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(sourceCloudProperties.getOriginRegion(), ORIGINREGION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
