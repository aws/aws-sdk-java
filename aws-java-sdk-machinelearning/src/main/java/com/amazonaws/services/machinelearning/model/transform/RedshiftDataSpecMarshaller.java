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
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RedshiftDataSpecMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RedshiftDataSpecMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATABASEINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseInformation").build();
    private static final MarshallingInfo<String> SELECTSQLQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectSqlQuery").build();
    private static final MarshallingInfo<StructuredPojo> DATABASECREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseCredentials").build();
    private static final MarshallingInfo<String> S3STAGINGLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3StagingLocation").build();
    private static final MarshallingInfo<String> DATAREARRANGEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataRearrangement").build();
    private static final MarshallingInfo<String> DATASCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSchema").build();
    private static final MarshallingInfo<String> DATASCHEMAURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSchemaUri").build();

    private static final RedshiftDataSpecMarshaller instance = new RedshiftDataSpecMarshaller();

    public static RedshiftDataSpecMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RedshiftDataSpec redshiftDataSpec, ProtocolMarshaller protocolMarshaller) {

        if (redshiftDataSpec == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(redshiftDataSpec.getDatabaseInformation(), DATABASEINFORMATION_BINDING);
            protocolMarshaller.marshall(redshiftDataSpec.getSelectSqlQuery(), SELECTSQLQUERY_BINDING);
            protocolMarshaller.marshall(redshiftDataSpec.getDatabaseCredentials(), DATABASECREDENTIALS_BINDING);
            protocolMarshaller.marshall(redshiftDataSpec.getS3StagingLocation(), S3STAGINGLOCATION_BINDING);
            protocolMarshaller.marshall(redshiftDataSpec.getDataRearrangement(), DATAREARRANGEMENT_BINDING);
            protocolMarshaller.marshall(redshiftDataSpec.getDataSchema(), DATASCHEMA_BINDING);
            protocolMarshaller.marshall(redshiftDataSpec.getDataSchemaUri(), DATASCHEMAURI_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
