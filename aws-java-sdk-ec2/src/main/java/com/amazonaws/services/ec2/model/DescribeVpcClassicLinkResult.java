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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcClassicLinkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcClassicLink> vpcs;

    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     * 
     * @return The ClassicLink status of one or more VPCs.
     */

    public java.util.List<VpcClassicLink> getVpcs() {
        if (vpcs == null) {
            vpcs = new com.amazonaws.internal.SdkInternalList<VpcClassicLink>();
        }
        return vpcs;
    }

    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     * 
     * @param vpcs
     *        The ClassicLink status of one or more VPCs.
     */

    public void setVpcs(java.util.Collection<VpcClassicLink> vpcs) {
        if (vpcs == null) {
            this.vpcs = null;
            return;
        }

        this.vpcs = new com.amazonaws.internal.SdkInternalList<VpcClassicLink>(vpcs);
    }

    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcs(java.util.Collection)} or {@link #withVpcs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vpcs
     *        The ClassicLink status of one or more VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcClassicLinkResult withVpcs(VpcClassicLink... vpcs) {
        if (this.vpcs == null) {
            setVpcs(new com.amazonaws.internal.SdkInternalList<VpcClassicLink>(vpcs.length));
        }
        for (VpcClassicLink ele : vpcs) {
            this.vpcs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     * 
     * @param vpcs
     *        The ClassicLink status of one or more VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcClassicLinkResult withVpcs(java.util.Collection<VpcClassicLink> vpcs) {
        setVpcs(vpcs);
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
        if (getVpcs() != null)
            sb.append("Vpcs: ").append(getVpcs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcClassicLinkResult == false)
            return false;
        DescribeVpcClassicLinkResult other = (DescribeVpcClassicLinkResult) obj;
        if (other.getVpcs() == null ^ this.getVpcs() == null)
            return false;
        if (other.getVpcs() != null && other.getVpcs().equals(this.getVpcs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcs() == null) ? 0 : getVpcs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcClassicLinkResult clone() {
        try {
            return (DescribeVpcClassicLinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
