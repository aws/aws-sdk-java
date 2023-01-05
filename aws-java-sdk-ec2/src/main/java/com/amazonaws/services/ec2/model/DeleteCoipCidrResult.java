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
public class DeleteCoipCidrResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a range of customer-owned IP addresses.
     * </p>
     */
    private CoipCidr coipCidr;

    /**
     * <p>
     * Information about a range of customer-owned IP addresses.
     * </p>
     * 
     * @param coipCidr
     *        Information about a range of customer-owned IP addresses.
     */

    public void setCoipCidr(CoipCidr coipCidr) {
        this.coipCidr = coipCidr;
    }

    /**
     * <p>
     * Information about a range of customer-owned IP addresses.
     * </p>
     * 
     * @return Information about a range of customer-owned IP addresses.
     */

    public CoipCidr getCoipCidr() {
        return this.coipCidr;
    }

    /**
     * <p>
     * Information about a range of customer-owned IP addresses.
     * </p>
     * 
     * @param coipCidr
     *        Information about a range of customer-owned IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCoipCidrResult withCoipCidr(CoipCidr coipCidr) {
        setCoipCidr(coipCidr);
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
        if (getCoipCidr() != null)
            sb.append("CoipCidr: ").append(getCoipCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCoipCidrResult == false)
            return false;
        DeleteCoipCidrResult other = (DeleteCoipCidrResult) obj;
        if (other.getCoipCidr() == null ^ this.getCoipCidr() == null)
            return false;
        if (other.getCoipCidr() != null && other.getCoipCidr().equals(this.getCoipCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoipCidr() == null) ? 0 : getCoipCidr().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCoipCidrResult clone() {
        try {
            return (DeleteCoipCidrResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
