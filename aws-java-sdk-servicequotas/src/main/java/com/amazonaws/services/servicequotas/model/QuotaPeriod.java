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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about the quota period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/QuotaPeriod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuotaPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of a period.
     * </p>
     */
    private Integer periodValue;
    /**
     * <p>
     * The time unit of a period.
     * </p>
     */
    private String periodUnit;

    /**
     * <p>
     * The value of a period.
     * </p>
     * 
     * @param periodValue
     *        The value of a period.
     */

    public void setPeriodValue(Integer periodValue) {
        this.periodValue = periodValue;
    }

    /**
     * <p>
     * The value of a period.
     * </p>
     * 
     * @return The value of a period.
     */

    public Integer getPeriodValue() {
        return this.periodValue;
    }

    /**
     * <p>
     * The value of a period.
     * </p>
     * 
     * @param periodValue
     *        The value of a period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuotaPeriod withPeriodValue(Integer periodValue) {
        setPeriodValue(periodValue);
        return this;
    }

    /**
     * <p>
     * The time unit of a period.
     * </p>
     * 
     * @param periodUnit
     *        The time unit of a period.
     * @see PeriodUnit
     */

    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
    }

    /**
     * <p>
     * The time unit of a period.
     * </p>
     * 
     * @return The time unit of a period.
     * @see PeriodUnit
     */

    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * <p>
     * The time unit of a period.
     * </p>
     * 
     * @param periodUnit
     *        The time unit of a period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeriodUnit
     */

    public QuotaPeriod withPeriodUnit(String periodUnit) {
        setPeriodUnit(periodUnit);
        return this;
    }

    /**
     * <p>
     * The time unit of a period.
     * </p>
     * 
     * @param periodUnit
     *        The time unit of a period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeriodUnit
     */

    public QuotaPeriod withPeriodUnit(PeriodUnit periodUnit) {
        this.periodUnit = periodUnit.toString();
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
        if (getPeriodValue() != null)
            sb.append("PeriodValue: ").append(getPeriodValue()).append(",");
        if (getPeriodUnit() != null)
            sb.append("PeriodUnit: ").append(getPeriodUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuotaPeriod == false)
            return false;
        QuotaPeriod other = (QuotaPeriod) obj;
        if (other.getPeriodValue() == null ^ this.getPeriodValue() == null)
            return false;
        if (other.getPeriodValue() != null && other.getPeriodValue().equals(this.getPeriodValue()) == false)
            return false;
        if (other.getPeriodUnit() == null ^ this.getPeriodUnit() == null)
            return false;
        if (other.getPeriodUnit() != null && other.getPeriodUnit().equals(this.getPeriodUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeriodValue() == null) ? 0 : getPeriodValue().hashCode());
        hashCode = prime * hashCode + ((getPeriodUnit() == null) ? 0 : getPeriodUnit().hashCode());
        return hashCode;
    }

    @Override
    public QuotaPeriod clone() {
        try {
            return (QuotaPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicequotas.model.transform.QuotaPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
