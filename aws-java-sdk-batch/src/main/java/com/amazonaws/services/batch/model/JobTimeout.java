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
 * An object representing a job timeout configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/JobTimeout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobTimeout implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time duration in seconds (measured from the job attempt's <code>startedAt</code> timestamp) after which AWS
     * Batch terminates your jobs if they have not finished.
     * </p>
     */
    private Integer attemptDurationSeconds;

    /**
     * <p>
     * The time duration in seconds (measured from the job attempt's <code>startedAt</code> timestamp) after which AWS
     * Batch terminates your jobs if they have not finished.
     * </p>
     * 
     * @param attemptDurationSeconds
     *        The time duration in seconds (measured from the job attempt's <code>startedAt</code> timestamp) after
     *        which AWS Batch terminates your jobs if they have not finished.
     */

    public void setAttemptDurationSeconds(Integer attemptDurationSeconds) {
        this.attemptDurationSeconds = attemptDurationSeconds;
    }

    /**
     * <p>
     * The time duration in seconds (measured from the job attempt's <code>startedAt</code> timestamp) after which AWS
     * Batch terminates your jobs if they have not finished.
     * </p>
     * 
     * @return The time duration in seconds (measured from the job attempt's <code>startedAt</code> timestamp) after
     *         which AWS Batch terminates your jobs if they have not finished.
     */

    public Integer getAttemptDurationSeconds() {
        return this.attemptDurationSeconds;
    }

    /**
     * <p>
     * The time duration in seconds (measured from the job attempt's <code>startedAt</code> timestamp) after which AWS
     * Batch terminates your jobs if they have not finished.
     * </p>
     * 
     * @param attemptDurationSeconds
     *        The time duration in seconds (measured from the job attempt's <code>startedAt</code> timestamp) after
     *        which AWS Batch terminates your jobs if they have not finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTimeout withAttemptDurationSeconds(Integer attemptDurationSeconds) {
        setAttemptDurationSeconds(attemptDurationSeconds);
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
        if (getAttemptDurationSeconds() != null)
            sb.append("AttemptDurationSeconds: ").append(getAttemptDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTimeout == false)
            return false;
        JobTimeout other = (JobTimeout) obj;
        if (other.getAttemptDurationSeconds() == null ^ this.getAttemptDurationSeconds() == null)
            return false;
        if (other.getAttemptDurationSeconds() != null && other.getAttemptDurationSeconds().equals(this.getAttemptDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttemptDurationSeconds() == null) ? 0 : getAttemptDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public JobTimeout clone() {
        try {
            return (JobTimeout) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.JobTimeoutMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
