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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
     * </p>
     */
    private Address address;

    /**
     * <p>
     * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
     * </p>
     * 
     * @param address
     *        The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
     */

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <p>
     * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
     * </p>
     * 
     * @return The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
     */

    public Address getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
     * </p>
     * 
     * @param address
     *        The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressResult withAddress(Address address) {
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

        if (obj instanceof DescribeAddressResult == false)
            return false;
        DescribeAddressResult other = (DescribeAddressResult) obj;
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
    public DescribeAddressResult clone() {
        try {
            return (DescribeAddressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
