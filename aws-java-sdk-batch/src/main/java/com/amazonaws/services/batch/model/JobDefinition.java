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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an AWS Batch job definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/JobDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job definition.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job definition.
     * </p>
     */
    private String jobDefinitionArn;
    /**
     * <p>
     * The revision of the job definition.
     * </p>
     */
    private Integer revision;
    /**
     * <p>
     * The status of the job definition.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of job definition.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are
     * specified as a key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     * parameter defaults from the job definition. For more information about specifying parameters, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html">Job Definition
     * Parameters</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     * </p>
     */
    private RetryStrategy retryStrategy;
    /**
     * <p>
     * An object with various properties specific to container-based jobs.
     * </p>
     */
    private ContainerProperties containerProperties;
    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout
     * duration after which AWS Batch terminates your jobs if they have not finished.
     * </p>
     */
    private JobTimeout timeout;
    /**
     * <p>
     * An object with various properties specific to multi-node parallel jobs.
     * </p>
     */
    private NodeProperties nodeProperties;

    /**
     * <p>
     * The name of the job definition.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the job definition.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the job definition.
     * </p>
     * 
     * @return The name of the job definition.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the job definition.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job definition.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) for the job definition.
     */

    public void setJobDefinitionArn(String jobDefinitionArn) {
        this.jobDefinitionArn = jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job definition.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the job definition.
     */

    public String getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job definition.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) for the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withJobDefinitionArn(String jobDefinitionArn) {
        setJobDefinitionArn(jobDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The revision of the job definition.
     * </p>
     * 
     * @param revision
     *        The revision of the job definition.
     */

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the job definition.
     * </p>
     * 
     * @return The revision of the job definition.
     */

    public Integer getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the job definition.
     * </p>
     * 
     * @param revision
     *        The revision of the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withRevision(Integer revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The status of the job definition.
     * </p>
     * 
     * @param status
     *        The status of the job definition.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job definition.
     * </p>
     * 
     * @return The status of the job definition.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job definition.
     * </p>
     * 
     * @param status
     *        The status of the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @return The type of job definition.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are
     * specified as a key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     * parameter defaults from the job definition. For more information about specifying parameters, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html">Job Definition
     * Parameters</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return Default parameters or parameter substitution placeholders that are set in the job definition. Parameters
     *         are specified as a key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any
     *         corresponding parameter defaults from the job definition. For more information about specifying
     *         parameters, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html">Job Definition
     *         Parameters</a> in the <i>AWS Batch User Guide</i>.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are
     * specified as a key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     * parameter defaults from the job definition. For more information about specifying parameters, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html">Job Definition
     * Parameters</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param parameters
     *        Default parameters or parameter substitution placeholders that are set in the job definition. Parameters
     *        are specified as a key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any
     *        corresponding parameter defaults from the job definition. For more information about specifying
     *        parameters, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html">Job Definition
     *        Parameters</a> in the <i>AWS Batch User Guide</i>.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are
     * specified as a key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     * parameter defaults from the job definition. For more information about specifying parameters, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html">Job Definition
     * Parameters</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param parameters
     *        Default parameters or parameter substitution placeholders that are set in the job definition. Parameters
     *        are specified as a key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any
     *        corresponding parameter defaults from the job definition. For more information about specifying
     *        parameters, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html">Job Definition
     *        Parameters</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public JobDefinition addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs that are submitted with this job definition.
     */

    public void setRetryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     * </p>
     * 
     * @return The retry strategy to use for failed jobs that are submitted with this job definition.
     */

    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs that are submitted with this job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withRetryStrategy(RetryStrategy retryStrategy) {
        setRetryStrategy(retryStrategy);
        return this;
    }

    /**
     * <p>
     * An object with various properties specific to container-based jobs.
     * </p>
     * 
     * @param containerProperties
     *        An object with various properties specific to container-based jobs.
     */

    public void setContainerProperties(ContainerProperties containerProperties) {
        this.containerProperties = containerProperties;
    }

    /**
     * <p>
     * An object with various properties specific to container-based jobs.
     * </p>
     * 
     * @return An object with various properties specific to container-based jobs.
     */

    public ContainerProperties getContainerProperties() {
        return this.containerProperties;
    }

    /**
     * <p>
     * An object with various properties specific to container-based jobs.
     * </p>
     * 
     * @param containerProperties
     *        An object with various properties specific to container-based jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withContainerProperties(ContainerProperties containerProperties) {
        setContainerProperties(containerProperties);
        return this;
    }

    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout
     * duration after which AWS Batch terminates your jobs if they have not finished.
     * </p>
     * 
     * @param timeout
     *        The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout
     *        duration after which AWS Batch terminates your jobs if they have not finished.
     */

    public void setTimeout(JobTimeout timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout
     * duration after which AWS Batch terminates your jobs if they have not finished.
     * </p>
     * 
     * @return The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout
     *         duration after which AWS Batch terminates your jobs if they have not finished.
     */

    public JobTimeout getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout
     * duration after which AWS Batch terminates your jobs if they have not finished.
     * </p>
     * 
     * @param timeout
     *        The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout
     *        duration after which AWS Batch terminates your jobs if they have not finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withTimeout(JobTimeout timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * An object with various properties specific to multi-node parallel jobs.
     * </p>
     * 
     * @param nodeProperties
     *        An object with various properties specific to multi-node parallel jobs.
     */

    public void setNodeProperties(NodeProperties nodeProperties) {
        this.nodeProperties = nodeProperties;
    }

    /**
     * <p>
     * An object with various properties specific to multi-node parallel jobs.
     * </p>
     * 
     * @return An object with various properties specific to multi-node parallel jobs.
     */

    public NodeProperties getNodeProperties() {
        return this.nodeProperties;
    }

    /**
     * <p>
     * An object with various properties specific to multi-node parallel jobs.
     * </p>
     * 
     * @param nodeProperties
     *        An object with various properties specific to multi-node parallel jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDefinition withNodeProperties(NodeProperties nodeProperties) {
        setNodeProperties(nodeProperties);
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
        if (getJobDefinitionName() != null)
            sb.append("JobDefinitionName: ").append(getJobDefinitionName()).append(",");
        if (getJobDefinitionArn() != null)
            sb.append("JobDefinitionArn: ").append(getJobDefinitionArn()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getRetryStrategy() != null)
            sb.append("RetryStrategy: ").append(getRetryStrategy()).append(",");
        if (getContainerProperties() != null)
            sb.append("ContainerProperties: ").append(getContainerProperties()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getNodeProperties() != null)
            sb.append("NodeProperties: ").append(getNodeProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDefinition == false)
            return false;
        JobDefinition other = (JobDefinition) obj;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
            return false;
        if (other.getJobDefinitionArn() == null ^ this.getJobDefinitionArn() == null)
            return false;
        if (other.getJobDefinitionArn() != null && other.getJobDefinitionArn().equals(this.getJobDefinitionArn()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getRetryStrategy() == null ^ this.getRetryStrategy() == null)
            return false;
        if (other.getRetryStrategy() != null && other.getRetryStrategy().equals(this.getRetryStrategy()) == false)
            return false;
        if (other.getContainerProperties() == null ^ this.getContainerProperties() == null)
            return false;
        if (other.getContainerProperties() != null && other.getContainerProperties().equals(this.getContainerProperties()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getNodeProperties() == null ^ this.getNodeProperties() == null)
            return false;
        if (other.getNodeProperties() != null && other.getNodeProperties().equals(this.getNodeProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobDefinitionName() == null) ? 0 : getJobDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getJobDefinitionArn() == null) ? 0 : getJobDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getRetryStrategy() == null) ? 0 : getRetryStrategy().hashCode());
        hashCode = prime * hashCode + ((getContainerProperties() == null) ? 0 : getContainerProperties().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getNodeProperties() == null) ? 0 : getNodeProperties().hashCode());
        return hashCode;
    }

    @Override
    public JobDefinition clone() {
        try {
            return (JobDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.JobDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
