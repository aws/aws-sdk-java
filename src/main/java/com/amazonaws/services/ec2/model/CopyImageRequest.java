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
import com.amazonaws.services.ec2.model.transform.CopyImageRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#copyImage(CopyImageRequest) CopyImage operation}.
 * <p>
 * Initiates the copy of an AMI from the specified source region to the
 * region in which the request was made. You specify the destination
 * region by using its endpoint when making the request. AMIs that use
 * encrypted Amazon EBS snapshots cannot be copied with this method.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html"> Copying AMIs </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#copyImage(CopyImageRequest)
 */
public class CopyImageRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CopyImageRequest> {

    /**
     * The name of the region that contains the AMI to copy.
     */
    private String sourceRegion;

    /**
     * The ID of the AMI to copy.
     */
    private String sourceImageId;

    /**
     * The name of the new AMI in the destination region.
     */
    private String name;

    /**
     * A description for the new AMI in the destination region.
     */
    private String description;

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     */
    private String clientToken;

    /**
     * The name of the region that contains the AMI to copy.
     *
     * @return The name of the region that contains the AMI to copy.
     */
    public String getSourceRegion() {
        return sourceRegion;
    }
    
    /**
     * The name of the region that contains the AMI to copy.
     *
     * @param sourceRegion The name of the region that contains the AMI to copy.
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }
    
    /**
     * The name of the region that contains the AMI to copy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceRegion The name of the region that contains the AMI to copy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyImageRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * The ID of the AMI to copy.
     *
     * @return The ID of the AMI to copy.
     */
    public String getSourceImageId() {
        return sourceImageId;
    }
    
    /**
     * The ID of the AMI to copy.
     *
     * @param sourceImageId The ID of the AMI to copy.
     */
    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }
    
    /**
     * The ID of the AMI to copy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceImageId The ID of the AMI to copy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyImageRequest withSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
        return this;
    }

    /**
     * The name of the new AMI in the destination region.
     *
     * @return The name of the new AMI in the destination region.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the new AMI in the destination region.
     *
     * @param name The name of the new AMI in the destination region.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the new AMI in the destination region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the new AMI in the destination region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyImageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A description for the new AMI in the destination region.
     *
     * @return A description for the new AMI in the destination region.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the new AMI in the destination region.
     *
     * @param description A description for the new AMI in the destination region.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the new AMI in the destination region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the new AMI in the destination region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyImageRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CopyImageRequest> getDryRunRequest() {
        Request<CopyImageRequest> request = new CopyImageRequestMarshaller().marshall(this);
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
        if (getSourceImageId() != null) sb.append("SourceImageId: " + getSourceImageId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode()); 
        hashCode = prime * hashCode + ((getSourceImageId() == null) ? 0 : getSourceImageId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CopyImageRequest == false) return false;
        CopyImageRequest other = (CopyImageRequest)obj;
        
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null) return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false) return false; 
        if (other.getSourceImageId() == null ^ this.getSourceImageId() == null) return false;
        if (other.getSourceImageId() != null && other.getSourceImageId().equals(this.getSourceImageId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
}
    