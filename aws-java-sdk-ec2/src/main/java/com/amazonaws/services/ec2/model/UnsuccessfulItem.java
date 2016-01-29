/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about items that were not successfully processed in a
 * batch call.
 * </p>
 */
public class UnsuccessfulItem implements Serializable, Cloneable {

    /**
     * Information about the error.
     */
    private UnsuccessfulItemError error;

    /**
     * The ID of the resource.
     */
    private String resourceId;

    /**
     * Information about the error.
     *
     * @return Information about the error.
     */
    public UnsuccessfulItemError getError() {
        return error;
    }
    
    /**
     * Information about the error.
     *
     * @param error Information about the error.
     */
    public void setError(UnsuccessfulItemError error) {
        this.error = error;
    }
    
    /**
     * Information about the error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param error Information about the error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UnsuccessfulItem withError(UnsuccessfulItemError error) {
        this.error = error;
        return this;
    }

    /**
     * The ID of the resource.
     *
     * @return The ID of the resource.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the resource.
     *
     * @param resourceId The ID of the resource.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The ID of the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UnsuccessfulItem withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
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
        if (getError() != null) sb.append("Error: " + getError() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UnsuccessfulItem == false) return false;
        UnsuccessfulItem other = (UnsuccessfulItem)obj;
        
        if (other.getError() == null ^ this.getError() == null) return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        return true;
    }
    
    @Override
    public UnsuccessfulItem clone() {
        try {
            return (UnsuccessfulItem) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    