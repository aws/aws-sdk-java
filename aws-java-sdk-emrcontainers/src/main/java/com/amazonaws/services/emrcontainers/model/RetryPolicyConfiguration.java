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
 * The configuration of the retry policy that the job runs on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/RetryPolicyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryPolicyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of attempts on the job's driver.
     * </p>
     */
    private Integer maxAttempts;

    /**
     * <p>
     * The maximum number of attempts on the job's driver.
     * </p>
     * 
     * @param maxAttempts
     *        The maximum number of attempts on the job's driver.
     */

    public void setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    /**
     * <p>
     * The maximum number of attempts on the job's driver.
     * </p>
     * 
     * @return The maximum number of attempts on the job's driver.
     */

    public Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    /**
     * <p>
     * The maximum number of attempts on the job's driver.
     * </p>
     * 
     * @param maxAttempts
     *        The maximum number of attempts on the job's driver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryPolicyConfiguration withMaxAttempts(Integer maxAttempts) {
        setMaxAttempts(maxAttempts);
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
        if (getMaxAttempts() != null)
            sb.append("MaxAttempts: ").append(getMaxAttempts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryPolicyConfiguration == false)
            return false;
        RetryPolicyConfiguration other = (RetryPolicyConfiguration) obj;
        if (other.getMaxAttempts() == null ^ this.getMaxAttempts() == null)
            return false;
        if (other.getMaxAttempts() != null && other.getMaxAttempts().equals(this.getMaxAttempts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxAttempts() == null) ? 0 : getMaxAttempts().hashCode());
        return hashCode;
    }

    @Override
    public RetryPolicyConfiguration clone() {
        try {
            return (RetryPolicyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.RetryPolicyConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
