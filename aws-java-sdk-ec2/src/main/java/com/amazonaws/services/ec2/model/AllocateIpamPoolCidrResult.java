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
public class AllocateIpamPoolCidrResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the allocation created.
     * </p>
     */
    private IpamPoolAllocation ipamPoolAllocation;

    /**
     * <p>
     * Information about the allocation created.
     * </p>
     * 
     * @param ipamPoolAllocation
     *        Information about the allocation created.
     */

    public void setIpamPoolAllocation(IpamPoolAllocation ipamPoolAllocation) {
        this.ipamPoolAllocation = ipamPoolAllocation;
    }

    /**
     * <p>
     * Information about the allocation created.
     * </p>
     * 
     * @return Information about the allocation created.
     */

    public IpamPoolAllocation getIpamPoolAllocation() {
        return this.ipamPoolAllocation;
    }

    /**
     * <p>
     * Information about the allocation created.
     * </p>
     * 
     * @param ipamPoolAllocation
     *        Information about the allocation created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateIpamPoolCidrResult withIpamPoolAllocation(IpamPoolAllocation ipamPoolAllocation) {
        setIpamPoolAllocation(ipamPoolAllocation);
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
        if (getIpamPoolAllocation() != null)
            sb.append("IpamPoolAllocation: ").append(getIpamPoolAllocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateIpamPoolCidrResult == false)
            return false;
        AllocateIpamPoolCidrResult other = (AllocateIpamPoolCidrResult) obj;
        if (other.getIpamPoolAllocation() == null ^ this.getIpamPoolAllocation() == null)
            return false;
        if (other.getIpamPoolAllocation() != null && other.getIpamPoolAllocation().equals(this.getIpamPoolAllocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamPoolAllocation() == null) ? 0 : getIpamPoolAllocation().hashCode());
        return hashCode;
    }

    @Override
    public AllocateIpamPoolCidrResult clone() {
        try {
            return (AllocateIpamPoolCidrResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
