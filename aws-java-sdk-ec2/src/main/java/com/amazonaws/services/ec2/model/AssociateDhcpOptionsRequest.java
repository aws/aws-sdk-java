/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.AssociateDhcpOptionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#associateDhcpOptions(AssociateDhcpOptionsRequest) AssociateDhcpOptions operation}.
 * <p>
 * Associates a set of DHCP options (that you've previously created) with
 * the specified VPC, or associates no DHCP options with the VPC.
 * </p>
 * <p>
 * After you associate the options with the VPC, any existing instances
 * and all new instances that you launch in that VPC use the options. You
 * don't need to restart or relaunch the instances. They automatically
 * pick up the changes within a few hours, depending on how frequently
 * the instance renews its DHCP lease. You can explicitly renew the lease
 * using the operating system on the instance.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#associateDhcpOptions(AssociateDhcpOptionsRequest)
 */
public class AssociateDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AssociateDhcpOptionsRequest> {

    /**
     * The ID of the DHCP options set, or <code>default</code> to associate
     * no DHCP options with the VPC.
     */
    private String dhcpOptionsId;

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * Default constructor for a new AssociateDhcpOptionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AssociateDhcpOptionsRequest() {}
    
    /**
     * Constructs a new AssociateDhcpOptionsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vpcId The ID of the VPC.
     */
    public AssociateDhcpOptionsRequest(String vpcId) {
        setVpcId(vpcId);
    }

    /**
     * The ID of the DHCP options set, or <code>default</code> to associate
     * no DHCP options with the VPC.
     *
     * @return The ID of the DHCP options set, or <code>default</code> to associate
     *         no DHCP options with the VPC.
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }
    
    /**
     * The ID of the DHCP options set, or <code>default</code> to associate
     * no DHCP options with the VPC.
     *
     * @param dhcpOptionsId The ID of the DHCP options set, or <code>default</code> to associate
     *         no DHCP options with the VPC.
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }
    
    /**
     * The ID of the DHCP options set, or <code>default</code> to associate
     * no DHCP options with the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsId The ID of the DHCP options set, or <code>default</code> to associate
     *         no DHCP options with the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssociateDhcpOptionsRequest withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }

    /**
     * The ID of the VPC.
     *
     * @return The ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC.
     *
     * @param vpcId The ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssociateDhcpOptionsRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AssociateDhcpOptionsRequest> getDryRunRequest() {
        Request<AssociateDhcpOptionsRequest> request = new AssociateDhcpOptionsRequestMarshaller().marshall(this);
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
        if (getDhcpOptionsId() != null) sb.append("DhcpOptionsId: " + getDhcpOptionsId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssociateDhcpOptionsRequest == false) return false;
        AssociateDhcpOptionsRequest other = (AssociateDhcpOptionsRequest)obj;
        
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null) return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
}
    