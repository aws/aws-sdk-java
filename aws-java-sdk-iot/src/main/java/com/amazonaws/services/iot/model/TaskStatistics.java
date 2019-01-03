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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics for the checks performed during the audit.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of checks in this audit.
     * </p>
     */
    private Integer totalChecks;
    /**
     * <p>
     * The number of checks in progress.
     * </p>
     */
    private Integer inProgressChecks;
    /**
     * <p>
     * The number of checks waiting for data collection.
     * </p>
     */
    private Integer waitingForDataCollectionChecks;
    /**
     * <p>
     * The number of checks that found compliant resources.
     * </p>
     */
    private Integer compliantChecks;
    /**
     * <p>
     * The number of checks that found non-compliant resources.
     * </p>
     */
    private Integer nonCompliantChecks;
    /**
     * <p>
     * The number of checks
     * </p>
     */
    private Integer failedChecks;
    /**
     * <p>
     * The number of checks that did not run because the audit was canceled.
     * </p>
     */
    private Integer canceledChecks;

    /**
     * <p>
     * The number of checks in this audit.
     * </p>
     * 
     * @param totalChecks
     *        The number of checks in this audit.
     */

    public void setTotalChecks(Integer totalChecks) {
        this.totalChecks = totalChecks;
    }

    /**
     * <p>
     * The number of checks in this audit.
     * </p>
     * 
     * @return The number of checks in this audit.
     */

    public Integer getTotalChecks() {
        return this.totalChecks;
    }

    /**
     * <p>
     * The number of checks in this audit.
     * </p>
     * 
     * @param totalChecks
     *        The number of checks in this audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskStatistics withTotalChecks(Integer totalChecks) {
        setTotalChecks(totalChecks);
        return this;
    }

    /**
     * <p>
     * The number of checks in progress.
     * </p>
     * 
     * @param inProgressChecks
     *        The number of checks in progress.
     */

    public void setInProgressChecks(Integer inProgressChecks) {
        this.inProgressChecks = inProgressChecks;
    }

    /**
     * <p>
     * The number of checks in progress.
     * </p>
     * 
     * @return The number of checks in progress.
     */

    public Integer getInProgressChecks() {
        return this.inProgressChecks;
    }

    /**
     * <p>
     * The number of checks in progress.
     * </p>
     * 
     * @param inProgressChecks
     *        The number of checks in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskStatistics withInProgressChecks(Integer inProgressChecks) {
        setInProgressChecks(inProgressChecks);
        return this;
    }

    /**
     * <p>
     * The number of checks waiting for data collection.
     * </p>
     * 
     * @param waitingForDataCollectionChecks
     *        The number of checks waiting for data collection.
     */

    public void setWaitingForDataCollectionChecks(Integer waitingForDataCollectionChecks) {
        this.waitingForDataCollectionChecks = waitingForDataCollectionChecks;
    }

    /**
     * <p>
     * The number of checks waiting for data collection.
     * </p>
     * 
     * @return The number of checks waiting for data collection.
     */

    public Integer getWaitingForDataCollectionChecks() {
        return this.waitingForDataCollectionChecks;
    }

    /**
     * <p>
     * The number of checks waiting for data collection.
     * </p>
     * 
     * @param waitingForDataCollectionChecks
     *        The number of checks waiting for data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskStatistics withWaitingForDataCollectionChecks(Integer waitingForDataCollectionChecks) {
        setWaitingForDataCollectionChecks(waitingForDataCollectionChecks);
        return this;
    }

    /**
     * <p>
     * The number of checks that found compliant resources.
     * </p>
     * 
     * @param compliantChecks
     *        The number of checks that found compliant resources.
     */

    public void setCompliantChecks(Integer compliantChecks) {
        this.compliantChecks = compliantChecks;
    }

    /**
     * <p>
     * The number of checks that found compliant resources.
     * </p>
     * 
     * @return The number of checks that found compliant resources.
     */

    public Integer getCompliantChecks() {
        return this.compliantChecks;
    }

    /**
     * <p>
     * The number of checks that found compliant resources.
     * </p>
     * 
     * @param compliantChecks
     *        The number of checks that found compliant resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskStatistics withCompliantChecks(Integer compliantChecks) {
        setCompliantChecks(compliantChecks);
        return this;
    }

    /**
     * <p>
     * The number of checks that found non-compliant resources.
     * </p>
     * 
     * @param nonCompliantChecks
     *        The number of checks that found non-compliant resources.
     */

    public void setNonCompliantChecks(Integer nonCompliantChecks) {
        this.nonCompliantChecks = nonCompliantChecks;
    }

    /**
     * <p>
     * The number of checks that found non-compliant resources.
     * </p>
     * 
     * @return The number of checks that found non-compliant resources.
     */

    public Integer getNonCompliantChecks() {
        return this.nonCompliantChecks;
    }

    /**
     * <p>
     * The number of checks that found non-compliant resources.
     * </p>
     * 
     * @param nonCompliantChecks
     *        The number of checks that found non-compliant resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskStatistics withNonCompliantChecks(Integer nonCompliantChecks) {
        setNonCompliantChecks(nonCompliantChecks);
        return this;
    }

    /**
     * <p>
     * The number of checks
     * </p>
     * 
     * @param failedChecks
     *        The number of checks
     */

    public void setFailedChecks(Integer failedChecks) {
        this.failedChecks = failedChecks;
    }

    /**
     * <p>
     * The number of checks
     * </p>
     * 
     * @return The number of checks
     */

    public Integer getFailedChecks() {
        return this.failedChecks;
    }

    /**
     * <p>
     * The number of checks
     * </p>
     * 
     * @param failedChecks
     *        The number of checks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskStatistics withFailedChecks(Integer failedChecks) {
        setFailedChecks(failedChecks);
        return this;
    }

    /**
     * <p>
     * The number of checks that did not run because the audit was canceled.
     * </p>
     * 
     * @param canceledChecks
     *        The number of checks that did not run because the audit was canceled.
     */

    public void setCanceledChecks(Integer canceledChecks) {
        this.canceledChecks = canceledChecks;
    }

    /**
     * <p>
     * The number of checks that did not run because the audit was canceled.
     * </p>
     * 
     * @return The number of checks that did not run because the audit was canceled.
     */

    public Integer getCanceledChecks() {
        return this.canceledChecks;
    }

    /**
     * <p>
     * The number of checks that did not run because the audit was canceled.
     * </p>
     * 
     * @param canceledChecks
     *        The number of checks that did not run because the audit was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskStatistics withCanceledChecks(Integer canceledChecks) {
        setCanceledChecks(canceledChecks);
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
        if (getTotalChecks() != null)
            sb.append("TotalChecks: ").append(getTotalChecks()).append(",");
        if (getInProgressChecks() != null)
            sb.append("InProgressChecks: ").append(getInProgressChecks()).append(",");
        if (getWaitingForDataCollectionChecks() != null)
            sb.append("WaitingForDataCollectionChecks: ").append(getWaitingForDataCollectionChecks()).append(",");
        if (getCompliantChecks() != null)
            sb.append("CompliantChecks: ").append(getCompliantChecks()).append(",");
        if (getNonCompliantChecks() != null)
            sb.append("NonCompliantChecks: ").append(getNonCompliantChecks()).append(",");
        if (getFailedChecks() != null)
            sb.append("FailedChecks: ").append(getFailedChecks()).append(",");
        if (getCanceledChecks() != null)
            sb.append("CanceledChecks: ").append(getCanceledChecks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskStatistics == false)
            return false;
        TaskStatistics other = (TaskStatistics) obj;
        if (other.getTotalChecks() == null ^ this.getTotalChecks() == null)
            return false;
        if (other.getTotalChecks() != null && other.getTotalChecks().equals(this.getTotalChecks()) == false)
            return false;
        if (other.getInProgressChecks() == null ^ this.getInProgressChecks() == null)
            return false;
        if (other.getInProgressChecks() != null && other.getInProgressChecks().equals(this.getInProgressChecks()) == false)
            return false;
        if (other.getWaitingForDataCollectionChecks() == null ^ this.getWaitingForDataCollectionChecks() == null)
            return false;
        if (other.getWaitingForDataCollectionChecks() != null
                && other.getWaitingForDataCollectionChecks().equals(this.getWaitingForDataCollectionChecks()) == false)
            return false;
        if (other.getCompliantChecks() == null ^ this.getCompliantChecks() == null)
            return false;
        if (other.getCompliantChecks() != null && other.getCompliantChecks().equals(this.getCompliantChecks()) == false)
            return false;
        if (other.getNonCompliantChecks() == null ^ this.getNonCompliantChecks() == null)
            return false;
        if (other.getNonCompliantChecks() != null && other.getNonCompliantChecks().equals(this.getNonCompliantChecks()) == false)
            return false;
        if (other.getFailedChecks() == null ^ this.getFailedChecks() == null)
            return false;
        if (other.getFailedChecks() != null && other.getFailedChecks().equals(this.getFailedChecks()) == false)
            return false;
        if (other.getCanceledChecks() == null ^ this.getCanceledChecks() == null)
            return false;
        if (other.getCanceledChecks() != null && other.getCanceledChecks().equals(this.getCanceledChecks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalChecks() == null) ? 0 : getTotalChecks().hashCode());
        hashCode = prime * hashCode + ((getInProgressChecks() == null) ? 0 : getInProgressChecks().hashCode());
        hashCode = prime * hashCode + ((getWaitingForDataCollectionChecks() == null) ? 0 : getWaitingForDataCollectionChecks().hashCode());
        hashCode = prime * hashCode + ((getCompliantChecks() == null) ? 0 : getCompliantChecks().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantChecks() == null) ? 0 : getNonCompliantChecks().hashCode());
        hashCode = prime * hashCode + ((getFailedChecks() == null) ? 0 : getFailedChecks().hashCode());
        hashCode = prime * hashCode + ((getCanceledChecks() == null) ? 0 : getCanceledChecks().hashCode());
        return hashCode;
    }

    @Override
    public TaskStatistics clone() {
        try {
            return (TaskStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TaskStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
