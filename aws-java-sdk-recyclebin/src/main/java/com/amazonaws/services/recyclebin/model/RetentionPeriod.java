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
package com.amazonaws.services.recyclebin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the retention period for which the retention rule is to retain resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/RetentionPeriod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetentionPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The period value for which the retention rule is to retain resources. The period is measured using the unit
     * specified for <b>RetentionPeriodUnit</b>.
     * </p>
     */
    private Integer retentionPeriodValue;
    /**
     * <p>
     * The unit of time in which the retention period is measured. Currently, only <code>DAYS</code> is supported.
     * </p>
     */
    private String retentionPeriodUnit;

    /**
     * <p>
     * The period value for which the retention rule is to retain resources. The period is measured using the unit
     * specified for <b>RetentionPeriodUnit</b>.
     * </p>
     * 
     * @param retentionPeriodValue
     *        The period value for which the retention rule is to retain resources. The period is measured using the
     *        unit specified for <b>RetentionPeriodUnit</b>.
     */

    public void setRetentionPeriodValue(Integer retentionPeriodValue) {
        this.retentionPeriodValue = retentionPeriodValue;
    }

    /**
     * <p>
     * The period value for which the retention rule is to retain resources. The period is measured using the unit
     * specified for <b>RetentionPeriodUnit</b>.
     * </p>
     * 
     * @return The period value for which the retention rule is to retain resources. The period is measured using the
     *         unit specified for <b>RetentionPeriodUnit</b>.
     */

    public Integer getRetentionPeriodValue() {
        return this.retentionPeriodValue;
    }

    /**
     * <p>
     * The period value for which the retention rule is to retain resources. The period is measured using the unit
     * specified for <b>RetentionPeriodUnit</b>.
     * </p>
     * 
     * @param retentionPeriodValue
     *        The period value for which the retention rule is to retain resources. The period is measured using the
     *        unit specified for <b>RetentionPeriodUnit</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionPeriod withRetentionPeriodValue(Integer retentionPeriodValue) {
        setRetentionPeriodValue(retentionPeriodValue);
        return this;
    }

    /**
     * <p>
     * The unit of time in which the retention period is measured. Currently, only <code>DAYS</code> is supported.
     * </p>
     * 
     * @param retentionPeriodUnit
     *        The unit of time in which the retention period is measured. Currently, only <code>DAYS</code> is
     *        supported.
     * @see RetentionPeriodUnit
     */

    public void setRetentionPeriodUnit(String retentionPeriodUnit) {
        this.retentionPeriodUnit = retentionPeriodUnit;
    }

    /**
     * <p>
     * The unit of time in which the retention period is measured. Currently, only <code>DAYS</code> is supported.
     * </p>
     * 
     * @return The unit of time in which the retention period is measured. Currently, only <code>DAYS</code> is
     *         supported.
     * @see RetentionPeriodUnit
     */

    public String getRetentionPeriodUnit() {
        return this.retentionPeriodUnit;
    }

    /**
     * <p>
     * The unit of time in which the retention period is measured. Currently, only <code>DAYS</code> is supported.
     * </p>
     * 
     * @param retentionPeriodUnit
     *        The unit of time in which the retention period is measured. Currently, only <code>DAYS</code> is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionPeriodUnit
     */

    public RetentionPeriod withRetentionPeriodUnit(String retentionPeriodUnit) {
        setRetentionPeriodUnit(retentionPeriodUnit);
        return this;
    }

    /**
     * <p>
     * The unit of time in which the retention period is measured. Currently, only <code>DAYS</code> is supported.
     * </p>
     * 
     * @param retentionPeriodUnit
     *        The unit of time in which the retention period is measured. Currently, only <code>DAYS</code> is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionPeriodUnit
     */

    public RetentionPeriod withRetentionPeriodUnit(RetentionPeriodUnit retentionPeriodUnit) {
        this.retentionPeriodUnit = retentionPeriodUnit.toString();
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
        if (getRetentionPeriodValue() != null)
            sb.append("RetentionPeriodValue: ").append(getRetentionPeriodValue()).append(",");
        if (getRetentionPeriodUnit() != null)
            sb.append("RetentionPeriodUnit: ").append(getRetentionPeriodUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetentionPeriod == false)
            return false;
        RetentionPeriod other = (RetentionPeriod) obj;
        if (other.getRetentionPeriodValue() == null ^ this.getRetentionPeriodValue() == null)
            return false;
        if (other.getRetentionPeriodValue() != null && other.getRetentionPeriodValue().equals(this.getRetentionPeriodValue()) == false)
            return false;
        if (other.getRetentionPeriodUnit() == null ^ this.getRetentionPeriodUnit() == null)
            return false;
        if (other.getRetentionPeriodUnit() != null && other.getRetentionPeriodUnit().equals(this.getRetentionPeriodUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionPeriodValue() == null) ? 0 : getRetentionPeriodValue().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriodUnit() == null) ? 0 : getRetentionPeriodUnit().hashCode());
        return hashCode;
    }

    @Override
    public RetentionPeriod clone() {
        try {
            return (RetentionPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.recyclebin.model.transform.RetentionPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
