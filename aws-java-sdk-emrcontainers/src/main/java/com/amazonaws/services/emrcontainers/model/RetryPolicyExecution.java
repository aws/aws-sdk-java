/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The current status of the retry policy executed on the job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/RetryPolicyExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryPolicyExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current number of attempts made on the driver of the job.
     * </p>
     */
    private Integer currentAttemptCount;

    /**
     * <p>
     * The current number of attempts made on the driver of the job.
     * </p>
     * 
     * @param currentAttemptCount
     *        The current number of attempts made on the driver of the job.
     */

    public void setCurrentAttemptCount(Integer currentAttemptCount) {
        this.currentAttemptCount = currentAttemptCount;
    }

    /**
     * <p>
     * The current number of attempts made on the driver of the job.
     * </p>
     * 
     * @return The current number of attempts made on the driver of the job.
     */

    public Integer getCurrentAttemptCount() {
        return this.currentAttemptCount;
    }

    /**
     * <p>
     * The current number of attempts made on the driver of the job.
     * </p>
     * 
     * @param currentAttemptCount
     *        The current number of attempts made on the driver of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryPolicyExecution withCurrentAttemptCount(Integer currentAttemptCount) {
        setCurrentAttemptCount(currentAttemptCount);
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
        if (getCurrentAttemptCount() != null)
            sb.append("CurrentAttemptCount: ").append(getCurrentAttemptCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryPolicyExecution == false)
            return false;
        RetryPolicyExecution other = (RetryPolicyExecution) obj;
        if (other.getCurrentAttemptCount() == null ^ this.getCurrentAttemptCount() == null)
            return false;
        if (other.getCurrentAttemptCount() != null && other.getCurrentAttemptCount().equals(this.getCurrentAttemptCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentAttemptCount() == null) ? 0 : getCurrentAttemptCount().hashCode());
        return hashCode;
    }

    @Override
    public RetryPolicyExecution clone() {
        try {
            return (RetryPolicyExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.RetryPolicyExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
