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
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#updateRadius(UpdateRadiusRequest) UpdateRadius operation}.
 * <p>
 * Updates the Remote Authentication Dial In User Service (RADIUS) server
 * information for an AD Connector directory.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#updateRadius(UpdateRadiusRequest)
 */
public class UpdateRadiusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the directory to update the RADIUS server
     * information for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * A <a>RadiusSettings</a> object that contains information about the
     * RADIUS server.
     */
    private RadiusSettings radiusSettings;

    /**
     * The identifier of the directory to update the RADIUS server
     * information for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The identifier of the directory to update the RADIUS server
     *         information for.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The identifier of the directory to update the RADIUS server
     * information for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to update the RADIUS server
     *         information for.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The identifier of the directory to update the RADIUS server
     * information for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to update the RADIUS server
     *         information for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRadiusRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * A <a>RadiusSettings</a> object that contains information about the
     * RADIUS server.
     *
     * @return A <a>RadiusSettings</a> object that contains information about the
     *         RADIUS server.
     */
    public RadiusSettings getRadiusSettings() {
        return radiusSettings;
    }
    
    /**
     * A <a>RadiusSettings</a> object that contains information about the
     * RADIUS server.
     *
     * @param radiusSettings A <a>RadiusSettings</a> object that contains information about the
     *         RADIUS server.
     */
    public void setRadiusSettings(RadiusSettings radiusSettings) {
        this.radiusSettings = radiusSettings;
    }
    
    /**
     * A <a>RadiusSettings</a> object that contains information about the
     * RADIUS server.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param radiusSettings A <a>RadiusSettings</a> object that contains information about the
     *         RADIUS server.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRadiusRequest withRadiusSettings(RadiusSettings radiusSettings) {
        this.radiusSettings = radiusSettings;
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
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getRadiusSettings() != null) sb.append("RadiusSettings: " + getRadiusSettings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode()); 
        hashCode = prime * hashCode + ((getRadiusSettings() == null) ? 0 : getRadiusSettings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateRadiusRequest == false) return false;
        UpdateRadiusRequest other = (UpdateRadiusRequest)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getRadiusSettings() == null ^ this.getRadiusSettings() == null) return false;
        if (other.getRadiusSettings() != null && other.getRadiusSettings().equals(this.getRadiusSettings()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateRadiusRequest clone() {
        
            return (UpdateRadiusRequest) super.clone();
    }

}
    