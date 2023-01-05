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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The dollar value of the anomaly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/Impact" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Impact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum dollar value that's observed for an anomaly.
     * </p>
     */
    private Double maxImpact;
    /**
     * <p>
     * The cumulative dollar difference between the total actual spend and total expected spend. It is calculated as
     * <code>TotalActualSpend - TotalExpectedSpend</code>.
     * </p>
     */
    private Double totalImpact;
    /**
     * <p>
     * The cumulative dollar amount that was actually spent during the anomaly.
     * </p>
     */
    private Double totalActualSpend;
    /**
     * <p>
     * The cumulative dollar amount that was expected to be spent during the anomaly. It is calculated using advanced
     * machine learning models to determine the typical spending pattern based on historical data for a customer.
     * </p>
     */
    private Double totalExpectedSpend;
    /**
     * <p>
     * The cumulative percentage difference between the total actual spend and total expected spend. It is calculated as
     * <code>(TotalImpact / TotalExpectedSpend) * 100</code>. When <code>TotalExpectedSpend</code> is zero, this field
     * is omitted. Expected spend can be zero in situations such as when you start to use a service for the first time.
     * </p>
     */
    private Double totalImpactPercentage;

    /**
     * <p>
     * The maximum dollar value that's observed for an anomaly.
     * </p>
     * 
     * @param maxImpact
     *        The maximum dollar value that's observed for an anomaly.
     */

    public void setMaxImpact(Double maxImpact) {
        this.maxImpact = maxImpact;
    }

    /**
     * <p>
     * The maximum dollar value that's observed for an anomaly.
     * </p>
     * 
     * @return The maximum dollar value that's observed for an anomaly.
     */

    public Double getMaxImpact() {
        return this.maxImpact;
    }

    /**
     * <p>
     * The maximum dollar value that's observed for an anomaly.
     * </p>
     * 
     * @param maxImpact
     *        The maximum dollar value that's observed for an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Impact withMaxImpact(Double maxImpact) {
        setMaxImpact(maxImpact);
        return this;
    }

    /**
     * <p>
     * The cumulative dollar difference between the total actual spend and total expected spend. It is calculated as
     * <code>TotalActualSpend - TotalExpectedSpend</code>.
     * </p>
     * 
     * @param totalImpact
     *        The cumulative dollar difference between the total actual spend and total expected spend. It is calculated
     *        as <code>TotalActualSpend - TotalExpectedSpend</code>.
     */

    public void setTotalImpact(Double totalImpact) {
        this.totalImpact = totalImpact;
    }

    /**
     * <p>
     * The cumulative dollar difference between the total actual spend and total expected spend. It is calculated as
     * <code>TotalActualSpend - TotalExpectedSpend</code>.
     * </p>
     * 
     * @return The cumulative dollar difference between the total actual spend and total expected spend. It is
     *         calculated as <code>TotalActualSpend - TotalExpectedSpend</code>.
     */

    public Double getTotalImpact() {
        return this.totalImpact;
    }

    /**
     * <p>
     * The cumulative dollar difference between the total actual spend and total expected spend. It is calculated as
     * <code>TotalActualSpend - TotalExpectedSpend</code>.
     * </p>
     * 
     * @param totalImpact
     *        The cumulative dollar difference between the total actual spend and total expected spend. It is calculated
     *        as <code>TotalActualSpend - TotalExpectedSpend</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Impact withTotalImpact(Double totalImpact) {
        setTotalImpact(totalImpact);
        return this;
    }

    /**
     * <p>
     * The cumulative dollar amount that was actually spent during the anomaly.
     * </p>
     * 
     * @param totalActualSpend
     *        The cumulative dollar amount that was actually spent during the anomaly.
     */

    public void setTotalActualSpend(Double totalActualSpend) {
        this.totalActualSpend = totalActualSpend;
    }

    /**
     * <p>
     * The cumulative dollar amount that was actually spent during the anomaly.
     * </p>
     * 
     * @return The cumulative dollar amount that was actually spent during the anomaly.
     */

    public Double getTotalActualSpend() {
        return this.totalActualSpend;
    }

    /**
     * <p>
     * The cumulative dollar amount that was actually spent during the anomaly.
     * </p>
     * 
     * @param totalActualSpend
     *        The cumulative dollar amount that was actually spent during the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Impact withTotalActualSpend(Double totalActualSpend) {
        setTotalActualSpend(totalActualSpend);
        return this;
    }

    /**
     * <p>
     * The cumulative dollar amount that was expected to be spent during the anomaly. It is calculated using advanced
     * machine learning models to determine the typical spending pattern based on historical data for a customer.
     * </p>
     * 
     * @param totalExpectedSpend
     *        The cumulative dollar amount that was expected to be spent during the anomaly. It is calculated using
     *        advanced machine learning models to determine the typical spending pattern based on historical data for a
     *        customer.
     */

    public void setTotalExpectedSpend(Double totalExpectedSpend) {
        this.totalExpectedSpend = totalExpectedSpend;
    }

    /**
     * <p>
     * The cumulative dollar amount that was expected to be spent during the anomaly. It is calculated using advanced
     * machine learning models to determine the typical spending pattern based on historical data for a customer.
     * </p>
     * 
     * @return The cumulative dollar amount that was expected to be spent during the anomaly. It is calculated using
     *         advanced machine learning models to determine the typical spending pattern based on historical data for a
     *         customer.
     */

    public Double getTotalExpectedSpend() {
        return this.totalExpectedSpend;
    }

    /**
     * <p>
     * The cumulative dollar amount that was expected to be spent during the anomaly. It is calculated using advanced
     * machine learning models to determine the typical spending pattern based on historical data for a customer.
     * </p>
     * 
     * @param totalExpectedSpend
     *        The cumulative dollar amount that was expected to be spent during the anomaly. It is calculated using
     *        advanced machine learning models to determine the typical spending pattern based on historical data for a
     *        customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Impact withTotalExpectedSpend(Double totalExpectedSpend) {
        setTotalExpectedSpend(totalExpectedSpend);
        return this;
    }

    /**
     * <p>
     * The cumulative percentage difference between the total actual spend and total expected spend. It is calculated as
     * <code>(TotalImpact / TotalExpectedSpend) * 100</code>. When <code>TotalExpectedSpend</code> is zero, this field
     * is omitted. Expected spend can be zero in situations such as when you start to use a service for the first time.
     * </p>
     * 
     * @param totalImpactPercentage
     *        The cumulative percentage difference between the total actual spend and total expected spend. It is
     *        calculated as <code>(TotalImpact / TotalExpectedSpend) * 100</code>. When <code>TotalExpectedSpend</code>
     *        is zero, this field is omitted. Expected spend can be zero in situations such as when you start to use a
     *        service for the first time.
     */

    public void setTotalImpactPercentage(Double totalImpactPercentage) {
        this.totalImpactPercentage = totalImpactPercentage;
    }

    /**
     * <p>
     * The cumulative percentage difference between the total actual spend and total expected spend. It is calculated as
     * <code>(TotalImpact / TotalExpectedSpend) * 100</code>. When <code>TotalExpectedSpend</code> is zero, this field
     * is omitted. Expected spend can be zero in situations such as when you start to use a service for the first time.
     * </p>
     * 
     * @return The cumulative percentage difference between the total actual spend and total expected spend. It is
     *         calculated as <code>(TotalImpact / TotalExpectedSpend) * 100</code>. When <code>TotalExpectedSpend</code>
     *         is zero, this field is omitted. Expected spend can be zero in situations such as when you start to use a
     *         service for the first time.
     */

    public Double getTotalImpactPercentage() {
        return this.totalImpactPercentage;
    }

    /**
     * <p>
     * The cumulative percentage difference between the total actual spend and total expected spend. It is calculated as
     * <code>(TotalImpact / TotalExpectedSpend) * 100</code>. When <code>TotalExpectedSpend</code> is zero, this field
     * is omitted. Expected spend can be zero in situations such as when you start to use a service for the first time.
     * </p>
     * 
     * @param totalImpactPercentage
     *        The cumulative percentage difference between the total actual spend and total expected spend. It is
     *        calculated as <code>(TotalImpact / TotalExpectedSpend) * 100</code>. When <code>TotalExpectedSpend</code>
     *        is zero, this field is omitted. Expected spend can be zero in situations such as when you start to use a
     *        service for the first time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Impact withTotalImpactPercentage(Double totalImpactPercentage) {
        setTotalImpactPercentage(totalImpactPercentage);
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
        if (getMaxImpact() != null)
            sb.append("MaxImpact: ").append(getMaxImpact()).append(",");
        if (getTotalImpact() != null)
            sb.append("TotalImpact: ").append(getTotalImpact()).append(",");
        if (getTotalActualSpend() != null)
            sb.append("TotalActualSpend: ").append(getTotalActualSpend()).append(",");
        if (getTotalExpectedSpend() != null)
            sb.append("TotalExpectedSpend: ").append(getTotalExpectedSpend()).append(",");
        if (getTotalImpactPercentage() != null)
            sb.append("TotalImpactPercentage: ").append(getTotalImpactPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Impact == false)
            return false;
        Impact other = (Impact) obj;
        if (other.getMaxImpact() == null ^ this.getMaxImpact() == null)
            return false;
        if (other.getMaxImpact() != null && other.getMaxImpact().equals(this.getMaxImpact()) == false)
            return false;
        if (other.getTotalImpact() == null ^ this.getTotalImpact() == null)
            return false;
        if (other.getTotalImpact() != null && other.getTotalImpact().equals(this.getTotalImpact()) == false)
            return false;
        if (other.getTotalActualSpend() == null ^ this.getTotalActualSpend() == null)
            return false;
        if (other.getTotalActualSpend() != null && other.getTotalActualSpend().equals(this.getTotalActualSpend()) == false)
            return false;
        if (other.getTotalExpectedSpend() == null ^ this.getTotalExpectedSpend() == null)
            return false;
        if (other.getTotalExpectedSpend() != null && other.getTotalExpectedSpend().equals(this.getTotalExpectedSpend()) == false)
            return false;
        if (other.getTotalImpactPercentage() == null ^ this.getTotalImpactPercentage() == null)
            return false;
        if (other.getTotalImpactPercentage() != null && other.getTotalImpactPercentage().equals(this.getTotalImpactPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxImpact() == null) ? 0 : getMaxImpact().hashCode());
        hashCode = prime * hashCode + ((getTotalImpact() == null) ? 0 : getTotalImpact().hashCode());
        hashCode = prime * hashCode + ((getTotalActualSpend() == null) ? 0 : getTotalActualSpend().hashCode());
        hashCode = prime * hashCode + ((getTotalExpectedSpend() == null) ? 0 : getTotalExpectedSpend().hashCode());
        hashCode = prime * hashCode + ((getTotalImpactPercentage() == null) ? 0 : getTotalImpactPercentage().hashCode());
        return hashCode;
    }

    @Override
    public Impact clone() {
        try {
            return (Impact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ImpactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
