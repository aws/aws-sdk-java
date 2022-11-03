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
 * <b>[Snapshot policies only]</b> Describes the retention rule for archived snapshots. Once the archive retention
 * threshold is met, the snapshots are permanently deleted from the archive tier.
 * </p>
 * <note>
 * <p>
 * The archive retention rule must retain snapshots in the archive tier for a minimum of 90 days.
 * </p>
 * </note>
 * <p>
 * For <b>count-based schedules</b>, you must specify <b>Count</b>. For <b>age-based schedules</b>, you must specify
 * <b>Interval</b> and <b> IntervalUnit</b>.
 * </p>
 * <p>
 * For more information about using snapshot archiving, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive">Considerations for
 * snapshot lifecycle policies</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/RetentionArchiveTier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetentionArchiveTier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of snapshots to retain in the archive storage tier for each volume. The count must ensure that
     * each snapshot remains in the archive tier for at least 90 days. For example, if the schedule creates snapshots
     * every 30 days, you must specify a count of 3 or more to ensure that each snapshot is archived for at least 90
     * days.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * Specifies the period of time to retain snapshots in the archive tier. After this period expires, the snapshot is
     * permanently deleted.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to retain a snapshots in the archive tier
     * for 6 months, specify <code>Interval=6</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     */
    private String intervalUnit;

    /**
     * <p>
     * The maximum number of snapshots to retain in the archive storage tier for each volume. The count must ensure that
     * each snapshot remains in the archive tier for at least 90 days. For example, if the schedule creates snapshots
     * every 30 days, you must specify a count of 3 or more to ensure that each snapshot is archived for at least 90
     * days.
     * </p>
     * 
     * @param count
     *        The maximum number of snapshots to retain in the archive storage tier for each volume. The count must
     *        ensure that each snapshot remains in the archive tier for at least 90 days. For example, if the schedule
     *        creates snapshots every 30 days, you must specify a count of 3 or more to ensure that each snapshot is
     *        archived for at least 90 days.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The maximum number of snapshots to retain in the archive storage tier for each volume. The count must ensure that
     * each snapshot remains in the archive tier for at least 90 days. For example, if the schedule creates snapshots
     * every 30 days, you must specify a count of 3 or more to ensure that each snapshot is archived for at least 90
     * days.
     * </p>
     * 
     * @return The maximum number of snapshots to retain in the archive storage tier for each volume. The count must
     *         ensure that each snapshot remains in the archive tier for at least 90 days. For example, if the schedule
     *         creates snapshots every 30 days, you must specify a count of 3 or more to ensure that each snapshot is
     *         archived for at least 90 days.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The maximum number of snapshots to retain in the archive storage tier for each volume. The count must ensure that
     * each snapshot remains in the archive tier for at least 90 days. For example, if the schedule creates snapshots
     * every 30 days, you must specify a count of 3 or more to ensure that each snapshot is archived for at least 90
     * days.
     * </p>
     * 
     * @param count
     *        The maximum number of snapshots to retain in the archive storage tier for each volume. The count must
     *        ensure that each snapshot remains in the archive tier for at least 90 days. For example, if the schedule
     *        creates snapshots every 30 days, you must specify a count of 3 or more to ensure that each snapshot is
     *        archived for at least 90 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionArchiveTier withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * Specifies the period of time to retain snapshots in the archive tier. After this period expires, the snapshot is
     * permanently deleted.
     * </p>
     * 
     * @param interval
     *        Specifies the period of time to retain snapshots in the archive tier. After this period expires, the
     *        snapshot is permanently deleted.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * Specifies the period of time to retain snapshots in the archive tier. After this period expires, the snapshot is
     * permanently deleted.
     * </p>
     * 
     * @return Specifies the period of time to retain snapshots in the archive tier. After this period expires, the
     *         snapshot is permanently deleted.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * Specifies the period of time to retain snapshots in the archive tier. After this period expires, the snapshot is
     * permanently deleted.
     * </p>
     * 
     * @param interval
     *        Specifies the period of time to retain snapshots in the archive tier. After this period expires, the
     *        snapshot is permanently deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionArchiveTier withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to retain a snapshots in the archive tier
     * for 6 months, specify <code>Interval=6</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time in which to measure the <b>Interval</b>. For example, to retain a snapshots in the
     *        archive tier for 6 months, specify <code>Interval=6</code> and <code>IntervalUnit=MONTHS</code>.
     * @see RetentionIntervalUnitValues
     */

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to retain a snapshots in the archive tier
     * for 6 months, specify <code>Interval=6</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     * 
     * @return The unit of time in which to measure the <b>Interval</b>. For example, to retain a snapshots in the
     *         archive tier for 6 months, specify <code>Interval=6</code> and <code>IntervalUnit=MONTHS</code>.
     * @see RetentionIntervalUnitValues
     */

    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to retain a snapshots in the archive tier
     * for 6 months, specify <code>Interval=6</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time in which to measure the <b>Interval</b>. For example, to retain a snapshots in the
     *        archive tier for 6 months, specify <code>Interval=6</code> and <code>IntervalUnit=MONTHS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public RetentionArchiveTier withIntervalUnit(String intervalUnit) {
        setIntervalUnit(intervalUnit);
        return this;
    }

    /**
     * <p>
     * The unit of time in which to measure the <b>Interval</b>. For example, to retain a snapshots in the archive tier
     * for 6 months, specify <code>Interval=6</code> and <code>IntervalUnit=MONTHS</code>.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time in which to measure the <b>Interval</b>. For example, to retain a snapshots in the
     *        archive tier for 6 months, specify <code>Interval=6</code> and <code>IntervalUnit=MONTHS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public RetentionArchiveTier withIntervalUnit(RetentionIntervalUnitValues intervalUnit) {
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

        if (obj instanceof RetentionArchiveTier == false)
            return false;
        RetentionArchiveTier other = (RetentionArchiveTier) obj;
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
    public RetentionArchiveTier clone() {
        try {
            return (RetentionArchiveTier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.RetentionArchiveTierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
