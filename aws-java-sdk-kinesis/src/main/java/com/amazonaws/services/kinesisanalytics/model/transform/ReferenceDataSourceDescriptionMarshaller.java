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
package com.amazonaws.services.kinesisanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReferenceDataSourceDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReferenceDataSourceDescriptionMarshaller {

    private static final MarshallingInfo<String> REFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceId").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<StructuredPojo> S3REFERENCEDATASOURCEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ReferenceDataSourceDescription").build();
    private static final MarshallingInfo<StructuredPojo> REFERENCESCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceSchema").build();

    private static final ReferenceDataSourceDescriptionMarshaller instance = new ReferenceDataSourceDescriptionMarshaller();

    public static ReferenceDataSourceDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReferenceDataSourceDescription referenceDataSourceDescription, ProtocolMarshaller protocolMarshaller) {

        if (referenceDataSourceDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(referenceDataSourceDescription.getReferenceId(), REFERENCEID_BINDING);
            protocolMarshaller.marshall(referenceDataSourceDescription.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(referenceDataSourceDescription.getS3ReferenceDataSourceDescription(), S3REFERENCEDATASOURCEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(referenceDataSourceDescription.getReferenceSchema(), REFERENCESCHEMA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
