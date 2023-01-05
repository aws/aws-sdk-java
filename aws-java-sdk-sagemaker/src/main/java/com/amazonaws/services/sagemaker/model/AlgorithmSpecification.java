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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the training algorithm to use in a <a>CreateTrainingJob</a> request.
 * </p>
 * <p>
 * For more information about algorithms provided by SageMaker, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information about using your
 * own algorithms, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own
 * Algorithms with Amazon SageMaker</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AlgorithmSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlgorithmSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about docker registry
     * paths for SageMaker built-in algorithms, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Docker Registry
     * Paths and Example Code</a> in the <i>Amazon SageMaker developer guide</i>. SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information about using your custom training container, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon
     * SageMaker</a>.
     * </p>
     * <note>
     * <p>
     * You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of the
     * algorithm container to the <code>TrainingImage</code> parameter.
     * </p>
     * <p>
     * For more information, see the note in the <code>AlgorithmName</code> parameter description.
     * </p>
     * </note>
     */
    private String trainingImage;
    /**
     * <p>
     * The name of the algorithm resource to use for the training job. This must be an algorithm resource that you
     * created or subscribe to on Amazon Web Services Marketplace.
     * </p>
     * <note>
     * <p>
     * You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of the
     * algorithm container to the <code>TrainingImage</code> parameter.
     * </p>
     * <p>
     * Note that the <code>AlgorithmName</code> parameter is mutually exclusive with the <code>TrainingImage</code>
     * parameter. If you specify a value for the <code>AlgorithmName</code> parameter, you can't specify a value for
     * <code>TrainingImage</code>, and vice versa.
     * </p>
     * <p>
     * If you specify values for both parameters, the training job might break; if you don't specify any value for both
     * parameters, the training job might raise a <code>null</code> error.
     * </p>
     * </note>
     */
    private String algorithmName;

    private String trainingInputMode;
    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric name and regular expressions used to parse
     * algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     */
    private java.util.List<MetricDefinition> metricDefinitions;
    /**
     * <p>
     * To generate and save time-series metrics during training, set to <code>true</code>. The default is
     * <code>false</code> and time-series metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     */
    private Boolean enableSageMakerMetricsTimeSeries;
    /**
     * <p>
     * The <a href="https://docs.docker.com/engine/reference/builder/">entrypoint script for a Docker container</a> used
     * to run a training job. This script takes precedence over the default train processing instructions. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for more information.
     * </p>
     */
    private java.util.List<String> containerEntrypoint;
    /**
     * <p>
     * The arguments for a container used to run a training job. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for additional information.
     * </p>
     */
    private java.util.List<String> containerArguments;

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about docker registry
     * paths for SageMaker built-in algorithms, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Docker Registry
     * Paths and Example Code</a> in the <i>Amazon SageMaker developer guide</i>. SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information about using your custom training container, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon
     * SageMaker</a>.
     * </p>
     * <note>
     * <p>
     * You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of the
     * algorithm container to the <code>TrainingImage</code> parameter.
     * </p>
     * <p>
     * For more information, see the note in the <code>AlgorithmName</code> parameter description.
     * </p>
     * </note>
     * 
     * @param trainingImage
     *        The registry path of the Docker image that contains the training algorithm. For information about docker
     *        registry paths for SageMaker built-in algorithms, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Docker
     *        Registry Paths and Example Code</a> in the <i>Amazon SageMaker developer guide</i>. SageMaker supports
     *        both <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path
     *        formats. For more information about using your custom training container, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>.</p> <note>
     *        <p>
     *        You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of
     *        the algorithm container to the <code>TrainingImage</code> parameter.
     *        </p>
     *        <p>
     *        For more information, see the note in the <code>AlgorithmName</code> parameter description.
     *        </p>
     */

    public void setTrainingImage(String trainingImage) {
        this.trainingImage = trainingImage;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about docker registry
     * paths for SageMaker built-in algorithms, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Docker Registry
     * Paths and Example Code</a> in the <i>Amazon SageMaker developer guide</i>. SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information about using your custom training container, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon
     * SageMaker</a>.
     * </p>
     * <note>
     * <p>
     * You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of the
     * algorithm container to the <code>TrainingImage</code> parameter.
     * </p>
     * <p>
     * For more information, see the note in the <code>AlgorithmName</code> parameter description.
     * </p>
     * </note>
     * 
     * @return The registry path of the Docker image that contains the training algorithm. For information about docker
     *         registry paths for SageMaker built-in algorithms, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Docker
     *         Registry Paths and Example Code</a> in the <i>Amazon SageMaker developer guide</i>. SageMaker supports
     *         both <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path
     *         formats. For more information about using your custom training container, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms
     *         with Amazon SageMaker</a>.</p> <note>
     *         <p>
     *         You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI
     *         of the algorithm container to the <code>TrainingImage</code> parameter.
     *         </p>
     *         <p>
     *         For more information, see the note in the <code>AlgorithmName</code> parameter description.
     *         </p>
     */

    public String getTrainingImage() {
        return this.trainingImage;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about docker registry
     * paths for SageMaker built-in algorithms, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Docker Registry
     * Paths and Example Code</a> in the <i>Amazon SageMaker developer guide</i>. SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information about using your custom training container, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon
     * SageMaker</a>.
     * </p>
     * <note>
     * <p>
     * You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of the
     * algorithm container to the <code>TrainingImage</code> parameter.
     * </p>
     * <p>
     * For more information, see the note in the <code>AlgorithmName</code> parameter description.
     * </p>
     * </note>
     * 
     * @param trainingImage
     *        The registry path of the Docker image that contains the training algorithm. For information about docker
     *        registry paths for SageMaker built-in algorithms, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Docker
     *        Registry Paths and Example Code</a> in the <i>Amazon SageMaker developer guide</i>. SageMaker supports
     *        both <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path
     *        formats. For more information about using your custom training container, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>.</p> <note>
     *        <p>
     *        You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of
     *        the algorithm container to the <code>TrainingImage</code> parameter.
     *        </p>
     *        <p>
     *        For more information, see the note in the <code>AlgorithmName</code> parameter description.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withTrainingImage(String trainingImage) {
        setTrainingImage(trainingImage);
        return this;
    }

    /**
     * <p>
     * The name of the algorithm resource to use for the training job. This must be an algorithm resource that you
     * created or subscribe to on Amazon Web Services Marketplace.
     * </p>
     * <note>
     * <p>
     * You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of the
     * algorithm container to the <code>TrainingImage</code> parameter.
     * </p>
     * <p>
     * Note that the <code>AlgorithmName</code> parameter is mutually exclusive with the <code>TrainingImage</code>
     * parameter. If you specify a value for the <code>AlgorithmName</code> parameter, you can't specify a value for
     * <code>TrainingImage</code>, and vice versa.
     * </p>
     * <p>
     * If you specify values for both parameters, the training job might break; if you don't specify any value for both
     * parameters, the training job might raise a <code>null</code> error.
     * </p>
     * </note>
     * 
     * @param algorithmName
     *        The name of the algorithm resource to use for the training job. This must be an algorithm resource that
     *        you created or subscribe to on Amazon Web Services Marketplace.</p> <note>
     *        <p>
     *        You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of
     *        the algorithm container to the <code>TrainingImage</code> parameter.
     *        </p>
     *        <p>
     *        Note that the <code>AlgorithmName</code> parameter is mutually exclusive with the
     *        <code>TrainingImage</code> parameter. If you specify a value for the <code>AlgorithmName</code> parameter,
     *        you can't specify a value for <code>TrainingImage</code>, and vice versa.
     *        </p>
     *        <p>
     *        If you specify values for both parameters, the training job might break; if you don't specify any value
     *        for both parameters, the training job might raise a <code>null</code> error.
     *        </p>
     */

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm resource to use for the training job. This must be an algorithm resource that you
     * created or subscribe to on Amazon Web Services Marketplace.
     * </p>
     * <note>
     * <p>
     * You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of the
     * algorithm container to the <code>TrainingImage</code> parameter.
     * </p>
     * <p>
     * Note that the <code>AlgorithmName</code> parameter is mutually exclusive with the <code>TrainingImage</code>
     * parameter. If you specify a value for the <code>AlgorithmName</code> parameter, you can't specify a value for
     * <code>TrainingImage</code>, and vice versa.
     * </p>
     * <p>
     * If you specify values for both parameters, the training job might break; if you don't specify any value for both
     * parameters, the training job might raise a <code>null</code> error.
     * </p>
     * </note>
     * 
     * @return The name of the algorithm resource to use for the training job. This must be an algorithm resource that
     *         you created or subscribe to on Amazon Web Services Marketplace.</p> <note>
     *         <p>
     *         You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI
     *         of the algorithm container to the <code>TrainingImage</code> parameter.
     *         </p>
     *         <p>
     *         Note that the <code>AlgorithmName</code> parameter is mutually exclusive with the
     *         <code>TrainingImage</code> parameter. If you specify a value for the <code>AlgorithmName</code>
     *         parameter, you can't specify a value for <code>TrainingImage</code>, and vice versa.
     *         </p>
     *         <p>
     *         If you specify values for both parameters, the training job might break; if you don't specify any value
     *         for both parameters, the training job might raise a <code>null</code> error.
     *         </p>
     */

    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm resource to use for the training job. This must be an algorithm resource that you
     * created or subscribe to on Amazon Web Services Marketplace.
     * </p>
     * <note>
     * <p>
     * You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of the
     * algorithm container to the <code>TrainingImage</code> parameter.
     * </p>
     * <p>
     * Note that the <code>AlgorithmName</code> parameter is mutually exclusive with the <code>TrainingImage</code>
     * parameter. If you specify a value for the <code>AlgorithmName</code> parameter, you can't specify a value for
     * <code>TrainingImage</code>, and vice versa.
     * </p>
     * <p>
     * If you specify values for both parameters, the training job might break; if you don't specify any value for both
     * parameters, the training job might raise a <code>null</code> error.
     * </p>
     * </note>
     * 
     * @param algorithmName
     *        The name of the algorithm resource to use for the training job. This must be an algorithm resource that
     *        you created or subscribe to on Amazon Web Services Marketplace.</p> <note>
     *        <p>
     *        You must specify either the algorithm name to the <code>AlgorithmName</code> parameter or the image URI of
     *        the algorithm container to the <code>TrainingImage</code> parameter.
     *        </p>
     *        <p>
     *        Note that the <code>AlgorithmName</code> parameter is mutually exclusive with the
     *        <code>TrainingImage</code> parameter. If you specify a value for the <code>AlgorithmName</code> parameter,
     *        you can't specify a value for <code>TrainingImage</code>, and vice versa.
     *        </p>
     *        <p>
     *        If you specify values for both parameters, the training job might break; if you don't specify any value
     *        for both parameters, the training job might raise a <code>null</code> error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withAlgorithmName(String algorithmName) {
        setAlgorithmName(algorithmName);
        return this;
    }

    /**
     * @param trainingInputMode
     * @see TrainingInputMode
     */

    public void setTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
    }

    /**
     * @return
     * @see TrainingInputMode
     */

    public String getTrainingInputMode() {
        return this.trainingInputMode;
    }

    /**
     * @param trainingInputMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public AlgorithmSpecification withTrainingInputMode(String trainingInputMode) {
        setTrainingInputMode(trainingInputMode);
        return this;
    }

    /**
     * @param trainingInputMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public AlgorithmSpecification withTrainingInputMode(TrainingInputMode trainingInputMode) {
        this.trainingInputMode = trainingInputMode.toString();
        return this;
    }

    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric name and regular expressions used to parse
     * algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     * 
     * @return A list of metric definition objects. Each object specifies the metric name and regular expressions used
     *         to parse algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
     */

    public java.util.List<MetricDefinition> getMetricDefinitions() {
        return metricDefinitions;
    }

    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric name and regular expressions used to parse
     * algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     * 
     * @param metricDefinitions
     *        A list of metric definition objects. Each object specifies the metric name and regular expressions used to
     *        parse algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
     */

    public void setMetricDefinitions(java.util.Collection<MetricDefinition> metricDefinitions) {
        if (metricDefinitions == null) {
            this.metricDefinitions = null;
            return;
        }

        this.metricDefinitions = new java.util.ArrayList<MetricDefinition>(metricDefinitions);
    }

    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric name and regular expressions used to parse
     * algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDefinitions(java.util.Collection)} or {@link #withMetricDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDefinitions
     *        A list of metric definition objects. Each object specifies the metric name and regular expressions used to
     *        parse algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withMetricDefinitions(MetricDefinition... metricDefinitions) {
        if (this.metricDefinitions == null) {
            setMetricDefinitions(new java.util.ArrayList<MetricDefinition>(metricDefinitions.length));
        }
        for (MetricDefinition ele : metricDefinitions) {
            this.metricDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric name and regular expressions used to parse
     * algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     * 
     * @param metricDefinitions
     *        A list of metric definition objects. Each object specifies the metric name and regular expressions used to
     *        parse algorithm logs. SageMaker publishes each metric to Amazon CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withMetricDefinitions(java.util.Collection<MetricDefinition> metricDefinitions) {
        setMetricDefinitions(metricDefinitions);
        return this;
    }

    /**
     * <p>
     * To generate and save time-series metrics during training, set to <code>true</code>. The default is
     * <code>false</code> and time-series metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param enableSageMakerMetricsTimeSeries
     *        To generate and save time-series metrics during training, set to <code>true</code>. The default is
     *        <code>false</code> and time-series metrics aren't generated except in the following cases:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You use one of the SageMaker built-in algorithms
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You use one of the following <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     *        >Prebuilt SageMaker Docker Images</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Tensorflow (version &gt;= 1.15)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MXNet (version &gt;= 1.6)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PyTorch (version &gt;= 1.3)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        You specify at least one <a>MetricDefinition</a>
     *        </p>
     *        </li>
     */

    public void setEnableSageMakerMetricsTimeSeries(Boolean enableSageMakerMetricsTimeSeries) {
        this.enableSageMakerMetricsTimeSeries = enableSageMakerMetricsTimeSeries;
    }

    /**
     * <p>
     * To generate and save time-series metrics during training, set to <code>true</code>. The default is
     * <code>false</code> and time-series metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return To generate and save time-series metrics during training, set to <code>true</code>. The default is
     *         <code>false</code> and time-series metrics aren't generated except in the following cases:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You use one of the SageMaker built-in algorithms
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You use one of the following <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     *         >Prebuilt SageMaker Docker Images</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Tensorflow (version &gt;= 1.15)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MXNet (version &gt;= 1.6)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PyTorch (version &gt;= 1.3)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         You specify at least one <a>MetricDefinition</a>
     *         </p>
     *         </li>
     */

    public Boolean getEnableSageMakerMetricsTimeSeries() {
        return this.enableSageMakerMetricsTimeSeries;
    }

    /**
     * <p>
     * To generate and save time-series metrics during training, set to <code>true</code>. The default is
     * <code>false</code> and time-series metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param enableSageMakerMetricsTimeSeries
     *        To generate and save time-series metrics during training, set to <code>true</code>. The default is
     *        <code>false</code> and time-series metrics aren't generated except in the following cases:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You use one of the SageMaker built-in algorithms
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You use one of the following <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     *        >Prebuilt SageMaker Docker Images</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Tensorflow (version &gt;= 1.15)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MXNet (version &gt;= 1.6)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PyTorch (version &gt;= 1.3)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        You specify at least one <a>MetricDefinition</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withEnableSageMakerMetricsTimeSeries(Boolean enableSageMakerMetricsTimeSeries) {
        setEnableSageMakerMetricsTimeSeries(enableSageMakerMetricsTimeSeries);
        return this;
    }

    /**
     * <p>
     * To generate and save time-series metrics during training, set to <code>true</code>. The default is
     * <code>false</code> and time-series metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return To generate and save time-series metrics during training, set to <code>true</code>. The default is
     *         <code>false</code> and time-series metrics aren't generated except in the following cases:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You use one of the SageMaker built-in algorithms
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You use one of the following <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     *         >Prebuilt SageMaker Docker Images</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Tensorflow (version &gt;= 1.15)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MXNet (version &gt;= 1.6)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PyTorch (version &gt;= 1.3)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         You specify at least one <a>MetricDefinition</a>
     *         </p>
     *         </li>
     */

    public Boolean isEnableSageMakerMetricsTimeSeries() {
        return this.enableSageMakerMetricsTimeSeries;
    }

    /**
     * <p>
     * The <a href="https://docs.docker.com/engine/reference/builder/">entrypoint script for a Docker container</a> used
     * to run a training job. This script takes precedence over the default train processing instructions. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for more information.
     * </p>
     * 
     * @return The <a href="https://docs.docker.com/engine/reference/builder/">entrypoint script for a Docker
     *         container</a> used to run a training job. This script takes precedence over the default train processing
     *         instructions. See <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How
     *         Amazon SageMaker Runs Your Training Image</a> for more information.
     */

    public java.util.List<String> getContainerEntrypoint() {
        return containerEntrypoint;
    }

    /**
     * <p>
     * The <a href="https://docs.docker.com/engine/reference/builder/">entrypoint script for a Docker container</a> used
     * to run a training job. This script takes precedence over the default train processing instructions. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for more information.
     * </p>
     * 
     * @param containerEntrypoint
     *        The <a href="https://docs.docker.com/engine/reference/builder/">entrypoint script for a Docker
     *        container</a> used to run a training job. This script takes precedence over the default train processing
     *        instructions. See <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How
     *        Amazon SageMaker Runs Your Training Image</a> for more information.
     */

    public void setContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        if (containerEntrypoint == null) {
            this.containerEntrypoint = null;
            return;
        }

        this.containerEntrypoint = new java.util.ArrayList<String>(containerEntrypoint);
    }

    /**
     * <p>
     * The <a href="https://docs.docker.com/engine/reference/builder/">entrypoint script for a Docker container</a> used
     * to run a training job. This script takes precedence over the default train processing instructions. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for more information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerEntrypoint(java.util.Collection)} or {@link #withContainerEntrypoint(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerEntrypoint
     *        The <a href="https://docs.docker.com/engine/reference/builder/">entrypoint script for a Docker
     *        container</a> used to run a training job. This script takes precedence over the default train processing
     *        instructions. See <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How
     *        Amazon SageMaker Runs Your Training Image</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withContainerEntrypoint(String... containerEntrypoint) {
        if (this.containerEntrypoint == null) {
            setContainerEntrypoint(new java.util.ArrayList<String>(containerEntrypoint.length));
        }
        for (String ele : containerEntrypoint) {
            this.containerEntrypoint.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.docker.com/engine/reference/builder/">entrypoint script for a Docker container</a> used
     * to run a training job. This script takes precedence over the default train processing instructions. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for more information.
     * </p>
     * 
     * @param containerEntrypoint
     *        The <a href="https://docs.docker.com/engine/reference/builder/">entrypoint script for a Docker
     *        container</a> used to run a training job. This script takes precedence over the default train processing
     *        instructions. See <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How
     *        Amazon SageMaker Runs Your Training Image</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        setContainerEntrypoint(containerEntrypoint);
        return this;
    }

    /**
     * <p>
     * The arguments for a container used to run a training job. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for additional information.
     * </p>
     * 
     * @return The arguments for a container used to run a training job. See <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How
     *         Amazon SageMaker Runs Your Training Image</a> for additional information.
     */

    public java.util.List<String> getContainerArguments() {
        return containerArguments;
    }

    /**
     * <p>
     * The arguments for a container used to run a training job. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for additional information.
     * </p>
     * 
     * @param containerArguments
     *        The arguments for a container used to run a training job. See <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How
     *        Amazon SageMaker Runs Your Training Image</a> for additional information.
     */

    public void setContainerArguments(java.util.Collection<String> containerArguments) {
        if (containerArguments == null) {
            this.containerArguments = null;
            return;
        }

        this.containerArguments = new java.util.ArrayList<String>(containerArguments);
    }

    /**
     * <p>
     * The arguments for a container used to run a training job. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for additional information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerArguments(java.util.Collection)} or {@link #withContainerArguments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerArguments
     *        The arguments for a container used to run a training job. See <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How
     *        Amazon SageMaker Runs Your Training Image</a> for additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withContainerArguments(String... containerArguments) {
        if (this.containerArguments == null) {
            setContainerArguments(new java.util.ArrayList<String>(containerArguments.length));
        }
        for (String ele : containerArguments) {
            this.containerArguments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The arguments for a container used to run a training job. See <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How Amazon
     * SageMaker Runs Your Training Image</a> for additional information.
     * </p>
     * 
     * @param containerArguments
     *        The arguments for a container used to run a training job. See <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-training-algo-dockerfile.html">How
     *        Amazon SageMaker Runs Your Training Image</a> for additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withContainerArguments(java.util.Collection<String> containerArguments) {
        setContainerArguments(containerArguments);
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
        if (getTrainingImage() != null)
            sb.append("TrainingImage: ").append(getTrainingImage()).append(",");
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: ").append(getAlgorithmName()).append(",");
        if (getTrainingInputMode() != null)
            sb.append("TrainingInputMode: ").append(getTrainingInputMode()).append(",");
        if (getMetricDefinitions() != null)
            sb.append("MetricDefinitions: ").append(getMetricDefinitions()).append(",");
        if (getEnableSageMakerMetricsTimeSeries() != null)
            sb.append("EnableSageMakerMetricsTimeSeries: ").append(getEnableSageMakerMetricsTimeSeries()).append(",");
        if (getContainerEntrypoint() != null)
            sb.append("ContainerEntrypoint: ").append(getContainerEntrypoint()).append(",");
        if (getContainerArguments() != null)
            sb.append("ContainerArguments: ").append(getContainerArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmSpecification == false)
            return false;
        AlgorithmSpecification other = (AlgorithmSpecification) obj;
        if (other.getTrainingImage() == null ^ this.getTrainingImage() == null)
            return false;
        if (other.getTrainingImage() != null && other.getTrainingImage().equals(this.getTrainingImage()) == false)
            return false;
        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getTrainingInputMode() == null ^ this.getTrainingInputMode() == null)
            return false;
        if (other.getTrainingInputMode() != null && other.getTrainingInputMode().equals(this.getTrainingInputMode()) == false)
            return false;
        if (other.getMetricDefinitions() == null ^ this.getMetricDefinitions() == null)
            return false;
        if (other.getMetricDefinitions() != null && other.getMetricDefinitions().equals(this.getMetricDefinitions()) == false)
            return false;
        if (other.getEnableSageMakerMetricsTimeSeries() == null ^ this.getEnableSageMakerMetricsTimeSeries() == null)
            return false;
        if (other.getEnableSageMakerMetricsTimeSeries() != null
                && other.getEnableSageMakerMetricsTimeSeries().equals(this.getEnableSageMakerMetricsTimeSeries()) == false)
            return false;
        if (other.getContainerEntrypoint() == null ^ this.getContainerEntrypoint() == null)
            return false;
        if (other.getContainerEntrypoint() != null && other.getContainerEntrypoint().equals(this.getContainerEntrypoint()) == false)
            return false;
        if (other.getContainerArguments() == null ^ this.getContainerArguments() == null)
            return false;
        if (other.getContainerArguments() != null && other.getContainerArguments().equals(this.getContainerArguments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingImage() == null) ? 0 : getTrainingImage().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        hashCode = prime * hashCode + ((getTrainingInputMode() == null) ? 0 : getTrainingInputMode().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinitions() == null) ? 0 : getMetricDefinitions().hashCode());
        hashCode = prime * hashCode + ((getEnableSageMakerMetricsTimeSeries() == null) ? 0 : getEnableSageMakerMetricsTimeSeries().hashCode());
        hashCode = prime * hashCode + ((getContainerEntrypoint() == null) ? 0 : getContainerEntrypoint().hashCode());
        hashCode = prime * hashCode + ((getContainerArguments() == null) ? 0 : getContainerArguments().hashCode());
        return hashCode;
    }

    @Override
    public AlgorithmSpecification clone() {
        try {
            return (AlgorithmSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AlgorithmSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
