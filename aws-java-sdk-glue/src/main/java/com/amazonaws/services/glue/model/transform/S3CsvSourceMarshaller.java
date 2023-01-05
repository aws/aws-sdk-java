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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3CsvSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3CsvSourceMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> PATHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Paths").build();
    private static final MarshallingInfo<String> COMPRESSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompressionType").build();
    private static final MarshallingInfo<List> EXCLUSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Exclusions").build();
    private static final MarshallingInfo<String> GROUPSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupSize").build();
    private static final MarshallingInfo<String> GROUPFILES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupFiles").build();
    private static final MarshallingInfo<Boolean> RECURSE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Recurse").build();
    private static final MarshallingInfo<Integer> MAXBAND_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxBand").build();
    private static final MarshallingInfo<Integer> MAXFILESINBAND_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxFilesInBand").build();
    private static final MarshallingInfo<StructuredPojo> ADDITIONALOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalOptions").build();
    private static final MarshallingInfo<String> SEPARATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Separator").build();
    private static final MarshallingInfo<String> ESCAPER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Escaper").build();
    private static final MarshallingInfo<String> QUOTECHAR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuoteChar").build();
    private static final MarshallingInfo<Boolean> MULTILINE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Multiline").build();
    private static final MarshallingInfo<Boolean> WITHHEADER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WithHeader").build();
    private static final MarshallingInfo<Boolean> WRITEHEADER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WriteHeader").build();
    private static final MarshallingInfo<Boolean> SKIPFIRST_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkipFirst").build();
    private static final MarshallingInfo<Boolean> OPTIMIZEPERFORMANCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptimizePerformance").build();
    private static final MarshallingInfo<List> OUTPUTSCHEMAS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputSchemas").build();

    private static final S3CsvSourceMarshaller instance = new S3CsvSourceMarshaller();

    public static S3CsvSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3CsvSource s3CsvSource, ProtocolMarshaller protocolMarshaller) {

        if (s3CsvSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3CsvSource.getName(), NAME_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getPaths(), PATHS_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getCompressionType(), COMPRESSIONTYPE_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getExclusions(), EXCLUSIONS_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getGroupSize(), GROUPSIZE_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getGroupFiles(), GROUPFILES_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getRecurse(), RECURSE_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getMaxBand(), MAXBAND_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getMaxFilesInBand(), MAXFILESINBAND_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getAdditionalOptions(), ADDITIONALOPTIONS_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getSeparator(), SEPARATOR_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getEscaper(), ESCAPER_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getQuoteChar(), QUOTECHAR_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getMultiline(), MULTILINE_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getWithHeader(), WITHHEADER_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getWriteHeader(), WRITEHEADER_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getSkipFirst(), SKIPFIRST_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getOptimizePerformance(), OPTIMIZEPERFORMANCE_BINDING);
            protocolMarshaller.marshall(s3CsvSource.getOutputSchemas(), OUTPUTSCHEMAS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
