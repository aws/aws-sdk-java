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

/**
 * <p>
 * Describes an IPv4 prefix.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Ipv4PrefixSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ipv4PrefixSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv4 prefix. For information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html"> Assigning prefixes to Amazon EC2
     * network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String ipv4Prefix;

    /**
     * <p>
     * The IPv4 prefix. For information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html"> Assigning prefixes to Amazon EC2
     * network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param ipv4Prefix
     *        The IPv4 prefix. For information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html"> Assigning prefixes to
     *        Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setIpv4Prefix(String ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
    }

    /**
     * <p>
     * The IPv4 prefix. For information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html"> Assigning prefixes to Amazon EC2
     * network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The IPv4 prefix. For information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html"> Assigning prefixes to
     *         Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    /**
     * <p>
     * The IPv4 prefix. For information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html"> Assigning prefixes to Amazon EC2
     * network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param ipv4Prefix
     *        The IPv4 prefix. For information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html"> Assigning prefixes to
     *        Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv4PrefixSpecification withIpv4Prefix(String ipv4Prefix) {
        setIpv4Prefix(ipv4Prefix);
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
        if (getIpv4Prefix() != null)
            sb.append("Ipv4Prefix: ").append(getIpv4Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ipv4PrefixSpecification == false)
            return false;
        Ipv4PrefixSpecification other = (Ipv4PrefixSpecification) obj;
        if (other.getIpv4Prefix() == null ^ this.getIpv4Prefix() == null)
            return false;
        if (other.getIpv4Prefix() != null && other.getIpv4Prefix().equals(this.getIpv4Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv4Prefix() == null) ? 0 : getIpv4Prefix().hashCode());
        return hashCode;
    }

    @Override
    public Ipv4PrefixSpecification clone() {
        try {
            return (Ipv4PrefixSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
