/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecurityGroupsForVpcResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The security group that can be used by interfaces in the VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityGroupForVpc> securityGroupForVpcs;

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @return The token to include in another request to get the next page of items. This value is <code>null</code>
     *         when there are no more items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityGroupsForVpcResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The security group that can be used by interfaces in the VPC.
     * </p>
     * 
     * @return The security group that can be used by interfaces in the VPC.
     */

    public java.util.List<SecurityGroupForVpc> getSecurityGroupForVpcs() {
        if (securityGroupForVpcs == null) {
            securityGroupForVpcs = new com.amazonaws.internal.SdkInternalList<SecurityGroupForVpc>();
        }
        return securityGroupForVpcs;
    }

    /**
     * <p>
     * The security group that can be used by interfaces in the VPC.
     * </p>
     * 
     * @param securityGroupForVpcs
     *        The security group that can be used by interfaces in the VPC.
     */

    public void setSecurityGroupForVpcs(java.util.Collection<SecurityGroupForVpc> securityGroupForVpcs) {
        if (securityGroupForVpcs == null) {
            this.securityGroupForVpcs = null;
            return;
        }

        this.securityGroupForVpcs = new com.amazonaws.internal.SdkInternalList<SecurityGroupForVpc>(securityGroupForVpcs);
    }

    /**
     * <p>
     * The security group that can be used by interfaces in the VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupForVpcs(java.util.Collection)} or {@link #withSecurityGroupForVpcs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param securityGroupForVpcs
     *        The security group that can be used by interfaces in the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityGroupsForVpcResult withSecurityGroupForVpcs(SecurityGroupForVpc... securityGroupForVpcs) {
        if (this.securityGroupForVpcs == null) {
            setSecurityGroupForVpcs(new com.amazonaws.internal.SdkInternalList<SecurityGroupForVpc>(securityGroupForVpcs.length));
        }
        for (SecurityGroupForVpc ele : securityGroupForVpcs) {
            this.securityGroupForVpcs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group that can be used by interfaces in the VPC.
     * </p>
     * 
     * @param securityGroupForVpcs
     *        The security group that can be used by interfaces in the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityGroupsForVpcResult withSecurityGroupForVpcs(java.util.Collection<SecurityGroupForVpc> securityGroupForVpcs) {
        setSecurityGroupForVpcs(securityGroupForVpcs);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSecurityGroupForVpcs() != null)
            sb.append("SecurityGroupForVpcs: ").append(getSecurityGroupForVpcs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSecurityGroupsForVpcResult == false)
            return false;
        GetSecurityGroupsForVpcResult other = (GetSecurityGroupsForVpcResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSecurityGroupForVpcs() == null ^ this.getSecurityGroupForVpcs() == null)
            return false;
        if (other.getSecurityGroupForVpcs() != null && other.getSecurityGroupForVpcs().equals(this.getSecurityGroupForVpcs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupForVpcs() == null) ? 0 : getSecurityGroupForVpcs().hashCode());
        return hashCode;
    }

    @Override
    public GetSecurityGroupsForVpcResult clone() {
        try {
            return (GetSecurityGroupsForVpcResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
