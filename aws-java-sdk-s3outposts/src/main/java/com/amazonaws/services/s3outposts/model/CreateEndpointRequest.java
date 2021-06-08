/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/CreateEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     */
    private String outpostId;
    /**
     * <p>
     * The ID of the subnet in the selected VPC.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The ID of the security group to use with the endpoint.
     * </p>
     */
    private String securityGroupId;

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID of the AWS Outpost.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     * 
     * @return The ID of the AWS Outpost.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID of the AWS Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withOutpostId(String outpostId) {
        setOutpostId(outpostId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in the selected VPC.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in the selected VPC.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in the selected VPC.
     * </p>
     * 
     * @return The ID of the subnet in the selected VPC.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in the selected VPC.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in the selected VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The ID of the security group to use with the endpoint.
     * </p>
     * 
     * @param securityGroupId
     *        The ID of the security group to use with the endpoint.
     */

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    /**
     * <p>
     * The ID of the security group to use with the endpoint.
     * </p>
     * 
     * @return The ID of the security group to use with the endpoint.
     */

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * <p>
     * The ID of the security group to use with the endpoint.
     * </p>
     * 
     * @param securityGroupId
     *        The ID of the security group to use with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withSecurityGroupId(String securityGroupId) {
        setSecurityGroupId(securityGroupId);
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
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getSecurityGroupId() != null)
            sb.append("SecurityGroupId: ").append(getSecurityGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointRequest == false)
            return false;
        CreateEndpointRequest other = (CreateEndpointRequest) obj;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null)
            return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndpointRequest clone() {
        return (CreateEndpointRequest) super.clone();
    }

}
