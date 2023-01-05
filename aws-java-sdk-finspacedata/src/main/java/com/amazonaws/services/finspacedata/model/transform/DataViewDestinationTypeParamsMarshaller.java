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
package com.amazonaws.services.finspacedata.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataViewDestinationTypeParamsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataViewDestinationTypeParamsMarshaller {

    private static final MarshallingInfo<String> DESTINATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationType").build();
    private static final MarshallingInfo<String> S3DESTINATIONEXPORTFILEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3DestinationExportFileFormat").build();
    private static final MarshallingInfo<Map> S3DESTINATIONEXPORTFILEFORMATOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3DestinationExportFileFormatOptions").build();

    private static final DataViewDestinationTypeParamsMarshaller instance = new DataViewDestinationTypeParamsMarshaller();

    public static DataViewDestinationTypeParamsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataViewDestinationTypeParams dataViewDestinationTypeParams, ProtocolMarshaller protocolMarshaller) {

        if (dataViewDestinationTypeParams == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataViewDestinationTypeParams.getDestinationType(), DESTINATIONTYPE_BINDING);
            protocolMarshaller.marshall(dataViewDestinationTypeParams.getS3DestinationExportFileFormat(), S3DESTINATIONEXPORTFILEFORMAT_BINDING);
            protocolMarshaller.marshall(dataViewDestinationTypeParams.getS3DestinationExportFileFormatOptions(), S3DESTINATIONEXPORTFILEFORMATOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
