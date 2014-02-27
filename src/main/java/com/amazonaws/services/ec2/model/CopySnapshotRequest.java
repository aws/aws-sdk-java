/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Copies a point-in-time snapshot of an Amazon EBS volume and stores it
 * in Amazon S3. You can copy the snapshot within the same region or from
 * one region to another. You can use the snapshot to create Amazon EBS
 * volumes or Amazon Machine Images (AMIs).
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html"> Copying an Amazon EBS Snapshot </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#copySnapshot(CopySnapshotRequest)
 */
public class CopySnapshotRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CopySnapshotRequest> {

    /**
     * The ID of the region that contains the snapshot to be copied.
     */
    private String sourceRegion;

    /**
     * The ID of the Amazon EBS snapshot to copy.
     */
    private String sourceSnapshotId;

    /**
     * A description for the new Amazon EBS snapshot.
     */
    private String description;

    /**
     * The ID of the region that contains the snapshot to be copied.
     *
     * @return The ID of the region that contains the snapshot to be copied.
     */
    public String getSourceRegion() {
        return sourceRegion;
    }
    
    /**
     * The ID of the region that contains the snapshot to be copied.
     *
     * @param sourceRegion The ID of the region that contains the snapshot to be copied.
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }
    
    /**
     * The ID of the region that contains the snapshot to be copied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceRegion The ID of the region that contains the snapshot to be copied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopySnapshotRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * The ID of the Amazon EBS snapshot to copy.
     *
     * @return The ID of the Amazon EBS snapshot to copy.
     */
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }
    
    /**
     * The ID of the Amazon EBS snapshot to copy.
     *
     * @param sourceSnapshotId The ID of the Amazon EBS snapshot to copy.
     */
    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }
    
    /**
     * The ID of the Amazon EBS snapshot to copy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSnapshotId The ID of the Amazon EBS snapshot to copy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopySnapshotRequest withSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    /**
     * A description for the new Amazon EBS snapshot.
     *
     * @return A description for the new Amazon EBS snapshot.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the new Amazon EBS snapshot.
     *
     * @param description A description for the new Amazon EBS snapshot.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the new Amazon EBS snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the new Amazon EBS snapshot.
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
    