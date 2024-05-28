/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The refresh schedule of a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RefreshSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier for the refresh schedule.
     * </p>
     */
    private String scheduleId;
    /**
     * <p>
     * The frequency for the refresh schedule.
     * </p>
     */
    private RefreshFrequency scheduleFrequency;
    /**
     * <p>
     * Time after which the refresh schedule can be started, expressed in <code>YYYY-MM-DDTHH:MM:SS</code> format.
     * </p>
     */
    private java.util.Date startAfterDateTime;
    /**
     * <p>
     * The type of refresh that a datset undergoes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REFRESH</code>: A complete refresh of a dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_REFRESH</code>: A partial refresh of some rows of a dataset, based on the time window
     * specified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on full and incremental refreshes, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html">Refreshing SPICE data</a>
     * in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private String refreshType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the refresh schedule.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * An identifier for the refresh schedule.
     * </p>
     * 
     * @param scheduleId
     *        An identifier for the refresh schedule.
     */

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * <p>
     * An identifier for the refresh schedule.
     * </p>
     * 
     * @return An identifier for the refresh schedule.
     */

    public String getScheduleId() {
        return this.scheduleId;
    }

    /**
     * <p>
     * An identifier for the refresh schedule.
     * </p>
     * 
     * @param scheduleId
     *        An identifier for the refresh schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshSchedule withScheduleId(String scheduleId) {
        setScheduleId(scheduleId);
        return this;
    }

    /**
     * <p>
     * The frequency for the refresh schedule.
     * </p>
     * 
     * @param scheduleFrequency
     *        The frequency for the refresh schedule.
     */

    public void setScheduleFrequency(RefreshFrequency scheduleFrequency) {
        this.scheduleFrequency = scheduleFrequency;
    }

    /**
     * <p>
     * The frequency for the refresh schedule.
     * </p>
     * 
     * @return The frequency for the refresh schedule.
     */

    public RefreshFrequency getScheduleFrequency() {
        return this.scheduleFrequency;
    }

    /**
     * <p>
     * The frequency for the refresh schedule.
     * </p>
     * 
     * @param scheduleFrequency
     *        The frequency for the refresh schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshSchedule withScheduleFrequency(RefreshFrequency scheduleFrequency) {
        setScheduleFrequency(scheduleFrequency);
        return this;
    }

    /**
     * <p>
     * Time after which the refresh schedule can be started, expressed in <code>YYYY-MM-DDTHH:MM:SS</code> format.
     * </p>
     * 
     * @param startAfterDateTime
     *        Time after which the refresh schedule can be started, expressed in <code>YYYY-MM-DDTHH:MM:SS</code>
     *        format.
     */

    public void setStartAfterDateTime(java.util.Date startAfterDateTime) {
        this.startAfterDateTime = startAfterDateTime;
    }

    /**
     * <p>
     * Time after which the refresh schedule can be started, expressed in <code>YYYY-MM-DDTHH:MM:SS</code> format.
     * </p>
     * 
     * @return Time after which the refresh schedule can be started, expressed in <code>YYYY-MM-DDTHH:MM:SS</code>
     *         format.
     */

    public java.util.Date getStartAfterDateTime() {
        return this.startAfterDateTime;
    }

    /**
     * <p>
     * Time after which the refresh schedule can be started, expressed in <code>YYYY-MM-DDTHH:MM:SS</code> format.
     * </p>
     * 
     * @param startAfterDateTime
     *        Time after which the refresh schedule can be started, expressed in <code>YYYY-MM-DDTHH:MM:SS</code>
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshSchedule withStartAfterDateTime(java.util.Date startAfterDateTime) {
        setStartAfterDateTime(startAfterDateTime);
        return this;
    }

    /**
     * <p>
     * The type of refresh that a datset undergoes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REFRESH</code>: A complete refresh of a dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_REFRESH</code>: A partial refresh of some rows of a dataset, based on the time window
     * specified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on full and incremental refreshes, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html">Refreshing SPICE data</a>
     * in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param refreshType
     *        The type of refresh that a datset undergoes. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_REFRESH</code>: A complete refresh of a dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCREMENTAL_REFRESH</code>: A partial refresh of some rows of a dataset, based on the time window
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on full and incremental refreshes, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html">Refreshing SPICE
     *        data</a> in the <i>Amazon QuickSight User Guide</i>.
     * @see IngestionType
     */

    public void setRefreshType(String refreshType) {
        this.refreshType = refreshType;
    }

    /**
     * <p>
     * The type of refresh that a datset undergoes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REFRESH</code>: A complete refresh of a dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_REFRESH</code>: A partial refresh of some rows of a dataset, based on the time window
     * specified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on full and incremental refreshes, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html">Refreshing SPICE data</a>
     * in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return The type of refresh that a datset undergoes. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FULL_REFRESH</code>: A complete refresh of a dataset.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INCREMENTAL_REFRESH</code>: A partial refresh of some rows of a dataset, based on the time window
     *         specified.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information on full and incremental refreshes, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html">Refreshing SPICE
     *         data</a> in the <i>Amazon QuickSight User Guide</i>.
     * @see IngestionType
     */

    public String getRefreshType() {
        return this.refreshType;
    }

    /**
     * <p>
     * The type of refresh that a datset undergoes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REFRESH</code>: A complete refresh of a dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_REFRESH</code>: A partial refresh of some rows of a dataset, based on the time window
     * specified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on full and incremental refreshes, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html">Refreshing SPICE data</a>
     * in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param refreshType
     *        The type of refresh that a datset undergoes. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_REFRESH</code>: A complete refresh of a dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCREMENTAL_REFRESH</code>: A partial refresh of some rows of a dataset, based on the time window
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on full and incremental refreshes, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html">Refreshing SPICE
     *        data</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionType
     */

    public RefreshSchedule withRefreshType(String refreshType) {
        setRefreshType(refreshType);
        return this;
    }

    /**
     * <p>
     * The type of refresh that a datset undergoes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_REFRESH</code>: A complete refresh of a dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_REFRESH</code>: A partial refresh of some rows of a dataset, based on the time window
     * specified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on full and incremental refreshes, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html">Refreshing SPICE data</a>
     * in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param refreshType
     *        The type of refresh that a datset undergoes. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_REFRESH</code>: A complete refresh of a dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCREMENTAL_REFRESH</code>: A partial refresh of some rows of a dataset, based on the time window
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on full and incremental refreshes, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/refreshing-imported-data.html">Refreshing SPICE
     *        data</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionType
     */

    public RefreshSchedule withRefreshType(IngestionType refreshType) {
        this.refreshType = refreshType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the refresh schedule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the refresh schedule.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the refresh schedule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the refresh schedule.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the refresh schedule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the refresh schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshSchedule withArn(String arn) {
        setArn(arn);
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
        if (getScheduleId() != null)
            sb.append("ScheduleId: ").append(getScheduleId()).append(",");
        if (getScheduleFrequency() != null)
            sb.append("ScheduleFrequency: ").append(getScheduleFrequency()).append(",");
        if (getStartAfterDateTime() != null)
            sb.append("StartAfterDateTime: ").append(getStartAfterDateTime()).append(",");
        if (getRefreshType() != null)
            sb.append("RefreshType: ").append(getRefreshType()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshSchedule == false)
            return false;
        RefreshSchedule other = (RefreshSchedule) obj;
        if (other.getScheduleId() == null ^ this.getScheduleId() == null)
            return false;
        if (other.getScheduleId() != null && other.getScheduleId().equals(this.getScheduleId()) == false)
            return false;
        if (other.getScheduleFrequency() == null ^ this.getScheduleFrequency() == null)
            return false;
        if (other.getScheduleFrequency() != null && other.getScheduleFrequency().equals(this.getScheduleFrequency()) == false)
            return false;
        if (other.getStartAfterDateTime() == null ^ this.getStartAfterDateTime() == null)
            return false;
        if (other.getStartAfterDateTime() != null && other.getStartAfterDateTime().equals(this.getStartAfterDateTime()) == false)
            return false;
        if (other.getRefreshType() == null ^ this.getRefreshType() == null)
            return false;
        if (other.getRefreshType() != null && other.getRefreshType().equals(this.getRefreshType()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleId() == null) ? 0 : getScheduleId().hashCode());
        hashCode = prime * hashCode + ((getScheduleFrequency() == null) ? 0 : getScheduleFrequency().hashCode());
        hashCode = prime * hashCode + ((getStartAfterDateTime() == null) ? 0 : getStartAfterDateTime().hashCode());
        hashCode = prime * hashCode + ((getRefreshType() == null) ? 0 : getRefreshType().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public RefreshSchedule clone() {
        try {
            return (RefreshSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RefreshScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
