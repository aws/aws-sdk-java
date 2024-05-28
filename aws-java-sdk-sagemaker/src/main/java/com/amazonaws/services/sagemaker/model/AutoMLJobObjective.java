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
 * Specifies a metric to minimize or maximize as the objective of an AutoML job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLJobObjective" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLJobObjective implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * The list of available metrics supported by Autopilot and the default metric applied when you do not specify a
     * metric name explicitly depend on the problem type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MAE</code>, <code>MSE</code>, <code>R2</code>, <code>RMSE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>Accuracy</code>, <code>AUC</code>, <code>BalancedAccuracy</code>, <code>F1</code>,
     * <code>Precision</code>, <code>Recall</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>, <code>BalancedAccuracy</code>, <code>F1macro</code>,
     * <code>PrecisionMacro</code>, <code>RecallMacro</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics for classification and regression</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MSE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>F1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For image or text classification problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>Accuracy</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/text-classification-data-format-and-metric.html">Autopilot
     * metrics for text and image classification</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>Accuracy</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>RMSE</code>, <code>wQL</code>, <code>Average wQL</code>, <code>MASE</code>,
     * <code>MAPE</code>, <code>WAPE</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/timeseries-objective-metric.html">Autopilot metrics for
     * time-series forecasting</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>AverageWeightedQuantileLoss</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not require
     * setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring multiple
     * candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly fine-tunes your target
     * model to enhance a default objective metric, the cross-entropy loss. After fine-tuning a language model, you can
     * evaluate the quality of its generated text using different metrics. For a list of the available metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     * fine-tuning LLMs in Autopilot</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String metricName;

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * The list of available metrics supported by Autopilot and the default metric applied when you do not specify a
     * metric name explicitly depend on the problem type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MAE</code>, <code>MSE</code>, <code>R2</code>, <code>RMSE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>Accuracy</code>, <code>AUC</code>, <code>BalancedAccuracy</code>, <code>F1</code>,
     * <code>Precision</code>, <code>Recall</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>, <code>BalancedAccuracy</code>, <code>F1macro</code>,
     * <code>PrecisionMacro</code>, <code>RecallMacro</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics for classification and regression</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MSE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>F1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For image or text classification problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>Accuracy</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/text-classification-data-format-and-metric.html">Autopilot
     * metrics for text and image classification</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>Accuracy</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>RMSE</code>, <code>wQL</code>, <code>Average wQL</code>, <code>MASE</code>,
     * <code>MAPE</code>, <code>WAPE</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/timeseries-objective-metric.html">Autopilot metrics for
     * time-series forecasting</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>AverageWeightedQuantileLoss</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not require
     * setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring multiple
     * candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly fine-tunes your target
     * model to enhance a default objective metric, the cross-entropy loss. After fine-tuning a language model, you can
     * evaluate the quality of its generated text using different metrics. For a list of the available metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     * fine-tuning LLMs in Autopilot</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The name of the objective metric used to measure the predictive quality of a machine learning system.
     *        During training, the model's parameters are updated iteratively to optimize its performance based on the
     *        feedback provided by the objective metric when evaluating the model on the validation dataset.</p>
     *        <p>
     *        The list of available metrics supported by Autopilot and the default metric applied when you do not
     *        specify a metric name explicitly depend on the problem type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        List of available metrics:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Regression: <code>MAE</code>, <code>MSE</code>, <code>R2</code>, <code>RMSE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Binary classification: <code>Accuracy</code>, <code>AUC</code>, <code>BalancedAccuracy</code>,
     *        <code>F1</code>, <code>Precision</code>, <code>Recall</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Multiclass classification: <code>Accuracy</code>, <code>BalancedAccuracy</code>, <code>F1macro</code>,
     *        <code>PrecisionMacro</code>, <code>RecallMacro</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a description of each metric, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     *        >Autopilot metrics for classification and regression</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Default objective metrics:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Regression: <code>MSE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Binary classification: <code>F1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Multiclass classification: <code>Accuracy</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For image or text classification problem types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        List of available metrics: <code>Accuracy</code>
     *        </p>
     *        <p>
     *        For a description of each metric, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/text-classification-data-format-and-metric.html"
     *        >Autopilot metrics for text and image classification</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Default objective metrics: <code>Accuracy</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For time-series forecasting problem types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        List of available metrics: <code>RMSE</code>, <code>wQL</code>, <code>Average wQL</code>,
     *        <code>MASE</code>, <code>MAPE</code>, <code>WAPE</code>
     *        </p>
     *        <p>
     *        For a description of each metric, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/timeseries-objective-metric.html">Autopilot metrics
     *        for time-series forecasting</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Default objective metrics: <code>AverageWeightedQuantileLoss</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not
     *        require setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring
     *        multiple candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly
     *        fine-tunes your target model to enhance a default objective metric, the cross-entropy loss. After
     *        fine-tuning a language model, you can evaluate the quality of its generated text using different metrics.
     *        For a list of the available metrics, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     *        fine-tuning LLMs in Autopilot</a>.
     *        </p>
     *        </li>
     * @see AutoMLMetricEnum
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * The list of available metrics supported by Autopilot and the default metric applied when you do not specify a
     * metric name explicitly depend on the problem type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MAE</code>, <code>MSE</code>, <code>R2</code>, <code>RMSE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>Accuracy</code>, <code>AUC</code>, <code>BalancedAccuracy</code>, <code>F1</code>,
     * <code>Precision</code>, <code>Recall</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>, <code>BalancedAccuracy</code>, <code>F1macro</code>,
     * <code>PrecisionMacro</code>, <code>RecallMacro</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics for classification and regression</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MSE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>F1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For image or text classification problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>Accuracy</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/text-classification-data-format-and-metric.html">Autopilot
     * metrics for text and image classification</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>Accuracy</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>RMSE</code>, <code>wQL</code>, <code>Average wQL</code>, <code>MASE</code>,
     * <code>MAPE</code>, <code>WAPE</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/timeseries-objective-metric.html">Autopilot metrics for
     * time-series forecasting</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>AverageWeightedQuantileLoss</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not require
     * setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring multiple
     * candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly fine-tunes your target
     * model to enhance a default objective metric, the cross-entropy loss. After fine-tuning a language model, you can
     * evaluate the quality of its generated text using different metrics. For a list of the available metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     * fine-tuning LLMs in Autopilot</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the objective metric used to measure the predictive quality of a machine learning system.
     *         During training, the model's parameters are updated iteratively to optimize its performance based on the
     *         feedback provided by the objective metric when evaluating the model on the validation dataset.</p>
     *         <p>
     *         The list of available metrics supported by Autopilot and the default metric applied when you do not
     *         specify a metric name explicitly depend on the problem type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For tabular problem types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         List of available metrics:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Regression: <code>MAE</code>, <code>MSE</code>, <code>R2</code>, <code>RMSE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Binary classification: <code>Accuracy</code>, <code>AUC</code>, <code>BalancedAccuracy</code>,
     *         <code>F1</code>, <code>Precision</code>, <code>Recall</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Multiclass classification: <code>Accuracy</code>, <code>BalancedAccuracy</code>, <code>F1macro</code>,
     *         <code>PrecisionMacro</code>, <code>RecallMacro</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a description of each metric, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     *         >Autopilot metrics for classification and regression</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Default objective metrics:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Regression: <code>MSE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Binary classification: <code>F1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Multiclass classification: <code>Accuracy</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For image or text classification problem types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         List of available metrics: <code>Accuracy</code>
     *         </p>
     *         <p>
     *         For a description of each metric, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/text-classification-data-format-and-metric.html"
     *         >Autopilot metrics for text and image classification</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Default objective metrics: <code>Accuracy</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For time-series forecasting problem types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         List of available metrics: <code>RMSE</code>, <code>wQL</code>, <code>Average wQL</code>,
     *         <code>MASE</code>, <code>MAPE</code>, <code>WAPE</code>
     *         </p>
     *         <p>
     *         For a description of each metric, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/timeseries-objective-metric.html">Autopilot metrics
     *         for time-series forecasting</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Default objective metrics: <code>AverageWeightedQuantileLoss</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not
     *         require setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring
     *         multiple candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly
     *         fine-tunes your target model to enhance a default objective metric, the cross-entropy loss. After
     *         fine-tuning a language model, you can evaluate the quality of its generated text using different metrics.
     *         For a list of the available metrics, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     *         fine-tuning LLMs in Autopilot</a>.
     *         </p>
     *         </li>
     * @see AutoMLMetricEnum
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * The list of available metrics supported by Autopilot and the default metric applied when you do not specify a
     * metric name explicitly depend on the problem type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MAE</code>, <code>MSE</code>, <code>R2</code>, <code>RMSE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>Accuracy</code>, <code>AUC</code>, <code>BalancedAccuracy</code>, <code>F1</code>,
     * <code>Precision</code>, <code>Recall</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>, <code>BalancedAccuracy</code>, <code>F1macro</code>,
     * <code>PrecisionMacro</code>, <code>RecallMacro</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics for classification and regression</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MSE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>F1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For image or text classification problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>Accuracy</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/text-classification-data-format-and-metric.html">Autopilot
     * metrics for text and image classification</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>Accuracy</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>RMSE</code>, <code>wQL</code>, <code>Average wQL</code>, <code>MASE</code>,
     * <code>MAPE</code>, <code>WAPE</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/timeseries-objective-metric.html">Autopilot metrics for
     * time-series forecasting</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>AverageWeightedQuantileLoss</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not require
     * setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring multiple
     * candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly fine-tunes your target
     * model to enhance a default objective metric, the cross-entropy loss. After fine-tuning a language model, you can
     * evaluate the quality of its generated text using different metrics. For a list of the available metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     * fine-tuning LLMs in Autopilot</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The name of the objective metric used to measure the predictive quality of a machine learning system.
     *        During training, the model's parameters are updated iteratively to optimize its performance based on the
     *        feedback provided by the objective metric when evaluating the model on the validation dataset.</p>
     *        <p>
     *        The list of available metrics supported by Autopilot and the default metric applied when you do not
     *        specify a metric name explicitly depend on the problem type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        List of available metrics:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Regression: <code>MAE</code>, <code>MSE</code>, <code>R2</code>, <code>RMSE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Binary classification: <code>Accuracy</code>, <code>AUC</code>, <code>BalancedAccuracy</code>,
     *        <code>F1</code>, <code>Precision</code>, <code>Recall</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Multiclass classification: <code>Accuracy</code>, <code>BalancedAccuracy</code>, <code>F1macro</code>,
     *        <code>PrecisionMacro</code>, <code>RecallMacro</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a description of each metric, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     *        >Autopilot metrics for classification and regression</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Default objective metrics:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Regression: <code>MSE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Binary classification: <code>F1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Multiclass classification: <code>Accuracy</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For image or text classification problem types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        List of available metrics: <code>Accuracy</code>
     *        </p>
     *        <p>
     *        For a description of each metric, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/text-classification-data-format-and-metric.html"
     *        >Autopilot metrics for text and image classification</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Default objective metrics: <code>Accuracy</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For time-series forecasting problem types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        List of available metrics: <code>RMSE</code>, <code>wQL</code>, <code>Average wQL</code>,
     *        <code>MASE</code>, <code>MAPE</code>, <code>WAPE</code>
     *        </p>
     *        <p>
     *        For a description of each metric, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/timeseries-objective-metric.html">Autopilot metrics
     *        for time-series forecasting</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Default objective metrics: <code>AverageWeightedQuantileLoss</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not
     *        require setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring
     *        multiple candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly
     *        fine-tunes your target model to enhance a default objective metric, the cross-entropy loss. After
     *        fine-tuning a language model, you can evaluate the quality of its generated text using different metrics.
     *        For a list of the available metrics, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     *        fine-tuning LLMs in Autopilot</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMetricEnum
     */

    public AutoMLJobObjective withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * The list of available metrics supported by Autopilot and the default metric applied when you do not specify a
     * metric name explicitly depend on the problem type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MAE</code>, <code>MSE</code>, <code>R2</code>, <code>RMSE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>Accuracy</code>, <code>AUC</code>, <code>BalancedAccuracy</code>, <code>F1</code>,
     * <code>Precision</code>, <code>Recall</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>, <code>BalancedAccuracy</code>, <code>F1macro</code>,
     * <code>PrecisionMacro</code>, <code>RecallMacro</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics for classification and regression</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Regression: <code>MSE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Binary classification: <code>F1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Multiclass classification: <code>Accuracy</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For image or text classification problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>Accuracy</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/text-classification-data-format-and-metric.html">Autopilot
     * metrics for text and image classification</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>Accuracy</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting problem types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List of available metrics: <code>RMSE</code>, <code>wQL</code>, <code>Average wQL</code>, <code>MASE</code>,
     * <code>MAPE</code>, <code>WAPE</code>
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/timeseries-objective-metric.html">Autopilot metrics for
     * time-series forecasting</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Default objective metrics: <code>AverageWeightedQuantileLoss</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not require
     * setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring multiple
     * candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly fine-tunes your target
     * model to enhance a default objective metric, the cross-entropy loss. After fine-tuning a language model, you can
     * evaluate the quality of its generated text using different metrics. For a list of the available metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     * fine-tuning LLMs in Autopilot</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The name of the objective metric used to measure the predictive quality of a machine learning system.
     *        During training, the model's parameters are updated iteratively to optimize its performance based on the
     *        feedback provided by the objective metric when evaluating the model on the validation dataset.</p>
     *        <p>
     *        The list of available metrics supported by Autopilot and the default metric applied when you do not
     *        specify a metric name explicitly depend on the problem type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        List of available metrics:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Regression: <code>MAE</code>, <code>MSE</code>, <code>R2</code>, <code>RMSE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Binary classification: <code>Accuracy</code>, <code>AUC</code>, <code>BalancedAccuracy</code>,
     *        <code>F1</code>, <code>Precision</code>, <code>Recall</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Multiclass classification: <code>Accuracy</code>, <code>BalancedAccuracy</code>, <code>F1macro</code>,
     *        <code>PrecisionMacro</code>, <code>RecallMacro</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a description of each metric, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     *        >Autopilot metrics for classification and regression</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Default objective metrics:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Regression: <code>MSE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Binary classification: <code>F1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Multiclass classification: <code>Accuracy</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For image or text classification problem types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        List of available metrics: <code>Accuracy</code>
     *        </p>
     *        <p>
     *        For a description of each metric, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/text-classification-data-format-and-metric.html"
     *        >Autopilot metrics for text and image classification</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Default objective metrics: <code>Accuracy</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For time-series forecasting problem types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        List of available metrics: <code>RMSE</code>, <code>wQL</code>, <code>Average wQL</code>,
     *        <code>MASE</code>, <code>MAPE</code>, <code>WAPE</code>
     *        </p>
     *        <p>
     *        For a description of each metric, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/timeseries-objective-metric.html">Autopilot metrics
     *        for time-series forecasting</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Default objective metrics: <code>AverageWeightedQuantileLoss</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not
     *        require setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring
     *        multiple candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly
     *        fine-tunes your target model to enhance a default objective metric, the cross-entropy loss. After
     *        fine-tuning a language model, you can evaluate the quality of its generated text using different metrics.
     *        For a list of the available metrics, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     *        fine-tuning LLMs in Autopilot</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMetricEnum
     */

    public AutoMLJobObjective withMetricName(AutoMLMetricEnum metricName) {
        this.metricName = metricName.toString();
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobObjective == false)
            return false;
        AutoMLJobObjective other = (AutoMLJobObjective) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLJobObjective clone() {
        try {
            return (AutoMLJobObjective) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLJobObjectiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
