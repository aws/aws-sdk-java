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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateInstanceSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for your new snapshot.
     * </p>
     */
    private String instanceSnapshotName;
    /**
     * <p>
     * The Lightsail instance on which to base your snapshot.
     * </p>
     */
    private String instanceName;

    /**
     * <p>
     * The name for your new snapshot.
     * </p>
     * 
     * @param instanceSnapshotName
     *        The name for your new snapshot.
     */

    public void setInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
    }

    /**
     * <p>
     * The name for your new snapshot.
     * </p>
     * 
     * @return The name for your new snapshot.
     */

    public String getInstanceSnapshotName() {
        return this.instanceSnapshotName;
    }

    /**
     * <p>
     * The name for your new snapshot.
     * </p>
     * 
     * @param instanceSnapshotName
     *        The name for your new snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceSnapshotRequest withInstanceSnapshotName(String instanceSnapshotName) {
        setInstanceSnapshotName(instanceSnapshotName);
        return this;
    }

    /**
     * <p>
     * The Lightsail instance on which to base your snapshot.
     * </p>
     * 
     * @param instanceName
     *        The Lightsail instance on which to base your snapshot.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The Lightsail instance on which to base your snapshot.
     * </p>
     * 
     * @return The Lightsail instance on which to base your snapshot.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The Lightsail instance on which to base your snapshot.
     * </p>
     * 
     * @param instanceName
     *        The Lightsail instance on which to base your snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceSnapshotRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
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
        if (getInstanceSnapshotName() != null)
            sb.append("InstanceSnapshotName: " + getInstanceSnapshotName() + ",");
        if (getInstanceName() != null)
            sb.append("InstanceName: " + getInstanceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceSnapshotRequest == false)
            return false;
        CreateInstanceSnapshotRequest other = (CreateInstanceSnapshotRequest) obj;
        if (other.getInstanceSnapshotName() == null ^ this.getInstanceSnapshotName() == null)
            return false;
        if (other.getInstanceSnapshotName() != null && other.getInstanceSnapshotName().equals(this.getInstanceSnapshotName()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceSnapshotName() == null) ? 0 : getInstanceSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstanceSnapshotRequest clone() {
        return (CreateInstanceSnapshotRequest) super.clone();
    }
}
