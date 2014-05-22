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
 * volumes or Amazon Machine Images (AMIs). The snapshot is copied to the
 * regional endpoint that you send the HTTP request to.
 * </p>
 * <p>
 * Copies of encrypted Amazon EBS snapshots remain encrypted. Copies of
 * unencrypted snapshots remain unencrypted.
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
     * The destination region of the snapshot copy operation. This parameter
     * is required in the <code>PresignedUrl</code>.
     */
    private String destinationRegion;

    /**
     * The pre-signed URL that facilitates copying an encrypted snapshot.
     * This parameter is only required when copying an encrypted snapshot
     * with the Amazon EC2 Query API; it is available as an optional
     * parameter in all other cases. The <code>PresignedUrl</code> should use
     * the snapshot source endpoint, the <code>CopySnapshot</code> action,
     * and include the <code>SourceRegion</code>,
     * <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS
     * Signature Version 4. Because Amazon EBS snapshots are stored in Amazon
     * S3, the signing algorithm for this parameter uses the same logic that
     * is described in <a
     * href="http://http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     * Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     * the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     * improperly signed <code>PresignedUrl</code> will cause the copy
     * operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     */
    private String presignedUrl;

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
     * The destination region of the snapshot copy operation. This parameter
     * is required in the <code>PresignedUrl</code>.
     *
     * @return The destination region of the snapshot copy operation. This parameter
     *         is required in the <code>PresignedUrl</code>.
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }
    
    /**
     * The destination region of the snapshot copy operation. This parameter
     * is required in the <code>PresignedUrl</code>.
     *
     * @param destinationRegion The destination region of the snapshot copy operation. This parameter
     *         is required in the <code>PresignedUrl</code>.
     */
    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }
    
    /**
     * The destination region of the snapshot copy operation. This parameter
     * is required in the <code>PresignedUrl</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationRegion The destination region of the snapshot copy operation. This parameter
     *         is required in the <code>PresignedUrl</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopySnapshotRequest withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * The pre-signed URL that facilitates copying an encrypted snapshot.
     * This parameter is only required when copying an encrypted snapshot
     * with the Amazon EC2 Query API; it is available as an optional
     * parameter in all other cases. The <code>PresignedUrl</code> should use
     * the snapshot source endpoint, the <code>CopySnapshot</code> action,
     * and include the <code>SourceRegion</code>,
     * <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS
     * Signature Version 4. Because Amazon EBS snapshots are stored in Amazon
     * S3, the signing algorithm for this parameter uses the same logic that
     * is described in <a
     * href="http://http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     * Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     * the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     * improperly signed <code>PresignedUrl</code> will cause the copy
     * operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     *
     * @return The pre-signed URL that facilitates copying an encrypted snapshot.
     *         This parameter is only required when copying an encrypted snapshot
     *         with the Amazon EC2 Query API; it is available as an optional
     *         parameter in all other cases. The <code>PresignedUrl</code> should use
     *         the snapshot source endpoint, the <code>CopySnapshot</code> action,
     *         and include the <code>SourceRegion</code>,
     *         <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     *         parameters. The <code>PresignedUrl</code> must be signed using AWS
     *         Signature Version 4. Because Amazon EBS snapshots are stored in Amazon
     *         S3, the signing algorithm for this parameter uses the same logic that
     *         is described in <a
     *         href="http://http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     *         the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     *         improperly signed <code>PresignedUrl</code> will cause the copy
     *         operation to fail asynchronously, and the snapshot will move to an
     *         <code>error</code> state.
     */
    public String getPresignedUrl() {
        return presignedUrl;
    }
    
    /**
     * The pre-signed URL that facilitates copying an encrypted snapshot.
     * This parameter is only required when copying an encrypted snapshot
     * with the Amazon EC2 Query API; it is available as an optional
     * parameter in all other cases. The <code>PresignedUrl</code> should use
     * the snapshot source endpoint, the <code>CopySnapshot</code> action,
     * and include the <code>SourceRegion</code>,
     * <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS
     * Signature Version 4. Because Amazon EBS snapshots are stored in Amazon
     * S3, the signing algorithm for this parameter uses the same logic that
     * is described in <a
     * href="http://http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     * Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     * the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     * improperly signed <code>PresignedUrl</code> will cause the copy
     * operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     *
     * @param presignedUrl The pre-signed URL that facilitates copying an encrypted snapshot.
     *         This parameter is only required when copying an encrypted snapshot
     *         with the Amazon EC2 Query API; it is available as an optional
     *         parameter in all other cases. The <code>PresignedUrl</code> should use
     *         the snapshot source endpoint, the <code>CopySnapshot</code> action,
     *         and include the <code>SourceRegion</code>,
     *         <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     *         parameters. The <code>PresignedUrl</code> must be signed using AWS
     *         Signature Version 4. Because Amazon EBS snapshots are stored in Amazon
     *         S3, the signing algorithm for this parameter uses the same logic that
     *         is described in <a
     *         href="http://http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     *         the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     *         improperly signed <code>PresignedUrl</code> will cause the copy
     *         operation to fail asynchronously, and the snapshot will move to an
     *         <code>error</code> state.
     */
    public void setPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
    }
    
    /**
     * The pre-signed URL that facilitates copying an encrypted snapshot.
     * This parameter is only required when copying an encrypted snapshot
     * with the Amazon EC2 Query API; it is available as an optional
     * parameter in all other cases. The <code>PresignedUrl</code> should use
     * the snapshot source endpoint, the <code>CopySnapshot</code> action,
     * and include the <code>SourceRegion</code>,
     * <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS
     * Signature Version 4. Because Amazon EBS snapshots are stored in Amazon
     * S3, the signing algorithm for this parameter uses the same logic that
     * is described in <a
     * href="http://http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     * Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     * the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     * improperly signed <code>PresignedUrl</code> will cause the copy
     * operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param presignedUrl The pre-signed URL that facilitates copying an encrypted snapshot.
     *         This parameter is only required when copying an encrypted snapshot
     *         with the Amazon EC2 Query API; it is available as an optional
     *         parameter in all other cases. The <code>PresignedUrl</code> should use
     *         the snapshot source endpoint, the <code>CopySnapshot</code> action,
     *         and include the <code>SourceRegion</code>,
     *         <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     *         parameters. The <code>PresignedUrl</code> must be signed using AWS
     *         Signature Version 4. Because Amazon EBS snapshots are stored in Amazon
     *         S3, the signing algorithm for this parameter uses the same logic that
     *         is described in <a
     *         href="http://http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     *         the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     *         improperly signed <code>PresignedUrl</code> will cause the copy
     *         operation to fail asynchronously, and the snapshot will move to an
     *         <code>error</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopySnapshotRequest withPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
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
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDestinationRegion() != null) sb.append("DestinationRegion: " + getDestinationRegion() + ",");
        if (getPresignedUrl() != null) sb.append("PresignedUrl: " + getPresignedUrl() );
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
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode()); 
        hashCode = prime * hashCode + ((getPresignedUrl() == null) ? 0 : getPresignedUrl().hashCode()); 
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
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null) return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false) return false; 
        if (other.getPresignedUrl() == null ^ this.getPresignedUrl() == null) return false;
        if (other.getPresignedUrl() != null && other.getPresignedUrl().equals(this.getPresignedUrl()) == false) return false; 
        return true;
    }
    
}
    