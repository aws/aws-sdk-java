/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AthenaDatasetDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AthenaDatasetDefinitionMarshaller {

    private static final MarshallingInfo<String> CATALOG_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Catalog").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Database").build();
    private static final MarshallingInfo<String> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryString").build();
    private static final MarshallingInfo<String> WORKGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkGroup").build();
    private static final MarshallingInfo<String> OUTPUTS3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3Uri").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> OUTPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputFormat").build();
    private static final MarshallingInfo<String> OUTPUTCOMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputCompression").build();

    private static final AthenaDatasetDefinitionMarshaller instance = new AthenaDatasetDefinitionMarshaller();

    public static AthenaDatasetDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AthenaDatasetDefinition athenaDatasetDefinition, ProtocolMarshaller protocolMarshaller) {

        if (athenaDatasetDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(athenaDatasetDefinition.getCatalog(), CATALOG_BINDING);
            protocolMarshaller.marshall(athenaDatasetDefinition.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(athenaDatasetDefinition.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(athenaDatasetDefinition.getWorkGroup(), WORKGROUP_BINDING);
            protocolMarshaller.marshall(athenaDatasetDefinition.getOutputS3Uri(), OUTPUTS3URI_BINDING);
            protocolMarshaller.marshall(athenaDatasetDefinition.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(athenaDatasetDefinition.getOutputFormat(), OUTPUTFORMAT_BINDING);
            protocolMarshaller.marshall(athenaDatasetDefinition.getOutputCompression(), OUTPUTCOMPRESSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
