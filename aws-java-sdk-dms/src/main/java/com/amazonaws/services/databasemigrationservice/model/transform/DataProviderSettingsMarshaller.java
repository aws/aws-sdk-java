/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataProviderSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataProviderSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> REDSHIFTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftSettings").build();
    private static final MarshallingInfo<StructuredPojo> POSTGRESQLSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostgreSqlSettings").build();
    private static final MarshallingInfo<StructuredPojo> MYSQLSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MySqlSettings").build();
    private static final MarshallingInfo<StructuredPojo> ORACLESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OracleSettings").build();
    private static final MarshallingInfo<StructuredPojo> MICROSOFTSQLSERVERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MicrosoftSqlServerSettings").build();
    private static final MarshallingInfo<StructuredPojo> DOCDBSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocDbSettings").build();
    private static final MarshallingInfo<StructuredPojo> MARIADBSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MariaDbSettings").build();
    private static final MarshallingInfo<StructuredPojo> MONGODBSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MongoDbSettings").build();

    private static final DataProviderSettingsMarshaller instance = new DataProviderSettingsMarshaller();

    public static DataProviderSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataProviderSettings dataProviderSettings, ProtocolMarshaller protocolMarshaller) {

        if (dataProviderSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataProviderSettings.getRedshiftSettings(), REDSHIFTSETTINGS_BINDING);
            protocolMarshaller.marshall(dataProviderSettings.getPostgreSqlSettings(), POSTGRESQLSETTINGS_BINDING);
            protocolMarshaller.marshall(dataProviderSettings.getMySqlSettings(), MYSQLSETTINGS_BINDING);
            protocolMarshaller.marshall(dataProviderSettings.getOracleSettings(), ORACLESETTINGS_BINDING);
            protocolMarshaller.marshall(dataProviderSettings.getMicrosoftSqlServerSettings(), MICROSOFTSQLSERVERSETTINGS_BINDING);
            protocolMarshaller.marshall(dataProviderSettings.getDocDbSettings(), DOCDBSETTINGS_BINDING);
            protocolMarshaller.marshall(dataProviderSettings.getMariaDbSettings(), MARIADBSETTINGS_BINDING);
            protocolMarshaller.marshall(dataProviderSettings.getMongoDbSettings(), MONGODBSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
