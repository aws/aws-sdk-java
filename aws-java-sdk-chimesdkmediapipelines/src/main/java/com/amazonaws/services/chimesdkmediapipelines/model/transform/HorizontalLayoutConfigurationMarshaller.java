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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HorizontalLayoutConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HorizontalLayoutConfigurationMarshaller {

    private static final MarshallingInfo<String> TILEORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TileOrder").build();
    private static final MarshallingInfo<String> TILEPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TilePosition").build();
    private static final MarshallingInfo<Integer> TILECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TileCount").build();
    private static final MarshallingInfo<String> TILEASPECTRATIO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TileAspectRatio").build();

    private static final HorizontalLayoutConfigurationMarshaller instance = new HorizontalLayoutConfigurationMarshaller();

    public static HorizontalLayoutConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HorizontalLayoutConfiguration horizontalLayoutConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (horizontalLayoutConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(horizontalLayoutConfiguration.getTileOrder(), TILEORDER_BINDING);
            protocolMarshaller.marshall(horizontalLayoutConfiguration.getTilePosition(), TILEPOSITION_BINDING);
            protocolMarshaller.marshall(horizontalLayoutConfiguration.getTileCount(), TILECOUNT_BINDING);
            protocolMarshaller.marshall(horizontalLayoutConfiguration.getTileAspectRatio(), TILEASPECTRATIO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
