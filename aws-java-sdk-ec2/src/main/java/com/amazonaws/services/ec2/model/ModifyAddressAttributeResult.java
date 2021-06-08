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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyAddressAttributeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the Elastic IP address.
     * </p>
     */
    private AddressAttribute address;

    /**
     * <p>
     * Information about the Elastic IP address.
     * </p>
     * 
     * @param address
     *        Information about the Elastic IP address.
     */

    public void setAddress(AddressAttribute address) {
        this.address = address;
    }

    /**
     * <p>
     * Information about the Elastic IP address.
     * </p>
     * 
     * @return Information about the Elastic IP address.
     */

    public AddressAttribute getAddress() {
        return this.address;
    }

    /**
     * <p>
     * Information about the Elastic IP address.
     * </p>
     * 
     * @param address
     *        Information about the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyAddressAttributeResult withAddress(AddressAttribute address) {
        setAddress(address);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyAddressAttributeResult == false)
            return false;
        ModifyAddressAttributeResult other = (ModifyAddressAttributeResult) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return hashCode;
    }

    @Override
    public ModifyAddressAttributeResult clone() {
        try {
            return (ModifyAddressAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
