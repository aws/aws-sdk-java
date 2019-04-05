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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringAuthorizations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcPeeringAuthorizationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Collection of objects that describe all valid VPC peering operations for the current AWS account.
     * </p>
     */
    private java.util.List<VpcPeeringAuthorization> vpcPeeringAuthorizations;

    /**
     * <p>
     * Collection of objects that describe all valid VPC peering operations for the current AWS account.
     * </p>
     * 
     * @return Collection of objects that describe all valid VPC peering operations for the current AWS account.
     */

    public java.util.List<VpcPeeringAuthorization> getVpcPeeringAuthorizations() {
        return vpcPeeringAuthorizations;
    }

    /**
     * <p>
     * Collection of objects that describe all valid VPC peering operations for the current AWS account.
     * </p>
     * 
     * @param vpcPeeringAuthorizations
     *        Collection of objects that describe all valid VPC peering operations for the current AWS account.
     */

    public void setVpcPeeringAuthorizations(java.util.Collection<VpcPeeringAuthorization> vpcPeeringAuthorizations) {
        if (vpcPeeringAuthorizations == null) {
            this.vpcPeeringAuthorizations = null;
            return;
        }

        this.vpcPeeringAuthorizations = new java.util.ArrayList<VpcPeeringAuthorization>(vpcPeeringAuthorizations);
    }

    /**
     * <p>
     * Collection of objects that describe all valid VPC peering operations for the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcPeeringAuthorizations(java.util.Collection)} or
     * {@link #withVpcPeeringAuthorizations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcPeeringAuthorizations
     *        Collection of objects that describe all valid VPC peering operations for the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringAuthorizationsResult withVpcPeeringAuthorizations(VpcPeeringAuthorization... vpcPeeringAuthorizations) {
        if (this.vpcPeeringAuthorizations == null) {
            setVpcPeeringAuthorizations(new java.util.ArrayList<VpcPeeringAuthorization>(vpcPeeringAuthorizations.length));
        }
        for (VpcPeeringAuthorization ele : vpcPeeringAuthorizations) {
            this.vpcPeeringAuthorizations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of objects that describe all valid VPC peering operations for the current AWS account.
     * </p>
     * 
     * @param vpcPeeringAuthorizations
     *        Collection of objects that describe all valid VPC peering operations for the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringAuthorizationsResult withVpcPeeringAuthorizations(java.util.Collection<VpcPeeringAuthorization> vpcPeeringAuthorizations) {
        setVpcPeeringAuthorizations(vpcPeeringAuthorizations);
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
        if (getVpcPeeringAuthorizations() != null)
            sb.append("VpcPeeringAuthorizations: ").append(getVpcPeeringAuthorizations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcPeeringAuthorizationsResult == false)
            return false;
        DescribeVpcPeeringAuthorizationsResult other = (DescribeVpcPeeringAuthorizationsResult) obj;
        if (other.getVpcPeeringAuthorizations() == null ^ this.getVpcPeeringAuthorizations() == null)
            return false;
        if (other.getVpcPeeringAuthorizations() != null && other.getVpcPeeringAuthorizations().equals(this.getVpcPeeringAuthorizations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcPeeringAuthorizations() == null) ? 0 : getVpcPeeringAuthorizations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcPeeringAuthorizationsResult clone() {
        try {
            return (DescribeVpcPeeringAuthorizationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
