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
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInterfaceAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest) DescribeNetworkInterfaceAttribute operation}.
 * <p>
 * Describes a network interface attribute. You can specify only one attribute at a time.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest)
 */
public class DescribeNetworkInterfaceAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeNetworkInterfaceAttributeRequest> {

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * The <code>description</code> attribute.
     */
    private String description;

    /**
     * The <code>sourceDestCheck</code> attribute.
     */
    private String sourceDestCheck;

    /**
     * The <code>groupSet</code> attribute.
     */
    private String groups;

    /**
     * The <code>attachment</code> attribute.
     */
    private String attachment;

    /**
     * The ID of the network interface.
     *
     * @return The ID of the network interface.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * The ID of the network interface.
     *
     * @param networkInterfaceId The ID of the network interface.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * The ID of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId The ID of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNetworkInterfaceAttributeRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The <code>description</code> attribute.
     *
     * @return The <code>description</code> attribute.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The <code>description</code> attribute.
     *
     * @param description The <code>description</code> attribute.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The <code>description</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The <code>description</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNetworkInterfaceAttributeRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The <code>sourceDestCheck</code> attribute.
     *
     * @return The <code>sourceDestCheck</code> attribute.
     */
    public String getSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * The <code>sourceDestCheck</code> attribute.
     *
     * @param sourceDestCheck The <code>sourceDestCheck</code> attribute.
     */
    public void setSourceDestCheck(String sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * The <code>sourceDestCheck</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck The <code>sourceDestCheck</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNetworkInterfaceAttributeRequest withSourceDestCheck(String sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * The <code>groupSet</code> attribute.
     *
     * @return The <code>groupSet</code> attribute.
     */
    public String getGroups() {
        return groups;
    }
    
    /**
     * The <code>groupSet</code> attribute.
     *
     * @param groups The <code>groupSet</code> attribute.
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }
    
    /**
     * The <code>groupSet</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The <code>groupSet</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNetworkInterfaceAttributeRequest withGroups(String groups) {
        this.groups = groups;
        return this;
    }

    /**
     * The <code>attachment</code> attribute.
     *
     * @return The <code>attachment</code> attribute.
     */
    public String getAttachment() {
        return attachment;
    }
    
    /**
     * The <code>attachment</code> attribute.
     *
     * @param attachment The <code>attachment</code> attribute.
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
    
    /**
     * The <code>attachment</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachment The <code>attachment</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNetworkInterfaceAttributeRequest withAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkInterfaceAttributeRequest> getDryRunRequest() {
        Request<DescribeNetworkInterfaceAttributeRequest> request = new DescribeNetworkInterfaceAttributeRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getSourceDestCheck() != null) sb.append("SourceDestCheck: " + getSourceDestCheck() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() + ",");
        if (getAttachment() != null) sb.append("Attachment: " + getAttachment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNetworkInterfaceAttributeRequest == false) return false;
        DescribeNetworkInterfaceAttributeRequest other = (DescribeNetworkInterfaceAttributeRequest)obj;
        
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null) return false;
        if (other.getSourceDestCheck() != null && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        if (other.getAttachment() == null ^ this.getAttachment() == null) return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false) return false; 
        return true;
    }
    
}
    