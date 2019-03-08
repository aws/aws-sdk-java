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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrainingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrainingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the training job. The name must be unique within an AWS Region in an AWS account.
     * </p>
     */
    private String trainingJobName;
    /**
     * <p>
     * Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you start
     * the learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * <p>
     * You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and value is
     * limited to 256 characters, as specified by the <code>Length Constraint</code>.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;
    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm and algorithm-specific metadata,
     * including the input mode. For more information about algorithms provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information about providing
     * your own algorithms, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using
     * Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     */
    private AlgorithmSpecification algorithmSpecification;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * <p>
     * During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket, download a
     * Docker image that contains training code, write model artifacts to an S3 bucket, write logs to Amazon CloudWatch
     * Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these tasks to an IAM role. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     */
    private String roleArn;
    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input source. <code>InputDataConfig</code>
     * describes the input data and its location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example, an algorithm might have two channels of
     * input data, <code>training_data</code> and <code>validation_data</code>. The configuration for each channel
     * provides the S3 location where the input data is stored. It also provides information about the stored data: the
     * MIME type, compression method, and whether the data is wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files from an
     * S3 bucket to a local directory in the Docker container, or makes it available as input streams.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;
    /**
     * <p>
     * Specifies the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders
     * for the artifacts.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes, to use for model training.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML storage
     * volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the training data,
     * choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed
     * training algorithms, specify an instance count greater than 1.
     * </p>
     */
    private ResourceConfig resourceConfig;
    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your training job to connect to. Control access to
     * and from your training container by configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon
     * Virtual Private Cloud</a>.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon SageMaker
     * sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120 seconds. Algorithms
     * might use this 120-second window to save the model artifacts.
     * </p>
     * <p>
     * When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided
     * by Amazon SageMaker save the intermediate results of the job. This intermediate data is a valid model artifact.
     * You can use it to create a model using the <code>CreateModel</code> API.
     * </p>
     */
    private StoppingCondition stoppingCondition;
    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If you enable network isolation for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     */
    private Boolean enableNetworkIsolation;
    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html">Protect Communications Between ML
     * Compute Instances in a Distributed Training Job</a>.
     * </p>
     */
    private Boolean enableInterContainerTrafficEncryption;

    /**
     * <p>
     * The name of the training job. The name must be unique within an AWS Region in an AWS account.
     * </p>
     * 
     * @param trainingJobName
     *        The name of the training job. The name must be unique within an AWS Region in an AWS account.
     */

    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * The name of the training job. The name must be unique within an AWS Region in an AWS account.
     * </p>
     * 
     * @return The name of the training job. The name must be unique within an AWS Region in an AWS account.
     */

    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    /**
     * <p>
     * The name of the training job. The name must be unique within an AWS Region in an AWS account.
     * </p>
     * 
     * @param trainingJobName
     *        The name of the training job. The name must be unique within an AWS Region in an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withTrainingJobName(String trainingJobName) {
        setTrainingJobName(trainingJobName);
        return this;
    }

    /**
     * <p>
     * Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you start
     * the learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * <p>
     * You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and value is
     * limited to 256 characters, as specified by the <code>Length Constraint</code>.
     * </p>
     * 
     * @return Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you
     *         start the learning process. For a list of hyperparameters for each training algorithm provided by Amazon
     *         SageMaker, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. </p>
     *         <p>
     *         You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and
     *         value is limited to 256 characters, as specified by the <code>Length Constraint</code>.
     */

    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you start
     * the learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * <p>
     * You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and value is
     * limited to 256 characters, as specified by the <code>Length Constraint</code>.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you
     *        start the learning process. For a list of hyperparameters for each training algorithm provided by Amazon
     *        SageMaker, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. </p>
     *        <p>
     *        You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and
     *        value is limited to 256 characters, as specified by the <code>Length Constraint</code>.
     */

    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you start
     * the learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see
     * <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * <p>
     * You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and value is
     * limited to 256 characters, as specified by the <code>Length Constraint</code>.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you
     *        start the learning process. For a list of hyperparameters for each training algorithm provided by Amazon
     *        SageMaker, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. </p>
     *        <p>
     *        You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and
     *        value is limited to 256 characters, as specified by the <code>Length Constraint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withHyperParameters(java.util.Map<String, String> hyperParameters) {
        setHyperParameters(hyperParameters);
        return this;
    }

    public CreateTrainingJobRequest addHyperParametersEntry(String key, String value) {
        if (null == this.hyperParameters) {
            this.hyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.hyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.hyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm and algorithm-specific metadata,
     * including the input mode. For more information about algorithms provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information about providing
     * your own algorithms, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using
     * Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * 
     * @param algorithmSpecification
     *        The registry path of the Docker image that contains the training algorithm and algorithm-specific
     *        metadata, including the input mode. For more information about algorithms provided by Amazon SageMaker,
     *        see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information
     *        about providing your own algorithms, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>.
     */

    public void setAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm and algorithm-specific metadata,
     * including the input mode. For more information about algorithms provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information about providing
     * your own algorithms, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using
     * Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * 
     * @return The registry path of the Docker image that contains the training algorithm and algorithm-specific
     *         metadata, including the input mode. For more information about algorithms provided by Amazon SageMaker,
     *         see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information
     *         about providing your own algorithms, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms
     *         with Amazon SageMaker</a>.
     */

    public AlgorithmSpecification getAlgorithmSpecification() {
        return this.algorithmSpecification;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training algorithm and algorithm-specific metadata,
     * including the input mode. For more information about algorithms provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information about providing
     * your own algorithms, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using
     * Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * 
     * @param algorithmSpecification
     *        The registry path of the Docker image that contains the training algorithm and algorithm-specific
     *        metadata, including the input mode. For more information about algorithms provided by Amazon SageMaker,
     *        see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>. For information
     *        about providing your own algorithms, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        setAlgorithmSpecification(algorithmSpecification);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * <p>
     * During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket, download a
     * Docker image that contains training code, write model artifacts to an S3 bucket, write logs to Amazon CloudWatch
     * Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these tasks to an IAM role. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your
     *        behalf. </p>
     *        <p>
     *        During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket,
     *        download a Docker image that contains training code, write model artifacts to an S3 bucket, write logs to
     *        Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these
     *        tasks to an IAM role. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *        </p>
     *        <note>
     *        <p>
     *        To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *        <code>iam:PassRole</code> permission.
     *        </p>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * <p>
     * During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket, download a
     * Docker image that contains training code, write model artifacts to an S3 bucket, write logs to Amazon CloudWatch
     * Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these tasks to an IAM role. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your
     *         behalf. </p>
     *         <p>
     *         During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket,
     *         download a Docker image that contains training code, write model artifacts to an S3 bucket, write logs to
     *         Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these
     *         tasks to an IAM role. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *         </p>
     *         <note>
     *         <p>
     *         To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *         <code>iam:PassRole</code> permission.
     *         </p>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * <p>
     * During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket, download a
     * Docker image that contains training code, write model artifacts to an S3 bucket, write logs to Amazon CloudWatch
     * Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these tasks to an IAM role. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your
     *        behalf. </p>
     *        <p>
     *        During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket,
     *        download a Docker image that contains training code, write model artifacts to an S3 bucket, write logs to
     *        Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these
     *        tasks to an IAM role. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *        </p>
     *        <note>
     *        <p>
     *        To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *        <code>iam:PassRole</code> permission.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input source. <code>InputDataConfig</code>
     * describes the input data and its location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example, an algorithm might have two channels of
     * input data, <code>training_data</code> and <code>validation_data</code>. The configuration for each channel
     * provides the S3 location where the input data is stored. It also provides information about the stored data: the
     * MIME type, compression method, and whether the data is wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files from an
     * S3 bucket to a local directory in the Docker container, or makes it available as input streams.
     * </p>
     * 
     * @return An array of <code>Channel</code> objects. Each channel is a named input source.
     *         <code>InputDataConfig</code> describes the input data and its location. </p>
     *         <p>
     *         Algorithms can accept input data from one or more channels. For example, an algorithm might have two
     *         channels of input data, <code>training_data</code> and <code>validation_data</code>. The configuration
     *         for each channel provides the S3 location where the input data is stored. It also provides information
     *         about the stored data: the MIME type, compression method, and whether the data is wrapped in RecordIO
     *         format.
     *         </p>
     *         <p>
     *         Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files
     *         from an S3 bucket to a local directory in the Docker container, or makes it available as input streams.
     */

    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input source. <code>InputDataConfig</code>
     * describes the input data and its location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example, an algorithm might have two channels of
     * input data, <code>training_data</code> and <code>validation_data</code>. The configuration for each channel
     * provides the S3 location where the input data is stored. It also provides information about the stored data: the
     * MIME type, compression method, and whether the data is wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files from an
     * S3 bucket to a local directory in the Docker container, or makes it available as input streams.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects. Each channel is a named input source.
     *        <code>InputDataConfig</code> describes the input data and its location. </p>
     *        <p>
     *        Algorithms can accept input data from one or more channels. For example, an algorithm might have two
     *        channels of input data, <code>training_data</code> and <code>validation_data</code>. The configuration for
     *        each channel provides the S3 location where the input data is stored. It also provides information about
     *        the stored data: the MIME type, compression method, and whether the data is wrapped in RecordIO format.
     *        </p>
     *        <p>
     *        Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files
     *        from an S3 bucket to a local directory in the Docker container, or makes it available as input streams.
     */

    public void setInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<Channel>(inputDataConfig);
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input source. <code>InputDataConfig</code>
     * describes the input data and its location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example, an algorithm might have two channels of
     * input data, <code>training_data</code> and <code>validation_data</code>. The configuration for each channel
     * provides the S3 location where the input data is stored. It also provides information about the stored data: the
     * MIME type, compression method, and whether the data is wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files from an
     * S3 bucket to a local directory in the Docker container, or makes it available as input streams.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects. Each channel is a named input source.
     *        <code>InputDataConfig</code> describes the input data and its location. </p>
     *        <p>
     *        Algorithms can accept input data from one or more channels. For example, an algorithm might have two
     *        channels of input data, <code>training_data</code> and <code>validation_data</code>. The configuration for
     *        each channel provides the S3 location where the input data is stored. It also provides information about
     *        the stored data: the MIME type, compression method, and whether the data is wrapped in RecordIO format.
     *        </p>
     *        <p>
     *        Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files
     *        from an S3 bucket to a local directory in the Docker container, or makes it available as input streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withInputDataConfig(Channel... inputDataConfig) {
        if (this.inputDataConfig == null) {
            setInputDataConfig(new java.util.ArrayList<Channel>(inputDataConfig.length));
        }
        for (Channel ele : inputDataConfig) {
            this.inputDataConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input source. <code>InputDataConfig</code>
     * describes the input data and its location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example, an algorithm might have two channels of
     * input data, <code>training_data</code> and <code>validation_data</code>. The configuration for each channel
     * provides the S3 location where the input data is stored. It also provides information about the stored data: the
     * MIME type, compression method, and whether the data is wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files from an
     * S3 bucket to a local directory in the Docker container, or makes it available as input streams.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects. Each channel is a named input source.
     *        <code>InputDataConfig</code> describes the input data and its location. </p>
     *        <p>
     *        Algorithms can accept input data from one or more channels. For example, an algorithm might have two
     *        channels of input data, <code>training_data</code> and <code>validation_data</code>. The configuration for
     *        each channel provides the S3 location where the input data is stored. It also provides information about
     *        the stored data: the MIME type, compression method, and whether the data is wrapped in RecordIO format.
     *        </p>
     *        <p>
     *        Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files
     *        from an S3 bucket to a local directory in the Docker container, or makes it available as input streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders
     * for the artifacts.
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates
     *        subfolders for the artifacts.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders
     * for the artifacts.
     * </p>
     * 
     * @return Specifies the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates
     *         subfolders for the artifacts.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders
     * for the artifacts.
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates
     *        subfolders for the artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes, to use for model training.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML storage
     * volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the training data,
     * choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed
     * training algorithms, specify an instance count greater than 1.
     * </p>
     * 
     * @param resourceConfig
     *        The resources, including the ML compute instances and ML storage volumes, to use for model training. </p>
     *        <p>
     *        ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML
     *        storage volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the
     *        training data, choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm
     *        specification. For distributed training algorithms, specify an instance count greater than 1.
     */

    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes, to use for model training.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML storage
     * volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the training data,
     * choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed
     * training algorithms, specify an instance count greater than 1.
     * </p>
     * 
     * @return The resources, including the ML compute instances and ML storage volumes, to use for model training. </p>
     *         <p>
     *         ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML
     *         storage volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the
     *         training data, choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm
     *         specification. For distributed training algorithms, specify an instance count greater than 1.
     */

    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes, to use for model training.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML storage
     * volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the training data,
     * choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed
     * training algorithms, specify an instance count greater than 1.
     * </p>
     * 
     * @param resourceConfig
     *        The resources, including the ML compute instances and ML storage volumes, to use for model training. </p>
     *        <p>
     *        ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML
     *        storage volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the
     *        training data, choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm
     *        specification. For distributed training algorithms, specify an instance count greater than 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withResourceConfig(ResourceConfig resourceConfig) {
        setResourceConfig(resourceConfig);
        return this;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your training job to connect to. Control access to
     * and from your training container by configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon
     * Virtual Private Cloud</a>.
     * </p>
     * 
     * @param vpcConfig
     *        A <a>VpcConfig</a> object that specifies the VPC that you want your training job to connect to. Control
     *        access to and from your training container by configuring the VPC. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an
     *        Amazon Virtual Private Cloud</a>.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your training job to connect to. Control access to
     * and from your training container by configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon
     * Virtual Private Cloud</a>.
     * </p>
     * 
     * @return A <a>VpcConfig</a> object that specifies the VPC that you want your training job to connect to. Control
     *         access to and from your training container by configuring the VPC. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an
     *         Amazon Virtual Private Cloud</a>.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your training job to connect to. Control access to
     * and from your training container by configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an Amazon
     * Virtual Private Cloud</a>.
     * </p>
     * 
     * @param vpcConfig
     *        A <a>VpcConfig</a> object that specifies the VPC that you want your training job to connect to. Control
     *        access to and from your training container by configuring the VPC. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect Training Jobs by Using an
     *        Amazon Virtual Private Cloud</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon SageMaker
     * sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120 seconds. Algorithms
     * might use this 120-second window to save the model artifacts.
     * </p>
     * <p>
     * When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided
     * by Amazon SageMaker save the intermediate results of the job. This intermediate data is a valid model artifact.
     * You can use it to create a model using the <code>CreateModel</code> API.
     * </p>
     * 
     * @param stoppingCondition
     *        Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon
     *        SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120
     *        seconds. Algorithms might use this 120-second window to save the model artifacts. </p>
     *        <p>
     *        When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms
     *        provided by Amazon SageMaker save the intermediate results of the job. This intermediate data is a valid
     *        model artifact. You can use it to create a model using the <code>CreateModel</code> API.
     */

    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon SageMaker
     * sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120 seconds. Algorithms
     * might use this 120-second window to save the model artifacts.
     * </p>
     * <p>
     * When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided
     * by Amazon SageMaker save the intermediate results of the job. This intermediate data is a valid model artifact.
     * You can use it to create a model using the <code>CreateModel</code> API.
     * </p>
     * 
     * @return Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon
     *         SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120
     *         seconds. Algorithms might use this 120-second window to save the model artifacts. </p>
     *         <p>
     *         When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms
     *         provided by Amazon SageMaker save the intermediate results of the job. This intermediate data is a valid
     *         model artifact. You can use it to create a model using the <code>CreateModel</code> API.
     */

    public StoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon SageMaker
     * sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120 seconds. Algorithms
     * might use this 120-second window to save the model artifacts.
     * </p>
     * <p>
     * When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided
     * by Amazon SageMaker save the intermediate results of the job. This intermediate data is a valid model artifact.
     * You can use it to create a model using the <code>CreateModel</code> API.
     * </p>
     * 
     * @param stoppingCondition
     *        Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon
     *        SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination for 120
     *        seconds. Algorithms might use this 120-second window to save the model artifacts. </p>
     *        <p>
     *        When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms
     *        provided by Amazon SageMaker save the intermediate results of the job. This intermediate data is a valid
     *        model artifact. You can use it to create a model using the <code>CreateModel</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withStoppingCondition(StoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key-value pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If you enable network isolation for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     * 
     * @param enableNetworkIsolation
     *        Isolates the training container. No inbound or outbound network calls can be made, except for calls
     *        between peers within a training cluster for distributed training. If you enable network isolation for
     *        training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and
     *        model artifacts through the specified VPC, but the training container does not have network access.</p>
     *        <note>
     *        <p>
     *        The Semantic Segmentation built-in algorithm does not support network isolation.
     *        </p>
     */

    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If you enable network isolation for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     * 
     * @return Isolates the training container. No inbound or outbound network calls can be made, except for calls
     *         between peers within a training cluster for distributed training. If you enable network isolation for
     *         training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and
     *         model artifacts through the specified VPC, but the training container does not have network access.</p>
     *         <note>
     *         <p>
     *         The Semantic Segmentation built-in algorithm does not support network isolation.
     *         </p>
     */

    public Boolean getEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If you enable network isolation for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     * 
     * @param enableNetworkIsolation
     *        Isolates the training container. No inbound or outbound network calls can be made, except for calls
     *        between peers within a training cluster for distributed training. If you enable network isolation for
     *        training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and
     *        model artifacts through the specified VPC, but the training container does not have network access.</p>
     *        <note>
     *        <p>
     *        The Semantic Segmentation built-in algorithm does not support network isolation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        setEnableNetworkIsolation(enableNetworkIsolation);
        return this;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers
     * within a training cluster for distributed training. If you enable network isolation for training jobs that are
     * configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the
     * specified VPC, but the training container does not have network access.
     * </p>
     * <note>
     * <p>
     * The Semantic Segmentation built-in algorithm does not support network isolation.
     * </p>
     * </note>
     * 
     * @return Isolates the training container. No inbound or outbound network calls can be made, except for calls
     *         between peers within a training cluster for distributed training. If you enable network isolation for
     *         training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and
     *         model artifacts through the specified VPC, but the training container does not have network access.</p>
     *         <note>
     *         <p>
     *         The Semantic Segmentation built-in algorithm does not support network isolation.
     *         </p>
     */

    public Boolean isEnableNetworkIsolation() {
        return this.enableNetworkIsolation;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html">Protect Communications Between ML
     * Compute Instances in a Distributed Training Job</a>.
     * </p>
     * 
     * @param enableInterContainerTrafficEncryption
     *        To encrypt all communications between ML compute instances in distributed training, choose
     *        <code>True</code>. Encryption provides greater security for distributed training, but training might take
     *        longer. How long it takes depends on the amount of communication between compute instances, especially if
     *        you use a deep learning algorithm in distributed training. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html">Protect Communications Between
     *        ML Compute Instances in a Distributed Training Job</a>.
     */

    public void setEnableInterContainerTrafficEncryption(Boolean enableInterContainerTrafficEncryption) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html">Protect Communications Between ML
     * Compute Instances in a Distributed Training Job</a>.
     * </p>
     * 
     * @return To encrypt all communications between ML compute instances in distributed training, choose
     *         <code>True</code>. Encryption provides greater security for distributed training, but training might take
     *         longer. How long it takes depends on the amount of communication between compute instances, especially if
     *         you use a deep learning algorithm in distributed training. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html">Protect Communications Between
     *         ML Compute Instances in a Distributed Training Job</a>.
     */

    public Boolean getEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html">Protect Communications Between ML
     * Compute Instances in a Distributed Training Job</a>.
     * </p>
     * 
     * @param enableInterContainerTrafficEncryption
     *        To encrypt all communications between ML compute instances in distributed training, choose
     *        <code>True</code>. Encryption provides greater security for distributed training, but training might take
     *        longer. How long it takes depends on the amount of communication between compute instances, especially if
     *        you use a deep learning algorithm in distributed training. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html">Protect Communications Between
     *        ML Compute Instances in a Distributed Training Job</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrainingJobRequest withEnableInterContainerTrafficEncryption(Boolean enableInterContainerTrafficEncryption) {
        setEnableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption);
        return this;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed training, choose <code>True</code>.
     * Encryption provides greater security for distributed training, but training might take longer. How long it takes
     * depends on the amount of communication between compute instances, especially if you use a deep learning algorithm
     * in distributed training. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html">Protect Communications Between ML
     * Compute Instances in a Distributed Training Job</a>.
     * </p>
     * 
     * @return To encrypt all communications between ML compute instances in distributed training, choose
     *         <code>True</code>. Encryption provides greater security for distributed training, but training might take
     *         longer. How long it takes depends on the amount of communication between compute instances, especially if
     *         you use a deep learning algorithm in distributed training. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html">Protect Communications Between
     *         ML Compute Instances in a Distributed Training Job</a>.
     */

    public Boolean isEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption;
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
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: ").append(getTrainingJobName()).append(",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: ").append(getHyperParameters()).append(",");
        if (getAlgorithmSpecification() != null)
            sb.append("AlgorithmSpecification: ").append(getAlgorithmSpecification()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: ").append(getResourceConfig()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: ").append(getEnableNetworkIsolation()).append(",");
        if (getEnableInterContainerTrafficEncryption() != null)
            sb.append("EnableInterContainerTrafficEncryption: ").append(getEnableInterContainerTrafficEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrainingJobRequest == false)
            return false;
        CreateTrainingJobRequest other = (CreateTrainingJobRequest) obj;
        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        if (other.getHyperParameters() == null ^ this.getHyperParameters() == null)
            return false;
        if (other.getHyperParameters() != null && other.getHyperParameters().equals(this.getHyperParameters()) == false)
            return false;
        if (other.getAlgorithmSpecification() == null ^ this.getAlgorithmSpecification() == null)
            return false;
        if (other.getAlgorithmSpecification() != null && other.getAlgorithmSpecification().equals(this.getAlgorithmSpecification()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getResourceConfig() == null ^ this.getResourceConfig() == null)
            return false;
        if (other.getResourceConfig() != null && other.getResourceConfig().equals(this.getResourceConfig()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEnableNetworkIsolation() == null ^ this.getEnableNetworkIsolation() == null)
            return false;
        if (other.getEnableNetworkIsolation() != null && other.getEnableNetworkIsolation().equals(this.getEnableNetworkIsolation()) == false)
            return false;
        if (other.getEnableInterContainerTrafficEncryption() == null ^ this.getEnableInterContainerTrafficEncryption() == null)
            return false;
        if (other.getEnableInterContainerTrafficEncryption() != null
                && other.getEnableInterContainerTrafficEncryption().equals(this.getEnableInterContainerTrafficEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        hashCode = prime * hashCode + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmSpecification() == null) ? 0 : getAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEnableNetworkIsolation() == null) ? 0 : getEnableNetworkIsolation().hashCode());
        hashCode = prime * hashCode + ((getEnableInterContainerTrafficEncryption() == null) ? 0 : getEnableInterContainerTrafficEncryption().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrainingJobRequest clone() {
        return (CreateTrainingJobRequest) super.clone();
    }

}
