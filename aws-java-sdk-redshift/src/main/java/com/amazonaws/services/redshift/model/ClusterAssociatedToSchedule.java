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

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterAssociatedToSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterAssociatedToSchedule implements Serializable, Cloneable {

    /** <p/> */
    private String clusterIdentifier;
    /** <p/> */
    private String scheduleAssociationState;

    /**
     * <p/>
     * 
     * @param clusterIdentifier
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p/>
     * 
     * @param clusterIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterAssociatedToSchedule withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p/>
     * 
     * @param scheduleAssociationState
     * @see ScheduleState
     */

    public void setScheduleAssociationState(String scheduleAssociationState) {
        this.scheduleAssociationState = scheduleAssociationState;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ScheduleState
     */

    public String getScheduleAssociationState() {
        return this.scheduleAssociationState;
    }

    /**
     * <p/>
     * 
     * @param scheduleAssociationState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleState
     */

    public ClusterAssociatedToSchedule withScheduleAssociationState(String scheduleAssociationState) {
        setScheduleAssociationState(scheduleAssociationState);
        return this;
    }

    /**
     * <p/>
     * 
     * @param scheduleAssociationState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleState
     */

    public ClusterAssociatedToSchedule withScheduleAssociationState(ScheduleState scheduleAssociationState) {
        this.scheduleAssociationState = scheduleAssociationState.toString();
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
        if (getScheduleAssociationState() != null)
            sb.append("ScheduleAssociationState: ").append(getScheduleAssociationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterAssociatedToSchedule == false)
            return false;
        ClusterAssociatedToSchedule other = (ClusterAssociatedToSchedule) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getScheduleAssociationState() == null ^ this.getScheduleAssociationState() == null)
            return false;
        if (other.getScheduleAssociationState() != null && other.getScheduleAssociationState().equals(this.getScheduleAssociationState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getScheduleAssociationState() == null) ? 0 : getScheduleAssociationState().hashCode());
        return hashCode;
    }

    @Override
    public ClusterAssociatedToSchedule clone() {
        try {
            return (ClusterAssociatedToSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
