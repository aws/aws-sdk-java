/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataSourceParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataSourceParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> AMAZONELASTICSEARCHPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmazonElasticsearchParameters").build();
    private static final MarshallingInfo<StructuredPojo> ATHENAPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AthenaParameters").build();
    private static final MarshallingInfo<StructuredPojo> AURORAPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuroraParameters").build();
    private static final MarshallingInfo<StructuredPojo> AURORAPOSTGRESQLPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuroraPostgreSqlParameters").build();
    private static final MarshallingInfo<StructuredPojo> AWSIOTANALYTICSPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsIotAnalyticsParameters").build();
    private static final MarshallingInfo<StructuredPojo> JIRAPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JiraParameters").build();
    private static final MarshallingInfo<StructuredPojo> MARIADBPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MariaDbParameters").build();
    private static final MarshallingInfo<StructuredPojo> MYSQLPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MySqlParameters").build();
    private static final MarshallingInfo<StructuredPojo> POSTGRESQLPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostgreSqlParameters").build();
    private static final MarshallingInfo<StructuredPojo> PRESTOPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrestoParameters").build();
    private static final MarshallingInfo<StructuredPojo> RDSPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RdsParameters").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftParameters").build();
    private static final MarshallingInfo<StructuredPojo> S3PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Parameters").build();
    private static final MarshallingInfo<StructuredPojo> SERVICENOWPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNowParameters").build();
    private static final MarshallingInfo<StructuredPojo> SNOWFLAKEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnowflakeParameters").build();
    private static final MarshallingInfo<StructuredPojo> SPARKPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SparkParameters").build();
    private static final MarshallingInfo<StructuredPojo> SQLSERVERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqlServerParameters").build();
    private static final MarshallingInfo<StructuredPojo> TERADATAPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TeradataParameters").build();
    private static final MarshallingInfo<StructuredPojo> TWITTERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TwitterParameters").build();

    private static final DataSourceParametersMarshaller instance = new DataSourceParametersMarshaller();

    public static DataSourceParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataSourceParameters dataSourceParameters, ProtocolMarshaller protocolMarshaller) {

        if (dataSourceParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataSourceParameters.getAmazonElasticsearchParameters(), AMAZONELASTICSEARCHPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getAthenaParameters(), ATHENAPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getAuroraParameters(), AURORAPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getAuroraPostgreSqlParameters(), AURORAPOSTGRESQLPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getAwsIotAnalyticsParameters(), AWSIOTANALYTICSPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getJiraParameters(), JIRAPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getMariaDbParameters(), MARIADBPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getMySqlParameters(), MYSQLPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getPostgreSqlParameters(), POSTGRESQLPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getPrestoParameters(), PRESTOPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getRdsParameters(), RDSPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getRedshiftParameters(), REDSHIFTPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getS3Parameters(), S3PARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getServiceNowParameters(), SERVICENOWPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getSnowflakeParameters(), SNOWFLAKEPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getSparkParameters(), SPARKPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getSqlServerParameters(), SQLSERVERPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getTeradataParameters(), TERADATAPARAMETERS_BINDING);
            protocolMarshaller.marshall(dataSourceParameters.getTwitterParameters(), TWITTERPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
