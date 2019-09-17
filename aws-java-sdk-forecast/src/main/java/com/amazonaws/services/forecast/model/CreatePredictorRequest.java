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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePredictorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the predictor.
     * </p>
     */
    private String predictorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if <code>PerformAutoML</code>
     * is not set to <code>true</code>.
     * </p>
     * <p class="title">
     * <b>Supported algorithms</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ARIMA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     * </p>
     * <p>
     * <code>- supports hyperparameter optimization (HPO)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/NPTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Prophet</code>
     * </p>
     * </li>
     * </ul>
     */
    private String algorithmArn;
    /**
     * <p>
     * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the
     * prediction length.
     * </p>
     * <p>
     * For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code> parameter
     * of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns predictions for 10
     * days.
     * </p>
     */
    private Integer forecastHorizon;
    /**
     * <p>
     * Whether to perform AutoML. The default value is <code>false</code>. In this case, you are required to specify an
     * algorithm.
     * </p>
     * <p>
     * If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and
     * configuration for your training dataset, set <code>PerformAutoML</code> to <code>true</code>. This is a good
     * option if you aren't sure which algorithm is suitable for your application.
     * </p>
     */
    private Boolean performAutoML;
    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies an objective metric, the hyperparameters to
     * optimize, and the valid range for each hyperparameter.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * </ul>
     */
    private Boolean performHPO;
    /**
     * <p>
     * The training parameters to override for model training. The parameters that you can override are listed in the
     * individual algorithms in <a>aws-forecast-choosing-recipes</a>.
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
     * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast
     * uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization
     * (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
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
     * A name for the predictor.
     * </p>
     * 
     * @param predictorName
     *        A name for the predictor.
     */

    public void setPredictorName(String predictorName) {
        this.predictorName = predictorName;
    }

    /**
     * <p>
     * A name for the predictor.
     * </p>
     * 
     * @return A name for the predictor.
     */

    public String getPredictorName() {
        return this.predictorName;
    }

    /**
     * <p>
     * A name for the predictor.
     * </p>
     * 
     * @param predictorName
     *        A name for the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withPredictorName(String predictorName) {
        setPredictorName(predictorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if <code>PerformAutoML</code>
     * is not set to <code>true</code>.
     * </p>
     * <p class="title">
     * <b>Supported algorithms</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ARIMA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     * </p>
     * <p>
     * <code>- supports hyperparameter optimization (HPO)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/NPTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Prophet</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if
     *        <code>PerformAutoML</code> is not set to <code>true</code>.</p>
     *        <p class="title">
     *        <b>Supported algorithms</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/ARIMA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     *        </p>
     *        <p>
     *        <code>- supports hyperparameter optimization (HPO)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/ETS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/NPTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/Prophet</code>
     *        </p>
     *        </li>
     */

    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if <code>PerformAutoML</code>
     * is not set to <code>true</code>.
     * </p>
     * <p class="title">
     * <b>Supported algorithms</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ARIMA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     * </p>
     * <p>
     * <code>- supports hyperparameter optimization (HPO)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/NPTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Prophet</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if
     *         <code>PerformAutoML</code> is not set to <code>true</code>.</p>
     *         <p class="title">
     *         <b>Supported algorithms</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/ARIMA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     *         </p>
     *         <p>
     *         <code>- supports hyperparameter optimization (HPO)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/ETS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/NPTS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:forecast:::algorithm/Prophet</code>
     *         </p>
     *         </li>
     */

    public String getAlgorithmArn() {
        return this.algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if <code>PerformAutoML</code>
     * is not set to <code>true</code>.
     * </p>
     * <p class="title">
     * <b>Supported algorithms</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ARIMA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     * </p>
     * <p>
     * <code>- supports hyperparameter optimization (HPO)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/ETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/NPTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:forecast:::algorithm/Prophet</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if
     *        <code>PerformAutoML</code> is not set to <code>true</code>.</p>
     *        <p class="title">
     *        <b>Supported algorithms</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/ARIMA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/Deep_AR_Plus</code>
     *        </p>
     *        <p>
     *        <code>- supports hyperparameter optimization (HPO)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/ETS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/NPTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:forecast:::algorithm/Prophet</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withAlgorithmArn(String algorithmArn) {
        setAlgorithmArn(algorithmArn);
        return this;
    }

    /**
     * <p>
     * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the
     * prediction length.
     * </p>
     * <p>
     * For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code> parameter
     * of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns predictions for 10
     * days.
     * </p>
     * 
     * @param forecastHorizon
     *        Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also
     *        called the prediction length.</p>
     *        <p>
     *        For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code>
     *        parameter of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns
     *        predictions for 10 days.
     */

    public void setForecastHorizon(Integer forecastHorizon) {
        this.forecastHorizon = forecastHorizon;
    }

    /**
     * <p>
     * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the
     * prediction length.
     * </p>
     * <p>
     * For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code> parameter
     * of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns predictions for 10
     * days.
     * </p>
     * 
     * @return Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also
     *         called the prediction length.</p>
     *         <p>
     *         For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code>
     *         parameter of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns
     *         predictions for 10 days.
     */

    public Integer getForecastHorizon() {
        return this.forecastHorizon;
    }

    /**
     * <p>
     * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the
     * prediction length.
     * </p>
     * <p>
     * For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code> parameter
     * of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns predictions for 10
     * days.
     * </p>
     * 
     * @param forecastHorizon
     *        Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also
     *        called the prediction length.</p>
     *        <p>
     *        For example, if you configure a dataset for daily data collection (using the <code>DataFrequency</code>
     *        parameter of the <a>CreateDataset</a> operation) and set the forecast horizon to 10, the model returns
     *        predictions for 10 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withForecastHorizon(Integer forecastHorizon) {
        setForecastHorizon(forecastHorizon);
        return this;
    }

    /**
     * <p>
     * Whether to perform AutoML. The default value is <code>false</code>. In this case, you are required to specify an
     * algorithm.
     * </p>
     * <p>
     * If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and
     * configuration for your training dataset, set <code>PerformAutoML</code> to <code>true</code>. This is a good
     * option if you aren't sure which algorithm is suitable for your application.
     * </p>
     * 
     * @param performAutoML
     *        Whether to perform AutoML. The default value is <code>false</code>. In this case, you are required to
     *        specify an algorithm.</p>
     *        <p>
     *        If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and
     *        configuration for your training dataset, set <code>PerformAutoML</code> to <code>true</code>. This is a
     *        good option if you aren't sure which algorithm is suitable for your application.
     */

    public void setPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
    }

    /**
     * <p>
     * Whether to perform AutoML. The default value is <code>false</code>. In this case, you are required to specify an
     * algorithm.
     * </p>
     * <p>
     * If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and
     * configuration for your training dataset, set <code>PerformAutoML</code> to <code>true</code>. This is a good
     * option if you aren't sure which algorithm is suitable for your application.
     * </p>
     * 
     * @return Whether to perform AutoML. The default value is <code>false</code>. In this case, you are required to
     *         specify an algorithm.</p>
     *         <p>
     *         If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and
     *         configuration for your training dataset, set <code>PerformAutoML</code> to <code>true</code>. This is a
     *         good option if you aren't sure which algorithm is suitable for your application.
     */

    public Boolean getPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * Whether to perform AutoML. The default value is <code>false</code>. In this case, you are required to specify an
     * algorithm.
     * </p>
     * <p>
     * If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and
     * configuration for your training dataset, set <code>PerformAutoML</code> to <code>true</code>. This is a good
     * option if you aren't sure which algorithm is suitable for your application.
     * </p>
     * 
     * @param performAutoML
     *        Whether to perform AutoML. The default value is <code>false</code>. In this case, you are required to
     *        specify an algorithm.</p>
     *        <p>
     *        If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and
     *        configuration for your training dataset, set <code>PerformAutoML</code> to <code>true</code>. This is a
     *        good option if you aren't sure which algorithm is suitable for your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withPerformAutoML(Boolean performAutoML) {
        setPerformAutoML(performAutoML);
        return this;
    }

    /**
     * <p>
     * Whether to perform AutoML. The default value is <code>false</code>. In this case, you are required to specify an
     * algorithm.
     * </p>
     * <p>
     * If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and
     * configuration for your training dataset, set <code>PerformAutoML</code> to <code>true</code>. This is a good
     * option if you aren't sure which algorithm is suitable for your application.
     * </p>
     * 
     * @return Whether to perform AutoML. The default value is <code>false</code>. In this case, you are required to
     *         specify an algorithm.</p>
     *         <p>
     *         If you want Amazon Forecast to evaluate the algorithms it provides and choose the best algorithm and
     *         configuration for your training dataset, set <code>PerformAutoML</code> to <code>true</code>. This is a
     *         good option if you aren't sure which algorithm is suitable for your application.
     */

    public Boolean isPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies an objective metric, the hyperparameters to
     * optimize, and the valid range for each hyperparameter.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * </ul>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your
     *        training data. The process of performing HPO is known as a hyperparameter tuning job.</p>
     *        <p>
     *        The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values
     *        from the chosen algorithm.
     *        </p>
     *        <p>
     *        To override the default values, set <code>PerformHPO</code> to <code>true</code> and supply the
     *        <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies an objective metric, the
     *        hyperparameters to optimize, and the valid range for each hyperparameter.
     *        </p>
     *        <p>
     *        The following algorithms support HPO:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DeepAR+
     *        </p>
     *        </li>
     */

    public void setPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies an objective metric, the hyperparameters to
     * optimize, and the valid range for each hyperparameter.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * </ul>
     * 
     * @return Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your
     *         training data. The process of performing HPO is known as a hyperparameter tuning job.</p>
     *         <p>
     *         The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values
     *         from the chosen algorithm.
     *         </p>
     *         <p>
     *         To override the default values, set <code>PerformHPO</code> to <code>true</code> and supply the
     *         <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies an objective metric, the
     *         hyperparameters to optimize, and the valid range for each hyperparameter.
     *         </p>
     *         <p>
     *         The following algorithms support HPO:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeepAR+
     *         </p>
     *         </li>
     */

    public Boolean getPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies an objective metric, the hyperparameters to
     * optimize, and the valid range for each hyperparameter.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * </ul>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your
     *        training data. The process of performing HPO is known as a hyperparameter tuning job.</p>
     *        <p>
     *        The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values
     *        from the chosen algorithm.
     *        </p>
     *        <p>
     *        To override the default values, set <code>PerformHPO</code> to <code>true</code> and supply the
     *        <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies an objective metric, the
     *        hyperparameters to optimize, and the valid range for each hyperparameter.
     *        </p>
     *        <p>
     *        The following algorithms support HPO:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DeepAR+
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withPerformHPO(Boolean performHPO) {
        setPerformHPO(performHPO);
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training
     * data. The process of performing HPO is known as a hyperparameter tuning job.
     * </p>
     * <p>
     * The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values from
     * the chosen algorithm.
     * </p>
     * <p>
     * To override the default values, set <code>PerformHPO</code> to <code>true</code> and supply the
     * <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies an objective metric, the hyperparameters to
     * optimize, and the valid range for each hyperparameter.
     * </p>
     * <p>
     * The following algorithms support HPO:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DeepAR+
     * </p>
     * </li>
     * </ul>
     * 
     * @return Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your
     *         training data. The process of performing HPO is known as a hyperparameter tuning job.</p>
     *         <p>
     *         The default value is <code>false</code>. In this case, Amazon Forecast uses default hyperparameter values
     *         from the chosen algorithm.
     *         </p>
     *         <p>
     *         To override the default values, set <code>PerformHPO</code> to <code>true</code> and supply the
     *         <a>HyperParameterTuningJobConfig</a> object. The tuning job specifies an objective metric, the
     *         hyperparameters to optimize, and the valid range for each hyperparameter.
     *         </p>
     *         <p>
     *         The following algorithms support HPO:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeepAR+
     *         </p>
     *         </li>
     */

    public Boolean isPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * The training parameters to override for model training. The parameters that you can override are listed in the
     * individual algorithms in <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @return The training parameters to override for model training. The parameters that you can override are listed
     *         in the individual algorithms in <a>aws-forecast-choosing-recipes</a>.
     */

    public java.util.Map<String, String> getTrainingParameters() {
        return trainingParameters;
    }

    /**
     * <p>
     * The training parameters to override for model training. The parameters that you can override are listed in the
     * individual algorithms in <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @param trainingParameters
     *        The training parameters to override for model training. The parameters that you can override are listed in
     *        the individual algorithms in <a>aws-forecast-choosing-recipes</a>.
     */

    public void setTrainingParameters(java.util.Map<String, String> trainingParameters) {
        this.trainingParameters = trainingParameters;
    }

    /**
     * <p>
     * The training parameters to override for model training. The parameters that you can override are listed in the
     * individual algorithms in <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @param trainingParameters
     *        The training parameters to override for model training. The parameters that you can override are listed in
     *        the individual algorithms in <a>aws-forecast-choosing-recipes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withTrainingParameters(java.util.Map<String, String> trainingParameters) {
        setTrainingParameters(trainingParameters);
        return this;
    }

    public CreatePredictorRequest addTrainingParametersEntry(String key, String value) {
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

    public CreatePredictorRequest clearTrainingParametersEntries() {
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

    public CreatePredictorRequest withEvaluationParameters(EvaluationParameters evaluationParameters) {
        setEvaluationParameters(evaluationParameters);
        return this;
    }

    /**
     * <p>
     * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast
     * uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization
     * (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @param hPOConfig
     *        Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon
     *        Forecast uses default values. The individual algorithms specify which hyperparameters support
     *        hyperparameter optimization (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     */

    public void setHPOConfig(HyperParameterTuningJobConfig hPOConfig) {
        this.hPOConfig = hPOConfig;
    }

    /**
     * <p>
     * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast
     * uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization
     * (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @return Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon
     *         Forecast uses default values. The individual algorithms specify which hyperparameters support
     *         hyperparameter optimization (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     */

    public HyperParameterTuningJobConfig getHPOConfig() {
        return this.hPOConfig;
    }

    /**
     * <p>
     * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast
     * uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization
     * (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     * </p>
     * 
     * @param hPOConfig
     *        Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon
     *        Forecast uses default values. The individual algorithms specify which hyperparameters support
     *        hyperparameter optimization (HPO). For more information, see <a>aws-forecast-choosing-recipes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorRequest withHPOConfig(HyperParameterTuningJobConfig hPOConfig) {
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

    public CreatePredictorRequest withInputDataConfig(InputDataConfig inputDataConfig) {
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

    public CreatePredictorRequest withFeaturizationConfig(FeaturizationConfig featurizationConfig) {
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

    public CreatePredictorRequest withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
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
            sb.append("EncryptionConfig: ").append(getEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePredictorRequest == false)
            return false;
        CreatePredictorRequest other = (CreatePredictorRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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
        return hashCode;
    }

    @Override
    public CreatePredictorRequest clone() {
        return (CreatePredictorRequest) super.clone();
    }

}
