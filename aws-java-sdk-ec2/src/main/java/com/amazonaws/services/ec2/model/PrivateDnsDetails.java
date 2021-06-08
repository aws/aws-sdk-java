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

/**
 * <p>
 * Information about the Private DNS name for interface endpoints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PrivateDnsDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateDnsDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The private DNS name assigned to the VPC endpoint service.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * The private DNS name assigned to the VPC endpoint service.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name assigned to the VPC endpoint service.
     */

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name assigned to the VPC endpoint service.
     * </p>
     * 
     * @return The private DNS name assigned to the VPC endpoint service.
     */

    public String getPrivateDnsName() {
        return this.privateDnsName;
    }

    /**
     * <p>
     * The private DNS name assigned to the VPC endpoint service.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name assigned to the VPC endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateDnsDetails withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
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
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: ").append(getPrivateDnsName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateDnsDetails == false)
            return false;
        PrivateDnsDetails other = (PrivateDnsDetails) obj;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        return hashCode;
    }

    @Override
    public PrivateDnsDetails clone() {
        try {
            return (PrivateDnsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
