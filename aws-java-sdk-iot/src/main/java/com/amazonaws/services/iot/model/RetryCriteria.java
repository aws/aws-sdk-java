/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria that determines how many retries are allowed for each failure type for a job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     */
    private String failureType;
    /**
     * <p>
     * The number of retries allowed for a failure type for the job.
     * </p>
     */
    private Integer numberOfRetries;

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * 
     * @param failureType
     *        The type of job execution failures that can initiate a job retry.
     * @see RetryableFailureType
     */

    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * 
     * @return The type of job execution failures that can initiate a job retry.
     * @see RetryableFailureType
     */

    public String getFailureType() {
        return this.failureType;
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * 
     * @param failureType
     *        The type of job execution failures that can initiate a job retry.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetryableFailureType
     */

    public RetryCriteria withFailureType(String failureType) {
        setFailureType(failureType);
        return this;
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * 
     * @param failureType
     *        The type of job execution failures that can initiate a job retry.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetryableFailureType
     */

    public RetryCriteria withFailureType(RetryableFailureType failureType) {
        this.failureType = failureType.toString();
        return this;
    }

    /**
     * <p>
     * The number of retries allowed for a failure type for the job.
     * </p>
     * 
     * @param numberOfRetries
     *        The number of retries allowed for a failure type for the job.
     */

    public void setNumberOfRetries(Integer numberOfRetries) {
        this.numberOfRetries = numberOfRetries;
    }

    /**
     * <p>
     * The number of retries allowed for a failure type for the job.
     * </p>
     * 
     * @return The number of retries allowed for a failure type for the job.
     */

    public Integer getNumberOfRetries() {
        return this.numberOfRetries;
    }

    /**
     * <p>
     * The number of retries allowed for a failure type for the job.
     * </p>
     * 
     * @param numberOfRetries
     *        The number of retries allowed for a failure type for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryCriteria withNumberOfRetries(Integer numberOfRetries) {
        setNumberOfRetries(numberOfRetries);
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
        if (getFailureType() != null)
            sb.append("FailureType: ").append(getFailureType()).append(",");
        if (getNumberOfRetries() != null)
            sb.append("NumberOfRetries: ").append(getNumberOfRetries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryCriteria == false)
            return false;
        RetryCriteria other = (RetryCriteria) obj;
        if (other.getFailureType() == null ^ this.getFailureType() == null)
            return false;
        if (other.getFailureType() != null && other.getFailureType().equals(this.getFailureType()) == false)
            return false;
        if (other.getNumberOfRetries() == null ^ this.getNumberOfRetries() == null)
            return false;
        if (other.getNumberOfRetries() != null && other.getNumberOfRetries().equals(this.getNumberOfRetries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureType() == null) ? 0 : getFailureType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRetries() == null) ? 0 : getNumberOfRetries().hashCode());
        return hashCode;
    }

    @Override
    public RetryCriteria clone() {
        try {
            return (RetryCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.RetryCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
