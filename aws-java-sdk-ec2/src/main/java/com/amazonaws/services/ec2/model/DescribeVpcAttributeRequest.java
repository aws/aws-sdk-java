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
import com.amazonaws.services.ec2.model.transform.DescribeVpcAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpcAttribute(DescribeVpcAttributeRequest) DescribeVpcAttribute operation}.
 * <p>
 * Describes the specified attribute of the specified VPC. You can
 * specify only one attribute at a time.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpcAttribute(DescribeVpcAttributeRequest)
 */
public class DescribeVpcAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeVpcAttributeRequest> {

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * The VPC attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enableDnsSupport, enableDnsHostnames
     */
    private String attribute;

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
    public DescribeVpcAttributeRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The VPC attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enableDnsSupport, enableDnsHostnames
     *
     * @return The VPC attribute.
     *
     * @see VpcAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The VPC attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enableDnsSupport, enableDnsHostnames
     *
     * @param attribute The VPC attribute.
     *
     * @see VpcAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The VPC attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enableDnsSupport, enableDnsHostnames
     *
     * @param attribute The VPC attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VpcAttributeName
     */
    public DescribeVpcAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * The VPC attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enableDnsSupport, enableDnsHostnames
     *
     * @param attribute The VPC attribute.
     *
     * @see VpcAttributeName
     */
    public void setAttribute(VpcAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The VPC attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enableDnsSupport, enableDnsHostnames
     *
     * @param attribute The VPC attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VpcAttributeName
     */
    public DescribeVpcAttributeRequest withAttribute(VpcAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcAttributeRequest> getDryRunRequest() {
        Request<DescribeVpcAttributeRequest> request = new DescribeVpcAttributeRequestMarshaller().marshall(this);
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
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getAttribute() != null) sb.append("Attribute: " + getAttribute() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcAttributeRequest == false) return false;
        DescribeVpcAttributeRequest other = (DescribeVpcAttributeRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        return true;
    }
    
}
    