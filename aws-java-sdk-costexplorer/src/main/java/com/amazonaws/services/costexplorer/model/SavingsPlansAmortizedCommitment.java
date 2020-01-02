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
 * The amortized amount of Savings Plans purchased in a specific account during a specific time interval.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansAmortizedCommitment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansAmortizedCommitment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased with either a <code>Partial</code> or a
     * <code>NoUpfront</code>.
     * </p>
     */
    private String amortizedRecurringCommitment;
    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased with an <code>Upfront</code> or
     * <code>PartialUpfront</code> Savings Plans.
     * </p>
     */
    private String amortizedUpfrontCommitment;
    /**
     * <p>
     * The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase method.
     * </p>
     */
    private String totalAmortizedCommitment;

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased with either a <code>Partial</code> or a
     * <code>NoUpfront</code>.
     * </p>
     * 
     * @param amortizedRecurringCommitment
     *        The amortized amount of your Savings Plans commitment that was purchased with either a
     *        <code>Partial</code> or a <code>NoUpfront</code>.
     */

    public void setAmortizedRecurringCommitment(String amortizedRecurringCommitment) {
        this.amortizedRecurringCommitment = amortizedRecurringCommitment;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased with either a <code>Partial</code> or a
     * <code>NoUpfront</code>.
     * </p>
     * 
     * @return The amortized amount of your Savings Plans commitment that was purchased with either a
     *         <code>Partial</code> or a <code>NoUpfront</code>.
     */

    public String getAmortizedRecurringCommitment() {
        return this.amortizedRecurringCommitment;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased with either a <code>Partial</code> or a
     * <code>NoUpfront</code>.
     * </p>
     * 
     * @param amortizedRecurringCommitment
     *        The amortized amount of your Savings Plans commitment that was purchased with either a
     *        <code>Partial</code> or a <code>NoUpfront</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansAmortizedCommitment withAmortizedRecurringCommitment(String amortizedRecurringCommitment) {
        setAmortizedRecurringCommitment(amortizedRecurringCommitment);
        return this;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased with an <code>Upfront</code> or
     * <code>PartialUpfront</code> Savings Plans.
     * </p>
     * 
     * @param amortizedUpfrontCommitment
     *        The amortized amount of your Savings Plans commitment that was purchased with an <code>Upfront</code> or
     *        <code>PartialUpfront</code> Savings Plans.
     */

    public void setAmortizedUpfrontCommitment(String amortizedUpfrontCommitment) {
        this.amortizedUpfrontCommitment = amortizedUpfrontCommitment;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased with an <code>Upfront</code> or
     * <code>PartialUpfront</code> Savings Plans.
     * </p>
     * 
     * @return The amortized amount of your Savings Plans commitment that was purchased with an <code>Upfront</code> or
     *         <code>PartialUpfront</code> Savings Plans.
     */

    public String getAmortizedUpfrontCommitment() {
        return this.amortizedUpfrontCommitment;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased with an <code>Upfront</code> or
     * <code>PartialUpfront</code> Savings Plans.
     * </p>
     * 
     * @param amortizedUpfrontCommitment
     *        The amortized amount of your Savings Plans commitment that was purchased with an <code>Upfront</code> or
     *        <code>PartialUpfront</code> Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansAmortizedCommitment withAmortizedUpfrontCommitment(String amortizedUpfrontCommitment) {
        setAmortizedUpfrontCommitment(amortizedUpfrontCommitment);
        return this;
    }

    /**
     * <p>
     * The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase method.
     * </p>
     * 
     * @param totalAmortizedCommitment
     *        The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase
     *        method.
     */

    public void setTotalAmortizedCommitment(String totalAmortizedCommitment) {
        this.totalAmortizedCommitment = totalAmortizedCommitment;
    }

    /**
     * <p>
     * The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase method.
     * </p>
     * 
     * @return The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase
     *         method.
     */

    public String getTotalAmortizedCommitment() {
        return this.totalAmortizedCommitment;
    }

    /**
     * <p>
     * The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase method.
     * </p>
     * 
     * @param totalAmortizedCommitment
     *        The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase
     *        method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansAmortizedCommitment withTotalAmortizedCommitment(String totalAmortizedCommitment) {
        setTotalAmortizedCommitment(totalAmortizedCommitment);
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
        if (getAmortizedRecurringCommitment() != null)
            sb.append("AmortizedRecurringCommitment: ").append(getAmortizedRecurringCommitment()).append(",");
        if (getAmortizedUpfrontCommitment() != null)
            sb.append("AmortizedUpfrontCommitment: ").append(getAmortizedUpfrontCommitment()).append(",");
        if (getTotalAmortizedCommitment() != null)
            sb.append("TotalAmortizedCommitment: ").append(getTotalAmortizedCommitment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansAmortizedCommitment == false)
            return false;
        SavingsPlansAmortizedCommitment other = (SavingsPlansAmortizedCommitment) obj;
        if (other.getAmortizedRecurringCommitment() == null ^ this.getAmortizedRecurringCommitment() == null)
            return false;
        if (other.getAmortizedRecurringCommitment() != null && other.getAmortizedRecurringCommitment().equals(this.getAmortizedRecurringCommitment()) == false)
            return false;
        if (other.getAmortizedUpfrontCommitment() == null ^ this.getAmortizedUpfrontCommitment() == null)
            return false;
        if (other.getAmortizedUpfrontCommitment() != null && other.getAmortizedUpfrontCommitment().equals(this.getAmortizedUpfrontCommitment()) == false)
            return false;
        if (other.getTotalAmortizedCommitment() == null ^ this.getTotalAmortizedCommitment() == null)
            return false;
        if (other.getTotalAmortizedCommitment() != null && other.getTotalAmortizedCommitment().equals(this.getTotalAmortizedCommitment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmortizedRecurringCommitment() == null) ? 0 : getAmortizedRecurringCommitment().hashCode());
        hashCode = prime * hashCode + ((getAmortizedUpfrontCommitment() == null) ? 0 : getAmortizedUpfrontCommitment().hashCode());
        hashCode = prime * hashCode + ((getTotalAmortizedCommitment() == null) ? 0 : getTotalAmortizedCommitment().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansAmortizedCommitment clone() {
        try {
            return (SavingsPlansAmortizedCommitment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansAmortizedCommitmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
