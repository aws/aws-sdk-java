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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains statistics information. The DFE engine uses information about the data in your Neptune graph to make
 * effective trade-offs when planning query execution. This information takes the form of statistics that include
 * so-called characteristic sets and predicate statistics that can guide query planning. See <a
 * href="https://docs.aws.amazon.com/neptune/latest/userguide/neptune-dfe-statistics.html">Managing statistics for the
 * Neptune DFE to use</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/Statistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether or not automatic statistics generation is enabled.
     * </p>
     */
    private Boolean autoCompute;
    /**
     * <p>
     * Indicates whether or not DFE statistics generation is enabled at all.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * Reports the ID of the current statistics generation run. A value of -1 indicates that no statistics have been
     * generated.
     * </p>
     */
    private String statisticsId;
    /**
     * <p>
     * The UTC time at which DFE statistics have most recently been generated.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * A note about problems in the case where statistics are invalid.
     * </p>
     */
    private String note;
    /**
     * <p>
     * A StatisticsSummary structure that contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>signatureCount</code> - The total number of signatures across all characteristic sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceCount</code> - The total number of characteristic-set instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>predicateCount</code> - The total number of unique predicates.
     * </p>
     * </li>
     * </ul>
     */
    private StatisticsSummary signatureInfo;

    /**
     * <p>
     * Indicates whether or not automatic statistics generation is enabled.
     * </p>
     * 
     * @param autoCompute
     *        Indicates whether or not automatic statistics generation is enabled.
     */

    public void setAutoCompute(Boolean autoCompute) {
        this.autoCompute = autoCompute;
    }

    /**
     * <p>
     * Indicates whether or not automatic statistics generation is enabled.
     * </p>
     * 
     * @return Indicates whether or not automatic statistics generation is enabled.
     */

    public Boolean getAutoCompute() {
        return this.autoCompute;
    }

    /**
     * <p>
     * Indicates whether or not automatic statistics generation is enabled.
     * </p>
     * 
     * @param autoCompute
     *        Indicates whether or not automatic statistics generation is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withAutoCompute(Boolean autoCompute) {
        setAutoCompute(autoCompute);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not automatic statistics generation is enabled.
     * </p>
     * 
     * @return Indicates whether or not automatic statistics generation is enabled.
     */

    public Boolean isAutoCompute() {
        return this.autoCompute;
    }

    /**
     * <p>
     * Indicates whether or not DFE statistics generation is enabled at all.
     * </p>
     * 
     * @param active
     *        Indicates whether or not DFE statistics generation is enabled at all.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Indicates whether or not DFE statistics generation is enabled at all.
     * </p>
     * 
     * @return Indicates whether or not DFE statistics generation is enabled at all.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Indicates whether or not DFE statistics generation is enabled at all.
     * </p>
     * 
     * @param active
     *        Indicates whether or not DFE statistics generation is enabled at all.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not DFE statistics generation is enabled at all.
     * </p>
     * 
     * @return Indicates whether or not DFE statistics generation is enabled at all.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * Reports the ID of the current statistics generation run. A value of -1 indicates that no statistics have been
     * generated.
     * </p>
     * 
     * @param statisticsId
     *        Reports the ID of the current statistics generation run. A value of -1 indicates that no statistics have
     *        been generated.
     */

    public void setStatisticsId(String statisticsId) {
        this.statisticsId = statisticsId;
    }

    /**
     * <p>
     * Reports the ID of the current statistics generation run. A value of -1 indicates that no statistics have been
     * generated.
     * </p>
     * 
     * @return Reports the ID of the current statistics generation run. A value of -1 indicates that no statistics have
     *         been generated.
     */

    public String getStatisticsId() {
        return this.statisticsId;
    }

    /**
     * <p>
     * Reports the ID of the current statistics generation run. A value of -1 indicates that no statistics have been
     * generated.
     * </p>
     * 
     * @param statisticsId
     *        Reports the ID of the current statistics generation run. A value of -1 indicates that no statistics have
     *        been generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withStatisticsId(String statisticsId) {
        setStatisticsId(statisticsId);
        return this;
    }

    /**
     * <p>
     * The UTC time at which DFE statistics have most recently been generated.
     * </p>
     * 
     * @param date
     *        The UTC time at which DFE statistics have most recently been generated.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The UTC time at which DFE statistics have most recently been generated.
     * </p>
     * 
     * @return The UTC time at which DFE statistics have most recently been generated.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The UTC time at which DFE statistics have most recently been generated.
     * </p>
     * 
     * @param date
     *        The UTC time at which DFE statistics have most recently been generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * A note about problems in the case where statistics are invalid.
     * </p>
     * 
     * @param note
     *        A note about problems in the case where statistics are invalid.
     */

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * <p>
     * A note about problems in the case where statistics are invalid.
     * </p>
     * 
     * @return A note about problems in the case where statistics are invalid.
     */

    public String getNote() {
        return this.note;
    }

    /**
     * <p>
     * A note about problems in the case where statistics are invalid.
     * </p>
     * 
     * @param note
     *        A note about problems in the case where statistics are invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withNote(String note) {
        setNote(note);
        return this;
    }

    /**
     * <p>
     * A StatisticsSummary structure that contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>signatureCount</code> - The total number of signatures across all characteristic sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceCount</code> - The total number of characteristic-set instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>predicateCount</code> - The total number of unique predicates.
     * </p>
     * </li>
     * </ul>
     * 
     * @param signatureInfo
     *        A StatisticsSummary structure that contains:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>signatureCount</code> - The total number of signatures across all characteristic sets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instanceCount</code> - The total number of characteristic-set instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>predicateCount</code> - The total number of unique predicates.
     *        </p>
     *        </li>
     */

    public void setSignatureInfo(StatisticsSummary signatureInfo) {
        this.signatureInfo = signatureInfo;
    }

    /**
     * <p>
     * A StatisticsSummary structure that contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>signatureCount</code> - The total number of signatures across all characteristic sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceCount</code> - The total number of characteristic-set instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>predicateCount</code> - The total number of unique predicates.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A StatisticsSummary structure that contains:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>signatureCount</code> - The total number of signatures across all characteristic sets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instanceCount</code> - The total number of characteristic-set instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>predicateCount</code> - The total number of unique predicates.
     *         </p>
     *         </li>
     */

    public StatisticsSummary getSignatureInfo() {
        return this.signatureInfo;
    }

    /**
     * <p>
     * A StatisticsSummary structure that contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>signatureCount</code> - The total number of signatures across all characteristic sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceCount</code> - The total number of characteristic-set instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>predicateCount</code> - The total number of unique predicates.
     * </p>
     * </li>
     * </ul>
     * 
     * @param signatureInfo
     *        A StatisticsSummary structure that contains:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>signatureCount</code> - The total number of signatures across all characteristic sets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instanceCount</code> - The total number of characteristic-set instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>predicateCount</code> - The total number of unique predicates.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withSignatureInfo(StatisticsSummary signatureInfo) {
        setSignatureInfo(signatureInfo);
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
        if (getAutoCompute() != null)
            sb.append("AutoCompute: ").append(getAutoCompute()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getStatisticsId() != null)
            sb.append("StatisticsId: ").append(getStatisticsId()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getNote() != null)
            sb.append("Note: ").append(getNote()).append(",");
        if (getSignatureInfo() != null)
            sb.append("SignatureInfo: ").append(getSignatureInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statistics == false)
            return false;
        Statistics other = (Statistics) obj;
        if (other.getAutoCompute() == null ^ this.getAutoCompute() == null)
            return false;
        if (other.getAutoCompute() != null && other.getAutoCompute().equals(this.getAutoCompute()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getStatisticsId() == null ^ this.getStatisticsId() == null)
            return false;
        if (other.getStatisticsId() != null && other.getStatisticsId().equals(this.getStatisticsId()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getNote() == null ^ this.getNote() == null)
            return false;
        if (other.getNote() != null && other.getNote().equals(this.getNote()) == false)
            return false;
        if (other.getSignatureInfo() == null ^ this.getSignatureInfo() == null)
            return false;
        if (other.getSignatureInfo() != null && other.getSignatureInfo().equals(this.getSignatureInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoCompute() == null) ? 0 : getAutoCompute().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getStatisticsId() == null) ? 0 : getStatisticsId().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getNote() == null) ? 0 : getNote().hashCode());
        hashCode = prime * hashCode + ((getSignatureInfo() == null) ? 0 : getSignatureInfo().hashCode());
        return hashCode;
    }

    @Override
    public Statistics clone() {
        try {
            return (Statistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.StatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
