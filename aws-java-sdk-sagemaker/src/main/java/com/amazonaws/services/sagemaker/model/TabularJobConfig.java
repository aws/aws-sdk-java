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
 * The collection of settings used by an AutoML job V2 for the tabular problem type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TabularJobConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TabularJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration information of how model candidates are generated.
     * </p>
     */
    private CandidateGenerationConfig candidateGenerationConfig;

    private AutoMLJobCompletionCriteria completionCriteria;
    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job V2. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
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
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO finds the best
     * hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * Generates possible candidates without training the models. A model candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
     * </p>
     */
    private Boolean generateCandidateDefinitionsOnly;
    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     * <note>
     * <p>
     * You must either specify the type of supervised learning problem in <code>ProblemType</code> and provide the <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html#sagemaker-CreateAutoMLJobV2-request-AutoMLJobObjective"
     * >AutoMLJobObjective</a> metric, or none at all.
     * </p>
     * </note>
     */
    private String problemType;
    /**
     * <p>
     * The name of the target variable in supervised learning, usually represented by 'y'.
     * </p>
     */
    private String targetAttributeName;
    /**
     * <p>
     * If specified, this column name indicates which column of the dataset should be treated as sample weights for use
     * by the objective metric during the training, evaluation, and the selection of the best model. This column is not
     * considered as a predictive feature. For more information on Autopilot metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html">Metrics and
     * validation</a>.
     * </p>
     * <p>
     * Sample weights should be numeric, non-negative, with larger values indicating which rows are more important than
     * others. Data points that have invalid or no weight value are excluded.
     * </p>
     * <p>
     * Support for sample weights is available in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">Ensembling</a>
     * mode only.
     * </p>
     */
    private String sampleWeightAttributeName;

    /**
     * <p>
     * The configuration information of how model candidates are generated.
     * </p>
     * 
     * @param candidateGenerationConfig
     *        The configuration information of how model candidates are generated.
     */

    public void setCandidateGenerationConfig(CandidateGenerationConfig candidateGenerationConfig) {
        this.candidateGenerationConfig = candidateGenerationConfig;
    }

    /**
     * <p>
     * The configuration information of how model candidates are generated.
     * </p>
     * 
     * @return The configuration information of how model candidates are generated.
     */

    public CandidateGenerationConfig getCandidateGenerationConfig() {
        return this.candidateGenerationConfig;
    }

    /**
     * <p>
     * The configuration information of how model candidates are generated.
     * </p>
     * 
     * @param candidateGenerationConfig
     *        The configuration information of how model candidates are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TabularJobConfig withCandidateGenerationConfig(CandidateGenerationConfig candidateGenerationConfig) {
        setCandidateGenerationConfig(candidateGenerationConfig);
        return this;
    }

    /**
     * @param completionCriteria
     */

    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * @return
     */

    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return this.completionCriteria;
    }

    /**
     * @param completionCriteria
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TabularJobConfig withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        setCompletionCriteria(completionCriteria);
        return this;
    }

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job V2. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
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
     *        Autopilot job V2. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown
     *        below: </p>
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
     * job V2. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
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
     *         Autopilot job V2. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown
     *         below: </p>
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
     * job V2. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown below:
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
     *        Autopilot job V2. You can input <code>FeatureAttributeNames</code> (optional) in JSON format as shown
     *        below: </p>
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

    public TabularJobConfig withFeatureSpecificationS3Uri(String featureSpecificationS3Uri) {
        setFeatureSpecificationS3Uri(featureSpecificationS3Uri);
        return this;
    }

    /**
     * <p>
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO finds the best
     * hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     * 
     * @param mode
     *        The method that Autopilot uses to train the data. You can either specify the mode manually or let
     *        Autopilot choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code>
     *        mode, Autopilot chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and
     *        <code>HYPERPARAMETER_TUNING</code> for larger ones.</p>
     *        <p>
     *        The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and
     *        regression tasks directly from your dataset. This machine learning mode combines several base models to
     *        produce an optimal predictive model. It then uses a stacking ensemble method to combine predictions from
     *        contributing members. A multi-stack ensemble model can provide better performance over a single model by
     *        combining the predictive capabilities of multiple models. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     *        </p>
     *        <p>
     *        The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version
     *        of a model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO
     *        finds the best hyperparameters according to your objective metric. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code>
     *        mode.
     * @see AutoMLMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO finds the best
     * hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     * 
     * @return The method that Autopilot uses to train the data. You can either specify the mode manually or let
     *         Autopilot choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code>
     *         mode, Autopilot chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and
     *         <code>HYPERPARAMETER_TUNING</code> for larger ones.</p>
     *         <p>
     *         The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and
     *         regression tasks directly from your dataset. This machine learning mode combines several base models to
     *         produce an optimal predictive model. It then uses a stacking ensemble method to combine predictions from
     *         contributing members. A multi-stack ensemble model can provide better performance over a single model by
     *         combining the predictive capabilities of multiple models. See <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *         >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     *         </p>
     *         <p>
     *         The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version
     *         of a model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO
     *         finds the best hyperparameters according to your objective metric. See <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *         >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code>
     *         mode.
     * @see AutoMLMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO finds the best
     * hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     * 
     * @param mode
     *        The method that Autopilot uses to train the data. You can either specify the mode manually or let
     *        Autopilot choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code>
     *        mode, Autopilot chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and
     *        <code>HYPERPARAMETER_TUNING</code> for larger ones.</p>
     *        <p>
     *        The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and
     *        regression tasks directly from your dataset. This machine learning mode combines several base models to
     *        produce an optimal predictive model. It then uses a stacking ensemble method to combine predictions from
     *        contributing members. A multi-stack ensemble model can provide better performance over a single model by
     *        combining the predictive capabilities of multiple models. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     *        </p>
     *        <p>
     *        The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version
     *        of a model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO
     *        finds the best hyperparameters according to your objective metric. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code>
     *        mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMode
     */

    public TabularJobConfig withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO finds the best
     * hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     * 
     * @param mode
     *        The method that Autopilot uses to train the data. You can either specify the mode manually or let
     *        Autopilot choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code>
     *        mode, Autopilot chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and
     *        <code>HYPERPARAMETER_TUNING</code> for larger ones.</p>
     *        <p>
     *        The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and
     *        regression tasks directly from your dataset. This machine learning mode combines several base models to
     *        produce an optimal predictive model. It then uses a stacking ensemble method to combine predictions from
     *        contributing members. A multi-stack ensemble model can provide better performance over a single model by
     *        combining the predictive capabilities of multiple models. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     *        </p>
     *        <p>
     *        The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version
     *        of a model. HPO automatically selects an algorithm for the type of problem you want to solve. Then HPO
     *        finds the best hyperparameters according to your objective metric. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code>
     *        mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMode
     */

    public TabularJobConfig withMode(AutoMLMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * Generates possible candidates without training the models. A model candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        Generates possible candidates without training the models. A model candidate is a combination of data
     *        preprocessors, algorithms, and algorithm parameter settings.
     */

    public void setGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        this.generateCandidateDefinitionsOnly = generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Generates possible candidates without training the models. A model candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @return Generates possible candidates without training the models. A model candidate is a combination of data
     *         preprocessors, algorithms, and algorithm parameter settings.
     */

    public Boolean getGenerateCandidateDefinitionsOnly() {
        return this.generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Generates possible candidates without training the models. A model candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        Generates possible candidates without training the models. A model candidate is a combination of data
     *        preprocessors, algorithms, and algorithm parameter settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TabularJobConfig withGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        setGenerateCandidateDefinitionsOnly(generateCandidateDefinitionsOnly);
        return this;
    }

    /**
     * <p>
     * Generates possible candidates without training the models. A model candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @return Generates possible candidates without training the models. A model candidate is a combination of data
     *         preprocessors, algorithms, and algorithm parameter settings.
     */

    public Boolean isGenerateCandidateDefinitionsOnly() {
        return this.generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     * <note>
     * <p>
     * You must either specify the type of supervised learning problem in <code>ProblemType</code> and provide the <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html#sagemaker-CreateAutoMLJobV2-request-AutoMLJobObjective"
     * >AutoMLJobObjective</a> metric, or none at all.
     * </p>
     * </note>
     * 
     * @param problemType
     *        The type of supervised learning problem available for the model candidates of the AutoML job V2. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types"
     *        > SageMaker Autopilot problem types</a>.</p> <note>
     *        <p>
     *        You must either specify the type of supervised learning problem in <code>ProblemType</code> and provide
     *        the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html#sagemaker-CreateAutoMLJobV2-request-AutoMLJobObjective"
     *        >AutoMLJobObjective</a> metric, or none at all.
     *        </p>
     * @see ProblemType
     */

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     * <note>
     * <p>
     * You must either specify the type of supervised learning problem in <code>ProblemType</code> and provide the <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html#sagemaker-CreateAutoMLJobV2-request-AutoMLJobObjective"
     * >AutoMLJobObjective</a> metric, or none at all.
     * </p>
     * </note>
     * 
     * @return The type of supervised learning problem available for the model candidates of the AutoML job V2. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types"
     *         > SageMaker Autopilot problem types</a>.</p> <note>
     *         <p>
     *         You must either specify the type of supervised learning problem in <code>ProblemType</code> and provide
     *         the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html#sagemaker-CreateAutoMLJobV2-request-AutoMLJobObjective"
     *         >AutoMLJobObjective</a> metric, or none at all.
     *         </p>
     * @see ProblemType
     */

    public String getProblemType() {
        return this.problemType;
    }

    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     * <note>
     * <p>
     * You must either specify the type of supervised learning problem in <code>ProblemType</code> and provide the <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html#sagemaker-CreateAutoMLJobV2-request-AutoMLJobObjective"
     * >AutoMLJobObjective</a> metric, or none at all.
     * </p>
     * </note>
     * 
     * @param problemType
     *        The type of supervised learning problem available for the model candidates of the AutoML job V2. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types"
     *        > SageMaker Autopilot problem types</a>.</p> <note>
     *        <p>
     *        You must either specify the type of supervised learning problem in <code>ProblemType</code> and provide
     *        the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html#sagemaker-CreateAutoMLJobV2-request-AutoMLJobObjective"
     *        >AutoMLJobObjective</a> metric, or none at all.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public TabularJobConfig withProblemType(String problemType) {
        setProblemType(problemType);
        return this;
    }

    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     * <note>
     * <p>
     * You must either specify the type of supervised learning problem in <code>ProblemType</code> and provide the <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html#sagemaker-CreateAutoMLJobV2-request-AutoMLJobObjective"
     * >AutoMLJobObjective</a> metric, or none at all.
     * </p>
     * </note>
     * 
     * @param problemType
     *        The type of supervised learning problem available for the model candidates of the AutoML job V2. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types"
     *        > SageMaker Autopilot problem types</a>.</p> <note>
     *        <p>
     *        You must either specify the type of supervised learning problem in <code>ProblemType</code> and provide
     *        the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJobV2.html#sagemaker-CreateAutoMLJobV2-request-AutoMLJobObjective"
     *        >AutoMLJobObjective</a> metric, or none at all.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public TabularJobConfig withProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, usually represented by 'y'.
     * </p>
     * 
     * @param targetAttributeName
     *        The name of the target variable in supervised learning, usually represented by 'y'.
     */

    public void setTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, usually represented by 'y'.
     * </p>
     * 
     * @return The name of the target variable in supervised learning, usually represented by 'y'.
     */

    public String getTargetAttributeName() {
        return this.targetAttributeName;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, usually represented by 'y'.
     * </p>
     * 
     * @param targetAttributeName
     *        The name of the target variable in supervised learning, usually represented by 'y'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TabularJobConfig withTargetAttributeName(String targetAttributeName) {
        setTargetAttributeName(targetAttributeName);
        return this;
    }

    /**
     * <p>
     * If specified, this column name indicates which column of the dataset should be treated as sample weights for use
     * by the objective metric during the training, evaluation, and the selection of the best model. This column is not
     * considered as a predictive feature. For more information on Autopilot metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html">Metrics and
     * validation</a>.
     * </p>
     * <p>
     * Sample weights should be numeric, non-negative, with larger values indicating which rows are more important than
     * others. Data points that have invalid or no weight value are excluded.
     * </p>
     * <p>
     * Support for sample weights is available in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">Ensembling</a>
     * mode only.
     * </p>
     * 
     * @param sampleWeightAttributeName
     *        If specified, this column name indicates which column of the dataset should be treated as sample weights
     *        for use by the objective metric during the training, evaluation, and the selection of the best model. This
     *        column is not considered as a predictive feature. For more information on Autopilot metrics, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html">Metrics and
     *        validation</a>.</p>
     *        <p>
     *        Sample weights should be numeric, non-negative, with larger values indicating which rows are more
     *        important than others. Data points that have invalid or no weight value are excluded.
     *        </p>
     *        <p>
     *        Support for sample weights is available in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html"
     *        >Ensembling</a> mode only.
     */

    public void setSampleWeightAttributeName(String sampleWeightAttributeName) {
        this.sampleWeightAttributeName = sampleWeightAttributeName;
    }

    /**
     * <p>
     * If specified, this column name indicates which column of the dataset should be treated as sample weights for use
     * by the objective metric during the training, evaluation, and the selection of the best model. This column is not
     * considered as a predictive feature. For more information on Autopilot metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html">Metrics and
     * validation</a>.
     * </p>
     * <p>
     * Sample weights should be numeric, non-negative, with larger values indicating which rows are more important than
     * others. Data points that have invalid or no weight value are excluded.
     * </p>
     * <p>
     * Support for sample weights is available in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">Ensembling</a>
     * mode only.
     * </p>
     * 
     * @return If specified, this column name indicates which column of the dataset should be treated as sample weights
     *         for use by the objective metric during the training, evaluation, and the selection of the best model.
     *         This column is not considered as a predictive feature. For more information on Autopilot metrics, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html">Metrics and
     *         validation</a>.</p>
     *         <p>
     *         Sample weights should be numeric, non-negative, with larger values indicating which rows are more
     *         important than others. Data points that have invalid or no weight value are excluded.
     *         </p>
     *         <p>
     *         Support for sample weights is available in <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html"
     *         >Ensembling</a> mode only.
     */

    public String getSampleWeightAttributeName() {
        return this.sampleWeightAttributeName;
    }

    /**
     * <p>
     * If specified, this column name indicates which column of the dataset should be treated as sample weights for use
     * by the objective metric during the training, evaluation, and the selection of the best model. This column is not
     * considered as a predictive feature. For more information on Autopilot metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html">Metrics and
     * validation</a>.
     * </p>
     * <p>
     * Sample weights should be numeric, non-negative, with larger values indicating which rows are more important than
     * others. Data points that have invalid or no weight value are excluded.
     * </p>
     * <p>
     * Support for sample weights is available in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">Ensembling</a>
     * mode only.
     * </p>
     * 
     * @param sampleWeightAttributeName
     *        If specified, this column name indicates which column of the dataset should be treated as sample weights
     *        for use by the objective metric during the training, evaluation, and the selection of the best model. This
     *        column is not considered as a predictive feature. For more information on Autopilot metrics, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html">Metrics and
     *        validation</a>.</p>
     *        <p>
     *        Sample weights should be numeric, non-negative, with larger values indicating which rows are more
     *        important than others. Data points that have invalid or no weight value are excluded.
     *        </p>
     *        <p>
     *        Support for sample weights is available in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html"
     *        >Ensembling</a> mode only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TabularJobConfig withSampleWeightAttributeName(String sampleWeightAttributeName) {
        setSampleWeightAttributeName(sampleWeightAttributeName);
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
        if (getCandidateGenerationConfig() != null)
            sb.append("CandidateGenerationConfig: ").append(getCandidateGenerationConfig()).append(",");
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: ").append(getCompletionCriteria()).append(",");
        if (getFeatureSpecificationS3Uri() != null)
            sb.append("FeatureSpecificationS3Uri: ").append(getFeatureSpecificationS3Uri()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getGenerateCandidateDefinitionsOnly() != null)
            sb.append("GenerateCandidateDefinitionsOnly: ").append(getGenerateCandidateDefinitionsOnly()).append(",");
        if (getProblemType() != null)
            sb.append("ProblemType: ").append(getProblemType()).append(",");
        if (getTargetAttributeName() != null)
            sb.append("TargetAttributeName: ").append(getTargetAttributeName()).append(",");
        if (getSampleWeightAttributeName() != null)
            sb.append("SampleWeightAttributeName: ").append(getSampleWeightAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TabularJobConfig == false)
            return false;
        TabularJobConfig other = (TabularJobConfig) obj;
        if (other.getCandidateGenerationConfig() == null ^ this.getCandidateGenerationConfig() == null)
            return false;
        if (other.getCandidateGenerationConfig() != null && other.getCandidateGenerationConfig().equals(this.getCandidateGenerationConfig()) == false)
            return false;
        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        if (other.getFeatureSpecificationS3Uri() == null ^ this.getFeatureSpecificationS3Uri() == null)
            return false;
        if (other.getFeatureSpecificationS3Uri() != null && other.getFeatureSpecificationS3Uri().equals(this.getFeatureSpecificationS3Uri()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() == null ^ this.getGenerateCandidateDefinitionsOnly() == null)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() != null
                && other.getGenerateCandidateDefinitionsOnly().equals(this.getGenerateCandidateDefinitionsOnly()) == false)
            return false;
        if (other.getProblemType() == null ^ this.getProblemType() == null)
            return false;
        if (other.getProblemType() != null && other.getProblemType().equals(this.getProblemType()) == false)
            return false;
        if (other.getTargetAttributeName() == null ^ this.getTargetAttributeName() == null)
            return false;
        if (other.getTargetAttributeName() != null && other.getTargetAttributeName().equals(this.getTargetAttributeName()) == false)
            return false;
        if (other.getSampleWeightAttributeName() == null ^ this.getSampleWeightAttributeName() == null)
            return false;
        if (other.getSampleWeightAttributeName() != null && other.getSampleWeightAttributeName().equals(this.getSampleWeightAttributeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCandidateGenerationConfig() == null) ? 0 : getCandidateGenerationConfig().hashCode());
        hashCode = prime * hashCode + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        hashCode = prime * hashCode + ((getFeatureSpecificationS3Uri() == null) ? 0 : getFeatureSpecificationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getGenerateCandidateDefinitionsOnly() == null) ? 0 : getGenerateCandidateDefinitionsOnly().hashCode());
        hashCode = prime * hashCode + ((getProblemType() == null) ? 0 : getProblemType().hashCode());
        hashCode = prime * hashCode + ((getTargetAttributeName() == null) ? 0 : getTargetAttributeName().hashCode());
        hashCode = prime * hashCode + ((getSampleWeightAttributeName() == null) ? 0 : getSampleWeightAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public TabularJobConfig clone() {
        try {
            return (TabularJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TabularJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
