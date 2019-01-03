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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReferenceDataSourceUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReferenceDataSourceUpdateMarshaller {

    private static final MarshallingInfo<String> REFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceId").build();
    private static final MarshallingInfo<String> TABLENAMEUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableNameUpdate").build();
    private static final MarshallingInfo<StructuredPojo> S3REFERENCEDATASOURCEUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ReferenceDataSourceUpdate").build();
    private static final MarshallingInfo<StructuredPojo> REFERENCESCHEMAUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceSchemaUpdate").build();

    private static final ReferenceDataSourceUpdateMarshaller instance = new ReferenceDataSourceUpdateMarshaller();

    public static ReferenceDataSourceUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReferenceDataSourceUpdate referenceDataSourceUpdate, ProtocolMarshaller protocolMarshaller) {

        if (referenceDataSourceUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(referenceDataSourceUpdate.getReferenceId(), REFERENCEID_BINDING);
            protocolMarshaller.marshall(referenceDataSourceUpdate.getTableNameUpdate(), TABLENAMEUPDATE_BINDING);
            protocolMarshaller.marshall(referenceDataSourceUpdate.getS3ReferenceDataSourceUpdate(), S3REFERENCEDATASOURCEUPDATE_BINDING);
            protocolMarshaller.marshall(referenceDataSourceUpdate.getReferenceSchemaUpdate(), REFERENCESCHEMAUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
