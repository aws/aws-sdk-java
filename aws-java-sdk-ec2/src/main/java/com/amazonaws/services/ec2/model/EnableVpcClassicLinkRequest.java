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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.EnableVpcClassicLinkRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#enableVpcClassicLink(EnableVpcClassicLinkRequest) EnableVpcClassicLink operation}.
 * <p>
 * Enables a VPC for ClassicLink. You can then link EC2-Classic instances
 * to your ClassicLink-enabled VPC to allow communication over private IP
 * addresses. You cannot enable your VPC for ClassicLink if any of your
 * VPC's route tables have existing routes for address ranges within the
 * <code>10.0.0.0/8</code> IP address range, excluding local routes for
 * VPCs in the <code>10.0.0.0/16</code> and <code>10.1.0.0/16</code> IP
 * address ranges. For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
 * in the Amazon Elastic Compute Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#enableVpcClassicLink(EnableVpcClassicLinkRequest)
 */
public class EnableVpcClassicLinkRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<EnableVpcClassicLinkRequest> {

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
    public EnableVpcClassicLinkRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<EnableVpcClassicLinkRequest> getDryRunRequest() {
        Request<EnableVpcClassicLinkRequest> request = new EnableVpcClassicLinkRequestMarshaller().marshall(this);
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

        if (obj instanceof EnableVpcClassicLinkRequest == false) return false;
        EnableVpcClassicLinkRequest other = (EnableVpcClassicLinkRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
    @Override
    public EnableVpcClassicLinkRequest clone() {
        
            return (EnableVpcClassicLinkRequest) super.clone();
    }

}
    