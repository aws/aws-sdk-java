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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CodeGenConfigurationNode JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeGenConfigurationNodeJsonUnmarshaller implements Unmarshaller<CodeGenConfigurationNode, JsonUnmarshallerContext> {

    public CodeGenConfigurationNode unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodeGenConfigurationNode codeGenConfigurationNode = new CodeGenConfigurationNode();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AthenaConnectorSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setAthenaConnectorSource(AthenaConnectorSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JDBCConnectorSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setJDBCConnectorSource(JDBCConnectorSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SparkConnectorSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setSparkConnectorSource(SparkConnectorSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogSource(CatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedshiftSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setRedshiftSource(RedshiftSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3CatalogSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setS3CatalogSource(S3CatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3CsvSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setS3CsvSource(S3CsvSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3JsonSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setS3JsonSource(S3JsonSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3ParquetSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setS3ParquetSource(S3ParquetSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RelationalCatalogSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setRelationalCatalogSource(RelationalCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DynamoDBCatalogSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setDynamoDBCatalogSource(DynamoDBCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JDBCConnectorTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setJDBCConnectorTarget(JDBCConnectorTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SparkConnectorTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setSparkConnectorTarget(SparkConnectorTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogTarget(BasicCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedshiftTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setRedshiftTarget(RedshiftTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3CatalogTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setS3CatalogTarget(S3CatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3GlueParquetTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setS3GlueParquetTarget(S3GlueParquetTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3DirectTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setS3DirectTarget(S3DirectTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ApplyMapping", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setApplyMapping(ApplyMappingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SelectFields", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setSelectFields(SelectFieldsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DropFields", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setDropFields(DropFieldsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RenameField", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setRenameField(RenameFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Spigot", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setSpigot(SpigotJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Join", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setJoin(JoinJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SplitFields", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setSplitFields(SplitFieldsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SelectFromCollection", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setSelectFromCollection(SelectFromCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FillMissingValues", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setFillMissingValues(FillMissingValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Filter", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setFilter(FilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomCode", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setCustomCode(CustomCodeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SparkSQL", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setSparkSQL(SparkSQLJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DirectKinesisSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setDirectKinesisSource(DirectKinesisSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DirectKafkaSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setDirectKafkaSource(DirectKafkaSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogKinesisSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogKinesisSource(CatalogKinesisSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogKafkaSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogKafkaSource(CatalogKafkaSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DropNullFields", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setDropNullFields(DropNullFieldsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Merge", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setMerge(MergeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Union", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setUnion(UnionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PIIDetection", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setPIIDetection(PIIDetectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Aggregate", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setAggregate(AggregateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DropDuplicates", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setDropDuplicates(DropDuplicatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GovernedCatalogTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setGovernedCatalogTarget(GovernedCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GovernedCatalogSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setGovernedCatalogSource(GovernedCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MicrosoftSQLServerCatalogSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setMicrosoftSQLServerCatalogSource(MicrosoftSQLServerCatalogSourceJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("MySQLCatalogSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setMySQLCatalogSource(MySQLCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OracleSQLCatalogSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setOracleSQLCatalogSource(OracleSQLCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PostgreSQLCatalogSource", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setPostgreSQLCatalogSource(PostgreSQLCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MicrosoftSQLServerCatalogTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setMicrosoftSQLServerCatalogTarget(MicrosoftSQLServerCatalogTargetJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("MySQLCatalogTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setMySQLCatalogTarget(MySQLCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OracleSQLCatalogTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setOracleSQLCatalogTarget(OracleSQLCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PostgreSQLCatalogTarget", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setPostgreSQLCatalogTarget(PostgreSQLCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DynamicTransform", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setDynamicTransform(DynamicTransformJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluateDataQuality", targetDepth)) {
                    context.nextToken();
                    codeGenConfigurationNode.setEvaluateDataQuality(EvaluateDataQualityJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return codeGenConfigurationNode;
    }

    private static CodeGenConfigurationNodeJsonUnmarshaller instance;

    public static CodeGenConfigurationNodeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeGenConfigurationNodeJsonUnmarshaller();
        return instance;
    }
}
