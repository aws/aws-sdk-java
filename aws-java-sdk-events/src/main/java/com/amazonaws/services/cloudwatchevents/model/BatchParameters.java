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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The custom parameters to be used when the target is an AWS Batch job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/BatchParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must
     * already exist.
     * </p>
     */
    private String jobDefinition;
    /**
     * <p>
     * The name to use for this execution of the job, if the target is an AWS Batch job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and
     * 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the
     * target is an AWS Batch job.
     * </p>
     */
    private BatchArrayProperties arrayProperties;
    /**
     * <p>
     * The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the number of
     * times to retry the failed job execution. Valid values are 1–10. When you specify a retry strategy here, it
     * overrides the retry strategy defined in the job definition.
     * </p>
     */
    private BatchRetryStrategy retryStrategy;

    /**
     * <p>
     * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must
     * already exist.
     * </p>
     * 
     * @param jobDefinition
     *        The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition
     *        must already exist.
     */

    public void setJobDefinition(String jobDefinition) {
        this.jobDefinition = jobDefinition;
    }

    /**
     * <p>
     * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must
     * already exist.
     * </p>
     * 
     * @return The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition
     *         must already exist.
     */

    public String getJobDefinition() {
        return this.jobDefinition;
    }

    /**
     * <p>
     * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must
     * already exist.
     * </p>
     * 
     * @param jobDefinition
     *        The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition
     *        must already exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchParameters withJobDefinition(String jobDefinition) {
        setJobDefinition(jobDefinition);
        return this;
    }

    /**
     * <p>
     * The name to use for this execution of the job, if the target is an AWS Batch job.
     * </p>
     * 
     * @param jobName
     *        The name to use for this execution of the job, if the target is an AWS Batch job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name to use for this execution of the job, if the target is an AWS Batch job.
     * </p>
     * 
     * @return The name to use for this execution of the job, if the target is an AWS Batch job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name to use for this execution of the job, if the target is an AWS Batch job.
     * </p>
     * 
     * @param jobName
     *        The name to use for this execution of the job, if the target is an AWS Batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchParameters withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and
     * 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the
     * target is an AWS Batch job.
     * </p>
     * 
     * @param arrayProperties
     *        The array properties for the submitted job, such as the size of the array. The array size can be between 2
     *        and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used
     *        only if the target is an AWS Batch job.
     */

    public void setArrayProperties(BatchArrayProperties arrayProperties) {
        this.arrayProperties = arrayProperties;
    }

    /**
     * <p>
     * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and
     * 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the
     * target is an AWS Batch job.
     * </p>
     * 
     * @return The array properties for the submitted job, such as the size of the array. The array size can be between
     *         2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used
     *         only if the target is an AWS Batch job.
     */

    public BatchArrayProperties getArrayProperties() {
        return this.arrayProperties;
    }

    /**
     * <p>
     * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and
     * 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the
     * target is an AWS Batch job.
     * </p>
     * 
     * @param arrayProperties
     *        The array properties for the submitted job, such as the size of the array. The array size can be between 2
     *        and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used
     *        only if the target is an AWS Batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchParameters withArrayProperties(BatchArrayProperties arrayProperties) {
        setArrayProperties(arrayProperties);
        return this;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the number of
     * times to retry the failed job execution. Valid values are 1–10. When you specify a retry strategy here, it
     * overrides the retry strategy defined in the job definition.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the
     *        number of times to retry the failed job execution. Valid values are 1–10. When you specify a retry
     *        strategy here, it overrides the retry strategy defined in the job definition.
     */

    public void setRetryStrategy(BatchRetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the number of
     * times to retry the failed job execution. Valid values are 1–10. When you specify a retry strategy here, it
     * overrides the retry strategy defined in the job definition.
     * </p>
     * 
     * @return The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the
     *         number of times to retry the failed job execution. Valid values are 1–10. When you specify a retry
     *         strategy here, it overrides the retry strategy defined in the job definition.
     */

    public BatchRetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the number of
     * times to retry the failed job execution. Valid values are 1–10. When you specify a retry strategy here, it
     * overrides the retry strategy defined in the job definition.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the
     *        number of times to retry the failed job execution. Valid values are 1–10. When you specify a retry
     *        strategy here, it overrides the retry strategy defined in the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchParameters withRetryStrategy(BatchRetryStrategy retryStrategy) {
        setRetryStrategy(retryStrategy);
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
        if (getJobDefinition() != null)
            sb.append("JobDefinition: ").append(getJobDefinition()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getArrayProperties() != null)
            sb.append("ArrayProperties: ").append(getArrayProperties()).append(",");
        if (getRetryStrategy() != null)
            sb.append("RetryStrategy: ").append(getRetryStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchParameters == false)
            return false;
        BatchParameters other = (BatchParameters) obj;
        if (other.getJobDefinition() == null ^ this.getJobDefinition() == null)
            return false;
        if (other.getJobDefinition() != null && other.getJobDefinition().equals(this.getJobDefinition()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getArrayProperties() == null ^ this.getArrayProperties() == null)
            return false;
        if (other.getArrayProperties() != null && other.getArrayProperties().equals(this.getArrayProperties()) == false)
            return false;
        if (other.getRetryStrategy() == null ^ this.getRetryStrategy() == null)
            return false;
        if (other.getRetryStrategy() != null && other.getRetryStrategy().equals(this.getRetryStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobDefinition() == null) ? 0 : getJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getArrayProperties() == null) ? 0 : getArrayProperties().hashCode());
        hashCode = prime * hashCode + ((getRetryStrategy() == null) ? 0 : getRetryStrategy().hashCode());
        return hashCode;
    }

    @Override
    public BatchParameters clone() {
        try {
            return (BatchParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.BatchParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
