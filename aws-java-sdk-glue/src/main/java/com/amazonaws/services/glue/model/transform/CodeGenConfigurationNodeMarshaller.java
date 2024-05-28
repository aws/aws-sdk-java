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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodeGenConfigurationNodeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodeGenConfigurationNodeMarshaller {

    private static final MarshallingInfo<StructuredPojo> ATHENACONNECTORSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AthenaConnectorSource").build();
    private static final MarshallingInfo<StructuredPojo> JDBCCONNECTORSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JDBCConnectorSource").build();
    private static final MarshallingInfo<StructuredPojo> SPARKCONNECTORSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SparkConnectorSource").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogSource").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftSource").build();
    private static final MarshallingInfo<StructuredPojo> S3CATALOGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3CatalogSource").build();
    private static final MarshallingInfo<StructuredPojo> S3CSVSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3CsvSource").build();
    private static final MarshallingInfo<StructuredPojo> S3JSONSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3JsonSource").build();
    private static final MarshallingInfo<StructuredPojo> S3PARQUETSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ParquetSource").build();
    private static final MarshallingInfo<StructuredPojo> RELATIONALCATALOGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelationalCatalogSource").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMODBCATALOGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DynamoDBCatalogSource").build();
    private static final MarshallingInfo<StructuredPojo> JDBCCONNECTORTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JDBCConnectorTarget").build();
    private static final MarshallingInfo<StructuredPojo> SPARKCONNECTORTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SparkConnectorTarget").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogTarget").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftTarget").build();
    private static final MarshallingInfo<StructuredPojo> S3CATALOGTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3CatalogTarget").build();
    private static final MarshallingInfo<StructuredPojo> S3GLUEPARQUETTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3GlueParquetTarget").build();
    private static final MarshallingInfo<StructuredPojo> S3DIRECTTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DirectTarget").build();
    private static final MarshallingInfo<StructuredPojo> APPLYMAPPING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplyMapping").build();
    private static final MarshallingInfo<StructuredPojo> SELECTFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectFields").build();
    private static final MarshallingInfo<StructuredPojo> DROPFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DropFields").build();
    private static final MarshallingInfo<StructuredPojo> RENAMEFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenameField").build();
    private static final MarshallingInfo<StructuredPojo> SPIGOT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Spigot").build();
    private static final MarshallingInfo<StructuredPojo> JOIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Join").build();
    private static final MarshallingInfo<StructuredPojo> SPLITFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SplitFields").build();
    private static final MarshallingInfo<StructuredPojo> SELECTFROMCOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectFromCollection").build();
    private static final MarshallingInfo<StructuredPojo> FILLMISSINGVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FillMissingValues").build();
    private static final MarshallingInfo<StructuredPojo> FILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Filter").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomCode").build();
    private static final MarshallingInfo<StructuredPojo> SPARKSQL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SparkSQL").build();
    private static final MarshallingInfo<StructuredPojo> DIRECTKINESISSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectKinesisSource").build();
    private static final MarshallingInfo<StructuredPojo> DIRECTKAFKASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectKafkaSource").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGKINESISSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogKinesisSource").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGKAFKASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogKafkaSource").build();
    private static final MarshallingInfo<StructuredPojo> DROPNULLFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DropNullFields").build();
    private static final MarshallingInfo<StructuredPojo> MERGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Merge").build();
    private static final MarshallingInfo<StructuredPojo> UNION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Union").build();
    private static final MarshallingInfo<StructuredPojo> PIIDETECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PIIDetection").build();
    private static final MarshallingInfo<StructuredPojo> AGGREGATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Aggregate").build();
    private static final MarshallingInfo<StructuredPojo> DROPDUPLICATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DropDuplicates").build();
    private static final MarshallingInfo<StructuredPojo> GOVERNEDCATALOGTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GovernedCatalogTarget").build();
    private static final MarshallingInfo<StructuredPojo> GOVERNEDCATALOGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GovernedCatalogSource").build();
    private static final MarshallingInfo<StructuredPojo> MICROSOFTSQLSERVERCATALOGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MicrosoftSQLServerCatalogSource").build();
    private static final MarshallingInfo<StructuredPojo> MYSQLCATALOGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MySQLCatalogSource").build();
    private static final MarshallingInfo<StructuredPojo> ORACLESQLCATALOGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OracleSQLCatalogSource").build();
    private static final MarshallingInfo<StructuredPojo> POSTGRESQLCATALOGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostgreSQLCatalogSource").build();
    private static final MarshallingInfo<StructuredPojo> MICROSOFTSQLSERVERCATALOGTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MicrosoftSQLServerCatalogTarget").build();
    private static final MarshallingInfo<StructuredPojo> MYSQLCATALOGTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MySQLCatalogTarget").build();
    private static final MarshallingInfo<StructuredPojo> ORACLESQLCATALOGTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OracleSQLCatalogTarget").build();
    private static final MarshallingInfo<StructuredPojo> POSTGRESQLCATALOGTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostgreSQLCatalogTarget").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMICTRANSFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DynamicTransform").build();
    private static final MarshallingInfo<StructuredPojo> EVALUATEDATAQUALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluateDataQuality").build();
    private static final MarshallingInfo<StructuredPojo> S3CATALOGHUDISOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3CatalogHudiSource").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGHUDISOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogHudiSource").build();
    private static final MarshallingInfo<StructuredPojo> S3HUDISOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3HudiSource").build();
    private static final MarshallingInfo<StructuredPojo> S3HUDICATALOGTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3HudiCatalogTarget").build();
    private static final MarshallingInfo<StructuredPojo> S3HUDIDIRECTTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3HudiDirectTarget").build();
    private static final MarshallingInfo<StructuredPojo> DIRECTJDBCSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectJDBCSource").build();
    private static final MarshallingInfo<StructuredPojo> S3CATALOGDELTASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3CatalogDeltaSource").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGDELTASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogDeltaSource").build();
    private static final MarshallingInfo<StructuredPojo> S3DELTASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DeltaSource").build();
    private static final MarshallingInfo<StructuredPojo> S3DELTACATALOGTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DeltaCatalogTarget").build();
    private static final MarshallingInfo<StructuredPojo> S3DELTADIRECTTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DeltaDirectTarget").build();
    private static final MarshallingInfo<StructuredPojo> AMAZONREDSHIFTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmazonRedshiftSource").build();
    private static final MarshallingInfo<StructuredPojo> AMAZONREDSHIFTTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmazonRedshiftTarget").build();
    private static final MarshallingInfo<StructuredPojo> EVALUATEDATAQUALITYMULTIFRAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluateDataQualityMultiFrame").build();
    private static final MarshallingInfo<StructuredPojo> RECIPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Recipe").build();
    private static final MarshallingInfo<StructuredPojo> SNOWFLAKESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnowflakeSource").build();
    private static final MarshallingInfo<StructuredPojo> SNOWFLAKETARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnowflakeTarget").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTORDATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectorDataSource").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTORDATATARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectorDataTarget").build();

    private static final CodeGenConfigurationNodeMarshaller instance = new CodeGenConfigurationNodeMarshaller();

    public static CodeGenConfigurationNodeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodeGenConfigurationNode codeGenConfigurationNode, ProtocolMarshaller protocolMarshaller) {

        if (codeGenConfigurationNode == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codeGenConfigurationNode.getAthenaConnectorSource(), ATHENACONNECTORSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getJDBCConnectorSource(), JDBCCONNECTORSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getSparkConnectorSource(), SPARKCONNECTORSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getCatalogSource(), CATALOGSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getRedshiftSource(), REDSHIFTSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3CatalogSource(), S3CATALOGSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3CsvSource(), S3CSVSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3JsonSource(), S3JSONSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3ParquetSource(), S3PARQUETSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getRelationalCatalogSource(), RELATIONALCATALOGSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getDynamoDBCatalogSource(), DYNAMODBCATALOGSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getJDBCConnectorTarget(), JDBCCONNECTORTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getSparkConnectorTarget(), SPARKCONNECTORTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getCatalogTarget(), CATALOGTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getRedshiftTarget(), REDSHIFTTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3CatalogTarget(), S3CATALOGTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3GlueParquetTarget(), S3GLUEPARQUETTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3DirectTarget(), S3DIRECTTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getApplyMapping(), APPLYMAPPING_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getSelectFields(), SELECTFIELDS_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getDropFields(), DROPFIELDS_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getRenameField(), RENAMEFIELD_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getSpigot(), SPIGOT_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getJoin(), JOIN_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getSplitFields(), SPLITFIELDS_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getSelectFromCollection(), SELECTFROMCOLLECTION_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getFillMissingValues(), FILLMISSINGVALUES_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getFilter(), FILTER_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getCustomCode(), CUSTOMCODE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getSparkSQL(), SPARKSQL_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getDirectKinesisSource(), DIRECTKINESISSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getDirectKafkaSource(), DIRECTKAFKASOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getCatalogKinesisSource(), CATALOGKINESISSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getCatalogKafkaSource(), CATALOGKAFKASOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getDropNullFields(), DROPNULLFIELDS_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getMerge(), MERGE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getUnion(), UNION_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getPIIDetection(), PIIDETECTION_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getAggregate(), AGGREGATE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getDropDuplicates(), DROPDUPLICATES_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getGovernedCatalogTarget(), GOVERNEDCATALOGTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getGovernedCatalogSource(), GOVERNEDCATALOGSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getMicrosoftSQLServerCatalogSource(), MICROSOFTSQLSERVERCATALOGSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getMySQLCatalogSource(), MYSQLCATALOGSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getOracleSQLCatalogSource(), ORACLESQLCATALOGSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getPostgreSQLCatalogSource(), POSTGRESQLCATALOGSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getMicrosoftSQLServerCatalogTarget(), MICROSOFTSQLSERVERCATALOGTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getMySQLCatalogTarget(), MYSQLCATALOGTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getOracleSQLCatalogTarget(), ORACLESQLCATALOGTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getPostgreSQLCatalogTarget(), POSTGRESQLCATALOGTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getDynamicTransform(), DYNAMICTRANSFORM_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getEvaluateDataQuality(), EVALUATEDATAQUALITY_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3CatalogHudiSource(), S3CATALOGHUDISOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getCatalogHudiSource(), CATALOGHUDISOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3HudiSource(), S3HUDISOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3HudiCatalogTarget(), S3HUDICATALOGTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3HudiDirectTarget(), S3HUDIDIRECTTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getDirectJDBCSource(), DIRECTJDBCSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3CatalogDeltaSource(), S3CATALOGDELTASOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getCatalogDeltaSource(), CATALOGDELTASOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3DeltaSource(), S3DELTASOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3DeltaCatalogTarget(), S3DELTACATALOGTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getS3DeltaDirectTarget(), S3DELTADIRECTTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getAmazonRedshiftSource(), AMAZONREDSHIFTSOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getAmazonRedshiftTarget(), AMAZONREDSHIFTTARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getEvaluateDataQualityMultiFrame(), EVALUATEDATAQUALITYMULTIFRAME_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getRecipe(), RECIPE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getSnowflakeSource(), SNOWFLAKESOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getSnowflakeTarget(), SNOWFLAKETARGET_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getConnectorDataSource(), CONNECTORDATASOURCE_BINDING);
            protocolMarshaller.marshall(codeGenConfigurationNode.getConnectorDataTarget(), CONNECTORDATATARGET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
