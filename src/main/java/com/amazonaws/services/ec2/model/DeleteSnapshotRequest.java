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
import com.amazonaws.services.ec2.model.transform.DeleteSnapshotRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteSnapshot(DeleteSnapshotRequest) DeleteSnapshot operation}.
 * <p>
 * Deletes the specified snapshot.
 * </p>
 * <p>
 * When you make periodic snapshots of a volume, the snapshots are incremental, and only the blocks on the device that have changed since your last
 * snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which
 * prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the volume.
 * </p>
 * <p>
 * You cannot delete a snapshot of the root device of an Amazon EBS volume used by a registered AMI. You must first de-register the AMI before you can
 * delete the snapshot.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-snapshot.html"> Deleting an Amazon EBS Snapshot
 * </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteSnapshot(DeleteSnapshotRequest)
 */
public class DeleteSnapshotRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteSnapshotRequest> {

    /**
     * The ID of the Amazon EBS snapshot.
     */
    private String snapshotId;

    /**
     * Default constructor for a new DeleteSnapshotRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteSnapshotRequest() {}
    
    /**
     * Constructs a new DeleteSnapshotRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param snapshotId The ID of the Amazon EBS snapshot.
     */
    public DeleteSnapshotRequest(String snapshotId) {
        setSnapshotId(snapshotId);
    }

    /**
     * The ID of the Amazon EBS snapshot.
     *
     * @return The ID of the Amazon EBS snapshot.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the Amazon EBS snapshot.
     *
     * @param snapshotId The ID of the Amazon EBS snapshot.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the Amazon EBS snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the Amazon EBS snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteSnapshotRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteSnapshotRequest> getDryRunRequest() {
        Request<DeleteSnapshotRequest> request = new DeleteSnapshotRequestMarshaller().marshall(this);
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
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteSnapshotRequest == false) return false;
        DeleteSnapshotRequest other = (DeleteSnapshotRequest)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        return true;
    }
    
}
    