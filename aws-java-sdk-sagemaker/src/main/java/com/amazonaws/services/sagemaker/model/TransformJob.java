/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A batch transform job. For information about SageMaker batch transform, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html">Use Batch Transform</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TransformJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformJob implements Serializable, Cloneable, StructuredPojo {

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
     * The status of the transform job.
     * </p>
     * <p>
     * Transform job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The job is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The transform job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTransformJob</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The transform job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The transform job has stopped.
     * </p>
     * </li>
     * </ul>
     */
    private String transformJobStatus;
    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The name of the model associated with the transform job.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. If
     * <code>MaxConcurrentTransforms</code> is set to 0 or left unset, SageMaker checks the optional
     * execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters endpoint is
     * not enabled, the default value is 1. For built-in algorithms, you don't need to set a value for
     * <code>MaxConcurrentTransforms</code>.
     * </p>
     */
    private Integer maxConcurrentTransforms;

    private ModelClientConfig modelClientConfig;
    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without metadata). The
     * value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a single record. To estimate
     * the size of a record in MB, divide the size of your dataset by the number of records. To ensure that the records
     * fit within the maximum payload size, we recommend using a slightly larger value. The default value is 6 MB. For
     * cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value
     * to 0. This feature works only in supported algorithms. Currently, SageMaker built-in algorithms do not support
     * HTTP chunked encoding.
     * </p>
     */
    private Integer maxPayloadInMB;
    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a single
     * unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     */
    private String batchStrategy;
    /**
     * <p>
     * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
     * </p>
     */
    private java.util.Map<String, String> environment;

    private TransformInput transformInput;

    private TransformOutput transformOutput;

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
     * The Amazon Resource Name (ARN) of the labeling job that created the transform job.
     * </p>
     */
    private String labelingJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job that created the transform job.
     * </p>
     */
    private String autoMLJobArn;

    private DataProcessing dataProcessing;

    private ExperimentConfig experimentConfig;
    /**
     * <p>
     * A list of tags associated with the transform job.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public TransformJob withTransformJobName(String transformJobName) {
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

    public TransformJob withTransformJobArn(String transformJobArn) {
        setTransformJobArn(transformJobArn);
        return this;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * Transform job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The job is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The transform job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTransformJob</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The transform job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The transform job has stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transformJobStatus
     *        The status of the transform job.</p>
     *        <p>
     *        Transform job statuses are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The job is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The job has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The transform job has failed. To see the reason for the failure, see the
     *        <code>FailureReason</code> field in the response to a <code>DescribeTransformJob</code> call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - The transform job is stopping.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - The transform job has stopped.
     *        </p>
     *        </li>
     * @see TransformJobStatus
     */

    public void setTransformJobStatus(String transformJobStatus) {
        this.transformJobStatus = transformJobStatus;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * Transform job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The job is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The transform job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTransformJob</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The transform job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The transform job has stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the transform job.</p>
     *         <p>
     *         Transform job statuses are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>InProgress</code> - The job is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Completed</code> - The job has completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The transform job has failed. To see the reason for the failure, see the
     *         <code>FailureReason</code> field in the response to a <code>DescribeTransformJob</code> call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopping</code> - The transform job is stopping.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopped</code> - The transform job has stopped.
     *         </p>
     *         </li>
     * @see TransformJobStatus
     */

    public String getTransformJobStatus() {
        return this.transformJobStatus;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * Transform job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The job is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The transform job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTransformJob</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The transform job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The transform job has stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transformJobStatus
     *        The status of the transform job.</p>
     *        <p>
     *        Transform job statuses are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The job is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The job has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The transform job has failed. To see the reason for the failure, see the
     *        <code>FailureReason</code> field in the response to a <code>DescribeTransformJob</code> call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - The transform job is stopping.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - The transform job has stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformJobStatus
     */

    public TransformJob withTransformJobStatus(String transformJobStatus) {
        setTransformJobStatus(transformJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * Transform job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The job is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The transform job has failed. To see the reason for the failure, see the
     * <code>FailureReason</code> field in the response to a <code>DescribeTransformJob</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The transform job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The transform job has stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transformJobStatus
     *        The status of the transform job.</p>
     *        <p>
     *        Transform job statuses are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The job is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The job has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The transform job has failed. To see the reason for the failure, see the
     *        <code>FailureReason</code> field in the response to a <code>DescribeTransformJob</code> call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - The transform job is stopping.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - The transform job has stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformJobStatus
     */

    public TransformJob withTransformJobStatus(TransformJobStatus transformJobStatus) {
        this.transformJobStatus = transformJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the transform job failed, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * 
     * @return If the transform job failed, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the transform job failed, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The name of the model associated with the transform job.
     * </p>
     * 
     * @param modelName
     *        The name of the model associated with the transform job.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model associated with the transform job.
     * </p>
     * 
     * @return The name of the model associated with the transform job.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model associated with the transform job.
     * </p>
     * 
     * @param modelName
     *        The name of the model associated with the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. If
     * <code>MaxConcurrentTransforms</code> is set to 0 or left unset, SageMaker checks the optional
     * execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters endpoint is
     * not enabled, the default value is 1. For built-in algorithms, you don't need to set a value for
     * <code>MaxConcurrentTransforms</code>.
     * </p>
     * 
     * @param maxConcurrentTransforms
     *        The maximum number of parallel requests that can be sent to each instance in a transform job. If
     *        <code>MaxConcurrentTransforms</code> is set to 0 or left unset, SageMaker checks the optional
     *        execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters
     *        endpoint is not enabled, the default value is 1. For built-in algorithms, you don't need to set a value
     *        for <code>MaxConcurrentTransforms</code>.
     */

    public void setMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        this.maxConcurrentTransforms = maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. If
     * <code>MaxConcurrentTransforms</code> is set to 0 or left unset, SageMaker checks the optional
     * execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters endpoint is
     * not enabled, the default value is 1. For built-in algorithms, you don't need to set a value for
     * <code>MaxConcurrentTransforms</code>.
     * </p>
     * 
     * @return The maximum number of parallel requests that can be sent to each instance in a transform job. If
     *         <code>MaxConcurrentTransforms</code> is set to 0 or left unset, SageMaker checks the optional
     *         execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters
     *         endpoint is not enabled, the default value is 1. For built-in algorithms, you don't need to set a value
     *         for <code>MaxConcurrentTransforms</code>.
     */

    public Integer getMaxConcurrentTransforms() {
        return this.maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. If
     * <code>MaxConcurrentTransforms</code> is set to 0 or left unset, SageMaker checks the optional
     * execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters endpoint is
     * not enabled, the default value is 1. For built-in algorithms, you don't need to set a value for
     * <code>MaxConcurrentTransforms</code>.
     * </p>
     * 
     * @param maxConcurrentTransforms
     *        The maximum number of parallel requests that can be sent to each instance in a transform job. If
     *        <code>MaxConcurrentTransforms</code> is set to 0 or left unset, SageMaker checks the optional
     *        execution-parameters to determine the settings for your chosen algorithm. If the execution-parameters
     *        endpoint is not enabled, the default value is 1. For built-in algorithms, you don't need to set a value
     *        for <code>MaxConcurrentTransforms</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        setMaxConcurrentTransforms(maxConcurrentTransforms);
        return this;
    }

    /**
     * @param modelClientConfig
     */

    public void setModelClientConfig(ModelClientConfig modelClientConfig) {
        this.modelClientConfig = modelClientConfig;
    }

    /**
     * @return
     */

    public ModelClientConfig getModelClientConfig() {
        return this.modelClientConfig;
    }

    /**
     * @param modelClientConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withModelClientConfig(ModelClientConfig modelClientConfig) {
        setModelClientConfig(modelClientConfig);
        return this;
    }

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without metadata). The
     * value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a single record. To estimate
     * the size of a record in MB, divide the size of your dataset by the number of records. To ensure that the records
     * fit within the maximum payload size, we recommend using a slightly larger value. The default value is 6 MB. For
     * cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value
     * to 0. This feature works only in supported algorithms. Currently, SageMaker built-in algorithms do not support
     * HTTP chunked encoding.
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without
     *        metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a
     *        single record. To estimate the size of a record in MB, divide the size of your dataset by the number of
     *        records. To ensure that the records fit within the maximum payload size, we recommend using a slightly
     *        larger value. The default value is 6 MB. For cases where the payload might be arbitrarily large and is
     *        transmitted using HTTP chunked encoding, set the value to 0. This feature works only in supported
     *        algorithms. Currently, SageMaker built-in algorithms do not support HTTP chunked encoding.
     */

    public void setMaxPayloadInMB(Integer maxPayloadInMB) {
        this.maxPayloadInMB = maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without metadata). The
     * value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a single record. To estimate
     * the size of a record in MB, divide the size of your dataset by the number of records. To ensure that the records
     * fit within the maximum payload size, we recommend using a slightly larger value. The default value is 6 MB. For
     * cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value
     * to 0. This feature works only in supported algorithms. Currently, SageMaker built-in algorithms do not support
     * HTTP chunked encoding.
     * </p>
     * 
     * @return The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without
     *         metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a
     *         single record. To estimate the size of a record in MB, divide the size of your dataset by the number of
     *         records. To ensure that the records fit within the maximum payload size, we recommend using a slightly
     *         larger value. The default value is 6 MB. For cases where the payload might be arbitrarily large and is
     *         transmitted using HTTP chunked encoding, set the value to 0. This feature works only in supported
     *         algorithms. Currently, SageMaker built-in algorithms do not support HTTP chunked encoding.
     */

    public Integer getMaxPayloadInMB() {
        return this.maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without metadata). The
     * value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a single record. To estimate
     * the size of a record in MB, divide the size of your dataset by the number of records. To ensure that the records
     * fit within the maximum payload size, we recommend using a slightly larger value. The default value is 6 MB. For
     * cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value
     * to 0. This feature works only in supported algorithms. Currently, SageMaker built-in algorithms do not support
     * HTTP chunked encoding.
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without
     *        metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a
     *        single record. To estimate the size of a record in MB, divide the size of your dataset by the number of
     *        records. To ensure that the records fit within the maximum payload size, we recommend using a slightly
     *        larger value. The default value is 6 MB. For cases where the payload might be arbitrarily large and is
     *        transmitted using HTTP chunked encoding, set the value to 0. This feature works only in supported
     *        algorithms. Currently, SageMaker built-in algorithms do not support HTTP chunked encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withMaxPayloadInMB(Integer maxPayloadInMB) {
        setMaxPayloadInMB(maxPayloadInMB);
        return this;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a single
     * unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     * 
     * @param batchStrategy
     *        Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a
     *        single unit of input data that inference can be made on. For example, a single line in a CSV file is a
     *        record.
     * @see BatchStrategy
     */

    public void setBatchStrategy(String batchStrategy) {
        this.batchStrategy = batchStrategy;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a single
     * unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     * 
     * @return Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a
     *         single unit of input data that inference can be made on. For example, a single line in a CSV file is a
     *         record.
     * @see BatchStrategy
     */

    public String getBatchStrategy() {
        return this.batchStrategy;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a single
     * unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     * 
     * @param batchStrategy
     *        Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a
     *        single unit of input data that inference can be made on. For example, a single line in a CSV file is a
     *        record.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStrategy
     */

    public TransformJob withBatchStrategy(String batchStrategy) {
        setBatchStrategy(batchStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a single
     * unit of input data that inference can be made on. For example, a single line in a CSV file is a record.
     * </p>
     * 
     * @param batchStrategy
     *        Specifies the number of records to include in a mini-batch for an HTTP inference request. A record is a
     *        single unit of input data that inference can be made on. For example, a single line in a CSV file is a
     *        record.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStrategy
     */

    public TransformJob withBatchStrategy(BatchStrategy batchStrategy) {
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

    public TransformJob withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see TransformJob#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob addEnvironmentEntry(String key, String value) {
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

    public TransformJob clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * @param transformInput
     */

    public void setTransformInput(TransformInput transformInput) {
        this.transformInput = transformInput;
    }

    /**
     * @return
     */

    public TransformInput getTransformInput() {
        return this.transformInput;
    }

    /**
     * @param transformInput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withTransformInput(TransformInput transformInput) {
        setTransformInput(transformInput);
        return this;
    }

    /**
     * @param transformOutput
     */

    public void setTransformOutput(TransformOutput transformOutput) {
        this.transformOutput = transformOutput;
    }

    /**
     * @return
     */

    public TransformOutput getTransformOutput() {
        return this.transformOutput;
    }

    /**
     * @param transformOutput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withTransformOutput(TransformOutput transformOutput) {
        setTransformOutput(transformOutput);
        return this;
    }

    /**
     * @param transformResources
     */

    public void setTransformResources(TransformResources transformResources) {
        this.transformResources = transformResources;
    }

    /**
     * @return
     */

    public TransformResources getTransformResources() {
        return this.transformResources;
    }

    /**
     * @param transformResources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withTransformResources(TransformResources transformResources) {
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

    public TransformJob withCreationTime(java.util.Date creationTime) {
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

    public TransformJob withTransformStartTime(java.util.Date transformStartTime) {
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

    public TransformJob withTransformEndTime(java.util.Date transformEndTime) {
        setTransformEndTime(transformEndTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job that created the transform job.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) of the labeling job that created the transform job.
     */

    public void setLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job that created the transform job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the labeling job that created the transform job.
     */

    public String getLabelingJobArn() {
        return this.labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job that created the transform job.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) of the labeling job that created the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withLabelingJobArn(String labelingJobArn) {
        setLabelingJobArn(labelingJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job that created the transform job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The Amazon Resource Name (ARN) of the AutoML job that created the transform job.
     */

    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job that created the transform job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AutoML job that created the transform job.
     */

    public String getAutoMLJobArn() {
        return this.autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job that created the transform job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The Amazon Resource Name (ARN) of the AutoML job that created the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withAutoMLJobArn(String autoMLJobArn) {
        setAutoMLJobArn(autoMLJobArn);
        return this;
    }

    /**
     * @param dataProcessing
     */

    public void setDataProcessing(DataProcessing dataProcessing) {
        this.dataProcessing = dataProcessing;
    }

    /**
     * @return
     */

    public DataProcessing getDataProcessing() {
        return this.dataProcessing;
    }

    /**
     * @param dataProcessing
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withDataProcessing(DataProcessing dataProcessing) {
        setDataProcessing(dataProcessing);
        return this;
    }

    /**
     * @param experimentConfig
     */

    public void setExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
    }

    /**
     * @return
     */

    public ExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    /**
     * @param experimentConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withExperimentConfig(ExperimentConfig experimentConfig) {
        setExperimentConfig(experimentConfig);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the transform job.
     * </p>
     * 
     * @return A list of tags associated with the transform job.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the transform job.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the transform job.
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
     * A list of tags associated with the transform job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withTags(Tag... tags) {
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
     * A list of tags associated with the transform job.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJob withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getModelClientConfig() != null)
            sb.append("ModelClientConfig: ").append(getModelClientConfig()).append(",");
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
            sb.append("LabelingJobArn: ").append(getLabelingJobArn()).append(",");
        if (getAutoMLJobArn() != null)
            sb.append("AutoMLJobArn: ").append(getAutoMLJobArn()).append(",");
        if (getDataProcessing() != null)
            sb.append("DataProcessing: ").append(getDataProcessing()).append(",");
        if (getExperimentConfig() != null)
            sb.append("ExperimentConfig: ").append(getExperimentConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformJob == false)
            return false;
        TransformJob other = (TransformJob) obj;
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
        if (other.getModelClientConfig() == null ^ this.getModelClientConfig() == null)
            return false;
        if (other.getModelClientConfig() != null && other.getModelClientConfig().equals(this.getModelClientConfig()) == false)
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
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getDataProcessing() == null ^ this.getDataProcessing() == null)
            return false;
        if (other.getDataProcessing() != null && other.getDataProcessing().equals(this.getDataProcessing()) == false)
            return false;
        if (other.getExperimentConfig() == null ^ this.getExperimentConfig() == null)
            return false;
        if (other.getExperimentConfig() != null && other.getExperimentConfig().equals(this.getExperimentConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getModelClientConfig() == null) ? 0 : getModelClientConfig().hashCode());
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
        hashCode = prime * hashCode + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode + ((getDataProcessing() == null) ? 0 : getDataProcessing().hashCode());
        hashCode = prime * hashCode + ((getExperimentConfig() == null) ? 0 : getExperimentConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransformJob clone() {
        try {
            return (TransformJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TransformJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
