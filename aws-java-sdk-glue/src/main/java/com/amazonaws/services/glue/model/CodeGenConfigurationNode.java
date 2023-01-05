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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <code>CodeGenConfigurationNode</code> enumerates all valid Node types. One and only one of its member variables can
 * be populated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CodeGenConfigurationNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeGenConfigurationNode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies a connector to an Amazon Athena data source.
     * </p>
     */
    private AthenaConnectorSource athenaConnectorSource;
    /**
     * <p>
     * Specifies a connector to a JDBC data source.
     * </p>
     */
    private JDBCConnectorSource jDBCConnectorSource;
    /**
     * <p>
     * Specifies a connector to an Apache Spark data source.
     * </p>
     */
    private SparkConnectorSource sparkConnectorSource;
    /**
     * <p>
     * Specifies a data store in the Glue Data Catalog.
     * </p>
     */
    private CatalogSource catalogSource;
    /**
     * <p>
     * Specifies an Amazon Redshift data store.
     * </p>
     */
    private RedshiftSource redshiftSource;
    /**
     * <p>
     * Specifies an Amazon S3 data store in the Glue Data Catalog.
     * </p>
     */
    private S3CatalogSource s3CatalogSource;
    /**
     * <p>
     * Specifies a command-separated value (CSV) data store stored in Amazon S3.
     * </p>
     */
    private S3CsvSource s3CsvSource;
    /**
     * <p>
     * Specifies a JSON data store stored in Amazon S3.
     * </p>
     */
    private S3JsonSource s3JsonSource;
    /**
     * <p>
     * Specifies an Apache Parquet data store stored in Amazon S3.
     * </p>
     */
    private S3ParquetSource s3ParquetSource;

    private RelationalCatalogSource relationalCatalogSource;

    private DynamoDBCatalogSource dynamoDBCatalogSource;
    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * </p>
     */
    private JDBCConnectorTarget jDBCConnectorTarget;
    /**
     * <p>
     * Specifies a target that uses an Apache Spark connector.
     * </p>
     */
    private SparkConnectorTarget sparkConnectorTarget;
    /**
     * <p>
     * Specifies a target that uses a Glue Data Catalog table.
     * </p>
     */
    private BasicCatalogTarget catalogTarget;
    /**
     * <p>
     * Specifies a target that uses Amazon Redshift.
     * </p>
     */
    private RedshiftTarget redshiftTarget;
    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 using the Glue Data Catalog.
     * </p>
     */
    private S3CatalogTarget s3CatalogTarget;
    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * </p>
     */
    private S3GlueParquetTarget s3GlueParquetTarget;
    /**
     * <p>
     * Specifies a data target that writes to Amazon S3.
     * </p>
     */
    private S3DirectTarget s3DirectTarget;
    /**
     * <p>
     * Specifies a transform that maps data property keys in the data source to data property keys in the data target.
     * You can rename keys, modify the data types for keys, and choose which keys to drop from the dataset.
     * </p>
     */
    private ApplyMapping applyMapping;
    /**
     * <p>
     * Specifies a transform that chooses the data property keys that you want to keep.
     * </p>
     */
    private SelectFields selectFields;
    /**
     * <p>
     * Specifies a transform that chooses the data property keys that you want to drop.
     * </p>
     */
    private DropFields dropFields;
    /**
     * <p>
     * Specifies a transform that renames a single data property key.
     * </p>
     */
    private RenameField renameField;
    /**
     * <p>
     * Specifies a transform that writes samples of the data to an Amazon S3 bucket.
     * </p>
     */
    private Spigot spigot;
    /**
     * <p>
     * Specifies a transform that joins two datasets into one dataset using a comparison phrase on the specified data
     * property keys. You can use inner, outer, left, right, left semi, and left anti joins.
     * </p>
     */
    private Join join;
    /**
     * <p>
     * Specifies a transform that splits data property keys into two <code>DynamicFrames</code>. The output is a
     * collection of <code>DynamicFrames</code>: one with selected data property keys, and one with the remaining data
     * property keys.
     * </p>
     */
    private SplitFields splitFields;
    /**
     * <p>
     * Specifies a transform that chooses one <code>DynamicFrame</code> from a collection of <code>DynamicFrames</code>.
     * The output is the selected <code>DynamicFrame</code>
     * </p>
     */
    private SelectFromCollection selectFromCollection;
    /**
     * <p>
     * Specifies a transform that locates records in the dataset that have missing values and adds a new field with a
     * value determined by imputation. The input data set is used to train the machine learning model that determines
     * what the missing value should be.
     * </p>
     */
    private FillMissingValues fillMissingValues;
    /**
     * <p>
     * Specifies a transform that splits a dataset into two, based on a filter condition.
     * </p>
     */
    private Filter filter;
    /**
     * <p>
     * Specifies a transform that uses custom code you provide to perform the data transformation. The output is a
     * collection of DynamicFrames.
     * </p>
     */
    private CustomCode customCode;
    /**
     * <p>
     * Specifies a transform where you enter a SQL query using Spark SQL syntax to transform the data. The output is a
     * single <code>DynamicFrame</code>.
     * </p>
     */
    private SparkSQL sparkSQL;
    /**
     * <p>
     * Specifies a direct Amazon Kinesis data source.
     * </p>
     */
    private DirectKinesisSource directKinesisSource;
    /**
     * <p>
     * Specifies an Apache Kafka data store.
     * </p>
     */
    private DirectKafkaSource directKafkaSource;
    /**
     * <p>
     * Specifies a Kinesis data source in the Glue Data Catalog.
     * </p>
     */
    private CatalogKinesisSource catalogKinesisSource;
    /**
     * <p>
     * Specifies an Apache Kafka data store in the Data Catalog.
     * </p>
     */
    private CatalogKafkaSource catalogKafkaSource;
    /**
     * <p>
     * Specifies a transform that removes columns from the dataset if all values in the column are 'null'. By default,
     * Glue Studio will recognize null objects, but some values such as empty strings, strings that are "null", -1
     * integers or other placeholders such as zeros, are not automatically recognized as nulls.
     * </p>
     */
    private DropNullFields dropNullFields;
    /**
     * <p>
     * Specifies a transform that merges a <code>DynamicFrame</code> with a staging <code>DynamicFrame</code> based on
     * the specified primary keys to identify records. Duplicate records (records with the same primary keys) are not
     * de-duplicated.
     * </p>
     */
    private Merge merge;
    /**
     * <p>
     * Specifies a transform that combines the rows from two or more datasets into a single result.
     * </p>
     */
    private Union union;
    /**
     * <p>
     * Specifies a transform that identifies, removes or masks PII data.
     * </p>
     */
    private PIIDetection pIIDetection;
    /**
     * <p>
     * Specifies a transform that groups rows by chosen fields and computes the aggregated value by specified function.
     * </p>
     */
    private Aggregate aggregate;
    /**
     * <p>
     * Specifies a transform that removes rows of repeating data from a data set.
     * </p>
     */
    private DropDuplicates dropDuplicates;
    /**
     * <p>
     * Specifies a data target that writes to a goverened catalog.
     * </p>
     */
    private GovernedCatalogTarget governedCatalogTarget;
    /**
     * <p>
     * Specifies a data source in a goverened Data Catalog.
     * </p>
     */
    private GovernedCatalogSource governedCatalogSource;
    /**
     * <p>
     * Specifies a Microsoft SQL server data source in the Glue Data Catalog.
     * </p>
     */
    private MicrosoftSQLServerCatalogSource microsoftSQLServerCatalogSource;
    /**
     * <p>
     * Specifies a MySQL data source in the Glue Data Catalog.
     * </p>
     */
    private MySQLCatalogSource mySQLCatalogSource;
    /**
     * <p>
     * Specifies an Oracle data source in the Glue Data Catalog.
     * </p>
     */
    private OracleSQLCatalogSource oracleSQLCatalogSource;
    /**
     * <p>
     * Specifies a PostgresSQL data source in the Glue Data Catalog.
     * </p>
     */
    private PostgreSQLCatalogSource postgreSQLCatalogSource;
    /**
     * <p>
     * Specifies a target that uses Microsoft SQL.
     * </p>
     */
    private MicrosoftSQLServerCatalogTarget microsoftSQLServerCatalogTarget;
    /**
     * <p>
     * Specifies a target that uses MySQL.
     * </p>
     */
    private MySQLCatalogTarget mySQLCatalogTarget;
    /**
     * <p>
     * Specifies a target that uses Oracle SQL.
     * </p>
     */
    private OracleSQLCatalogTarget oracleSQLCatalogTarget;
    /**
     * <p>
     * Specifies a target that uses Postgres SQL.
     * </p>
     */
    private PostgreSQLCatalogTarget postgreSQLCatalogTarget;
    /**
     * <p>
     * Specifies a custom visual transform created by a user.
     * </p>
     */
    private DynamicTransform dynamicTransform;
    /**
     * <p>
     * Specifies your data quality evaluation criteria.
     * </p>
     */
    private EvaluateDataQuality evaluateDataQuality;

    /**
     * <p>
     * Specifies a connector to an Amazon Athena data source.
     * </p>
     * 
     * @param athenaConnectorSource
     *        Specifies a connector to an Amazon Athena data source.
     */

    public void setAthenaConnectorSource(AthenaConnectorSource athenaConnectorSource) {
        this.athenaConnectorSource = athenaConnectorSource;
    }

    /**
     * <p>
     * Specifies a connector to an Amazon Athena data source.
     * </p>
     * 
     * @return Specifies a connector to an Amazon Athena data source.
     */

    public AthenaConnectorSource getAthenaConnectorSource() {
        return this.athenaConnectorSource;
    }

    /**
     * <p>
     * Specifies a connector to an Amazon Athena data source.
     * </p>
     * 
     * @param athenaConnectorSource
     *        Specifies a connector to an Amazon Athena data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withAthenaConnectorSource(AthenaConnectorSource athenaConnectorSource) {
        setAthenaConnectorSource(athenaConnectorSource);
        return this;
    }

    /**
     * <p>
     * Specifies a connector to a JDBC data source.
     * </p>
     * 
     * @param jDBCConnectorSource
     *        Specifies a connector to a JDBC data source.
     */

    public void setJDBCConnectorSource(JDBCConnectorSource jDBCConnectorSource) {
        this.jDBCConnectorSource = jDBCConnectorSource;
    }

    /**
     * <p>
     * Specifies a connector to a JDBC data source.
     * </p>
     * 
     * @return Specifies a connector to a JDBC data source.
     */

    public JDBCConnectorSource getJDBCConnectorSource() {
        return this.jDBCConnectorSource;
    }

    /**
     * <p>
     * Specifies a connector to a JDBC data source.
     * </p>
     * 
     * @param jDBCConnectorSource
     *        Specifies a connector to a JDBC data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withJDBCConnectorSource(JDBCConnectorSource jDBCConnectorSource) {
        setJDBCConnectorSource(jDBCConnectorSource);
        return this;
    }

    /**
     * <p>
     * Specifies a connector to an Apache Spark data source.
     * </p>
     * 
     * @param sparkConnectorSource
     *        Specifies a connector to an Apache Spark data source.
     */

    public void setSparkConnectorSource(SparkConnectorSource sparkConnectorSource) {
        this.sparkConnectorSource = sparkConnectorSource;
    }

    /**
     * <p>
     * Specifies a connector to an Apache Spark data source.
     * </p>
     * 
     * @return Specifies a connector to an Apache Spark data source.
     */

    public SparkConnectorSource getSparkConnectorSource() {
        return this.sparkConnectorSource;
    }

    /**
     * <p>
     * Specifies a connector to an Apache Spark data source.
     * </p>
     * 
     * @param sparkConnectorSource
     *        Specifies a connector to an Apache Spark data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withSparkConnectorSource(SparkConnectorSource sparkConnectorSource) {
        setSparkConnectorSource(sparkConnectorSource);
        return this;
    }

    /**
     * <p>
     * Specifies a data store in the Glue Data Catalog.
     * </p>
     * 
     * @param catalogSource
     *        Specifies a data store in the Glue Data Catalog.
     */

    public void setCatalogSource(CatalogSource catalogSource) {
        this.catalogSource = catalogSource;
    }

    /**
     * <p>
     * Specifies a data store in the Glue Data Catalog.
     * </p>
     * 
     * @return Specifies a data store in the Glue Data Catalog.
     */

    public CatalogSource getCatalogSource() {
        return this.catalogSource;
    }

    /**
     * <p>
     * Specifies a data store in the Glue Data Catalog.
     * </p>
     * 
     * @param catalogSource
     *        Specifies a data store in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withCatalogSource(CatalogSource catalogSource) {
        setCatalogSource(catalogSource);
        return this;
    }

    /**
     * <p>
     * Specifies an Amazon Redshift data store.
     * </p>
     * 
     * @param redshiftSource
     *        Specifies an Amazon Redshift data store.
     */

    public void setRedshiftSource(RedshiftSource redshiftSource) {
        this.redshiftSource = redshiftSource;
    }

    /**
     * <p>
     * Specifies an Amazon Redshift data store.
     * </p>
     * 
     * @return Specifies an Amazon Redshift data store.
     */

    public RedshiftSource getRedshiftSource() {
        return this.redshiftSource;
    }

    /**
     * <p>
     * Specifies an Amazon Redshift data store.
     * </p>
     * 
     * @param redshiftSource
     *        Specifies an Amazon Redshift data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withRedshiftSource(RedshiftSource redshiftSource) {
        setRedshiftSource(redshiftSource);
        return this;
    }

    /**
     * <p>
     * Specifies an Amazon S3 data store in the Glue Data Catalog.
     * </p>
     * 
     * @param s3CatalogSource
     *        Specifies an Amazon S3 data store in the Glue Data Catalog.
     */

    public void setS3CatalogSource(S3CatalogSource s3CatalogSource) {
        this.s3CatalogSource = s3CatalogSource;
    }

    /**
     * <p>
     * Specifies an Amazon S3 data store in the Glue Data Catalog.
     * </p>
     * 
     * @return Specifies an Amazon S3 data store in the Glue Data Catalog.
     */

    public S3CatalogSource getS3CatalogSource() {
        return this.s3CatalogSource;
    }

    /**
     * <p>
     * Specifies an Amazon S3 data store in the Glue Data Catalog.
     * </p>
     * 
     * @param s3CatalogSource
     *        Specifies an Amazon S3 data store in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withS3CatalogSource(S3CatalogSource s3CatalogSource) {
        setS3CatalogSource(s3CatalogSource);
        return this;
    }

    /**
     * <p>
     * Specifies a command-separated value (CSV) data store stored in Amazon S3.
     * </p>
     * 
     * @param s3CsvSource
     *        Specifies a command-separated value (CSV) data store stored in Amazon S3.
     */

    public void setS3CsvSource(S3CsvSource s3CsvSource) {
        this.s3CsvSource = s3CsvSource;
    }

    /**
     * <p>
     * Specifies a command-separated value (CSV) data store stored in Amazon S3.
     * </p>
     * 
     * @return Specifies a command-separated value (CSV) data store stored in Amazon S3.
     */

    public S3CsvSource getS3CsvSource() {
        return this.s3CsvSource;
    }

    /**
     * <p>
     * Specifies a command-separated value (CSV) data store stored in Amazon S3.
     * </p>
     * 
     * @param s3CsvSource
     *        Specifies a command-separated value (CSV) data store stored in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withS3CsvSource(S3CsvSource s3CsvSource) {
        setS3CsvSource(s3CsvSource);
        return this;
    }

    /**
     * <p>
     * Specifies a JSON data store stored in Amazon S3.
     * </p>
     * 
     * @param s3JsonSource
     *        Specifies a JSON data store stored in Amazon S3.
     */

    public void setS3JsonSource(S3JsonSource s3JsonSource) {
        this.s3JsonSource = s3JsonSource;
    }

    /**
     * <p>
     * Specifies a JSON data store stored in Amazon S3.
     * </p>
     * 
     * @return Specifies a JSON data store stored in Amazon S3.
     */

    public S3JsonSource getS3JsonSource() {
        return this.s3JsonSource;
    }

    /**
     * <p>
     * Specifies a JSON data store stored in Amazon S3.
     * </p>
     * 
     * @param s3JsonSource
     *        Specifies a JSON data store stored in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withS3JsonSource(S3JsonSource s3JsonSource) {
        setS3JsonSource(s3JsonSource);
        return this;
    }

    /**
     * <p>
     * Specifies an Apache Parquet data store stored in Amazon S3.
     * </p>
     * 
     * @param s3ParquetSource
     *        Specifies an Apache Parquet data store stored in Amazon S3.
     */

    public void setS3ParquetSource(S3ParquetSource s3ParquetSource) {
        this.s3ParquetSource = s3ParquetSource;
    }

    /**
     * <p>
     * Specifies an Apache Parquet data store stored in Amazon S3.
     * </p>
     * 
     * @return Specifies an Apache Parquet data store stored in Amazon S3.
     */

    public S3ParquetSource getS3ParquetSource() {
        return this.s3ParquetSource;
    }

    /**
     * <p>
     * Specifies an Apache Parquet data store stored in Amazon S3.
     * </p>
     * 
     * @param s3ParquetSource
     *        Specifies an Apache Parquet data store stored in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withS3ParquetSource(S3ParquetSource s3ParquetSource) {
        setS3ParquetSource(s3ParquetSource);
        return this;
    }

    /**
     * @param relationalCatalogSource
     */

    public void setRelationalCatalogSource(RelationalCatalogSource relationalCatalogSource) {
        this.relationalCatalogSource = relationalCatalogSource;
    }

    /**
     * @return
     */

    public RelationalCatalogSource getRelationalCatalogSource() {
        return this.relationalCatalogSource;
    }

    /**
     * @param relationalCatalogSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withRelationalCatalogSource(RelationalCatalogSource relationalCatalogSource) {
        setRelationalCatalogSource(relationalCatalogSource);
        return this;
    }

    /**
     * @param dynamoDBCatalogSource
     */

    public void setDynamoDBCatalogSource(DynamoDBCatalogSource dynamoDBCatalogSource) {
        this.dynamoDBCatalogSource = dynamoDBCatalogSource;
    }

    /**
     * @return
     */

    public DynamoDBCatalogSource getDynamoDBCatalogSource() {
        return this.dynamoDBCatalogSource;
    }

    /**
     * @param dynamoDBCatalogSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withDynamoDBCatalogSource(DynamoDBCatalogSource dynamoDBCatalogSource) {
        setDynamoDBCatalogSource(dynamoDBCatalogSource);
        return this;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * </p>
     * 
     * @param jDBCConnectorTarget
     *        Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     */

    public void setJDBCConnectorTarget(JDBCConnectorTarget jDBCConnectorTarget) {
        this.jDBCConnectorTarget = jDBCConnectorTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * </p>
     * 
     * @return Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     */

    public JDBCConnectorTarget getJDBCConnectorTarget() {
        return this.jDBCConnectorTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * </p>
     * 
     * @param jDBCConnectorTarget
     *        Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withJDBCConnectorTarget(JDBCConnectorTarget jDBCConnectorTarget) {
        setJDBCConnectorTarget(jDBCConnectorTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a target that uses an Apache Spark connector.
     * </p>
     * 
     * @param sparkConnectorTarget
     *        Specifies a target that uses an Apache Spark connector.
     */

    public void setSparkConnectorTarget(SparkConnectorTarget sparkConnectorTarget) {
        this.sparkConnectorTarget = sparkConnectorTarget;
    }

    /**
     * <p>
     * Specifies a target that uses an Apache Spark connector.
     * </p>
     * 
     * @return Specifies a target that uses an Apache Spark connector.
     */

    public SparkConnectorTarget getSparkConnectorTarget() {
        return this.sparkConnectorTarget;
    }

    /**
     * <p>
     * Specifies a target that uses an Apache Spark connector.
     * </p>
     * 
     * @param sparkConnectorTarget
     *        Specifies a target that uses an Apache Spark connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withSparkConnectorTarget(SparkConnectorTarget sparkConnectorTarget) {
        setSparkConnectorTarget(sparkConnectorTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a target that uses a Glue Data Catalog table.
     * </p>
     * 
     * @param catalogTarget
     *        Specifies a target that uses a Glue Data Catalog table.
     */

    public void setCatalogTarget(BasicCatalogTarget catalogTarget) {
        this.catalogTarget = catalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses a Glue Data Catalog table.
     * </p>
     * 
     * @return Specifies a target that uses a Glue Data Catalog table.
     */

    public BasicCatalogTarget getCatalogTarget() {
        return this.catalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses a Glue Data Catalog table.
     * </p>
     * 
     * @param catalogTarget
     *        Specifies a target that uses a Glue Data Catalog table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withCatalogTarget(BasicCatalogTarget catalogTarget) {
        setCatalogTarget(catalogTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a target that uses Amazon Redshift.
     * </p>
     * 
     * @param redshiftTarget
     *        Specifies a target that uses Amazon Redshift.
     */

    public void setRedshiftTarget(RedshiftTarget redshiftTarget) {
        this.redshiftTarget = redshiftTarget;
    }

    /**
     * <p>
     * Specifies a target that uses Amazon Redshift.
     * </p>
     * 
     * @return Specifies a target that uses Amazon Redshift.
     */

    public RedshiftTarget getRedshiftTarget() {
        return this.redshiftTarget;
    }

    /**
     * <p>
     * Specifies a target that uses Amazon Redshift.
     * </p>
     * 
     * @param redshiftTarget
     *        Specifies a target that uses Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withRedshiftTarget(RedshiftTarget redshiftTarget) {
        setRedshiftTarget(redshiftTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 using the Glue Data Catalog.
     * </p>
     * 
     * @param s3CatalogTarget
     *        Specifies a data target that writes to Amazon S3 using the Glue Data Catalog.
     */

    public void setS3CatalogTarget(S3CatalogTarget s3CatalogTarget) {
        this.s3CatalogTarget = s3CatalogTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 using the Glue Data Catalog.
     * </p>
     * 
     * @return Specifies a data target that writes to Amazon S3 using the Glue Data Catalog.
     */

    public S3CatalogTarget getS3CatalogTarget() {
        return this.s3CatalogTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 using the Glue Data Catalog.
     * </p>
     * 
     * @param s3CatalogTarget
     *        Specifies a data target that writes to Amazon S3 using the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withS3CatalogTarget(S3CatalogTarget s3CatalogTarget) {
        setS3CatalogTarget(s3CatalogTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * </p>
     * 
     * @param s3GlueParquetTarget
     *        Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     */

    public void setS3GlueParquetTarget(S3GlueParquetTarget s3GlueParquetTarget) {
        this.s3GlueParquetTarget = s3GlueParquetTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * </p>
     * 
     * @return Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     */

    public S3GlueParquetTarget getS3GlueParquetTarget() {
        return this.s3GlueParquetTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * </p>
     * 
     * @param s3GlueParquetTarget
     *        Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withS3GlueParquetTarget(S3GlueParquetTarget s3GlueParquetTarget) {
        setS3GlueParquetTarget(s3GlueParquetTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3.
     * </p>
     * 
     * @param s3DirectTarget
     *        Specifies a data target that writes to Amazon S3.
     */

    public void setS3DirectTarget(S3DirectTarget s3DirectTarget) {
        this.s3DirectTarget = s3DirectTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3.
     * </p>
     * 
     * @return Specifies a data target that writes to Amazon S3.
     */

    public S3DirectTarget getS3DirectTarget() {
        return this.s3DirectTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to Amazon S3.
     * </p>
     * 
     * @param s3DirectTarget
     *        Specifies a data target that writes to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withS3DirectTarget(S3DirectTarget s3DirectTarget) {
        setS3DirectTarget(s3DirectTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that maps data property keys in the data source to data property keys in the data target.
     * You can rename keys, modify the data types for keys, and choose which keys to drop from the dataset.
     * </p>
     * 
     * @param applyMapping
     *        Specifies a transform that maps data property keys in the data source to data property keys in the data
     *        target. You can rename keys, modify the data types for keys, and choose which keys to drop from the
     *        dataset.
     */

    public void setApplyMapping(ApplyMapping applyMapping) {
        this.applyMapping = applyMapping;
    }

    /**
     * <p>
     * Specifies a transform that maps data property keys in the data source to data property keys in the data target.
     * You can rename keys, modify the data types for keys, and choose which keys to drop from the dataset.
     * </p>
     * 
     * @return Specifies a transform that maps data property keys in the data source to data property keys in the data
     *         target. You can rename keys, modify the data types for keys, and choose which keys to drop from the
     *         dataset.
     */

    public ApplyMapping getApplyMapping() {
        return this.applyMapping;
    }

    /**
     * <p>
     * Specifies a transform that maps data property keys in the data source to data property keys in the data target.
     * You can rename keys, modify the data types for keys, and choose which keys to drop from the dataset.
     * </p>
     * 
     * @param applyMapping
     *        Specifies a transform that maps data property keys in the data source to data property keys in the data
     *        target. You can rename keys, modify the data types for keys, and choose which keys to drop from the
     *        dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withApplyMapping(ApplyMapping applyMapping) {
        setApplyMapping(applyMapping);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that chooses the data property keys that you want to keep.
     * </p>
     * 
     * @param selectFields
     *        Specifies a transform that chooses the data property keys that you want to keep.
     */

    public void setSelectFields(SelectFields selectFields) {
        this.selectFields = selectFields;
    }

    /**
     * <p>
     * Specifies a transform that chooses the data property keys that you want to keep.
     * </p>
     * 
     * @return Specifies a transform that chooses the data property keys that you want to keep.
     */

    public SelectFields getSelectFields() {
        return this.selectFields;
    }

    /**
     * <p>
     * Specifies a transform that chooses the data property keys that you want to keep.
     * </p>
     * 
     * @param selectFields
     *        Specifies a transform that chooses the data property keys that you want to keep.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withSelectFields(SelectFields selectFields) {
        setSelectFields(selectFields);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that chooses the data property keys that you want to drop.
     * </p>
     * 
     * @param dropFields
     *        Specifies a transform that chooses the data property keys that you want to drop.
     */

    public void setDropFields(DropFields dropFields) {
        this.dropFields = dropFields;
    }

    /**
     * <p>
     * Specifies a transform that chooses the data property keys that you want to drop.
     * </p>
     * 
     * @return Specifies a transform that chooses the data property keys that you want to drop.
     */

    public DropFields getDropFields() {
        return this.dropFields;
    }

    /**
     * <p>
     * Specifies a transform that chooses the data property keys that you want to drop.
     * </p>
     * 
     * @param dropFields
     *        Specifies a transform that chooses the data property keys that you want to drop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withDropFields(DropFields dropFields) {
        setDropFields(dropFields);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that renames a single data property key.
     * </p>
     * 
     * @param renameField
     *        Specifies a transform that renames a single data property key.
     */

    public void setRenameField(RenameField renameField) {
        this.renameField = renameField;
    }

    /**
     * <p>
     * Specifies a transform that renames a single data property key.
     * </p>
     * 
     * @return Specifies a transform that renames a single data property key.
     */

    public RenameField getRenameField() {
        return this.renameField;
    }

    /**
     * <p>
     * Specifies a transform that renames a single data property key.
     * </p>
     * 
     * @param renameField
     *        Specifies a transform that renames a single data property key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withRenameField(RenameField renameField) {
        setRenameField(renameField);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that writes samples of the data to an Amazon S3 bucket.
     * </p>
     * 
     * @param spigot
     *        Specifies a transform that writes samples of the data to an Amazon S3 bucket.
     */

    public void setSpigot(Spigot spigot) {
        this.spigot = spigot;
    }

    /**
     * <p>
     * Specifies a transform that writes samples of the data to an Amazon S3 bucket.
     * </p>
     * 
     * @return Specifies a transform that writes samples of the data to an Amazon S3 bucket.
     */

    public Spigot getSpigot() {
        return this.spigot;
    }

    /**
     * <p>
     * Specifies a transform that writes samples of the data to an Amazon S3 bucket.
     * </p>
     * 
     * @param spigot
     *        Specifies a transform that writes samples of the data to an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withSpigot(Spigot spigot) {
        setSpigot(spigot);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that joins two datasets into one dataset using a comparison phrase on the specified data
     * property keys. You can use inner, outer, left, right, left semi, and left anti joins.
     * </p>
     * 
     * @param join
     *        Specifies a transform that joins two datasets into one dataset using a comparison phrase on the specified
     *        data property keys. You can use inner, outer, left, right, left semi, and left anti joins.
     */

    public void setJoin(Join join) {
        this.join = join;
    }

    /**
     * <p>
     * Specifies a transform that joins two datasets into one dataset using a comparison phrase on the specified data
     * property keys. You can use inner, outer, left, right, left semi, and left anti joins.
     * </p>
     * 
     * @return Specifies a transform that joins two datasets into one dataset using a comparison phrase on the specified
     *         data property keys. You can use inner, outer, left, right, left semi, and left anti joins.
     */

    public Join getJoin() {
        return this.join;
    }

    /**
     * <p>
     * Specifies a transform that joins two datasets into one dataset using a comparison phrase on the specified data
     * property keys. You can use inner, outer, left, right, left semi, and left anti joins.
     * </p>
     * 
     * @param join
     *        Specifies a transform that joins two datasets into one dataset using a comparison phrase on the specified
     *        data property keys. You can use inner, outer, left, right, left semi, and left anti joins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withJoin(Join join) {
        setJoin(join);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that splits data property keys into two <code>DynamicFrames</code>. The output is a
     * collection of <code>DynamicFrames</code>: one with selected data property keys, and one with the remaining data
     * property keys.
     * </p>
     * 
     * @param splitFields
     *        Specifies a transform that splits data property keys into two <code>DynamicFrames</code>. The output is a
     *        collection of <code>DynamicFrames</code>: one with selected data property keys, and one with the remaining
     *        data property keys.
     */

    public void setSplitFields(SplitFields splitFields) {
        this.splitFields = splitFields;
    }

    /**
     * <p>
     * Specifies a transform that splits data property keys into two <code>DynamicFrames</code>. The output is a
     * collection of <code>DynamicFrames</code>: one with selected data property keys, and one with the remaining data
     * property keys.
     * </p>
     * 
     * @return Specifies a transform that splits data property keys into two <code>DynamicFrames</code>. The output is a
     *         collection of <code>DynamicFrames</code>: one with selected data property keys, and one with the
     *         remaining data property keys.
     */

    public SplitFields getSplitFields() {
        return this.splitFields;
    }

    /**
     * <p>
     * Specifies a transform that splits data property keys into two <code>DynamicFrames</code>. The output is a
     * collection of <code>DynamicFrames</code>: one with selected data property keys, and one with the remaining data
     * property keys.
     * </p>
     * 
     * @param splitFields
     *        Specifies a transform that splits data property keys into two <code>DynamicFrames</code>. The output is a
     *        collection of <code>DynamicFrames</code>: one with selected data property keys, and one with the remaining
     *        data property keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withSplitFields(SplitFields splitFields) {
        setSplitFields(splitFields);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that chooses one <code>DynamicFrame</code> from a collection of <code>DynamicFrames</code>.
     * The output is the selected <code>DynamicFrame</code>
     * </p>
     * 
     * @param selectFromCollection
     *        Specifies a transform that chooses one <code>DynamicFrame</code> from a collection of
     *        <code>DynamicFrames</code>. The output is the selected <code>DynamicFrame</code>
     */

    public void setSelectFromCollection(SelectFromCollection selectFromCollection) {
        this.selectFromCollection = selectFromCollection;
    }

    /**
     * <p>
     * Specifies a transform that chooses one <code>DynamicFrame</code> from a collection of <code>DynamicFrames</code>.
     * The output is the selected <code>DynamicFrame</code>
     * </p>
     * 
     * @return Specifies a transform that chooses one <code>DynamicFrame</code> from a collection of
     *         <code>DynamicFrames</code>. The output is the selected <code>DynamicFrame</code>
     */

    public SelectFromCollection getSelectFromCollection() {
        return this.selectFromCollection;
    }

    /**
     * <p>
     * Specifies a transform that chooses one <code>DynamicFrame</code> from a collection of <code>DynamicFrames</code>.
     * The output is the selected <code>DynamicFrame</code>
     * </p>
     * 
     * @param selectFromCollection
     *        Specifies a transform that chooses one <code>DynamicFrame</code> from a collection of
     *        <code>DynamicFrames</code>. The output is the selected <code>DynamicFrame</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withSelectFromCollection(SelectFromCollection selectFromCollection) {
        setSelectFromCollection(selectFromCollection);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that locates records in the dataset that have missing values and adds a new field with a
     * value determined by imputation. The input data set is used to train the machine learning model that determines
     * what the missing value should be.
     * </p>
     * 
     * @param fillMissingValues
     *        Specifies a transform that locates records in the dataset that have missing values and adds a new field
     *        with a value determined by imputation. The input data set is used to train the machine learning model that
     *        determines what the missing value should be.
     */

    public void setFillMissingValues(FillMissingValues fillMissingValues) {
        this.fillMissingValues = fillMissingValues;
    }

    /**
     * <p>
     * Specifies a transform that locates records in the dataset that have missing values and adds a new field with a
     * value determined by imputation. The input data set is used to train the machine learning model that determines
     * what the missing value should be.
     * </p>
     * 
     * @return Specifies a transform that locates records in the dataset that have missing values and adds a new field
     *         with a value determined by imputation. The input data set is used to train the machine learning model
     *         that determines what the missing value should be.
     */

    public FillMissingValues getFillMissingValues() {
        return this.fillMissingValues;
    }

    /**
     * <p>
     * Specifies a transform that locates records in the dataset that have missing values and adds a new field with a
     * value determined by imputation. The input data set is used to train the machine learning model that determines
     * what the missing value should be.
     * </p>
     * 
     * @param fillMissingValues
     *        Specifies a transform that locates records in the dataset that have missing values and adds a new field
     *        with a value determined by imputation. The input data set is used to train the machine learning model that
     *        determines what the missing value should be.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withFillMissingValues(FillMissingValues fillMissingValues) {
        setFillMissingValues(fillMissingValues);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that splits a dataset into two, based on a filter condition.
     * </p>
     * 
     * @param filter
     *        Specifies a transform that splits a dataset into two, based on a filter condition.
     */

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Specifies a transform that splits a dataset into two, based on a filter condition.
     * </p>
     * 
     * @return Specifies a transform that splits a dataset into two, based on a filter condition.
     */

    public Filter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Specifies a transform that splits a dataset into two, based on a filter condition.
     * </p>
     * 
     * @param filter
     *        Specifies a transform that splits a dataset into two, based on a filter condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withFilter(Filter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that uses custom code you provide to perform the data transformation. The output is a
     * collection of DynamicFrames.
     * </p>
     * 
     * @param customCode
     *        Specifies a transform that uses custom code you provide to perform the data transformation. The output is
     *        a collection of DynamicFrames.
     */

    public void setCustomCode(CustomCode customCode) {
        this.customCode = customCode;
    }

    /**
     * <p>
     * Specifies a transform that uses custom code you provide to perform the data transformation. The output is a
     * collection of DynamicFrames.
     * </p>
     * 
     * @return Specifies a transform that uses custom code you provide to perform the data transformation. The output is
     *         a collection of DynamicFrames.
     */

    public CustomCode getCustomCode() {
        return this.customCode;
    }

    /**
     * <p>
     * Specifies a transform that uses custom code you provide to perform the data transformation. The output is a
     * collection of DynamicFrames.
     * </p>
     * 
     * @param customCode
     *        Specifies a transform that uses custom code you provide to perform the data transformation. The output is
     *        a collection of DynamicFrames.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withCustomCode(CustomCode customCode) {
        setCustomCode(customCode);
        return this;
    }

    /**
     * <p>
     * Specifies a transform where you enter a SQL query using Spark SQL syntax to transform the data. The output is a
     * single <code>DynamicFrame</code>.
     * </p>
     * 
     * @param sparkSQL
     *        Specifies a transform where you enter a SQL query using Spark SQL syntax to transform the data. The output
     *        is a single <code>DynamicFrame</code>.
     */

    public void setSparkSQL(SparkSQL sparkSQL) {
        this.sparkSQL = sparkSQL;
    }

    /**
     * <p>
     * Specifies a transform where you enter a SQL query using Spark SQL syntax to transform the data. The output is a
     * single <code>DynamicFrame</code>.
     * </p>
     * 
     * @return Specifies a transform where you enter a SQL query using Spark SQL syntax to transform the data. The
     *         output is a single <code>DynamicFrame</code>.
     */

    public SparkSQL getSparkSQL() {
        return this.sparkSQL;
    }

    /**
     * <p>
     * Specifies a transform where you enter a SQL query using Spark SQL syntax to transform the data. The output is a
     * single <code>DynamicFrame</code>.
     * </p>
     * 
     * @param sparkSQL
     *        Specifies a transform where you enter a SQL query using Spark SQL syntax to transform the data. The output
     *        is a single <code>DynamicFrame</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withSparkSQL(SparkSQL sparkSQL) {
        setSparkSQL(sparkSQL);
        return this;
    }

    /**
     * <p>
     * Specifies a direct Amazon Kinesis data source.
     * </p>
     * 
     * @param directKinesisSource
     *        Specifies a direct Amazon Kinesis data source.
     */

    public void setDirectKinesisSource(DirectKinesisSource directKinesisSource) {
        this.directKinesisSource = directKinesisSource;
    }

    /**
     * <p>
     * Specifies a direct Amazon Kinesis data source.
     * </p>
     * 
     * @return Specifies a direct Amazon Kinesis data source.
     */

    public DirectKinesisSource getDirectKinesisSource() {
        return this.directKinesisSource;
    }

    /**
     * <p>
     * Specifies a direct Amazon Kinesis data source.
     * </p>
     * 
     * @param directKinesisSource
     *        Specifies a direct Amazon Kinesis data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withDirectKinesisSource(DirectKinesisSource directKinesisSource) {
        setDirectKinesisSource(directKinesisSource);
        return this;
    }

    /**
     * <p>
     * Specifies an Apache Kafka data store.
     * </p>
     * 
     * @param directKafkaSource
     *        Specifies an Apache Kafka data store.
     */

    public void setDirectKafkaSource(DirectKafkaSource directKafkaSource) {
        this.directKafkaSource = directKafkaSource;
    }

    /**
     * <p>
     * Specifies an Apache Kafka data store.
     * </p>
     * 
     * @return Specifies an Apache Kafka data store.
     */

    public DirectKafkaSource getDirectKafkaSource() {
        return this.directKafkaSource;
    }

    /**
     * <p>
     * Specifies an Apache Kafka data store.
     * </p>
     * 
     * @param directKafkaSource
     *        Specifies an Apache Kafka data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withDirectKafkaSource(DirectKafkaSource directKafkaSource) {
        setDirectKafkaSource(directKafkaSource);
        return this;
    }

    /**
     * <p>
     * Specifies a Kinesis data source in the Glue Data Catalog.
     * </p>
     * 
     * @param catalogKinesisSource
     *        Specifies a Kinesis data source in the Glue Data Catalog.
     */

    public void setCatalogKinesisSource(CatalogKinesisSource catalogKinesisSource) {
        this.catalogKinesisSource = catalogKinesisSource;
    }

    /**
     * <p>
     * Specifies a Kinesis data source in the Glue Data Catalog.
     * </p>
     * 
     * @return Specifies a Kinesis data source in the Glue Data Catalog.
     */

    public CatalogKinesisSource getCatalogKinesisSource() {
        return this.catalogKinesisSource;
    }

    /**
     * <p>
     * Specifies a Kinesis data source in the Glue Data Catalog.
     * </p>
     * 
     * @param catalogKinesisSource
     *        Specifies a Kinesis data source in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withCatalogKinesisSource(CatalogKinesisSource catalogKinesisSource) {
        setCatalogKinesisSource(catalogKinesisSource);
        return this;
    }

    /**
     * <p>
     * Specifies an Apache Kafka data store in the Data Catalog.
     * </p>
     * 
     * @param catalogKafkaSource
     *        Specifies an Apache Kafka data store in the Data Catalog.
     */

    public void setCatalogKafkaSource(CatalogKafkaSource catalogKafkaSource) {
        this.catalogKafkaSource = catalogKafkaSource;
    }

    /**
     * <p>
     * Specifies an Apache Kafka data store in the Data Catalog.
     * </p>
     * 
     * @return Specifies an Apache Kafka data store in the Data Catalog.
     */

    public CatalogKafkaSource getCatalogKafkaSource() {
        return this.catalogKafkaSource;
    }

    /**
     * <p>
     * Specifies an Apache Kafka data store in the Data Catalog.
     * </p>
     * 
     * @param catalogKafkaSource
     *        Specifies an Apache Kafka data store in the Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withCatalogKafkaSource(CatalogKafkaSource catalogKafkaSource) {
        setCatalogKafkaSource(catalogKafkaSource);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that removes columns from the dataset if all values in the column are 'null'. By default,
     * Glue Studio will recognize null objects, but some values such as empty strings, strings that are "null", -1
     * integers or other placeholders such as zeros, are not automatically recognized as nulls.
     * </p>
     * 
     * @param dropNullFields
     *        Specifies a transform that removes columns from the dataset if all values in the column are 'null'. By
     *        default, Glue Studio will recognize null objects, but some values such as empty strings, strings that are
     *        "null", -1 integers or other placeholders such as zeros, are not automatically recognized as nulls.
     */

    public void setDropNullFields(DropNullFields dropNullFields) {
        this.dropNullFields = dropNullFields;
    }

    /**
     * <p>
     * Specifies a transform that removes columns from the dataset if all values in the column are 'null'. By default,
     * Glue Studio will recognize null objects, but some values such as empty strings, strings that are "null", -1
     * integers or other placeholders such as zeros, are not automatically recognized as nulls.
     * </p>
     * 
     * @return Specifies a transform that removes columns from the dataset if all values in the column are 'null'. By
     *         default, Glue Studio will recognize null objects, but some values such as empty strings, strings that are
     *         "null", -1 integers or other placeholders such as zeros, are not automatically recognized as nulls.
     */

    public DropNullFields getDropNullFields() {
        return this.dropNullFields;
    }

    /**
     * <p>
     * Specifies a transform that removes columns from the dataset if all values in the column are 'null'. By default,
     * Glue Studio will recognize null objects, but some values such as empty strings, strings that are "null", -1
     * integers or other placeholders such as zeros, are not automatically recognized as nulls.
     * </p>
     * 
     * @param dropNullFields
     *        Specifies a transform that removes columns from the dataset if all values in the column are 'null'. By
     *        default, Glue Studio will recognize null objects, but some values such as empty strings, strings that are
     *        "null", -1 integers or other placeholders such as zeros, are not automatically recognized as nulls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withDropNullFields(DropNullFields dropNullFields) {
        setDropNullFields(dropNullFields);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that merges a <code>DynamicFrame</code> with a staging <code>DynamicFrame</code> based on
     * the specified primary keys to identify records. Duplicate records (records with the same primary keys) are not
     * de-duplicated.
     * </p>
     * 
     * @param merge
     *        Specifies a transform that merges a <code>DynamicFrame</code> with a staging <code>DynamicFrame</code>
     *        based on the specified primary keys to identify records. Duplicate records (records with the same primary
     *        keys) are not de-duplicated.
     */

    public void setMerge(Merge merge) {
        this.merge = merge;
    }

    /**
     * <p>
     * Specifies a transform that merges a <code>DynamicFrame</code> with a staging <code>DynamicFrame</code> based on
     * the specified primary keys to identify records. Duplicate records (records with the same primary keys) are not
     * de-duplicated.
     * </p>
     * 
     * @return Specifies a transform that merges a <code>DynamicFrame</code> with a staging <code>DynamicFrame</code>
     *         based on the specified primary keys to identify records. Duplicate records (records with the same primary
     *         keys) are not de-duplicated.
     */

    public Merge getMerge() {
        return this.merge;
    }

    /**
     * <p>
     * Specifies a transform that merges a <code>DynamicFrame</code> with a staging <code>DynamicFrame</code> based on
     * the specified primary keys to identify records. Duplicate records (records with the same primary keys) are not
     * de-duplicated.
     * </p>
     * 
     * @param merge
     *        Specifies a transform that merges a <code>DynamicFrame</code> with a staging <code>DynamicFrame</code>
     *        based on the specified primary keys to identify records. Duplicate records (records with the same primary
     *        keys) are not de-duplicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withMerge(Merge merge) {
        setMerge(merge);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that combines the rows from two or more datasets into a single result.
     * </p>
     * 
     * @param union
     *        Specifies a transform that combines the rows from two or more datasets into a single result.
     */

    public void setUnion(Union union) {
        this.union = union;
    }

    /**
     * <p>
     * Specifies a transform that combines the rows from two or more datasets into a single result.
     * </p>
     * 
     * @return Specifies a transform that combines the rows from two or more datasets into a single result.
     */

    public Union getUnion() {
        return this.union;
    }

    /**
     * <p>
     * Specifies a transform that combines the rows from two or more datasets into a single result.
     * </p>
     * 
     * @param union
     *        Specifies a transform that combines the rows from two or more datasets into a single result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withUnion(Union union) {
        setUnion(union);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that identifies, removes or masks PII data.
     * </p>
     * 
     * @param pIIDetection
     *        Specifies a transform that identifies, removes or masks PII data.
     */

    public void setPIIDetection(PIIDetection pIIDetection) {
        this.pIIDetection = pIIDetection;
    }

    /**
     * <p>
     * Specifies a transform that identifies, removes or masks PII data.
     * </p>
     * 
     * @return Specifies a transform that identifies, removes or masks PII data.
     */

    public PIIDetection getPIIDetection() {
        return this.pIIDetection;
    }

    /**
     * <p>
     * Specifies a transform that identifies, removes or masks PII data.
     * </p>
     * 
     * @param pIIDetection
     *        Specifies a transform that identifies, removes or masks PII data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withPIIDetection(PIIDetection pIIDetection) {
        setPIIDetection(pIIDetection);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that groups rows by chosen fields and computes the aggregated value by specified function.
     * </p>
     * 
     * @param aggregate
     *        Specifies a transform that groups rows by chosen fields and computes the aggregated value by specified
     *        function.
     */

    public void setAggregate(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    /**
     * <p>
     * Specifies a transform that groups rows by chosen fields and computes the aggregated value by specified function.
     * </p>
     * 
     * @return Specifies a transform that groups rows by chosen fields and computes the aggregated value by specified
     *         function.
     */

    public Aggregate getAggregate() {
        return this.aggregate;
    }

    /**
     * <p>
     * Specifies a transform that groups rows by chosen fields and computes the aggregated value by specified function.
     * </p>
     * 
     * @param aggregate
     *        Specifies a transform that groups rows by chosen fields and computes the aggregated value by specified
     *        function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withAggregate(Aggregate aggregate) {
        setAggregate(aggregate);
        return this;
    }

    /**
     * <p>
     * Specifies a transform that removes rows of repeating data from a data set.
     * </p>
     * 
     * @param dropDuplicates
     *        Specifies a transform that removes rows of repeating data from a data set.
     */

    public void setDropDuplicates(DropDuplicates dropDuplicates) {
        this.dropDuplicates = dropDuplicates;
    }

    /**
     * <p>
     * Specifies a transform that removes rows of repeating data from a data set.
     * </p>
     * 
     * @return Specifies a transform that removes rows of repeating data from a data set.
     */

    public DropDuplicates getDropDuplicates() {
        return this.dropDuplicates;
    }

    /**
     * <p>
     * Specifies a transform that removes rows of repeating data from a data set.
     * </p>
     * 
     * @param dropDuplicates
     *        Specifies a transform that removes rows of repeating data from a data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withDropDuplicates(DropDuplicates dropDuplicates) {
        setDropDuplicates(dropDuplicates);
        return this;
    }

    /**
     * <p>
     * Specifies a data target that writes to a goverened catalog.
     * </p>
     * 
     * @param governedCatalogTarget
     *        Specifies a data target that writes to a goverened catalog.
     */

    public void setGovernedCatalogTarget(GovernedCatalogTarget governedCatalogTarget) {
        this.governedCatalogTarget = governedCatalogTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to a goverened catalog.
     * </p>
     * 
     * @return Specifies a data target that writes to a goverened catalog.
     */

    public GovernedCatalogTarget getGovernedCatalogTarget() {
        return this.governedCatalogTarget;
    }

    /**
     * <p>
     * Specifies a data target that writes to a goverened catalog.
     * </p>
     * 
     * @param governedCatalogTarget
     *        Specifies a data target that writes to a goverened catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withGovernedCatalogTarget(GovernedCatalogTarget governedCatalogTarget) {
        setGovernedCatalogTarget(governedCatalogTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a data source in a goverened Data Catalog.
     * </p>
     * 
     * @param governedCatalogSource
     *        Specifies a data source in a goverened Data Catalog.
     */

    public void setGovernedCatalogSource(GovernedCatalogSource governedCatalogSource) {
        this.governedCatalogSource = governedCatalogSource;
    }

    /**
     * <p>
     * Specifies a data source in a goverened Data Catalog.
     * </p>
     * 
     * @return Specifies a data source in a goverened Data Catalog.
     */

    public GovernedCatalogSource getGovernedCatalogSource() {
        return this.governedCatalogSource;
    }

    /**
     * <p>
     * Specifies a data source in a goverened Data Catalog.
     * </p>
     * 
     * @param governedCatalogSource
     *        Specifies a data source in a goverened Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withGovernedCatalogSource(GovernedCatalogSource governedCatalogSource) {
        setGovernedCatalogSource(governedCatalogSource);
        return this;
    }

    /**
     * <p>
     * Specifies a Microsoft SQL server data source in the Glue Data Catalog.
     * </p>
     * 
     * @param microsoftSQLServerCatalogSource
     *        Specifies a Microsoft SQL server data source in the Glue Data Catalog.
     */

    public void setMicrosoftSQLServerCatalogSource(MicrosoftSQLServerCatalogSource microsoftSQLServerCatalogSource) {
        this.microsoftSQLServerCatalogSource = microsoftSQLServerCatalogSource;
    }

    /**
     * <p>
     * Specifies a Microsoft SQL server data source in the Glue Data Catalog.
     * </p>
     * 
     * @return Specifies a Microsoft SQL server data source in the Glue Data Catalog.
     */

    public MicrosoftSQLServerCatalogSource getMicrosoftSQLServerCatalogSource() {
        return this.microsoftSQLServerCatalogSource;
    }

    /**
     * <p>
     * Specifies a Microsoft SQL server data source in the Glue Data Catalog.
     * </p>
     * 
     * @param microsoftSQLServerCatalogSource
     *        Specifies a Microsoft SQL server data source in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withMicrosoftSQLServerCatalogSource(MicrosoftSQLServerCatalogSource microsoftSQLServerCatalogSource) {
        setMicrosoftSQLServerCatalogSource(microsoftSQLServerCatalogSource);
        return this;
    }

    /**
     * <p>
     * Specifies a MySQL data source in the Glue Data Catalog.
     * </p>
     * 
     * @param mySQLCatalogSource
     *        Specifies a MySQL data source in the Glue Data Catalog.
     */

    public void setMySQLCatalogSource(MySQLCatalogSource mySQLCatalogSource) {
        this.mySQLCatalogSource = mySQLCatalogSource;
    }

    /**
     * <p>
     * Specifies a MySQL data source in the Glue Data Catalog.
     * </p>
     * 
     * @return Specifies a MySQL data source in the Glue Data Catalog.
     */

    public MySQLCatalogSource getMySQLCatalogSource() {
        return this.mySQLCatalogSource;
    }

    /**
     * <p>
     * Specifies a MySQL data source in the Glue Data Catalog.
     * </p>
     * 
     * @param mySQLCatalogSource
     *        Specifies a MySQL data source in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withMySQLCatalogSource(MySQLCatalogSource mySQLCatalogSource) {
        setMySQLCatalogSource(mySQLCatalogSource);
        return this;
    }

    /**
     * <p>
     * Specifies an Oracle data source in the Glue Data Catalog.
     * </p>
     * 
     * @param oracleSQLCatalogSource
     *        Specifies an Oracle data source in the Glue Data Catalog.
     */

    public void setOracleSQLCatalogSource(OracleSQLCatalogSource oracleSQLCatalogSource) {
        this.oracleSQLCatalogSource = oracleSQLCatalogSource;
    }

    /**
     * <p>
     * Specifies an Oracle data source in the Glue Data Catalog.
     * </p>
     * 
     * @return Specifies an Oracle data source in the Glue Data Catalog.
     */

    public OracleSQLCatalogSource getOracleSQLCatalogSource() {
        return this.oracleSQLCatalogSource;
    }

    /**
     * <p>
     * Specifies an Oracle data source in the Glue Data Catalog.
     * </p>
     * 
     * @param oracleSQLCatalogSource
     *        Specifies an Oracle data source in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withOracleSQLCatalogSource(OracleSQLCatalogSource oracleSQLCatalogSource) {
        setOracleSQLCatalogSource(oracleSQLCatalogSource);
        return this;
    }

    /**
     * <p>
     * Specifies a PostgresSQL data source in the Glue Data Catalog.
     * </p>
     * 
     * @param postgreSQLCatalogSource
     *        Specifies a PostgresSQL data source in the Glue Data Catalog.
     */

    public void setPostgreSQLCatalogSource(PostgreSQLCatalogSource postgreSQLCatalogSource) {
        this.postgreSQLCatalogSource = postgreSQLCatalogSource;
    }

    /**
     * <p>
     * Specifies a PostgresSQL data source in the Glue Data Catalog.
     * </p>
     * 
     * @return Specifies a PostgresSQL data source in the Glue Data Catalog.
     */

    public PostgreSQLCatalogSource getPostgreSQLCatalogSource() {
        return this.postgreSQLCatalogSource;
    }

    /**
     * <p>
     * Specifies a PostgresSQL data source in the Glue Data Catalog.
     * </p>
     * 
     * @param postgreSQLCatalogSource
     *        Specifies a PostgresSQL data source in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withPostgreSQLCatalogSource(PostgreSQLCatalogSource postgreSQLCatalogSource) {
        setPostgreSQLCatalogSource(postgreSQLCatalogSource);
        return this;
    }

    /**
     * <p>
     * Specifies a target that uses Microsoft SQL.
     * </p>
     * 
     * @param microsoftSQLServerCatalogTarget
     *        Specifies a target that uses Microsoft SQL.
     */

    public void setMicrosoftSQLServerCatalogTarget(MicrosoftSQLServerCatalogTarget microsoftSQLServerCatalogTarget) {
        this.microsoftSQLServerCatalogTarget = microsoftSQLServerCatalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses Microsoft SQL.
     * </p>
     * 
     * @return Specifies a target that uses Microsoft SQL.
     */

    public MicrosoftSQLServerCatalogTarget getMicrosoftSQLServerCatalogTarget() {
        return this.microsoftSQLServerCatalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses Microsoft SQL.
     * </p>
     * 
     * @param microsoftSQLServerCatalogTarget
     *        Specifies a target that uses Microsoft SQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withMicrosoftSQLServerCatalogTarget(MicrosoftSQLServerCatalogTarget microsoftSQLServerCatalogTarget) {
        setMicrosoftSQLServerCatalogTarget(microsoftSQLServerCatalogTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a target that uses MySQL.
     * </p>
     * 
     * @param mySQLCatalogTarget
     *        Specifies a target that uses MySQL.
     */

    public void setMySQLCatalogTarget(MySQLCatalogTarget mySQLCatalogTarget) {
        this.mySQLCatalogTarget = mySQLCatalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses MySQL.
     * </p>
     * 
     * @return Specifies a target that uses MySQL.
     */

    public MySQLCatalogTarget getMySQLCatalogTarget() {
        return this.mySQLCatalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses MySQL.
     * </p>
     * 
     * @param mySQLCatalogTarget
     *        Specifies a target that uses MySQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withMySQLCatalogTarget(MySQLCatalogTarget mySQLCatalogTarget) {
        setMySQLCatalogTarget(mySQLCatalogTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a target that uses Oracle SQL.
     * </p>
     * 
     * @param oracleSQLCatalogTarget
     *        Specifies a target that uses Oracle SQL.
     */

    public void setOracleSQLCatalogTarget(OracleSQLCatalogTarget oracleSQLCatalogTarget) {
        this.oracleSQLCatalogTarget = oracleSQLCatalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses Oracle SQL.
     * </p>
     * 
     * @return Specifies a target that uses Oracle SQL.
     */

    public OracleSQLCatalogTarget getOracleSQLCatalogTarget() {
        return this.oracleSQLCatalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses Oracle SQL.
     * </p>
     * 
     * @param oracleSQLCatalogTarget
     *        Specifies a target that uses Oracle SQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withOracleSQLCatalogTarget(OracleSQLCatalogTarget oracleSQLCatalogTarget) {
        setOracleSQLCatalogTarget(oracleSQLCatalogTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a target that uses Postgres SQL.
     * </p>
     * 
     * @param postgreSQLCatalogTarget
     *        Specifies a target that uses Postgres SQL.
     */

    public void setPostgreSQLCatalogTarget(PostgreSQLCatalogTarget postgreSQLCatalogTarget) {
        this.postgreSQLCatalogTarget = postgreSQLCatalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses Postgres SQL.
     * </p>
     * 
     * @return Specifies a target that uses Postgres SQL.
     */

    public PostgreSQLCatalogTarget getPostgreSQLCatalogTarget() {
        return this.postgreSQLCatalogTarget;
    }

    /**
     * <p>
     * Specifies a target that uses Postgres SQL.
     * </p>
     * 
     * @param postgreSQLCatalogTarget
     *        Specifies a target that uses Postgres SQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withPostgreSQLCatalogTarget(PostgreSQLCatalogTarget postgreSQLCatalogTarget) {
        setPostgreSQLCatalogTarget(postgreSQLCatalogTarget);
        return this;
    }

    /**
     * <p>
     * Specifies a custom visual transform created by a user.
     * </p>
     * 
     * @param dynamicTransform
     *        Specifies a custom visual transform created by a user.
     */

    public void setDynamicTransform(DynamicTransform dynamicTransform) {
        this.dynamicTransform = dynamicTransform;
    }

    /**
     * <p>
     * Specifies a custom visual transform created by a user.
     * </p>
     * 
     * @return Specifies a custom visual transform created by a user.
     */

    public DynamicTransform getDynamicTransform() {
        return this.dynamicTransform;
    }

    /**
     * <p>
     * Specifies a custom visual transform created by a user.
     * </p>
     * 
     * @param dynamicTransform
     *        Specifies a custom visual transform created by a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withDynamicTransform(DynamicTransform dynamicTransform) {
        setDynamicTransform(dynamicTransform);
        return this;
    }

    /**
     * <p>
     * Specifies your data quality evaluation criteria.
     * </p>
     * 
     * @param evaluateDataQuality
     *        Specifies your data quality evaluation criteria.
     */

    public void setEvaluateDataQuality(EvaluateDataQuality evaluateDataQuality) {
        this.evaluateDataQuality = evaluateDataQuality;
    }

    /**
     * <p>
     * Specifies your data quality evaluation criteria.
     * </p>
     * 
     * @return Specifies your data quality evaluation criteria.
     */

    public EvaluateDataQuality getEvaluateDataQuality() {
        return this.evaluateDataQuality;
    }

    /**
     * <p>
     * Specifies your data quality evaluation criteria.
     * </p>
     * 
     * @param evaluateDataQuality
     *        Specifies your data quality evaluation criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenConfigurationNode withEvaluateDataQuality(EvaluateDataQuality evaluateDataQuality) {
        setEvaluateDataQuality(evaluateDataQuality);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAthenaConnectorSource() != null)
            sb.append("AthenaConnectorSource: ").append(getAthenaConnectorSource()).append(",");
        if (getJDBCConnectorSource() != null)
            sb.append("JDBCConnectorSource: ").append(getJDBCConnectorSource()).append(",");
        if (getSparkConnectorSource() != null)
            sb.append("SparkConnectorSource: ").append(getSparkConnectorSource()).append(",");
        if (getCatalogSource() != null)
            sb.append("CatalogSource: ").append(getCatalogSource()).append(",");
        if (getRedshiftSource() != null)
            sb.append("RedshiftSource: ").append(getRedshiftSource()).append(",");
        if (getS3CatalogSource() != null)
            sb.append("S3CatalogSource: ").append(getS3CatalogSource()).append(",");
        if (getS3CsvSource() != null)
            sb.append("S3CsvSource: ").append(getS3CsvSource()).append(",");
        if (getS3JsonSource() != null)
            sb.append("S3JsonSource: ").append(getS3JsonSource()).append(",");
        if (getS3ParquetSource() != null)
            sb.append("S3ParquetSource: ").append(getS3ParquetSource()).append(",");
        if (getRelationalCatalogSource() != null)
            sb.append("RelationalCatalogSource: ").append(getRelationalCatalogSource()).append(",");
        if (getDynamoDBCatalogSource() != null)
            sb.append("DynamoDBCatalogSource: ").append(getDynamoDBCatalogSource()).append(",");
        if (getJDBCConnectorTarget() != null)
            sb.append("JDBCConnectorTarget: ").append(getJDBCConnectorTarget()).append(",");
        if (getSparkConnectorTarget() != null)
            sb.append("SparkConnectorTarget: ").append(getSparkConnectorTarget()).append(",");
        if (getCatalogTarget() != null)
            sb.append("CatalogTarget: ").append(getCatalogTarget()).append(",");
        if (getRedshiftTarget() != null)
            sb.append("RedshiftTarget: ").append(getRedshiftTarget()).append(",");
        if (getS3CatalogTarget() != null)
            sb.append("S3CatalogTarget: ").append(getS3CatalogTarget()).append(",");
        if (getS3GlueParquetTarget() != null)
            sb.append("S3GlueParquetTarget: ").append(getS3GlueParquetTarget()).append(",");
        if (getS3DirectTarget() != null)
            sb.append("S3DirectTarget: ").append(getS3DirectTarget()).append(",");
        if (getApplyMapping() != null)
            sb.append("ApplyMapping: ").append(getApplyMapping()).append(",");
        if (getSelectFields() != null)
            sb.append("SelectFields: ").append(getSelectFields()).append(",");
        if (getDropFields() != null)
            sb.append("DropFields: ").append(getDropFields()).append(",");
        if (getRenameField() != null)
            sb.append("RenameField: ").append(getRenameField()).append(",");
        if (getSpigot() != null)
            sb.append("Spigot: ").append(getSpigot()).append(",");
        if (getJoin() != null)
            sb.append("Join: ").append(getJoin()).append(",");
        if (getSplitFields() != null)
            sb.append("SplitFields: ").append(getSplitFields()).append(",");
        if (getSelectFromCollection() != null)
            sb.append("SelectFromCollection: ").append(getSelectFromCollection()).append(",");
        if (getFillMissingValues() != null)
            sb.append("FillMissingValues: ").append(getFillMissingValues()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getCustomCode() != null)
            sb.append("CustomCode: ").append(getCustomCode()).append(",");
        if (getSparkSQL() != null)
            sb.append("SparkSQL: ").append(getSparkSQL()).append(",");
        if (getDirectKinesisSource() != null)
            sb.append("DirectKinesisSource: ").append(getDirectKinesisSource()).append(",");
        if (getDirectKafkaSource() != null)
            sb.append("DirectKafkaSource: ").append(getDirectKafkaSource()).append(",");
        if (getCatalogKinesisSource() != null)
            sb.append("CatalogKinesisSource: ").append(getCatalogKinesisSource()).append(",");
        if (getCatalogKafkaSource() != null)
            sb.append("CatalogKafkaSource: ").append(getCatalogKafkaSource()).append(",");
        if (getDropNullFields() != null)
            sb.append("DropNullFields: ").append(getDropNullFields()).append(",");
        if (getMerge() != null)
            sb.append("Merge: ").append(getMerge()).append(",");
        if (getUnion() != null)
            sb.append("Union: ").append(getUnion()).append(",");
        if (getPIIDetection() != null)
            sb.append("PIIDetection: ").append(getPIIDetection()).append(",");
        if (getAggregate() != null)
            sb.append("Aggregate: ").append(getAggregate()).append(",");
        if (getDropDuplicates() != null)
            sb.append("DropDuplicates: ").append(getDropDuplicates()).append(",");
        if (getGovernedCatalogTarget() != null)
            sb.append("GovernedCatalogTarget: ").append(getGovernedCatalogTarget()).append(",");
        if (getGovernedCatalogSource() != null)
            sb.append("GovernedCatalogSource: ").append(getGovernedCatalogSource()).append(",");
        if (getMicrosoftSQLServerCatalogSource() != null)
            sb.append("MicrosoftSQLServerCatalogSource: ").append(getMicrosoftSQLServerCatalogSource()).append(",");
        if (getMySQLCatalogSource() != null)
            sb.append("MySQLCatalogSource: ").append(getMySQLCatalogSource()).append(",");
        if (getOracleSQLCatalogSource() != null)
            sb.append("OracleSQLCatalogSource: ").append(getOracleSQLCatalogSource()).append(",");
        if (getPostgreSQLCatalogSource() != null)
            sb.append("PostgreSQLCatalogSource: ").append(getPostgreSQLCatalogSource()).append(",");
        if (getMicrosoftSQLServerCatalogTarget() != null)
            sb.append("MicrosoftSQLServerCatalogTarget: ").append(getMicrosoftSQLServerCatalogTarget()).append(",");
        if (getMySQLCatalogTarget() != null)
            sb.append("MySQLCatalogTarget: ").append(getMySQLCatalogTarget()).append(",");
        if (getOracleSQLCatalogTarget() != null)
            sb.append("OracleSQLCatalogTarget: ").append(getOracleSQLCatalogTarget()).append(",");
        if (getPostgreSQLCatalogTarget() != null)
            sb.append("PostgreSQLCatalogTarget: ").append(getPostgreSQLCatalogTarget()).append(",");
        if (getDynamicTransform() != null)
            sb.append("DynamicTransform: ").append(getDynamicTransform()).append(",");
        if (getEvaluateDataQuality() != null)
            sb.append("EvaluateDataQuality: ").append(getEvaluateDataQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeGenConfigurationNode == false)
            return false;
        CodeGenConfigurationNode other = (CodeGenConfigurationNode) obj;
        if (other.getAthenaConnectorSource() == null ^ this.getAthenaConnectorSource() == null)
            return false;
        if (other.getAthenaConnectorSource() != null && other.getAthenaConnectorSource().equals(this.getAthenaConnectorSource()) == false)
            return false;
        if (other.getJDBCConnectorSource() == null ^ this.getJDBCConnectorSource() == null)
            return false;
        if (other.getJDBCConnectorSource() != null && other.getJDBCConnectorSource().equals(this.getJDBCConnectorSource()) == false)
            return false;
        if (other.getSparkConnectorSource() == null ^ this.getSparkConnectorSource() == null)
            return false;
        if (other.getSparkConnectorSource() != null && other.getSparkConnectorSource().equals(this.getSparkConnectorSource()) == false)
            return false;
        if (other.getCatalogSource() == null ^ this.getCatalogSource() == null)
            return false;
        if (other.getCatalogSource() != null && other.getCatalogSource().equals(this.getCatalogSource()) == false)
            return false;
        if (other.getRedshiftSource() == null ^ this.getRedshiftSource() == null)
            return false;
        if (other.getRedshiftSource() != null && other.getRedshiftSource().equals(this.getRedshiftSource()) == false)
            return false;
        if (other.getS3CatalogSource() == null ^ this.getS3CatalogSource() == null)
            return false;
        if (other.getS3CatalogSource() != null && other.getS3CatalogSource().equals(this.getS3CatalogSource()) == false)
            return false;
        if (other.getS3CsvSource() == null ^ this.getS3CsvSource() == null)
            return false;
        if (other.getS3CsvSource() != null && other.getS3CsvSource().equals(this.getS3CsvSource()) == false)
            return false;
        if (other.getS3JsonSource() == null ^ this.getS3JsonSource() == null)
            return false;
        if (other.getS3JsonSource() != null && other.getS3JsonSource().equals(this.getS3JsonSource()) == false)
            return false;
        if (other.getS3ParquetSource() == null ^ this.getS3ParquetSource() == null)
            return false;
        if (other.getS3ParquetSource() != null && other.getS3ParquetSource().equals(this.getS3ParquetSource()) == false)
            return false;
        if (other.getRelationalCatalogSource() == null ^ this.getRelationalCatalogSource() == null)
            return false;
        if (other.getRelationalCatalogSource() != null && other.getRelationalCatalogSource().equals(this.getRelationalCatalogSource()) == false)
            return false;
        if (other.getDynamoDBCatalogSource() == null ^ this.getDynamoDBCatalogSource() == null)
            return false;
        if (other.getDynamoDBCatalogSource() != null && other.getDynamoDBCatalogSource().equals(this.getDynamoDBCatalogSource()) == false)
            return false;
        if (other.getJDBCConnectorTarget() == null ^ this.getJDBCConnectorTarget() == null)
            return false;
        if (other.getJDBCConnectorTarget() != null && other.getJDBCConnectorTarget().equals(this.getJDBCConnectorTarget()) == false)
            return false;
        if (other.getSparkConnectorTarget() == null ^ this.getSparkConnectorTarget() == null)
            return false;
        if (other.getSparkConnectorTarget() != null && other.getSparkConnectorTarget().equals(this.getSparkConnectorTarget()) == false)
            return false;
        if (other.getCatalogTarget() == null ^ this.getCatalogTarget() == null)
            return false;
        if (other.getCatalogTarget() != null && other.getCatalogTarget().equals(this.getCatalogTarget()) == false)
            return false;
        if (other.getRedshiftTarget() == null ^ this.getRedshiftTarget() == null)
            return false;
        if (other.getRedshiftTarget() != null && other.getRedshiftTarget().equals(this.getRedshiftTarget()) == false)
            return false;
        if (other.getS3CatalogTarget() == null ^ this.getS3CatalogTarget() == null)
            return false;
        if (other.getS3CatalogTarget() != null && other.getS3CatalogTarget().equals(this.getS3CatalogTarget()) == false)
            return false;
        if (other.getS3GlueParquetTarget() == null ^ this.getS3GlueParquetTarget() == null)
            return false;
        if (other.getS3GlueParquetTarget() != null && other.getS3GlueParquetTarget().equals(this.getS3GlueParquetTarget()) == false)
            return false;
        if (other.getS3DirectTarget() == null ^ this.getS3DirectTarget() == null)
            return false;
        if (other.getS3DirectTarget() != null && other.getS3DirectTarget().equals(this.getS3DirectTarget()) == false)
            return false;
        if (other.getApplyMapping() == null ^ this.getApplyMapping() == null)
            return false;
        if (other.getApplyMapping() != null && other.getApplyMapping().equals(this.getApplyMapping()) == false)
            return false;
        if (other.getSelectFields() == null ^ this.getSelectFields() == null)
            return false;
        if (other.getSelectFields() != null && other.getSelectFields().equals(this.getSelectFields()) == false)
            return false;
        if (other.getDropFields() == null ^ this.getDropFields() == null)
            return false;
        if (other.getDropFields() != null && other.getDropFields().equals(this.getDropFields()) == false)
            return false;
        if (other.getRenameField() == null ^ this.getRenameField() == null)
            return false;
        if (other.getRenameField() != null && other.getRenameField().equals(this.getRenameField()) == false)
            return false;
        if (other.getSpigot() == null ^ this.getSpigot() == null)
            return false;
        if (other.getSpigot() != null && other.getSpigot().equals(this.getSpigot()) == false)
            return false;
        if (other.getJoin() == null ^ this.getJoin() == null)
            return false;
        if (other.getJoin() != null && other.getJoin().equals(this.getJoin()) == false)
            return false;
        if (other.getSplitFields() == null ^ this.getSplitFields() == null)
            return false;
        if (other.getSplitFields() != null && other.getSplitFields().equals(this.getSplitFields()) == false)
            return false;
        if (other.getSelectFromCollection() == null ^ this.getSelectFromCollection() == null)
            return false;
        if (other.getSelectFromCollection() != null && other.getSelectFromCollection().equals(this.getSelectFromCollection()) == false)
            return false;
        if (other.getFillMissingValues() == null ^ this.getFillMissingValues() == null)
            return false;
        if (other.getFillMissingValues() != null && other.getFillMissingValues().equals(this.getFillMissingValues()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getCustomCode() == null ^ this.getCustomCode() == null)
            return false;
        if (other.getCustomCode() != null && other.getCustomCode().equals(this.getCustomCode()) == false)
            return false;
        if (other.getSparkSQL() == null ^ this.getSparkSQL() == null)
            return false;
        if (other.getSparkSQL() != null && other.getSparkSQL().equals(this.getSparkSQL()) == false)
            return false;
        if (other.getDirectKinesisSource() == null ^ this.getDirectKinesisSource() == null)
            return false;
        if (other.getDirectKinesisSource() != null && other.getDirectKinesisSource().equals(this.getDirectKinesisSource()) == false)
            return false;
        if (other.getDirectKafkaSource() == null ^ this.getDirectKafkaSource() == null)
            return false;
        if (other.getDirectKafkaSource() != null && other.getDirectKafkaSource().equals(this.getDirectKafkaSource()) == false)
            return false;
        if (other.getCatalogKinesisSource() == null ^ this.getCatalogKinesisSource() == null)
            return false;
        if (other.getCatalogKinesisSource() != null && other.getCatalogKinesisSource().equals(this.getCatalogKinesisSource()) == false)
            return false;
        if (other.getCatalogKafkaSource() == null ^ this.getCatalogKafkaSource() == null)
            return false;
        if (other.getCatalogKafkaSource() != null && other.getCatalogKafkaSource().equals(this.getCatalogKafkaSource()) == false)
            return false;
        if (other.getDropNullFields() == null ^ this.getDropNullFields() == null)
            return false;
        if (other.getDropNullFields() != null && other.getDropNullFields().equals(this.getDropNullFields()) == false)
            return false;
        if (other.getMerge() == null ^ this.getMerge() == null)
            return false;
        if (other.getMerge() != null && other.getMerge().equals(this.getMerge()) == false)
            return false;
        if (other.getUnion() == null ^ this.getUnion() == null)
            return false;
        if (other.getUnion() != null && other.getUnion().equals(this.getUnion()) == false)
            return false;
        if (other.getPIIDetection() == null ^ this.getPIIDetection() == null)
            return false;
        if (other.getPIIDetection() != null && other.getPIIDetection().equals(this.getPIIDetection()) == false)
            return false;
        if (other.getAggregate() == null ^ this.getAggregate() == null)
            return false;
        if (other.getAggregate() != null && other.getAggregate().equals(this.getAggregate()) == false)
            return false;
        if (other.getDropDuplicates() == null ^ this.getDropDuplicates() == null)
            return false;
        if (other.getDropDuplicates() != null && other.getDropDuplicates().equals(this.getDropDuplicates()) == false)
            return false;
        if (other.getGovernedCatalogTarget() == null ^ this.getGovernedCatalogTarget() == null)
            return false;
        if (other.getGovernedCatalogTarget() != null && other.getGovernedCatalogTarget().equals(this.getGovernedCatalogTarget()) == false)
            return false;
        if (other.getGovernedCatalogSource() == null ^ this.getGovernedCatalogSource() == null)
            return false;
        if (other.getGovernedCatalogSource() != null && other.getGovernedCatalogSource().equals(this.getGovernedCatalogSource()) == false)
            return false;
        if (other.getMicrosoftSQLServerCatalogSource() == null ^ this.getMicrosoftSQLServerCatalogSource() == null)
            return false;
        if (other.getMicrosoftSQLServerCatalogSource() != null
                && other.getMicrosoftSQLServerCatalogSource().equals(this.getMicrosoftSQLServerCatalogSource()) == false)
            return false;
        if (other.getMySQLCatalogSource() == null ^ this.getMySQLCatalogSource() == null)
            return false;
        if (other.getMySQLCatalogSource() != null && other.getMySQLCatalogSource().equals(this.getMySQLCatalogSource()) == false)
            return false;
        if (other.getOracleSQLCatalogSource() == null ^ this.getOracleSQLCatalogSource() == null)
            return false;
        if (other.getOracleSQLCatalogSource() != null && other.getOracleSQLCatalogSource().equals(this.getOracleSQLCatalogSource()) == false)
            return false;
        if (other.getPostgreSQLCatalogSource() == null ^ this.getPostgreSQLCatalogSource() == null)
            return false;
        if (other.getPostgreSQLCatalogSource() != null && other.getPostgreSQLCatalogSource().equals(this.getPostgreSQLCatalogSource()) == false)
            return false;
        if (other.getMicrosoftSQLServerCatalogTarget() == null ^ this.getMicrosoftSQLServerCatalogTarget() == null)
            return false;
        if (other.getMicrosoftSQLServerCatalogTarget() != null
                && other.getMicrosoftSQLServerCatalogTarget().equals(this.getMicrosoftSQLServerCatalogTarget()) == false)
            return false;
        if (other.getMySQLCatalogTarget() == null ^ this.getMySQLCatalogTarget() == null)
            return false;
        if (other.getMySQLCatalogTarget() != null && other.getMySQLCatalogTarget().equals(this.getMySQLCatalogTarget()) == false)
            return false;
        if (other.getOracleSQLCatalogTarget() == null ^ this.getOracleSQLCatalogTarget() == null)
            return false;
        if (other.getOracleSQLCatalogTarget() != null && other.getOracleSQLCatalogTarget().equals(this.getOracleSQLCatalogTarget()) == false)
            return false;
        if (other.getPostgreSQLCatalogTarget() == null ^ this.getPostgreSQLCatalogTarget() == null)
            return false;
        if (other.getPostgreSQLCatalogTarget() != null && other.getPostgreSQLCatalogTarget().equals(this.getPostgreSQLCatalogTarget()) == false)
            return false;
        if (other.getDynamicTransform() == null ^ this.getDynamicTransform() == null)
            return false;
        if (other.getDynamicTransform() != null && other.getDynamicTransform().equals(this.getDynamicTransform()) == false)
            return false;
        if (other.getEvaluateDataQuality() == null ^ this.getEvaluateDataQuality() == null)
            return false;
        if (other.getEvaluateDataQuality() != null && other.getEvaluateDataQuality().equals(this.getEvaluateDataQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAthenaConnectorSource() == null) ? 0 : getAthenaConnectorSource().hashCode());
        hashCode = prime * hashCode + ((getJDBCConnectorSource() == null) ? 0 : getJDBCConnectorSource().hashCode());
        hashCode = prime * hashCode + ((getSparkConnectorSource() == null) ? 0 : getSparkConnectorSource().hashCode());
        hashCode = prime * hashCode + ((getCatalogSource() == null) ? 0 : getCatalogSource().hashCode());
        hashCode = prime * hashCode + ((getRedshiftSource() == null) ? 0 : getRedshiftSource().hashCode());
        hashCode = prime * hashCode + ((getS3CatalogSource() == null) ? 0 : getS3CatalogSource().hashCode());
        hashCode = prime * hashCode + ((getS3CsvSource() == null) ? 0 : getS3CsvSource().hashCode());
        hashCode = prime * hashCode + ((getS3JsonSource() == null) ? 0 : getS3JsonSource().hashCode());
        hashCode = prime * hashCode + ((getS3ParquetSource() == null) ? 0 : getS3ParquetSource().hashCode());
        hashCode = prime * hashCode + ((getRelationalCatalogSource() == null) ? 0 : getRelationalCatalogSource().hashCode());
        hashCode = prime * hashCode + ((getDynamoDBCatalogSource() == null) ? 0 : getDynamoDBCatalogSource().hashCode());
        hashCode = prime * hashCode + ((getJDBCConnectorTarget() == null) ? 0 : getJDBCConnectorTarget().hashCode());
        hashCode = prime * hashCode + ((getSparkConnectorTarget() == null) ? 0 : getSparkConnectorTarget().hashCode());
        hashCode = prime * hashCode + ((getCatalogTarget() == null) ? 0 : getCatalogTarget().hashCode());
        hashCode = prime * hashCode + ((getRedshiftTarget() == null) ? 0 : getRedshiftTarget().hashCode());
        hashCode = prime * hashCode + ((getS3CatalogTarget() == null) ? 0 : getS3CatalogTarget().hashCode());
        hashCode = prime * hashCode + ((getS3GlueParquetTarget() == null) ? 0 : getS3GlueParquetTarget().hashCode());
        hashCode = prime * hashCode + ((getS3DirectTarget() == null) ? 0 : getS3DirectTarget().hashCode());
        hashCode = prime * hashCode + ((getApplyMapping() == null) ? 0 : getApplyMapping().hashCode());
        hashCode = prime * hashCode + ((getSelectFields() == null) ? 0 : getSelectFields().hashCode());
        hashCode = prime * hashCode + ((getDropFields() == null) ? 0 : getDropFields().hashCode());
        hashCode = prime * hashCode + ((getRenameField() == null) ? 0 : getRenameField().hashCode());
        hashCode = prime * hashCode + ((getSpigot() == null) ? 0 : getSpigot().hashCode());
        hashCode = prime * hashCode + ((getJoin() == null) ? 0 : getJoin().hashCode());
        hashCode = prime * hashCode + ((getSplitFields() == null) ? 0 : getSplitFields().hashCode());
        hashCode = prime * hashCode + ((getSelectFromCollection() == null) ? 0 : getSelectFromCollection().hashCode());
        hashCode = prime * hashCode + ((getFillMissingValues() == null) ? 0 : getFillMissingValues().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getCustomCode() == null) ? 0 : getCustomCode().hashCode());
        hashCode = prime * hashCode + ((getSparkSQL() == null) ? 0 : getSparkSQL().hashCode());
        hashCode = prime * hashCode + ((getDirectKinesisSource() == null) ? 0 : getDirectKinesisSource().hashCode());
        hashCode = prime * hashCode + ((getDirectKafkaSource() == null) ? 0 : getDirectKafkaSource().hashCode());
        hashCode = prime * hashCode + ((getCatalogKinesisSource() == null) ? 0 : getCatalogKinesisSource().hashCode());
        hashCode = prime * hashCode + ((getCatalogKafkaSource() == null) ? 0 : getCatalogKafkaSource().hashCode());
        hashCode = prime * hashCode + ((getDropNullFields() == null) ? 0 : getDropNullFields().hashCode());
        hashCode = prime * hashCode + ((getMerge() == null) ? 0 : getMerge().hashCode());
        hashCode = prime * hashCode + ((getUnion() == null) ? 0 : getUnion().hashCode());
        hashCode = prime * hashCode + ((getPIIDetection() == null) ? 0 : getPIIDetection().hashCode());
        hashCode = prime * hashCode + ((getAggregate() == null) ? 0 : getAggregate().hashCode());
        hashCode = prime * hashCode + ((getDropDuplicates() == null) ? 0 : getDropDuplicates().hashCode());
        hashCode = prime * hashCode + ((getGovernedCatalogTarget() == null) ? 0 : getGovernedCatalogTarget().hashCode());
        hashCode = prime * hashCode + ((getGovernedCatalogSource() == null) ? 0 : getGovernedCatalogSource().hashCode());
        hashCode = prime * hashCode + ((getMicrosoftSQLServerCatalogSource() == null) ? 0 : getMicrosoftSQLServerCatalogSource().hashCode());
        hashCode = prime * hashCode + ((getMySQLCatalogSource() == null) ? 0 : getMySQLCatalogSource().hashCode());
        hashCode = prime * hashCode + ((getOracleSQLCatalogSource() == null) ? 0 : getOracleSQLCatalogSource().hashCode());
        hashCode = prime * hashCode + ((getPostgreSQLCatalogSource() == null) ? 0 : getPostgreSQLCatalogSource().hashCode());
        hashCode = prime * hashCode + ((getMicrosoftSQLServerCatalogTarget() == null) ? 0 : getMicrosoftSQLServerCatalogTarget().hashCode());
        hashCode = prime * hashCode + ((getMySQLCatalogTarget() == null) ? 0 : getMySQLCatalogTarget().hashCode());
        hashCode = prime * hashCode + ((getOracleSQLCatalogTarget() == null) ? 0 : getOracleSQLCatalogTarget().hashCode());
        hashCode = prime * hashCode + ((getPostgreSQLCatalogTarget() == null) ? 0 : getPostgreSQLCatalogTarget().hashCode());
        hashCode = prime * hashCode + ((getDynamicTransform() == null) ? 0 : getDynamicTransform().hashCode());
        hashCode = prime * hashCode + ((getEvaluateDataQuality() == null) ? 0 : getEvaluateDataQuality().hashCode());
        return hashCode;
    }

    @Override
    public CodeGenConfigurationNode clone() {
        try {
            return (CodeGenConfigurationNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CodeGenConfigurationNodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
