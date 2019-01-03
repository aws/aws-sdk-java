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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshotSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterSnapshotScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the cluster whose snapshot schedule you want to modify.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
     * </p>
     */
    private String scheduleIdentifier;
    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
     * </p>
     */
    private Boolean disassociateSchedule;

    /**
     * <p>
     * A unique identifier for the cluster whose snapshot schedule you want to modify.
     * </p>
     * 
     * @param clusterIdentifier
     *        A unique identifier for the cluster whose snapshot schedule you want to modify.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster whose snapshot schedule you want to modify.
     * </p>
     * 
     * @return A unique identifier for the cluster whose snapshot schedule you want to modify.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster whose snapshot schedule you want to modify.
     * </p>
     * 
     * @param clusterIdentifier
     *        A unique identifier for the cluster whose snapshot schedule you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSnapshotScheduleRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
     */

    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
     * </p>
     * 
     * @return A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
     */

    public String getScheduleIdentifier() {
        return this.scheduleIdentifier;
    }

    /**
     * <p>
     * A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSnapshotScheduleRequest withScheduleIdentifier(String scheduleIdentifier) {
        setScheduleIdentifier(scheduleIdentifier);
        return this;
    }

    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
     * </p>
     * 
     * @param disassociateSchedule
     *        A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
     */

    public void setDisassociateSchedule(Boolean disassociateSchedule) {
        this.disassociateSchedule = disassociateSchedule;
    }

    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
     * </p>
     * 
     * @return A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
     */

    public Boolean getDisassociateSchedule() {
        return this.disassociateSchedule;
    }

    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
     * </p>
     * 
     * @param disassociateSchedule
     *        A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSnapshotScheduleRequest withDisassociateSchedule(Boolean disassociateSchedule) {
        setDisassociateSchedule(disassociateSchedule);
        return this;
    }

    /**
     * <p>
     * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
     * </p>
     * 
     * @return A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
     */

    public Boolean isDisassociateSchedule() {
        return this.disassociateSchedule;
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
        if (getScheduleIdentifier() != null)
            sb.append("ScheduleIdentifier: ").append(getScheduleIdentifier()).append(",");
        if (getDisassociateSchedule() != null)
            sb.append("DisassociateSchedule: ").append(getDisassociateSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterSnapshotScheduleRequest == false)
            return false;
        ModifyClusterSnapshotScheduleRequest other = (ModifyClusterSnapshotScheduleRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getScheduleIdentifier() == null ^ this.getScheduleIdentifier() == null)
            return false;
        if (other.getScheduleIdentifier() != null && other.getScheduleIdentifier().equals(this.getScheduleIdentifier()) == false)
            return false;
        if (other.getDisassociateSchedule() == null ^ this.getDisassociateSchedule() == null)
            return false;
        if (other.getDisassociateSchedule() != null && other.getDisassociateSchedule().equals(this.getDisassociateSchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getScheduleIdentifier() == null) ? 0 : getScheduleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDisassociateSchedule() == null) ? 0 : getDisassociateSchedule().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterSnapshotScheduleRequest clone() {
        return (ModifyClusterSnapshotScheduleRequest) super.clone();
    }

}
