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

/**
 * <p>
 * Tags for a public IP address discovered by IPAM.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamPublicAddressTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamPublicAddressTags implements Serializable, Cloneable {

    /**
     * <p>
     * Tags for an Elastic IP address.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamPublicAddressTag> eipTags;

    /**
     * <p>
     * Tags for an Elastic IP address.
     * </p>
     * 
     * @return Tags for an Elastic IP address.
     */

    public java.util.List<IpamPublicAddressTag> getEipTags() {
        if (eipTags == null) {
            eipTags = new com.amazonaws.internal.SdkInternalList<IpamPublicAddressTag>();
        }
        return eipTags;
    }

    /**
     * <p>
     * Tags for an Elastic IP address.
     * </p>
     * 
     * @param eipTags
     *        Tags for an Elastic IP address.
     */

    public void setEipTags(java.util.Collection<IpamPublicAddressTag> eipTags) {
        if (eipTags == null) {
            this.eipTags = null;
            return;
        }

        this.eipTags = new com.amazonaws.internal.SdkInternalList<IpamPublicAddressTag>(eipTags);
    }

    /**
     * <p>
     * Tags for an Elastic IP address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEipTags(java.util.Collection)} or {@link #withEipTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param eipTags
     *        Tags for an Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPublicAddressTags withEipTags(IpamPublicAddressTag... eipTags) {
        if (this.eipTags == null) {
            setEipTags(new com.amazonaws.internal.SdkInternalList<IpamPublicAddressTag>(eipTags.length));
        }
        for (IpamPublicAddressTag ele : eipTags) {
            this.eipTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags for an Elastic IP address.
     * </p>
     * 
     * @param eipTags
     *        Tags for an Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPublicAddressTags withEipTags(java.util.Collection<IpamPublicAddressTag> eipTags) {
        setEipTags(eipTags);
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
        if (getEipTags() != null)
            sb.append("EipTags: ").append(getEipTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamPublicAddressTags == false)
            return false;
        IpamPublicAddressTags other = (IpamPublicAddressTags) obj;
        if (other.getEipTags() == null ^ this.getEipTags() == null)
            return false;
        if (other.getEipTags() != null && other.getEipTags().equals(this.getEipTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEipTags() == null) ? 0 : getEipTags().hashCode());
        return hashCode;
    }

    @Override
    public IpamPublicAddressTags clone() {
        try {
            return (IpamPublicAddressTags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
