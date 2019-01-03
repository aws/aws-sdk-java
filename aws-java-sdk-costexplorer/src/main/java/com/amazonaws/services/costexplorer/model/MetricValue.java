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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The aggregated value for a metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/MetricValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The actual number that represents the metric.
     * </p>
     */
    private String amount;
    /**
     * <p>
     * The unit that the metric is given in.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The actual number that represents the metric.
     * </p>
     * 
     * @param amount
     *        The actual number that represents the metric.
     */

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The actual number that represents the metric.
     * </p>
     * 
     * @return The actual number that represents the metric.
     */

    public String getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The actual number that represents the metric.
     * </p>
     * 
     * @param amount
     *        The actual number that represents the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricValue withAmount(String amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The unit that the metric is given in.
     * </p>
     * 
     * @param unit
     *        The unit that the metric is given in.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit that the metric is given in.
     * </p>
     * 
     * @return The unit that the metric is given in.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit that the metric is given in.
     * </p>
     * 
     * @param unit
     *        The unit that the metric is given in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricValue withUnit(String unit) {
        setUnit(unit);
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
        if (getAmount() != null)
            sb.append("Amount: ").append(getAmount()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricValue == false)
            return false;
        MetricValue other = (MetricValue) obj;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public MetricValue clone() {
        try {
            return (MetricValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.MetricValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
