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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ParquetSerDeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParquetSerDeMarshaller {

    private static final MarshallingInfo<Integer> BLOCKSIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockSizeBytes").build();
    private static final MarshallingInfo<Integer> PAGESIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PageSizeBytes").build();
    private static final MarshallingInfo<String> COMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Compression").build();
    private static final MarshallingInfo<Boolean> ENABLEDICTIONARYCOMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableDictionaryCompression").build();
    private static final MarshallingInfo<Integer> MAXPADDINGBYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxPaddingBytes").build();
    private static final MarshallingInfo<String> WRITERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WriterVersion").build();

    private static final ParquetSerDeMarshaller instance = new ParquetSerDeMarshaller();

    public static ParquetSerDeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParquetSerDe parquetSerDe, ProtocolMarshaller protocolMarshaller) {

        if (parquetSerDe == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parquetSerDe.getBlockSizeBytes(), BLOCKSIZEBYTES_BINDING);
            protocolMarshaller.marshall(parquetSerDe.getPageSizeBytes(), PAGESIZEBYTES_BINDING);
            protocolMarshaller.marshall(parquetSerDe.getCompression(), COMPRESSION_BINDING);
            protocolMarshaller.marshall(parquetSerDe.getEnableDictionaryCompression(), ENABLEDICTIONARYCOMPRESSION_BINDING);
            protocolMarshaller.marshall(parquetSerDe.getMaxPaddingBytes(), MAXPADDINGBYTES_BINDING);
            protocolMarshaller.marshall(parquetSerDe.getWriterVersion(), WRITERVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
