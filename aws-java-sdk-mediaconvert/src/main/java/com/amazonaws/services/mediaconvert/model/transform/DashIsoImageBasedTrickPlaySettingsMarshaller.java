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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DashIsoImageBasedTrickPlaySettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DashIsoImageBasedTrickPlaySettingsMarshaller {

    private static final MarshallingInfo<String> INTERVALCADENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intervalCadence").build();
    private static final MarshallingInfo<Integer> THUMBNAILHEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thumbnailHeight").build();
    private static final MarshallingInfo<Double> THUMBNAILINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thumbnailInterval").build();
    private static final MarshallingInfo<Integer> THUMBNAILWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thumbnailWidth").build();
    private static final MarshallingInfo<Integer> TILEHEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tileHeight").build();
    private static final MarshallingInfo<Integer> TILEWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tileWidth").build();

    private static final DashIsoImageBasedTrickPlaySettingsMarshaller instance = new DashIsoImageBasedTrickPlaySettingsMarshaller();

    public static DashIsoImageBasedTrickPlaySettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DashIsoImageBasedTrickPlaySettings dashIsoImageBasedTrickPlaySettings, ProtocolMarshaller protocolMarshaller) {

        if (dashIsoImageBasedTrickPlaySettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dashIsoImageBasedTrickPlaySettings.getIntervalCadence(), INTERVALCADENCE_BINDING);
            protocolMarshaller.marshall(dashIsoImageBasedTrickPlaySettings.getThumbnailHeight(), THUMBNAILHEIGHT_BINDING);
            protocolMarshaller.marshall(dashIsoImageBasedTrickPlaySettings.getThumbnailInterval(), THUMBNAILINTERVAL_BINDING);
            protocolMarshaller.marshall(dashIsoImageBasedTrickPlaySettings.getThumbnailWidth(), THUMBNAILWIDTH_BINDING);
            protocolMarshaller.marshall(dashIsoImageBasedTrickPlaySettings.getTileHeight(), TILEHEIGHT_BINDING);
            protocolMarshaller.marshall(dashIsoImageBasedTrickPlaySettings.getTileWidth(), TILEWIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
