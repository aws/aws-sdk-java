/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteDhcpOptions(DeleteDhcpOptionsRequest) DeleteDhcpOptions operation}.
 * <p>
 * Deletes a set of DHCP options that you specify. Amazon VPC returns an error if the set of options you specify is currently associated with a VPC. You
 * can disassociate the set of options by associating either a new set of options or the default options with the VPC.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteDhcpOptions(DeleteDhcpOptionsRequest)
 */
public class DeleteDhcpOptionsRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the DHCP options set to delete.
     */
    private String dhcpOptionsId;

    /**
     * Default constructor for a new DeleteDhcpOptionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteDhcpOptionsRequest() {}
    
    /**
     * Constructs a new DeleteDhcpOptionsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dhcpOptionsId The ID of the DHCP options set to delete.
     */
    public DeleteDhcpOptionsRequest(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    
    
    /**
     * The ID of the DHCP options set to delete.
     *
     * @return The ID of the DHCP options set to delete.
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }
    
    /**
     * The ID of the DHCP options set to delete.
     *
     * @param dhcpOptionsId The ID of the DHCP options set to delete.
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }
    
    /**
     * The ID of the DHCP options set to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsId The ID of the DHCP options set to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteDhcpOptionsRequest withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
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
        if (dhcpOptionsId != null) sb.append("DhcpOptionsId: " + dhcpOptionsId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DeleteDhcpOptionsRequest == false) return false;
        DeleteDhcpOptionsRequest other = (DeleteDhcpOptionsRequest)obj;
        
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null) return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false) return false; 
        return true;
    }
    
}
    