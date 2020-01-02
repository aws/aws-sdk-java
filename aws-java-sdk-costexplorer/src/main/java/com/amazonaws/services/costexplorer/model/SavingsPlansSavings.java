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
 * The amount of savings you're accumulating, against the public On-Demand rate of the usage accrued in an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansSavings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansSavings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when compared to
     * the On-Demand equivalent of the same usage.
     * </p>
     */
    private String netSavings;
    /**
     * <p>
     * How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
     * </p>
     */
    private String onDemandCostEquivalent;

    /**
     * <p>
     * The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when compared to
     * the On-Demand equivalent of the same usage.
     * </p>
     * 
     * @param netSavings
     *        The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when
     *        compared to the On-Demand equivalent of the same usage.
     */

    public void setNetSavings(String netSavings) {
        this.netSavings = netSavings;
    }

    /**
     * <p>
     * The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when compared to
     * the On-Demand equivalent of the same usage.
     * </p>
     * 
     * @return The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when
     *         compared to the On-Demand equivalent of the same usage.
     */

    public String getNetSavings() {
        return this.netSavings;
    }

    /**
     * <p>
     * The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when compared to
     * the On-Demand equivalent of the same usage.
     * </p>
     * 
     * @param netSavings
     *        The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when
     *        compared to the On-Demand equivalent of the same usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansSavings withNetSavings(String netSavings) {
        setNetSavings(netSavings);
        return this;
    }

    /**
     * <p>
     * How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
     * </p>
     * 
     * @param onDemandCostEquivalent
     *        How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
     */

    public void setOnDemandCostEquivalent(String onDemandCostEquivalent) {
        this.onDemandCostEquivalent = onDemandCostEquivalent;
    }

    /**
     * <p>
     * How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
     * </p>
     * 
     * @return How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
     */

    public String getOnDemandCostEquivalent() {
        return this.onDemandCostEquivalent;
    }

    /**
     * <p>
     * How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
     * </p>
     * 
     * @param onDemandCostEquivalent
     *        How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansSavings withOnDemandCostEquivalent(String onDemandCostEquivalent) {
        setOnDemandCostEquivalent(onDemandCostEquivalent);
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
        if (getNetSavings() != null)
            sb.append("NetSavings: ").append(getNetSavings()).append(",");
        if (getOnDemandCostEquivalent() != null)
            sb.append("OnDemandCostEquivalent: ").append(getOnDemandCostEquivalent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansSavings == false)
            return false;
        SavingsPlansSavings other = (SavingsPlansSavings) obj;
        if (other.getNetSavings() == null ^ this.getNetSavings() == null)
            return false;
        if (other.getNetSavings() != null && other.getNetSavings().equals(this.getNetSavings()) == false)
            return false;
        if (other.getOnDemandCostEquivalent() == null ^ this.getOnDemandCostEquivalent() == null)
            return false;
        if (other.getOnDemandCostEquivalent() != null && other.getOnDemandCostEquivalent().equals(this.getOnDemandCostEquivalent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetSavings() == null) ? 0 : getNetSavings().hashCode());
        hashCode = prime * hashCode + ((getOnDemandCostEquivalent() == null) ? 0 : getOnDemandCostEquivalent().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansSavings clone() {
        try {
            return (SavingsPlansSavings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansSavingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
