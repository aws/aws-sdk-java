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
 * The retry strategy to use when a training job fails due to an <code>InternalServerError</code>.
 * <code>RetryStrategy</code> is specified as part of the <code>CreateTrainingJob</code> and
 * <code>CreateHyperParameterTuningJob</code> requests. You can add the <code>StoppingCondition</code> parameter to the
 * request to limit the training time for the complete job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RetryStrategy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryStrategy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of times to retry the job. When the job is retried, it's <code>SecondaryStatus</code> is changed to
     * <code>STARTING</code>.
     * </p>
     */
    private Integer maximumRetryAttempts;

    /**
     * <p>
     * The number of times to retry the job. When the job is retried, it's <code>SecondaryStatus</code> is changed to
     * <code>STARTING</code>.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        The number of times to retry the job. When the job is retried, it's <code>SecondaryStatus</code> is
     *        changed to <code>STARTING</code>.
     */

    public void setMaximumRetryAttempts(Integer maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    /**
     * <p>
     * The number of times to retry the job. When the job is retried, it's <code>SecondaryStatus</code> is changed to
     * <code>STARTING</code>.
     * </p>
     * 
     * @return The number of times to retry the job. When the job is retried, it's <code>SecondaryStatus</code> is
     *         changed to <code>STARTING</code>.
     */

    public Integer getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }

    /**
     * <p>
     * The number of times to retry the job. When the job is retried, it's <code>SecondaryStatus</code> is changed to
     * <code>STARTING</code>.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        The number of times to retry the job. When the job is retried, it's <code>SecondaryStatus</code> is
     *        changed to <code>STARTING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryStrategy withMaximumRetryAttempts(Integer maximumRetryAttempts) {
        setMaximumRetryAttempts(maximumRetryAttempts);
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
        if (getMaximumRetryAttempts() != null)
            sb.append("MaximumRetryAttempts: ").append(getMaximumRetryAttempts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryStrategy == false)
            return false;
        RetryStrategy other = (RetryStrategy) obj;
        if (other.getMaximumRetryAttempts() == null ^ this.getMaximumRetryAttempts() == null)
            return false;
        if (other.getMaximumRetryAttempts() != null && other.getMaximumRetryAttempts().equals(this.getMaximumRetryAttempts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumRetryAttempts() == null) ? 0 : getMaximumRetryAttempts().hashCode());
        return hashCode;
    }

    @Override
    public RetryStrategy clone() {
        try {
            return (RetryStrategy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RetryStrategyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
