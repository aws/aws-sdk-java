/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#disableVpcClassicLinkDnsSupport(DisableVpcClassicLinkDnsSupportRequest) DisableVpcClassicLinkDnsSupport operation}.
 * <p>
 * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames
 * resolve to public IP addresses when addressed between a linked
 * EC2-Classic instance and instances in the VPC to which it's linked.
 * For more information about ClassicLink, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
 * in the Amazon Elastic Compute Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#disableVpcClassicLinkDnsSupport(DisableVpcClassicLinkDnsSupportRequest)
 */
public class DisableVpcClassicLinkDnsSupportRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the VPC.
     */
    private String vpcId;

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
    public DisableVpcClassicLinkDnsSupportRequest withVpcId(String vpcId) {
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

        if (obj instanceof DisableVpcClassicLinkDnsSupportRequest == false) return false;
        DisableVpcClassicLinkDnsSupportRequest other = (DisableVpcClassicLinkDnsSupportRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
    @Override
    public DisableVpcClassicLinkDnsSupportRequest clone() {
        
            return (DisableVpcClassicLinkDnsSupportRequest) super.clone();
    }

}
    