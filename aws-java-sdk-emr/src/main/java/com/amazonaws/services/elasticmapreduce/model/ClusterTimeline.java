/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the timeline of the cluster's lifecycle.
 * </p>
 */
public class ClusterTimeline implements Serializable, Cloneable {

    /**
     * <p>
     * The creation date and time of the cluster.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time when the cluster was ready to execute steps.
     * </p>
     */
    private java.util.Date readyDateTime;
    /**
     * <p>
     * The date and time when the cluster was terminated.
     * </p>
     */
    private java.util.Date endDateTime;

    /**
     * <p>
     * The creation date and time of the cluster.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the cluster.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the cluster.
     * </p>
     * 
     * @return The creation date and time of the cluster.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the cluster.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterTimeline withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the cluster was ready to execute steps.
     * </p>
     * 
     * @param readyDateTime
     *        The date and time when the cluster was ready to execute steps.
     */

    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }

    /**
     * <p>
     * The date and time when the cluster was ready to execute steps.
     * </p>
     * 
     * @return The date and time when the cluster was ready to execute steps.
     */

    public java.util.Date getReadyDateTime() {
        return this.readyDateTime;
    }

    /**
     * <p>
     * The date and time when the cluster was ready to execute steps.
     * </p>
     * 
     * @param readyDateTime
     *        The date and time when the cluster was ready to execute steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterTimeline withReadyDateTime(java.util.Date readyDateTime) {
        setReadyDateTime(readyDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the cluster was terminated.
     * </p>
     * 
     * @param endDateTime
     *        The date and time when the cluster was terminated.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date and time when the cluster was terminated.
     * </p>
     * 
     * @return The date and time when the cluster was terminated.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The date and time when the cluster was terminated.
     * </p>
     * 
     * @param endDateTime
     *        The date and time when the cluster was terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterTimeline withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getReadyDateTime() != null)
            sb.append("ReadyDateTime: " + getReadyDateTime() + ",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: " + getEndDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterTimeline == false)
            return false;
        ClusterTimeline other = (ClusterTimeline) obj;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null)
            return false;
        if (other.getReadyDateTime() != null && other.getReadyDateTime().equals(this.getReadyDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getReadyDateTime() == null) ? 0 : getReadyDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return hashCode;
    }

    @Override
    public ClusterTimeline clone() {
        try {
            return (ClusterTimeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
