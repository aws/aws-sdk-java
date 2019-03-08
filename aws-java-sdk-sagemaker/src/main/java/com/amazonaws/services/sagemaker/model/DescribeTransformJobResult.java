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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTransformJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransformJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the transform job.
     * </p>
     */
    private String transformJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     */
    private String transformJobArn;
    /**
     * <p>
     * The status of the transform job. If the transform job failed, the reason is returned in the
     * <code>FailureReason</code> field.
     * </p>
     */
    private String transformJobStatus;
    /**
     * <p>
     * If the transform job failed, <code>FailureReason</code> describes why it failed. A transform job creates a log
     * file, which includes error messages, and stores it as an Amazon S3 object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/logging-cloudwatch.html">Log Amazon SageMaker Events with
     * Amazon CloudWatch</a>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The name of the model used in the transform job.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The maximum number of parallel requests on each instance node that can be launched in a transform job. The
     * default value is 1.
     * </p>
     */
    private Integer maxConcurrentTransforms;
    /**
     * <p>
     * The maximum payload size, in MB, used in the transform job.
     * </p>
     */
    private Integer maxPayloadInMB;
    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i> <i/> is
     * a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     */
    private String batchStrategy;
    /**
     * <p>
     * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
     * </p>
     */
    private java.util.Map<String, String> environment;
    /**
     * <p>
     * Describes the dataset to be transformed and the Amazon S3 location where it is stored.
     * </p>
     */
    private TransformInput transformInput;
    /**
     * <p>
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
     * </p>
     */
    private TransformOutput transformOutput;
    /**
     * <p>
     * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
     * </p>
     */
    private TransformResources transformResources;
    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time
     * and the value of <code>TransformEndTime</code>.
     * </p>
     */
    private java.util.Date transformStartTime;
    /**
     * <p>
     * Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time
     * interval between this time and the value of <code>TransformStartTime</code>.
     * </p>
     */
    private java.util.Date transformEndTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or
     * training job.
     * </p>
     */
    private String labelingJobArn;

    /**
     * <p>
     * The name of the transform job.
     * </p>
     * 
     * @param transformJobName
     *        The name of the transform job.
     */

    public void setTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
    }

    /**
     * <p>
     * The name of the transform job.
     * </p>
     * 
     * @return The name of the transform job.
     */

    public String getTransformJobName() {
        return this.transformJobName;
    }

    /**
     * <p>
     * The name of the transform job.
     * </p>
     * 
     * @param transformJobName
     *        The name of the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withTransformJobName(String transformJobName) {
        setTransformJobName(transformJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * 
     * @param transformJobArn
     *        The Amazon Resource Name (ARN) of the transform job.
     */

    public void setTransformJobArn(String transformJobArn) {
        this.transformJobArn = transformJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transform job.
     */

    public String getTransformJobArn() {
        return this.transformJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * 
     * @param transformJobArn
     *        The Amazon Resource Name (ARN) of the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withTransformJobArn(String transformJobArn) {
        setTransformJobArn(transformJobArn);
        return this;
    }

    /**
     * <p>
     * The status of the transform job. If the transform job failed, the reason is returned in the
     * <code>FailureReason</code> field.
     * </p>
     * 
     * @param transformJobStatus
     *        The status of the transform job. If the transform job failed, the reason is returned in the
     *        <code>FailureReason</code> field.
     * @see TransformJobStatus
     */

    public void setTransformJobStatus(String transformJobStatus) {
        this.transformJobStatus = transformJobStatus;
    }

    /**
     * <p>
     * The status of the transform job. If the transform job failed, the reason is returned in the
     * <code>FailureReason</code> field.
     * </p>
     * 
     * @return The status of the transform job. If the transform job failed, the reason is returned in the
     *         <code>FailureReason</code> field.
     * @see TransformJobStatus
     */

    public String getTransformJobStatus() {
        return this.transformJobStatus;
    }

    /**
     * <p>
     * The status of the transform job. If the transform job failed, the reason is returned in the
     * <code>FailureReason</code> field.
     * </p>
     * 
     * @param transformJobStatus
     *        The status of the transform job. If the transform job failed, the reason is returned in the
     *        <code>FailureReason</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformJobStatus
     */

    public DescribeTransformJobResult withTransformJobStatus(String transformJobStatus) {
        setTransformJobStatus(transformJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the transform job. If the transform job failed, the reason is returned in the
     * <code>FailureReason</code> field.
     * </p>
     * 
     * @param transformJobStatus
     *        The status of the transform job. If the transform job failed, the reason is returned in the
     *        <code>FailureReason</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformJobStatus
     */

    public DescribeTransformJobResult withTransformJobStatus(TransformJobStatus transformJobStatus) {
        this.transformJobStatus = transformJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the transform job failed, <code>FailureReason</code> describes why it failed. A transform job creates a log
     * file, which includes error messages, and stores it as an Amazon S3 object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/logging-cloudwatch.html">Log Amazon SageMaker Events with
     * Amazon CloudWatch</a>.
     * </p>
     * 
     * @param failureReason
     *        If the transform job failed, <code>FailureReason</code> describes why it failed. A transform job creates a
     *        log file, which includes error messages, and stores it as an Amazon S3 object. For more information, see
     *        <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/logging-cloudwatch.html">Log Amazon SageMaker
     *        Events with Amazon CloudWatch</a>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the transform job failed, <code>FailureReason</code> describes why it failed. A transform job creates a log
     * file, which includes error messages, and stores it as an Amazon S3 object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/logging-cloudwatch.html">Log Amazon SageMaker Events with
     * Amazon CloudWatch</a>.
     * </p>
     * 
     * @return If the transform job failed, <code>FailureReason</code> describes why it failed. A transform job creates
     *         a log file, which includes error messages, and stores it as an Amazon S3 object. For more information,
     *         see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/logging-cloudwatch.html">Log Amazon SageMaker
     *         Events with Amazon CloudWatch</a>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the transform job failed, <code>FailureReason</code> describes why it failed. A transform job creates a log
     * file, which includes error messages, and stores it as an Amazon S3 object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/logging-cloudwatch.html">Log Amazon SageMaker Events with
     * Amazon CloudWatch</a>.
     * </p>
     * 
     * @param failureReason
     *        If the transform job failed, <code>FailureReason</code> describes why it failed. A transform job creates a
     *        log file, which includes error messages, and stores it as an Amazon S3 object. For more information, see
     *        <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/logging-cloudwatch.html">Log Amazon SageMaker
     *        Events with Amazon CloudWatch</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The name of the model used in the transform job.
     * </p>
     * 
     * @param modelName
     *        The name of the model used in the transform job.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model used in the transform job.
     * </p>
     * 
     * @return The name of the model used in the transform job.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model used in the transform job.
     * </p>
     * 
     * @param modelName
     *        The name of the model used in the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The maximum number of parallel requests on each instance node that can be launched in a transform job. The
     * default value is 1.
     * </p>
     * 
     * @param maxConcurrentTransforms
     *        The maximum number of parallel requests on each instance node that can be launched in a transform job. The
     *        default value is 1.
     */

    public void setMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        this.maxConcurrentTransforms = maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests on each instance node that can be launched in a transform job. The
     * default value is 1.
     * </p>
     * 
     * @return The maximum number of parallel requests on each instance node that can be launched in a transform job.
     *         The default value is 1.
     */

    public Integer getMaxConcurrentTransforms() {
        return this.maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests on each instance node that can be launched in a transform job. The
     * default value is 1.
     * </p>
     * 
     * @param maxConcurrentTransforms
     *        The maximum number of parallel requests on each instance node that can be launched in a transform job. The
     *        default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        setMaxConcurrentTransforms(maxConcurrentTransforms);
        return this;
    }

    /**
     * <p>
     * The maximum payload size, in MB, used in the transform job.
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum payload size, in MB, used in the transform job.
     */

    public void setMaxPayloadInMB(Integer maxPayloadInMB) {
        this.maxPayloadInMB = maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum payload size, in MB, used in the transform job.
     * </p>
     * 
     * @return The maximum payload size, in MB, used in the transform job.
     */

    public Integer getMaxPayloadInMB() {
        return this.maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum payload size, in MB, used in the transform job.
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum payload size, in MB, used in the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withMaxPayloadInMB(Integer maxPayloadInMB) {
        setMaxPayloadInMB(maxPayloadInMB);
        return this;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i> <i/> is
     * a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * 
     * @param batchStrategy
     *        Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i>
     *        <i/> is a single unit of input data that inference can be made on. For example, a single line in a CSV
     *        file is a record. </p>
     *        <p>
     *        To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>,
     *        <code>RecordIO</code>, or <code>TFRecord</code>.
     * @see BatchStrategy
     */

    public void setBatchStrategy(String batchStrategy) {
        this.batchStrategy = batchStrategy;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i> <i/> is
     * a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * 
     * @return Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i>
     *         <i/> is a single unit of input data that inference can be made on. For example, a single line in a CSV
     *         file is a record. </p>
     *         <p>
     *         To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>,
     *         <code>RecordIO</code>, or <code>TFRecord</code>.
     * @see BatchStrategy
     */

    public String getBatchStrategy() {
        return this.batchStrategy;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i> <i/> is
     * a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * 
     * @param batchStrategy
     *        Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i>
     *        <i/> is a single unit of input data that inference can be made on. For example, a single line in a CSV
     *        file is a record. </p>
     *        <p>
     *        To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>,
     *        <code>RecordIO</code>, or <code>TFRecord</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStrategy
     */

    public DescribeTransformJobResult withBatchStrategy(String batchStrategy) {
        setBatchStrategy(batchStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i> <i/> is
     * a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * 
     * @param batchStrategy
     *        Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i>
     *        <i/> is a single unit of input data that inference can be made on. For example, a single line in a CSV
     *        file is a record. </p>
     *        <p>
     *        To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>,
     *        <code>RecordIO</code>, or <code>TFRecord</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStrategy
     */

    public DescribeTransformJobResult withBatchStrategy(BatchStrategy batchStrategy) {
        this.batchStrategy = batchStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
     * </p>
     * 
     * @return The environment variables to set in the Docker container. We support up to 16 key and values entries in
     *         the map.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
     * </p>
     * 
     * @param environment
     *        The environment variables to set in the Docker container. We support up to 16 key and values entries in
     *        the map.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
     * </p>
     * 
     * @param environment
     *        The environment variables to set in the Docker container. We support up to 16 key and values entries in
     *        the map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    public DescribeTransformJobResult addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * Describes the dataset to be transformed and the Amazon S3 location where it is stored.
     * </p>
     * 
     * @param transformInput
     *        Describes the dataset to be transformed and the Amazon S3 location where it is stored.
     */

    public void setTransformInput(TransformInput transformInput) {
        this.transformInput = transformInput;
    }

    /**
     * <p>
     * Describes the dataset to be transformed and the Amazon S3 location where it is stored.
     * </p>
     * 
     * @return Describes the dataset to be transformed and the Amazon S3 location where it is stored.
     */

    public TransformInput getTransformInput() {
        return this.transformInput;
    }

    /**
     * <p>
     * Describes the dataset to be transformed and the Amazon S3 location where it is stored.
     * </p>
     * 
     * @param transformInput
     *        Describes the dataset to be transformed and the Amazon S3 location where it is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withTransformInput(TransformInput transformInput) {
        setTransformInput(transformInput);
        return this;
    }

    /**
     * <p>
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
     * </p>
     * 
     * @param transformOutput
     *        Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform
     *        job.
     */

    public void setTransformOutput(TransformOutput transformOutput) {
        this.transformOutput = transformOutput;
    }

    /**
     * <p>
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
     * </p>
     * 
     * @return Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform
     *         job.
     */

    public TransformOutput getTransformOutput() {
        return this.transformOutput;
    }

    /**
     * <p>
     * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
     * </p>
     * 
     * @param transformOutput
     *        Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withTransformOutput(TransformOutput transformOutput) {
        setTransformOutput(transformOutput);
        return this;
    }

    /**
     * <p>
     * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
     * </p>
     * 
     * @param transformResources
     *        Describes the resources, including ML instance types and ML instance count, to use for the transform job.
     */

    public void setTransformResources(TransformResources transformResources) {
        this.transformResources = transformResources;
    }

    /**
     * <p>
     * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
     * </p>
     * 
     * @return Describes the resources, including ML instance types and ML instance count, to use for the transform job.
     */

    public TransformResources getTransformResources() {
        return this.transformResources;
    }

    /**
     * <p>
     * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
     * </p>
     * 
     * @param transformResources
     *        Describes the resources, including ML instance types and ML instance count, to use for the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withTransformResources(TransformResources transformResources) {
        setTransformResources(transformResources);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the transform Job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     * 
     * @return A timestamp that shows when the transform Job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the transform Job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time
     * and the value of <code>TransformEndTime</code>.
     * </p>
     * 
     * @param transformStartTime
     *        Indicates when the transform job starts on ML instances. You are billed for the time interval between this
     *        time and the value of <code>TransformEndTime</code>.
     */

    public void setTransformStartTime(java.util.Date transformStartTime) {
        this.transformStartTime = transformStartTime;
    }

    /**
     * <p>
     * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time
     * and the value of <code>TransformEndTime</code>.
     * </p>
     * 
     * @return Indicates when the transform job starts on ML instances. You are billed for the time interval between
     *         this time and the value of <code>TransformEndTime</code>.
     */

    public java.util.Date getTransformStartTime() {
        return this.transformStartTime;
    }

    /**
     * <p>
     * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time
     * and the value of <code>TransformEndTime</code>.
     * </p>
     * 
     * @param transformStartTime
     *        Indicates when the transform job starts on ML instances. You are billed for the time interval between this
     *        time and the value of <code>TransformEndTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withTransformStartTime(java.util.Date transformStartTime) {
        setTransformStartTime(transformStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time
     * interval between this time and the value of <code>TransformStartTime</code>.
     * </p>
     * 
     * @param transformEndTime
     *        Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time
     *        interval between this time and the value of <code>TransformStartTime</code>.
     */

    public void setTransformEndTime(java.util.Date transformEndTime) {
        this.transformEndTime = transformEndTime;
    }

    /**
     * <p>
     * Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time
     * interval between this time and the value of <code>TransformStartTime</code>.
     * </p>
     * 
     * @return Indicates when the transform job has been completed, or has stopped or failed. You are billed for the
     *         time interval between this time and the value of <code>TransformStartTime</code>.
     */

    public java.util.Date getTransformEndTime() {
        return this.transformEndTime;
    }

    /**
     * <p>
     * Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time
     * interval between this time and the value of <code>TransformStartTime</code>.
     * </p>
     * 
     * @param transformEndTime
     *        Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time
     *        interval between this time and the value of <code>TransformStartTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withTransformEndTime(java.util.Date transformEndTime) {
        setTransformEndTime(transformEndTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or
     * training job.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the
     *        transform or training job.
     */

    public void setLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or
     * training job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the
     *         transform or training job.
     */

    public String getLabelingJobArn() {
        return this.labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or
     * training job.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the
     *        transform or training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransformJobResult withLabelingJobArn(String labelingJobArn) {
        setLabelingJobArn(labelingJobArn);
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
        if (getTransformJobName() != null)
            sb.append("TransformJobName: ").append(getTransformJobName()).append(",");
        if (getTransformJobArn() != null)
            sb.append("TransformJobArn: ").append(getTransformJobArn()).append(",");
        if (getTransformJobStatus() != null)
            sb.append("TransformJobStatus: ").append(getTransformJobStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getMaxConcurrentTransforms() != null)
            sb.append("MaxConcurrentTransforms: ").append(getMaxConcurrentTransforms()).append(",");
        if (getMaxPayloadInMB() != null)
            sb.append("MaxPayloadInMB: ").append(getMaxPayloadInMB()).append(",");
        if (getBatchStrategy() != null)
            sb.append("BatchStrategy: ").append(getBatchStrategy()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getTransformInput() != null)
            sb.append("TransformInput: ").append(getTransformInput()).append(",");
        if (getTransformOutput() != null)
            sb.append("TransformOutput: ").append(getTransformOutput()).append(",");
        if (getTransformResources() != null)
            sb.append("TransformResources: ").append(getTransformResources()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTransformStartTime() != null)
            sb.append("TransformStartTime: ").append(getTransformStartTime()).append(",");
        if (getTransformEndTime() != null)
            sb.append("TransformEndTime: ").append(getTransformEndTime()).append(",");
        if (getLabelingJobArn() != null)
            sb.append("LabelingJobArn: ").append(getLabelingJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTransformJobResult == false)
            return false;
        DescribeTransformJobResult other = (DescribeTransformJobResult) obj;
        if (other.getTransformJobName() == null ^ this.getTransformJobName() == null)
            return false;
        if (other.getTransformJobName() != null && other.getTransformJobName().equals(this.getTransformJobName()) == false)
            return false;
        if (other.getTransformJobArn() == null ^ this.getTransformJobArn() == null)
            return false;
        if (other.getTransformJobArn() != null && other.getTransformJobArn().equals(this.getTransformJobArn()) == false)
            return false;
        if (other.getTransformJobStatus() == null ^ this.getTransformJobStatus() == null)
            return false;
        if (other.getTransformJobStatus() != null && other.getTransformJobStatus().equals(this.getTransformJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getMaxConcurrentTransforms() == null ^ this.getMaxConcurrentTransforms() == null)
            return false;
        if (other.getMaxConcurrentTransforms() != null && other.getMaxConcurrentTransforms().equals(this.getMaxConcurrentTransforms()) == false)
            return false;
        if (other.getMaxPayloadInMB() == null ^ this.getMaxPayloadInMB() == null)
            return false;
        if (other.getMaxPayloadInMB() != null && other.getMaxPayloadInMB().equals(this.getMaxPayloadInMB()) == false)
            return false;
        if (other.getBatchStrategy() == null ^ this.getBatchStrategy() == null)
            return false;
        if (other.getBatchStrategy() != null && other.getBatchStrategy().equals(this.getBatchStrategy()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getTransformInput() == null ^ this.getTransformInput() == null)
            return false;
        if (other.getTransformInput() != null && other.getTransformInput().equals(this.getTransformInput()) == false)
            return false;
        if (other.getTransformOutput() == null ^ this.getTransformOutput() == null)
            return false;
        if (other.getTransformOutput() != null && other.getTransformOutput().equals(this.getTransformOutput()) == false)
            return false;
        if (other.getTransformResources() == null ^ this.getTransformResources() == null)
            return false;
        if (other.getTransformResources() != null && other.getTransformResources().equals(this.getTransformResources()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTransformStartTime() == null ^ this.getTransformStartTime() == null)
            return false;
        if (other.getTransformStartTime() != null && other.getTransformStartTime().equals(this.getTransformStartTime()) == false)
            return false;
        if (other.getTransformEndTime() == null ^ this.getTransformEndTime() == null)
            return false;
        if (other.getTransformEndTime() != null && other.getTransformEndTime().equals(this.getTransformEndTime()) == false)
            return false;
        if (other.getLabelingJobArn() == null ^ this.getLabelingJobArn() == null)
            return false;
        if (other.getLabelingJobArn() != null && other.getLabelingJobArn().equals(this.getLabelingJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformJobName() == null) ? 0 : getTransformJobName().hashCode());
        hashCode = prime * hashCode + ((getTransformJobArn() == null) ? 0 : getTransformJobArn().hashCode());
        hashCode = prime * hashCode + ((getTransformJobStatus() == null) ? 0 : getTransformJobStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrentTransforms() == null) ? 0 : getMaxConcurrentTransforms().hashCode());
        hashCode = prime * hashCode + ((getMaxPayloadInMB() == null) ? 0 : getMaxPayloadInMB().hashCode());
        hashCode = prime * hashCode + ((getBatchStrategy() == null) ? 0 : getBatchStrategy().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getTransformInput() == null) ? 0 : getTransformInput().hashCode());
        hashCode = prime * hashCode + ((getTransformOutput() == null) ? 0 : getTransformOutput().hashCode());
        hashCode = prime * hashCode + ((getTransformResources() == null) ? 0 : getTransformResources().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTransformStartTime() == null) ? 0 : getTransformStartTime().hashCode());
        hashCode = prime * hashCode + ((getTransformEndTime() == null) ? 0 : getTransformEndTime().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobArn() == null) ? 0 : getLabelingJobArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTransformJobResult clone() {
        try {
            return (DescribeTransformJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
