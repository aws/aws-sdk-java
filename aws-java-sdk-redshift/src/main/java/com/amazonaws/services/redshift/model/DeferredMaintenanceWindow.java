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
 * <p>
 * Describes a deferred maintenance window
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeferredMaintenanceWindow" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeferredMaintenanceWindow implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the maintenance window.
     * </p>
     */
    private String deferMaintenanceIdentifier;
    /**
     * <p>
     * A timestamp for the beginning of the time period when we defer maintenance.
     * </p>
     */
    private java.util.Date deferMaintenanceStartTime;
    /**
     * <p>
     * A timestamp for the end of the time period when we defer maintenance.
     * </p>
     */
    private java.util.Date deferMaintenanceEndTime;

    /**
     * <p>
     * A unique identifier for the maintenance window.
     * </p>
     * 
     * @param deferMaintenanceIdentifier
     *        A unique identifier for the maintenance window.
     */

    public void setDeferMaintenanceIdentifier(String deferMaintenanceIdentifier) {
        this.deferMaintenanceIdentifier = deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the maintenance window.
     * </p>
     * 
     * @return A unique identifier for the maintenance window.
     */

    public String getDeferMaintenanceIdentifier() {
        return this.deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the maintenance window.
     * </p>
     * 
     * @param deferMaintenanceIdentifier
     *        A unique identifier for the maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeferredMaintenanceWindow withDeferMaintenanceIdentifier(String deferMaintenanceIdentifier) {
        setDeferMaintenanceIdentifier(deferMaintenanceIdentifier);
        return this;
    }

    /**
     * <p>
     * A timestamp for the beginning of the time period when we defer maintenance.
     * </p>
     * 
     * @param deferMaintenanceStartTime
     *        A timestamp for the beginning of the time period when we defer maintenance.
     */

    public void setDeferMaintenanceStartTime(java.util.Date deferMaintenanceStartTime) {
        this.deferMaintenanceStartTime = deferMaintenanceStartTime;
    }

    /**
     * <p>
     * A timestamp for the beginning of the time period when we defer maintenance.
     * </p>
     * 
     * @return A timestamp for the beginning of the time period when we defer maintenance.
     */

    public java.util.Date getDeferMaintenanceStartTime() {
        return this.deferMaintenanceStartTime;
    }

    /**
     * <p>
     * A timestamp for the beginning of the time period when we defer maintenance.
     * </p>
     * 
     * @param deferMaintenanceStartTime
     *        A timestamp for the beginning of the time period when we defer maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeferredMaintenanceWindow withDeferMaintenanceStartTime(java.util.Date deferMaintenanceStartTime) {
        setDeferMaintenanceStartTime(deferMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * A timestamp for the end of the time period when we defer maintenance.
     * </p>
     * 
     * @param deferMaintenanceEndTime
     *        A timestamp for the end of the time period when we defer maintenance.
     */

    public void setDeferMaintenanceEndTime(java.util.Date deferMaintenanceEndTime) {
        this.deferMaintenanceEndTime = deferMaintenanceEndTime;
    }

    /**
     * <p>
     * A timestamp for the end of the time period when we defer maintenance.
     * </p>
     * 
     * @return A timestamp for the end of the time period when we defer maintenance.
     */

    public java.util.Date getDeferMaintenanceEndTime() {
        return this.deferMaintenanceEndTime;
    }

    /**
     * <p>
     * A timestamp for the end of the time period when we defer maintenance.
     * </p>
     * 
     * @param deferMaintenanceEndTime
     *        A timestamp for the end of the time period when we defer maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeferredMaintenanceWindow withDeferMaintenanceEndTime(java.util.Date deferMaintenanceEndTime) {
        setDeferMaintenanceEndTime(deferMaintenanceEndTime);
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
        if (getDeferMaintenanceIdentifier() != null)
            sb.append("DeferMaintenanceIdentifier: ").append(getDeferMaintenanceIdentifier()).append(",");
        if (getDeferMaintenanceStartTime() != null)
            sb.append("DeferMaintenanceStartTime: ").append(getDeferMaintenanceStartTime()).append(",");
        if (getDeferMaintenanceEndTime() != null)
            sb.append("DeferMaintenanceEndTime: ").append(getDeferMaintenanceEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeferredMaintenanceWindow == false)
            return false;
        DeferredMaintenanceWindow other = (DeferredMaintenanceWindow) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeferMaintenanceIdentifier() == null) ? 0 : getDeferMaintenanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeferMaintenanceStartTime() == null) ? 0 : getDeferMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDeferMaintenanceEndTime() == null) ? 0 : getDeferMaintenanceEndTime().hashCode());
        return hashCode;
    }

    @Override
    public DeferredMaintenanceWindow clone() {
        try {
            return (DeferredMaintenanceWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
