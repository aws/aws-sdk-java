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
 * Describes the data specification of a <code>DataSource</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the data file(s) used by a <code>DataSource</code>. The URI specifies a data file or an Amazon
     * Simple Storage Service (Amazon S3) directory or bucket containing data files.
     * </p>
     */
    private String dataLocationS3;
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
     * A JSON string that represents the schema for an Amazon S3 <code>DataSource</code>. The <code>DataSchema</code>
     * defines the structure of the observation data in the data file(s) referenced in the <code>DataSource</code>.
     * </p>
     * <p>
     * You must provide either the <code>DataSchema</code> or the <code>DataSchemaLocationS3</code>.
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
     * Describes the schema location in Amazon S3. You must provide either the <code>DataSchema</code> or the
     * <code>DataSchemaLocationS3</code>.
     * </p>
     */
    private String dataSchemaLocationS3;

    /**
     * <p>
     * The location of the data file(s) used by a <code>DataSource</code>. The URI specifies a data file or an Amazon
     * Simple Storage Service (Amazon S3) directory or bucket containing data files.
     * </p>
     * 
     * @param dataLocationS3
     *        The location of the data file(s) used by a <code>DataSource</code>. The URI specifies a data file or an
     *        Amazon Simple Storage Service (Amazon S3) directory or bucket containing data files.
     */

    public void setDataLocationS3(String dataLocationS3) {
        this.dataLocationS3 = dataLocationS3;
    }

    /**
     * <p>
     * The location of the data file(s) used by a <code>DataSource</code>. The URI specifies a data file or an Amazon
     * Simple Storage Service (Amazon S3) directory or bucket containing data files.
     * </p>
     * 
     * @return The location of the data file(s) used by a <code>DataSource</code>. The URI specifies a data file or an
     *         Amazon Simple Storage Service (Amazon S3) directory or bucket containing data files.
     */

    public String getDataLocationS3() {
        return this.dataLocationS3;
    }

    /**
     * <p>
     * The location of the data file(s) used by a <code>DataSource</code>. The URI specifies a data file or an Amazon
     * Simple Storage Service (Amazon S3) directory or bucket containing data files.
     * </p>
     * 
     * @param dataLocationS3
     *        The location of the data file(s) used by a <code>DataSource</code>. The URI specifies a data file or an
     *        Amazon Simple Storage Service (Amazon S3) directory or bucket containing data files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSpec withDataLocationS3(String dataLocationS3) {
        setDataLocationS3(dataLocationS3);
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

    public S3DataSpec withDataRearrangement(String dataRearrangement) {
        setDataRearrangement(dataRearrangement);
        return this;
    }

    /**
     * <p>
     * A JSON string that represents the schema for an Amazon S3 <code>DataSource</code>. The <code>DataSchema</code>
     * defines the structure of the observation data in the data file(s) referenced in the <code>DataSource</code>.
     * </p>
     * <p>
     * You must provide either the <code>DataSchema</code> or the <code>DataSchemaLocationS3</code>.
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
     *        A JSON string that represents the schema for an Amazon S3 <code>DataSource</code>. The
     *        <code>DataSchema</code> defines the structure of the observation data in the data file(s) referenced in
     *        the <code>DataSource</code>.</p>
     *        <p>
     *        You must provide either the <code>DataSchema</code> or the <code>DataSchemaLocationS3</code>.
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
     * A JSON string that represents the schema for an Amazon S3 <code>DataSource</code>. The <code>DataSchema</code>
     * defines the structure of the observation data in the data file(s) referenced in the <code>DataSource</code>.
     * </p>
     * <p>
     * You must provide either the <code>DataSchema</code> or the <code>DataSchemaLocationS3</code>.
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
     * @return A JSON string that represents the schema for an Amazon S3 <code>DataSource</code>. The
     *         <code>DataSchema</code> defines the structure of the observation data in the data file(s) referenced in
     *         the <code>DataSource</code>.</p>
     *         <p>
     *         You must provide either the <code>DataSchema</code> or the <code>DataSchemaLocationS3</code>.
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
     * A JSON string that represents the schema for an Amazon S3 <code>DataSource</code>. The <code>DataSchema</code>
     * defines the structure of the observation data in the data file(s) referenced in the <code>DataSource</code>.
     * </p>
     * <p>
     * You must provide either the <code>DataSchema</code> or the <code>DataSchemaLocationS3</code>.
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
     *        A JSON string that represents the schema for an Amazon S3 <code>DataSource</code>. The
     *        <code>DataSchema</code> defines the structure of the observation data in the data file(s) referenced in
     *        the <code>DataSource</code>.</p>
     *        <p>
     *        You must provide either the <code>DataSchema</code> or the <code>DataSchemaLocationS3</code>.
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

    public S3DataSpec withDataSchema(String dataSchema) {
        setDataSchema(dataSchema);
        return this;
    }

    /**
     * <p>
     * Describes the schema location in Amazon S3. You must provide either the <code>DataSchema</code> or the
     * <code>DataSchemaLocationS3</code>.
     * </p>
     * 
     * @param dataSchemaLocationS3
     *        Describes the schema location in Amazon S3. You must provide either the <code>DataSchema</code> or the
     *        <code>DataSchemaLocationS3</code>.
     */

    public void setDataSchemaLocationS3(String dataSchemaLocationS3) {
        this.dataSchemaLocationS3 = dataSchemaLocationS3;
    }

    /**
     * <p>
     * Describes the schema location in Amazon S3. You must provide either the <code>DataSchema</code> or the
     * <code>DataSchemaLocationS3</code>.
     * </p>
     * 
     * @return Describes the schema location in Amazon S3. You must provide either the <code>DataSchema</code> or the
     *         <code>DataSchemaLocationS3</code>.
     */

    public String getDataSchemaLocationS3() {
        return this.dataSchemaLocationS3;
    }

    /**
     * <p>
     * Describes the schema location in Amazon S3. You must provide either the <code>DataSchema</code> or the
     * <code>DataSchemaLocationS3</code>.
     * </p>
     * 
     * @param dataSchemaLocationS3
     *        Describes the schema location in Amazon S3. You must provide either the <code>DataSchema</code> or the
     *        <code>DataSchemaLocationS3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSpec withDataSchemaLocationS3(String dataSchemaLocationS3) {
        setDataSchemaLocationS3(dataSchemaLocationS3);
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
        if (getDataLocationS3() != null)
            sb.append("DataLocationS3: ").append(getDataLocationS3()).append(",");
        if (getDataRearrangement() != null)
            sb.append("DataRearrangement: ").append(getDataRearrangement()).append(",");
        if (getDataSchema() != null)
            sb.append("DataSchema: ").append(getDataSchema()).append(",");
        if (getDataSchemaLocationS3() != null)
            sb.append("DataSchemaLocationS3: ").append(getDataSchemaLocationS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataSpec == false)
            return false;
        S3DataSpec other = (S3DataSpec) obj;
        if (other.getDataLocationS3() == null ^ this.getDataLocationS3() == null)
            return false;
        if (other.getDataLocationS3() != null && other.getDataLocationS3().equals(this.getDataLocationS3()) == false)
            return false;
        if (other.getDataRearrangement() == null ^ this.getDataRearrangement() == null)
            return false;
        if (other.getDataRearrangement() != null && other.getDataRearrangement().equals(this.getDataRearrangement()) == false)
            return false;
        if (other.getDataSchema() == null ^ this.getDataSchema() == null)
            return false;
        if (other.getDataSchema() != null && other.getDataSchema().equals(this.getDataSchema()) == false)
            return false;
        if (other.getDataSchemaLocationS3() == null ^ this.getDataSchemaLocationS3() == null)
            return false;
        if (other.getDataSchemaLocationS3() != null && other.getDataSchemaLocationS3().equals(this.getDataSchemaLocationS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLocationS3() == null) ? 0 : getDataLocationS3().hashCode());
        hashCode = prime * hashCode + ((getDataRearrangement() == null) ? 0 : getDataRearrangement().hashCode());
        hashCode = prime * hashCode + ((getDataSchema() == null) ? 0 : getDataSchema().hashCode());
        hashCode = prime * hashCode + ((getDataSchemaLocationS3() == null) ? 0 : getDataSchemaLocationS3().hashCode());
        return hashCode;
    }

    @Override
    public S3DataSpec clone() {
        try {
            return (S3DataSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.S3DataSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
