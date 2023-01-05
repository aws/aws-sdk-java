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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Wave aggregated status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/WaveAggregatedStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaveAggregatedStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Wave aggregated status health status.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * Wave aggregated status last update dateTime.
     * </p>
     */
    private String lastUpdateDateTime;
    /**
     * <p>
     * Wave aggregated status progress status.
     * </p>
     */
    private String progressStatus;
    /**
     * <p>
     * DateTime marking when the first source server in the wave started replication.
     * </p>
     */
    private String replicationStartedDateTime;
    /**
     * <p>
     * Wave aggregated status total applications amount.
     * </p>
     */
    private Long totalApplications;

    /**
     * <p>
     * Wave aggregated status health status.
     * </p>
     * 
     * @param healthStatus
     *        Wave aggregated status health status.
     * @see WaveHealthStatus
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * Wave aggregated status health status.
     * </p>
     * 
     * @return Wave aggregated status health status.
     * @see WaveHealthStatus
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * Wave aggregated status health status.
     * </p>
     * 
     * @param healthStatus
     *        Wave aggregated status health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WaveHealthStatus
     */

    public WaveAggregatedStatus withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * Wave aggregated status health status.
     * </p>
     * 
     * @param healthStatus
     *        Wave aggregated status health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WaveHealthStatus
     */

    public WaveAggregatedStatus withHealthStatus(WaveHealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * Wave aggregated status last update dateTime.
     * </p>
     * 
     * @param lastUpdateDateTime
     *        Wave aggregated status last update dateTime.
     */

    public void setLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    /**
     * <p>
     * Wave aggregated status last update dateTime.
     * </p>
     * 
     * @return Wave aggregated status last update dateTime.
     */

    public String getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    /**
     * <p>
     * Wave aggregated status last update dateTime.
     * </p>
     * 
     * @param lastUpdateDateTime
     *        Wave aggregated status last update dateTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaveAggregatedStatus withLastUpdateDateTime(String lastUpdateDateTime) {
        setLastUpdateDateTime(lastUpdateDateTime);
        return this;
    }

    /**
     * <p>
     * Wave aggregated status progress status.
     * </p>
     * 
     * @param progressStatus
     *        Wave aggregated status progress status.
     * @see WaveProgressStatus
     */

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    /**
     * <p>
     * Wave aggregated status progress status.
     * </p>
     * 
     * @return Wave aggregated status progress status.
     * @see WaveProgressStatus
     */

    public String getProgressStatus() {
        return this.progressStatus;
    }

    /**
     * <p>
     * Wave aggregated status progress status.
     * </p>
     * 
     * @param progressStatus
     *        Wave aggregated status progress status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WaveProgressStatus
     */

    public WaveAggregatedStatus withProgressStatus(String progressStatus) {
        setProgressStatus(progressStatus);
        return this;
    }

    /**
     * <p>
     * Wave aggregated status progress status.
     * </p>
     * 
     * @param progressStatus
     *        Wave aggregated status progress status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WaveProgressStatus
     */

    public WaveAggregatedStatus withProgressStatus(WaveProgressStatus progressStatus) {
        this.progressStatus = progressStatus.toString();
        return this;
    }

    /**
     * <p>
     * DateTime marking when the first source server in the wave started replication.
     * </p>
     * 
     * @param replicationStartedDateTime
     *        DateTime marking when the first source server in the wave started replication.
     */

    public void setReplicationStartedDateTime(String replicationStartedDateTime) {
        this.replicationStartedDateTime = replicationStartedDateTime;
    }

    /**
     * <p>
     * DateTime marking when the first source server in the wave started replication.
     * </p>
     * 
     * @return DateTime marking when the first source server in the wave started replication.
     */

    public String getReplicationStartedDateTime() {
        return this.replicationStartedDateTime;
    }

    /**
     * <p>
     * DateTime marking when the first source server in the wave started replication.
     * </p>
     * 
     * @param replicationStartedDateTime
     *        DateTime marking when the first source server in the wave started replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaveAggregatedStatus withReplicationStartedDateTime(String replicationStartedDateTime) {
        setReplicationStartedDateTime(replicationStartedDateTime);
        return this;
    }

    /**
     * <p>
     * Wave aggregated status total applications amount.
     * </p>
     * 
     * @param totalApplications
     *        Wave aggregated status total applications amount.
     */

    public void setTotalApplications(Long totalApplications) {
        this.totalApplications = totalApplications;
    }

    /**
     * <p>
     * Wave aggregated status total applications amount.
     * </p>
     * 
     * @return Wave aggregated status total applications amount.
     */

    public Long getTotalApplications() {
        return this.totalApplications;
    }

    /**
     * <p>
     * Wave aggregated status total applications amount.
     * </p>
     * 
     * @param totalApplications
     *        Wave aggregated status total applications amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaveAggregatedStatus withTotalApplications(Long totalApplications) {
        setTotalApplications(totalApplications);
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
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
        if (getLastUpdateDateTime() != null)
            sb.append("LastUpdateDateTime: ").append(getLastUpdateDateTime()).append(",");
        if (getProgressStatus() != null)
            sb.append("ProgressStatus: ").append(getProgressStatus()).append(",");
        if (getReplicationStartedDateTime() != null)
            sb.append("ReplicationStartedDateTime: ").append(getReplicationStartedDateTime()).append(",");
        if (getTotalApplications() != null)
            sb.append("TotalApplications: ").append(getTotalApplications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaveAggregatedStatus == false)
            return false;
        WaveAggregatedStatus other = (WaveAggregatedStatus) obj;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getLastUpdateDateTime() == null ^ this.getLastUpdateDateTime() == null)
            return false;
        if (other.getLastUpdateDateTime() != null && other.getLastUpdateDateTime().equals(this.getLastUpdateDateTime()) == false)
            return false;
        if (other.getProgressStatus() == null ^ this.getProgressStatus() == null)
            return false;
        if (other.getProgressStatus() != null && other.getProgressStatus().equals(this.getProgressStatus()) == false)
            return false;
        if (other.getReplicationStartedDateTime() == null ^ this.getReplicationStartedDateTime() == null)
            return false;
        if (other.getReplicationStartedDateTime() != null && other.getReplicationStartedDateTime().equals(this.getReplicationStartedDateTime()) == false)
            return false;
        if (other.getTotalApplications() == null ^ this.getTotalApplications() == null)
            return false;
        if (other.getTotalApplications() != null && other.getTotalApplications().equals(this.getTotalApplications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDateTime() == null) ? 0 : getLastUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getProgressStatus() == null) ? 0 : getProgressStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicationStartedDateTime() == null) ? 0 : getReplicationStartedDateTime().hashCode());
        hashCode = prime * hashCode + ((getTotalApplications() == null) ? 0 : getTotalApplications().hashCode());
        return hashCode;
    }

    @Override
    public WaveAggregatedStatus clone() {
        try {
            return (WaveAggregatedStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.WaveAggregatedStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
