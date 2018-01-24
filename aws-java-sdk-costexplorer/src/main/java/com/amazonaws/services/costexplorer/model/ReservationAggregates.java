/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The aggregated numbers for your RI usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ReservationAggregates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationAggregates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of RI time that you used.
     * </p>
     */
    private String utilizationPercentage;
    /**
     * <p>
     * How many RI hours you purchased.
     * </p>
     */
    private String purchasedHours;
    /**
     * <p>
     * The total number of RI hours that you used.
     * </p>
     */
    private String totalActualHours;
    /**
     * <p>
     * The number of RI hours that you didn't use.
     * </p>
     */
    private String unusedHours;

    /**
     * <p>
     * The percentage of RI time that you used.
     * </p>
     * 
     * @param utilizationPercentage
     *        The percentage of RI time that you used.
     */

    public void setUtilizationPercentage(String utilizationPercentage) {
        this.utilizationPercentage = utilizationPercentage;
    }

    /**
     * <p>
     * The percentage of RI time that you used.
     * </p>
     * 
     * @return The percentage of RI time that you used.
     */

    public String getUtilizationPercentage() {
        return this.utilizationPercentage;
    }

    /**
     * <p>
     * The percentage of RI time that you used.
     * </p>
     * 
     * @param utilizationPercentage
     *        The percentage of RI time that you used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withUtilizationPercentage(String utilizationPercentage) {
        setUtilizationPercentage(utilizationPercentage);
        return this;
    }

    /**
     * <p>
     * How many RI hours you purchased.
     * </p>
     * 
     * @param purchasedHours
     *        How many RI hours you purchased.
     */

    public void setPurchasedHours(String purchasedHours) {
        this.purchasedHours = purchasedHours;
    }

    /**
     * <p>
     * How many RI hours you purchased.
     * </p>
     * 
     * @return How many RI hours you purchased.
     */

    public String getPurchasedHours() {
        return this.purchasedHours;
    }

    /**
     * <p>
     * How many RI hours you purchased.
     * </p>
     * 
     * @param purchasedHours
     *        How many RI hours you purchased.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withPurchasedHours(String purchasedHours) {
        setPurchasedHours(purchasedHours);
        return this;
    }

    /**
     * <p>
     * The total number of RI hours that you used.
     * </p>
     * 
     * @param totalActualHours
     *        The total number of RI hours that you used.
     */

    public void setTotalActualHours(String totalActualHours) {
        this.totalActualHours = totalActualHours;
    }

    /**
     * <p>
     * The total number of RI hours that you used.
     * </p>
     * 
     * @return The total number of RI hours that you used.
     */

    public String getTotalActualHours() {
        return this.totalActualHours;
    }

    /**
     * <p>
     * The total number of RI hours that you used.
     * </p>
     * 
     * @param totalActualHours
     *        The total number of RI hours that you used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withTotalActualHours(String totalActualHours) {
        setTotalActualHours(totalActualHours);
        return this;
    }

    /**
     * <p>
     * The number of RI hours that you didn't use.
     * </p>
     * 
     * @param unusedHours
     *        The number of RI hours that you didn't use.
     */

    public void setUnusedHours(String unusedHours) {
        this.unusedHours = unusedHours;
    }

    /**
     * <p>
     * The number of RI hours that you didn't use.
     * </p>
     * 
     * @return The number of RI hours that you didn't use.
     */

    public String getUnusedHours() {
        return this.unusedHours;
    }

    /**
     * <p>
     * The number of RI hours that you didn't use.
     * </p>
     * 
     * @param unusedHours
     *        The number of RI hours that you didn't use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationAggregates withUnusedHours(String unusedHours) {
        setUnusedHours(unusedHours);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUtilizationPercentage() != null)
            sb.append("UtilizationPercentage: ").append(getUtilizationPercentage()).append(",");
        if (getPurchasedHours() != null)
            sb.append("PurchasedHours: ").append(getPurchasedHours()).append(",");
        if (getTotalActualHours() != null)
            sb.append("TotalActualHours: ").append(getTotalActualHours()).append(",");
        if (getUnusedHours() != null)
            sb.append("UnusedHours: ").append(getUnusedHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationAggregates == false)
            return false;
        ReservationAggregates other = (ReservationAggregates) obj;
        if (other.getUtilizationPercentage() == null ^ this.getUtilizationPercentage() == null)
            return false;
        if (other.getUtilizationPercentage() != null && other.getUtilizationPercentage().equals(this.getUtilizationPercentage()) == false)
            return false;
        if (other.getPurchasedHours() == null ^ this.getPurchasedHours() == null)
            return false;
        if (other.getPurchasedHours() != null && other.getPurchasedHours().equals(this.getPurchasedHours()) == false)
            return false;
        if (other.getTotalActualHours() == null ^ this.getTotalActualHours() == null)
            return false;
        if (other.getTotalActualHours() != null && other.getTotalActualHours().equals(this.getTotalActualHours()) == false)
            return false;
        if (other.getUnusedHours() == null ^ this.getUnusedHours() == null)
            return false;
        if (other.getUnusedHours() != null && other.getUnusedHours().equals(this.getUnusedHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUtilizationPercentage() == null) ? 0 : getUtilizationPercentage().hashCode());
        hashCode = prime * hashCode + ((getPurchasedHours() == null) ? 0 : getPurchasedHours().hashCode());
        hashCode = prime * hashCode + ((getTotalActualHours() == null) ? 0 : getTotalActualHours().hashCode());
        hashCode = prime * hashCode + ((getUnusedHours() == null) ? 0 : getUnusedHours().hashCode());
        return hashCode;
    }

    @Override
    public ReservationAggregates clone() {
        try {
            return (ReservationAggregates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ReservationAggregatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
