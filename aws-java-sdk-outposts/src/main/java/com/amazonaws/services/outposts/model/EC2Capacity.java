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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about EC2 capacity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/EC2Capacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2Capacity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The family of the EC2 capacity.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The maximum size of the EC2 capacity.
     * </p>
     */
    private String maxSize;
    /**
     * <p>
     * The quantity of the EC2 capacity.
     * </p>
     */
    private String quantity;

    /**
     * <p>
     * The family of the EC2 capacity.
     * </p>
     * 
     * @param family
     *        The family of the EC2 capacity.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The family of the EC2 capacity.
     * </p>
     * 
     * @return The family of the EC2 capacity.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The family of the EC2 capacity.
     * </p>
     * 
     * @param family
     *        The family of the EC2 capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2Capacity withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The maximum size of the EC2 capacity.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the EC2 capacity.
     */

    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the EC2 capacity.
     * </p>
     * 
     * @return The maximum size of the EC2 capacity.
     */

    public String getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum size of the EC2 capacity.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the EC2 capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2Capacity withMaxSize(String maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The quantity of the EC2 capacity.
     * </p>
     * 
     * @param quantity
     *        The quantity of the EC2 capacity.
     */

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The quantity of the EC2 capacity.
     * </p>
     * 
     * @return The quantity of the EC2 capacity.
     */

    public String getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The quantity of the EC2 capacity.
     * </p>
     * 
     * @param quantity
     *        The quantity of the EC2 capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2Capacity withQuantity(String quantity) {
        setQuantity(quantity);
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2Capacity == false)
            return false;
        EC2Capacity other = (EC2Capacity) obj;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        return hashCode;
    }

    @Override
    public EC2Capacity clone() {
        try {
            return (EC2Capacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.EC2CapacityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
