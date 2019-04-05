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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrcSerDeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrcSerDeMarshaller {

    private static final MarshallingInfo<Integer> STRIPESIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StripeSizeBytes").build();
    private static final MarshallingInfo<Integer> BLOCKSIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockSizeBytes").build();
    private static final MarshallingInfo<Integer> ROWINDEXSTRIDE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowIndexStride").build();
    private static final MarshallingInfo<Boolean> ENABLEPADDING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnablePadding").build();
    private static final MarshallingInfo<Double> PADDINGTOLERANCE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaddingTolerance").build();
    private static final MarshallingInfo<String> COMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Compression").build();
    private static final MarshallingInfo<List> BLOOMFILTERCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BloomFilterColumns").build();
    private static final MarshallingInfo<Double> BLOOMFILTERFALSEPOSITIVEPROBABILITY_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BloomFilterFalsePositiveProbability").build();
    private static final MarshallingInfo<Double> DICTIONARYKEYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DictionaryKeyThreshold").build();
    private static final MarshallingInfo<String> FORMATVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FormatVersion").build();

    private static final OrcSerDeMarshaller instance = new OrcSerDeMarshaller();

    public static OrcSerDeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrcSerDe orcSerDe, ProtocolMarshaller protocolMarshaller) {

        if (orcSerDe == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(orcSerDe.getStripeSizeBytes(), STRIPESIZEBYTES_BINDING);
            protocolMarshaller.marshall(orcSerDe.getBlockSizeBytes(), BLOCKSIZEBYTES_BINDING);
            protocolMarshaller.marshall(orcSerDe.getRowIndexStride(), ROWINDEXSTRIDE_BINDING);
            protocolMarshaller.marshall(orcSerDe.getEnablePadding(), ENABLEPADDING_BINDING);
            protocolMarshaller.marshall(orcSerDe.getPaddingTolerance(), PADDINGTOLERANCE_BINDING);
            protocolMarshaller.marshall(orcSerDe.getCompression(), COMPRESSION_BINDING);
            protocolMarshaller.marshall(orcSerDe.getBloomFilterColumns(), BLOOMFILTERCOLUMNS_BINDING);
            protocolMarshaller.marshall(orcSerDe.getBloomFilterFalsePositiveProbability(), BLOOMFILTERFALSEPOSITIVEPROBABILITY_BINDING);
            protocolMarshaller.marshall(orcSerDe.getDictionaryKeyThreshold(), DICTIONARYKEYTHRESHOLD_BINDING);
            protocolMarshaller.marshall(orcSerDe.getFormatVersion(), FORMATVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
