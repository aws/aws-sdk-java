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
import com.amazonaws.services.ec2.model.transform.ReplaceNetworkAclAssociationRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest) ReplaceNetworkAclAssociation operation}.
 * <p>
 * Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically associated with the default network
 * ACL. For more information about network ACLs, go to Network ACLs in the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest)
 */
public class ReplaceNetworkAclAssociationRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ReplaceNetworkAclAssociationRequest> {

    /**
     * The ID representing the current association between the original
     * network ACL and the subnet.
     */
    private String associationId;

    /**
     * The ID of the new ACL to associate with the subnet.
     */
    private String networkAclId;

    /**
     * The ID representing the current association between the original
     * network ACL and the subnet.
     *
     * @return The ID representing the current association between the original
     *         network ACL and the subnet.
     */
    public String getAssociationId() {
        return associationId;
    }
    
    /**
     * The ID representing the current association between the original
     * network ACL and the subnet.
     *
     * @param associationId The ID representing the current association between the original
     *         network ACL and the subnet.
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }
    
    /**
     * The ID representing the current association between the original
     * network ACL and the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationId The ID representing the current association between the original
     *         network ACL and the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceNetworkAclAssociationRequest withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * The ID of the new ACL to associate with the subnet.
     *
     * @return The ID of the new ACL to associate with the subnet.
     */
    public String getNetworkAclId() {
        return networkAclId;
    }
    
    /**
     * The ID of the new ACL to associate with the subnet.
     *
     * @param networkAclId The ID of the new ACL to associate with the subnet.
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }
    
    /**
     * The ID of the new ACL to associate with the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclId The ID of the new ACL to associate with the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceNetworkAclAssociationRequest withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ReplaceNetworkAclAssociationRequest> getDryRunRequest() {
        Request<ReplaceNetworkAclAssociationRequest> request = new ReplaceNetworkAclAssociationRequestMarshaller().marshall(this);
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
        if (getAssociationId() != null) sb.append("AssociationId: " + getAssociationId() + ",");
        if (getNetworkAclId() != null) sb.append("NetworkAclId: " + getNetworkAclId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReplaceNetworkAclAssociationRequest == false) return false;
        ReplaceNetworkAclAssociationRequest other = (ReplaceNetworkAclAssociationRequest)obj;
        
        if (other.getAssociationId() == null ^ this.getAssociationId() == null) return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false) return false; 
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null) return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false) return false; 
        return true;
    }
    
}
    