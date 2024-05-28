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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stores the configuration information for how a candidate is generated (optional).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLCandidateGenerationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLCandidateGenerationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <note>
     * <p>
     * These column keys may not include the target column.
     * </p>
     * </note>
     * <p>
     * In ensembling mode, Autopilot only supports the following data types: <code>numeric</code>,
     * <code>categorical</code>, <code>text</code>, and <code>datetime</code>. In HPO mode, Autopilot can support
     * <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code>, and
     * <code>sequence</code>.
     * </p>
     * <p>
     * If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>,..)
     * should be a subset of the column names in the input data.
     * </p>
     * <p>
     * If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column keys
     * should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * are case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     */
    private String featureSpecificationS3Uri;
    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train the model candidates.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html">
     * <code>AutoMLJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>AutoMLCandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>AutoMLCandidateGenerationConfig</code> uses the full
     * set of algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     */
    private java.util.List<AutoMLAlgorithmConfig> algorithmsConfig;

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <note>
     * <p>
     * These column keys may not include the target column.
     * </p>
     * </note>
     * <p>
     * In ensembling mode, Autopilot only supports the following data types: <code>numeric</code>,
     * <code>categorical</code>, <code>text</code>, and <code>datetime</code>. In HPO mode, Autopilot can support
     * <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code>, and
     * <code>sequence</code>.
     * </p>
     * <p>
     * If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>,..)
     * should be a subset of the column names in the input data.
     * </p>
     * <p>
     * If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column keys
     * should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * are case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     * 
     * @param featureSpecificationS3Uri
     *        A URL to the Amazon S3 data source containing selected features from the input data source to run an
     *        Autopilot job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *        </p>
     *        <p>
     *        You can also specify the data type of the feature (optional) in the format shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     *        </p>
     *        <note>
     *        <p>
     *        These column keys may not include the target column.
     *        </p>
     *        </note>
     *        <p>
     *        In ensembling mode, Autopilot only supports the following data types: <code>numeric</code>,
     *        <code>categorical</code>, <code>text</code>, and <code>datetime</code>. In HPO mode, Autopilot can support
     *        <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code>, and
     *        <code>sequence</code>.
     *        </p>
     *        <p>
     *        If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>
     *        ,..) should be a subset of the column names in the input data.
     *        </p>
     *        <p>
     *        If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column
     *        keys should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     *        </p>
     *        <p>
     *        The key name <code>FeatureAttributeNames</code> is fixed. The values listed in
     *        <code>["col1", "col2", ...]</code> are case sensitive and should be a list of strings containing unique
     *        values that are a subset of the column names in the input data. The list of columns provided must not
     *        include the target column.
     */

    public void setFeatureSpecificationS3Uri(String featureSpecificationS3Uri) {
        this.featureSpecificationS3Uri = featureSpecificationS3Uri;
    }

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <note>
     * <p>
     * These column keys may not include the target column.
     * </p>
     * </note>
     * <p>
     * In ensembling mode, Autopilot only supports the following data types: <code>numeric</code>,
     * <code>categorical</code>, <code>text</code>, and <code>datetime</code>. In HPO mode, Autopilot can support
     * <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code>, and
     * <code>sequence</code>.
     * </p>
     * <p>
     * If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>,..)
     * should be a subset of the column names in the input data.
     * </p>
     * <p>
     * If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column keys
     * should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * are case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     * 
     * @return A URL to the Amazon S3 data source containing selected features from the input data source to run an
     *         Autopilot job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     *         </p>
     *         <p>
     *         <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *         </p>
     *         <p>
     *         You can also specify the data type of the feature (optional) in the format shown below:
     *         </p>
     *         <p>
     *         <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     *         </p>
     *         <note>
     *         <p>
     *         These column keys may not include the target column.
     *         </p>
     *         </note>
     *         <p>
     *         In ensembling mode, Autopilot only supports the following data types: <code>numeric</code>,
     *         <code>categorical</code>, <code>text</code>, and <code>datetime</code>. In HPO mode, Autopilot can
     *         support <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code>, and
     *         <code>sequence</code>.
     *         </p>
     *         <p>
     *         If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>
     *         ,..) should be a subset of the column names in the input data.
     *         </p>
     *         <p>
     *         If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the
     *         column keys should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     *         </p>
     *         <p>
     *         The key name <code>FeatureAttributeNames</code> is fixed. The values listed in
     *         <code>["col1", "col2", ...]</code> are case sensitive and should be a list of strings containing unique
     *         values that are a subset of the column names in the input data. The list of columns provided must not
     *         include the target column.
     */

    public String getFeatureSpecificationS3Uri() {
        return this.featureSpecificationS3Uri;
    }

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * You can also specify the data type of the feature (optional) in the format shown below:
     * </p>
     * <p>
     * <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     * </p>
     * <note>
     * <p>
     * These column keys may not include the target column.
     * </p>
     * </note>
     * <p>
     * In ensembling mode, Autopilot only supports the following data types: <code>numeric</code>,
     * <code>categorical</code>, <code>text</code>, and <code>datetime</code>. In HPO mode, Autopilot can support
     * <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code>, and
     * <code>sequence</code>.
     * </p>
     * <p>
     * If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>,..)
     * should be a subset of the column names in the input data.
     * </p>
     * <p>
     * If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column keys
     * should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * are case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     * 
     * @param featureSpecificationS3Uri
     *        A URL to the Amazon S3 data source containing selected features from the input data source to run an
     *        Autopilot job. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *        </p>
     *        <p>
     *        You can also specify the data type of the feature (optional) in the format shown below:
     *        </p>
     *        <p>
     *        <code>{ "FeatureDataTypes":{"col1":"numeric", "col2":"categorical" ... } }</code>
     *        </p>
     *        <note>
     *        <p>
     *        These column keys may not include the target column.
     *        </p>
     *        </note>
     *        <p>
     *        In ensembling mode, Autopilot only supports the following data types: <code>numeric</code>,
     *        <code>categorical</code>, <code>text</code>, and <code>datetime</code>. In HPO mode, Autopilot can support
     *        <code>numeric</code>, <code>categorical</code>, <code>text</code>, <code>datetime</code>, and
     *        <code>sequence</code>.
     *        </p>
     *        <p>
     *        If only <code>FeatureDataTypes</code> is provided, the column keys (<code>col1</code>, <code>col2</code>
     *        ,..) should be a subset of the column names in the input data.
     *        </p>
     *        <p>
     *        If both <code>FeatureDataTypes</code> and <code>FeatureAttributeNames</code> are provided, then the column
     *        keys should be a subset of the column names provided in <code>FeatureAttributeNames</code>.
     *        </p>
     *        <p>
     *        The key name <code>FeatureAttributeNames</code> is fixed. The values listed in
     *        <code>["col1", "col2", ...]</code> are case sensitive and should be a list of strings containing unique
     *        values that are a subset of the column names in the input data. The list of columns provided must not
     *        include the target column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidateGenerationConfig withFeatureSpecificationS3Uri(String featureSpecificationS3Uri) {
        setFeatureSpecificationS3Uri(featureSpecificationS3Uri);
        return this;
    }

    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train the model candidates.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html">
     * <code>AutoMLJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>AutoMLCandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>AutoMLCandidateGenerationConfig</code> uses the full
     * set of algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     * 
     * @return Stores the configuration information for the selection of algorithms used to train the model
     *         candidates.</p>
     *         <p>
     *         The list of available algorithms to choose from depends on the training mode set in <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html">
     *         <code>AutoMLJobConfig.Mode</code> </a>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set
     *         and one only.
     *         </p>
     *         <p>
     *         If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     *         <code>AutoMLCandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>AlgorithmsConfig</code> is not provided, <code>AutoMLCandidateGenerationConfig</code> uses the
     *         full set of algorithms for the given training mode.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For the list of all algorithms per training mode, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     *         AutoMLAlgorithmConfig</a>.
     *         </p>
     *         <p>
     *         For more information on each algorithm, see the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *         >Algorithm support</a> section in Autopilot developer guide.
     */

    public java.util.List<AutoMLAlgorithmConfig> getAlgorithmsConfig() {
        return algorithmsConfig;
    }

    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train the model candidates.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html">
     * <code>AutoMLJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>AutoMLCandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>AutoMLCandidateGenerationConfig</code> uses the full
     * set of algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     * 
     * @param algorithmsConfig
     *        Stores the configuration information for the selection of algorithms used to train the model
     *        candidates.</p>
     *        <p>
     *        The list of available algorithms to choose from depends on the training mode set in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html">
     *        <code>AutoMLJobConfig.Mode</code> </a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set
     *        and one only.
     *        </p>
     *        <p>
     *        If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     *        <code>AutoMLCandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is not provided, <code>AutoMLCandidateGenerationConfig</code> uses the
     *        full set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the list of all algorithms per training mode, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     *        AutoMLAlgorithmConfig</a>.
     *        </p>
     *        <p>
     *        For more information on each algorithm, see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Algorithm support</a> section in Autopilot developer guide.
     */

    public void setAlgorithmsConfig(java.util.Collection<AutoMLAlgorithmConfig> algorithmsConfig) {
        if (algorithmsConfig == null) {
            this.algorithmsConfig = null;
            return;
        }

        this.algorithmsConfig = new java.util.ArrayList<AutoMLAlgorithmConfig>(algorithmsConfig);
    }

    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train the model candidates.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html">
     * <code>AutoMLJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>AutoMLCandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>AutoMLCandidateGenerationConfig</code> uses the full
     * set of algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlgorithmsConfig(java.util.Collection)} or {@link #withAlgorithmsConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param algorithmsConfig
     *        Stores the configuration information for the selection of algorithms used to train the model
     *        candidates.</p>
     *        <p>
     *        The list of available algorithms to choose from depends on the training mode set in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html">
     *        <code>AutoMLJobConfig.Mode</code> </a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set
     *        and one only.
     *        </p>
     *        <p>
     *        If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     *        <code>AutoMLCandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is not provided, <code>AutoMLCandidateGenerationConfig</code> uses the
     *        full set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the list of all algorithms per training mode, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     *        AutoMLAlgorithmConfig</a>.
     *        </p>
     *        <p>
     *        For more information on each algorithm, see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Algorithm support</a> section in Autopilot developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidateGenerationConfig withAlgorithmsConfig(AutoMLAlgorithmConfig... algorithmsConfig) {
        if (this.algorithmsConfig == null) {
            setAlgorithmsConfig(new java.util.ArrayList<AutoMLAlgorithmConfig>(algorithmsConfig.length));
        }
        for (AutoMLAlgorithmConfig ele : algorithmsConfig) {
            this.algorithmsConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train the model candidates.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html">
     * <code>AutoMLJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>AutoMLCandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>AutoMLCandidateGenerationConfig</code> uses the full
     * set of algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     * 
     * @param algorithmsConfig
     *        Stores the configuration information for the selection of algorithms used to train the model
     *        candidates.</p>
     *        <p>
     *        The list of available algorithms to choose from depends on the training mode set in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html">
     *        <code>AutoMLJobConfig.Mode</code> </a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set
     *        and one only.
     *        </p>
     *        <p>
     *        If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     *        <code>AutoMLCandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is not provided, <code>AutoMLCandidateGenerationConfig</code> uses the
     *        full set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the list of all algorithms per training mode, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     *        AutoMLAlgorithmConfig</a>.
     *        </p>
     *        <p>
     *        For more information on each algorithm, see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Algorithm support</a> section in Autopilot developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidateGenerationConfig withAlgorithmsConfig(java.util.Collection<AutoMLAlgorithmConfig> algorithmsConfig) {
        setAlgorithmsConfig(algorithmsConfig);
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
        if (getFeatureSpecificationS3Uri() != null)
            sb.append("FeatureSpecificationS3Uri: ").append(getFeatureSpecificationS3Uri()).append(",");
        if (getAlgorithmsConfig() != null)
            sb.append("AlgorithmsConfig: ").append(getAlgorithmsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLCandidateGenerationConfig == false)
            return false;
        AutoMLCandidateGenerationConfig other = (AutoMLCandidateGenerationConfig) obj;
        if (other.getFeatureSpecificationS3Uri() == null ^ this.getFeatureSpecificationS3Uri() == null)
            return false;
        if (other.getFeatureSpecificationS3Uri() != null && other.getFeatureSpecificationS3Uri().equals(this.getFeatureSpecificationS3Uri()) == false)
            return false;
        if (other.getAlgorithmsConfig() == null ^ this.getAlgorithmsConfig() == null)
            return false;
        if (other.getAlgorithmsConfig() != null && other.getAlgorithmsConfig().equals(this.getAlgorithmsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureSpecificationS3Uri() == null) ? 0 : getFeatureSpecificationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmsConfig() == null) ? 0 : getAlgorithmsConfig().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLCandidateGenerationConfig clone() {
        try {
            return (AutoMLCandidateGenerationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLCandidateGenerationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
