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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTransformJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransformJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the transform job. The name must be unique within an AWS Region in an AWS account.
     * </p>
     */
    private String transformJobName;
    /**
     * <p>
     * The name of the model that you want to use for the transform job. <code>ModelName</code> must be the name of an
     * existing Amazon SageMaker model within an AWS Region in an AWS account.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value
     * is <code>1</code>. To allow Amazon SageMaker to determine the appropriate number for
     * <code>MaxConcurrentTransforms</code>, set the value to <code>0</code>.
     * </p>
     */
    private Integer maxConcurrentTransforms;
    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A <i>payload</i> is the data portion of a record (without
     * metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a single
     * record. To estimate the size of a record in MB, divide the size of your dataset by the number of records. To
     * ensure that the records fit within the maximum payload size, we recommend using a slightly larger value. The
     * default value is <code>6</code> MB.
     * </p>
     * <p>
     * For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the
     * value to <code>0</code>. This feature works only in supported algorithms. Currently, Amazon SageMaker built-in
     * algorithms do not support HTTP chunked encoding.
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
     * <p>
     * To use only one record when making an HTTP invocation request to a container, set <code>BatchStrategy</code> to
     * <code>SingleRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the <code>MaxPayloadInMB</code> limit, set
     * <code>BatchStrategy</code> to <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
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
     * Describes the input source and the way the transform job consumes it.
     * </p>
     */
    private TransformInput transformInput;
    /**
     * <p>
     * Describes the results of the transform job.
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the transform job. The name must be unique within an AWS Region in an AWS account.
     * </p>
     * 
     * @param transformJobName
     *        The name of the transform job. The name must be unique within an AWS Region in an AWS account.
     */

    public void setTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
    }

    /**
     * <p>
     * The name of the transform job. The name must be unique within an AWS Region in an AWS account.
     * </p>
     * 
     * @return The name of the transform job. The name must be unique within an AWS Region in an AWS account.
     */

    public String getTransformJobName() {
        return this.transformJobName;
    }

    /**
     * <p>
     * The name of the transform job. The name must be unique within an AWS Region in an AWS account.
     * </p>
     * 
     * @param transformJobName
     *        The name of the transform job. The name must be unique within an AWS Region in an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformJobRequest withTransformJobName(String transformJobName) {
        setTransformJobName(transformJobName);
        return this;
    }

    /**
     * <p>
     * The name of the model that you want to use for the transform job. <code>ModelName</code> must be the name of an
     * existing Amazon SageMaker model within an AWS Region in an AWS account.
     * </p>
     * 
     * @param modelName
     *        The name of the model that you want to use for the transform job. <code>ModelName</code> must be the name
     *        of an existing Amazon SageMaker model within an AWS Region in an AWS account.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model that you want to use for the transform job. <code>ModelName</code> must be the name of an
     * existing Amazon SageMaker model within an AWS Region in an AWS account.
     * </p>
     * 
     * @return The name of the model that you want to use for the transform job. <code>ModelName</code> must be the name
     *         of an existing Amazon SageMaker model within an AWS Region in an AWS account.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model that you want to use for the transform job. <code>ModelName</code> must be the name of an
     * existing Amazon SageMaker model within an AWS Region in an AWS account.
     * </p>
     * 
     * @param modelName
     *        The name of the model that you want to use for the transform job. <code>ModelName</code> must be the name
     *        of an existing Amazon SageMaker model within an AWS Region in an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformJobRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value
     * is <code>1</code>. To allow Amazon SageMaker to determine the appropriate number for
     * <code>MaxConcurrentTransforms</code>, set the value to <code>0</code>.
     * </p>
     * 
     * @param maxConcurrentTransforms
     *        The maximum number of parallel requests that can be sent to each instance in a transform job. The default
     *        value is <code>1</code>. To allow Amazon SageMaker to determine the appropriate number for
     *        <code>MaxConcurrentTransforms</code>, set the value to <code>0</code>.
     */

    public void setMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        this.maxConcurrentTransforms = maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value
     * is <code>1</code>. To allow Amazon SageMaker to determine the appropriate number for
     * <code>MaxConcurrentTransforms</code>, set the value to <code>0</code>.
     * </p>
     * 
     * @return The maximum number of parallel requests that can be sent to each instance in a transform job. The default
     *         value is <code>1</code>. To allow Amazon SageMaker to determine the appropriate number for
     *         <code>MaxConcurrentTransforms</code>, set the value to <code>0</code>.
     */

    public Integer getMaxConcurrentTransforms() {
        return this.maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value
     * is <code>1</code>. To allow Amazon SageMaker to determine the appropriate number for
     * <code>MaxConcurrentTransforms</code>, set the value to <code>0</code>.
     * </p>
     * 
     * @param maxConcurrentTransforms
     *        The maximum number of parallel requests that can be sent to each instance in a transform job. The default
     *        value is <code>1</code>. To allow Amazon SageMaker to determine the appropriate number for
     *        <code>MaxConcurrentTransforms</code>, set the value to <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformJobRequest withMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        setMaxConcurrentTransforms(maxConcurrentTransforms);
        return this;
    }

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A <i>payload</i> is the data portion of a record (without
     * metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a single
     * record. To estimate the size of a record in MB, divide the size of your dataset by the number of records. To
     * ensure that the records fit within the maximum payload size, we recommend using a slightly larger value. The
     * default value is <code>6</code> MB.
     * </p>
     * <p>
     * For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the
     * value to <code>0</code>. This feature works only in supported algorithms. Currently, Amazon SageMaker built-in
     * algorithms do not support HTTP chunked encoding.
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum allowed size of the payload, in MB. A <i>payload</i> is the data portion of a record (without
     *        metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a
     *        single record. To estimate the size of a record in MB, divide the size of your dataset by the number of
     *        records. To ensure that the records fit within the maximum payload size, we recommend using a slightly
     *        larger value. The default value is <code>6</code> MB. </p>
     *        <p>
     *        For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set
     *        the value to <code>0</code>. This feature works only in supported algorithms. Currently, Amazon SageMaker
     *        built-in algorithms do not support HTTP chunked encoding.
     */

    public void setMaxPayloadInMB(Integer maxPayloadInMB) {
        this.maxPayloadInMB = maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A <i>payload</i> is the data portion of a record (without
     * metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a single
     * record. To estimate the size of a record in MB, divide the size of your dataset by the number of records. To
     * ensure that the records fit within the maximum payload size, we recommend using a slightly larger value. The
     * default value is <code>6</code> MB.
     * </p>
     * <p>
     * For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the
     * value to <code>0</code>. This feature works only in supported algorithms. Currently, Amazon SageMaker built-in
     * algorithms do not support HTTP chunked encoding.
     * </p>
     * 
     * @return The maximum allowed size of the payload, in MB. A <i>payload</i> is the data portion of a record (without
     *         metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a
     *         single record. To estimate the size of a record in MB, divide the size of your dataset by the number of
     *         records. To ensure that the records fit within the maximum payload size, we recommend using a slightly
     *         larger value. The default value is <code>6</code> MB. </p>
     *         <p>
     *         For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding,
     *         set the value to <code>0</code>. This feature works only in supported algorithms. Currently, Amazon
     *         SageMaker built-in algorithms do not support HTTP chunked encoding.
     */

    public Integer getMaxPayloadInMB() {
        return this.maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A <i>payload</i> is the data portion of a record (without
     * metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a single
     * record. To estimate the size of a record in MB, divide the size of your dataset by the number of records. To
     * ensure that the records fit within the maximum payload size, we recommend using a slightly larger value. The
     * default value is <code>6</code> MB.
     * </p>
     * <p>
     * For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the
     * value to <code>0</code>. This feature works only in supported algorithms. Currently, Amazon SageMaker built-in
     * algorithms do not support HTTP chunked encoding.
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum allowed size of the payload, in MB. A <i>payload</i> is the data portion of a record (without
     *        metadata). The value in <code>MaxPayloadInMB</code> must be greater than, or equal to, the size of a
     *        single record. To estimate the size of a record in MB, divide the size of your dataset by the number of
     *        records. To ensure that the records fit within the maximum payload size, we recommend using a slightly
     *        larger value. The default value is <code>6</code> MB. </p>
     *        <p>
     *        For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set
     *        the value to <code>0</code>. This feature works only in supported algorithms. Currently, Amazon SageMaker
     *        built-in algorithms do not support HTTP chunked encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformJobRequest withMaxPayloadInMB(Integer maxPayloadInMB) {
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
     * <p>
     * To use only one record when making an HTTP invocation request to a container, set <code>BatchStrategy</code> to
     * <code>SingleRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the <code>MaxPayloadInMB</code> limit, set
     * <code>BatchStrategy</code> to <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * 
     * @param batchStrategy
     *        Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i>
     *        <i/> is a single unit of input data that inference can be made on. For example, a single line in a CSV
     *        file is a record. </p>
     *        <p>
     *        To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>,
     *        <code>RecordIO</code>, or <code>TFRecord</code>.
     *        </p>
     *        <p>
     *        To use only one record when making an HTTP invocation request to a container, set
     *        <code>BatchStrategy</code> to <code>SingleRecord</code> and <code>SplitType</code> to <code>Line</code>.
     *        </p>
     *        <p>
     *        To fit as many records in a mini-batch as can fit within the <code>MaxPayloadInMB</code> limit, set
     *        <code>BatchStrategy</code> to <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
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
     * <p>
     * To use only one record when making an HTTP invocation request to a container, set <code>BatchStrategy</code> to
     * <code>SingleRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the <code>MaxPayloadInMB</code> limit, set
     * <code>BatchStrategy</code> to <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * 
     * @return Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i>
     *         <i/> is a single unit of input data that inference can be made on. For example, a single line in a CSV
     *         file is a record. </p>
     *         <p>
     *         To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>,
     *         <code>RecordIO</code>, or <code>TFRecord</code>.
     *         </p>
     *         <p>
     *         To use only one record when making an HTTP invocation request to a container, set
     *         <code>BatchStrategy</code> to <code>SingleRecord</code> and <code>SplitType</code> to <code>Line</code>.
     *         </p>
     *         <p>
     *         To fit as many records in a mini-batch as can fit within the <code>MaxPayloadInMB</code> limit, set
     *         <code>BatchStrategy</code> to <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
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
     * <p>
     * To use only one record when making an HTTP invocation request to a container, set <code>BatchStrategy</code> to
     * <code>SingleRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the <code>MaxPayloadInMB</code> limit, set
     * <code>BatchStrategy</code> to <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * 
     * @param batchStrategy
     *        Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i>
     *        <i/> is a single unit of input data that inference can be made on. For example, a single line in a CSV
     *        file is a record. </p>
     *        <p>
     *        To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>,
     *        <code>RecordIO</code>, or <code>TFRecord</code>.
     *        </p>
     *        <p>
     *        To use only one record when making an HTTP invocation request to a container, set
     *        <code>BatchStrategy</code> to <code>SingleRecord</code> and <code>SplitType</code> to <code>Line</code>.
     *        </p>
     *        <p>
     *        To fit as many records in a mini-batch as can fit within the <code>MaxPayloadInMB</code> limit, set
     *        <code>BatchStrategy</code> to <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStrategy
     */

    public CreateTransformJobRequest withBatchStrategy(String batchStrategy) {
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
     * <p>
     * To use only one record when making an HTTP invocation request to a container, set <code>BatchStrategy</code> to
     * <code>SingleRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the <code>MaxPayloadInMB</code> limit, set
     * <code>BatchStrategy</code> to <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * 
     * @param batchStrategy
     *        Specifies the number of records to include in a mini-batch for an HTTP inference request. A <i>record</i>
     *        <i/> is a single unit of input data that inference can be made on. For example, a single line in a CSV
     *        file is a record. </p>
     *        <p>
     *        To enable the batch strategy, you must set <code>SplitType</code> to <code>Line</code>,
     *        <code>RecordIO</code>, or <code>TFRecord</code>.
     *        </p>
     *        <p>
     *        To use only one record when making an HTTP invocation request to a container, set
     *        <code>BatchStrategy</code> to <code>SingleRecord</code> and <code>SplitType</code> to <code>Line</code>.
     *        </p>
     *        <p>
     *        To fit as many records in a mini-batch as can fit within the <code>MaxPayloadInMB</code> limit, set
     *        <code>BatchStrategy</code> to <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStrategy
     */

    public CreateTransformJobRequest withBatchStrategy(BatchStrategy batchStrategy) {
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

    public CreateTransformJobRequest withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    public CreateTransformJobRequest addEnvironmentEntry(String key, String value) {
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

    public CreateTransformJobRequest clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * Describes the input source and the way the transform job consumes it.
     * </p>
     * 
     * @param transformInput
     *        Describes the input source and the way the transform job consumes it.
     */

    public void setTransformInput(TransformInput transformInput) {
        this.transformInput = transformInput;
    }

    /**
     * <p>
     * Describes the input source and the way the transform job consumes it.
     * </p>
     * 
     * @return Describes the input source and the way the transform job consumes it.
     */

    public TransformInput getTransformInput() {
        return this.transformInput;
    }

    /**
     * <p>
     * Describes the input source and the way the transform job consumes it.
     * </p>
     * 
     * @param transformInput
     *        Describes the input source and the way the transform job consumes it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformJobRequest withTransformInput(TransformInput transformInput) {
        setTransformInput(transformInput);
        return this;
    }

    /**
     * <p>
     * Describes the results of the transform job.
     * </p>
     * 
     * @param transformOutput
     *        Describes the results of the transform job.
     */

    public void setTransformOutput(TransformOutput transformOutput) {
        this.transformOutput = transformOutput;
    }

    /**
     * <p>
     * Describes the results of the transform job.
     * </p>
     * 
     * @return Describes the results of the transform job.
     */

    public TransformOutput getTransformOutput() {
        return this.transformOutput;
    }

    /**
     * <p>
     * Describes the results of the transform job.
     * </p>
     * 
     * @param transformOutput
     *        Describes the results of the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformJobRequest withTransformOutput(TransformOutput transformOutput) {
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

    public CreateTransformJobRequest withTransformResources(TransformResources transformResources) {
        setTransformResources(transformResources);
        return this;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return (Optional) An array of key-value pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        (Optional) An array of key-value pairs. For more information, see <a
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
     * (Optional) An array of key-value pairs. For more information, see <a
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
     *        (Optional) An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformJobRequest withTags(Tag... tags) {
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        (Optional) An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformJobRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateTransformJobRequest == false)
            return false;
        CreateTransformJobRequest other = (CreateTransformJobRequest) obj;
        if (other.getTransformJobName() == null ^ this.getTransformJobName() == null)
            return false;
        if (other.getTransformJobName() != null && other.getTransformJobName().equals(this.getTransformJobName()) == false)
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
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrentTransforms() == null) ? 0 : getMaxConcurrentTransforms().hashCode());
        hashCode = prime * hashCode + ((getMaxPayloadInMB() == null) ? 0 : getMaxPayloadInMB().hashCode());
        hashCode = prime * hashCode + ((getBatchStrategy() == null) ? 0 : getBatchStrategy().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getTransformInput() == null) ? 0 : getTransformInput().hashCode());
        hashCode = prime * hashCode + ((getTransformOutput() == null) ? 0 : getTransformOutput().hashCode());
        hashCode = prime * hashCode + ((getTransformResources() == null) ? 0 : getTransformResources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransformJobRequest clone() {
        return (CreateTransformJobRequest) super.clone();
    }

}
