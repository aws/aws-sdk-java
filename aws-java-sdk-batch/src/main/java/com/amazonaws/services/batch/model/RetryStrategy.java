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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The retry strategy associated with a job. For more information, see <a
 * href="https://docs.aws.amazon.com/batch/latest/userguide/job_retries.html">Automated job retries</a> in the <i>AWS
 * Batch User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/RetryStrategy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryStrategy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of times to move a job to the <code>RUNNABLE</code> status. You can specify between 1 and 10 attempts.
     * If the value of <code>attempts</code> is greater than one, the job is retried on failure the same number of
     * attempts as the value.
     * </p>
     */
    private Integer attempts;
    /**
     * <p>
     * Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this
     * parameter is specified, then the <code>attempts</code> parameter must also be specified.
     * </p>
     */
    private java.util.List<EvaluateOnExit> evaluateOnExit;

    /**
     * <p>
     * The number of times to move a job to the <code>RUNNABLE</code> status. You can specify between 1 and 10 attempts.
     * If the value of <code>attempts</code> is greater than one, the job is retried on failure the same number of
     * attempts as the value.
     * </p>
     * 
     * @param attempts
     *        The number of times to move a job to the <code>RUNNABLE</code> status. You can specify between 1 and 10
     *        attempts. If the value of <code>attempts</code> is greater than one, the job is retried on failure the
     *        same number of attempts as the value.
     */

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    /**
     * <p>
     * The number of times to move a job to the <code>RUNNABLE</code> status. You can specify between 1 and 10 attempts.
     * If the value of <code>attempts</code> is greater than one, the job is retried on failure the same number of
     * attempts as the value.
     * </p>
     * 
     * @return The number of times to move a job to the <code>RUNNABLE</code> status. You can specify between 1 and 10
     *         attempts. If the value of <code>attempts</code> is greater than one, the job is retried on failure the
     *         same number of attempts as the value.
     */

    public Integer getAttempts() {
        return this.attempts;
    }

    /**
     * <p>
     * The number of times to move a job to the <code>RUNNABLE</code> status. You can specify between 1 and 10 attempts.
     * If the value of <code>attempts</code> is greater than one, the job is retried on failure the same number of
     * attempts as the value.
     * </p>
     * 
     * @param attempts
     *        The number of times to move a job to the <code>RUNNABLE</code> status. You can specify between 1 and 10
     *        attempts. If the value of <code>attempts</code> is greater than one, the job is retried on failure the
     *        same number of attempts as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryStrategy withAttempts(Integer attempts) {
        setAttempts(attempts);
        return this;
    }

    /**
     * <p>
     * Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this
     * parameter is specified, then the <code>attempts</code> parameter must also be specified.
     * </p>
     * 
     * @return Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this
     *         parameter is specified, then the <code>attempts</code> parameter must also be specified.
     */

    public java.util.List<EvaluateOnExit> getEvaluateOnExit() {
        return evaluateOnExit;
    }

    /**
     * <p>
     * Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this
     * parameter is specified, then the <code>attempts</code> parameter must also be specified.
     * </p>
     * 
     * @param evaluateOnExit
     *        Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this
     *        parameter is specified, then the <code>attempts</code> parameter must also be specified.
     */

    public void setEvaluateOnExit(java.util.Collection<EvaluateOnExit> evaluateOnExit) {
        if (evaluateOnExit == null) {
            this.evaluateOnExit = null;
            return;
        }

        this.evaluateOnExit = new java.util.ArrayList<EvaluateOnExit>(evaluateOnExit);
    }

    /**
     * <p>
     * Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this
     * parameter is specified, then the <code>attempts</code> parameter must also be specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluateOnExit(java.util.Collection)} or {@link #withEvaluateOnExit(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param evaluateOnExit
     *        Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this
     *        parameter is specified, then the <code>attempts</code> parameter must also be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryStrategy withEvaluateOnExit(EvaluateOnExit... evaluateOnExit) {
        if (this.evaluateOnExit == null) {
            setEvaluateOnExit(new java.util.ArrayList<EvaluateOnExit>(evaluateOnExit.length));
        }
        for (EvaluateOnExit ele : evaluateOnExit) {
            this.evaluateOnExit.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this
     * parameter is specified, then the <code>attempts</code> parameter must also be specified.
     * </p>
     * 
     * @param evaluateOnExit
     *        Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this
     *        parameter is specified, then the <code>attempts</code> parameter must also be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryStrategy withEvaluateOnExit(java.util.Collection<EvaluateOnExit> evaluateOnExit) {
        setEvaluateOnExit(evaluateOnExit);
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
        if (getAttempts() != null)
            sb.append("Attempts: ").append(getAttempts()).append(",");
        if (getEvaluateOnExit() != null)
            sb.append("EvaluateOnExit: ").append(getEvaluateOnExit());
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
        if (other.getAttempts() == null ^ this.getAttempts() == null)
            return false;
        if (other.getAttempts() != null && other.getAttempts().equals(this.getAttempts()) == false)
            return false;
        if (other.getEvaluateOnExit() == null ^ this.getEvaluateOnExit() == null)
            return false;
        if (other.getEvaluateOnExit() != null && other.getEvaluateOnExit().equals(this.getEvaluateOnExit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttempts() == null) ? 0 : getAttempts().hashCode());
        hashCode = prime * hashCode + ((getEvaluateOnExit() == null) ? 0 : getEvaluateOnExit().hashCode());
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
        com.amazonaws.services.batch.model.transform.RetryStrategyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
