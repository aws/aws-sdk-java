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
package com.amazonaws.services.storagegateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TapeArchiveMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TapeArchiveMarshaller {

    private static final MarshallingInfo<String> TAPEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TapeARN").build();
    private static final MarshallingInfo<String> TAPEBARCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeBarcode").build();
    private static final MarshallingInfo<java.util.Date> TAPECREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeCreatedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> TAPESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeSizeInBytes").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RETRIEVEDTO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrievedTo").build();
    private static final MarshallingInfo<String> TAPESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeStatus").build();
    private static final MarshallingInfo<Long> TAPEUSEDINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeUsedInBytes").build();
    private static final MarshallingInfo<String> KMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KMSKey").build();
    private static final MarshallingInfo<String> POOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PoolId").build();

    private static final TapeArchiveMarshaller instance = new TapeArchiveMarshaller();

    public static TapeArchiveMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TapeArchive tapeArchive, ProtocolMarshaller protocolMarshaller) {

        if (tapeArchive == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tapeArchive.getTapeARN(), TAPEARN_BINDING);
            protocolMarshaller.marshall(tapeArchive.getTapeBarcode(), TAPEBARCODE_BINDING);
            protocolMarshaller.marshall(tapeArchive.getTapeCreatedDate(), TAPECREATEDDATE_BINDING);
            protocolMarshaller.marshall(tapeArchive.getTapeSizeInBytes(), TAPESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(tapeArchive.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(tapeArchive.getRetrievedTo(), RETRIEVEDTO_BINDING);
            protocolMarshaller.marshall(tapeArchive.getTapeStatus(), TAPESTATUS_BINDING);
            protocolMarshaller.marshall(tapeArchive.getTapeUsedInBytes(), TAPEUSEDINBYTES_BINDING);
            protocolMarshaller.marshall(tapeArchive.getKMSKey(), KMSKEY_BINDING);
            protocolMarshaller.marshall(tapeArchive.getPoolId(), POOLID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
