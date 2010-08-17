/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteVpc(DeleteVpcRequest) DeleteVpc operation}.
 * <p>
 * Deletes a VPC. You must terminate all running instances and delete
 * all subnets before deleting the VPC, otherwise Amazon VPC returns an
 * error.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteVpc(DeleteVpcRequest)
 */
public class DeleteVpcRequest extends AmazonWebServiceRequest {

    /**
     * 
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
     * @param vpcId
     */
    public DeleteVpcRequest(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * 
     *
     * @return 
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * 
     *
     * @param vpcId 
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteVpcRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    