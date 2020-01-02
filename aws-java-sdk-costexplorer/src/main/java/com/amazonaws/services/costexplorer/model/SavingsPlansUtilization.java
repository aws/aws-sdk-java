/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The measurement of how well you are using your existing Savings Plans.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansUtilization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
     * </p>
     */
    private String totalCommitment;
    /**
     * <p>
     * The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a specific
     * period.
     * </p>
     */
    private String usedCommitment;
    /**
     * <p>
     * The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a specific
     * period.
     * </p>
     */
    private String unusedCommitment;
    /**
     * <p>
     * The amount of <code>UsedCommitment</code> divided by the <code>TotalCommitment</code> for your Savings Plans.
     * </p>
     */
    private String utilizationPercentage;

    /**
     * <p>
     * The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
     * </p>
     * 
     * @param totalCommitment
     *        The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
     */

    public void setTotalCommitment(String totalCommitment) {
        this.totalCommitment = totalCommitment;
    }

    /**
     * <p>
     * The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
     * </p>
     * 
     * @return The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
     */

    public String getTotalCommitment() {
        return this.totalCommitment;
    }

    /**
     * <p>
     * The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
     * </p>
     * 
     * @param totalCommitment
     *        The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansUtilization withTotalCommitment(String totalCommitment) {
        setTotalCommitment(totalCommitment);
        return this;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a specific
     * period.
     * </p>
     * 
     * @param usedCommitment
     *        The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a
     *        specific period.
     */

    public void setUsedCommitment(String usedCommitment) {
        this.usedCommitment = usedCommitment;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a specific
     * period.
     * </p>
     * 
     * @return The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a
     *         specific period.
     */

    public String getUsedCommitment() {
        return this.usedCommitment;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a specific
     * period.
     * </p>
     * 
     * @param usedCommitment
     *        The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a
     *        specific period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansUtilization withUsedCommitment(String usedCommitment) {
        setUsedCommitment(usedCommitment);
        return this;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a specific
     * period.
     * </p>
     * 
     * @param unusedCommitment
     *        The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a
     *        specific period.
     */

    public void setUnusedCommitment(String unusedCommitment) {
        this.unusedCommitment = unusedCommitment;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a specific
     * period.
     * </p>
     * 
     * @return The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a
     *         specific period.
     */

    public String getUnusedCommitment() {
        return this.unusedCommitment;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a specific
     * period.
     * </p>
     * 
     * @param unusedCommitment
     *        The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a
     *        specific period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansUtilization withUnusedCommitment(String unusedCommitment) {
        setUnusedCommitment(unusedCommitment);
        return this;
    }

    /**
     * <p>
     * The amount of <code>UsedCommitment</code> divided by the <code>TotalCommitment</code> for your Savings Plans.
     * </p>
     * 
     * @param utilizationPercentage
     *        The amount of <code>UsedCommitment</code> divided by the <code>TotalCommitment</code> for your Savings
     *        Plans.
     */

    public void setUtilizationPercentage(String utilizationPercentage) {
        this.utilizationPercentage = utilizationPercentage;
    }

    /**
     * <p>
     * The amount of <code>UsedCommitment</code> divided by the <code>TotalCommitment</code> for your Savings Plans.
     * </p>
     * 
     * @return The amount of <code>UsedCommitment</code> divided by the <code>TotalCommitment</code> for your Savings
     *         Plans.
     */

    public String getUtilizationPercentage() {
        return this.utilizationPercentage;
    }

    /**
     * <p>
     * The amount of <code>UsedCommitment</code> divided by the <code>TotalCommitment</code> for your Savings Plans.
     * </p>
     * 
     * @param utilizationPercentage
     *        The amount of <code>UsedCommitment</code> divided by the <code>TotalCommitment</code> for your Savings
     *        Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansUtilization withUtilizationPercentage(String utilizationPercentage) {
        setUtilizationPercentage(utilizationPercentage);
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
        if (getTotalCommitment() != null)
            sb.append("TotalCommitment: ").append(getTotalCommitment()).append(",");
        if (getUsedCommitment() != null)
            sb.append("UsedCommitment: ").append(getUsedCommitment()).append(",");
        if (getUnusedCommitment() != null)
            sb.append("UnusedCommitment: ").append(getUnusedCommitment()).append(",");
        if (getUtilizationPercentage() != null)
            sb.append("UtilizationPercentage: ").append(getUtilizationPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansUtilization == false)
            return false;
        SavingsPlansUtilization other = (SavingsPlansUtilization) obj;
        if (other.getTotalCommitment() == null ^ this.getTotalCommitment() == null)
            return false;
        if (other.getTotalCommitment() != null && other.getTotalCommitment().equals(this.getTotalCommitment()) == false)
            return false;
        if (other.getUsedCommitment() == null ^ this.getUsedCommitment() == null)
            return false;
        if (other.getUsedCommitment() != null && other.getUsedCommitment().equals(this.getUsedCommitment()) == false)
            return false;
        if (other.getUnusedCommitment() == null ^ this.getUnusedCommitment() == null)
            return false;
        if (other.getUnusedCommitment() != null && other.getUnusedCommitment().equals(this.getUnusedCommitment()) == false)
            return false;
        if (other.getUtilizationPercentage() == null ^ this.getUtilizationPercentage() == null)
            return false;
        if (other.getUtilizationPercentage() != null && other.getUtilizationPercentage().equals(this.getUtilizationPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCommitment() == null) ? 0 : getTotalCommitment().hashCode());
        hashCode = prime * hashCode + ((getUsedCommitment() == null) ? 0 : getUsedCommitment().hashCode());
        hashCode = prime * hashCode + ((getUnusedCommitment() == null) ? 0 : getUnusedCommitment().hashCode());
        hashCode = prime * hashCode + ((getUtilizationPercentage() == null) ? 0 : getUtilizationPercentage().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansUtilization clone() {
        try {
            return (SavingsPlansUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansUtilizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
