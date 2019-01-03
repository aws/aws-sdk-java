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
package com.amazonaws.services.snowball.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataTransferMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataTransferMarshaller {

    private static final MarshallingInfo<Long> BYTESTRANSFERRED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BytesTransferred").build();
    private static final MarshallingInfo<Long> OBJECTSTRANSFERRED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectsTransferred").build();
    private static final MarshallingInfo<Long> TOTALBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TotalBytes").build();
    private static final MarshallingInfo<Long> TOTALOBJECTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TotalObjects").build();

    private static final DataTransferMarshaller instance = new DataTransferMarshaller();

    public static DataTransferMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataTransfer dataTransfer, ProtocolMarshaller protocolMarshaller) {

        if (dataTransfer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataTransfer.getBytesTransferred(), BYTESTRANSFERRED_BINDING);
            protocolMarshaller.marshall(dataTransfer.getObjectsTransferred(), OBJECTSTRANSFERRED_BINDING);
            protocolMarshaller.marshall(dataTransfer.getTotalBytes(), TOTALBYTES_BINDING);
            protocolMarshaller.marshall(dataTransfer.getTotalObjects(), TOTALOBJECTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
