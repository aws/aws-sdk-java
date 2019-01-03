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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of abort criteria to define rules to abort the job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbortCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job abort.
     * </p>
     */
    private String failureType;
    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The threshold as a percentage of the total number of executed things that will initiate a job abort.
     * </p>
     * <p>
     * AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
     * </p>
     */
    private Double thresholdPercentage;
    /**
     * <p>
     * Minimum number of executed things before evaluating an abort rule.
     * </p>
     */
    private Integer minNumberOfExecutedThings;

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job abort.
     * </p>
     * 
     * @param failureType
     *        The type of job execution failure to define a rule to initiate a job abort.
     * @see JobExecutionFailureType
     */

    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job abort.
     * </p>
     * 
     * @return The type of job execution failure to define a rule to initiate a job abort.
     * @see JobExecutionFailureType
     */

    public String getFailureType() {
        return this.failureType;
    }

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job abort.
     * </p>
     * 
     * @param failureType
     *        The type of job execution failure to define a rule to initiate a job abort.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobExecutionFailureType
     */

    public AbortCriteria withFailureType(String failureType) {
        setFailureType(failureType);
        return this;
    }

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job abort.
     * </p>
     * 
     * @param failureType
     *        The type of job execution failure to define a rule to initiate a job abort.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobExecutionFailureType
     */

    public AbortCriteria withFailureType(JobExecutionFailureType failureType) {
        this.failureType = failureType.toString();
        return this;
    }

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * 
     * @param action
     *        The type of abort action to initiate a job abort.
     * @see AbortAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * 
     * @return The type of abort action to initiate a job abort.
     * @see AbortAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * 
     * @param action
     *        The type of abort action to initiate a job abort.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AbortAction
     */

    public AbortCriteria withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * 
     * @param action
     *        The type of abort action to initiate a job abort.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AbortAction
     */

    public AbortCriteria withAction(AbortAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The threshold as a percentage of the total number of executed things that will initiate a job abort.
     * </p>
     * <p>
     * AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
     * </p>
     * 
     * @param thresholdPercentage
     *        The threshold as a percentage of the total number of executed things that will initiate a job abort.</p>
     *        <p>
     *        AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
     */

    public void setThresholdPercentage(Double thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }

    /**
     * <p>
     * The threshold as a percentage of the total number of executed things that will initiate a job abort.
     * </p>
     * <p>
     * AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
     * </p>
     * 
     * @return The threshold as a percentage of the total number of executed things that will initiate a job abort.</p>
     *         <p>
     *         AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
     */

    public Double getThresholdPercentage() {
        return this.thresholdPercentage;
    }

    /**
     * <p>
     * The threshold as a percentage of the total number of executed things that will initiate a job abort.
     * </p>
     * <p>
     * AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
     * </p>
     * 
     * @param thresholdPercentage
     *        The threshold as a percentage of the total number of executed things that will initiate a job abort.</p>
     *        <p>
     *        AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbortCriteria withThresholdPercentage(Double thresholdPercentage) {
        setThresholdPercentage(thresholdPercentage);
        return this;
    }

    /**
     * <p>
     * Minimum number of executed things before evaluating an abort rule.
     * </p>
     * 
     * @param minNumberOfExecutedThings
     *        Minimum number of executed things before evaluating an abort rule.
     */

    public void setMinNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
        this.minNumberOfExecutedThings = minNumberOfExecutedThings;
    }

    /**
     * <p>
     * Minimum number of executed things before evaluating an abort rule.
     * </p>
     * 
     * @return Minimum number of executed things before evaluating an abort rule.
     */

    public Integer getMinNumberOfExecutedThings() {
        return this.minNumberOfExecutedThings;
    }

    /**
     * <p>
     * Minimum number of executed things before evaluating an abort rule.
     * </p>
     * 
     * @param minNumberOfExecutedThings
     *        Minimum number of executed things before evaluating an abort rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbortCriteria withMinNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
        setMinNumberOfExecutedThings(minNumberOfExecutedThings);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getThresholdPercentage() != null)
            sb.append("ThresholdPercentage: ").append(getThresholdPercentage()).append(",");
        if (getMinNumberOfExecutedThings() != null)
            sb.append("MinNumberOfExecutedThings: ").append(getMinNumberOfExecutedThings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbortCriteria == false)
            return false;
        AbortCriteria other = (AbortCriteria) obj;
        if (other.getFailureType() == null ^ this.getFailureType() == null)
            return false;
        if (other.getFailureType() != null && other.getFailureType().equals(this.getFailureType()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getThresholdPercentage() == null ^ this.getThresholdPercentage() == null)
            return false;
        if (other.getThresholdPercentage() != null && other.getThresholdPercentage().equals(this.getThresholdPercentage()) == false)
            return false;
        if (other.getMinNumberOfExecutedThings() == null ^ this.getMinNumberOfExecutedThings() == null)
            return false;
        if (other.getMinNumberOfExecutedThings() != null && other.getMinNumberOfExecutedThings().equals(this.getMinNumberOfExecutedThings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureType() == null) ? 0 : getFailureType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getThresholdPercentage() == null) ? 0 : getThresholdPercentage().hashCode());
        hashCode = prime * hashCode + ((getMinNumberOfExecutedThings() == null) ? 0 : getMinNumberOfExecutedThings().hashCode());
        return hashCode;
    }

    @Override
    public AbortCriteria clone() {
        try {
            return (AbortCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AbortCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
