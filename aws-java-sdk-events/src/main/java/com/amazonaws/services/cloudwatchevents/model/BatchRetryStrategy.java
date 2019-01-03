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
 * The retry strategy to use for failed jobs, if the target is an AWS Batch job. If you specify a retry strategy here,
 * it overrides the retry strategy defined in the job definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/BatchRetryStrategy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchRetryStrategy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of times to attempt to retry, if the job fails. Valid values are 1–10.
     * </p>
     */
    private Integer attempts;

    /**
     * <p>
     * The number of times to attempt to retry, if the job fails. Valid values are 1–10.
     * </p>
     * 
     * @param attempts
     *        The number of times to attempt to retry, if the job fails. Valid values are 1–10.
     */

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    /**
     * <p>
     * The number of times to attempt to retry, if the job fails. Valid values are 1–10.
     * </p>
     * 
     * @return The number of times to attempt to retry, if the job fails. Valid values are 1–10.
     */

    public Integer getAttempts() {
        return this.attempts;
    }

    /**
     * <p>
     * The number of times to attempt to retry, if the job fails. Valid values are 1–10.
     * </p>
     * 
     * @param attempts
     *        The number of times to attempt to retry, if the job fails. Valid values are 1–10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchRetryStrategy withAttempts(Integer attempts) {
        setAttempts(attempts);
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
            sb.append("Attempts: ").append(getAttempts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchRetryStrategy == false)
            return false;
        BatchRetryStrategy other = (BatchRetryStrategy) obj;
        if (other.getAttempts() == null ^ this.getAttempts() == null)
            return false;
        if (other.getAttempts() != null && other.getAttempts().equals(this.getAttempts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttempts() == null) ? 0 : getAttempts().hashCode());
        return hashCode;
    }

    @Override
    public BatchRetryStrategy clone() {
        try {
            return (BatchRetryStrategy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.BatchRetryStrategyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
