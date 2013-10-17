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
import com.amazonaws.services.ec2.model.transform.DeleteVpcRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteVpc(DeleteVpcRequest) DeleteVpc operation}.
 * <p>
 * Deletes a VPC. You must detach or delete all gateways or other objects that are dependent on the VPC first. For example, you must terminate all
 * running instances, delete all VPC security groups (except the default), delete all the route tables (except the default), etc.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteVpc(DeleteVpcRequest)
 */
public class DeleteVpcRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteVpcRequest> {

    /**
     * The ID of the VPC you want to delete.
     */
    private String vpcId;

    /**
     * Default constructor for a new DeleteVpcRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteVpcRequest() {}
    
    /**
     * Constructs a new DeleteVpcRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vpcId The ID of the VPC you want to delete.
     */
    public DeleteVpcRequest(String vpcId) {
        setVpcId(vpcId);
    }

    /**
     * The ID of the VPC you want to delete.
     *
     * @return The ID of the VPC you want to delete.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC you want to delete.
     *
     * @param vpcId The ID of the VPC you want to delete.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteVpcRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteVpcRequest> getDryRunRequest() {
        Request<DeleteVpcRequest> request = new DeleteVpcRequestMarshaller().marshall(this);
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

        if (obj instanceof DeleteVpcRequest == false) return false;
        DeleteVpcRequest other = (DeleteVpcRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
}
    