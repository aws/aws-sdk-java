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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains criteria that define when and how to cancel a job.
 * </p>
 * <p>
 * The deployment stops if the following conditions are true:
 * </p>
 * <ol>
 * <li>
 * <p>
 * The number of things that receive the deployment exceeds the <code>minNumberOfExecutedThings</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The percentage of failures with type <code>failureType</code> exceeds the <code>thresholdPercentage</code>.
 * </p>
 * </li>
 * </ol>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/IoTJobAbortCriteria" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IoTJobAbortCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of job deployment failure that can cancel a job.
     * </p>
     */
    private String failureType;
    /**
     * <p>
     * The action to perform when the criteria are met.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The minimum percentage of <code>failureType</code> failures that occur before the job can cancel.
     * </p>
     * <p>
     * This parameter supports up to two digits after the decimal (for example, you can specify <code>10.9</code> or
     * <code>10.99</code>, but not <code>10.999</code>).
     * </p>
     */
    private Double thresholdPercentage;
    /**
     * <p>
     * The minimum number of things that receive the configuration before the job can cancel.
     * </p>
     */
    private Integer minNumberOfExecutedThings;

    /**
     * <p>
     * The type of job deployment failure that can cancel a job.
     * </p>
     * 
     * @param failureType
     *        The type of job deployment failure that can cancel a job.
     * @see IoTJobExecutionFailureType
     */

    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>
     * The type of job deployment failure that can cancel a job.
     * </p>
     * 
     * @return The type of job deployment failure that can cancel a job.
     * @see IoTJobExecutionFailureType
     */

    public String getFailureType() {
        return this.failureType;
    }

    /**
     * <p>
     * The type of job deployment failure that can cancel a job.
     * </p>
     * 
     * @param failureType
     *        The type of job deployment failure that can cancel a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IoTJobExecutionFailureType
     */

    public IoTJobAbortCriteria withFailureType(String failureType) {
        setFailureType(failureType);
        return this;
    }

    /**
     * <p>
     * The type of job deployment failure that can cancel a job.
     * </p>
     * 
     * @param failureType
     *        The type of job deployment failure that can cancel a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IoTJobExecutionFailureType
     */

    public IoTJobAbortCriteria withFailureType(IoTJobExecutionFailureType failureType) {
        this.failureType = failureType.toString();
        return this;
    }

    /**
     * <p>
     * The action to perform when the criteria are met.
     * </p>
     * 
     * @param action
     *        The action to perform when the criteria are met.
     * @see IoTJobAbortAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to perform when the criteria are met.
     * </p>
     * 
     * @return The action to perform when the criteria are met.
     * @see IoTJobAbortAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to perform when the criteria are met.
     * </p>
     * 
     * @param action
     *        The action to perform when the criteria are met.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IoTJobAbortAction
     */

    public IoTJobAbortCriteria withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to perform when the criteria are met.
     * </p>
     * 
     * @param action
     *        The action to perform when the criteria are met.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IoTJobAbortAction
     */

    public IoTJobAbortCriteria withAction(IoTJobAbortAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The minimum percentage of <code>failureType</code> failures that occur before the job can cancel.
     * </p>
     * <p>
     * This parameter supports up to two digits after the decimal (for example, you can specify <code>10.9</code> or
     * <code>10.99</code>, but not <code>10.999</code>).
     * </p>
     * 
     * @param thresholdPercentage
     *        The minimum percentage of <code>failureType</code> failures that occur before the job can cancel.</p>
     *        <p>
     *        This parameter supports up to two digits after the decimal (for example, you can specify <code>10.9</code>
     *        or <code>10.99</code>, but not <code>10.999</code>).
     */

    public void setThresholdPercentage(Double thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }

    /**
     * <p>
     * The minimum percentage of <code>failureType</code> failures that occur before the job can cancel.
     * </p>
     * <p>
     * This parameter supports up to two digits after the decimal (for example, you can specify <code>10.9</code> or
     * <code>10.99</code>, but not <code>10.999</code>).
     * </p>
     * 
     * @return The minimum percentage of <code>failureType</code> failures that occur before the job can cancel.</p>
     *         <p>
     *         This parameter supports up to two digits after the decimal (for example, you can specify
     *         <code>10.9</code> or <code>10.99</code>, but not <code>10.999</code>).
     */

    public Double getThresholdPercentage() {
        return this.thresholdPercentage;
    }

    /**
     * <p>
     * The minimum percentage of <code>failureType</code> failures that occur before the job can cancel.
     * </p>
     * <p>
     * This parameter supports up to two digits after the decimal (for example, you can specify <code>10.9</code> or
     * <code>10.99</code>, but not <code>10.999</code>).
     * </p>
     * 
     * @param thresholdPercentage
     *        The minimum percentage of <code>failureType</code> failures that occur before the job can cancel.</p>
     *        <p>
     *        This parameter supports up to two digits after the decimal (for example, you can specify <code>10.9</code>
     *        or <code>10.99</code>, but not <code>10.999</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobAbortCriteria withThresholdPercentage(Double thresholdPercentage) {
        setThresholdPercentage(thresholdPercentage);
        return this;
    }

    /**
     * <p>
     * The minimum number of things that receive the configuration before the job can cancel.
     * </p>
     * 
     * @param minNumberOfExecutedThings
     *        The minimum number of things that receive the configuration before the job can cancel.
     */

    public void setMinNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
        this.minNumberOfExecutedThings = minNumberOfExecutedThings;
    }

    /**
     * <p>
     * The minimum number of things that receive the configuration before the job can cancel.
     * </p>
     * 
     * @return The minimum number of things that receive the configuration before the job can cancel.
     */

    public Integer getMinNumberOfExecutedThings() {
        return this.minNumberOfExecutedThings;
    }

    /**
     * <p>
     * The minimum number of things that receive the configuration before the job can cancel.
     * </p>
     * 
     * @param minNumberOfExecutedThings
     *        The minimum number of things that receive the configuration before the job can cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobAbortCriteria withMinNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
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

        if (obj instanceof IoTJobAbortCriteria == false)
            return false;
        IoTJobAbortCriteria other = (IoTJobAbortCriteria) obj;
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
    public IoTJobAbortCriteria clone() {
        try {
            return (IoTJobAbortCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.IoTJobAbortCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
