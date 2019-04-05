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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputSchemaUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputSchemaUpdateMarshaller {

    private static final MarshallingInfo<StructuredPojo> RECORDFORMATUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordFormatUpdate").build();
    private static final MarshallingInfo<String> RECORDENCODINGUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordEncodingUpdate").build();
    private static final MarshallingInfo<List> RECORDCOLUMNUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordColumnUpdates").build();

    private static final InputSchemaUpdateMarshaller instance = new InputSchemaUpdateMarshaller();

    public static InputSchemaUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputSchemaUpdate inputSchemaUpdate, ProtocolMarshaller protocolMarshaller) {

        if (inputSchemaUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputSchemaUpdate.getRecordFormatUpdate(), RECORDFORMATUPDATE_BINDING);
            protocolMarshaller.marshall(inputSchemaUpdate.getRecordEncodingUpdate(), RECORDENCODINGUPDATE_BINDING);
            protocolMarshaller.marshall(inputSchemaUpdate.getRecordColumnUpdates(), RECORDCOLUMNUPDATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
