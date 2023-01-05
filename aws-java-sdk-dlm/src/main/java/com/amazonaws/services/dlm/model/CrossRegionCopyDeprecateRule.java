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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>[AMI policies only]</b> Specifies an AMI deprecation rule for cross-Region AMI copies created by an AMI policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CrossRegionCopyDeprecateRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrossRegionCopyDeprecateRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The period after which to deprecate the cross-Region AMI copies. The period must be less than or equal to the
     * cross-Region AMI copy retention period, and it can't be greater than 10 years. This is equivalent to 120 months,
     * 520 weeks, or 3650 days.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to deprecate a cross-Region AMI copy after
     * 3 months, specify <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     */
    private String intervalUnit;

    /**
     * <p>
     * The period after which to deprecate the cross-Region AMI copies. The period must be less than or equal to the
     * cross-Region AMI copy retention period, and it can't be greater than 10 years. This is equivalent to 120 months,
     * 520 weeks, or 3650 days.
     * </p>
     * 
     * @param interval
     *        The period after which to deprecate the cross-Region AMI copies. The period must be less than or equal to
     *        the cross-Region AMI copy retention period, and it can't be greater than 10 years. This is equivalent to
     *        120 months, 520 weeks, or 3650 days.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The period after which to deprecate the cross-Region AMI copies. The period must be less than or equal to the
     * cross-Region AMI copy retention period, and it can't be greater than 10 years. This is equivalent to 120 months,
     * 520 weeks, or 3650 days.
     * </p>
     * 
     * @return The period after which to deprecate the cross-Region AMI copies. The period must be less than or equal to
     *         the cross-Region AMI copy retention period, and it can't be greater than 10 years. This is equivalent to
     *         120 months, 520 weeks, or 3650 days.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The period after which to deprecate the cross-Region AMI copies. The period must be less than or equal to the
     * cross-Region AMI copy retention period, and it can't be greater than 10 years. This is equivalent to 120 months,
     * 520 weeks, or 3650 days.
     * </p>
     * 
     * @param interval
     *        The period after which to deprecate the cross-Region AMI copies. The period must be less than or equal to
     *        the cross-Region AMI copy retention period, and it can't be greater than 10 years. This is equivalent to
     *        120 months, 520 weeks, or 3650 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyDeprecateRule withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to deprecate a cross-Region AMI copy after
     * 3 months, specify <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time in which to measure the <b>Interval</b>. For example, to deprecate a cross-Region AMI
     *        copy after 3 months, specify <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>.
     * @see RetentionIntervalUnitValues
     */

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to deprecate a cross-Region AMI copy after
     * 3 months, specify <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     * 
     * @return The unit of time in which to measure the <b>Interval</b>. For example, to deprecate a cross-Region AMI
     *         copy after 3 months, specify <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>.
     * @see RetentionIntervalUnitValues
     */

    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to deprecate a cross-Region AMI copy after
     * 3 months, specify <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time in which to measure the <b>Interval</b>. For example, to deprecate a cross-Region AMI
     *        copy after 3 months, specify <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public CrossRegionCopyDeprecateRule withIntervalUnit(String intervalUnit) {
        setIntervalUnit(intervalUnit);
        return this;
    }

    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to deprecate a cross-Region AMI copy after
     * 3 months, specify <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time in which to measure the <b>Interval</b>. For example, to deprecate a cross-Region AMI
     *        copy after 3 months, specify <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public CrossRegionCopyDeprecateRule withIntervalUnit(RetentionIntervalUnitValues intervalUnit) {
        this.intervalUnit = intervalUnit.toString();
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
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getIntervalUnit() != null)
            sb.append("IntervalUnit: ").append(getIntervalUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossRegionCopyDeprecateRule == false)
            return false;
        CrossRegionCopyDeprecateRule other = (CrossRegionCopyDeprecateRule) obj;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getIntervalUnit() == null ^ this.getIntervalUnit() == null)
            return false;
        if (other.getIntervalUnit() != null && other.getIntervalUnit().equals(this.getIntervalUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getIntervalUnit() == null) ? 0 : getIntervalUnit().hashCode());
        return hashCode;
    }

    @Override
    public CrossRegionCopyDeprecateRule clone() {
        try {
            return (CrossRegionCopyDeprecateRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.CrossRegionCopyDeprecateRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
