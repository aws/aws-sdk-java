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
import com.amazonaws.services.ec2.model.transform.CopyImageRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#copyImage(CopyImageRequest) CopyImage operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#copyImage(CopyImageRequest)
 */
public class CopyImageRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CopyImageRequest> {

    private String sourceRegion;

    private String sourceImageId;

    private String name;

    private String description;

    private String clientToken;

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
    public CopyImageRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * Returns the value of the SourceImageId property for this object.
     *
     * @return The value of the SourceImageId property for this object.
     */
    public String getSourceImageId() {
        return sourceImageId;
    }
    
    /**
     * Sets the value of the SourceImageId property for this object.
     *
     * @param sourceImageId The new value for the SourceImageId property for this object.
     */
    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }
    
    /**
     * Sets the value of the SourceImageId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceImageId The new value for the SourceImageId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyImageRequest withSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
        return this;
    }

    /**
     * Returns the value of the Name property for this object.
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     *
     * @param name The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyImageRequest withName(String name) {
        this.name = name;
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
    public CopyImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns the value of the ClientToken property for this object.
     *
     * @return The value of the ClientToken property for this object.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Sets the value of the ClientToken property for this object.
     *
     * @param clientToken The new value for the ClientToken property for this object.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Sets the value of the ClientToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken The new value for the ClientToken property for this object.
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
    