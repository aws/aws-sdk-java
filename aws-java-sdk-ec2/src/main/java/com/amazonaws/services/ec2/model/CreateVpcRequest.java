/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVpcRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateVpc.
 * </p>
 */
public class CreateVpcRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVpcRequest> {

    /**
     * <p>
     * The network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     */
    private String instanceTenancy;

    /**
     * Default constructor for CreateVpcRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public CreateVpcRequest() {
    }

    /**
     * Constructs a new CreateVpcRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cidrBlock
     *        The network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     */
    public CreateVpcRequest(String cidrBlock) {
        setCidrBlock(cidrBlock);
    }

    /**
     * <p>
     * The network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * </p>
     * 
     * @return The network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The network range for the VPC, in CIDR notation. For example, <code>10.0.0.0/16</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcRequest withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *        with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *        <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *        launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *        VPC. </p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @see Tenancy
     */

    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @return The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *         with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *         <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *         launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *         VPC. </p>
     *         <p>
     *         <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *         <code>default</code> or <code>dedicated</code> values only.
     *         </p>
     *         <p>
     *         Default: <code>default</code>
     * @see Tenancy
     */

    public String getInstanceTenancy() {
        return this.instanceTenancy;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *        with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *        <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *        launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *        VPC. </p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public CreateVpcRequest withInstanceTenancy(String instanceTenancy) {
        setInstanceTenancy(instanceTenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *        with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *        <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *        launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *        VPC. </p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @see Tenancy
     */

    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched with
     * shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     * <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only launch
     * instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy options for instances launched into the VPC. For <code>default</code>, instances are launched
     *        with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For
     *        <code>dedicated</code>, instances are launched as dedicated tenancy instances by default. You can only
     *        launch instances with a tenancy of <code>dedicated</code> or <code>host</code> into a dedicated tenancy
     *        VPC. </p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public CreateVpcRequest withInstanceTenancy(Tenancy instanceTenancy) {
        setInstanceTenancy(instanceTenancy);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVpcRequest> getDryRunRequest() {
        Request<CreateVpcRequest> request = new CreateVpcRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: " + getInstanceTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcRequest == false)
            return false;
        CreateVpcRequest other = (CreateVpcRequest) obj;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
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

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcRequest clone() {
        return (CreateVpcRequest) super.clone();
    }
}
