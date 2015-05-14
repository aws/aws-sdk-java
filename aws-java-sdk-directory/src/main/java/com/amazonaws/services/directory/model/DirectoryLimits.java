/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
     * The maximum number of cloud directories allowed in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer cloudOnlyDirectoriesLimit;

    /**
     * The current number of cloud directories in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer cloudOnlyDirectoriesCurrentCount;

    /**
     * Indicates if the cloud directory limit has been reached.
     */
    private Boolean cloudOnlyDirectoriesLimitReached;

    /**
     * The maximum number of connected directories allowed in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer connectedDirectoriesLimit;

    /**
     * The current number of connected directories in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer connectedDirectoriesCurrentCount;

    /**
     * Indicates if the connected directory limit has been reached.
     */
    private Boolean connectedDirectoriesLimitReached;

    /**
     * The maximum number of cloud directories allowed in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The maximum number of cloud directories allowed in the region.
     */
    public Integer getCloudOnlyDirectoriesLimit() {
        return cloudOnlyDirectoriesLimit;
    }
    
    /**
     * The maximum number of cloud directories allowed in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param cloudOnlyDirectoriesLimit The maximum number of cloud directories allowed in the region.
     */
    public void setCloudOnlyDirectoriesLimit(Integer cloudOnlyDirectoriesLimit) {
        this.cloudOnlyDirectoriesLimit = cloudOnlyDirectoriesLimit;
    }
    
    /**
     * The maximum number of cloud directories allowed in the region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param cloudOnlyDirectoriesLimit The maximum number of cloud directories allowed in the region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryLimits withCloudOnlyDirectoriesLimit(Integer cloudOnlyDirectoriesLimit) {
        this.cloudOnlyDirectoriesLimit = cloudOnlyDirectoriesLimit;
        return this;
    }

    /**
     * The current number of cloud directories in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The current number of cloud directories in the region.
     */
    public Integer getCloudOnlyDirectoriesCurrentCount() {
        return cloudOnlyDirectoriesCurrentCount;
    }
    
    /**
     * The current number of cloud directories in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param cloudOnlyDirectoriesCurrentCount The current number of cloud directories in the region.
     */
    public void setCloudOnlyDirectoriesCurrentCount(Integer cloudOnlyDirectoriesCurrentCount) {
        this.cloudOnlyDirectoriesCurrentCount = cloudOnlyDirectoriesCurrentCount;
    }
    
    /**
     * The current number of cloud directories in the region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param cloudOnlyDirectoriesCurrentCount The current number of cloud directories in the region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryLimits withCloudOnlyDirectoriesCurrentCount(Integer cloudOnlyDirectoriesCurrentCount) {
        this.cloudOnlyDirectoriesCurrentCount = cloudOnlyDirectoriesCurrentCount;
        return this;
    }

    /**
     * Indicates if the cloud directory limit has been reached.
     *
     * @return Indicates if the cloud directory limit has been reached.
     */
    public Boolean isCloudOnlyDirectoriesLimitReached() {
        return cloudOnlyDirectoriesLimitReached;
    }
    
    /**
     * Indicates if the cloud directory limit has been reached.
     *
     * @param cloudOnlyDirectoriesLimitReached Indicates if the cloud directory limit has been reached.
     */
    public void setCloudOnlyDirectoriesLimitReached(Boolean cloudOnlyDirectoriesLimitReached) {
        this.cloudOnlyDirectoriesLimitReached = cloudOnlyDirectoriesLimitReached;
    }
    
    /**
     * Indicates if the cloud directory limit has been reached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudOnlyDirectoriesLimitReached Indicates if the cloud directory limit has been reached.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryLimits withCloudOnlyDirectoriesLimitReached(Boolean cloudOnlyDirectoriesLimitReached) {
        this.cloudOnlyDirectoriesLimitReached = cloudOnlyDirectoriesLimitReached;
        return this;
    }

    /**
     * Indicates if the cloud directory limit has been reached.
     *
     * @return Indicates if the cloud directory limit has been reached.
     */
    public Boolean getCloudOnlyDirectoriesLimitReached() {
        return cloudOnlyDirectoriesLimitReached;
    }

    /**
     * The maximum number of connected directories allowed in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The maximum number of connected directories allowed in the region.
     */
    public Integer getConnectedDirectoriesLimit() {
        return connectedDirectoriesLimit;
    }
    
    /**
     * The maximum number of connected directories allowed in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param connectedDirectoriesLimit The maximum number of connected directories allowed in the region.
     */
    public void setConnectedDirectoriesLimit(Integer connectedDirectoriesLimit) {
        this.connectedDirectoriesLimit = connectedDirectoriesLimit;
    }
    
    /**
     * The maximum number of connected directories allowed in the region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param connectedDirectoriesLimit The maximum number of connected directories allowed in the region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryLimits withConnectedDirectoriesLimit(Integer connectedDirectoriesLimit) {
        this.connectedDirectoriesLimit = connectedDirectoriesLimit;
        return this;
    }

    /**
     * The current number of connected directories in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The current number of connected directories in the region.
     */
    public Integer getConnectedDirectoriesCurrentCount() {
        return connectedDirectoriesCurrentCount;
    }
    
    /**
     * The current number of connected directories in the region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param connectedDirectoriesCurrentCount The current number of connected directories in the region.
     */
    public void setConnectedDirectoriesCurrentCount(Integer connectedDirectoriesCurrentCount) {
        this.connectedDirectoriesCurrentCount = connectedDirectoriesCurrentCount;
    }
    
    /**
     * The current number of connected directories in the region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param connectedDirectoriesCurrentCount The current number of connected directories in the region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryLimits withConnectedDirectoriesCurrentCount(Integer connectedDirectoriesCurrentCount) {
        this.connectedDirectoriesCurrentCount = connectedDirectoriesCurrentCount;
        return this;
    }

    /**
     * Indicates if the connected directory limit has been reached.
     *
     * @return Indicates if the connected directory limit has been reached.
     */
    public Boolean isConnectedDirectoriesLimitReached() {
        return connectedDirectoriesLimitReached;
    }
    
    /**
     * Indicates if the connected directory limit has been reached.
     *
     * @param connectedDirectoriesLimitReached Indicates if the connected directory limit has been reached.
     */
    public void setConnectedDirectoriesLimitReached(Boolean connectedDirectoriesLimitReached) {
        this.connectedDirectoriesLimitReached = connectedDirectoriesLimitReached;
    }
    
    /**
     * Indicates if the connected directory limit has been reached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectedDirectoriesLimitReached Indicates if the connected directory limit has been reached.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryLimits withConnectedDirectoriesLimitReached(Boolean connectedDirectoriesLimitReached) {
        this.connectedDirectoriesLimitReached = connectedDirectoriesLimitReached;
        return this;
    }

    /**
     * Indicates if the connected directory limit has been reached.
     *
     * @return Indicates if the connected directory limit has been reached.
     */
    public Boolean getConnectedDirectoriesLimitReached() {
        return connectedDirectoriesLimitReached;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCloudOnlyDirectoriesLimit() != null) sb.append("CloudOnlyDirectoriesLimit: " + getCloudOnlyDirectoriesLimit() + ",");
        if (getCloudOnlyDirectoriesCurrentCount() != null) sb.append("CloudOnlyDirectoriesCurrentCount: " + getCloudOnlyDirectoriesCurrentCount() + ",");
        if (isCloudOnlyDirectoriesLimitReached() != null) sb.append("CloudOnlyDirectoriesLimitReached: " + isCloudOnlyDirectoriesLimitReached() + ",");
        if (getConnectedDirectoriesLimit() != null) sb.append("ConnectedDirectoriesLimit: " + getConnectedDirectoriesLimit() + ",");
        if (getConnectedDirectoriesCurrentCount() != null) sb.append("ConnectedDirectoriesCurrentCount: " + getConnectedDirectoriesCurrentCount() + ",");
        if (isConnectedDirectoriesLimitReached() != null) sb.append("ConnectedDirectoriesLimitReached: " + isConnectedDirectoriesLimitReached() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCloudOnlyDirectoriesLimit() == null) ? 0 : getCloudOnlyDirectoriesLimit().hashCode()); 
        hashCode = prime * hashCode + ((getCloudOnlyDirectoriesCurrentCount() == null) ? 0 : getCloudOnlyDirectoriesCurrentCount().hashCode()); 
        hashCode = prime * hashCode + ((isCloudOnlyDirectoriesLimitReached() == null) ? 0 : isCloudOnlyDirectoriesLimitReached().hashCode()); 
        hashCode = prime * hashCode + ((getConnectedDirectoriesLimit() == null) ? 0 : getConnectedDirectoriesLimit().hashCode()); 
        hashCode = prime * hashCode + ((getConnectedDirectoriesCurrentCount() == null) ? 0 : getConnectedDirectoriesCurrentCount().hashCode()); 
        hashCode = prime * hashCode + ((isConnectedDirectoriesLimitReached() == null) ? 0 : isConnectedDirectoriesLimitReached().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DirectoryLimits == false) return false;
        DirectoryLimits other = (DirectoryLimits)obj;
        
        if (other.getCloudOnlyDirectoriesLimit() == null ^ this.getCloudOnlyDirectoriesLimit() == null) return false;
        if (other.getCloudOnlyDirectoriesLimit() != null && other.getCloudOnlyDirectoriesLimit().equals(this.getCloudOnlyDirectoriesLimit()) == false) return false; 
        if (other.getCloudOnlyDirectoriesCurrentCount() == null ^ this.getCloudOnlyDirectoriesCurrentCount() == null) return false;
        if (other.getCloudOnlyDirectoriesCurrentCount() != null && other.getCloudOnlyDirectoriesCurrentCount().equals(this.getCloudOnlyDirectoriesCurrentCount()) == false) return false; 
        if (other.isCloudOnlyDirectoriesLimitReached() == null ^ this.isCloudOnlyDirectoriesLimitReached() == null) return false;
        if (other.isCloudOnlyDirectoriesLimitReached() != null && other.isCloudOnlyDirectoriesLimitReached().equals(this.isCloudOnlyDirectoriesLimitReached()) == false) return false; 
        if (other.getConnectedDirectoriesLimit() == null ^ this.getConnectedDirectoriesLimit() == null) return false;
        if (other.getConnectedDirectoriesLimit() != null && other.getConnectedDirectoriesLimit().equals(this.getConnectedDirectoriesLimit()) == false) return false; 
        if (other.getConnectedDirectoriesCurrentCount() == null ^ this.getConnectedDirectoriesCurrentCount() == null) return false;
        if (other.getConnectedDirectoriesCurrentCount() != null && other.getConnectedDirectoriesCurrentCount().equals(this.getConnectedDirectoriesCurrentCount()) == false) return false; 
        if (other.isConnectedDirectoriesLimitReached() == null ^ this.isConnectedDirectoriesLimitReached() == null) return false;
        if (other.isConnectedDirectoriesLimitReached() != null && other.isConnectedDirectoriesLimitReached().equals(this.isConnectedDirectoriesLimitReached()) == false) return false; 
        return true;
    }
    
    @Override
    public DirectoryLimits clone() {
        try {
            return (DirectoryLimits) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    