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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportTableRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportTableRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> S3BUCKETSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketSource").build();
    private static final MarshallingInfo<String> INPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputFormat").build();
    private static final MarshallingInfo<StructuredPojo> INPUTFORMATOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputFormatOptions").build();
    private static final MarshallingInfo<String> INPUTCOMPRESSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputCompressionType").build();
    private static final MarshallingInfo<StructuredPojo> TABLECREATIONPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableCreationParameters").build();

    private static final ImportTableRequestMarshaller instance = new ImportTableRequestMarshaller();

    public static ImportTableRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportTableRequest importTableRequest, ProtocolMarshaller protocolMarshaller) {

        if (importTableRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importTableRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(importTableRequest.getS3BucketSource(), S3BUCKETSOURCE_BINDING);
            protocolMarshaller.marshall(importTableRequest.getInputFormat(), INPUTFORMAT_BINDING);
            protocolMarshaller.marshall(importTableRequest.getInputFormatOptions(), INPUTFORMATOPTIONS_BINDING);
            protocolMarshaller.marshall(importTableRequest.getInputCompressionType(), INPUTCOMPRESSIONTYPE_BINDING);
            protocolMarshaller.marshall(importTableRequest.getTableCreationParameters(), TABLECREATIONPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
