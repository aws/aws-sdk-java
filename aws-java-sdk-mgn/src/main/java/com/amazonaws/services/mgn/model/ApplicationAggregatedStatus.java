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
 * Application aggregated status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ApplicationAggregatedStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationAggregatedStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Application aggregated status health status.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * Application aggregated status last update dateTime.
     * </p>
     */
    private String lastUpdateDateTime;
    /**
     * <p>
     * Application aggregated status progress status.
     * </p>
     */
    private String progressStatus;
    /**
     * <p>
     * Application aggregated status total source servers amount.
     * </p>
     */
    private Long totalSourceServers;

    /**
     * <p>
     * Application aggregated status health status.
     * </p>
     * 
     * @param healthStatus
     *        Application aggregated status health status.
     * @see ApplicationHealthStatus
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * Application aggregated status health status.
     * </p>
     * 
     * @return Application aggregated status health status.
     * @see ApplicationHealthStatus
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * Application aggregated status health status.
     * </p>
     * 
     * @param healthStatus
     *        Application aggregated status health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationHealthStatus
     */

    public ApplicationAggregatedStatus withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * Application aggregated status health status.
     * </p>
     * 
     * @param healthStatus
     *        Application aggregated status health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationHealthStatus
     */

    public ApplicationAggregatedStatus withHealthStatus(ApplicationHealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * Application aggregated status last update dateTime.
     * </p>
     * 
     * @param lastUpdateDateTime
     *        Application aggregated status last update dateTime.
     */

    public void setLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    /**
     * <p>
     * Application aggregated status last update dateTime.
     * </p>
     * 
     * @return Application aggregated status last update dateTime.
     */

    public String getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    /**
     * <p>
     * Application aggregated status last update dateTime.
     * </p>
     * 
     * @param lastUpdateDateTime
     *        Application aggregated status last update dateTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationAggregatedStatus withLastUpdateDateTime(String lastUpdateDateTime) {
        setLastUpdateDateTime(lastUpdateDateTime);
        return this;
    }

    /**
     * <p>
     * Application aggregated status progress status.
     * </p>
     * 
     * @param progressStatus
     *        Application aggregated status progress status.
     * @see ApplicationProgressStatus
     */

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    /**
     * <p>
     * Application aggregated status progress status.
     * </p>
     * 
     * @return Application aggregated status progress status.
     * @see ApplicationProgressStatus
     */

    public String getProgressStatus() {
        return this.progressStatus;
    }

    /**
     * <p>
     * Application aggregated status progress status.
     * </p>
     * 
     * @param progressStatus
     *        Application aggregated status progress status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationProgressStatus
     */

    public ApplicationAggregatedStatus withProgressStatus(String progressStatus) {
        setProgressStatus(progressStatus);
        return this;
    }

    /**
     * <p>
     * Application aggregated status progress status.
     * </p>
     * 
     * @param progressStatus
     *        Application aggregated status progress status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationProgressStatus
     */

    public ApplicationAggregatedStatus withProgressStatus(ApplicationProgressStatus progressStatus) {
        this.progressStatus = progressStatus.toString();
        return this;
    }

    /**
     * <p>
     * Application aggregated status total source servers amount.
     * </p>
     * 
     * @param totalSourceServers
     *        Application aggregated status total source servers amount.
     */

    public void setTotalSourceServers(Long totalSourceServers) {
        this.totalSourceServers = totalSourceServers;
    }

    /**
     * <p>
     * Application aggregated status total source servers amount.
     * </p>
     * 
     * @return Application aggregated status total source servers amount.
     */

    public Long getTotalSourceServers() {
        return this.totalSourceServers;
    }

    /**
     * <p>
     * Application aggregated status total source servers amount.
     * </p>
     * 
     * @param totalSourceServers
     *        Application aggregated status total source servers amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationAggregatedStatus withTotalSourceServers(Long totalSourceServers) {
        setTotalSourceServers(totalSourceServers);
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
        if (getTotalSourceServers() != null)
            sb.append("TotalSourceServers: ").append(getTotalSourceServers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationAggregatedStatus == false)
            return false;
        ApplicationAggregatedStatus other = (ApplicationAggregatedStatus) obj;
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
        if (other.getTotalSourceServers() == null ^ this.getTotalSourceServers() == null)
            return false;
        if (other.getTotalSourceServers() != null && other.getTotalSourceServers().equals(this.getTotalSourceServers()) == false)
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
        hashCode = prime * hashCode + ((getTotalSourceServers() == null) ? 0 : getTotalSourceServers().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationAggregatedStatus clone() {
        try {
            return (ApplicationAggregatedStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ApplicationAggregatedStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
