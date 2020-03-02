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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribePredictor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePredictorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the predictor.
     * </p>
     */
    private String predictorArn;
    /**
     * <p>
     * The name of the predictor.
     * </p>
     */
    private String predictorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm used for model training.
     * </p>
     */
    private String algorithmArn;
    /**
     * <p>
     * The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
     * </p>
     */
    private Integer forecastHorizon;
    /**
     * <p>
     * Whether the predictor is set to perform AutoML.
     * </p>
     */
    private Boolean performAutoML;
    /**
     * <p>
     * Whether the predictor is set to perform hyperparameter optimization (HPO).
     * </p>
     */
    private Boolean performHPO;
    /**
     * <p>
     * The default training parameters or overrides selected during model training. If using the AutoML algorithm or if
     * HPO is turned on while using the DeepAR+ algorithms, the optimized values for the chosen hyperparameters are
     * returned. For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     */
    private java.util.Map<String, String> trainingParameters;
    /**
     * <p>
     * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     * predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to
     * perform the split and the number of iterations.
     * </p>
     */
    private EvaluationParameters evaluationParameters;
    /**
     * <p>
     * The hyperparameter override values for the algorithm.
     * </p>
     */
    private HyperParameterTuningJobConfig hPOConfig;
    /**
     * <p>
     * Describes the dataset group that contains the data to use to train the predictor.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * The featurization configuration.
     * </p>
     */
    private FeaturizationConfig featurizationConfig;
    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     */
    private EncryptionConfig encryptionConfig;
    /**
     * <p>
     * Details on the the status and results of the backtests performed to evaluate the accuracy of the predictor. You
     * specify the number of backtests to perform when you call the operation.
     * </p>
     */
    private PredictorExecutionDetails predictorExecutionDetails;
    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     */
    private java.util.List<String> datasetImportJobArns;
    /**
     * <p>
     * When <code>PerformAutoML</code> is specified, the ARN of the chosen algorithm.
     * </p>
     */
    private java.util.List<String> autoMLAlgorithmArns;
    /**
     * <p>
     * The status of the predictor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to create a
     * forecast.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * When the model training task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (when the status is <code>CREATE_PENDING</code>). This value is
     * updated when training starts (when the status changes to <code>CREATE_IN_PROGRESS</code>), and when training has
     * completed (when the status changes to <code>ACTIVE</code>) or fails (when the status changes to
     * <code>CREATE_FAILED</code>).
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The ARN of the predictor.
     * </p>
     * 
     * @param predictorArn
     *        The ARN of the predictor.
     */

    public void setPredictorArn(String predictorArn) {
        this.predictorArn = predictorArn;
    }

    /**
     * <p>
     * The ARN of the predictor.
     * </p>
     * 
     * @return The ARN of the predictor.
     */

    public String getPredictorArn() {
        return this.predictorArn;
    }

    /**
     * <p>
     * The ARN of the predictor.
     * </p>
     * 
     * @param predictorArn
     *        The ARN of the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withPredictorArn(String predictorArn) {
        setPredictorArn(predictorArn);
        return this;
    }

    /**
     * <p>
     * The name of the predictor.
     * </p>
     * 
     * @param predictorName
     *        The name of the predictor.
     */

    public void setPredictorName(String predictorName) {
        this.predictorName = predictorName;
    }

    /**
     * <p>
     * The name of the predictor.
     * </p>
     * 
     * @return The name of the predictor.
     */

    public String getPredictorName() {
        return this.predictorName;
    }

    /**
     * <p>
     * The name of the predictor.
     * </p>
     * 
     * @param predictorName
     *        The name of the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withPredictorName(String predictorName) {
        setPredictorName(predictorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm used for model training.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm used for model training.
     */

    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm used for model training.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the algorithm used for model training.
     */

    public String getAlgorithmArn() {
        return this.algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm used for model training.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm used for model training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withAlgorithmArn(String algorithmArn) {
        setAlgorithmArn(algorithmArn);
        return this;
    }

    /**
     * <p>
     * The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
     * </p>
     * 
     * @param forecastHorizon
     *        The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
     */

    public void setForecastHorizon(Integer forecastHorizon) {
        this.forecastHorizon = forecastHorizon;
    }

    /**
     * <p>
     * The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
     * </p>
     * 
     * @return The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
     */

    public Integer getForecastHorizon() {
        return this.forecastHorizon;
    }

    /**
     * <p>
     * The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
     * </p>
     * 
     * @param forecastHorizon
     *        The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withForecastHorizon(Integer forecastHorizon) {
        setForecastHorizon(forecastHorizon);
        return this;
    }

    /**
     * <p>
     * Whether the predictor is set to perform AutoML.
     * </p>
     * 
     * @param performAutoML
     *        Whether the predictor is set to perform AutoML.
     */

    public void setPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
    }

    /**
     * <p>
     * Whether the predictor is set to perform AutoML.
     * </p>
     * 
     * @return Whether the predictor is set to perform AutoML.
     */

    public Boolean getPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * Whether the predictor is set to perform AutoML.
     * </p>
     * 
     * @param performAutoML
     *        Whether the predictor is set to perform AutoML.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withPerformAutoML(Boolean performAutoML) {
        setPerformAutoML(performAutoML);
        return this;
    }

    /**
     * <p>
     * Whether the predictor is set to perform AutoML.
     * </p>
     * 
     * @return Whether the predictor is set to perform AutoML.
     */

    public Boolean isPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * Whether the predictor is set to perform hyperparameter optimization (HPO).
     * </p>
     * 
     * @param performHPO
     *        Whether the predictor is set to perform hyperparameter optimization (HPO).
     */

    public void setPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
    }

    /**
     * <p>
     * Whether the predictor is set to perform hyperparameter optimization (HPO).
     * </p>
     * 
     * @return Whether the predictor is set to perform hyperparameter optimization (HPO).
     */

    public Boolean getPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * Whether the predictor is set to perform hyperparameter optimization (HPO).
     * </p>
     * 
     * @param performHPO
     *        Whether the predictor is set to perform hyperparameter optimization (HPO).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withPerformHPO(Boolean performHPO) {
        setPerformHPO(performHPO);
        return this;
    }

    /**
     * <p>
     * Whether the predictor is set to perform hyperparameter optimization (HPO).
     * </p>
     * 
     * @return Whether the predictor is set to perform hyperparameter optimization (HPO).
     */

    public Boolean isPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * The default training parameters or overrides selected during model training. If using the AutoML algorithm or if
     * HPO is turned on while using the DeepAR+ algorithms, the optimized values for the chosen hyperparameters are
     * returned. For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @return The default training parameters or overrides selected during model training. If using the AutoML
     *         algorithm or if HPO is turned on while using the DeepAR+ algorithms, the optimized values for the chosen
     *         hyperparameters are returned. For more information, see <a>aws-forecast-choosing-recipes</a>.
     */

    public java.util.Map<String, String> getTrainingParameters() {
        return trainingParameters;
    }

    /**
     * <p>
     * The default training parameters or overrides selected during model training. If using the AutoML algorithm or if
     * HPO is turned on while using the DeepAR+ algorithms, the optimized values for the chosen hyperparameters are
     * returned. For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @param trainingParameters
     *        The default training parameters or overrides selected during model training. If using the AutoML algorithm
     *        or if HPO is turned on while using the DeepAR+ algorithms, the optimized values for the chosen
     *        hyperparameters are returned. For more information, see <a>aws-forecast-choosing-recipes</a>.
     */

    public void setTrainingParameters(java.util.Map<String, String> trainingParameters) {
        this.trainingParameters = trainingParameters;
    }

    /**
     * <p>
     * The default training parameters or overrides selected during model training. If using the AutoML algorithm or if
     * HPO is turned on while using the DeepAR+ algorithms, the optimized values for the chosen hyperparameters are
     * returned. For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @param trainingParameters
     *        The default training parameters or overrides selected during model training. If using the AutoML algorithm
     *        or if HPO is turned on while using the DeepAR+ algorithms, the optimized values for the chosen
     *        hyperparameters are returned. For more information, see <a>aws-forecast-choosing-recipes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withTrainingParameters(java.util.Map<String, String> trainingParameters) {
        setTrainingParameters(trainingParameters);
        return this;
    }

    /**
     * Add a single TrainingParameters entry
     *
     * @see DescribePredictorResult#withTrainingParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult addTrainingParametersEntry(String key, String value) {
        if (null == this.trainingParameters) {
            this.trainingParameters = new java.util.HashMap<String, String>();
        }
        if (this.trainingParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.trainingParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TrainingParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult clearTrainingParametersEntries() {
        this.trainingParameters = null;
        return this;
    }

    /**
     * <p>
     * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     * predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to
     * perform the split and the number of iterations.
     * </p>
     * 
     * @param evaluationParameters
     *        Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     *        predictor by splitting a dataset into training data and testing data. The evaluation parameters define how
     *        to perform the split and the number of iterations.
     */

    public void setEvaluationParameters(EvaluationParameters evaluationParameters) {
        this.evaluationParameters = evaluationParameters;
    }

    /**
     * <p>
     * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     * predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to
     * perform the split and the number of iterations.
     * </p>
     * 
     * @return Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates
     *         a predictor by splitting a dataset into training data and testing data. The evaluation parameters define
     *         how to perform the split and the number of iterations.
     */

    public EvaluationParameters getEvaluationParameters() {
        return this.evaluationParameters;
    }

    /**
     * <p>
     * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     * predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to
     * perform the split and the number of iterations.
     * </p>
     * 
     * @param evaluationParameters
     *        Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a
     *        predictor by splitting a dataset into training data and testing data. The evaluation parameters define how
     *        to perform the split and the number of iterations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withEvaluationParameters(EvaluationParameters evaluationParameters) {
        setEvaluationParameters(evaluationParameters);
        return this;
    }

    /**
     * <p>
     * The hyperparameter override values for the algorithm.
     * </p>
     * 
     * @param hPOConfig
     *        The hyperparameter override values for the algorithm.
     */

    public void setHPOConfig(HyperParameterTuningJobConfig hPOConfig) {
        this.hPOConfig = hPOConfig;
    }

    /**
     * <p>
     * The hyperparameter override values for the algorithm.
     * </p>
     * 
     * @return The hyperparameter override values for the algorithm.
     */

    public HyperParameterTuningJobConfig getHPOConfig() {
        return this.hPOConfig;
    }

    /**
     * <p>
     * The hyperparameter override values for the algorithm.
     * </p>
     * 
     * @param hPOConfig
     *        The hyperparameter override values for the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withHPOConfig(HyperParameterTuningJobConfig hPOConfig) {
        setHPOConfig(hPOConfig);
        return this;
    }

    /**
     * <p>
     * Describes the dataset group that contains the data to use to train the predictor.
     * </p>
     * 
     * @param inputDataConfig
     *        Describes the dataset group that contains the data to use to train the predictor.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Describes the dataset group that contains the data to use to train the predictor.
     * </p>
     * 
     * @return Describes the dataset group that contains the data to use to train the predictor.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * Describes the dataset group that contains the data to use to train the predictor.
     * </p>
     * 
     * @param inputDataConfig
     *        Describes the dataset group that contains the data to use to train the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The featurization configuration.
     * </p>
     * 
     * @param featurizationConfig
     *        The featurization configuration.
     */

    public void setFeaturizationConfig(FeaturizationConfig featurizationConfig) {
        this.featurizationConfig = featurizationConfig;
    }

    /**
     * <p>
     * The featurization configuration.
     * </p>
     * 
     * @return The featurization configuration.
     */

    public FeaturizationConfig getFeaturizationConfig() {
        return this.featurizationConfig;
    }

    /**
     * <p>
     * The featurization configuration.
     * </p>
     * 
     * @param featurizationConfig
     *        The featurization configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withFeaturizationConfig(FeaturizationConfig featurizationConfig) {
        setFeaturizationConfig(featurizationConfig);
        return this;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @param encryptionConfig
     *        An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *        Forecast can assume to access the key.
     */

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @return An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *         Forecast can assume to access the key.
     */

    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @param encryptionConfig
     *        An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *        Forecast can assume to access the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
        return this;
    }

    /**
     * <p>
     * Details on the the status and results of the backtests performed to evaluate the accuracy of the predictor. You
     * specify the number of backtests to perform when you call the operation.
     * </p>
     * 
     * @param predictorExecutionDetails
     *        Details on the the status and results of the backtests performed to evaluate the accuracy of the
     *        predictor. You specify the number of backtests to perform when you call the operation.
     */

    public void setPredictorExecutionDetails(PredictorExecutionDetails predictorExecutionDetails) {
        this.predictorExecutionDetails = predictorExecutionDetails;
    }

    /**
     * <p>
     * Details on the the status and results of the backtests performed to evaluate the accuracy of the predictor. You
     * specify the number of backtests to perform when you call the operation.
     * </p>
     * 
     * @return Details on the the status and results of the backtests performed to evaluate the accuracy of the
     *         predictor. You specify the number of backtests to perform when you call the operation.
     */

    public PredictorExecutionDetails getPredictorExecutionDetails() {
        return this.predictorExecutionDetails;
    }

    /**
     * <p>
     * Details on the the status and results of the backtests performed to evaluate the accuracy of the predictor. You
     * specify the number of backtests to perform when you call the operation.
     * </p>
     * 
     * @param predictorExecutionDetails
     *        Details on the the status and results of the backtests performed to evaluate the accuracy of the
     *        predictor. You specify the number of backtests to perform when you call the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withPredictorExecutionDetails(PredictorExecutionDetails predictorExecutionDetails) {
        setPredictorExecutionDetails(predictorExecutionDetails);
        return this;
    }

    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     * 
     * @return An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     */

    public java.util.List<String> getDatasetImportJobArns() {
        return datasetImportJobArns;
    }

    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     * 
     * @param datasetImportJobArns
     *        An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     */

    public void setDatasetImportJobArns(java.util.Collection<String> datasetImportJobArns) {
        if (datasetImportJobArns == null) {
            this.datasetImportJobArns = null;
            return;
        }

        this.datasetImportJobArns = new java.util.ArrayList<String>(datasetImportJobArns);
    }

    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetImportJobArns(java.util.Collection)} or {@link #withDatasetImportJobArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param datasetImportJobArns
     *        An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withDatasetImportJobArns(String... datasetImportJobArns) {
        if (this.datasetImportJobArns == null) {
            setDatasetImportJobArns(new java.util.ArrayList<String>(datasetImportJobArns.length));
        }
        for (String ele : datasetImportJobArns) {
            this.datasetImportJobArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * </p>
     * 
     * @param datasetImportJobArns
     *        An array of the ARNs of the dataset import jobs used to import training data for the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withDatasetImportJobArns(java.util.Collection<String> datasetImportJobArns) {
        setDatasetImportJobArns(datasetImportJobArns);
        return this;
    }

    /**
     * <p>
     * When <code>PerformAutoML</code> is specified, the ARN of the chosen algorithm.
     * </p>
     * 
     * @return When <code>PerformAutoML</code> is specified, the ARN of the chosen algorithm.
     */

    public java.util.List<String> getAutoMLAlgorithmArns() {
        return autoMLAlgorithmArns;
    }

    /**
     * <p>
     * When <code>PerformAutoML</code> is specified, the ARN of the chosen algorithm.
     * </p>
     * 
     * @param autoMLAlgorithmArns
     *        When <code>PerformAutoML</code> is specified, the ARN of the chosen algorithm.
     */

    public void setAutoMLAlgorithmArns(java.util.Collection<String> autoMLAlgorithmArns) {
        if (autoMLAlgorithmArns == null) {
            this.autoMLAlgorithmArns = null;
            return;
        }

        this.autoMLAlgorithmArns = new java.util.ArrayList<String>(autoMLAlgorithmArns);
    }

    /**
     * <p>
     * When <code>PerformAutoML</code> is specified, the ARN of the chosen algorithm.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoMLAlgorithmArns(java.util.Collection)} or {@link #withAutoMLAlgorithmArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param autoMLAlgorithmArns
     *        When <code>PerformAutoML</code> is specified, the ARN of the chosen algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withAutoMLAlgorithmArns(String... autoMLAlgorithmArns) {
        if (this.autoMLAlgorithmArns == null) {
            setAutoMLAlgorithmArns(new java.util.ArrayList<String>(autoMLAlgorithmArns.length));
        }
        for (String ele : autoMLAlgorithmArns) {
            this.autoMLAlgorithmArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When <code>PerformAutoML</code> is specified, the ARN of the chosen algorithm.
     * </p>
     * 
     * @param autoMLAlgorithmArns
     *        When <code>PerformAutoML</code> is specified, the ARN of the chosen algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withAutoMLAlgorithmArns(java.util.Collection<String> autoMLAlgorithmArns) {
        setAutoMLAlgorithmArns(autoMLAlgorithmArns);
        return this;
    }

    /**
     * <p>
     * The status of the predictor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to create a
     * forecast.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the predictor. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to
     *        create a forecast.
     *        </p>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the predictor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to create a
     * forecast.
     * </p>
     * </note>
     * 
     * @return The status of the predictor. States include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to
     *         create a forecast.
     *         </p>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the predictor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to create a
     * forecast.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the predictor. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to
     *        create a forecast.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @return If an error occurred, an informational message about the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * When the model training task was created.
     * </p>
     * 
     * @param creationTime
     *        When the model training task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the model training task was created.
     * </p>
     * 
     * @return When the model training task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the model training task was created.
     * </p>
     * 
     * @param creationTime
     *        When the model training task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (when the status is <code>CREATE_PENDING</code>). This value is
     * updated when training starts (when the status changes to <code>CREATE_IN_PROGRESS</code>), and when training has
     * completed (when the status changes to <code>ACTIVE</code>) or fails (when the status changes to
     * <code>CREATE_FAILED</code>).
     * </p>
     * 
     * @param lastModificationTime
     *        Initially, the same as <code>CreationTime</code> (when the status is <code>CREATE_PENDING</code>). This
     *        value is updated when training starts (when the status changes to <code>CREATE_IN_PROGRESS</code>), and
     *        when training has completed (when the status changes to <code>ACTIVE</code>) or fails (when the status
     *        changes to <code>CREATE_FAILED</code>).
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (when the status is <code>CREATE_PENDING</code>). This value is
     * updated when training starts (when the status changes to <code>CREATE_IN_PROGRESS</code>), and when training has
     * completed (when the status changes to <code>ACTIVE</code>) or fails (when the status changes to
     * <code>CREATE_FAILED</code>).
     * </p>
     * 
     * @return Initially, the same as <code>CreationTime</code> (when the status is <code>CREATE_PENDING</code>). This
     *         value is updated when training starts (when the status changes to <code>CREATE_IN_PROGRESS</code>), and
     *         when training has completed (when the status changes to <code>ACTIVE</code>) or fails (when the status
     *         changes to <code>CREATE_FAILED</code>).
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (when the status is <code>CREATE_PENDING</code>). This value is
     * updated when training starts (when the status changes to <code>CREATE_IN_PROGRESS</code>), and when training has
     * completed (when the status changes to <code>ACTIVE</code>) or fails (when the status changes to
     * <code>CREATE_FAILED</code>).
     * </p>
     * 
     * @param lastModificationTime
     *        Initially, the same as <code>CreationTime</code> (when the status is <code>CREATE_PENDING</code>). This
     *        value is updated when training starts (when the status changes to <code>CREATE_IN_PROGRESS</code>), and
     *        when training has completed (when the status changes to <code>ACTIVE</code>) or fails (when the status
     *        changes to <code>CREATE_FAILED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePredictorResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getPredictorArn() != null)
            sb.append("PredictorArn: ").append(getPredictorArn()).append(",");
        if (getPredictorName() != null)
            sb.append("PredictorName: ").append(getPredictorName()).append(",");
        if (getAlgorithmArn() != null)
            sb.append("AlgorithmArn: ").append(getAlgorithmArn()).append(",");
        if (getForecastHorizon() != null)
            sb.append("ForecastHorizon: ").append(getForecastHorizon()).append(",");
        if (getPerformAutoML() != null)
            sb.append("PerformAutoML: ").append(getPerformAutoML()).append(",");
        if (getPerformHPO() != null)
            sb.append("PerformHPO: ").append(getPerformHPO()).append(",");
        if (getTrainingParameters() != null)
            sb.append("TrainingParameters: ").append(getTrainingParameters()).append(",");
        if (getEvaluationParameters() != null)
            sb.append("EvaluationParameters: ").append(getEvaluationParameters()).append(",");
        if (getHPOConfig() != null)
            sb.append("HPOConfig: ").append(getHPOConfig()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getFeaturizationConfig() != null)
            sb.append("FeaturizationConfig: ").append(getFeaturizationConfig()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig()).append(",");
        if (getPredictorExecutionDetails() != null)
            sb.append("PredictorExecutionDetails: ").append(getPredictorExecutionDetails()).append(",");
        if (getDatasetImportJobArns() != null)
            sb.append("DatasetImportJobArns: ").append(getDatasetImportJobArns()).append(",");
        if (getAutoMLAlgorithmArns() != null)
            sb.append("AutoMLAlgorithmArns: ").append(getAutoMLAlgorithmArns()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePredictorResult == false)
            return false;
        DescribePredictorResult other = (DescribePredictorResult) obj;
        if (other.getPredictorArn() == null ^ this.getPredictorArn() == null)
            return false;
        if (other.getPredictorArn() != null && other.getPredictorArn().equals(this.getPredictorArn()) == false)
            return false;
        if (other.getPredictorName() == null ^ this.getPredictorName() == null)
            return false;
        if (other.getPredictorName() != null && other.getPredictorName().equals(this.getPredictorName()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getForecastHorizon() == null ^ this.getForecastHorizon() == null)
            return false;
        if (other.getForecastHorizon() != null && other.getForecastHorizon().equals(this.getForecastHorizon()) == false)
            return false;
        if (other.getPerformAutoML() == null ^ this.getPerformAutoML() == null)
            return false;
        if (other.getPerformAutoML() != null && other.getPerformAutoML().equals(this.getPerformAutoML()) == false)
            return false;
        if (other.getPerformHPO() == null ^ this.getPerformHPO() == null)
            return false;
        if (other.getPerformHPO() != null && other.getPerformHPO().equals(this.getPerformHPO()) == false)
            return false;
        if (other.getTrainingParameters() == null ^ this.getTrainingParameters() == null)
            return false;
        if (other.getTrainingParameters() != null && other.getTrainingParameters().equals(this.getTrainingParameters()) == false)
            return false;
        if (other.getEvaluationParameters() == null ^ this.getEvaluationParameters() == null)
            return false;
        if (other.getEvaluationParameters() != null && other.getEvaluationParameters().equals(this.getEvaluationParameters()) == false)
            return false;
        if (other.getHPOConfig() == null ^ this.getHPOConfig() == null)
            return false;
        if (other.getHPOConfig() != null && other.getHPOConfig().equals(this.getHPOConfig()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getFeaturizationConfig() == null ^ this.getFeaturizationConfig() == null)
            return false;
        if (other.getFeaturizationConfig() != null && other.getFeaturizationConfig().equals(this.getFeaturizationConfig()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        if (other.getPredictorExecutionDetails() == null ^ this.getPredictorExecutionDetails() == null)
            return false;
        if (other.getPredictorExecutionDetails() != null && other.getPredictorExecutionDetails().equals(this.getPredictorExecutionDetails()) == false)
            return false;
        if (other.getDatasetImportJobArns() == null ^ this.getDatasetImportJobArns() == null)
            return false;
        if (other.getDatasetImportJobArns() != null && other.getDatasetImportJobArns().equals(this.getDatasetImportJobArns()) == false)
            return false;
        if (other.getAutoMLAlgorithmArns() == null ^ this.getAutoMLAlgorithmArns() == null)
            return false;
        if (other.getAutoMLAlgorithmArns() != null && other.getAutoMLAlgorithmArns().equals(this.getAutoMLAlgorithmArns()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictorArn() == null) ? 0 : getPredictorArn().hashCode());
        hashCode = prime * hashCode + ((getPredictorName() == null) ? 0 : getPredictorName().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode + ((getForecastHorizon() == null) ? 0 : getForecastHorizon().hashCode());
        hashCode = prime * hashCode + ((getPerformAutoML() == null) ? 0 : getPerformAutoML().hashCode());
        hashCode = prime * hashCode + ((getPerformHPO() == null) ? 0 : getPerformHPO().hashCode());
        hashCode = prime * hashCode + ((getTrainingParameters() == null) ? 0 : getTrainingParameters().hashCode());
        hashCode = prime * hashCode + ((getEvaluationParameters() == null) ? 0 : getEvaluationParameters().hashCode());
        hashCode = prime * hashCode + ((getHPOConfig() == null) ? 0 : getHPOConfig().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getFeaturizationConfig() == null) ? 0 : getFeaturizationConfig().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        hashCode = prime * hashCode + ((getPredictorExecutionDetails() == null) ? 0 : getPredictorExecutionDetails().hashCode());
        hashCode = prime * hashCode + ((getDatasetImportJobArns() == null) ? 0 : getDatasetImportJobArns().hashCode());
        hashCode = prime * hashCode + ((getAutoMLAlgorithmArns() == null) ? 0 : getAutoMLAlgorithmArns().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribePredictorResult clone() {
        try {
            return (DescribePredictorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
