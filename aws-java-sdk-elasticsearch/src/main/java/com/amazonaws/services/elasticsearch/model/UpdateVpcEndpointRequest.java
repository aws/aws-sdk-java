/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies an Amazon OpenSearch Service-managed interface VPC endpoint.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVpcEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier of the VPC endpoint to be updated.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The security groups and/or subnets to add, remove, or modify.
     * </p>
     */
    private VPCOptions vpcOptions;

    /**
     * <p>
     * Unique identifier of the VPC endpoint to be updated.
     * </p>
     * 
     * @param vpcEndpointId
     *        Unique identifier of the VPC endpoint to be updated.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * Unique identifier of the VPC endpoint to be updated.
     * </p>
     * 
     * @return Unique identifier of the VPC endpoint to be updated.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * Unique identifier of the VPC endpoint to be updated.
     * </p>
     * 
     * @param vpcEndpointId
     *        Unique identifier of the VPC endpoint to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The security groups and/or subnets to add, remove, or modify.
     * </p>
     * 
     * @param vpcOptions
     *        The security groups and/or subnets to add, remove, or modify.
     */

    public void setVpcOptions(VPCOptions vpcOptions) {
        this.vpcOptions = vpcOptions;
    }

    /**
     * <p>
     * The security groups and/or subnets to add, remove, or modify.
     * </p>
     * 
     * @return The security groups and/or subnets to add, remove, or modify.
     */

    public VPCOptions getVpcOptions() {
        return this.vpcOptions;
    }

    /**
     * <p>
     * The security groups and/or subnets to add, remove, or modify.
     * </p>
     * 
     * @param vpcOptions
     *        The security groups and/or subnets to add, remove, or modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withVpcOptions(VPCOptions vpcOptions) {
        setVpcOptions(vpcOptions);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getVpcOptions() != null)
            sb.append("VpcOptions: ").append(getVpcOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVpcEndpointRequest == false)
            return false;
        UpdateVpcEndpointRequest other = (UpdateVpcEndpointRequest) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcOptions() == null ^ this.getVpcOptions() == null)
            return false;
        if (other.getVpcOptions() != null && other.getVpcOptions().equals(this.getVpcOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcOptions() == null) ? 0 : getVpcOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVpcEndpointRequest clone() {
        return (UpdateVpcEndpointRequest) super.clone();
    }

}
