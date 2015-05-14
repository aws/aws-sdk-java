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
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#getSnapshotLimits(GetSnapshotLimitsRequest) GetSnapshotLimits operation}.
 * <p>
 * Obtains the manual snapshot limits for a directory.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#getSnapshotLimits(GetSnapshotLimitsRequest)
 */
public class GetSnapshotLimitsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Contains the identifier of the directory to obtain the limits for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * Contains the identifier of the directory to obtain the limits for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return Contains the identifier of the directory to obtain the limits for.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * Contains the identifier of the directory to obtain the limits for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId Contains the identifier of the directory to obtain the limits for.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * Contains the identifier of the directory to obtain the limits for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId Contains the identifier of the directory to obtain the limits for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetSnapshotLimitsRequest withDirectoryId(String directoryId) {
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

        if (obj instanceof GetSnapshotLimitsRequest == false) return false;
        GetSnapshotLimitsRequest other = (GetSnapshotLimitsRequest)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        return true;
    }
    
    @Override
    public GetSnapshotLimitsRequest clone() {
        
            return (GetSnapshotLimitsRequest) super.clone();
    }

}
    