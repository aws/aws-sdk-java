/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVpcTenancyRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcTenancyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyVpcTenancyRequest> {

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The instance tenancy attribute for the VPC.
     * </p>
     */
    private String instanceTenancy;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcTenancyRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The instance tenancy attribute for the VPC.
     * </p>
     * 
     * @param instanceTenancy
     *        The instance tenancy attribute for the VPC.
     * @see VpcTenancy
     */

    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The instance tenancy attribute for the VPC.
     * </p>
     * 
     * @return The instance tenancy attribute for the VPC.
     * @see VpcTenancy
     */

    public String getInstanceTenancy() {
        return this.instanceTenancy;
    }

    /**
     * <p>
     * The instance tenancy attribute for the VPC.
     * </p>
     * 
     * @param instanceTenancy
     *        The instance tenancy attribute for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcTenancy
     */

    public ModifyVpcTenancyRequest withInstanceTenancy(String instanceTenancy) {
        setInstanceTenancy(instanceTenancy);
        return this;
    }

    /**
     * <p>
     * The instance tenancy attribute for the VPC.
     * </p>
     * 
     * @param instanceTenancy
     *        The instance tenancy attribute for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcTenancy
     */

    public ModifyVpcTenancyRequest withInstanceTenancy(VpcTenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcTenancyRequest> getDryRunRequest() {
        Request<ModifyVpcTenancyRequest> request = new ModifyVpcTenancyRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: ").append(getInstanceTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcTenancyRequest == false)
            return false;
        ModifyVpcTenancyRequest other = (ModifyVpcTenancyRequest) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcTenancyRequest clone() {
        return (ModifyVpcTenancyRequest) super.clone();
    }
}
