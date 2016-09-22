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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains directory limit information for a region.
 * </p>
 */
public class DirectoryLimits implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of cloud directories allowed in the region.
     * </p>
     */
    private Integer cloudOnlyDirectoriesLimit;
    /**
     * <p>
     * The current number of cloud directories in the region.
     * </p>
     */
    private Integer cloudOnlyDirectoriesCurrentCount;
    /**
     * <p>
     * Indicates if the cloud directory limit has been reached.
     * </p>
     */
    private Boolean cloudOnlyDirectoriesLimitReached;
    /**
     * <p>
     * The maximum number of Microsoft AD directories allowed in the region.
     * </p>
     */
    private Integer cloudOnlyMicrosoftADLimit;
    /**
     * <p>
     * The current number of Microsoft AD directories in the region.
     * </p>
     */
    private Integer cloudOnlyMicrosoftADCurrentCount;
    /**
     * <p>
     * Indicates if the Microsoft AD directory limit has been reached.
     * </p>
     */
    private Boolean cloudOnlyMicrosoftADLimitReached;
    /**
     * <p>
     * The maximum number of connected directories allowed in the region.
     * </p>
     */
    private Integer connectedDirectoriesLimit;
    /**
     * <p>
     * The current number of connected directories in the region.
     * </p>
     */
    private Integer connectedDirectoriesCurrentCount;
    /**
     * <p>
     * Indicates if the connected directory limit has been reached.
     * </p>
     */
    private Boolean connectedDirectoriesLimitReached;

    /**
     * <p>
     * The maximum number of cloud directories allowed in the region.
     * </p>
     * 
     * @param cloudOnlyDirectoriesLimit
     *        The maximum number of cloud directories allowed in the region.
     */

    public void setCloudOnlyDirectoriesLimit(Integer cloudOnlyDirectoriesLimit) {
        this.cloudOnlyDirectoriesLimit = cloudOnlyDirectoriesLimit;
    }

    /**
     * <p>
     * The maximum number of cloud directories allowed in the region.
     * </p>
     * 
     * @return The maximum number of cloud directories allowed in the region.
     */

    public Integer getCloudOnlyDirectoriesLimit() {
        return this.cloudOnlyDirectoriesLimit;
    }

    /**
     * <p>
     * The maximum number of cloud directories allowed in the region.
     * </p>
     * 
     * @param cloudOnlyDirectoriesLimit
     *        The maximum number of cloud directories allowed in the region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryLimits withCloudOnlyDirectoriesLimit(Integer cloudOnlyDirectoriesLimit) {
        setCloudOnlyDirectoriesLimit(cloudOnlyDirectoriesLimit);
        return this;
    }

    /**
     * <p>
     * The current number of cloud directories in the region.
     * </p>
     * 
     * @param cloudOnlyDirectoriesCurrentCount
     *        The current number of cloud directories in the region.
     */

    public void setCloudOnlyDirectoriesCurrentCount(Integer cloudOnlyDirectoriesCurrentCount) {
        this.cloudOnlyDirectoriesCurrentCount = cloudOnlyDirectoriesCurrentCount;
    }

    /**
     * <p>
     * The current number of cloud directories in the region.
     * </p>
     * 
     * @return The current number of cloud directories in the region.
     */

    public Integer getCloudOnlyDirectoriesCurrentCount() {
        return this.cloudOnlyDirectoriesCurrentCount;
    }

    /**
     * <p>
     * The current number of cloud directories in the region.
     * </p>
     * 
     * @param cloudOnlyDirectoriesCurrentCount
     *        The current number of cloud directories in the region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryLimits withCloudOnlyDirectoriesCurrentCount(Integer cloudOnlyDirectoriesCurrentCount) {
        setCloudOnlyDirectoriesCurrentCount(cloudOnlyDirectoriesCurrentCount);
        return this;
    }

    /**
     * <p>
     * Indicates if the cloud directory limit has been reached.
     * </p>
     * 
     * @param cloudOnlyDirectoriesLimitReached
     *        Indicates if the cloud directory limit has been reached.
     */

    public void setCloudOnlyDirectoriesLimitReached(Boolean cloudOnlyDirectoriesLimitReached) {
        this.cloudOnlyDirectoriesLimitReached = cloudOnlyDirectoriesLimitReached;
    }

    /**
     * <p>
     * Indicates if the cloud directory limit has been reached.
     * </p>
     * 
     * @return Indicates if the cloud directory limit has been reached.
     */

    public Boolean getCloudOnlyDirectoriesLimitReached() {
        return this.cloudOnlyDirectoriesLimitReached;
    }

    /**
     * <p>
     * Indicates if the cloud directory limit has been reached.
     * </p>
     * 
     * @param cloudOnlyDirectoriesLimitReached
     *        Indicates if the cloud directory limit has been reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryLimits withCloudOnlyDirectoriesLimitReached(Boolean cloudOnlyDirectoriesLimitReached) {
        setCloudOnlyDirectoriesLimitReached(cloudOnlyDirectoriesLimitReached);
        return this;
    }

    /**
     * <p>
     * Indicates if the cloud directory limit has been reached.
     * </p>
     * 
     * @return Indicates if the cloud directory limit has been reached.
     */

    public Boolean isCloudOnlyDirectoriesLimitReached() {
        return this.cloudOnlyDirectoriesLimitReached;
    }

    /**
     * <p>
     * The maximum number of Microsoft AD directories allowed in the region.
     * </p>
     * 
     * @param cloudOnlyMicrosoftADLimit
     *        The maximum number of Microsoft AD directories allowed in the region.
     */

    public void setCloudOnlyMicrosoftADLimit(Integer cloudOnlyMicrosoftADLimit) {
        this.cloudOnlyMicrosoftADLimit = cloudOnlyMicrosoftADLimit;
    }

    /**
     * <p>
     * The maximum number of Microsoft AD directories allowed in the region.
     * </p>
     * 
     * @return The maximum number of Microsoft AD directories allowed in the region.
     */

    public Integer getCloudOnlyMicrosoftADLimit() {
        return this.cloudOnlyMicrosoftADLimit;
    }

    /**
     * <p>
     * The maximum number of Microsoft AD directories allowed in the region.
     * </p>
     * 
     * @param cloudOnlyMicrosoftADLimit
     *        The maximum number of Microsoft AD directories allowed in the region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryLimits withCloudOnlyMicrosoftADLimit(Integer cloudOnlyMicrosoftADLimit) {
        setCloudOnlyMicrosoftADLimit(cloudOnlyMicrosoftADLimit);
        return this;
    }

    /**
     * <p>
     * The current number of Microsoft AD directories in the region.
     * </p>
     * 
     * @param cloudOnlyMicrosoftADCurrentCount
     *        The current number of Microsoft AD directories in the region.
     */

    public void setCloudOnlyMicrosoftADCurrentCount(Integer cloudOnlyMicrosoftADCurrentCount) {
        this.cloudOnlyMicrosoftADCurrentCount = cloudOnlyMicrosoftADCurrentCount;
    }

    /**
     * <p>
     * The current number of Microsoft AD directories in the region.
     * </p>
     * 
     * @return The current number of Microsoft AD directories in the region.
     */

    public Integer getCloudOnlyMicrosoftADCurrentCount() {
        return this.cloudOnlyMicrosoftADCurrentCount;
    }

    /**
     * <p>
     * The current number of Microsoft AD directories in the region.
     * </p>
     * 
     * @param cloudOnlyMicrosoftADCurrentCount
     *        The current number of Microsoft AD directories in the region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryLimits withCloudOnlyMicrosoftADCurrentCount(Integer cloudOnlyMicrosoftADCurrentCount) {
        setCloudOnlyMicrosoftADCurrentCount(cloudOnlyMicrosoftADCurrentCount);
        return this;
    }

    /**
     * <p>
     * Indicates if the Microsoft AD directory limit has been reached.
     * </p>
     * 
     * @param cloudOnlyMicrosoftADLimitReached
     *        Indicates if the Microsoft AD directory limit has been reached.
     */

    public void setCloudOnlyMicrosoftADLimitReached(Boolean cloudOnlyMicrosoftADLimitReached) {
        this.cloudOnlyMicrosoftADLimitReached = cloudOnlyMicrosoftADLimitReached;
    }

    /**
     * <p>
     * Indicates if the Microsoft AD directory limit has been reached.
     * </p>
     * 
     * @return Indicates if the Microsoft AD directory limit has been reached.
     */

    public Boolean getCloudOnlyMicrosoftADLimitReached() {
        return this.cloudOnlyMicrosoftADLimitReached;
    }

    /**
     * <p>
     * Indicates if the Microsoft AD directory limit has been reached.
     * </p>
     * 
     * @param cloudOnlyMicrosoftADLimitReached
     *        Indicates if the Microsoft AD directory limit has been reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryLimits withCloudOnlyMicrosoftADLimitReached(Boolean cloudOnlyMicrosoftADLimitReached) {
        setCloudOnlyMicrosoftADLimitReached(cloudOnlyMicrosoftADLimitReached);
        return this;
    }

    /**
     * <p>
     * Indicates if the Microsoft AD directory limit has been reached.
     * </p>
     * 
     * @return Indicates if the Microsoft AD directory limit has been reached.
     */

    public Boolean isCloudOnlyMicrosoftADLimitReached() {
        return this.cloudOnlyMicrosoftADLimitReached;
    }

    /**
     * <p>
     * The maximum number of connected directories allowed in the region.
     * </p>
     * 
     * @param connectedDirectoriesLimit
     *        The maximum number of connected directories allowed in the region.
     */

    public void setConnectedDirectoriesLimit(Integer connectedDirectoriesLimit) {
        this.connectedDirectoriesLimit = connectedDirectoriesLimit;
    }

    /**
     * <p>
     * The maximum number of connected directories allowed in the region.
     * </p>
     * 
     * @return The maximum number of connected directories allowed in the region.
     */

    public Integer getConnectedDirectoriesLimit() {
        return this.connectedDirectoriesLimit;
    }

    /**
     * <p>
     * The maximum number of connected directories allowed in the region.
     * </p>
     * 
     * @param connectedDirectoriesLimit
     *        The maximum number of connected directories allowed in the region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryLimits withConnectedDirectoriesLimit(Integer connectedDirectoriesLimit) {
        setConnectedDirectoriesLimit(connectedDirectoriesLimit);
        return this;
    }

    /**
     * <p>
     * The current number of connected directories in the region.
     * </p>
     * 
     * @param connectedDirectoriesCurrentCount
     *        The current number of connected directories in the region.
     */

    public void setConnectedDirectoriesCurrentCount(Integer connectedDirectoriesCurrentCount) {
        this.connectedDirectoriesCurrentCount = connectedDirectoriesCurrentCount;
    }

    /**
     * <p>
     * The current number of connected directories in the region.
     * </p>
     * 
     * @return The current number of connected directories in the region.
     */

    public Integer getConnectedDirectoriesCurrentCount() {
        return this.connectedDirectoriesCurrentCount;
    }

    /**
     * <p>
     * The current number of connected directories in the region.
     * </p>
     * 
     * @param connectedDirectoriesCurrentCount
     *        The current number of connected directories in the region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryLimits withConnectedDirectoriesCurrentCount(Integer connectedDirectoriesCurrentCount) {
        setConnectedDirectoriesCurrentCount(connectedDirectoriesCurrentCount);
        return this;
    }

    /**
     * <p>
     * Indicates if the connected directory limit has been reached.
     * </p>
     * 
     * @param connectedDirectoriesLimitReached
     *        Indicates if the connected directory limit has been reached.
     */

    public void setConnectedDirectoriesLimitReached(Boolean connectedDirectoriesLimitReached) {
        this.connectedDirectoriesLimitReached = connectedDirectoriesLimitReached;
    }

    /**
     * <p>
     * Indicates if the connected directory limit has been reached.
     * </p>
     * 
     * @return Indicates if the connected directory limit has been reached.
     */

    public Boolean getConnectedDirectoriesLimitReached() {
        return this.connectedDirectoriesLimitReached;
    }

    /**
     * <p>
     * Indicates if the connected directory limit has been reached.
     * </p>
     * 
     * @param connectedDirectoriesLimitReached
     *        Indicates if the connected directory limit has been reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryLimits withConnectedDirectoriesLimitReached(Boolean connectedDirectoriesLimitReached) {
        setConnectedDirectoriesLimitReached(connectedDirectoriesLimitReached);
        return this;
    }

    /**
     * <p>
     * Indicates if the connected directory limit has been reached.
     * </p>
     * 
     * @return Indicates if the connected directory limit has been reached.
     */

    public Boolean isConnectedDirectoriesLimitReached() {
        return this.connectedDirectoriesLimitReached;
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
        if (getCloudOnlyDirectoriesLimit() != null)
            sb.append("CloudOnlyDirectoriesLimit: " + getCloudOnlyDirectoriesLimit() + ",");
        if (getCloudOnlyDirectoriesCurrentCount() != null)
            sb.append("CloudOnlyDirectoriesCurrentCount: " + getCloudOnlyDirectoriesCurrentCount() + ",");
        if (getCloudOnlyDirectoriesLimitReached() != null)
            sb.append("CloudOnlyDirectoriesLimitReached: " + getCloudOnlyDirectoriesLimitReached() + ",");
        if (getCloudOnlyMicrosoftADLimit() != null)
            sb.append("CloudOnlyMicrosoftADLimit: " + getCloudOnlyMicrosoftADLimit() + ",");
        if (getCloudOnlyMicrosoftADCurrentCount() != null)
            sb.append("CloudOnlyMicrosoftADCurrentCount: " + getCloudOnlyMicrosoftADCurrentCount() + ",");
        if (getCloudOnlyMicrosoftADLimitReached() != null)
            sb.append("CloudOnlyMicrosoftADLimitReached: " + getCloudOnlyMicrosoftADLimitReached() + ",");
        if (getConnectedDirectoriesLimit() != null)
            sb.append("ConnectedDirectoriesLimit: " + getConnectedDirectoriesLimit() + ",");
        if (getConnectedDirectoriesCurrentCount() != null)
            sb.append("ConnectedDirectoriesCurrentCount: " + getConnectedDirectoriesCurrentCount() + ",");
        if (getConnectedDirectoriesLimitReached() != null)
            sb.append("ConnectedDirectoriesLimitReached: " + getConnectedDirectoriesLimitReached());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectoryLimits == false)
            return false;
        DirectoryLimits other = (DirectoryLimits) obj;
        if (other.getCloudOnlyDirectoriesLimit() == null ^ this.getCloudOnlyDirectoriesLimit() == null)
            return false;
        if (other.getCloudOnlyDirectoriesLimit() != null && other.getCloudOnlyDirectoriesLimit().equals(this.getCloudOnlyDirectoriesLimit()) == false)
            return false;
        if (other.getCloudOnlyDirectoriesCurrentCount() == null ^ this.getCloudOnlyDirectoriesCurrentCount() == null)
            return false;
        if (other.getCloudOnlyDirectoriesCurrentCount() != null
                && other.getCloudOnlyDirectoriesCurrentCount().equals(this.getCloudOnlyDirectoriesCurrentCount()) == false)
            return false;
        if (other.getCloudOnlyDirectoriesLimitReached() == null ^ this.getCloudOnlyDirectoriesLimitReached() == null)
            return false;
        if (other.getCloudOnlyDirectoriesLimitReached() != null
                && other.getCloudOnlyDirectoriesLimitReached().equals(this.getCloudOnlyDirectoriesLimitReached()) == false)
            return false;
        if (other.getCloudOnlyMicrosoftADLimit() == null ^ this.getCloudOnlyMicrosoftADLimit() == null)
            return false;
        if (other.getCloudOnlyMicrosoftADLimit() != null && other.getCloudOnlyMicrosoftADLimit().equals(this.getCloudOnlyMicrosoftADLimit()) == false)
            return false;
        if (other.getCloudOnlyMicrosoftADCurrentCount() == null ^ this.getCloudOnlyMicrosoftADCurrentCount() == null)
            return false;
        if (other.getCloudOnlyMicrosoftADCurrentCount() != null
                && other.getCloudOnlyMicrosoftADCurrentCount().equals(this.getCloudOnlyMicrosoftADCurrentCount()) == false)
            return false;
        if (other.getCloudOnlyMicrosoftADLimitReached() == null ^ this.getCloudOnlyMicrosoftADLimitReached() == null)
            return false;
        if (other.getCloudOnlyMicrosoftADLimitReached() != null
                && other.getCloudOnlyMicrosoftADLimitReached().equals(this.getCloudOnlyMicrosoftADLimitReached()) == false)
            return false;
        if (other.getConnectedDirectoriesLimit() == null ^ this.getConnectedDirectoriesLimit() == null)
            return false;
        if (other.getConnectedDirectoriesLimit() != null && other.getConnectedDirectoriesLimit().equals(this.getConnectedDirectoriesLimit()) == false)
            return false;
        if (other.getConnectedDirectoriesCurrentCount() == null ^ this.getConnectedDirectoriesCurrentCount() == null)
            return false;
        if (other.getConnectedDirectoriesCurrentCount() != null
                && other.getConnectedDirectoriesCurrentCount().equals(this.getConnectedDirectoriesCurrentCount()) == false)
            return false;
        if (other.getConnectedDirectoriesLimitReached() == null ^ this.getConnectedDirectoriesLimitReached() == null)
            return false;
        if (other.getConnectedDirectoriesLimitReached() != null
                && other.getConnectedDirectoriesLimitReached().equals(this.getConnectedDirectoriesLimitReached()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudOnlyDirectoriesLimit() == null) ? 0 : getCloudOnlyDirectoriesLimit().hashCode());
        hashCode = prime * hashCode + ((getCloudOnlyDirectoriesCurrentCount() == null) ? 0 : getCloudOnlyDirectoriesCurrentCount().hashCode());
        hashCode = prime * hashCode + ((getCloudOnlyDirectoriesLimitReached() == null) ? 0 : getCloudOnlyDirectoriesLimitReached().hashCode());
        hashCode = prime * hashCode + ((getCloudOnlyMicrosoftADLimit() == null) ? 0 : getCloudOnlyMicrosoftADLimit().hashCode());
        hashCode = prime * hashCode + ((getCloudOnlyMicrosoftADCurrentCount() == null) ? 0 : getCloudOnlyMicrosoftADCurrentCount().hashCode());
        hashCode = prime * hashCode + ((getCloudOnlyMicrosoftADLimitReached() == null) ? 0 : getCloudOnlyMicrosoftADLimitReached().hashCode());
        hashCode = prime * hashCode + ((getConnectedDirectoriesLimit() == null) ? 0 : getConnectedDirectoriesLimit().hashCode());
        hashCode = prime * hashCode + ((getConnectedDirectoriesCurrentCount() == null) ? 0 : getConnectedDirectoriesCurrentCount().hashCode());
        hashCode = prime * hashCode + ((getConnectedDirectoriesLimitReached() == null) ? 0 : getConnectedDirectoriesLimitReached().hashCode());
        return hashCode;
    }

    @Override
    public DirectoryLimits clone() {
        try {
            return (DirectoryLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
