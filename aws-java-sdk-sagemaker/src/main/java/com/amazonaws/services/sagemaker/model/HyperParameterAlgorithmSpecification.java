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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies which training algorithm to use for training jobs that a hyperparameter tuning job launches and the metrics
 * to monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterAlgorithmSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterAlgorithmSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about Docker registry
     * paths for built-in algorithms, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Algorithms
     * Provided by Amazon SageMaker: Common Parameters</a>. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own
     * Algorithms with Amazon SageMaker</a>.
     * </p>
     */
    private String trainingImage;
    /**
     * <p>
     * The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads the
     * training data from Amazon S3 to the storage volume that is attached to the training instance and mounts the
     * directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker streams data
     * directly from Amazon S3 to the container.
     * </p>
     * <p>
     * If you specify File mode, make sure that you provision the storage volume that is attached to the training
     * instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model artifacts,
     * and intermediate information.
     * </p>
     * <p/>
     * <p>
     * For more information about input modes, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     */
    private String trainingInputMode;
    /**
     * <p>
     * The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for this
     * parameter, do not specify a value for <code>TrainingImage</code>.
     * </p>
     */
    private String algorithmName;
    /**
     * <p>
     * An array of <a>MetricDefinition</a> objects that specify the metrics that the algorithm emits.
     * </p>
     */
    private java.util.List<MetricDefinition> metricDefinitions;

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about Docker registry
     * paths for built-in algorithms, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Algorithms
     * Provided by Amazon SageMaker: Common Parameters</a>. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own
     * Algorithms with Amazon SageMaker</a>.
     * </p>
     * 
     * @param trainingImage
     *        The registry path of the Docker image that contains the training algorithm. For information about Docker
     *        registry paths for built-in algorithms, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     *        >Algorithms Provided by Amazon SageMaker: Common Parameters</a>. Amazon SageMaker supports both
     *        <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>.
     */

    public void setTrainingImage(String trainingImage) {
        this.trainingImage = trainingImage;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about Docker registry
     * paths for built-in algorithms, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Algorithms
     * Provided by Amazon SageMaker: Common Parameters</a>. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own
     * Algorithms with Amazon SageMaker</a>.
     * </p>
     * 
     * @return The registry path of the Docker image that contains the training algorithm. For information about Docker
     *         registry paths for built-in algorithms, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     *         >Algorithms Provided by Amazon SageMaker: Common Parameters</a>. Amazon SageMaker supports both
     *         <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms
     *         with Amazon SageMaker</a>.
     */

    public String getTrainingImage() {
        return this.trainingImage;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about Docker registry
     * paths for built-in algorithms, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html">Algorithms
     * Provided by Amazon SageMaker: Common Parameters</a>. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own
     * Algorithms with Amazon SageMaker</a>.
     * </p>
     * 
     * @param trainingImage
     *        The registry path of the Docker image that contains the training algorithm. For information about Docker
     *        registry paths for built-in algorithms, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     *        >Algorithms Provided by Amazon SageMaker: Common Parameters</a>. Amazon SageMaker supports both
     *        <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterAlgorithmSpecification withTrainingImage(String trainingImage) {
        setTrainingImage(trainingImage);
        return this;
    }

    /**
     * <p>
     * The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads the
     * training data from Amazon S3 to the storage volume that is attached to the training instance and mounts the
     * directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker streams data
     * directly from Amazon S3 to the container.
     * </p>
     * <p>
     * If you specify File mode, make sure that you provision the storage volume that is attached to the training
     * instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model artifacts,
     * and intermediate information.
     * </p>
     * <p/>
     * <p>
     * For more information about input modes, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * 
     * @param trainingInputMode
     *        The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads
     *        the training data from Amazon S3 to the storage volume that is attached to the training instance and
     *        mounts the directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker
     *        streams data directly from Amazon S3 to the container. </p>
     *        <p>
     *        If you specify File mode, make sure that you provision the storage volume that is attached to the training
     *        instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model
     *        artifacts, and intermediate information.
     *        </p>
     *        <p/>
     *        <p>
     *        For more information about input modes, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * @see TrainingInputMode
     */

    public void setTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
    }

    /**
     * <p>
     * The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads the
     * training data from Amazon S3 to the storage volume that is attached to the training instance and mounts the
     * directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker streams data
     * directly from Amazon S3 to the container.
     * </p>
     * <p>
     * If you specify File mode, make sure that you provision the storage volume that is attached to the training
     * instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model artifacts,
     * and intermediate information.
     * </p>
     * <p/>
     * <p>
     * For more information about input modes, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * 
     * @return The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads
     *         the training data from Amazon S3 to the storage volume that is attached to the training instance and
     *         mounts the directory to the Docker volume for the training container. In Pipe input mode, Amazon
     *         SageMaker streams data directly from Amazon S3 to the container. </p>
     *         <p>
     *         If you specify File mode, make sure that you provision the storage volume that is attached to the
     *         training instance with enough capacity to accommodate the training data downloaded from Amazon S3, the
     *         model artifacts, and intermediate information.
     *         </p>
     *         <p/>
     *         <p>
     *         For more information about input modes, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * @see TrainingInputMode
     */

    public String getTrainingInputMode() {
        return this.trainingInputMode;
    }

    /**
     * <p>
     * The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads the
     * training data from Amazon S3 to the storage volume that is attached to the training instance and mounts the
     * directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker streams data
     * directly from Amazon S3 to the container.
     * </p>
     * <p>
     * If you specify File mode, make sure that you provision the storage volume that is attached to the training
     * instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model artifacts,
     * and intermediate information.
     * </p>
     * <p/>
     * <p>
     * For more information about input modes, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * 
     * @param trainingInputMode
     *        The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads
     *        the training data from Amazon S3 to the storage volume that is attached to the training instance and
     *        mounts the directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker
     *        streams data directly from Amazon S3 to the container. </p>
     *        <p>
     *        If you specify File mode, make sure that you provision the storage volume that is attached to the training
     *        instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model
     *        artifacts, and intermediate information.
     *        </p>
     *        <p/>
     *        <p>
     *        For more information about input modes, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public HyperParameterAlgorithmSpecification withTrainingInputMode(String trainingInputMode) {
        setTrainingInputMode(trainingInputMode);
        return this;
    }

    /**
     * <p>
     * The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads the
     * training data from Amazon S3 to the storage volume that is attached to the training instance and mounts the
     * directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker streams data
     * directly from Amazon S3 to the container.
     * </p>
     * <p>
     * If you specify File mode, make sure that you provision the storage volume that is attached to the training
     * instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model artifacts,
     * and intermediate information.
     * </p>
     * <p/>
     * <p>
     * For more information about input modes, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * 
     * @param trainingInputMode
     *        The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads
     *        the training data from Amazon S3 to the storage volume that is attached to the training instance and
     *        mounts the directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker
     *        streams data directly from Amazon S3 to the container. </p>
     *        <p>
     *        If you specify File mode, make sure that you provision the storage volume that is attached to the training
     *        instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model
     *        artifacts, and intermediate information.
     *        </p>
     *        <p/>
     *        <p>
     *        For more information about input modes, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public HyperParameterAlgorithmSpecification withTrainingInputMode(TrainingInputMode trainingInputMode) {
        this.trainingInputMode = trainingInputMode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for this
     * parameter, do not specify a value for <code>TrainingImage</code>.
     * </p>
     * 
     * @param algorithmName
     *        The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for
     *        this parameter, do not specify a value for <code>TrainingImage</code>.
     */

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for this
     * parameter, do not specify a value for <code>TrainingImage</code>.
     * </p>
     * 
     * @return The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for
     *         this parameter, do not specify a value for <code>TrainingImage</code>.
     */

    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * <p>
     * The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for this
     * parameter, do not specify a value for <code>TrainingImage</code>.
     * </p>
     * 
     * @param algorithmName
     *        The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for
     *        this parameter, do not specify a value for <code>TrainingImage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterAlgorithmSpecification withAlgorithmName(String algorithmName) {
        setAlgorithmName(algorithmName);
        return this;
    }

    /**
     * <p>
     * An array of <a>MetricDefinition</a> objects that specify the metrics that the algorithm emits.
     * </p>
     * 
     * @return An array of <a>MetricDefinition</a> objects that specify the metrics that the algorithm emits.
     */

    public java.util.List<MetricDefinition> getMetricDefinitions() {
        return metricDefinitions;
    }

    /**
     * <p>
     * An array of <a>MetricDefinition</a> objects that specify the metrics that the algorithm emits.
     * </p>
     * 
     * @param metricDefinitions
     *        An array of <a>MetricDefinition</a> objects that specify the metrics that the algorithm emits.
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
     * An array of <a>MetricDefinition</a> objects that specify the metrics that the algorithm emits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDefinitions(java.util.Collection)} or {@link #withMetricDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDefinitions
     *        An array of <a>MetricDefinition</a> objects that specify the metrics that the algorithm emits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterAlgorithmSpecification withMetricDefinitions(MetricDefinition... metricDefinitions) {
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
     * An array of <a>MetricDefinition</a> objects that specify the metrics that the algorithm emits.
     * </p>
     * 
     * @param metricDefinitions
     *        An array of <a>MetricDefinition</a> objects that specify the metrics that the algorithm emits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterAlgorithmSpecification withMetricDefinitions(java.util.Collection<MetricDefinition> metricDefinitions) {
        setMetricDefinitions(metricDefinitions);
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
        if (getTrainingInputMode() != null)
            sb.append("TrainingInputMode: ").append(getTrainingInputMode()).append(",");
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: ").append(getAlgorithmName()).append(",");
        if (getMetricDefinitions() != null)
            sb.append("MetricDefinitions: ").append(getMetricDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterAlgorithmSpecification == false)
            return false;
        HyperParameterAlgorithmSpecification other = (HyperParameterAlgorithmSpecification) obj;
        if (other.getTrainingImage() == null ^ this.getTrainingImage() == null)
            return false;
        if (other.getTrainingImage() != null && other.getTrainingImage().equals(this.getTrainingImage()) == false)
            return false;
        if (other.getTrainingInputMode() == null ^ this.getTrainingInputMode() == null)
            return false;
        if (other.getTrainingInputMode() != null && other.getTrainingInputMode().equals(this.getTrainingInputMode()) == false)
            return false;
        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getMetricDefinitions() == null ^ this.getMetricDefinitions() == null)
            return false;
        if (other.getMetricDefinitions() != null && other.getMetricDefinitions().equals(this.getMetricDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingImage() == null) ? 0 : getTrainingImage().hashCode());
        hashCode = prime * hashCode + ((getTrainingInputMode() == null) ? 0 : getTrainingInputMode().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinitions() == null) ? 0 : getMetricDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterAlgorithmSpecification clone() {
        try {
            return (HyperParameterAlgorithmSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterAlgorithmSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
