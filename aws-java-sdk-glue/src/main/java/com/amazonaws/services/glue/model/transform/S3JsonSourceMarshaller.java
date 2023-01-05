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
 * S3JsonSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3JsonSourceMarshaller {

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
    private static final MarshallingInfo<String> JSONPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JsonPath").build();
    private static final MarshallingInfo<Boolean> MULTILINE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Multiline").build();
    private static final MarshallingInfo<List> OUTPUTSCHEMAS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputSchemas").build();

    private static final S3JsonSourceMarshaller instance = new S3JsonSourceMarshaller();

    public static S3JsonSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3JsonSource s3JsonSource, ProtocolMarshaller protocolMarshaller) {

        if (s3JsonSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3JsonSource.getName(), NAME_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getPaths(), PATHS_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getCompressionType(), COMPRESSIONTYPE_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getExclusions(), EXCLUSIONS_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getGroupSize(), GROUPSIZE_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getGroupFiles(), GROUPFILES_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getRecurse(), RECURSE_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getMaxBand(), MAXBAND_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getMaxFilesInBand(), MAXFILESINBAND_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getAdditionalOptions(), ADDITIONALOPTIONS_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getJsonPath(), JSONPATH_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getMultiline(), MULTILINE_BINDING);
            protocolMarshaller.marshall(s3JsonSource.getOutputSchemas(), OUTPUTSCHEMAS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
