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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#disableRadius(DisableRadiusRequest) DisableRadius operation}.
 * <p>
 * Disables multi-factor authentication (MFA) with Remote Authentication
 * Dial In User Service (RADIUS) for an AD Connector directory.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#disableRadius(DisableRadiusRequest)
 */
public class DisableRadiusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the directory to disable MFA for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * The identifier of the directory to disable MFA for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The identifier of the directory to disable MFA for.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The identifier of the directory to disable MFA for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to disable MFA for.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The identifier of the directory to disable MFA for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to disable MFA for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DisableRadiusRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
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
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DisableRadiusRequest == false) return false;
        DisableRadiusRequest other = (DisableRadiusRequest)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        return true;
    }
    
    @Override
    public DisableRadiusRequest clone() {
        
            return (DisableRadiusRequest) super.clone();
    }

}
    