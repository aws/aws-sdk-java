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
package com.amazonaws.services.customerprofiles.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DetectedProfileObjectTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DetectedProfileObjectTypeMarshaller {

    private static final MarshallingInfo<String> SOURCELASTUPDATEDTIMESTAMPFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceLastUpdatedTimestampFormat").build();
    private static final MarshallingInfo<Map> FIELDS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Fields").build();
    private static final MarshallingInfo<Map> KEYS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keys").build();

    private static final DetectedProfileObjectTypeMarshaller instance = new DetectedProfileObjectTypeMarshaller();

    public static DetectedProfileObjectTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DetectedProfileObjectType detectedProfileObjectType, ProtocolMarshaller protocolMarshaller) {

        if (detectedProfileObjectType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(detectedProfileObjectType.getSourceLastUpdatedTimestampFormat(), SOURCELASTUPDATEDTIMESTAMPFORMAT_BINDING);
            protocolMarshaller.marshall(detectedProfileObjectType.getFields(), FIELDS_BINDING);
            protocolMarshaller.marshall(detectedProfileObjectType.getKeys(), KEYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
