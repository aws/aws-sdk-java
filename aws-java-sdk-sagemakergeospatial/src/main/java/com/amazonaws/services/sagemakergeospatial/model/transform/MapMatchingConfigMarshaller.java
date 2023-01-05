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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakergeospatial.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MapMatchingConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MapMatchingConfigMarshaller {

    private static final MarshallingInfo<String> IDATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdAttributeName").build();
    private static final MarshallingInfo<String> TIMESTAMPATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimestampAttributeName").build();
    private static final MarshallingInfo<String> XATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XAttributeName").build();
    private static final MarshallingInfo<String> YATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("YAttributeName").build();

    private static final MapMatchingConfigMarshaller instance = new MapMatchingConfigMarshaller();

    public static MapMatchingConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MapMatchingConfig mapMatchingConfig, ProtocolMarshaller protocolMarshaller) {

        if (mapMatchingConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mapMatchingConfig.getIdAttributeName(), IDATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(mapMatchingConfig.getTimestampAttributeName(), TIMESTAMPATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(mapMatchingConfig.getXAttributeName(), XATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(mapMatchingConfig.getYAttributeName(), YATTRIBUTENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
