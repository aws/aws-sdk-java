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
import com.amazonaws.services.ec2.model.transform.CreateNetworkAclRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createNetworkAcl(CreateNetworkAclRequest) CreateNetworkAcl operation}.
 * <p>
 * Creates a new network ACL in a VPC. Network ACLs provide an optional layer of security (on top of security groups) for the instances in your VPC. For
 * more information about network ACLs, go to Network ACLs in the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createNetworkAcl(CreateNetworkAclRequest)
 */
public class CreateNetworkAclRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateNetworkAclRequest> {

    /**
     * The ID of the VPC where the network ACL will be created.
     */
    private String vpcId;

    /**
     * The ID of the VPC where the network ACL will be created.
     *
     * @return The ID of the VPC where the network ACL will be created.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC where the network ACL will be created.
     *
     * @param vpcId The ID of the VPC where the network ACL will be created.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC where the network ACL will be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC where the network ACL will be created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateNetworkAclRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateNetworkAclRequest> getDryRunRequest() {
        Request<CreateNetworkAclRequest> request = new CreateNetworkAclRequestMarshaller().marshall(this);
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
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateNetworkAclRequest == false) return false;
        CreateNetworkAclRequest other = (CreateNetworkAclRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
}
    