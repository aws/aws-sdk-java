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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>RetryPolicy</code> object that includes information about the retry policy settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RetryPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of retry attempts to make before the request fails. Retry attempts continue until either the
     * maximum number of attempts is made or until the duration of the <code>MaximumEventAgeInSeconds</code> is met.
     * </p>
     */
    private Integer maximumRetryAttempts;
    /**
     * <p>
     * The maximum amount of time, in seconds, to continue to make retry attempts.
     * </p>
     */
    private Integer maximumEventAgeInSeconds;

    /**
     * <p>
     * The maximum number of retry attempts to make before the request fails. Retry attempts continue until either the
     * maximum number of attempts is made or until the duration of the <code>MaximumEventAgeInSeconds</code> is met.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        The maximum number of retry attempts to make before the request fails. Retry attempts continue until
     *        either the maximum number of attempts is made or until the duration of the
     *        <code>MaximumEventAgeInSeconds</code> is met.
     */

    public void setMaximumRetryAttempts(Integer maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    /**
     * <p>
     * The maximum number of retry attempts to make before the request fails. Retry attempts continue until either the
     * maximum number of attempts is made or until the duration of the <code>MaximumEventAgeInSeconds</code> is met.
     * </p>
     * 
     * @return The maximum number of retry attempts to make before the request fails. Retry attempts continue until
     *         either the maximum number of attempts is made or until the duration of the
     *         <code>MaximumEventAgeInSeconds</code> is met.
     */

    public Integer getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }

    /**
     * <p>
     * The maximum number of retry attempts to make before the request fails. Retry attempts continue until either the
     * maximum number of attempts is made or until the duration of the <code>MaximumEventAgeInSeconds</code> is met.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        The maximum number of retry attempts to make before the request fails. Retry attempts continue until
     *        either the maximum number of attempts is made or until the duration of the
     *        <code>MaximumEventAgeInSeconds</code> is met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryPolicy withMaximumRetryAttempts(Integer maximumRetryAttempts) {
        setMaximumRetryAttempts(maximumRetryAttempts);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, to continue to make retry attempts.
     * </p>
     * 
     * @param maximumEventAgeInSeconds
     *        The maximum amount of time, in seconds, to continue to make retry attempts.
     */

    public void setMaximumEventAgeInSeconds(Integer maximumEventAgeInSeconds) {
        this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, to continue to make retry attempts.
     * </p>
     * 
     * @return The maximum amount of time, in seconds, to continue to make retry attempts.
     */

    public Integer getMaximumEventAgeInSeconds() {
        return this.maximumEventAgeInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, to continue to make retry attempts.
     * </p>
     * 
     * @param maximumEventAgeInSeconds
     *        The maximum amount of time, in seconds, to continue to make retry attempts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryPolicy withMaximumEventAgeInSeconds(Integer maximumEventAgeInSeconds) {
        setMaximumEventAgeInSeconds(maximumEventAgeInSeconds);
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
            sb.append("MaximumRetryAttempts: ").append(getMaximumRetryAttempts()).append(",");
        if (getMaximumEventAgeInSeconds() != null)
            sb.append("MaximumEventAgeInSeconds: ").append(getMaximumEventAgeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryPolicy == false)
            return false;
        RetryPolicy other = (RetryPolicy) obj;
        if (other.getMaximumRetryAttempts() == null ^ this.getMaximumRetryAttempts() == null)
            return false;
        if (other.getMaximumRetryAttempts() != null && other.getMaximumRetryAttempts().equals(this.getMaximumRetryAttempts()) == false)
            return false;
        if (other.getMaximumEventAgeInSeconds() == null ^ this.getMaximumEventAgeInSeconds() == null)
            return false;
        if (other.getMaximumEventAgeInSeconds() != null && other.getMaximumEventAgeInSeconds().equals(this.getMaximumEventAgeInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumRetryAttempts() == null) ? 0 : getMaximumRetryAttempts().hashCode());
        hashCode = prime * hashCode + ((getMaximumEventAgeInSeconds() == null) ? 0 : getMaximumEventAgeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public RetryPolicy clone() {
        try {
            return (RetryPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.RetryPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
