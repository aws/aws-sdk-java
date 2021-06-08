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
 * Describes a prefix list entry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PrefixListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrefixListEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR block.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The CIDR block.
     * </p>
     * 
     * @param cidr
     *        The CIDR block.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR block.
     * </p>
     * 
     * @return The CIDR block.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR block.
     * </p>
     * 
     * @param cidr
     *        The CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixListEntry withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixListEntry withDescription(String description) {
        setDescription(description);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefixListEntry == false)
            return false;
        PrefixListEntry other = (PrefixListEntry) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public PrefixListEntry clone() {
        try {
            return (PrefixListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
