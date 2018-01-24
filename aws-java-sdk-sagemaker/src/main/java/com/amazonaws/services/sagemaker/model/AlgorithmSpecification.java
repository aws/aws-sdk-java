/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the training algorithm to use in a <a
 * href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateTrainingJob.html">CreateTrainingJob</a> request.
 * </p>
 * <p>
 * For more information about algorithms provided by Amazon SageMaker, see <a
 * href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information about using your own
 * algorithms, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/adv-topics-own-algo.html">Bring Your Own
 * Algorithms </a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AlgorithmSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlgorithmSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about using your own
     * algorithms, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos-docker-registry-paths.html">Docker
     * Registry Paths for Algorithms Provided by Amazon SageMaker </a>.
     * </p>
     */
    private String trainingImage;
    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. If an algorithm supports the
     * <code>File</code> input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage
     * Volume, and mounts the directory to docker volume for training container. If an algorithm supports the
     * <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient capacity to accomodate the data download
     * from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm
     * container use ML storage volume to also store intermediate information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed uniformly, and your training duration is
     * predictable if the input data objects size is approximately same. Amazon SageMaker does not split the files any
     * further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is
     * also skewed where one host in a training cluster is overloaded, thus becoming bottleneck in training.
     * </p>
     */
    private String trainingInputMode;

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about using your own
     * algorithms, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos-docker-registry-paths.html">Docker
     * Registry Paths for Algorithms Provided by Amazon SageMaker </a>.
     * </p>
     * 
     * @param trainingImage
     *        The registry path of the Docker image that contains the training algorithm. For information about using
     *        your own algorithms, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos-docker-registry-paths.html">Docker Registry
     *        Paths for Algorithms Provided by Amazon SageMaker </a>.
     */

    public void setTrainingImage(String trainingImage) {
        this.trainingImage = trainingImage;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about using your own
     * algorithms, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos-docker-registry-paths.html">Docker
     * Registry Paths for Algorithms Provided by Amazon SageMaker </a>.
     * </p>
     * 
     * @return The registry path of the Docker image that contains the training algorithm. For information about using
     *         your own algorithms, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos-docker-registry-paths.html">Docker Registry
     *         Paths for Algorithms Provided by Amazon SageMaker </a>.
     */

    public String getTrainingImage() {
        return this.trainingImage;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm. For information about using your own
     * algorithms, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos-docker-registry-paths.html">Docker
     * Registry Paths for Algorithms Provided by Amazon SageMaker </a>.
     * </p>
     * 
     * @param trainingImage
     *        The registry path of the Docker image that contains the training algorithm. For information about using
     *        your own algorithms, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos-docker-registry-paths.html">Docker Registry
     *        Paths for Algorithms Provided by Amazon SageMaker </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withTrainingImage(String trainingImage) {
        setTrainingImage(trainingImage);
        return this;
    }

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. If an algorithm supports the
     * <code>File</code> input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage
     * Volume, and mounts the directory to docker volume for training container. If an algorithm supports the
     * <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient capacity to accomodate the data download
     * from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm
     * container use ML storage volume to also store intermediate information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed uniformly, and your training duration is
     * predictable if the input data objects size is approximately same. Amazon SageMaker does not split the files any
     * further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is
     * also skewed where one host in a training cluster is overloaded, thus becoming bottleneck in training.
     * </p>
     * 
     * @param trainingInputMode
     *        The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support,
     *        see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. If an algorithm
     *        supports the <code>File</code> input mode, Amazon SageMaker downloads the training data from S3 to the
     *        provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an
     *        algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the
     *        container. </p>
     *        <p>
     *        In File mode, make sure you provision ML storage volume with sufficient capacity to accomodate the data
     *        download from S3. In addition to the training data, the ML storage volume also stores the output model.
     *        The algorithm container use ML storage volume to also store intermediate information, if any.
     *        </p>
     *        <p>
     *        For distributed algorithms using File mode, training data is distributed uniformly, and your training
     *        duration is predictable if the input data objects size is approximately same. Amazon SageMaker does not
     *        split the files any further for model training. If the object sizes are skewed, training won't be optimal
     *        as the data distribution is also skewed where one host in a training cluster is overloaded, thus becoming
     *        bottleneck in training.
     * @see TrainingInputMode
     */

    public void setTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
    }

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. If an algorithm supports the
     * <code>File</code> input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage
     * Volume, and mounts the directory to docker volume for training container. If an algorithm supports the
     * <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient capacity to accomodate the data download
     * from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm
     * container use ML storage volume to also store intermediate information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed uniformly, and your training duration is
     * predictable if the input data objects size is approximately same. Amazon SageMaker does not split the files any
     * further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is
     * also skewed where one host in a training cluster is overloaded, thus becoming bottleneck in training.
     * </p>
     * 
     * @return The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support,
     *         see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. If an algorithm
     *         supports the <code>File</code> input mode, Amazon SageMaker downloads the training data from S3 to the
     *         provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an
     *         algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to
     *         the container. </p>
     *         <p>
     *         In File mode, make sure you provision ML storage volume with sufficient capacity to accomodate the data
     *         download from S3. In addition to the training data, the ML storage volume also stores the output model.
     *         The algorithm container use ML storage volume to also store intermediate information, if any.
     *         </p>
     *         <p>
     *         For distributed algorithms using File mode, training data is distributed uniformly, and your training
     *         duration is predictable if the input data objects size is approximately same. Amazon SageMaker does not
     *         split the files any further for model training. If the object sizes are skewed, training won't be optimal
     *         as the data distribution is also skewed where one host in a training cluster is overloaded, thus becoming
     *         bottleneck in training.
     * @see TrainingInputMode
     */

    public String getTrainingInputMode() {
        return this.trainingInputMode;
    }

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. If an algorithm supports the
     * <code>File</code> input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage
     * Volume, and mounts the directory to docker volume for training container. If an algorithm supports the
     * <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient capacity to accomodate the data download
     * from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm
     * container use ML storage volume to also store intermediate information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed uniformly, and your training duration is
     * predictable if the input data objects size is approximately same. Amazon SageMaker does not split the files any
     * further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is
     * also skewed where one host in a training cluster is overloaded, thus becoming bottleneck in training.
     * </p>
     * 
     * @param trainingInputMode
     *        The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support,
     *        see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. If an algorithm
     *        supports the <code>File</code> input mode, Amazon SageMaker downloads the training data from S3 to the
     *        provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an
     *        algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the
     *        container. </p>
     *        <p>
     *        In File mode, make sure you provision ML storage volume with sufficient capacity to accomodate the data
     *        download from S3. In addition to the training data, the ML storage volume also stores the output model.
     *        The algorithm container use ML storage volume to also store intermediate information, if any.
     *        </p>
     *        <p>
     *        For distributed algorithms using File mode, training data is distributed uniformly, and your training
     *        duration is predictable if the input data objects size is approximately same. Amazon SageMaker does not
     *        split the files any further for model training. If the object sizes are skewed, training won't be optimal
     *        as the data distribution is also skewed where one host in a training cluster is overloaded, thus becoming
     *        bottleneck in training.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public AlgorithmSpecification withTrainingInputMode(String trainingInputMode) {
        setTrainingInputMode(trainingInputMode);
        return this;
    }

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. If an algorithm supports the
     * <code>File</code> input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage
     * Volume, and mounts the directory to docker volume for training container. If an algorithm supports the
     * <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient capacity to accomodate the data download
     * from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm
     * container use ML storage volume to also store intermediate information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed uniformly, and your training duration is
     * predictable if the input data objects size is approximately same. Amazon SageMaker does not split the files any
     * further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is
     * also skewed where one host in a training cluster is overloaded, thus becoming bottleneck in training.
     * </p>
     * 
     * @param trainingInputMode
     *        The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support,
     *        see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. If an algorithm
     *        supports the <code>File</code> input mode, Amazon SageMaker downloads the training data from S3 to the
     *        provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an
     *        algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the
     *        container. </p>
     *        <p>
     *        In File mode, make sure you provision ML storage volume with sufficient capacity to accomodate the data
     *        download from S3. In addition to the training data, the ML storage volume also stores the output model.
     *        The algorithm container use ML storage volume to also store intermediate information, if any.
     *        </p>
     *        <p>
     *        For distributed algorithms using File mode, training data is distributed uniformly, and your training
     *        duration is predictable if the input data objects size is approximately same. Amazon SageMaker does not
     *        split the files any further for model training. If the object sizes are skewed, training won't be optimal
     *        as the data distribution is also skewed where one host in a training cluster is overloaded, thus becoming
     *        bottleneck in training.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public AlgorithmSpecification withTrainingInputMode(TrainingInputMode trainingInputMode) {
        this.trainingInputMode = trainingInputMode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("TrainingInputMode: ").append(getTrainingInputMode());
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
        if (other.getTrainingInputMode() == null ^ this.getTrainingInputMode() == null)
            return false;
        if (other.getTrainingInputMode() != null && other.getTrainingInputMode().equals(this.getTrainingInputMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingImage() == null) ? 0 : getTrainingImage().hashCode());
        hashCode = prime * hashCode + ((getTrainingInputMode() == null) ? 0 : getTrainingInputMode().hashCode());
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
