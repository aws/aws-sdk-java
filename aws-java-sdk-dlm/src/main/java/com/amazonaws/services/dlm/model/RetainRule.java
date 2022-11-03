/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <b>[Snapshot and AMI policies only]</b> Specifies a retention rule for snapshots created by snapshot policies, or for
 * AMIs created by AMI policies.
 * </p>
 * <note>
 * <p>
 * For snapshot policies that have an <a>ArchiveRule</a>, this retention rule applies to standard tier retention. When
 * the retention threshold is met, snapshots are moved from the standard to the archive tier.
 * </p>
 * <p>
 * For snapshot policies that do not have an <b>ArchiveRule</b>, snapshots are permanently deleted when this retention
 * threshold is met.
 * </p>
 * </note>
 * <p>
 * You can retain snapshots based on either a count or a time interval.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Count-based retention</b>
 * </p>
 * <p>
 * You must specify <b>Count</b>. If you specify an <a>ArchiveRule</a> for the schedule, then you can specify a
 * retention count of <code>0</code> to archive snapshots immediately after creation. If you specify a
 * <a>FastRestoreRule</a>, <a>ShareRule</a>, or a <a>CrossRegionCopyRule</a>, then you must specify a retention count of
 * <code>1</code> or more.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Age-based retention</b>
 * </p>
 * <p>
 * You must specify <b>Interval</b> and <b>IntervalUnit</b>. If you specify an <a>ArchiveRule</a> for the schedule, then
 * you can specify a retention interval of <code>0</code> days to archive snapshots immediately after creation. If you
 * specify a <a>FastRestoreRule</a>, <a>ShareRule</a>, or a <a>CrossRegionCopyRule</a>, then you must specify a
 * retention interval of <code>1</code> day or more.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/RetainRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetainRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of snapshots to retain for each volume, up to a maximum of 1000. For example if you want to retain a
     * maximum of three snapshots, specify <code>3</code>. When the fourth snapshot is created, the oldest retained
     * snapshot is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200
     * weeks, or 36500 days.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify
     * <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>. Once the snapshot has been retained for 3 months,
     * it is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * </p>
     */
    private String intervalUnit;

    /**
     * <p>
     * The number of snapshots to retain for each volume, up to a maximum of 1000. For example if you want to retain a
     * maximum of three snapshots, specify <code>3</code>. When the fourth snapshot is created, the oldest retained
     * snapshot is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * </p>
     * 
     * @param count
     *        The number of snapshots to retain for each volume, up to a maximum of 1000. For example if you want to
     *        retain a maximum of three snapshots, specify <code>3</code>. When the fourth snapshot is created, the
     *        oldest retained snapshot is deleted, or it is moved to the archive tier if you have specified an
     *        <a>ArchiveRule</a>.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of snapshots to retain for each volume, up to a maximum of 1000. For example if you want to retain a
     * maximum of three snapshots, specify <code>3</code>. When the fourth snapshot is created, the oldest retained
     * snapshot is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * </p>
     * 
     * @return The number of snapshots to retain for each volume, up to a maximum of 1000. For example if you want to
     *         retain a maximum of three snapshots, specify <code>3</code>. When the fourth snapshot is created, the
     *         oldest retained snapshot is deleted, or it is moved to the archive tier if you have specified an
     *         <a>ArchiveRule</a>.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of snapshots to retain for each volume, up to a maximum of 1000. For example if you want to retain a
     * maximum of three snapshots, specify <code>3</code>. When the fourth snapshot is created, the oldest retained
     * snapshot is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * </p>
     * 
     * @param count
     *        The number of snapshots to retain for each volume, up to a maximum of 1000. For example if you want to
     *        retain a maximum of three snapshots, specify <code>3</code>. When the fourth snapshot is created, the
     *        oldest retained snapshot is deleted, or it is moved to the archive tier if you have specified an
     *        <a>ArchiveRule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetainRule withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200
     * weeks, or 36500 days.
     * </p>
     * 
     * @param interval
     *        The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months,
     *        5200 weeks, or 36500 days.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200
     * weeks, or 36500 days.
     * </p>
     * 
     * @return The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months,
     *         5200 weeks, or 36500 days.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200
     * weeks, or 36500 days.
     * </p>
     * 
     * @param interval
     *        The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months,
     *        5200 weeks, or 36500 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetainRule withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify
     * <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>. Once the snapshot has been retained for 3 months,
     * it is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify
     *        <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>. Once the snapshot has been retained for 3
     *        months, it is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * @see RetentionIntervalUnitValues
     */

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * <p>
     * The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify
     * <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>. Once the snapshot has been retained for 3 months,
     * it is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * </p>
     * 
     * @return The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify
     *         <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>. Once the snapshot has been retained for 3
     *         months, it is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * @see RetentionIntervalUnitValues
     */

    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * <p>
     * The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify
     * <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>. Once the snapshot has been retained for 3 months,
     * it is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify
     *        <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>. Once the snapshot has been retained for 3
     *        months, it is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public RetainRule withIntervalUnit(String intervalUnit) {
        setIntervalUnit(intervalUnit);
        return this;
    }

    /**
     * <p>
     * The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify
     * <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>. Once the snapshot has been retained for 3 months,
     * it is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify
     *        <code>Interval=3</code> and <code>IntervalUnit=MONTHS</code>. Once the snapshot has been retained for 3
     *        months, it is deleted, or it is moved to the archive tier if you have specified an <a>ArchiveRule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public RetainRule withIntervalUnit(RetentionIntervalUnitValues intervalUnit) {
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
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

        if (obj instanceof RetainRule == false)
            return false;
        RetainRule other = (RetainRule) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getIntervalUnit() == null) ? 0 : getIntervalUnit().hashCode());
        return hashCode;
    }

    @Override
    public RetainRule clone() {
        try {
            return (RetainRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.RetainRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
