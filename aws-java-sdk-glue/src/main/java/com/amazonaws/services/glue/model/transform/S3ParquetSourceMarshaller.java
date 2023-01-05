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
 * S3ParquetSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3ParquetSourceMarshaller {

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
    private static final MarshallingInfo<List> OUTPUTSCHEMAS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputSchemas").build();

    private static final S3ParquetSourceMarshaller instance = new S3ParquetSourceMarshaller();

    public static S3ParquetSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3ParquetSource s3ParquetSource, ProtocolMarshaller protocolMarshaller) {

        if (s3ParquetSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3ParquetSource.getName(), NAME_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getPaths(), PATHS_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getCompressionType(), COMPRESSIONTYPE_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getExclusions(), EXCLUSIONS_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getGroupSize(), GROUPSIZE_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getGroupFiles(), GROUPFILES_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getRecurse(), RECURSE_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getMaxBand(), MAXBAND_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getMaxFilesInBand(), MAXFILESINBAND_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getAdditionalOptions(), ADDITIONALOPTIONS_BINDING);
            protocolMarshaller.marshall(s3ParquetSource.getOutputSchemas(), OUTPUTSCHEMAS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
