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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies how many protections of a given type you can create.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/Limit" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Limit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of protection.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The maximum number of protections that can be created for the specified <code>Type</code>.
     * </p>
     */
    private Long max;

    /**
     * <p>
     * The type of protection.
     * </p>
     * 
     * @param type
     *        The type of protection.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of protection.
     * </p>
     * 
     * @return The type of protection.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of protection.
     * </p>
     * 
     * @param type
     *        The type of protection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limit withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The maximum number of protections that can be created for the specified <code>Type</code>.
     * </p>
     * 
     * @param max
     *        The maximum number of protections that can be created for the specified <code>Type</code>.
     */

    public void setMax(Long max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum number of protections that can be created for the specified <code>Type</code>.
     * </p>
     * 
     * @return The maximum number of protections that can be created for the specified <code>Type</code>.
     */

    public Long getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum number of protections that can be created for the specified <code>Type</code>.
     * </p>
     * 
     * @param max
     *        The maximum number of protections that can be created for the specified <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limit withMax(Long max) {
        setMax(max);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Limit == false)
            return false;
        Limit other = (Limit) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public Limit clone() {
        try {
            return (Limit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.LimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
