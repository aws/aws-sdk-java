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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The ID of the outpost subnet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/SubnetOutpost" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetOutpost implements Serializable, Cloneable {

    /**
     * <p>
     * The outpost ARN of the subnet.
     * </p>
     */
    private String subnetOutpostArn;

    /**
     * <p>
     * The outpost ARN of the subnet.
     * </p>
     * 
     * @param subnetOutpostArn
     *        The outpost ARN of the subnet.
     */

    public void setSubnetOutpostArn(String subnetOutpostArn) {
        this.subnetOutpostArn = subnetOutpostArn;
    }

    /**
     * <p>
     * The outpost ARN of the subnet.
     * </p>
     * 
     * @return The outpost ARN of the subnet.
     */

    public String getSubnetOutpostArn() {
        return this.subnetOutpostArn;
    }

    /**
     * <p>
     * The outpost ARN of the subnet.
     * </p>
     * 
     * @param subnetOutpostArn
     *        The outpost ARN of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetOutpost withSubnetOutpostArn(String subnetOutpostArn) {
        setSubnetOutpostArn(subnetOutpostArn);
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
        if (getSubnetOutpostArn() != null)
            sb.append("SubnetOutpostArn: ").append(getSubnetOutpostArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubnetOutpost == false)
            return false;
        SubnetOutpost other = (SubnetOutpost) obj;
        if (other.getSubnetOutpostArn() == null ^ this.getSubnetOutpostArn() == null)
            return false;
        if (other.getSubnetOutpostArn() != null && other.getSubnetOutpostArn().equals(this.getSubnetOutpostArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetOutpostArn() == null) ? 0 : getSubnetOutpostArn().hashCode());
        return hashCode;
    }

    @Override
    public SubnetOutpost clone() {
        try {
            return (SubnetOutpost) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
