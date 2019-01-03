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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data specification of an Amazon Relational Database Service (Amazon RDS) <code>DataSource</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSDataSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the <code>DatabaseName</code> and <code>InstanceIdentifier</code> of an Amazon RDS database.
     * </p>
     */
    private RDSDatabase databaseInformation;
    /**
     * <p>
     * The query that is used to retrieve the observation data for the <code>DataSource</code>.
     * </p>
     */
    private String selectSqlQuery;
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon RDS database.
     * </p>
     */
    private RDSDatabaseCredentials databaseCredentials;
    /**
     * <p>
     * The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     * <code>SelectSqlQuery</code> is stored in this location.
     * </p>
     */
    private String s3StagingLocation;
    /**
     * <p>
     * A JSON string that represents the splitting and rearrangement processing to be applied to a
     * <code>DataSource</code>. If the <code>DataRearrangement</code> parameter is not provided, all of the input data
     * is used to create the <code>Datasource</code>.
     * </p>
     * <p>
     * There are multiple parameters that control what data is used to create a datasource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b><code>percentBegin</code></b>
     * </p>
     * <p>
     * Use <code>percentBegin</code> to indicate the beginning of the range of the data used to create the Datasource.
     * If you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the data
     * when creating the datasource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>percentEnd</code></b>
     * </p>
     * <p>
     * Use <code>percentEnd</code> to indicate the end of the range of the data used to create the Datasource. If you do
     * not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the data when
     * creating the datasource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>complement</code></b>
     * </p>
     * <p>
     * The <code>complement</code> parameter instructs Amazon ML to use the data that is not included in the range of
     * <code>percentBegin</code> to <code>percentEnd</code> to create a datasource. The <code>complement</code>
     * parameter is useful if you need to create complementary datasources for training and evaluation. To create a
     * complementary datasource, use the same values for <code>percentBegin</code> and <code>percentEnd</code>, along
     * with the <code>complement</code> parameter.
     * </p>
     * <p>
     * For example, the following two datasources do not share any data, and can be used to train and evaluate a model.
     * The first datasource has 25 percent of the data, and the second one has 75 percent of the data.
     * </p>
     * <p>
     * Datasource for evaluation: <code>{"splitting":{"percentBegin":0, "percentEnd":25}}</code>
     * </p>
     * <p>
     * Datasource for training: <code>{"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>strategy</code></b>
     * </p>
     * <p>
     * To change how Amazon ML splits the data for a datasource, use the <code>strategy</code> parameter.
     * </p>
     * <p>
     * The default value for the <code>strategy</code> parameter is <code>sequential</code>, meaning that Amazon ML
     * takes all of the data records between the <code>percentBegin</code> and <code>percentEnd</code> parameters for
     * the datasource, in the order that the records appear in the input data.
     * </p>
     * <p>
     * The following two <code>DataRearrangement</code> lines are examples of sequentially ordered training and
     * evaluation datasources:
     * </p>
     * <p>
     * Datasource for evaluation:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}}</code>
     * </p>
     * <p>
     * Datasource for training:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}}</code>
     * </p>
     * <p>
     * To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters,
     * set the <code>strategy</code> parameter to <code>random</code> and provide a string that is used as the seed
     * value for the random data splitting (for example, you can use the S3 path to your data as the random seed
     * string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number
     * between 0 and 100, and then selects the rows that have an assigned number between <code>percentBegin</code> and
     * <code>percentEnd</code>. Pseudo-random numbers are assigned using both the input seed string value and the byte
     * offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The
     * random splitting strategy ensures that variables in the training and evaluation data are distributed similarly.
     * It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in
     * training and evaluation datasources containing non-similar data records.
     * </p>
     * <p>
     * The following two <code>DataRearrangement</code> lines are examples of non-sequentially ordered training and
     * evaluation datasources:
     * </p>
     * <p>
     * Datasource for evaluation:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}}</code>
     * </p>
     * <p>
     * Datasource for training:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}</code>
     * </p>
     * </li>
     * </ul>
     */
    private String dataRearrangement;
    /**
     * <p>
     * A JSON string that represents the schema for an Amazon RDS <code>DataSource</code>. The <code>DataSchema</code>
     * defines the structure of the observation data in the data file(s) referenced in the <code>DataSource</code>.
     * </p>
     * <p>
     * A <code>DataSchema</code> is not required if you specify a <code>DataSchemaUri</code>
     * </p>
     * <p>
     * Define your <code>DataSchema</code> as a series of key-value pairs. <code>attributes</code> and
     * <code>excludedVariableNames</code> have an array of key-value pairs for their value. Use the following format to
     * define your <code>DataSchema</code>.
     * </p>
     * <p>
     * { "version": "1.0",
     * </p>
     * <p>
     * "recordAnnotationFieldName": "F1",
     * </p>
     * <p>
     * "recordWeightFieldName": "F2",
     * </p>
     * <p>
     * "targetFieldName": "F3",
     * </p>
     * <p>
     * "dataFormat": "CSV",
     * </p>
     * <p>
     * "dataFileContainsHeader": true,
     * </p>
     * <p>
     * "attributes": [
     * </p>
     * <p>
     * { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3",
     * "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType":
     * "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType":
     * "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     * </p>
     * <p>
     * "excludedVariableNames": [ "F6" ] }
     * </p>
     * <?oxy_insert_end>
     */
    private String dataSchema;
    /**
     * <p>
     * The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     */
    private String dataSchemaUri;
    /**
     * <p>
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon Elastic Compute Cloud (Amazon EC2) instance to
     * carry out the copy operation from Amazon RDS to an Amazon S3 task. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     */
    private String resourceRole;
    /**
     * <p>
     * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline service to monitor the progress of the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The subnet ID to be used to access a VPC-based RDS DB instance. This attribute is used by Data Pipeline to carry
     * out the copy task from Amazon RDS to Amazon S3.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate
     * ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to carry out
     * the copy operation from Amazon RDS to an Amazon S3 task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;

    /**
     * <p>
     * Describes the <code>DatabaseName</code> and <code>InstanceIdentifier</code> of an Amazon RDS database.
     * </p>
     * 
     * @param databaseInformation
     *        Describes the <code>DatabaseName</code> and <code>InstanceIdentifier</code> of an Amazon RDS database.
     */

    public void setDatabaseInformation(RDSDatabase databaseInformation) {
        this.databaseInformation = databaseInformation;
    }

    /**
     * <p>
     * Describes the <code>DatabaseName</code> and <code>InstanceIdentifier</code> of an Amazon RDS database.
     * </p>
     * 
     * @return Describes the <code>DatabaseName</code> and <code>InstanceIdentifier</code> of an Amazon RDS database.
     */

    public RDSDatabase getDatabaseInformation() {
        return this.databaseInformation;
    }

    /**
     * <p>
     * Describes the <code>DatabaseName</code> and <code>InstanceIdentifier</code> of an Amazon RDS database.
     * </p>
     * 
     * @param databaseInformation
     *        Describes the <code>DatabaseName</code> and <code>InstanceIdentifier</code> of an Amazon RDS database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withDatabaseInformation(RDSDatabase databaseInformation) {
        setDatabaseInformation(databaseInformation);
        return this;
    }

    /**
     * <p>
     * The query that is used to retrieve the observation data for the <code>DataSource</code>.
     * </p>
     * 
     * @param selectSqlQuery
     *        The query that is used to retrieve the observation data for the <code>DataSource</code>.
     */

    public void setSelectSqlQuery(String selectSqlQuery) {
        this.selectSqlQuery = selectSqlQuery;
    }

    /**
     * <p>
     * The query that is used to retrieve the observation data for the <code>DataSource</code>.
     * </p>
     * 
     * @return The query that is used to retrieve the observation data for the <code>DataSource</code>.
     */

    public String getSelectSqlQuery() {
        return this.selectSqlQuery;
    }

    /**
     * <p>
     * The query that is used to retrieve the observation data for the <code>DataSource</code>.
     * </p>
     * 
     * @param selectSqlQuery
     *        The query that is used to retrieve the observation data for the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withSelectSqlQuery(String selectSqlQuery) {
        setSelectSqlQuery(selectSqlQuery);
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon RDS database.
     * </p>
     * 
     * @param databaseCredentials
     *        The AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon RDS database.
     */

    public void setDatabaseCredentials(RDSDatabaseCredentials databaseCredentials) {
        this.databaseCredentials = databaseCredentials;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon RDS database.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon RDS
     *         database.
     */

    public RDSDatabaseCredentials getDatabaseCredentials() {
        return this.databaseCredentials;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon RDS database.
     * </p>
     * 
     * @param databaseCredentials
     *        The AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon RDS database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withDatabaseCredentials(RDSDatabaseCredentials databaseCredentials) {
        setDatabaseCredentials(databaseCredentials);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     * <code>SelectSqlQuery</code> is stored in this location.
     * </p>
     * 
     * @param s3StagingLocation
     *        The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     *        <code>SelectSqlQuery</code> is stored in this location.
     */

    public void setS3StagingLocation(String s3StagingLocation) {
        this.s3StagingLocation = s3StagingLocation;
    }

    /**
     * <p>
     * The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     * <code>SelectSqlQuery</code> is stored in this location.
     * </p>
     * 
     * @return The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     *         <code>SelectSqlQuery</code> is stored in this location.
     */

    public String getS3StagingLocation() {
        return this.s3StagingLocation;
    }

    /**
     * <p>
     * The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     * <code>SelectSqlQuery</code> is stored in this location.
     * </p>
     * 
     * @param s3StagingLocation
     *        The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using
     *        <code>SelectSqlQuery</code> is stored in this location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withS3StagingLocation(String s3StagingLocation) {
        setS3StagingLocation(s3StagingLocation);
        return this;
    }

    /**
     * <p>
     * A JSON string that represents the splitting and rearrangement processing to be applied to a
     * <code>DataSource</code>. If the <code>DataRearrangement</code> parameter is not provided, all of the input data
     * is used to create the <code>Datasource</code>.
     * </p>
     * <p>
     * There are multiple parameters that control what data is used to create a datasource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b><code>percentBegin</code></b>
     * </p>
     * <p>
     * Use <code>percentBegin</code> to indicate the beginning of the range of the data used to create the Datasource.
     * If you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the data
     * when creating the datasource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>percentEnd</code></b>
     * </p>
     * <p>
     * Use <code>percentEnd</code> to indicate the end of the range of the data used to create the Datasource. If you do
     * not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the data when
     * creating the datasource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>complement</code></b>
     * </p>
     * <p>
     * The <code>complement</code> parameter instructs Amazon ML to use the data that is not included in the range of
     * <code>percentBegin</code> to <code>percentEnd</code> to create a datasource. The <code>complement</code>
     * parameter is useful if you need to create complementary datasources for training and evaluation. To create a
     * complementary datasource, use the same values for <code>percentBegin</code> and <code>percentEnd</code>, along
     * with the <code>complement</code> parameter.
     * </p>
     * <p>
     * For example, the following two datasources do not share any data, and can be used to train and evaluate a model.
     * The first datasource has 25 percent of the data, and the second one has 75 percent of the data.
     * </p>
     * <p>
     * Datasource for evaluation: <code>{"splitting":{"percentBegin":0, "percentEnd":25}}</code>
     * </p>
     * <p>
     * Datasource for training: <code>{"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>strategy</code></b>
     * </p>
     * <p>
     * To change how Amazon ML splits the data for a datasource, use the <code>strategy</code> parameter.
     * </p>
     * <p>
     * The default value for the <code>strategy</code> parameter is <code>sequential</code>, meaning that Amazon ML
     * takes all of the data records between the <code>percentBegin</code> and <code>percentEnd</code> parameters for
     * the datasource, in the order that the records appear in the input data.
     * </p>
     * <p>
     * The following two <code>DataRearrangement</code> lines are examples of sequentially ordered training and
     * evaluation datasources:
     * </p>
     * <p>
     * Datasource for evaluation:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}}</code>
     * </p>
     * <p>
     * Datasource for training:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}}</code>
     * </p>
     * <p>
     * To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters,
     * set the <code>strategy</code> parameter to <code>random</code> and provide a string that is used as the seed
     * value for the random data splitting (for example, you can use the S3 path to your data as the random seed
     * string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number
     * between 0 and 100, and then selects the rows that have an assigned number between <code>percentBegin</code> and
     * <code>percentEnd</code>. Pseudo-random numbers are assigned using both the input seed string value and the byte
     * offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The
     * random splitting strategy ensures that variables in the training and evaluation data are distributed similarly.
     * It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in
     * training and evaluation datasources containing non-similar data records.
     * </p>
     * <p>
     * The following two <code>DataRearrangement</code> lines are examples of non-sequentially ordered training and
     * evaluation datasources:
     * </p>
     * <p>
     * Datasource for evaluation:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}}</code>
     * </p>
     * <p>
     * Datasource for training:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataRearrangement
     *        A JSON string that represents the splitting and rearrangement processing to be applied to a
     *        <code>DataSource</code>. If the <code>DataRearrangement</code> parameter is not provided, all of the input
     *        data is used to create the <code>Datasource</code>.</p>
     *        <p>
     *        There are multiple parameters that control what data is used to create a datasource:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b><code>percentBegin</code></b>
     *        </p>
     *        <p>
     *        Use <code>percentBegin</code> to indicate the beginning of the range of the data used to create the
     *        Datasource. If you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML
     *        includes all of the data when creating the datasource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b><code>percentEnd</code></b>
     *        </p>
     *        <p>
     *        Use <code>percentEnd</code> to indicate the end of the range of the data used to create the Datasource. If
     *        you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the
     *        data when creating the datasource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b><code>complement</code></b>
     *        </p>
     *        <p>
     *        The <code>complement</code> parameter instructs Amazon ML to use the data that is not included in the
     *        range of <code>percentBegin</code> to <code>percentEnd</code> to create a datasource. The
     *        <code>complement</code> parameter is useful if you need to create complementary datasources for training
     *        and evaluation. To create a complementary datasource, use the same values for <code>percentBegin</code>
     *        and <code>percentEnd</code>, along with the <code>complement</code> parameter.
     *        </p>
     *        <p>
     *        For example, the following two datasources do not share any data, and can be used to train and evaluate a
     *        model. The first datasource has 25 percent of the data, and the second one has 75 percent of the data.
     *        </p>
     *        <p>
     *        Datasource for evaluation: <code>{"splitting":{"percentBegin":0, "percentEnd":25}}</code>
     *        </p>
     *        <p>
     *        Datasource for training:
     *        <code>{"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b><code>strategy</code></b>
     *        </p>
     *        <p>
     *        To change how Amazon ML splits the data for a datasource, use the <code>strategy</code> parameter.
     *        </p>
     *        <p>
     *        The default value for the <code>strategy</code> parameter is <code>sequential</code>, meaning that Amazon
     *        ML takes all of the data records between the <code>percentBegin</code> and <code>percentEnd</code>
     *        parameters for the datasource, in the order that the records appear in the input data.
     *        </p>
     *        <p>
     *        The following two <code>DataRearrangement</code> lines are examples of sequentially ordered training and
     *        evaluation datasources:
     *        </p>
     *        <p>
     *        Datasource for evaluation:
     *        <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}}</code>
     *        </p>
     *        <p>
     *        Datasource for training:
     *        <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}}</code>
     *        </p>
     *        <p>
     *        To randomly split the input data into the proportions indicated by the percentBegin and percentEnd
     *        parameters, set the <code>strategy</code> parameter to <code>random</code> and provide a string that is
     *        used as the seed value for the random data splitting (for example, you can use the S3 path to your data as
     *        the random seed string). If you choose the random split strategy, Amazon ML assigns each row of data a
     *        pseudo-random number between 0 and 100, and then selects the rows that have an assigned number between
     *        <code>percentBegin</code> and <code>percentEnd</code>. Pseudo-random numbers are assigned using both the
     *        input seed string value and the byte offset as a seed, so changing the data results in a different split.
     *        Any existing ordering is preserved. The random splitting strategy ensures that variables in the training
     *        and evaluation data are distributed similarly. It is useful in the cases where the input data may have an
     *        implicit sort order, which would otherwise result in training and evaluation datasources containing
     *        non-similar data records.
     *        </p>
     *        <p>
     *        The following two <code>DataRearrangement</code> lines are examples of non-sequentially ordered training
     *        and evaluation datasources:
     *        </p>
     *        <p>
     *        Datasource for evaluation:
     *        <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}}</code>
     *        </p>
     *        <p>
     *        Datasource for training:
     *        <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}</code>
     *        </p>
     *        </li>
     */

    public void setDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
    }

    /**
     * <p>
     * A JSON string that represents the splitting and rearrangement processing to be applied to a
     * <code>DataSource</code>. If the <code>DataRearrangement</code> parameter is not provided, all of the input data
     * is used to create the <code>Datasource</code>.
     * </p>
     * <p>
     * There are multiple parameters that control what data is used to create a datasource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b><code>percentBegin</code></b>
     * </p>
     * <p>
     * Use <code>percentBegin</code> to indicate the beginning of the range of the data used to create the Datasource.
     * If you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the data
     * when creating the datasource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>percentEnd</code></b>
     * </p>
     * <p>
     * Use <code>percentEnd</code> to indicate the end of the range of the data used to create the Datasource. If you do
     * not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the data when
     * creating the datasource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>complement</code></b>
     * </p>
     * <p>
     * The <code>complement</code> parameter instructs Amazon ML to use the data that is not included in the range of
     * <code>percentBegin</code> to <code>percentEnd</code> to create a datasource. The <code>complement</code>
     * parameter is useful if you need to create complementary datasources for training and evaluation. To create a
     * complementary datasource, use the same values for <code>percentBegin</code> and <code>percentEnd</code>, along
     * with the <code>complement</code> parameter.
     * </p>
     * <p>
     * For example, the following two datasources do not share any data, and can be used to train and evaluate a model.
     * The first datasource has 25 percent of the data, and the second one has 75 percent of the data.
     * </p>
     * <p>
     * Datasource for evaluation: <code>{"splitting":{"percentBegin":0, "percentEnd":25}}</code>
     * </p>
     * <p>
     * Datasource for training: <code>{"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>strategy</code></b>
     * </p>
     * <p>
     * To change how Amazon ML splits the data for a datasource, use the <code>strategy</code> parameter.
     * </p>
     * <p>
     * The default value for the <code>strategy</code> parameter is <code>sequential</code>, meaning that Amazon ML
     * takes all of the data records between the <code>percentBegin</code> and <code>percentEnd</code> parameters for
     * the datasource, in the order that the records appear in the input data.
     * </p>
     * <p>
     * The following two <code>DataRearrangement</code> lines are examples of sequentially ordered training and
     * evaluation datasources:
     * </p>
     * <p>
     * Datasource for evaluation:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}}</code>
     * </p>
     * <p>
     * Datasource for training:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}}</code>
     * </p>
     * <p>
     * To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters,
     * set the <code>strategy</code> parameter to <code>random</code> and provide a string that is used as the seed
     * value for the random data splitting (for example, you can use the S3 path to your data as the random seed
     * string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number
     * between 0 and 100, and then selects the rows that have an assigned number between <code>percentBegin</code> and
     * <code>percentEnd</code>. Pseudo-random numbers are assigned using both the input seed string value and the byte
     * offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The
     * random splitting strategy ensures that variables in the training and evaluation data are distributed similarly.
     * It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in
     * training and evaluation datasources containing non-similar data records.
     * </p>
     * <p>
     * The following two <code>DataRearrangement</code> lines are examples of non-sequentially ordered training and
     * evaluation datasources:
     * </p>
     * <p>
     * Datasource for evaluation:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}}</code>
     * </p>
     * <p>
     * Datasource for training:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A JSON string that represents the splitting and rearrangement processing to be applied to a
     *         <code>DataSource</code>. If the <code>DataRearrangement</code> parameter is not provided, all of the
     *         input data is used to create the <code>Datasource</code>.</p>
     *         <p>
     *         There are multiple parameters that control what data is used to create a datasource:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b><code>percentBegin</code></b>
     *         </p>
     *         <p>
     *         Use <code>percentBegin</code> to indicate the beginning of the range of the data used to create the
     *         Datasource. If you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML
     *         includes all of the data when creating the datasource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b><code>percentEnd</code></b>
     *         </p>
     *         <p>
     *         Use <code>percentEnd</code> to indicate the end of the range of the data used to create the Datasource.
     *         If you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of
     *         the data when creating the datasource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b><code>complement</code></b>
     *         </p>
     *         <p>
     *         The <code>complement</code> parameter instructs Amazon ML to use the data that is not included in the
     *         range of <code>percentBegin</code> to <code>percentEnd</code> to create a datasource. The
     *         <code>complement</code> parameter is useful if you need to create complementary datasources for training
     *         and evaluation. To create a complementary datasource, use the same values for <code>percentBegin</code>
     *         and <code>percentEnd</code>, along with the <code>complement</code> parameter.
     *         </p>
     *         <p>
     *         For example, the following two datasources do not share any data, and can be used to train and evaluate a
     *         model. The first datasource has 25 percent of the data, and the second one has 75 percent of the data.
     *         </p>
     *         <p>
     *         Datasource for evaluation: <code>{"splitting":{"percentBegin":0, "percentEnd":25}}</code>
     *         </p>
     *         <p>
     *         Datasource for training:
     *         <code>{"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b><code>strategy</code></b>
     *         </p>
     *         <p>
     *         To change how Amazon ML splits the data for a datasource, use the <code>strategy</code> parameter.
     *         </p>
     *         <p>
     *         The default value for the <code>strategy</code> parameter is <code>sequential</code>, meaning that Amazon
     *         ML takes all of the data records between the <code>percentBegin</code> and <code>percentEnd</code>
     *         parameters for the datasource, in the order that the records appear in the input data.
     *         </p>
     *         <p>
     *         The following two <code>DataRearrangement</code> lines are examples of sequentially ordered training and
     *         evaluation datasources:
     *         </p>
     *         <p>
     *         Datasource for evaluation:
     *         <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}}</code>
     *         </p>
     *         <p>
     *         Datasource for training:
     *         <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}}</code>
     *         </p>
     *         <p>
     *         To randomly split the input data into the proportions indicated by the percentBegin and percentEnd
     *         parameters, set the <code>strategy</code> parameter to <code>random</code> and provide a string that is
     *         used as the seed value for the random data splitting (for example, you can use the S3 path to your data
     *         as the random seed string). If you choose the random split strategy, Amazon ML assigns each row of data a
     *         pseudo-random number between 0 and 100, and then selects the rows that have an assigned number between
     *         <code>percentBegin</code> and <code>percentEnd</code>. Pseudo-random numbers are assigned using both the
     *         input seed string value and the byte offset as a seed, so changing the data results in a different split.
     *         Any existing ordering is preserved. The random splitting strategy ensures that variables in the training
     *         and evaluation data are distributed similarly. It is useful in the cases where the input data may have an
     *         implicit sort order, which would otherwise result in training and evaluation datasources containing
     *         non-similar data records.
     *         </p>
     *         <p>
     *         The following two <code>DataRearrangement</code> lines are examples of non-sequentially ordered training
     *         and evaluation datasources:
     *         </p>
     *         <p>
     *         Datasource for evaluation:
     *         <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}}</code>
     *         </p>
     *         <p>
     *         Datasource for training:
     *         <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}</code>
     *         </p>
     *         </li>
     */

    public String getDataRearrangement() {
        return this.dataRearrangement;
    }

    /**
     * <p>
     * A JSON string that represents the splitting and rearrangement processing to be applied to a
     * <code>DataSource</code>. If the <code>DataRearrangement</code> parameter is not provided, all of the input data
     * is used to create the <code>Datasource</code>.
     * </p>
     * <p>
     * There are multiple parameters that control what data is used to create a datasource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b><code>percentBegin</code></b>
     * </p>
     * <p>
     * Use <code>percentBegin</code> to indicate the beginning of the range of the data used to create the Datasource.
     * If you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the data
     * when creating the datasource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>percentEnd</code></b>
     * </p>
     * <p>
     * Use <code>percentEnd</code> to indicate the end of the range of the data used to create the Datasource. If you do
     * not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the data when
     * creating the datasource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>complement</code></b>
     * </p>
     * <p>
     * The <code>complement</code> parameter instructs Amazon ML to use the data that is not included in the range of
     * <code>percentBegin</code> to <code>percentEnd</code> to create a datasource. The <code>complement</code>
     * parameter is useful if you need to create complementary datasources for training and evaluation. To create a
     * complementary datasource, use the same values for <code>percentBegin</code> and <code>percentEnd</code>, along
     * with the <code>complement</code> parameter.
     * </p>
     * <p>
     * For example, the following two datasources do not share any data, and can be used to train and evaluate a model.
     * The first datasource has 25 percent of the data, and the second one has 75 percent of the data.
     * </p>
     * <p>
     * Datasource for evaluation: <code>{"splitting":{"percentBegin":0, "percentEnd":25}}</code>
     * </p>
     * <p>
     * Datasource for training: <code>{"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b><code>strategy</code></b>
     * </p>
     * <p>
     * To change how Amazon ML splits the data for a datasource, use the <code>strategy</code> parameter.
     * </p>
     * <p>
     * The default value for the <code>strategy</code> parameter is <code>sequential</code>, meaning that Amazon ML
     * takes all of the data records between the <code>percentBegin</code> and <code>percentEnd</code> parameters for
     * the datasource, in the order that the records appear in the input data.
     * </p>
     * <p>
     * The following two <code>DataRearrangement</code> lines are examples of sequentially ordered training and
     * evaluation datasources:
     * </p>
     * <p>
     * Datasource for evaluation:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}}</code>
     * </p>
     * <p>
     * Datasource for training:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}}</code>
     * </p>
     * <p>
     * To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters,
     * set the <code>strategy</code> parameter to <code>random</code> and provide a string that is used as the seed
     * value for the random data splitting (for example, you can use the S3 path to your data as the random seed
     * string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number
     * between 0 and 100, and then selects the rows that have an assigned number between <code>percentBegin</code> and
     * <code>percentEnd</code>. Pseudo-random numbers are assigned using both the input seed string value and the byte
     * offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The
     * random splitting strategy ensures that variables in the training and evaluation data are distributed similarly.
     * It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in
     * training and evaluation datasources containing non-similar data records.
     * </p>
     * <p>
     * The following two <code>DataRearrangement</code> lines are examples of non-sequentially ordered training and
     * evaluation datasources:
     * </p>
     * <p>
     * Datasource for evaluation:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}}</code>
     * </p>
     * <p>
     * Datasource for training:
     * <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataRearrangement
     *        A JSON string that represents the splitting and rearrangement processing to be applied to a
     *        <code>DataSource</code>. If the <code>DataRearrangement</code> parameter is not provided, all of the input
     *        data is used to create the <code>Datasource</code>.</p>
     *        <p>
     *        There are multiple parameters that control what data is used to create a datasource:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b><code>percentBegin</code></b>
     *        </p>
     *        <p>
     *        Use <code>percentBegin</code> to indicate the beginning of the range of the data used to create the
     *        Datasource. If you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML
     *        includes all of the data when creating the datasource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b><code>percentEnd</code></b>
     *        </p>
     *        <p>
     *        Use <code>percentEnd</code> to indicate the end of the range of the data used to create the Datasource. If
     *        you do not include <code>percentBegin</code> and <code>percentEnd</code>, Amazon ML includes all of the
     *        data when creating the datasource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b><code>complement</code></b>
     *        </p>
     *        <p>
     *        The <code>complement</code> parameter instructs Amazon ML to use the data that is not included in the
     *        range of <code>percentBegin</code> to <code>percentEnd</code> to create a datasource. The
     *        <code>complement</code> parameter is useful if you need to create complementary datasources for training
     *        and evaluation. To create a complementary datasource, use the same values for <code>percentBegin</code>
     *        and <code>percentEnd</code>, along with the <code>complement</code> parameter.
     *        </p>
     *        <p>
     *        For example, the following two datasources do not share any data, and can be used to train and evaluate a
     *        model. The first datasource has 25 percent of the data, and the second one has 75 percent of the data.
     *        </p>
     *        <p>
     *        Datasource for evaluation: <code>{"splitting":{"percentBegin":0, "percentEnd":25}}</code>
     *        </p>
     *        <p>
     *        Datasource for training:
     *        <code>{"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b><code>strategy</code></b>
     *        </p>
     *        <p>
     *        To change how Amazon ML splits the data for a datasource, use the <code>strategy</code> parameter.
     *        </p>
     *        <p>
     *        The default value for the <code>strategy</code> parameter is <code>sequential</code>, meaning that Amazon
     *        ML takes all of the data records between the <code>percentBegin</code> and <code>percentEnd</code>
     *        parameters for the datasource, in the order that the records appear in the input data.
     *        </p>
     *        <p>
     *        The following two <code>DataRearrangement</code> lines are examples of sequentially ordered training and
     *        evaluation datasources:
     *        </p>
     *        <p>
     *        Datasource for evaluation:
     *        <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}}</code>
     *        </p>
     *        <p>
     *        Datasource for training:
     *        <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}}</code>
     *        </p>
     *        <p>
     *        To randomly split the input data into the proportions indicated by the percentBegin and percentEnd
     *        parameters, set the <code>strategy</code> parameter to <code>random</code> and provide a string that is
     *        used as the seed value for the random data splitting (for example, you can use the S3 path to your data as
     *        the random seed string). If you choose the random split strategy, Amazon ML assigns each row of data a
     *        pseudo-random number between 0 and 100, and then selects the rows that have an assigned number between
     *        <code>percentBegin</code> and <code>percentEnd</code>. Pseudo-random numbers are assigned using both the
     *        input seed string value and the byte offset as a seed, so changing the data results in a different split.
     *        Any existing ordering is preserved. The random splitting strategy ensures that variables in the training
     *        and evaluation data are distributed similarly. It is useful in the cases where the input data may have an
     *        implicit sort order, which would otherwise result in training and evaluation datasources containing
     *        non-similar data records.
     *        </p>
     *        <p>
     *        The following two <code>DataRearrangement</code> lines are examples of non-sequentially ordered training
     *        and evaluation datasources:
     *        </p>
     *        <p>
     *        Datasource for evaluation:
     *        <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}}</code>
     *        </p>
     *        <p>
     *        Datasource for training:
     *        <code>{"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withDataRearrangement(String dataRearrangement) {
        setDataRearrangement(dataRearrangement);
        return this;
    }

    /**
     * <p>
     * A JSON string that represents the schema for an Amazon RDS <code>DataSource</code>. The <code>DataSchema</code>
     * defines the structure of the observation data in the data file(s) referenced in the <code>DataSource</code>.
     * </p>
     * <p>
     * A <code>DataSchema</code> is not required if you specify a <code>DataSchemaUri</code>
     * </p>
     * <p>
     * Define your <code>DataSchema</code> as a series of key-value pairs. <code>attributes</code> and
     * <code>excludedVariableNames</code> have an array of key-value pairs for their value. Use the following format to
     * define your <code>DataSchema</code>.
     * </p>
     * <p>
     * { "version": "1.0",
     * </p>
     * <p>
     * "recordAnnotationFieldName": "F1",
     * </p>
     * <p>
     * "recordWeightFieldName": "F2",
     * </p>
     * <p>
     * "targetFieldName": "F3",
     * </p>
     * <p>
     * "dataFormat": "CSV",
     * </p>
     * <p>
     * "dataFileContainsHeader": true,
     * </p>
     * <p>
     * "attributes": [
     * </p>
     * <p>
     * { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3",
     * "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType":
     * "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType":
     * "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     * </p>
     * <p>
     * "excludedVariableNames": [ "F6" ] }
     * </p>
     * <?oxy_insert_end>
     * 
     * @param dataSchema
     *        A JSON string that represents the schema for an Amazon RDS <code>DataSource</code>. The
     *        <code>DataSchema</code> defines the structure of the observation data in the data file(s) referenced in
     *        the <code>DataSource</code>.</p>
     *        <p>
     *        A <code>DataSchema</code> is not required if you specify a <code>DataSchemaUri</code>
     *        </p>
     *        <p>
     *        Define your <code>DataSchema</code> as a series of key-value pairs. <code>attributes</code> and
     *        <code>excludedVariableNames</code> have an array of key-value pairs for their value. Use the following
     *        format to define your <code>DataSchema</code>.
     *        </p>
     *        <p>
     *        { "version": "1.0",
     *        </p>
     *        <p>
     *        "recordAnnotationFieldName": "F1",
     *        </p>
     *        <p>
     *        "recordWeightFieldName": "F2",
     *        </p>
     *        <p>
     *        "targetFieldName": "F3",
     *        </p>
     *        <p>
     *        "dataFormat": "CSV",
     *        </p>
     *        <p>
     *        "dataFileContainsHeader": true,
     *        </p>
     *        <p>
     *        "attributes": [
     *        </p>
     *        <p>
     *        { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName":
     *        "F3", "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5",
     *        "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7",
     *        "fieldType": "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     *        </p>
     *        <p>
     *        "excludedVariableNames": [ "F6" ] }
     *        </p>
     */

    public void setDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
    }

    /**
     * <p>
     * A JSON string that represents the schema for an Amazon RDS <code>DataSource</code>. The <code>DataSchema</code>
     * defines the structure of the observation data in the data file(s) referenced in the <code>DataSource</code>.
     * </p>
     * <p>
     * A <code>DataSchema</code> is not required if you specify a <code>DataSchemaUri</code>
     * </p>
     * <p>
     * Define your <code>DataSchema</code> as a series of key-value pairs. <code>attributes</code> and
     * <code>excludedVariableNames</code> have an array of key-value pairs for their value. Use the following format to
     * define your <code>DataSchema</code>.
     * </p>
     * <p>
     * { "version": "1.0",
     * </p>
     * <p>
     * "recordAnnotationFieldName": "F1",
     * </p>
     * <p>
     * "recordWeightFieldName": "F2",
     * </p>
     * <p>
     * "targetFieldName": "F3",
     * </p>
     * <p>
     * "dataFormat": "CSV",
     * </p>
     * <p>
     * "dataFileContainsHeader": true,
     * </p>
     * <p>
     * "attributes": [
     * </p>
     * <p>
     * { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3",
     * "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType":
     * "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType":
     * "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     * </p>
     * <p>
     * "excludedVariableNames": [ "F6" ] }
     * </p>
     * <?oxy_insert_end>
     * 
     * @return A JSON string that represents the schema for an Amazon RDS <code>DataSource</code>. The
     *         <code>DataSchema</code> defines the structure of the observation data in the data file(s) referenced in
     *         the <code>DataSource</code>.</p>
     *         <p>
     *         A <code>DataSchema</code> is not required if you specify a <code>DataSchemaUri</code>
     *         </p>
     *         <p>
     *         Define your <code>DataSchema</code> as a series of key-value pairs. <code>attributes</code> and
     *         <code>excludedVariableNames</code> have an array of key-value pairs for their value. Use the following
     *         format to define your <code>DataSchema</code>.
     *         </p>
     *         <p>
     *         { "version": "1.0",
     *         </p>
     *         <p>
     *         "recordAnnotationFieldName": "F1",
     *         </p>
     *         <p>
     *         "recordWeightFieldName": "F2",
     *         </p>
     *         <p>
     *         "targetFieldName": "F3",
     *         </p>
     *         <p>
     *         "dataFormat": "CSV",
     *         </p>
     *         <p>
     *         "dataFileContainsHeader": true,
     *         </p>
     *         <p>
     *         "attributes": [
     *         </p>
     *         <p>
     *         { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName":
     *         "F3", "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5",
     *         "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7",
     *         "fieldType": "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     *         </p>
     *         <p>
     *         "excludedVariableNames": [ "F6" ] }
     *         </p>
     */

    public String getDataSchema() {
        return this.dataSchema;
    }

    /**
     * <p>
     * A JSON string that represents the schema for an Amazon RDS <code>DataSource</code>. The <code>DataSchema</code>
     * defines the structure of the observation data in the data file(s) referenced in the <code>DataSource</code>.
     * </p>
     * <p>
     * A <code>DataSchema</code> is not required if you specify a <code>DataSchemaUri</code>
     * </p>
     * <p>
     * Define your <code>DataSchema</code> as a series of key-value pairs. <code>attributes</code> and
     * <code>excludedVariableNames</code> have an array of key-value pairs for their value. Use the following format to
     * define your <code>DataSchema</code>.
     * </p>
     * <p>
     * { "version": "1.0",
     * </p>
     * <p>
     * "recordAnnotationFieldName": "F1",
     * </p>
     * <p>
     * "recordWeightFieldName": "F2",
     * </p>
     * <p>
     * "targetFieldName": "F3",
     * </p>
     * <p>
     * "dataFormat": "CSV",
     * </p>
     * <p>
     * "dataFileContainsHeader": true,
     * </p>
     * <p>
     * "attributes": [
     * </p>
     * <p>
     * { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3",
     * "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType":
     * "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType":
     * "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     * </p>
     * <p>
     * "excludedVariableNames": [ "F6" ] }
     * </p>
     * <?oxy_insert_end>
     * 
     * @param dataSchema
     *        A JSON string that represents the schema for an Amazon RDS <code>DataSource</code>. The
     *        <code>DataSchema</code> defines the structure of the observation data in the data file(s) referenced in
     *        the <code>DataSource</code>.</p>
     *        <p>
     *        A <code>DataSchema</code> is not required if you specify a <code>DataSchemaUri</code>
     *        </p>
     *        <p>
     *        Define your <code>DataSchema</code> as a series of key-value pairs. <code>attributes</code> and
     *        <code>excludedVariableNames</code> have an array of key-value pairs for their value. Use the following
     *        format to define your <code>DataSchema</code>.
     *        </p>
     *        <p>
     *        { "version": "1.0",
     *        </p>
     *        <p>
     *        "recordAnnotationFieldName": "F1",
     *        </p>
     *        <p>
     *        "recordWeightFieldName": "F2",
     *        </p>
     *        <p>
     *        "targetFieldName": "F3",
     *        </p>
     *        <p>
     *        "dataFormat": "CSV",
     *        </p>
     *        <p>
     *        "dataFileContainsHeader": true,
     *        </p>
     *        <p>
     *        "attributes": [
     *        </p>
     *        <p>
     *        { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName":
     *        "F3", "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5",
     *        "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7",
     *        "fieldType": "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     *        </p>
     *        <p>
     *        "excludedVariableNames": [ "F6" ] }
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withDataSchema(String dataSchema) {
        setDataSchema(dataSchema);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * 
     * @param dataSchemaUri
     *        The Amazon S3 location of the <code>DataSchema</code>.
     */

    public void setDataSchemaUri(String dataSchemaUri) {
        this.dataSchemaUri = dataSchemaUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * 
     * @return The Amazon S3 location of the <code>DataSchema</code>.
     */

    public String getDataSchemaUri() {
        return this.dataSchemaUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * 
     * @param dataSchemaUri
     *        The Amazon S3 location of the <code>DataSchema</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withDataSchemaUri(String dataSchemaUri) {
        setDataSchemaUri(dataSchemaUri);
        return this;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon Elastic Compute Cloud (Amazon EC2) instance to
     * carry out the copy operation from Amazon RDS to an Amazon S3 task. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @param resourceRole
     *        The role (DataPipelineDefaultResourceRole) assumed by an Amazon Elastic Compute Cloud (Amazon EC2)
     *        instance to carry out the copy operation from Amazon RDS to an Amazon S3 task. For more information, see
     *        <a href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *        templates</a> for data pipelines.
     */

    public void setResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon Elastic Compute Cloud (Amazon EC2) instance to
     * carry out the copy operation from Amazon RDS to an Amazon S3 task. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @return The role (DataPipelineDefaultResourceRole) assumed by an Amazon Elastic Compute Cloud (Amazon EC2)
     *         instance to carry out the copy operation from Amazon RDS to an Amazon S3 task. For more information, see
     *         <a href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *         templates</a> for data pipelines.
     */

    public String getResourceRole() {
        return this.resourceRole;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultResourceRole) assumed by an Amazon Elastic Compute Cloud (Amazon EC2) instance to
     * carry out the copy operation from Amazon RDS to an Amazon S3 task. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @param resourceRole
     *        The role (DataPipelineDefaultResourceRole) assumed by an Amazon Elastic Compute Cloud (Amazon EC2)
     *        instance to carry out the copy operation from Amazon RDS to an Amazon S3 task. For more information, see
     *        <a href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role
     *        templates</a> for data pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withResourceRole(String resourceRole) {
        setResourceRole(resourceRole);
        return this;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline service to monitor the progress of the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @param serviceRole
     *        The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline service to monitor the progress of the
     *        copy task from Amazon RDS to Amazon S3. For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline service to monitor the progress of the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @return The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline service to monitor the progress of the
     *         copy task from Amazon RDS to Amazon S3. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *         for data pipelines.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline service to monitor the progress of the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a> for
     * data pipelines.
     * </p>
     * 
     * @param serviceRole
     *        The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline service to monitor the progress of the
     *        copy task from Amazon RDS to Amazon S3. For more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html">Role templates</a>
     *        for data pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The subnet ID to be used to access a VPC-based RDS DB instance. This attribute is used by Data Pipeline to carry
     * out the copy task from Amazon RDS to Amazon S3.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID to be used to access a VPC-based RDS DB instance. This attribute is used by Data Pipeline to
     *        carry out the copy task from Amazon RDS to Amazon S3.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID to be used to access a VPC-based RDS DB instance. This attribute is used by Data Pipeline to carry
     * out the copy task from Amazon RDS to Amazon S3.
     * </p>
     * 
     * @return The subnet ID to be used to access a VPC-based RDS DB instance. This attribute is used by Data Pipeline
     *         to carry out the copy task from Amazon RDS to Amazon S3.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID to be used to access a VPC-based RDS DB instance. This attribute is used by Data Pipeline to carry
     * out the copy task from Amazon RDS to Amazon S3.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID to be used to access a VPC-based RDS DB instance. This attribute is used by Data Pipeline to
     *        carry out the copy task from Amazon RDS to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate
     * ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to carry out
     * the copy operation from Amazon RDS to an Amazon S3 task.
     * </p>
     * 
     * @return The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are
     *         appropriate ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data
     *         Pipeline to carry out the copy operation from Amazon RDS to an Amazon S3 task.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate
     * ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to carry out
     * the copy operation from Amazon RDS to an Amazon S3 task.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate
     *        ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to
     *        carry out the copy operation from Amazon RDS to an Amazon S3 task.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate
     * ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to carry out
     * the copy operation from Amazon RDS to an Amazon S3 task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate
     *        ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to
     *        carry out the copy operation from Amazon RDS to an Amazon S3 task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate
     * ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to carry out
     * the copy operation from Amazon RDS to an Amazon S3 task.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate
     *        ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to
     *        carry out the copy operation from Amazon RDS to an Amazon S3 task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDataSpec withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
        if (getDatabaseInformation() != null)
            sb.append("DatabaseInformation: ").append(getDatabaseInformation()).append(",");
        if (getSelectSqlQuery() != null)
            sb.append("SelectSqlQuery: ").append(getSelectSqlQuery()).append(",");
        if (getDatabaseCredentials() != null)
            sb.append("DatabaseCredentials: ").append(getDatabaseCredentials()).append(",");
        if (getS3StagingLocation() != null)
            sb.append("S3StagingLocation: ").append(getS3StagingLocation()).append(",");
        if (getDataRearrangement() != null)
            sb.append("DataRearrangement: ").append(getDataRearrangement()).append(",");
        if (getDataSchema() != null)
            sb.append("DataSchema: ").append(getDataSchema()).append(",");
        if (getDataSchemaUri() != null)
            sb.append("DataSchemaUri: ").append(getDataSchemaUri()).append(",");
        if (getResourceRole() != null)
            sb.append("ResourceRole: ").append(getResourceRole()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDSDataSpec == false)
            return false;
        RDSDataSpec other = (RDSDataSpec) obj;
        if (other.getDatabaseInformation() == null ^ this.getDatabaseInformation() == null)
            return false;
        if (other.getDatabaseInformation() != null && other.getDatabaseInformation().equals(this.getDatabaseInformation()) == false)
            return false;
        if (other.getSelectSqlQuery() == null ^ this.getSelectSqlQuery() == null)
            return false;
        if (other.getSelectSqlQuery() != null && other.getSelectSqlQuery().equals(this.getSelectSqlQuery()) == false)
            return false;
        if (other.getDatabaseCredentials() == null ^ this.getDatabaseCredentials() == null)
            return false;
        if (other.getDatabaseCredentials() != null && other.getDatabaseCredentials().equals(this.getDatabaseCredentials()) == false)
            return false;
        if (other.getS3StagingLocation() == null ^ this.getS3StagingLocation() == null)
            return false;
        if (other.getS3StagingLocation() != null && other.getS3StagingLocation().equals(this.getS3StagingLocation()) == false)
            return false;
        if (other.getDataRearrangement() == null ^ this.getDataRearrangement() == null)
            return false;
        if (other.getDataRearrangement() != null && other.getDataRearrangement().equals(this.getDataRearrangement()) == false)
            return false;
        if (other.getDataSchema() == null ^ this.getDataSchema() == null)
            return false;
        if (other.getDataSchema() != null && other.getDataSchema().equals(this.getDataSchema()) == false)
            return false;
        if (other.getDataSchemaUri() == null ^ this.getDataSchemaUri() == null)
            return false;
        if (other.getDataSchemaUri() != null && other.getDataSchemaUri().equals(this.getDataSchemaUri()) == false)
            return false;
        if (other.getResourceRole() == null ^ this.getResourceRole() == null)
            return false;
        if (other.getResourceRole() != null && other.getResourceRole().equals(this.getResourceRole()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseInformation() == null) ? 0 : getDatabaseInformation().hashCode());
        hashCode = prime * hashCode + ((getSelectSqlQuery() == null) ? 0 : getSelectSqlQuery().hashCode());
        hashCode = prime * hashCode + ((getDatabaseCredentials() == null) ? 0 : getDatabaseCredentials().hashCode());
        hashCode = prime * hashCode + ((getS3StagingLocation() == null) ? 0 : getS3StagingLocation().hashCode());
        hashCode = prime * hashCode + ((getDataRearrangement() == null) ? 0 : getDataRearrangement().hashCode());
        hashCode = prime * hashCode + ((getDataSchema() == null) ? 0 : getDataSchema().hashCode());
        hashCode = prime * hashCode + ((getDataSchemaUri() == null) ? 0 : getDataSchemaUri().hashCode());
        hashCode = prime * hashCode + ((getResourceRole() == null) ? 0 : getResourceRole().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public RDSDataSpec clone() {
        try {
            return (RDSDataSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.RDSDataSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
