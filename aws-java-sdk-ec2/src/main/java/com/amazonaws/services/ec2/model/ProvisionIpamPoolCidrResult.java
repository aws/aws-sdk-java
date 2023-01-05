/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class ProvisionIpamPoolCidrResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the provisioned CIDR.
     * </p>
     */
    private IpamPoolCidr ipamPoolCidr;

    /**
     * <p>
     * Information about the provisioned CIDR.
     * </p>
     * 
     * @param ipamPoolCidr
     *        Information about the provisioned CIDR.
     */

    public void setIpamPoolCidr(IpamPoolCidr ipamPoolCidr) {
        this.ipamPoolCidr = ipamPoolCidr;
    }

    /**
     * <p>
     * Information about the provisioned CIDR.
     * </p>
     * 
     * @return Information about the provisioned CIDR.
     */

    public IpamPoolCidr getIpamPoolCidr() {
        return this.ipamPoolCidr;
    }

    /**
     * <p>
     * Information about the provisioned CIDR.
     * </p>
     * 
     * @param ipamPoolCidr
     *        Information about the provisioned CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrResult withIpamPoolCidr(IpamPoolCidr ipamPoolCidr) {
        setIpamPoolCidr(ipamPoolCidr);
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
        if (getIpamPoolCidr() != null)
            sb.append("IpamPoolCidr: ").append(getIpamPoolCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionIpamPoolCidrResult == false)
            return false;
        ProvisionIpamPoolCidrResult other = (ProvisionIpamPoolCidrResult) obj;
        if (other.getIpamPoolCidr() == null ^ this.getIpamPoolCidr() == null)
            return false;
        if (other.getIpamPoolCidr() != null && other.getIpamPoolCidr().equals(this.getIpamPoolCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamPoolCidr() == null) ? 0 : getIpamPoolCidr().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionIpamPoolCidrResult clone() {
        try {
            return (ProvisionIpamPoolCidrResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
