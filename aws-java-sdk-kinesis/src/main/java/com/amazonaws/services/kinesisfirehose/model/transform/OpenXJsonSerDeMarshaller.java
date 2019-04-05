/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OpenXJsonSerDeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OpenXJsonSerDeMarshaller {

    private static final MarshallingInfo<Boolean> CONVERTDOTSINJSONKEYSTOUNDERSCORES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConvertDotsInJsonKeysToUnderscores").build();
    private static final MarshallingInfo<Boolean> CASEINSENSITIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CaseInsensitive").build();
    private static final MarshallingInfo<Map> COLUMNTOJSONKEYMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnToJsonKeyMappings").build();

    private static final OpenXJsonSerDeMarshaller instance = new OpenXJsonSerDeMarshaller();

    public static OpenXJsonSerDeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OpenXJsonSerDe openXJsonSerDe, ProtocolMarshaller protocolMarshaller) {

        if (openXJsonSerDe == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(openXJsonSerDe.getConvertDotsInJsonKeysToUnderscores(), CONVERTDOTSINJSONKEYSTOUNDERSCORES_BINDING);
            protocolMarshaller.marshall(openXJsonSerDe.getCaseInsensitive(), CASEINSENSITIVE_BINDING);
            protocolMarshaller.marshall(openXJsonSerDe.getColumnToJsonKeyMappings(), COLUMNTOJSONKEYMAPPINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
