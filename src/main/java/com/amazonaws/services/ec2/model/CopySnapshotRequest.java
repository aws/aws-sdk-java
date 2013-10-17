/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CopySnapshotRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#copySnapshot(CopySnapshotRequest) CopySnapshot operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#copySnapshot(CopySnapshotRequest)
 */
public class CopySnapshotRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CopySnapshotRequest> {

    private String sourceRegion;

    private String sourceSnapshotId;

    private String description;

    /**
     * Returns the value of the SourceRegion property for this object.
     *
     * @return The value of the SourceRegion property for this object.
     */
    public String getSourceRegion() {
        return sourceRegion;
    }
    
    /**
     * Sets the value of the SourceRegion property for this object.
     *
     * @param sourceRegion The new value for the SourceRegion property for this object.
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }
    
    /**
     * Sets the value of the SourceRegion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceRegion The new value for the SourceRegion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopySnapshotRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * Returns the value of the SourceSnapshotId property for this object.
     *
     * @return The value of the SourceSnapshotId property for this object.
     */
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }
    
    /**
     * Sets the value of the SourceSnapshotId property for this object.
     *
     * @param sourceSnapshotId The new value for the SourceSnapshotId property for this object.
     */
    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }
    
    /**
     * Sets the value of the SourceSnapshotId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSnapshotId The new value for the SourceSnapshotId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopySnapshotRequest withSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    /**
     * Returns the value of the Description property for this object.
     *
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     *
     * @param description The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The new value for the Description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopySnapshotRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CopySnapshotRequest> getDryRunRequest() {
        Request<CopySnapshotRequest> request = new CopySnapshotRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSourceRegion() != null) sb.append("SourceRegion: " + getSourceRegion() + ",");
        if (getSourceSnapshotId() != null) sb.append("SourceSnapshotId: " + getSourceSnapshotId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CopySnapshotRequest == false) return false;
        CopySnapshotRequest other = (CopySnapshotRequest)obj;
        
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null) return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false) return false; 
        if (other.getSourceSnapshotId() == null ^ this.getSourceSnapshotId() == null) return false;
        if (other.getSourceSnapshotId() != null && other.getSourceSnapshotId().equals(this.getSourceSnapshotId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    