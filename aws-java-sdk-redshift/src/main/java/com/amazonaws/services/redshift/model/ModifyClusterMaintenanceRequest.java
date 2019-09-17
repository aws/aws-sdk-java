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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterMaintenance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterMaintenanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     */
    private Boolean deferMaintenance;
    /**
     * <p>
     * A unique identifier for the deferred maintenance window.
     * </p>
     */
    private String deferMaintenanceIdentifier;
    /**
     * <p>
     * A timestamp indicating the start time for the deferred maintenance window.
     * </p>
     */
    private java.util.Date deferMaintenanceStartTime;
    /**
     * <p>
     * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't
     * specify a duration.
     * </p>
     */
    private java.util.Date deferMaintenanceEndTime;
    /**
     * <p>
     * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't
     * specify an end time. The duration must be 45 days or less.
     * </p>
     */
    private Integer deferMaintenanceDuration;

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        A unique identifier for the cluster.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     * 
     * @return A unique identifier for the cluster.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        A unique identifier for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterMaintenanceRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     * 
     * @param deferMaintenance
     *        A boolean indicating whether to enable the deferred maintenance window.
     */

    public void setDeferMaintenance(Boolean deferMaintenance) {
        this.deferMaintenance = deferMaintenance;
    }

    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     * 
     * @return A boolean indicating whether to enable the deferred maintenance window.
     */

    public Boolean getDeferMaintenance() {
        return this.deferMaintenance;
    }

    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     * 
     * @param deferMaintenance
     *        A boolean indicating whether to enable the deferred maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterMaintenanceRequest withDeferMaintenance(Boolean deferMaintenance) {
        setDeferMaintenance(deferMaintenance);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether to enable the deferred maintenance window.
     * </p>
     * 
     * @return A boolean indicating whether to enable the deferred maintenance window.
     */

    public Boolean isDeferMaintenance() {
        return this.deferMaintenance;
    }

    /**
     * <p>
     * A unique identifier for the deferred maintenance window.
     * </p>
     * 
     * @param deferMaintenanceIdentifier
     *        A unique identifier for the deferred maintenance window.
     */

    public void setDeferMaintenanceIdentifier(String deferMaintenanceIdentifier) {
        this.deferMaintenanceIdentifier = deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the deferred maintenance window.
     * </p>
     * 
     * @return A unique identifier for the deferred maintenance window.
     */

    public String getDeferMaintenanceIdentifier() {
        return this.deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the deferred maintenance window.
     * </p>
     * 
     * @param deferMaintenanceIdentifier
     *        A unique identifier for the deferred maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterMaintenanceRequest withDeferMaintenanceIdentifier(String deferMaintenanceIdentifier) {
        setDeferMaintenanceIdentifier(deferMaintenanceIdentifier);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating the start time for the deferred maintenance window.
     * </p>
     * 
     * @param deferMaintenanceStartTime
     *        A timestamp indicating the start time for the deferred maintenance window.
     */

    public void setDeferMaintenanceStartTime(java.util.Date deferMaintenanceStartTime) {
        this.deferMaintenanceStartTime = deferMaintenanceStartTime;
    }

    /**
     * <p>
     * A timestamp indicating the start time for the deferred maintenance window.
     * </p>
     * 
     * @return A timestamp indicating the start time for the deferred maintenance window.
     */

    public java.util.Date getDeferMaintenanceStartTime() {
        return this.deferMaintenanceStartTime;
    }

    /**
     * <p>
     * A timestamp indicating the start time for the deferred maintenance window.
     * </p>
     * 
     * @param deferMaintenanceStartTime
     *        A timestamp indicating the start time for the deferred maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterMaintenanceRequest withDeferMaintenanceStartTime(java.util.Date deferMaintenanceStartTime) {
        setDeferMaintenanceStartTime(deferMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't
     * specify a duration.
     * </p>
     * 
     * @param deferMaintenanceEndTime
     *        A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't
     *        specify a duration.
     */

    public void setDeferMaintenanceEndTime(java.util.Date deferMaintenanceEndTime) {
        this.deferMaintenanceEndTime = deferMaintenanceEndTime;
    }

    /**
     * <p>
     * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't
     * specify a duration.
     * </p>
     * 
     * @return A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you
     *         can't specify a duration.
     */

    public java.util.Date getDeferMaintenanceEndTime() {
        return this.deferMaintenanceEndTime;
    }

    /**
     * <p>
     * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't
     * specify a duration.
     * </p>
     * 
     * @param deferMaintenanceEndTime
     *        A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't
     *        specify a duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterMaintenanceRequest withDeferMaintenanceEndTime(java.util.Date deferMaintenanceEndTime) {
        setDeferMaintenanceEndTime(deferMaintenanceEndTime);
        return this;
    }

    /**
     * <p>
     * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't
     * specify an end time. The duration must be 45 days or less.
     * </p>
     * 
     * @param deferMaintenanceDuration
     *        An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't
     *        specify an end time. The duration must be 45 days or less.
     */

    public void setDeferMaintenanceDuration(Integer deferMaintenanceDuration) {
        this.deferMaintenanceDuration = deferMaintenanceDuration;
    }

    /**
     * <p>
     * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't
     * specify an end time. The duration must be 45 days or less.
     * </p>
     * 
     * @return An integer indicating the duration of the maintenance window in days. If you specify a duration, you
     *         can't specify an end time. The duration must be 45 days or less.
     */

    public Integer getDeferMaintenanceDuration() {
        return this.deferMaintenanceDuration;
    }

    /**
     * <p>
     * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't
     * specify an end time. The duration must be 45 days or less.
     * </p>
     * 
     * @param deferMaintenanceDuration
     *        An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't
     *        specify an end time. The duration must be 45 days or less.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterMaintenanceRequest withDeferMaintenanceDuration(Integer deferMaintenanceDuration) {
        setDeferMaintenanceDuration(deferMaintenanceDuration);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getDeferMaintenance() != null)
            sb.append("DeferMaintenance: ").append(getDeferMaintenance()).append(",");
        if (getDeferMaintenanceIdentifier() != null)
            sb.append("DeferMaintenanceIdentifier: ").append(getDeferMaintenanceIdentifier()).append(",");
        if (getDeferMaintenanceStartTime() != null)
            sb.append("DeferMaintenanceStartTime: ").append(getDeferMaintenanceStartTime()).append(",");
        if (getDeferMaintenanceEndTime() != null)
            sb.append("DeferMaintenanceEndTime: ").append(getDeferMaintenanceEndTime()).append(",");
        if (getDeferMaintenanceDuration() != null)
            sb.append("DeferMaintenanceDuration: ").append(getDeferMaintenanceDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterMaintenanceRequest == false)
            return false;
        ModifyClusterMaintenanceRequest other = (ModifyClusterMaintenanceRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getDeferMaintenance() == null ^ this.getDeferMaintenance() == null)
            return false;
        if (other.getDeferMaintenance() != null && other.getDeferMaintenance().equals(this.getDeferMaintenance()) == false)
            return false;
        if (other.getDeferMaintenanceIdentifier() == null ^ this.getDeferMaintenanceIdentifier() == null)
            return false;
        if (other.getDeferMaintenanceIdentifier() != null && other.getDeferMaintenanceIdentifier().equals(this.getDeferMaintenanceIdentifier()) == false)
            return false;
        if (other.getDeferMaintenanceStartTime() == null ^ this.getDeferMaintenanceStartTime() == null)
            return false;
        if (other.getDeferMaintenanceStartTime() != null && other.getDeferMaintenanceStartTime().equals(this.getDeferMaintenanceStartTime()) == false)
            return false;
        if (other.getDeferMaintenanceEndTime() == null ^ this.getDeferMaintenanceEndTime() == null)
            return false;
        if (other.getDeferMaintenanceEndTime() != null && other.getDeferMaintenanceEndTime().equals(this.getDeferMaintenanceEndTime()) == false)
            return false;
        if (other.getDeferMaintenanceDuration() == null ^ this.getDeferMaintenanceDuration() == null)
            return false;
        if (other.getDeferMaintenanceDuration() != null && other.getDeferMaintenanceDuration().equals(this.getDeferMaintenanceDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeferMaintenance() == null) ? 0 : getDeferMaintenance().hashCode());
        hashCode = prime * hashCode + ((getDeferMaintenanceIdentifier() == null) ? 0 : getDeferMaintenanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeferMaintenanceStartTime() == null) ? 0 : getDeferMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDeferMaintenanceEndTime() == null) ? 0 : getDeferMaintenanceEndTime().hashCode());
        hashCode = prime * hashCode + ((getDeferMaintenanceDuration() == null) ? 0 : getDeferMaintenanceDuration().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterMaintenanceRequest clone() {
        return (ModifyClusterMaintenanceRequest) super.clone();
    }

}
