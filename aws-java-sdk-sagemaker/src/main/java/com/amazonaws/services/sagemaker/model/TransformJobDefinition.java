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
 * Defines the input needed to run a transform job using the inference specification specified in the algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TransformJobDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformJobDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value
     * is 1.
     * </p>
     */
    private Integer maxConcurrentTransforms;
    /**
     * <p>
     * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
     * </p>
     */
    private Integer maxPayloadInMB;
    /**
     * <p>
     * A string that determines the number of records included in a single mini-batch.
     * </p>
     * <p>
     * <code>SingleRecord</code> means only one record is used per mini-batch. <code>MultiRecord</code> means a
     * mini-batch is set to contain as many records that can fit within the <code>MaxPayloadInMB</code> limit.
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
     * A description of the input source and the way the transform job consumes it.
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
     * Identifies the ML compute instances for the transform job.
     * </p>
     */
    private TransformResources transformResources;

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value
     * is 1.
     * </p>
     * 
     * @param maxConcurrentTransforms
     *        The maximum number of parallel requests that can be sent to each instance in a transform job. The default
     *        value is 1.
     */

    public void setMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        this.maxConcurrentTransforms = maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value
     * is 1.
     * </p>
     * 
     * @return The maximum number of parallel requests that can be sent to each instance in a transform job. The default
     *         value is 1.
     */

    public Integer getMaxConcurrentTransforms() {
        return this.maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value
     * is 1.
     * </p>
     * 
     * @param maxConcurrentTransforms
     *        The maximum number of parallel requests that can be sent to each instance in a transform job. The default
     *        value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobDefinition withMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        setMaxConcurrentTransforms(maxConcurrentTransforms);
        return this;
    }

    /**
     * <p>
     * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
     */

    public void setMaxPayloadInMB(Integer maxPayloadInMB) {
        this.maxPayloadInMB = maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
     * </p>
     * 
     * @return The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
     */

    public Integer getMaxPayloadInMB() {
        return this.maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
     * </p>
     * 
     * @param maxPayloadInMB
     *        The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobDefinition withMaxPayloadInMB(Integer maxPayloadInMB) {
        setMaxPayloadInMB(maxPayloadInMB);
        return this;
    }

    /**
     * <p>
     * A string that determines the number of records included in a single mini-batch.
     * </p>
     * <p>
     * <code>SingleRecord</code> means only one record is used per mini-batch. <code>MultiRecord</code> means a
     * mini-batch is set to contain as many records that can fit within the <code>MaxPayloadInMB</code> limit.
     * </p>
     * 
     * @param batchStrategy
     *        A string that determines the number of records included in a single mini-batch.</p>
     *        <p>
     *        <code>SingleRecord</code> means only one record is used per mini-batch. <code>MultiRecord</code> means a
     *        mini-batch is set to contain as many records that can fit within the <code>MaxPayloadInMB</code> limit.
     * @see BatchStrategy
     */

    public void setBatchStrategy(String batchStrategy) {
        this.batchStrategy = batchStrategy;
    }

    /**
     * <p>
     * A string that determines the number of records included in a single mini-batch.
     * </p>
     * <p>
     * <code>SingleRecord</code> means only one record is used per mini-batch. <code>MultiRecord</code> means a
     * mini-batch is set to contain as many records that can fit within the <code>MaxPayloadInMB</code> limit.
     * </p>
     * 
     * @return A string that determines the number of records included in a single mini-batch.</p>
     *         <p>
     *         <code>SingleRecord</code> means only one record is used per mini-batch. <code>MultiRecord</code> means a
     *         mini-batch is set to contain as many records that can fit within the <code>MaxPayloadInMB</code> limit.
     * @see BatchStrategy
     */

    public String getBatchStrategy() {
        return this.batchStrategy;
    }

    /**
     * <p>
     * A string that determines the number of records included in a single mini-batch.
     * </p>
     * <p>
     * <code>SingleRecord</code> means only one record is used per mini-batch. <code>MultiRecord</code> means a
     * mini-batch is set to contain as many records that can fit within the <code>MaxPayloadInMB</code> limit.
     * </p>
     * 
     * @param batchStrategy
     *        A string that determines the number of records included in a single mini-batch.</p>
     *        <p>
     *        <code>SingleRecord</code> means only one record is used per mini-batch. <code>MultiRecord</code> means a
     *        mini-batch is set to contain as many records that can fit within the <code>MaxPayloadInMB</code> limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStrategy
     */

    public TransformJobDefinition withBatchStrategy(String batchStrategy) {
        setBatchStrategy(batchStrategy);
        return this;
    }

    /**
     * <p>
     * A string that determines the number of records included in a single mini-batch.
     * </p>
     * <p>
     * <code>SingleRecord</code> means only one record is used per mini-batch. <code>MultiRecord</code> means a
     * mini-batch is set to contain as many records that can fit within the <code>MaxPayloadInMB</code> limit.
     * </p>
     * 
     * @param batchStrategy
     *        A string that determines the number of records included in a single mini-batch.</p>
     *        <p>
     *        <code>SingleRecord</code> means only one record is used per mini-batch. <code>MultiRecord</code> means a
     *        mini-batch is set to contain as many records that can fit within the <code>MaxPayloadInMB</code> limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchStrategy
     */

    public TransformJobDefinition withBatchStrategy(BatchStrategy batchStrategy) {
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

    public TransformJobDefinition withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    public TransformJobDefinition addEnvironmentEntry(String key, String value) {
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

    public TransformJobDefinition clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * A description of the input source and the way the transform job consumes it.
     * </p>
     * 
     * @param transformInput
     *        A description of the input source and the way the transform job consumes it.
     */

    public void setTransformInput(TransformInput transformInput) {
        this.transformInput = transformInput;
    }

    /**
     * <p>
     * A description of the input source and the way the transform job consumes it.
     * </p>
     * 
     * @return A description of the input source and the way the transform job consumes it.
     */

    public TransformInput getTransformInput() {
        return this.transformInput;
    }

    /**
     * <p>
     * A description of the input source and the way the transform job consumes it.
     * </p>
     * 
     * @param transformInput
     *        A description of the input source and the way the transform job consumes it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobDefinition withTransformInput(TransformInput transformInput) {
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

    public TransformJobDefinition withTransformOutput(TransformOutput transformOutput) {
        setTransformOutput(transformOutput);
        return this;
    }

    /**
     * <p>
     * Identifies the ML compute instances for the transform job.
     * </p>
     * 
     * @param transformResources
     *        Identifies the ML compute instances for the transform job.
     */

    public void setTransformResources(TransformResources transformResources) {
        this.transformResources = transformResources;
    }

    /**
     * <p>
     * Identifies the ML compute instances for the transform job.
     * </p>
     * 
     * @return Identifies the ML compute instances for the transform job.
     */

    public TransformResources getTransformResources() {
        return this.transformResources;
    }

    /**
     * <p>
     * Identifies the ML compute instances for the transform job.
     * </p>
     * 
     * @param transformResources
     *        Identifies the ML compute instances for the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformJobDefinition withTransformResources(TransformResources transformResources) {
        setTransformResources(transformResources);
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
            sb.append("TransformResources: ").append(getTransformResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformJobDefinition == false)
            return false;
        TransformJobDefinition other = (TransformJobDefinition) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxConcurrentTransforms() == null) ? 0 : getMaxConcurrentTransforms().hashCode());
        hashCode = prime * hashCode + ((getMaxPayloadInMB() == null) ? 0 : getMaxPayloadInMB().hashCode());
        hashCode = prime * hashCode + ((getBatchStrategy() == null) ? 0 : getBatchStrategy().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getTransformInput() == null) ? 0 : getTransformInput().hashCode());
        hashCode = prime * hashCode + ((getTransformOutput() == null) ? 0 : getTransformOutput().hashCode());
        hashCode = prime * hashCode + ((getTransformResources() == null) ? 0 : getTransformResources().hashCode());
        return hashCode;
    }

    @Override
    public TransformJobDefinition clone() {
        try {
            return (TransformJobDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TransformJobDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
