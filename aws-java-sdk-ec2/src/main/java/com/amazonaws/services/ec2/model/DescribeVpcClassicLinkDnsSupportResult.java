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
import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeVpcClassicLinkDnsSupport.
 * </p>
 */
public class DescribeVpcClassicLinkDnsSupportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClassicLinkDnsSupport> vpcs;
    /**
     * <p>
     * The token to use when requesting the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     * 
     * @return Information about the ClassicLink DNS support status of the VPCs.
     */

    public java.util.List<ClassicLinkDnsSupport> getVpcs() {
        if (vpcs == null) {
            vpcs = new com.amazonaws.internal.SdkInternalList<ClassicLinkDnsSupport>();
        }
        return vpcs;
    }

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     * 
     * @param vpcs
     *        Information about the ClassicLink DNS support status of the VPCs.
     */

    public void setVpcs(java.util.Collection<ClassicLinkDnsSupport> vpcs) {
        if (vpcs == null) {
            this.vpcs = null;
            return;
        }

        this.vpcs = new com.amazonaws.internal.SdkInternalList<ClassicLinkDnsSupport>(vpcs);
    }

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcs(java.util.Collection)} or {@link #withVpcs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vpcs
     *        Information about the ClassicLink DNS support status of the VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcClassicLinkDnsSupportResult withVpcs(ClassicLinkDnsSupport... vpcs) {
        if (this.vpcs == null) {
            setVpcs(new com.amazonaws.internal.SdkInternalList<ClassicLinkDnsSupport>(vpcs.length));
        }
        for (ClassicLinkDnsSupport ele : vpcs) {
            this.vpcs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     * 
     * @param vpcs
     *        Information about the ClassicLink DNS support status of the VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcClassicLinkDnsSupportResult withVpcs(java.util.Collection<ClassicLinkDnsSupport> vpcs) {
        setVpcs(vpcs);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items.
     * </p>
     * 
     * @return The token to use when requesting the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcClassicLinkDnsSupportResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
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
        if (getVpcs() != null)
            sb.append("Vpcs: " + getVpcs() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcClassicLinkDnsSupportResult == false)
            return false;
        DescribeVpcClassicLinkDnsSupportResult other = (DescribeVpcClassicLinkDnsSupportResult) obj;
        if (other.getVpcs() == null ^ this.getVpcs() == null)
            return false;
        if (other.getVpcs() != null && other.getVpcs().equals(this.getVpcs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcs() == null) ? 0 : getVpcs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcClassicLinkDnsSupportResult clone() {
        try {
            return (DescribeVpcClassicLinkDnsSupportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
