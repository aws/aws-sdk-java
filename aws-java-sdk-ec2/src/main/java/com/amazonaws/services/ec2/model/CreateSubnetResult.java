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
public class CreateSubnetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the subnet.
     * </p>
     */
    private Subnet subnet;

    /**
     * <p>
     * Information about the subnet.
     * </p>
     * 
     * @param subnet
     *        Information about the subnet.
     */

    public void setSubnet(Subnet subnet) {
        this.subnet = subnet;
    }

    /**
     * <p>
     * Information about the subnet.
     * </p>
     * 
     * @return Information about the subnet.
     */

    public Subnet getSubnet() {
        return this.subnet;
    }

    /**
     * <p>
     * Information about the subnet.
     * </p>
     * 
     * @param subnet
     *        Information about the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetResult withSubnet(Subnet subnet) {
        setSubnet(subnet);
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
        if (getSubnet() != null)
            sb.append("Subnet: ").append(getSubnet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubnetResult == false)
            return false;
        CreateSubnetResult other = (CreateSubnetResult) obj;
        if (other.getSubnet() == null ^ this.getSubnet() == null)
            return false;
        if (other.getSubnet() != null && other.getSubnet().equals(this.getSubnet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnet() == null) ? 0 : getSubnet().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubnetResult clone() {
        try {
            return (CreateSubnetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
